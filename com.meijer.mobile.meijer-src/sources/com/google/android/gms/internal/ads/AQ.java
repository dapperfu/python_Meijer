package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class AQ extends AbstractC10154yQ {

    /* renamed from: g, reason: collision with root package name */
    private final Context f65964g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f65965h;

    public final com.google.common.util.concurrent.q c(C9978wo c9978wo) {
        synchronized (this.f81058b) {
            try {
                if (this.f81059c) {
                    return this.f81057a;
                }
                this.f81059c = true;
                this.f81061e = c9978wo;
                this.f81062f.checkAvailabilityAndConnect();
                this.f81057a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81259a.a();
                    }
                }, C7033Kq.f69020g);
                AbstractC10154yQ.b(this.f65964g, this.f81057a, this.f65965h);
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
                        this.f81062f.c().A7(this.f81061e, ((Boolean) Oc.A.c().a(C8784lf.f76921Nc)).booleanValue() ? new BinderC10047xQ(this.f81057a, this.f81061e) : new BinderC9940wQ(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f81057a.c(new zzdyh(1));
                    } catch (Throwable th2) {
                        Nc.v.s().x(th2, "RemoteSignalsClientTask.onConnected");
                        this.f81057a.c(new zzdyh(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    AQ(Context context, Executor executor) {
        this.f65964g = context;
        this.f65965h = executor;
        this.f81062f = new C7533Zn(context, Nc.v.x().b(), this, this);
    }
}
