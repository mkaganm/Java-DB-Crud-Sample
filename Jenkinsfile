pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac *.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}
