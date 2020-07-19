pipelineJob('example') {
    definition {
        cpsScm {
            scm {
                git(‘git:github.com:maheshwar807/sample_job.git’)
            }
        }
    }
}
