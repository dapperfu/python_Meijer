package com.google.android.gms.internal.ads;

import Vd.AbstractC5516j;
import android.content.Context;
import dd.C13653a;
import dd.C13655c;
import dd.InterfaceC13654b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class DY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final C6693Aq f67091a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC13654b f67092b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f67093c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f67094d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f67095e;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77051X2)).booleanValue()) {
            if (!((Boolean) Oc.A.c().a(C8784lf.f77121c3)).booleanValue()) {
                if (!((Boolean) Oc.A.c().a(C8784lf.f77065Y2)).booleanValue()) {
                    return Mj0.m(C7454Xd0.a(this.f67092b.h(), null), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.AY
                        @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                        public final Object apply(Object obj) {
                            C13655c c13655c = (C13655c) obj;
                            return new EY(c13655c.a(), c13655c.b());
                        }
                    }, C7033Kq.f69020g);
                }
                AbstractC5516j<C13655c> abstractC5516jA = ((Boolean) Oc.A.c().a(C8784lf.f77107b3)).booleanValue() ? Y60.a(this.f67095e) : this.f67092b.h();
                if (abstractC5516jA == null) {
                    return Mj0.h(new EY(null, -1));
                }
                com.google.common.util.concurrent.q qVarN = Mj0.n(C7454Xd0.a(abstractC5516jA, null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.BY
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        C13655c c13655c = (C13655c) obj;
                        return c13655c == null ? Mj0.h(new EY(null, -1)) : Mj0.h(new EY(c13655c.a(), c13655c.b()));
                    }
                }, C7033Kq.f69020g);
                if (((Boolean) Oc.A.c().a(C8784lf.f77079Z2)).booleanValue()) {
                    qVarN = Mj0.o(qVarN, ((Long) Oc.A.c().a(C8784lf.f77093a3)).longValue(), TimeUnit.MILLISECONDS, this.f67093c);
                }
                return Mj0.e(qVarN, Exception.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.CY
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        this.f66647a.f67091a.x((Exception) obj, "AppSetIdInfoSignal");
                        return new EY(null, -1);
                    }
                }, this.f67094d);
            }
        }
        return Mj0.h(new EY(null, -1));
    }

    DY(Context context, C6693Aq c6693Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77107b3)).booleanValue()) {
            this.f67092b = C13653a.a(context);
        }
        this.f67095e = context;
        this.f67091a = c6693Aq;
        this.f67093c = scheduledExecutorService;
        this.f67094d = xj0;
    }
}
