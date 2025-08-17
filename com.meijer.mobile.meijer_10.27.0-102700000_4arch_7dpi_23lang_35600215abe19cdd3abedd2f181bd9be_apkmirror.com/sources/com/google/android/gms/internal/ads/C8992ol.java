package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8992ol implements InterfaceC8027fj {

    /* renamed from: a, reason: collision with root package name */
    private final C7145Rq f77418a;

    public C8992ol(C9099pl c9099pl, C7145Rq c7145Rq) {
        this.f77418a = c7145Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8027fj
    public final void a(JSONObject jSONObject) {
        try {
            this.f77418a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f77418a.c(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8027fj
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f77418a.c(new zzbnv());
            } else {
                this.f77418a.c(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
