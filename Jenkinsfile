pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'M2_HOME') {
                    sh 'mvn clean compile'
                }
            }
        }

    }
}