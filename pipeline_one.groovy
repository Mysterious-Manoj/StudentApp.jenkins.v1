pipeline {
    agent any
      
      stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/Mysterious-Manoj/studentapp.ui.git'
                echo 'here we pulling the repo'
            }
        }
       
    }
}