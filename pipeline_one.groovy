pipeline {
    agent any
      
      stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/Mysterious-Manoj/studentapp.ui.git'
                echo 'here we pulling the repo'
            }
        }
         stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'here we are building the code'
            }
        }
       stage('Test') {
            steps {
               sh 'mvn sonar:sonar \
                   -Dsonar.projectKey=student-ui \
                   -Dsonar.host.url=http://18.169.133.138:9000 \
                   -Dsonar.login=8262e22bbd953f784fddc566e798f921416c68ee'
                echo 'here we are testing the code'
            }
        }
    }
}