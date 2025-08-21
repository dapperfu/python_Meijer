package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11024t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11040u3 f84884a;

    RunnableC11024t3(C11040u3 c11040u3) {
        this.f84884a = c11040u3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f84884a.f84911b != null) {
            return;
        }
        synchronized (C11040u3.f84907c) {
            if (this.f84884a.f84911b != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) C10979q5.f84407c2.b()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    C11040u3.f84908d = U5.b(this.f84884a.f84910a.f83783a, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.f84884a.f84911b = Boolean.valueOf(z10);
            C11040u3.f84907c.open();
        }
    }
}
