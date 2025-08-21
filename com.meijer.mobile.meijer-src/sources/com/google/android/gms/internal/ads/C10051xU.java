package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10051xU implements InterfaceC8660kT {

    /* renamed from: a, reason: collision with root package name */
    private final C8653kM f80634a;

    public C10051xU(C8653kM c8653kM) {
        this.f80634a = c8653kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8660kT
    public final C8767lT a(String str, JSONObject jSONObject) throws zzfcq {
        return new C8767lT(this.f80634a.c(str, jSONObject), new BinderC8128fU(), str);
    }
}
