package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class E9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F9 f67199a;

    E9(F9 f92) {
        this.f67199a = f92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f67199a.f67590b != null) {
            return;
        }
        synchronized (F9.f67586c) {
            if (this.f67199a.f67590b != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) C8784lf.f76799F2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    F9.f67587d = C7928dd0.b(this.f67199a.f67589a.f77916a, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.f67199a.f67590b = Boolean.valueOf(z10);
            F9.f67586c.open();
        }
    }
}
