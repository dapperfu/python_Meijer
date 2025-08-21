package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class VX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f71723a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f71724b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f71725c;

    VX(com.google.common.util.concurrent.q qVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f71723a = qVar;
        this.f71724b = executor;
        this.f71725c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        com.google.common.util.concurrent.q qVarN = Mj0.n(this.f71723a, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.SX
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new WX((String) obj));
            }
        }, this.f71724b);
        if (((Integer) Oc.A.c().a(C8784lf.f77326qc)).intValue() > 0) {
            qVarN = Mj0.o(qVarN, ((Integer) Oc.A.c().a(r1)).intValue(), TimeUnit.MILLISECONDS, this.f71725c);
        }
        return Mj0.f(qVarN, Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.UX
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? Mj0.h(new WX(Integer.toString(17))) : Mj0.h(new WX(null));
            }
        }, this.f71724b);
    }
}
