package com.google.android.gms.internal.ads;

import Td.AbstractC5232j;
import android.content.Context;
import bd.C6222a;
import bd.C6224c;
import bd.InterfaceC6223b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class DY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final C6568Aq f66251a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC6223b f66252b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f66253c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f66254d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f66255e;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76211X2)).booleanValue()) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76281c3)).booleanValue()) {
                if (!((Boolean) Mc.A.c().a(C8659lf.f76225Y2)).booleanValue()) {
                    return Mj0.m(C7329Xd0.a(this.f66252b.g(), null), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.AY
                        @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                        public final Object apply(Object obj) {
                            C6224c c6224c = (C6224c) obj;
                            return new EY(c6224c.a(), c6224c.b());
                        }
                    }, C6908Kq.f68180g);
                }
                AbstractC5232j<C6224c> abstractC5232jA = ((Boolean) Mc.A.c().a(C8659lf.f76267b3)).booleanValue() ? Y60.a(this.f66255e) : this.f66252b.g();
                if (abstractC5232jA == null) {
                    return Mj0.h(new EY(null, -1));
                }
                com.google.common.util.concurrent.q qVarN = Mj0.n(C7329Xd0.a(abstractC5232jA, null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.BY
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        C6224c c6224c = (C6224c) obj;
                        return c6224c == null ? Mj0.h(new EY(null, -1)) : Mj0.h(new EY(c6224c.a(), c6224c.b()));
                    }
                }, C6908Kq.f68180g);
                if (((Boolean) Mc.A.c().a(C8659lf.f76239Z2)).booleanValue()) {
                    qVarN = Mj0.o(qVarN, ((Long) Mc.A.c().a(C8659lf.f76253a3)).longValue(), TimeUnit.MILLISECONDS, this.f66253c);
                }
                return Mj0.e(qVarN, Exception.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.CY
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                    public final Object apply(Object obj) {
                        this.f65807a.f66251a.x((Exception) obj, "AppSetIdInfoSignal");
                        return new EY(null, -1);
                    }
                }, this.f66254d);
            }
        }
        return Mj0.h(new EY(null, -1));
    }

    DY(Context context, C6568Aq c6568Aq, ScheduledExecutorService scheduledExecutorService, Xj0 xj0) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76267b3)).booleanValue()) {
            this.f66252b = C6222a.a(context);
        }
        this.f66255e = context;
        this.f66251a = c6568Aq;
        this.f66253c = scheduledExecutorService;
        this.f66254d = xj0;
    }
}
