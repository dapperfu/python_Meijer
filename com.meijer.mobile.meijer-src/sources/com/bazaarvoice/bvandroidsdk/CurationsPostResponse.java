package com.bazaarvoice.bvandroidsdk;

import java.util.Map;

/* loaded from: classes4.dex */
public class CurationsPostResponse {
    protected String detail;

    /* renamed from: id, reason: collision with root package name */
    protected Integer f63846id;
    protected Map<String, String> options;
    protected String remote_url;
    protected Object status;

    public String getDetail() {
        return this.detail;
    }

    public Integer getId() {
        return this.f63846id;
    }

    public Map<String, String> getOptions() {
        return this.options;
    }

    public String getRemoteUrl() {
        return this.remote_url;
    }

    public Integer getStatus() {
        return (Integer) this.status;
    }
}
