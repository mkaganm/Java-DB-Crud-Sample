pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Package'){
            steps {
                sh 'mvn package'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Mvn Test'){
            steps {
                sh 'mvn test'
            }
        }
        stage('Execute') {
            steps {
                sh 'java -jar target/Java-Crud-Sample-1.0-SNAPSHOT.jar'
            }
        }
    }
}
