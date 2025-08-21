package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class RU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f70716a;

    /* renamed from: b, reason: collision with root package name */
    private final BH f70717b;

    /* renamed from: c, reason: collision with root package name */
    private final GB f70718c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f70719d;

    /* renamed from: e, reason: collision with root package name */
    private final C8022eV f70720e;

    /* renamed from: f, reason: collision with root package name */
    private final C8981nT f70721f;

    public RU(AbstractC9135ou abstractC9135ou, BH bh2, GB gb2, ZE ze2, C8022eV c8022eV, C8981nT c8981nT) {
        this.f70716a = abstractC9135ou;
        this.f70717b = bh2;
        this.f70718c = gb2;
        this.f70719d = ze2;
        this.f70720e = c8022eV;
        this.f70721f = c8981nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60) {
        GB gb2 = this.f70718c;
        gb2.k(c9695u60);
        gb2.g(bundle);
        gb2.h(new C10132yB(c8733l60, z50, this.f70720e));
        if (((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue()) {
            this.f70718c.e(this.f70721f);
        }
        AbstractC9135ou abstractC9135ou = this.f70716a;
        GB gb3 = this.f70718c;
        FH fhO = abstractC9135ou.o();
        fhO.i(gb3.l());
        fhO.n(this.f70719d);
        fhO.c(this.f70717b);
        fhO.d(new C8608jy(null));
        C8207gA c8207gAA = fhO.zzg().a();
        return c8207gAA.h(c8207gAA.i());
    }
}
