package com.bazaarvoice.bvandroidsdk;

import java.io.File;

/* loaded from: classes4.dex */
public class VideoUpload {
    static final String kCONTENT_TYPE = "contenttype";
    private final String caption;
    private final ContentType contentType;
    private final File videoFile;

    public enum ContentType {
        REVIEW("review"),
        QUESTION("question"),
        ANSWER("answer"),
        COMMENT("review_comment");

        private final String key;

        String getKey() {
            return this.key;
        }

        ContentType(String str) {
            this.key = str;
        }
    }

    public String getCaption() {
        return this.caption;
    }

    ContentType getContentType() {
        return this.contentType;
    }

    String getEndPoint() {
        return "uploadvideo.json";
    }

    File getVideoFile() {
        return this.videoFile;
    }

    public VideoUpload(File file, String str, ContentType contentType) {
        this.videoFile = file;
        this.caption = str;
        this.contentType = contentType;
    }
}
