pipeline {
    agent any
      
      stages {
        stage('Pull') {
            step {
                https://github.com/Mysterious-Manoj/ansible-b1.git
                echo 'here we pulling the repo'
            }
        }
       
    }
}