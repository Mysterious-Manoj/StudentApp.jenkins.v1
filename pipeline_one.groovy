pipeline {
    agent any
      
      stages {
        stage('Pull') {
            step {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/Mysterious-Manoj/maven-web-application.git'
                echo 'here we pulling the repo'
            }
        }
       
    }
}