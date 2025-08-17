package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class VX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f70883a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f70884b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f70885c;

    VX(com.google.common.util.concurrent.q qVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f70883a = qVar;
        this.f70884b = executor;
        this.f70885c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        com.google.common.util.concurrent.q qVarN = Mj0.n(this.f70883a, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.SX
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new WX((String) obj));
            }
        }, this.f70884b);
        if (((Integer) Mc.A.c().a(C8659lf.f76486qc)).intValue() > 0) {
            qVarN = Mj0.o(qVarN, ((Integer) Mc.A.c().a(r1)).intValue(), TimeUnit.MILLISECONDS, this.f70885c);
        }
        return Mj0.f(qVarN, Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.UX
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? Mj0.h(new WX(Integer.toString(17))) : Mj0.h(new WX(null));
            }
        }, this.f70884b);
    }
}
