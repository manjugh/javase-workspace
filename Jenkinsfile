pipeline {
	agent any
	
	stages {
		stage("build") {
			steps {
				echo "Buiding system"
				sh "mvn clean install"
			}
			
		}
	}
}