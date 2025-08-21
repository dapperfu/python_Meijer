package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC10632r0;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11388x {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f86834d;

    /* renamed from: a, reason: collision with root package name */
    private final C3 f86835a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f86836b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f86837c;

    public abstract void a();

    public final boolean c() {
        return this.f86837c != 0;
    }

    final /* synthetic */ void e(long j10) {
        this.f86837c = 0L;
    }

    private final Handler f() {
        Handler handler;
        if (f86834d != null) {
            return f86834d;
        }
        synchronized (AbstractC11388x.class) {
            try {
                if (f86834d == null) {
                    f86834d = new HandlerC10632r0(this.f86835a.zzaY().getMainLooper());
                }
                handler = f86834d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    final void d() {
        this.f86837c = 0L;
        f().removeCallbacks(this.f86836b);
    }

    AbstractC11388x(C3 c32) {
        com.google.android.gms.common.internal.r.l(c32);
        this.f86835a = c32;
        this.f86836b = new RunnableC11381w(this, c32);
    }

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            C3 c32 = this.f86835a;
            this.f86837c = c32.zzaZ().a();
            if (!f().postDelayed(this.f86836b, j10)) {
                c32.a().m().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }
}
