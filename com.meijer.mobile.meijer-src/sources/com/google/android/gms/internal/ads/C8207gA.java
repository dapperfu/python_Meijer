package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8207gA {

    /* renamed from: a, reason: collision with root package name */
    private final C9405rQ f75090a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f75091b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f75092c;

    /* renamed from: d, reason: collision with root package name */
    private final C9673tw f75093d;

    /* renamed from: e, reason: collision with root package name */
    private final C8662kV f75094e;

    /* renamed from: f, reason: collision with root package name */
    private final NE f75095f;

    /* renamed from: g, reason: collision with root package name */
    private C8733l60 f75096g;

    /* renamed from: h, reason: collision with root package name */
    private final ZQ f75097h;

    /* renamed from: i, reason: collision with root package name */
    private final BB f75098i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f75099j;

    /* renamed from: k, reason: collision with root package name */
    private final LQ f75100k;

    /* renamed from: l, reason: collision with root package name */
    private final C8981nT f75101l;

    C8207gA(C9405rQ c9405rQ, C9695u60 c9695u60, B80 b80, C9673tw c9673tw, C8662kV c8662kV, NE ne2, C8733l60 c8733l60, ZQ zq2, BB bb2, Executor executor, LQ lq2, C8981nT c8981nT) {
        this.f75090a = c9405rQ;
        this.f75091b = c9695u60;
        this.f75092c = b80;
        this.f75093d = c9673tw;
        this.f75094e = c8662kV;
        this.f75095f = ne2;
        this.f75096g = c8733l60;
        this.f75097h = zq2;
        this.f75098i = bb2;
        this.f75099j = executor;
        this.f75100k = lq2;
        this.f75101l = c8981nT;
    }

    public final NE c() {
        return this.f75095f;
    }

    public final void k(C8733l60 c8733l60) {
        this.f75096g = c8733l60;
    }

    public final Oc.W0 a(Throwable th2) {
        return V60.b(th2, this.f75101l);
    }

    final /* synthetic */ C8733l60 d(C8733l60 c8733l60) throws Exception {
        this.f75093d.a(c8733l60);
        return c8733l60;
    }

    public final com.google.common.util.concurrent.q e(final C9163p70 c9163p70) {
        C8204g80 c8204g80A = this.f75092c.b(EnumC9806v80.GET_CACHE_KEY, this.f75098i.c()).f(new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.bA
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f73577a.f(c9163p70, (C9978wo) obj);
            }
        }).a();
        Mj0.r(c8204g80A, new C7993eA(this), this.f75099j);
        return c8204g80A;
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(C9163p70 c9163p70, C9978wo c9978wo) throws Exception {
        c9978wo.f80374i = c9163p70;
        return this.f75097h.a(c9978wo);
    }

    public final com.google.common.util.concurrent.q g(C9978wo c9978wo) {
        C8204g80 c8204g80A = this.f75092c.b(EnumC9806v80.NOTIFY_CACHE_HIT, this.f75097h.f(c9978wo)).a();
        Mj0.r(c8204g80A, new C8100fA(this), this.f75099j);
        return c8204g80A;
    }

    public final com.google.common.util.concurrent.q h(com.google.common.util.concurrent.q qVar) {
        C9378r80 c9378r80F = this.f75092c.b(EnumC9806v80.RENDERER, qVar).e(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.aA
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) throws Exception {
                C8733l60 c8733l60 = (C8733l60) obj;
                this.f73206a.d(c8733l60);
                return c8733l60;
            }
        }).f(this.f75094e);
        if (!((Boolean) Oc.A.c().a(C8784lf.f77417x5)).booleanValue()) {
            c9378r80F = c9378r80F.i(((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS);
        }
        return c9378r80F.a();
    }

    public final com.google.common.util.concurrent.q i() {
        Oc.Y1 y12 = this.f75091b.f79578d;
        if (y12.f23377x == null && y12.f23372s == null) {
            return j(this.f75098i.c());
        }
        B80 b80 = this.f75092c;
        C9405rQ c9405rQ = this.f75090a;
        return C8630k80.c(c9405rQ.a(), EnumC9806v80.PRELOADED_LOADER, b80).a();
    }

    public final com.google.common.util.concurrent.q j(com.google.common.util.concurrent.q qVar) {
        C8733l60 c8733l60 = this.f75096g;
        if (c8733l60 != null) {
            B80 b80 = this.f75092c;
            return C8630k80.c(Mj0.h(c8733l60), EnumC9806v80.SERVER_TRANSACTION, b80).a();
        }
        Nc.v.f().j();
        C9378r80 c9378r80B = this.f75092c.b(EnumC9806v80.SERVER_TRANSACTION, qVar);
        final LQ lq2 = this.f75100k;
        Objects.requireNonNull(lq2);
        return c9378r80B.f(new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.dA
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return lq2.a((C9978wo) obj);
            }
        }).a();
    }
}
