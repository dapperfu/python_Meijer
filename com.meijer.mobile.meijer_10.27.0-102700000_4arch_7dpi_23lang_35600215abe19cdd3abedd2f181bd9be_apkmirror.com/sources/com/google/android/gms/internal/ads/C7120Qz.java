package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Qz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7120Qz {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f69701a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f69702b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f69703c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f69704d = true;

    public C7120Qz(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.q qVar) {
        this.f69701a = executor;
        this.f69702b = scheduledExecutorService;
        this.f69703c = qVar;
    }

    final /* synthetic */ void d() {
        this.f69704d = false;
    }

    public final boolean f() {
        return this.f69704d;
    }

    static /* bridge */ /* synthetic */ void b(final C7120Qz c7120Qz, List list, final Ij0 ij0) {
        if (list == null || list.isEmpty()) {
            c7120Qz.f69701a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Lz
                @Override // java.lang.Runnable
                public final void run() {
                    ij0.zza(new zzdvy(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.q qVarH = Mj0.h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.q qVar = (com.google.common.util.concurrent.q) it.next();
            qVarH = Mj0.n(Mj0.f(qVarH, Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.Mz
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    ij0.zza((Throwable) obj);
                    return Mj0.h(null);
                }
            }, c7120Qz.f69701a), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.Nz
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f68982a.a(ij0, qVar, (C6577Az) obj);
                }
            }, c7120Qz.f69701a);
        }
        Mj0.r(qVarH, new C7086Pz(c7120Qz, ij0), c7120Qz.f69701a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Ij0 ij0, com.google.common.util.concurrent.q qVar, C6577Az c6577Az) throws Exception {
        if (c6577Az != null) {
            ij0.zzb(c6577Az);
        }
        return Mj0.o(qVar, ((Long) C10158zg.f80458a.e()).longValue(), TimeUnit.MILLISECONDS, this.f69702b);
    }

    public final void e(Ij0 ij0) {
        Mj0.r(this.f69703c, new C7052Oz(this, ij0), this.f69701a);
    }
}
