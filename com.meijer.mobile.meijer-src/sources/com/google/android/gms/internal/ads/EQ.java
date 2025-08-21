package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import id.C14719b;

/* loaded from: classes6.dex */
public final class EQ extends AbstractC10154yQ {

    /* renamed from: g, reason: collision with root package name */
    private String f67299g;

    /* renamed from: h, reason: collision with root package name */
    private int f67300h = 1;

    public final com.google.common.util.concurrent.q c(C9978wo c9978wo) {
        synchronized (this.f81058b) {
            try {
                int i10 = this.f67300h;
                if (i10 != 1 && i10 != 2) {
                    return Mj0.g(new zzdyh(2));
                }
                if (this.f81059c) {
                    return this.f81057a;
                }
                this.f67300h = 2;
                this.f81059c = true;
                this.f81061e = c9978wo;
                this.f81062f.checkAvailabilityAndConnect();
                this.f81057a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.CQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66621a.a();
                    }
                }, C7033Kq.f69020g);
                return this.f81057a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.common.util.concurrent.q d(String str) {
        synchronized (this.f81058b) {
            try {
                int i10 = this.f67300h;
                if (i10 != 1 && i10 != 3) {
                    return Mj0.g(new zzdyh(2));
                }
                if (this.f81059c) {
                    return this.f81057a;
                }
                this.f67300h = 3;
                this.f81059c = true;
                this.f67299g = str;
                this.f81062f.checkAvailabilityAndConnect();
                this.f81057a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.DQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f67079a.a();
                    }
                }, C7033Kq.f69020g);
                return this.f81057a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f81058b) {
            try {
                if (!this.f81060d) {
                    this.f81060d = true;
                    try {
                        int i10 = this.f67300h;
                        if (i10 == 2) {
                            this.f81062f.c().O5(this.f81061e, ((Boolean) Oc.A.c().a(C8784lf.f76921Nc)).booleanValue() ? new BinderC10047xQ(this.f81057a, this.f81061e) : new BinderC9940wQ(this));
                        } else if (i10 == 3) {
                            this.f81062f.c().B3(this.f67299g, ((Boolean) Oc.A.c().a(C8784lf.f76921Nc)).booleanValue() ? new BinderC10047xQ(this.f81057a, this.f81061e) : new BinderC9940wQ(this));
                        } else {
                            this.f81057a.c(new zzdyh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f81057a.c(new zzdyh(1));
                    } catch (Throwable th2) {
                        Nc.v.s().x(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.f81057a.c(new zzdyh(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10154yQ, com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) {
        Sc.p.b("Cannot connect to remote service, fallback to local instance.");
        this.f81057a.c(new zzdyh(1));
    }

    EQ(Context context) {
        this.f81062f = new C7533Zn(context, Nc.v.x().b(), this, this);
    }
}
