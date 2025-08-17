package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8082gA {

    /* renamed from: a, reason: collision with root package name */
    private final C9280rQ f74250a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f74251b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f74252c;

    /* renamed from: d, reason: collision with root package name */
    private final C9548tw f74253d;

    /* renamed from: e, reason: collision with root package name */
    private final C8537kV f74254e;

    /* renamed from: f, reason: collision with root package name */
    private final NE f74255f;

    /* renamed from: g, reason: collision with root package name */
    private C8608l60 f74256g;

    /* renamed from: h, reason: collision with root package name */
    private final ZQ f74257h;

    /* renamed from: i, reason: collision with root package name */
    private final BB f74258i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f74259j;

    /* renamed from: k, reason: collision with root package name */
    private final LQ f74260k;

    /* renamed from: l, reason: collision with root package name */
    private final C8856nT f74261l;

    C8082gA(C9280rQ c9280rQ, C9570u60 c9570u60, B80 b80, C9548tw c9548tw, C8537kV c8537kV, NE ne2, C8608l60 c8608l60, ZQ zq2, BB bb2, Executor executor, LQ lq2, C8856nT c8856nT) {
        this.f74250a = c9280rQ;
        this.f74251b = c9570u60;
        this.f74252c = b80;
        this.f74253d = c9548tw;
        this.f74254e = c8537kV;
        this.f74255f = ne2;
        this.f74256g = c8608l60;
        this.f74257h = zq2;
        this.f74258i = bb2;
        this.f74259j = executor;
        this.f74260k = lq2;
        this.f74261l = c8856nT;
    }

    public final NE c() {
        return this.f74255f;
    }

    public final void k(C8608l60 c8608l60) {
        this.f74256g = c8608l60;
    }

    public final Mc.W0 a(Throwable th2) {
        return V60.b(th2, this.f74261l);
    }

    final /* synthetic */ C8608l60 d(C8608l60 c8608l60) throws Exception {
        this.f74253d.a(c8608l60);
        return c8608l60;
    }

    public final com.google.common.util.concurrent.q e(final C9038p70 c9038p70) {
        C8079g80 c8079g80A = this.f74252c.b(EnumC9681v80.GET_CACHE_KEY, this.f74258i.c()).f(new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.bA
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f72737a.f(c9038p70, (C9853wo) obj);
            }
        }).a();
        Mj0.r(c8079g80A, new C7868eA(this), this.f74259j);
        return c8079g80A;
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(C9038p70 c9038p70, C9853wo c9853wo) throws Exception {
        c9853wo.f79534i = c9038p70;
        return this.f74257h.a(c9853wo);
    }

    public final com.google.common.util.concurrent.q g(C9853wo c9853wo) {
        C8079g80 c8079g80A = this.f74252c.b(EnumC9681v80.NOTIFY_CACHE_HIT, this.f74257h.f(c9853wo)).a();
        Mj0.r(c8079g80A, new C7975fA(this), this.f74259j);
        return c8079g80A;
    }

    public final com.google.common.util.concurrent.q h(com.google.common.util.concurrent.q qVar) {
        C9253r80 c9253r80F = this.f74252c.b(EnumC9681v80.RENDERER, qVar).e(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.aA
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) throws Exception {
                C8608l60 c8608l60 = (C8608l60) obj;
                this.f72366a.d(c8608l60);
                return c8608l60;
            }
        }).f(this.f74254e);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76577x5)).booleanValue()) {
            c9253r80F = c9253r80F.i(((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS);
        }
        return c9253r80F.a();
    }

    public final com.google.common.util.concurrent.q i() {
        Mc.Y1 y12 = this.f74251b.f78738d;
        if (y12.f19190x == null && y12.f19185s == null) {
            return j(this.f74258i.c());
        }
        B80 b80 = this.f74252c;
        C9280rQ c9280rQ = this.f74250a;
        return C8505k80.c(c9280rQ.a(), EnumC9681v80.PRELOADED_LOADER, b80).a();
    }

    public final com.google.common.util.concurrent.q j(com.google.common.util.concurrent.q qVar) {
        C8608l60 c8608l60 = this.f74256g;
        if (c8608l60 != null) {
            B80 b80 = this.f74252c;
            return C8505k80.c(Mj0.h(c8608l60), EnumC9681v80.SERVER_TRANSACTION, b80).a();
        }
        Lc.v.f().j();
        C9253r80 c9253r80B = this.f74252c.b(EnumC9681v80.SERVER_TRANSACTION, qVar);
        final LQ lq2 = this.f74260k;
        Objects.requireNonNull(lq2);
        return c9253r80B.f(new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.dA
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return lq2.a((C9853wo) obj);
            }
        }).a();
    }
}
