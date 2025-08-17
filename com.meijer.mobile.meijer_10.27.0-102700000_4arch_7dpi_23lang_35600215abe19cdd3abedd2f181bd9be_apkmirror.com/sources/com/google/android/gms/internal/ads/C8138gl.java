package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8138gl implements InterfaceC8027fj {

    /* renamed from: a, reason: collision with root package name */
    private final C6868Jk f74374a;

    /* renamed from: b, reason: collision with root package name */
    private final C7145Rq f74375b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8245hl f74376c;

    public C8138gl(C8245hl c8245hl, C6868Jk c6868Jk, C7145Rq c7145Rq) {
        this.f74376c = c8245hl;
        this.f74374a = c6868Jk;
        this.f74375b = c7145Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8027fj
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f74375b.b(this.f74376c.f74773a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.f74375b.c(e10);
            }
        } finally {
            this.f74374a.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8027fj
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f74375b.c(new zzbnv());
            } else {
                this.f74375b.c(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.f74374a.h();
            throw th2;
        }
        this.f74374a.h();
    }
}
