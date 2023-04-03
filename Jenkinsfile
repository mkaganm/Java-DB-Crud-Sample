pipeline {
    agent any

    stages {
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
        stage('Run') {
            steps {
                sh 'java src/main/java/org/example/Main'
            }
        }
    }
}
