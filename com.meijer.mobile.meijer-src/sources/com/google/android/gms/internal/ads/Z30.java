package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Z30 implements InterfaceC9733uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC7556a40 f72822a;

    Z30(BinderC7556a40 binderC7556a40) {
        this.f72822a = binderC7556a40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final void zza() {
        synchronized (this.f72822a) {
            this.f72822a.f73188k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9733uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C8289gy c8289gy = (C8289gy) obj;
        synchronized (this.f72822a) {
            try {
                C8289gy c8289gy2 = this.f72822a.f73188k;
                if (c8289gy2 != null) {
                    c8289gy2.a();
                }
                BinderC7556a40 binderC7556a40 = this.f72822a;
                binderC7556a40.f73188k = c8289gy;
                c8289gy.j(binderC7556a40);
                BinderC7556a40 binderC7556a402 = this.f72822a;
                binderC7556a402.f73183f.s(new BinderC8396hy(c8289gy, binderC7556a402, binderC7556a402.f73183f, binderC7556a402.f73185h));
                c8289gy.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
