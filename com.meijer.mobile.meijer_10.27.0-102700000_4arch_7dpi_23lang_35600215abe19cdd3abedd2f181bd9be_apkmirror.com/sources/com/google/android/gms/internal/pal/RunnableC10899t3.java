package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC10899t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10915u3 f84044a;

    RunnableC10899t3(C10915u3 c10915u3) {
        this.f84044a = c10915u3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f84044a.f84071b != null) {
            return;
        }
        synchronized (C10915u3.f84067c) {
            if (this.f84044a.f84071b != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) C10854q5.f83567c2.b()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    C10915u3.f84068d = U5.b(this.f84044a.f84070a.f82943a, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.f84044a.f84071b = Boolean.valueOf(z10);
            C10915u3.f84067c.open();
        }
    }
}
