package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.d10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7870d10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final T10 f74157a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74158b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f74159c;

    public C7870d10(T10 t10, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f74157a = t10;
        this.f74158b = j10;
        this.f74159c = scheduledExecutorService;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Throwable th2) throws Exception {
        if (((Boolean) Oc.A.c().a(C8784lf.f77316q2)).booleanValue()) {
            T10 t10 = this.f74157a;
            Nc.v.s().x(th2, "OptionalSignalTimeout:" + t10.zza());
        }
        return Mj0.h(null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return this.f74157a.zza();
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        com.google.common.util.concurrent.q qVarZzb = this.f74157a.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) Oc.A.c().a(C8784lf.f77330r2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.f74158b;
        if (j10 > 0) {
            qVarZzb = Mj0.o(qVarZzb, j10, timeUnit, this.f74159c);
        }
        return Mj0.f(qVarZzb, Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.c10
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f73904a.a((Throwable) obj);
            }
        }, C7033Kq.f69020g);
    }
}
