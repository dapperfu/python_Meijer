package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8015fd {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC9292rb f74130a;

    /* renamed from: b, reason: collision with root package name */
    boolean f74131b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f74132c;

    public C8015fd() {
        this.f74132c = Qc.c.f29937b;
    }

    public C8015fd(final Context context) {
        ExecutorService executorService = Qc.c.f29937b;
        this.f74132c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ad
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76199W4)).booleanValue();
                C8015fd c8015fd = this.f72457a;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        c8015fd.f74130a = (InterfaceC9292rb) Qc.s.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new Qc.r() { // from class: com.google.android.gms.internal.ads.bd
                            @Override // Qc.r
                            public final Object zza(Object obj) {
                                return AbstractBinderC9186qb.B9((IBinder) obj);
                            }
                        });
                        c8015fd.f74130a.zze(com.google.android.gms.dynamic.d.F2(context2), "GMA_SDK");
                        c8015fd.f74131b = true;
                    } catch (RemoteException | zzr | NullPointerException unused) {
                        Qc.p.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
