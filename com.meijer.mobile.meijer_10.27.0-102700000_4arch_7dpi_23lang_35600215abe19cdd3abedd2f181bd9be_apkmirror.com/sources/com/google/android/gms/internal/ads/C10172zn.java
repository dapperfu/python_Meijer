package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10172zn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80471a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80472b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80473c;

    public C10172zn(boolean z10, String str, boolean z11) {
        this.f80471a = z10;
        this.f80472b = str;
        this.f80473c = z11;
    }

    public static C10172zn a(JSONObject jSONObject) {
        return new C10172zn(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
