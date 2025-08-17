package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import gd.C14243b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9601uQ extends AbstractC10029yQ {

    /* renamed from: g, reason: collision with root package name */
    private final Context f78841g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f78842h;

    public final com.google.common.util.concurrent.q c(C9853wo c9853wo) {
        synchronized (this.f80218b) {
            try {
                if (this.f80219c) {
                    return this.f80217a;
                }
                this.f80219c = true;
                this.f80221e = c9853wo;
                this.f80222f.checkAvailabilityAndConnect();
                this.f80217a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.tQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78569a.a();
                    }
                }, C6908Kq.f68180g);
                AbstractC10029yQ.b(this.f78841g, this.f80217a, this.f78842h);
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
                        this.f80222f.c().N6(this.f80221e, ((Boolean) Mc.A.c().a(C8659lf.f76081Nc)).booleanValue() ? new BinderC9922xQ(this.f80217a, this.f80221e) : new BinderC9815wQ(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f80217a.c(new zzdyh(1));
                    } catch (Throwable th2) {
                        Lc.v.s().x(th2, "RemoteAdRequestClientTask.onConnected");
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

    public C9601uQ(Context context, Executor executor) {
        this.f78841g = context;
        this.f78842h = executor;
        this.f80222f = new C7408Zn(context, Lc.v.x().b(), this, this);
    }
}
