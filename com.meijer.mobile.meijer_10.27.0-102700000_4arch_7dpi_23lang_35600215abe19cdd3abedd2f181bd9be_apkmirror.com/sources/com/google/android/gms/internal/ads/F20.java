package com.google.android.gms.internal.ads;

import Td.C5235m;
import bd.C6224c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class F20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C6568Aq f66697a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f66698b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f66699c;

    F20(String str, C6582Bc c6582Bc, C6568Aq c6568Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        this.f66697a = c6568Aq;
        this.f66698b = scheduledExecutorService;
        this.f66699c = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 43;
    }

    final /* synthetic */ G20 a(Exception exc) {
        this.f66697a.x(exc, "AppSetIdInfoGmscoreSignal");
        return new G20(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76211X2)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76281c3)).booleanValue()) {
                com.google.common.util.concurrent.q qVarN = Mj0.n(C7329Xd0.a(C5235m.f(null), null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.C20
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        C6224c c6224c = (C6224c) obj;
                        return c6224c == null ? Mj0.h(new G20(null, -1)) : Mj0.h(new G20(c6224c.a(), c6224c.b()));
                    }
                }, this.f66699c);
                if (((Boolean) C7365Yf.f71589a.e()).booleanValue()) {
                    qVarN = Mj0.o(qVarN, ((Long) C7365Yf.f71590b.e()).longValue(), TimeUnit.MILLISECONDS, this.f66698b);
                }
                return Mj0.e(qVarN, Exception.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.E20
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                    public final Object apply(Object obj) {
                        return this.f66333a.a((Exception) obj);
                    }
                }, this.f66699c);
            }
        }
        return Mj0.h(new G20(null, -1));
    }
}
