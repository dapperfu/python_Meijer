package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class OU {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f69082a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f69083b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6713Ez f69084c;

    /* renamed from: d, reason: collision with root package name */
    private final C7897eV f69085d;

    /* renamed from: e, reason: collision with root package name */
    private final L90 f69086e;

    /* renamed from: f, reason: collision with root package name */
    private final C8244hk0 f69087f = C8244hk0.D();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f69088g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private PU f69089h;

    /* renamed from: i, reason: collision with root package name */
    private C8608l60 f69090i;

    private final synchronized com.google.common.util.concurrent.q d(Z50 z50) {
        Iterator it = z50.f72021a.iterator();
        while (it.hasNext()) {
            InterfaceC8323iT interfaceC8323iTC = this.f69084c.c(z50.f72023b, (String) it.next());
            if (interfaceC8323iTC != null && interfaceC8323iTC.a(this.f69090i, z50)) {
                return Mj0.o(interfaceC8323iTC.b(this.f69090i, z50), z50.f72012R, TimeUnit.MILLISECONDS, this.f69083b);
            }
        }
        return Mj0.g(new zzdvy(3));
    }

    public final synchronized com.google.common.util.concurrent.q b(C8608l60 c8608l60) {
        try {
            if (!this.f69088g.getAndSet(true)) {
                if (c8608l60.f75749b.f75336a.isEmpty()) {
                    this.f69087f.h(new zzegu(3, C8537kV.b(c8608l60)));
                } else {
                    this.f69090i = c8608l60;
                    this.f69089h = new PU(c8608l60, this.f69085d, this.f69087f);
                    this.f69085d.k(c8608l60.f75749b.f75336a);
                    Z50 z50A = this.f69089h.a();
                    while (z50A != null) {
                        e(z50A);
                        z50A = this.f69089h.a();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f69087f;
    }

    OU(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC6713Ez interfaceC6713Ez, C7897eV c7897eV, L90 l90) {
        this.f69082a = executor;
        this.f69083b = scheduledExecutorService;
        this.f69084c = interfaceC6713Ez;
        this.f69085d = c7897eV;
        this.f69086e = l90;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Z50 z50) {
        com.google.common.util.concurrent.q qVarD = d(z50);
        this.f69085d.f(this.f69090i, z50, qVarD, this.f69086e);
        Mj0.r(qVarD, new MU(this, z50), this.f69082a);
    }
}
