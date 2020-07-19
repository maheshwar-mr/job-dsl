pipelineJob('example') {
def repo = 'https://github.com/maheshwar807/sample_job.git'
    triggers{
     scm('H/1 * * * *')
    }
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
