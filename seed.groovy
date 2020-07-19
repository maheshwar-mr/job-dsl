pipelineJob('example') {
    definition {
        cpsScm {
            scm {
                git(‘https://github.com/maheshwar807/sample_job.git’)
            }
        }
    }
}
