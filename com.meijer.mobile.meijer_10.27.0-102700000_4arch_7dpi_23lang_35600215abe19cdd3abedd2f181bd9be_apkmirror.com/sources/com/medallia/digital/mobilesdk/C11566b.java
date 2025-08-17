package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11566b extends j3 {

    /* renamed from: b, reason: collision with root package name */
    private String f91625b;

    /* renamed from: c, reason: collision with root package name */
    private long f91626c;

    /* renamed from: d, reason: collision with root package name */
    private long f91627d;

    /* renamed from: e, reason: collision with root package name */
    private long f91628e;

    protected C11566b(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(k3.c(str));
            if (jSONObject.has("getConfigUrl") && !jSONObject.isNull("getConfigUrl")) {
                this.f91625b = jSONObject.getString("getConfigUrl");
            }
            if (jSONObject.has("createTime") && !jSONObject.isNull("createTime")) {
                this.f91627d = jSONObject.getLong("createTime");
            }
            if (jSONObject.has("ttl") && !jSONObject.isNull("ttl")) {
                this.f91628e = jSONObject.getLong("ttl");
            }
            if (!jSONObject.has("propertyId") || jSONObject.isNull("propertyId")) {
                return;
            }
            this.f91626c = jSONObject.getLong("propertyId");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(long j10) {
        this.f91626c = j10;
    }

    protected long b() {
        return this.f91627d;
    }

    protected String c() {
        return this.f91625b;
    }

    protected long d() {
        return this.f91626c;
    }

    protected long e() {
        return this.f91628e;
    }

    protected C11566b(String str, String str2, long j10, long j11, long j12) {
        super(str);
        this.f91625b = str2;
        this.f91626c = j10;
        this.f91627d = j11;
        this.f91628e = j12;
    }
}
