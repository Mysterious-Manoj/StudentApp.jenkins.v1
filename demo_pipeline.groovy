pipeline {
    agent any 
    
     stages {
        stage('Pull') {
            steps {
                echo "here we are pulling the code"
            }
        }
        stage('Build') {
            steps {
                echo  "here we are building the code"
            }
        }
        stage('Test') {
            steps {
                echo "here we are testing the code"
            }
        }
        stage('Deploy') {
            steps {
                echo "here we are deploying the code"
            }
        }
     }   
}