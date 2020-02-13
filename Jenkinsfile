pipeline {
	agent any
	
	stages {
		stage("build") {
			steps {
				echo "Buiding system"
				sh "cd java-explore"
				sh "mvn clean install"
			}
			
		}
	}
}