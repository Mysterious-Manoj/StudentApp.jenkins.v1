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
                echo 'here we are building the repo'
            }
        }
       
    }
}