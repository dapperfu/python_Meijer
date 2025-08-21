package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10297zn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81313c;

    public C10297zn(boolean z10, String str, boolean z11) {
        this.f81311a = z10;
        this.f81312b = str;
        this.f81313c = z11;
    }

    public static C10297zn a(JSONObject jSONObject) {
        return new C10297zn(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
