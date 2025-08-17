package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6812Hw implements InterfaceC9976xw {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f67519a;

    C6812Hw(ZO zo2) {
        this.f67519a = zo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9976xw
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76315e9)).booleanValue()) {
                this.f67519a.o(jSONObject);
            }
        }
    }
}
