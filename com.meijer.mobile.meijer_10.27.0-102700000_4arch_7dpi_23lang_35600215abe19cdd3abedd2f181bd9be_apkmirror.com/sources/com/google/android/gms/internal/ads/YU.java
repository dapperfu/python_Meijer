package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class YU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f71559a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f71560b;

    /* renamed from: c, reason: collision with root package name */
    private final C8645lW f71561c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f71562d;

    /* renamed from: e, reason: collision with root package name */
    private final C7897eV f71563e;

    /* renamed from: f, reason: collision with root package name */
    private final C8856nT f71564f;

    public YU(AbstractC9010ou abstractC9010ou, GB gb2, C8645lW c8645lW, ZE ze2, C7897eV c7897eV, C8856nT c8856nT) {
        this.f71559a = abstractC9010ou;
        this.f71560b = gb2;
        this.f71561c = c8645lW;
        this.f71562d = ze2;
        this.f71563e = c7897eV;
        this.f71564f = c8856nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60) {
        GB gb2 = this.f71560b;
        gb2.k(c9570u60);
        gb2.g(bundle);
        gb2.h(new C10007yB(c8608l60, z50, this.f71563e));
        if (((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue()) {
            this.f71560b.e(this.f71564f);
        }
        AbstractC9010ou abstractC9010ou = this.f71559a;
        GB gb3 = this.f71560b;
        InterfaceC8415jH interfaceC8415jHN = abstractC9010ou.n();
        interfaceC8415jHN.k(gb3.l());
        interfaceC8415jHN.o(this.f71562d);
        interfaceC8415jHN.h(this.f71561c);
        C8082gA c8082gAA = interfaceC8415jHN.zzf().a();
        return c8082gAA.h(c8082gAA.i());
    }
}
