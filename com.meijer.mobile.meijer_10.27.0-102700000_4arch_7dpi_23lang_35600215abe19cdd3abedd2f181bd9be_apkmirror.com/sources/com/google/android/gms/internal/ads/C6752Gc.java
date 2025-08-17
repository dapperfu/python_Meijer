package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6521c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6752Gc {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f67250a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f67251b = new RunnableC6616Cc(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f67252c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private C6854Jc f67253d;

    /* renamed from: e, reason: collision with root package name */
    private Context f67254e;

    /* renamed from: f, reason: collision with root package name */
    private C6955Mc f67255f;

    protected final synchronized C6854Jc d(AbstractC6521c.a aVar, AbstractC6521c.b bVar) {
        return new C6854Jc(this.f67254e, Lc.v.x().b(), aVar, bVar);
    }

    static /* bridge */ /* synthetic */ void h(C6752Gc c6752Gc) {
        synchronized (c6752Gc.f67252c) {
            try {
                C6854Jc c6854Jc = c6752Gc.f67253d;
                if (c6854Jc == null) {
                    return;
                }
                if (c6854Jc.isConnected() || c6752Gc.f67253d.isConnecting()) {
                    c6752Gc.f67253d.disconnect();
                }
                c6752Gc.f67253d = null;
                c6752Gc.f67255f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f67252c) {
            try {
                if (this.f67254e != null && this.f67253d == null) {
                    C6854Jc c6854JcD = d(new C6684Ec(this), new C6718Fc(this));
                    this.f67253d = c6854JcD;
                    c6854JcD.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long a(C6888Kc c6888Kc) {
        synchronized (this.f67252c) {
            try {
                if (this.f67255f == null) {
                    return -2L;
                }
                if (this.f67253d.c()) {
                    try {
                        return this.f67255f.N3(c6888Kc);
                    } catch (RemoteException e10) {
                        Qc.p.e("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C6786Hc b(C6888Kc c6888Kc) {
        synchronized (this.f67252c) {
            if (this.f67255f == null) {
                return new C6786Hc();
            }
            try {
                if (this.f67253d.c()) {
                    return this.f67255f.f6(c6888Kc);
                }
                return this.f67255f.W5(c6888Kc);
            } catch (RemoteException e10) {
                Qc.p.e("Unable to call into cache service.", e10);
                return new C6786Hc();
            }
        }
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f67252c) {
            try {
                if (this.f67254e != null) {
                    return;
                }
                this.f67254e = context.getApplicationContext();
                if (((Boolean) Mc.A.c().a(C8659lf.f76422m4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76408l4)).booleanValue()) {
                        Lc.v.e().c(new C6650Dc(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76436n4)).booleanValue()) {
            synchronized (this.f67252c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.f67250a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f67250a = C6908Kq.f68177d.schedule(this.f67251b, ((Long) Mc.A.c().a(C8659lf.f76450o4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
