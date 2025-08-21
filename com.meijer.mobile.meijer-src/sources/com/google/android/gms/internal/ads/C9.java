package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D9 f66559a;

    C9(D9 d92) {
        this.f66559a = d92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f66559a.f67014n) {
            if (this.f66559a.f67015o) {
                return;
            }
            this.f66559a.f67015o = true;
            try {
                D9.i(this.f66559a);
            } catch (Exception e10) {
                this.f66559a.f67006f.c(2023, -1L, e10);
            }
            synchronized (this.f66559a.f67014n) {
                this.f66559a.f67015o = false;
            }
        }
    }
}
