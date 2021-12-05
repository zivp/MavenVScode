pipeline {
    agent any
    tools{ 
      maven "M2_HOME"
    }

    stages {
        stage ('Compile Stage') {

            steps {
                    bat 'mvn clean compile'
            }
        }
    }
}