pipeline {
  
  agent any
  
  stages {
    
    stage("Build") {
    
      steps {
        
        echo "Build"
        sh "javac Main.java"
      
      }
      
    }
    
    stage("Run") {
      
      steps {
        
        echo "Run"
        sh "java Main"
      
      }
  
  }

}
