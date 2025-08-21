package com.google.android.gms.internal.ads;

import Vd.C5519m;
import dd.C13655c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class F20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C6693Aq f67537a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f67538b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f67539c;

    F20(String str, C6707Bc c6707Bc, C6693Aq c6693Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        this.f67537a = c6693Aq;
        this.f67538b = scheduledExecutorService;
        this.f67539c = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 43;
    }

    final /* synthetic */ G20 a(Exception exc) {
        this.f67537a.x(exc, "AppSetIdInfoGmscoreSignal");
        return new G20(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77051X2)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77121c3)).booleanValue()) {
                com.google.common.util.concurrent.q qVarN = Mj0.n(C7454Xd0.a(C5519m.f(null), null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.C20
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        C13655c c13655c = (C13655c) obj;
                        return c13655c == null ? Mj0.h(new G20(null, -1)) : Mj0.h(new G20(c13655c.a(), c13655c.b()));
                    }
                }, this.f67539c);
                if (((Boolean) C7490Yf.f72429a.e()).booleanValue()) {
                    qVarN = Mj0.o(qVarN, ((Long) C7490Yf.f72430b.e()).longValue(), TimeUnit.MILLISECONDS, this.f67538b);
                }
                return Mj0.e(qVarN, Exception.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.E20
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        return this.f67173a.a((Exception) obj);
                    }
                }, this.f67539c);
            }
        }
        return Mj0.h(new G20(null, -1));
    }
}
