pipeline {
    agent any
      stage {
        stage('Pull') {
            step {
                 https://github.com/Mysterious-Manoj/maven-web-application.git
                echo 'here we pulling the repo'
            }
        }
        stage('build') {
            step {
                echo 'here we build the pipe'
            }
        }
    }
}