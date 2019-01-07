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
				
				withMaven(maven : 'maven_3_6_0'){
                    sh 'mvn clean compile'
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
