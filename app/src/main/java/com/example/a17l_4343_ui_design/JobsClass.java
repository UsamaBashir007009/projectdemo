package com.example.a17l_4343_ui_design;

public class JobsClass {
    private int jobId;
    private String jobName;
    private int jobPhoto;

    public JobsClass(int jobId, String jobName, int jobPhoto) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobPhoto = jobPhoto;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobPhoto(int jobPhoto) {
        this.jobPhoto = jobPhoto;
    }

    public int getJobId() {
        return jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public int getJobPhoto() {
        return jobPhoto;
    }
}
