package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC10507r0;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11263x {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f85994d;

    /* renamed from: a, reason: collision with root package name */
    private final C3 f85995a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f85996b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f85997c;

    public abstract void a();

    public final boolean c() {
        return this.f85997c != 0;
    }

    final /* synthetic */ void e(long j10) {
        this.f85997c = 0L;
    }

    private final Handler f() {
        Handler handler;
        if (f85994d != null) {
            return f85994d;
        }
        synchronized (AbstractC11263x.class) {
            try {
                if (f85994d == null) {
                    f85994d = new HandlerC10507r0(this.f85995a.zzaY().getMainLooper());
                }
                handler = f85994d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    final void d() {
        this.f85997c = 0L;
        f().removeCallbacks(this.f85996b);
    }

    AbstractC11263x(C3 c32) {
        com.google.android.gms.common.internal.r.l(c32);
        this.f85995a = c32;
        this.f85996b = new RunnableC11256w(this, c32);
    }

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            C3 c32 = this.f85995a;
            this.f85997c = c32.zzaZ().a();
            if (!f().postDelayed(this.f85996b, j10)) {
                c32.a().m().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }
}
