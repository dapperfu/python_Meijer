package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class TO {

    /* renamed from: a, reason: collision with root package name */
    private final String f70383a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70384b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70385c;

    /* renamed from: d, reason: collision with root package name */
    private final int f70386d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70387e;

    /* renamed from: f, reason: collision with root package name */
    private final int f70388f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f70389g;

    public TO(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.f70383a = str;
        this.f70384b = str2;
        this.f70385c = str3;
        this.f70386d = i10;
        this.f70387e = str4;
        this.f70388f = i11;
        this.f70389g = z10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f70383a);
        jSONObject.put("version", this.f70385c);
        if (((Boolean) Mc.A.c().a(C8659lf.f76399k9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f70384b);
        }
        jSONObject.put("status", this.f70386d);
        jSONObject.put("description", this.f70387e);
        jSONObject.put("initializationLatencyMillis", this.f70388f);
        if (((Boolean) Mc.A.c().a(C8659lf.f76413l9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f70389g);
        }
        return jSONObject;
    }
}
