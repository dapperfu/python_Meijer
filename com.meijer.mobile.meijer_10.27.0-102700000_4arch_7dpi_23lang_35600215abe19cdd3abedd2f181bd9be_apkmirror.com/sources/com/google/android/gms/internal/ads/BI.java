package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BI extends CI {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f65513b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f65514c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f65515d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f65516e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f65517f;

    /* renamed from: g, reason: collision with root package name */
    private final String f65518g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f65519h;

    @Override // com.google.android.gms.internal.ads.CI
    public final String b() {
        return this.f65518g;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean d() {
        return this.f65516e;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean e() {
        return this.f65514c;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean f() {
        return this.f65515d;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean g() {
        return this.f65517f;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final C9891x60 a() {
        JSONObject jSONObject = this.f65519h;
        return jSONObject != null ? new C9891x60(jSONObject) : this.f65755a.f72016V;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final JSONObject c() {
        JSONObject jSONObject = this.f65513b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f65755a.f72071z);
        } catch (JSONException unused) {
            return null;
        }
    }

    public BI(Z50 z50, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        super(z50);
        this.f65513b = Pc.U.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f65514c = Pc.U.l(false, jSONObject, "allow_pub_owned_ad_view");
        this.f65515d = Pc.U.l(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f65516e = Pc.U.l(false, jSONObject, "enable_omid");
        this.f65518g = Pc.U.b("", jSONObject, "watermark_overlay_png_base64");
        this.f65517f = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) Mc.A.c().a(C8659lf.f76381j5)).booleanValue()) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObjectOptJSONObject = null;
        }
        this.f65519h = jSONObjectOptJSONObject;
    }
}
