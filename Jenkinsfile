pipeline {
    agent any

    stages {
        stage('Clone from GitHub') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sdarshandeshpande-395/employee-attendance.git'
            }
        }

        stage('Build using Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                sh '''
                pkill -f employee-attendance || true
                nohup java -jar target/employee-attendance-1.0.jar > attendance.log 2>&1 &
                '''
            }
        }
    }
}
