package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.s40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9477s40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f78965a;

    /* renamed from: b, reason: collision with root package name */
    private final N40 f78966b;

    /* renamed from: c, reason: collision with root package name */
    private final E70 f78967c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78968d;

    /* renamed from: e, reason: collision with root package name */
    private EB f78969e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f78970f;

    public C9477s40(N40 n40, N40 n402, E70 e70, String str, Executor executor) {
        this.f78965a = n40;
        this.f78966b = n402;
        this.f78967c = e70;
        this.f78968d = str;
        this.f78970f = executor;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return e(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f78969e;
    }

    public final synchronized com.google.common.util.concurrent.q e(final O40 o40, final M40 m40, EB eb2) {
        DB dbA = m40.a(o40.f69842b);
        dbA.p(new C9584t40(this.f78968d));
        final EB eb3 = (EB) dbA.zzh();
        eb3.zzg();
        eb3.zzg();
        Oc.Y1 y12 = eb3.zzg().f79578d;
        if (y12.f23372s != null || y12.f23377x != null) {
            this.f78969e = eb3;
            return ((C40) this.f78965a).c(o40, m40, eb3);
        }
        C9695u60 c9695u60Zzg = eb3.zzg();
        final C9370r40 c9370r40 = new C9370r40(m40, o40, c9695u60Zzg.f79578d, c9695u60Zzg.f79580f, this.f78970f, c9695u60Zzg.f79584j, null);
        return (Cj0) Mj0.n(Cj0.D(((C10119y40) this.f78966b).c(o40, m40, eb3)), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.p40
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78321a.c(o40, c9370r40, m40, eb3, (C10012x40) obj);
            }
        }, this.f78970f);
    }

    private final com.google.common.util.concurrent.q f(C9376r70 c9376r70, O40 o40) {
        EB eb2 = c9376r70.f78783a;
        this.f78969e = eb2;
        if (c9376r70.f78785c != null) {
            if (eb2.zzf() != null) {
                c9376r70.f78785c.f().a(c9376r70.f78783a.zzf());
            }
            return Mj0.h(c9376r70.f78785c);
        }
        eb2.zzb().k(c9376r70.f78784b);
        return ((C40) this.f78965a).c(o40, null, c9376r70.f78783a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(O40 o40, C9370r40 c9370r40, M40 m40, EB eb2, C10012x40 c10012x40) throws Exception {
        if (c10012x40 != null) {
            C9370r40 c9370r402 = new C9370r40(c9370r40.f78763a, c9370r40.f78764b, c9370r40.f78765c, c9370r40.f78766d, c9370r40.f78767e, c9370r40.f78768f, c10012x40.f80510a);
            if (c10012x40.f80512c != null) {
                this.f78969e = null;
                this.f78967c.e(c9370r402);
                return f(c10012x40.f80512c, o40);
            }
            com.google.common.util.concurrent.q qVarA = this.f78967c.a(c9370r402);
            if (qVarA != null) {
                this.f78969e = null;
                return Mj0.n(qVarA, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.o40
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return this.f78139a.d((B70) obj);
                    }
                }, this.f78970f);
            }
            this.f78967c.e(c9370r402);
            o40 = new O40(o40.f69842b, c10012x40.f80511b);
        }
        com.google.common.util.concurrent.q qVarC = ((C40) this.f78965a).c(o40, m40, eb2);
        this.f78969e = eb2;
        return qVarC;
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(B70 b70) throws Exception {
        D70 d70;
        if (b70 == null || b70.f66298a == null || (d70 = b70.f66299b) == null) {
            throw new zzdvy(1, "Empty prefetch");
        }
        C7420Wd c7420WdD0 = C7929de.d0();
        C7354Ud c7354UdH0 = C7387Vd.h0();
        c7354UdH0.u(EnumC7453Xd.IN_MEMORY);
        c7354UdH0.w(C7609ae.f0());
        c7420WdD0.u(c7354UdH0);
        b70.f66298a.f78783a.zzb().c().j(c7420WdD0.p());
        return f(b70.f66298a, ((C9370r40) d70).f78764b);
    }
}
