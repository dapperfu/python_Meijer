package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9526tl {

    /* renamed from: b, reason: collision with root package name */
    private static C9526tl f78619b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f78620a = new AtomicBoolean(false);

    public static C9526tl a() {
        if (f78619b == null) {
            f78619b = new C9526tl();
        }
        return f78619b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f78620a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sl
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                C8659lf.a(context2);
                if (((Boolean) Mc.A.c().a(C8659lf.f75971G0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) Mc.A.c().a(C8659lf.f76544v0)).booleanValue());
                if (((Boolean) Mc.A.c().a(C8659lf.f75915C0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC8903nu) Qc.s.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new Qc.r() { // from class: com.google.android.gms.internal.ads.rl
                        @Override // Qc.r
                        public final Object zza(Object obj) {
                            return AbstractBinderC8796mu.B9((IBinder) obj);
                        }
                    })).D8(com.google.android.gms.dynamic.d.F2(context2), new BinderC9206ql(Nd.a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzr | NullPointerException e10) {
                    Qc.p.i("#007 Could not call remote method.", e10);
                }
            }
        });
        thread.start();
        return thread;
    }

    C9526tl() {
    }
}
