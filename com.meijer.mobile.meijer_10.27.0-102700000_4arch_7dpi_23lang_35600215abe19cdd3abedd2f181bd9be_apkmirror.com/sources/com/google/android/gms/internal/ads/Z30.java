package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Z30 implements InterfaceC9608uX {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC7431a40 f71982a;

    Z30(BinderC7431a40 binderC7431a40) {
        this.f71982a = binderC7431a40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final void zza() {
        synchronized (this.f71982a) {
            this.f71982a.f72348k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9608uX
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C8164gy c8164gy = (C8164gy) obj;
        synchronized (this.f71982a) {
            try {
                C8164gy c8164gy2 = this.f71982a.f72348k;
                if (c8164gy2 != null) {
                    c8164gy2.a();
                }
                BinderC7431a40 binderC7431a40 = this.f71982a;
                binderC7431a40.f72348k = c8164gy;
                c8164gy.j(binderC7431a40);
                BinderC7431a40 binderC7431a402 = this.f71982a;
                binderC7431a402.f72343f.s(new BinderC8271hy(c8164gy, binderC7431a402, binderC7431a402.f72343f, binderC7431a402.f72345h));
                c8164gy.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
