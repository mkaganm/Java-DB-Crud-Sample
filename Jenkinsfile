pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac *
            }
        }
        stage('Run') {
            steps {
                sh 'java src/main/java/org/example/Main'
            }
        }
    }
}
