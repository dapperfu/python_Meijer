package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D9 f65719a;

    C9(D9 d92) {
        this.f65719a = d92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f65719a.f66174n) {
            if (this.f65719a.f66175o) {
                return;
            }
            this.f65719a.f66175o = true;
            try {
                D9.i(this.f65719a);
            } catch (Exception e10) {
                this.f65719a.f66166f.c(2023, -1L, e10);
            }
            synchronized (this.f65719a.f66174n) {
                this.f65719a.f66175o = false;
            }
        }
    }
}
