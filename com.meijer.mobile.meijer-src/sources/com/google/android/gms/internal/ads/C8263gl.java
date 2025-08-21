package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8263gl implements InterfaceC8152fj {

    /* renamed from: a, reason: collision with root package name */
    private final C6993Jk f75214a;

    /* renamed from: b, reason: collision with root package name */
    private final C7270Rq f75215b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8370hl f75216c;

    public C8263gl(C8370hl c8370hl, C6993Jk c6993Jk, C7270Rq c7270Rq) {
        this.f75216c = c8370hl;
        this.f75214a = c6993Jk;
        this.f75215b = c7270Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8152fj
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f75215b.b(this.f75216c.f75613a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.f75215b.c(e10);
            }
        } finally {
            this.f75214a.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8152fj
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f75215b.c(new zzbnv());
            } else {
                this.f75215b.c(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.f75214a.h();
            throw th2;
        }
        this.f75214a.h();
    }
}
