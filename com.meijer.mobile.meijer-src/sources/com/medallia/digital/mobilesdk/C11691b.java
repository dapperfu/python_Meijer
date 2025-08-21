package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11691b extends j3 {

    /* renamed from: b, reason: collision with root package name */
    private String f92464b;

    /* renamed from: c, reason: collision with root package name */
    private long f92465c;

    /* renamed from: d, reason: collision with root package name */
    private long f92466d;

    /* renamed from: e, reason: collision with root package name */
    private long f92467e;

    protected C11691b(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(k3.c(str));
            if (jSONObject.has("getConfigUrl") && !jSONObject.isNull("getConfigUrl")) {
                this.f92464b = jSONObject.getString("getConfigUrl");
            }
            if (jSONObject.has("createTime") && !jSONObject.isNull("createTime")) {
                this.f92466d = jSONObject.getLong("createTime");
            }
            if (jSONObject.has("ttl") && !jSONObject.isNull("ttl")) {
                this.f92467e = jSONObject.getLong("ttl");
            }
            if (!jSONObject.has("propertyId") || jSONObject.isNull("propertyId")) {
                return;
            }
            this.f92465c = jSONObject.getLong("propertyId");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(long j10) {
        this.f92465c = j10;
    }

    protected long b() {
        return this.f92466d;
    }

    protected String c() {
        return this.f92464b;
    }

    protected long d() {
        return this.f92465c;
    }

    protected long e() {
        return this.f92467e;
    }

    protected C11691b(String str, String str2, long j10, long j11, long j12) {
        super(str);
        this.f92464b = str2;
        this.f92465c = j10;
        this.f92466d = j11;
        this.f92467e = j12;
    }
}
