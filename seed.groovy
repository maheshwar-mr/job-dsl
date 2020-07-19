pipelineJob('example') {
def repo = 'https://github.com/maheshwar807/sample_job.git'
    definition {
        cpsScm {
            scm {
                git{
		  remote{ url(repo) }
		  branches('master')
		}
            }
        }
    }
}
