package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class WH implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final UH f71051a;

    public WH(UH uh2) {
        this.f71051a = uh2;
    }

    public final JSONObject b() {
        return a(this.f71051a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        return a(this.f71051a);
    }

    public static JSONObject a(UH uh2) {
        JSONObject jSONObjectB = uh2.b();
        C9233qy0.b(jSONObjectB);
        return jSONObjectB;
    }
}
