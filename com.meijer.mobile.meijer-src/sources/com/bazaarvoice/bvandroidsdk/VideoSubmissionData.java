package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class VideoSubmissionData {
    private final String videoCaption;
    private final String videoUrl;

    public String getVideoCaption() {
        return this.videoCaption;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public VideoSubmissionData(String str, String str2) {
        this.videoUrl = str;
        this.videoCaption = str2;
    }
}
