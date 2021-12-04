pipeline { 
    agent any 
    
    stages {
        stage('Build') { 
            steps { 
                sh 'mvn clean compile' 
            }
        }
       /* stage('Test'){
            steps {
                sh 'mvn test'
                junit 'reports/**/*.xml' 
            }
        }
        stage('Deploy') {
            steps {
                sh 'cp build/*.jar /home/khalil/Desktop/'
            }
        }
    }*/


