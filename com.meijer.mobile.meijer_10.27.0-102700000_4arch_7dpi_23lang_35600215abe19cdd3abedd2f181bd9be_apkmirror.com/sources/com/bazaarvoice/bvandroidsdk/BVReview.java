package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class BVReview {
    private String authorName;
    private String text;
    private String title;

    public String getAuthor() {
        return this.authorName;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "BVReview{title='" + this.title + "', text='" + this.text + "', authorName='" + this.authorName + "'}";
    }
}
