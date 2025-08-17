package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Y20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f71464a;

    public Y20(C9958xn c9958xn, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f71464a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.m(Mj0.o(Mj0.h(new Bundle()), ((Long) Mc.A.c().a(C8659lf.f76394k4)).longValue(), TimeUnit.MILLISECONDS, this.f71464a), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.X20
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new Z20((Bundle) obj);
            }
        }, C6908Kq.f68174a);
    }
}
