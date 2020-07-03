pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Jworld ...'
                sh 'javac Jworld.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Jworld ...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Jworld ....'
            }
        }
    }
}
