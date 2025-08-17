package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class E9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F9 f66359a;

    E9(F9 f92) {
        this.f66359a = f92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f66359a.f66750b != null) {
            return;
        }
        synchronized (F9.f66746c) {
            if (this.f66359a.f66750b != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) C8659lf.f75959F2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    F9.f66747d = C7803dd0.b(this.f66359a.f66749a.f77076a, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.f66359a.f66750b = Boolean.valueOf(z10);
            F9.f66746c.open();
        }
    }
}
