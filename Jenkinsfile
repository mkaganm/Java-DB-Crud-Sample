pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Main.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}
