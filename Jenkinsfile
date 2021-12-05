pipeline {
    agent any
    tools{ maven "M2_HOME" }
    stages {
        stage ('Build Stage') {

            steps {
                    bat 'mvn clean compile'
            }
        }
        stage ('Test Stage') {

            steps {
                    bat 'mvn test'
            }
        }
    }
}