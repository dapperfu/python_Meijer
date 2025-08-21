package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Qz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7245Qz {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f70541a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f70542b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f70543c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f70544d = true;

    public C7245Qz(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.q qVar) {
        this.f70541a = executor;
        this.f70542b = scheduledExecutorService;
        this.f70543c = qVar;
    }

    final /* synthetic */ void d() {
        this.f70544d = false;
    }

    public final boolean f() {
        return this.f70544d;
    }

    static /* bridge */ /* synthetic */ void b(final C7245Qz c7245Qz, List list, final Ij0 ij0) {
        if (list == null || list.isEmpty()) {
            c7245Qz.f70541a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Lz
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
            qVarH = Mj0.n(Mj0.f(qVarH, Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.Mz
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    ij0.zza((Throwable) obj);
                    return Mj0.h(null);
                }
            }, c7245Qz.f70541a), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.Nz
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f69822a.a(ij0, qVar, (C6702Az) obj);
                }
            }, c7245Qz.f70541a);
        }
        Mj0.r(qVarH, new C7211Pz(c7245Qz, ij0), c7245Qz.f70541a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Ij0 ij0, com.google.common.util.concurrent.q qVar, C6702Az c6702Az) throws Exception {
        if (c6702Az != null) {
            ij0.zzb(c6702Az);
        }
        return Mj0.o(qVar, ((Long) C10283zg.f81298a.e()).longValue(), TimeUnit.MILLISECONDS, this.f70542b);
    }

    public final void e(Ij0 ij0) {
        Mj0.r(this.f70543c, new C7177Oz(this, ij0), this.f70541a);
    }
}
