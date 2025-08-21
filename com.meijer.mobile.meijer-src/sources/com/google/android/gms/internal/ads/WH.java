package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class WH implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final UH f71891a;

    public WH(UH uh2) {
        this.f71891a = uh2;
    }

    public final JSONObject b() {
        return a(this.f71891a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        return a(this.f71891a);
    }

    public static JSONObject a(UH uh2) {
        JSONObject jSONObjectB = uh2.b();
        C9358qy0.b(jSONObjectB);
        return jSONObjectB;
    }
}
