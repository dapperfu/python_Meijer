package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9117ol implements InterfaceC8152fj {

    /* renamed from: a, reason: collision with root package name */
    private final C7270Rq f78258a;

    public C9117ol(C9224pl c9224pl, C7270Rq c7270Rq) {
        this.f78258a = c7270Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8152fj
    public final void a(JSONObject jSONObject) {
        try {
            this.f78258a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f78258a.c(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8152fj
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f78258a.c(new zzbnv());
            } else {
                this.f78258a.c(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
