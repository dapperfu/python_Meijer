package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class RU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f69876a;

    /* renamed from: b, reason: collision with root package name */
    private final BH f69877b;

    /* renamed from: c, reason: collision with root package name */
    private final GB f69878c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f69879d;

    /* renamed from: e, reason: collision with root package name */
    private final C7897eV f69880e;

    /* renamed from: f, reason: collision with root package name */
    private final C8856nT f69881f;

    public RU(AbstractC9010ou abstractC9010ou, BH bh2, GB gb2, ZE ze2, C7897eV c7897eV, C8856nT c8856nT) {
        this.f69876a = abstractC9010ou;
        this.f69877b = bh2;
        this.f69878c = gb2;
        this.f69879d = ze2;
        this.f69880e = c7897eV;
        this.f69881f = c8856nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60) {
        GB gb2 = this.f69878c;
        gb2.k(c9570u60);
        gb2.g(bundle);
        gb2.h(new C10007yB(c8608l60, z50, this.f69880e));
        if (((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue()) {
            this.f69878c.e(this.f69881f);
        }
        AbstractC9010ou abstractC9010ou = this.f69876a;
        GB gb3 = this.f69878c;
        FH fhO = abstractC9010ou.o();
        fhO.i(gb3.l());
        fhO.n(this.f69879d);
        fhO.c(this.f69877b);
        fhO.d(new C8483jy(null));
        C8082gA c8082gAA = fhO.zzg().a();
        return c8082gAA.h(c8082gAA.i());
    }
}
