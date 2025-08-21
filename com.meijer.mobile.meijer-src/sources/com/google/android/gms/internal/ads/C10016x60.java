package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.x60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10016x60 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f80520a;

    public C10016x60(JSONObject jSONObject) {
        this.f80520a = jSONObject;
    }

    public final boolean b() {
        return this.f80520a.optBoolean((String) Oc.A.c().a(C8784lf.f77193h5), true);
    }

    public final int c() {
        int iOptInt = this.f80520a.optInt("media_type", -1);
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
