pipeline
{
	agent any
	stages
	{
		stage('build')
		{
			steps
			{
				git 'https://github.com/prasenjitkovair/JenkinsDemo.git'
				
				def mvn_version = 'maven_3_5_4'
				withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
				  sh "mvn -f KovairTraining/pom.xml compile"
				}
				
				
			}
		}
		
		stage('test')
		{
			steps
			{
				echo 'testing..'
			}
		}
	}
	
}
