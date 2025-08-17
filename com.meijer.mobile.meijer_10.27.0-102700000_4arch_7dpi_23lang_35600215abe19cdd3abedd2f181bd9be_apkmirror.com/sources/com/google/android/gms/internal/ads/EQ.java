package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import gd.C14243b;

/* loaded from: classes6.dex */
public final class EQ extends AbstractC10029yQ {

    /* renamed from: g, reason: collision with root package name */
    private String f66459g;

    /* renamed from: h, reason: collision with root package name */
    private int f66460h = 1;

    public final com.google.common.util.concurrent.q c(C9853wo c9853wo) {
        synchronized (this.f80218b) {
            try {
                int i10 = this.f66460h;
                if (i10 != 1 && i10 != 2) {
                    return Mj0.g(new zzdyh(2));
                }
                if (this.f80219c) {
                    return this.f80217a;
                }
                this.f66460h = 2;
                this.f80219c = true;
                this.f80221e = c9853wo;
                this.f80222f.checkAvailabilityAndConnect();
                this.f80217a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.CQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65781a.a();
                    }
                }, C6908Kq.f68180g);
                return this.f80217a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.common.util.concurrent.q d(String str) {
        synchronized (this.f80218b) {
            try {
                int i10 = this.f66460h;
                if (i10 != 1 && i10 != 3) {
                    return Mj0.g(new zzdyh(2));
                }
                if (this.f80219c) {
                    return this.f80217a;
                }
                this.f66460h = 3;
                this.f80219c = true;
                this.f66459g = str;
                this.f80222f.checkAvailabilityAndConnect();
                this.f80217a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.DQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66239a.a();
                    }
                }, C6908Kq.f68180g);
                return this.f80217a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f80218b) {
            try {
                if (!this.f80220d) {
                    this.f80220d = true;
                    try {
                        int i10 = this.f66460h;
                        if (i10 == 2) {
                            this.f80222f.c().E5(this.f80221e, ((Boolean) Mc.A.c().a(C8659lf.f76081Nc)).booleanValue() ? new BinderC9922xQ(this.f80217a, this.f80221e) : new BinderC9815wQ(this));
                        } else if (i10 == 3) {
                            this.f80222f.c().r3(this.f66459g, ((Boolean) Mc.A.c().a(C8659lf.f76081Nc)).booleanValue() ? new BinderC9922xQ(this.f80217a, this.f80221e) : new BinderC9815wQ(this));
                        } else {
                            this.f80217a.c(new zzdyh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f80217a.c(new zzdyh(1));
                    } catch (Throwable th2) {
                        Lc.v.s().x(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.f80217a.c(new zzdyh(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10029yQ, com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
        Qc.p.b("Cannot connect to remote service, fallback to local instance.");
        this.f80217a.c(new zzdyh(1));
    }

    EQ(Context context) {
        this.f80222f = new C7408Zn(context, Lc.v.x().b(), this, this);
    }
}
