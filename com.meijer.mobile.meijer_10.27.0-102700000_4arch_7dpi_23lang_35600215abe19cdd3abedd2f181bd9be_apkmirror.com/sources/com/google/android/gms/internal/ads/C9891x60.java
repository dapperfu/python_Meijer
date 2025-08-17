package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.x60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9891x60 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f79680a;

    public C9891x60(JSONObject jSONObject) {
        this.f79680a = jSONObject;
    }

    public final boolean b() {
        return this.f79680a.optBoolean((String) Mc.A.c().a(C8659lf.f76353h5), true);
    }

    public final int c() {
        int iOptInt = this.f79680a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    public final String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }
}
