package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class CurationsPhoto {
    protected String display_url;

    /* renamed from: id, reason: collision with root package name */
    protected Integer f63006id;
    protected String image_service_url;
    protected String local_url;
    protected String origin;
    protected String permalink;
    protected String remote_url;
    protected String role;
    protected String token;
    protected String url;

    public String getDisplayUrl() {
        return this.display_url;
    }

    public Integer getId() {
        return this.f63006id;
    }

    public String getImageServiceUrl() {
        return this.image_service_url;
    }

    public String getLocalUrl() {
        return this.local_url;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getPermalink() {
        return this.permalink;
    }

    public String getRemote_url() {
        return this.remote_url;
    }

    public String getRole() {
        return this.role;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public CurationsPhoto(String str) {
        this.remote_url = str;
    }
}
