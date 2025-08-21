package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6646c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6877Gc {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f68090a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f68091b = new RunnableC6741Cc(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f68092c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private C6979Jc f68093d;

    /* renamed from: e, reason: collision with root package name */
    private Context f68094e;

    /* renamed from: f, reason: collision with root package name */
    private C7080Mc f68095f;

    protected final synchronized C6979Jc d(AbstractC6646c.a aVar, AbstractC6646c.b bVar) {
        return new C6979Jc(this.f68094e, Nc.v.x().b(), aVar, bVar);
    }

    static /* bridge */ /* synthetic */ void h(C6877Gc c6877Gc) {
        synchronized (c6877Gc.f68092c) {
            try {
                C6979Jc c6979Jc = c6877Gc.f68093d;
                if (c6979Jc == null) {
                    return;
                }
                if (c6979Jc.isConnected() || c6877Gc.f68093d.isConnecting()) {
                    c6877Gc.f68093d.disconnect();
                }
                c6877Gc.f68093d = null;
                c6877Gc.f68095f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f68092c) {
            try {
                if (this.f68094e != null && this.f68093d == null) {
                    C6979Jc c6979JcD = d(new C6809Ec(this), new C6843Fc(this));
                    this.f68093d = c6979JcD;
                    c6979JcD.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long a(C7013Kc c7013Kc) {
        synchronized (this.f68092c) {
            try {
                if (this.f68095f == null) {
                    return -2L;
                }
                if (this.f68093d.c()) {
                    try {
                        return this.f68095f.Z3(c7013Kc);
                    } catch (RemoteException e10) {
                        Sc.p.e("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C6911Hc b(C7013Kc c7013Kc) {
        synchronized (this.f68092c) {
            if (this.f68095f == null) {
                return new C6911Hc();
            }
            try {
                if (this.f68093d.c()) {
                    return this.f68095f.t6(c7013Kc);
                }
                return this.f68095f.m6(c7013Kc);
            } catch (RemoteException e10) {
                Sc.p.e("Unable to call into cache service.", e10);
                return new C6911Hc();
            }
        }
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f68092c) {
            try {
                if (this.f68094e != null) {
                    return;
                }
                this.f68094e = context.getApplicationContext();
                if (((Boolean) Oc.A.c().a(C8784lf.f77262m4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77248l4)).booleanValue()) {
                        Nc.v.e().c(new C6775Dc(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77276n4)).booleanValue()) {
            synchronized (this.f68092c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.f68090a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f68090a = C7033Kq.f69017d.schedule(this.f68091b, ((Long) Oc.A.c().a(C8784lf.f77290o4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
