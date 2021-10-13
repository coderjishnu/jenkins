pipeline {
  agent any
  stages {
    //MAVEN is name given in global tool configuration
    //install plugins: pipeline and pipeline maven integration
    stage('Compile Stage') {
      steps {
        withMaven(maven: 'MAVEN') {
          bat 'mvn clean compile'
        }
      }
    }
    stage('Testing Stage') {
      steps {
        withMaven(maven: 'MAVEN') {
          bat 'mvn test'
        }
      }
    }
    stage('Install Stage') {
      steps {
        withMaven(maven: 'MAVEN') {
          bat 'mvn install'
        }
      }
    }
  }
}
