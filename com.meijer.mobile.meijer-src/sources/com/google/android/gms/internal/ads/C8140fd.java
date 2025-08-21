package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8140fd {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC9417rb f74970a;

    /* renamed from: b, reason: collision with root package name */
    boolean f74971b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f74972c;

    public C8140fd() {
        this.f74972c = Sc.c.f34487b;
    }

    public C8140fd(final Context context) {
        ExecutorService executorService = Sc.c.f34487b;
        this.f74972c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ad
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77039W4)).booleanValue();
                C8140fd c8140fd = this.f73297a;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        c8140fd.f74970a = (InterfaceC9417rb) Sc.s.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new Sc.r() { // from class: com.google.android.gms.internal.ads.bd
                            @Override // Sc.r
                            public final Object zza(Object obj) {
                                return AbstractBinderC9311qb.B9((IBinder) obj);
                            }
                        });
                        c8140fd.f74970a.zze(com.google.android.gms.dynamic.d.I2(context2), "GMA_SDK");
                        c8140fd.f74971b = true;
                    } catch (RemoteException | zzr | NullPointerException unused) {
                        Sc.p.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
