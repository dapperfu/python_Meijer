package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class CurationsMedia {
    protected int height;
    protected String mediaType;
    protected int width;

    public int getHeight() {
        return this.height;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public int getWidth() {
        return this.width;
    }

    public CurationsMedia(String str, int i10, int i11) {
        this.mediaType = str;
        this.width = i10;
        this.height = i11;
    }
}
