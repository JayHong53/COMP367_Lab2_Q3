pipeline {
  agent any
  tools {
    maven 'MAVEN3'
  }
  options {
    skipDefaultCheckout()
  }
  stages {
    stage('Checkout') {
      steps {
        git branch: '*/**', clean: true, url: 'https://github.com/JayHong53/COMP367_Lab2_Q3.git'
      }
    }
    stage('Build with Maven') {
      steps {
        sh 'mvn compile'
      }
    }
  }
}
