node { 
    	def mvnHome
	stage('Prepare'){
		git 'git@github.com:khalilchenni/testTechnique.git'
		mvnHome = tool 'maven'
}
	stage('Build') { 
	    if (isUnix()) { 
		sh "'${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package" 
	    }else {
		bat(/"${mvnHome)\bin\mvn" -Dmaven.test.failure.ignore clean package/}
		}
	}
	stage('Unit Test'){
		junit '**/target/surefire-reports/TEST-*.xml'
		archive 'target/*.jar'
	}
	stage('Integration Test'){
		if (isUnix()){
		sh"'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean verify" 
		}else {
		bat(/"${mvnHome)\bin\mvn" -Dmaven.test.failure.ignore clean verify/}
		}
	}
	stage('Deploy'){
		sh 'curl -u jenkins:jenkins -T target/**.war "https://localhost:8080/manager/text/deploy?path=/testTechnique&update=true"'
	}
}


