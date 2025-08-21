package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9651tl {

    /* renamed from: b, reason: collision with root package name */
    private static C9651tl f79459b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f79460a = new AtomicBoolean(false);

    public static C9651tl a() {
        if (f79459b == null) {
            f79459b = new C9651tl();
        }
        return f79459b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.f79460a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sl
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                C8784lf.a(context2);
                if (((Boolean) Oc.A.c().a(C8784lf.f76811G0)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) Oc.A.c().a(C8784lf.f77384v0)).booleanValue());
                if (((Boolean) Oc.A.c().a(C8784lf.f76755C0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC9028nu) Sc.s.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new Sc.r() { // from class: com.google.android.gms.internal.ads.rl
                        @Override // Sc.r
                        public final Object zza(Object obj) {
                            return AbstractBinderC8921mu.B9((IBinder) obj);
                        }
                    })).x8(com.google.android.gms.dynamic.d.I2(context2), new BinderC9331ql(Pd.a.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzr | NullPointerException e10) {
                    Sc.p.i("#007 Could not call remote method.", e10);
                }
            }
        });
        thread.start();
        return thread;
    }

    C9651tl() {
    }
}
