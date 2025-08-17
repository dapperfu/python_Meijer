package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9926xU implements InterfaceC8535kT {

    /* renamed from: a, reason: collision with root package name */
    private final C8528kM f79794a;

    public C9926xU(C8528kM c8528kM) {
        this.f79794a = c8528kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8535kT
    public final C8642lT a(String str, JSONObject jSONObject) throws zzfcq {
        return new C8642lT(this.f79794a.c(str, jSONObject), new BinderC8003fU(), str);
    }
}
