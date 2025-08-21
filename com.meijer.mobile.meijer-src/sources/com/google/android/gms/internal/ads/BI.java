package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BI extends CI {

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f66353b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f66354c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f66355d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f66356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f66357f;

    /* renamed from: g, reason: collision with root package name */
    private final String f66358g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f66359h;

    @Override // com.google.android.gms.internal.ads.CI
    public final String b() {
        return this.f66358g;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean d() {
        return this.f66356e;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean e() {
        return this.f66354c;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean f() {
        return this.f66355d;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final boolean g() {
        return this.f66357f;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final C10016x60 a() {
        JSONObject jSONObject = this.f66359h;
        return jSONObject != null ? new C10016x60(jSONObject) : this.f66595a.f72856V;
    }

    @Override // com.google.android.gms.internal.ads.CI
    public final JSONObject c() {
        JSONObject jSONObject = this.f66353b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f66595a.f72911z);
        } catch (JSONException unused) {
            return null;
        }
    }

    public BI(Z50 z50, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        super(z50);
        this.f66353b = Rc.U.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f66354c = Rc.U.l(false, jSONObject, "allow_pub_owned_ad_view");
        this.f66355d = Rc.U.l(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f66356e = Rc.U.l(false, jSONObject, "enable_omid");
        this.f66358g = Rc.U.b("", jSONObject, "watermark_overlay_png_base64");
        this.f66357f = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) Oc.A.c().a(C8784lf.f77221j5)).booleanValue()) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObjectOptJSONObject = null;
        }
        this.f66359h = jSONObjectOptJSONObject;
    }
}
