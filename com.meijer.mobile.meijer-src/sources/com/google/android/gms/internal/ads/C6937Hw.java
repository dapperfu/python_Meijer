package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6937Hw implements InterfaceC10101xw {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f68359a;

    C6937Hw(ZO zo2) {
        this.f68359a = zo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10101xw
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77155e9)).booleanValue()) {
                this.f68359a.o(jSONObject);
            }
        }
    }
}
