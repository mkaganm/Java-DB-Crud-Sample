pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac src/main/java/org/example/Main.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}
