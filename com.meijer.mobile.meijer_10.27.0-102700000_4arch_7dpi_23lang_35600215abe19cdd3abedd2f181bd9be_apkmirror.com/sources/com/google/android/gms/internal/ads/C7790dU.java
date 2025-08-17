package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7790dU implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7153Ry f73410a;

    /* renamed from: b, reason: collision with root package name */
    private final JT f73411b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f73412c;

    /* renamed from: d, reason: collision with root package name */
    private final C7553bC f73413d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f73414e;

    /* renamed from: f, reason: collision with root package name */
    private final C9171qN f73415f;

    public C7790dU(AbstractC7153Ry abstractC7153Ry, JT jt2, C7553bC c7553bC, ScheduledExecutorService scheduledExecutorService, Xj0 xj0, C9171qN c9171qN) {
        this.f73410a = abstractC7153Ry;
        this.f73411b = jt2;
        this.f73413d = c7553bC;
        this.f73414e = scheduledExecutorService;
        this.f73412c = xj0;
        this.f73415f = c9171qN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        InterfaceC7033Oh interfaceC7033OhA = c8608l60.f75748a.f74605a.a();
        boolean zA = this.f73411b.a(c8608l60, z50);
        if (((Boolean) Mc.A.c().a(C8659lf.f76136Rb)).booleanValue()) {
            this.f73415f.b().put("has_dbl", interfaceC7033OhA != null ? "1" : "0");
            this.f73415f.b().put("crdb", true == zA ? "1" : "0");
        }
        return interfaceC7033OhA != null && zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        return this.f73412c.i0(new Callable() { // from class: com.google.android.gms.internal.ads.aU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f72426a.c(c8608l60, z50);
            }
        });
    }

    final /* synthetic */ AbstractC8804my c(final C8608l60 c8608l60, final Z50 z50) throws Exception {
        return this.f73410a.b(new C7154Rz(c8608l60, z50, null), new C8485jz(c8608l60.f75748a.f74605a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.bU
            @Override // java.lang.Runnable
            public final void run() {
                this.f72812a.f(c8608l60, z50);
            }
        })).zza();
    }

    final /* synthetic */ void f(C8608l60 c8608l60, Z50 z50) {
        Mj0.r(Mj0.o(this.f73411b.b(c8608l60, z50), z50.f72012R, TimeUnit.SECONDS, this.f73414e), new C7683cU(this), this.f73412c);
    }
}
