pipeline {
  agent any
  stages {
    stage('Build with Maven') {
      steps {
        sh 'mvn compile'
      }
    }
  }
  tools {
    maven 'Maven 3.6.3'
  }
  options {
    skipDefaultCheckout()
    scm {
      git {
        remote {
          name('origin')
          url('https://github.com/JayHong53/COMP367_Lab2_Q3.git')
          refspec('+refs/heads/feature/*:refs/remotes/origin/feature/*')
          Ï
        }
        branches('*/**')
        extensions {
          cleanAfterCheckout(true)
        }
      }
    }
  }
}
