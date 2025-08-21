package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class OU {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f69922a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f69923b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6838Ez f69924c;

    /* renamed from: d, reason: collision with root package name */
    private final C8022eV f69925d;

    /* renamed from: e, reason: collision with root package name */
    private final L90 f69926e;

    /* renamed from: f, reason: collision with root package name */
    private final C8369hk0 f69927f = C8369hk0.D();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f69928g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private PU f69929h;

    /* renamed from: i, reason: collision with root package name */
    private C8733l60 f69930i;

    private final synchronized com.google.common.util.concurrent.q d(Z50 z50) {
        Iterator it = z50.f72861a.iterator();
        while (it.hasNext()) {
            InterfaceC8448iT interfaceC8448iTC = this.f69924c.c(z50.f72863b, (String) it.next());
            if (interfaceC8448iTC != null && interfaceC8448iTC.a(this.f69930i, z50)) {
                return Mj0.o(interfaceC8448iTC.b(this.f69930i, z50), z50.f72852R, TimeUnit.MILLISECONDS, this.f69923b);
            }
        }
        return Mj0.g(new zzdvy(3));
    }

    public final synchronized com.google.common.util.concurrent.q b(C8733l60 c8733l60) {
        try {
            if (!this.f69928g.getAndSet(true)) {
                if (c8733l60.f76589b.f76176a.isEmpty()) {
                    this.f69927f.h(new zzegu(3, C8662kV.b(c8733l60)));
                } else {
                    this.f69930i = c8733l60;
                    this.f69929h = new PU(c8733l60, this.f69925d, this.f69927f);
                    this.f69925d.k(c8733l60.f76589b.f76176a);
                    Z50 z50A = this.f69929h.a();
                    while (z50A != null) {
                        e(z50A);
                        z50A = this.f69929h.a();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f69927f;
    }

    OU(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC6838Ez interfaceC6838Ez, C8022eV c8022eV, L90 l90) {
        this.f69922a = executor;
        this.f69923b = scheduledExecutorService;
        this.f69924c = interfaceC6838Ez;
        this.f69925d = c8022eV;
        this.f69926e = l90;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Z50 z50) {
        com.google.common.util.concurrent.q qVarD = d(z50);
        this.f69925d.f(this.f69930i, z50, qVarD, this.f69926e);
        Mj0.r(qVarD, new MU(this, z50), this.f69922a);
    }
}
