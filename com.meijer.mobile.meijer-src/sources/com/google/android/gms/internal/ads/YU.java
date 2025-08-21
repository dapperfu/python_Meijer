package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class YU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f72399a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f72400b;

    /* renamed from: c, reason: collision with root package name */
    private final C8770lW f72401c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f72402d;

    /* renamed from: e, reason: collision with root package name */
    private final C8022eV f72403e;

    /* renamed from: f, reason: collision with root package name */
    private final C8981nT f72404f;

    public YU(AbstractC9135ou abstractC9135ou, GB gb2, C8770lW c8770lW, ZE ze2, C8022eV c8022eV, C8981nT c8981nT) {
        this.f72399a = abstractC9135ou;
        this.f72400b = gb2;
        this.f72401c = c8770lW;
        this.f72402d = ze2;
        this.f72403e = c8022eV;
        this.f72404f = c8981nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60) {
        GB gb2 = this.f72400b;
        gb2.k(c9695u60);
        gb2.g(bundle);
        gb2.h(new C10132yB(c8733l60, z50, this.f72403e));
        if (((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue()) {
            this.f72400b.e(this.f72404f);
        }
        AbstractC9135ou abstractC9135ou = this.f72399a;
        GB gb3 = this.f72400b;
        InterfaceC8540jH interfaceC8540jHN = abstractC9135ou.n();
        interfaceC8540jHN.k(gb3.l());
        interfaceC8540jHN.o(this.f72402d);
        interfaceC8540jHN.h(this.f72401c);
        C8207gA c8207gAA = interfaceC8540jHN.zzf().a();
        return c8207gAA.h(c8207gAA.i());
    }
}
