package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class TO {

    /* renamed from: a, reason: collision with root package name */
    private final String f71223a;

    /* renamed from: b, reason: collision with root package name */
    private final String f71224b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71225c;

    /* renamed from: d, reason: collision with root package name */
    private final int f71226d;

    /* renamed from: e, reason: collision with root package name */
    private final String f71227e;

    /* renamed from: f, reason: collision with root package name */
    private final int f71228f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f71229g;

    public TO(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.f71223a = str;
        this.f71224b = str2;
        this.f71225c = str3;
        this.f71226d = i10;
        this.f71227e = str4;
        this.f71228f = i11;
        this.f71229g = z10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f71223a);
        jSONObject.put("version", this.f71225c);
        if (((Boolean) Oc.A.c().a(C8784lf.f77239k9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f71224b);
        }
        jSONObject.put("status", this.f71226d);
        jSONObject.put("description", this.f71227e);
        jSONObject.put("initializationLatencyMillis", this.f71228f);
        if (((Boolean) Oc.A.c().a(C8784lf.f77253l9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f71229g);
        }
        return jSONObject;
    }
}
