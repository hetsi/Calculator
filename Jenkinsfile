pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
<<<<<<< HEAD
=======
    options {
        skipStagesAfterUnstable()
    }
>>>>>>> d9de83076745f156c6ce9abce90ea8f0a75ca053
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
<<<<<<< HEAD
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
=======
>>>>>>> d9de83076745f156c6ce9abce90ea8f0a75ca053
    }
}
