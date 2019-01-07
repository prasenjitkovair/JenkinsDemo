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
				
				bat 'mvn compile'
				
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
