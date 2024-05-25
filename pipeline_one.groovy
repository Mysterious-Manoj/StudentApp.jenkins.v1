pipeline {
    agent any
      stage {
        stage('Pull') {
            step {
                 git branch: 'main', changelog: false, credentialsId: 'classy-manoj', poll: false, url: 'https://github.com/Mysterious-Manoj/jenkins.git'
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