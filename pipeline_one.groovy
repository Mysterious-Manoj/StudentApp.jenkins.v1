pipeline {
    agent any
      
      stage {
        stage('Pull') {
            step {
                https://github.com/Mysterious-Manoj/ansible-b1.git
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