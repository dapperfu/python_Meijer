package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Y20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f72304a;

    public Y20(C10083xn c10083xn, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f72304a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.m(Mj0.o(Mj0.h(new Bundle()), ((Long) Oc.A.c().a(C8784lf.f77234k4)).longValue(), TimeUnit.MILLISECONDS, this.f72304a), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.X20
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return new Z20((Bundle) obj);
            }
        }, C7033Kq.f69014a);
    }
}
