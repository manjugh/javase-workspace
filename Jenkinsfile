pipeline {
	agent any
	
	stages {
		stage("build") {
			steps {
				echo "Buiding system"
				sh "cd javase-workspace"
				sh "mvn clean install"
			}
			
		}
	}
}