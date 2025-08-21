package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class CurationsLink {
    protected String display_url;
    protected String domain;
    protected String favicon;
    protected String short_url;
    protected String url;

    public String getDisplayUrl() {
        return this.display_url;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getFavicon() {
        return this.favicon;
    }

    public String getShortUrl() {
        return this.short_url;
    }

    public String getUrl() {
        return this.url;
    }

    public CurationsLink(String str) {
        this.url = str;
    }
}
