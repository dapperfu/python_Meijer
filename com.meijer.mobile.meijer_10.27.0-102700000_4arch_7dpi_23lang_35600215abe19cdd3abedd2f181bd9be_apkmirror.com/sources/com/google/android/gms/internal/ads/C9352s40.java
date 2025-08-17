package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.s40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9352s40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f78125a;

    /* renamed from: b, reason: collision with root package name */
    private final N40 f78126b;

    /* renamed from: c, reason: collision with root package name */
    private final E70 f78127c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78128d;

    /* renamed from: e, reason: collision with root package name */
    private EB f78129e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f78130f;

    public C9352s40(N40 n40, N40 n402, E70 e70, String str, Executor executor) {
        this.f78125a = n40;
        this.f78126b = n402;
        this.f78127c = e70;
        this.f78128d = str;
        this.f78130f = executor;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return e(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f78129e;
    }

    public final synchronized com.google.common.util.concurrent.q e(final O40 o40, final M40 m40, EB eb2) {
        DB dbA = m40.a(o40.f69002b);
        dbA.p(new C9459t40(this.f78128d));
        final EB eb3 = (EB) dbA.zzh();
        eb3.zzg();
        eb3.zzg();
        Mc.Y1 y12 = eb3.zzg().f78738d;
        if (y12.f19185s != null || y12.f19190x != null) {
            this.f78129e = eb3;
            return ((C40) this.f78125a).c(o40, m40, eb3);
        }
        C9570u60 c9570u60Zzg = eb3.zzg();
        final C9245r40 c9245r40 = new C9245r40(m40, o40, c9570u60Zzg.f78738d, c9570u60Zzg.f78740f, this.f78130f, c9570u60Zzg.f78744j, null);
        return (Cj0) Mj0.n(Cj0.D(((C9994y40) this.f78126b).c(o40, m40, eb3)), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.p40
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f77481a.c(o40, c9245r40, m40, eb3, (C9887x40) obj);
            }
        }, this.f78130f);
    }

    private final com.google.common.util.concurrent.q f(C9251r70 c9251r70, O40 o40) {
        EB eb2 = c9251r70.f77943a;
        this.f78129e = eb2;
        if (c9251r70.f77945c != null) {
            if (eb2.zzf() != null) {
                c9251r70.f77945c.f().a(c9251r70.f77943a.zzf());
            }
            return Mj0.h(c9251r70.f77945c);
        }
        eb2.zzb().k(c9251r70.f77944b);
        return ((C40) this.f78125a).c(o40, null, c9251r70.f77943a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(O40 o40, C9245r40 c9245r40, M40 m40, EB eb2, C9887x40 c9887x40) throws Exception {
        if (c9887x40 != null) {
            C9245r40 c9245r402 = new C9245r40(c9245r40.f77923a, c9245r40.f77924b, c9245r40.f77925c, c9245r40.f77926d, c9245r40.f77927e, c9245r40.f77928f, c9887x40.f79670a);
            if (c9887x40.f79672c != null) {
                this.f78129e = null;
                this.f78127c.e(c9245r402);
                return f(c9887x40.f79672c, o40);
            }
            com.google.common.util.concurrent.q qVarA = this.f78127c.a(c9245r402);
            if (qVarA != null) {
                this.f78129e = null;
                return Mj0.n(qVarA, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.o40
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f77299a.d((B70) obj);
                    }
                }, this.f78130f);
            }
            this.f78127c.e(c9245r402);
            o40 = new O40(o40.f69002b, c9887x40.f79671b);
        }
        com.google.common.util.concurrent.q qVarC = ((C40) this.f78125a).c(o40, m40, eb2);
        this.f78129e = eb2;
        return qVarC;
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(B70 b70) throws Exception {
        D70 d70;
        if (b70 == null || b70.f65458a == null || (d70 = b70.f65459b) == null) {
            throw new zzdvy(1, "Empty prefetch");
        }
        C7295Wd c7295WdD0 = C7804de.d0();
        C7229Ud c7229UdH0 = C7262Vd.h0();
        c7229UdH0.u(EnumC7328Xd.IN_MEMORY);
        c7229UdH0.w(C7484ae.f0());
        c7295WdD0.u(c7229UdH0);
        b70.f65458a.f77943a.zzb().c().j(c7295WdD0.p());
        return f(b70.f65458a, ((C9245r40) d70).f77924b);
    }
}
