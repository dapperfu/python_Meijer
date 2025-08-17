package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.aV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7471aV extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f72429a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f72430b;

    /* renamed from: c, reason: collision with root package name */
    private final ZE f72431c;

    /* renamed from: d, reason: collision with root package name */
    private final C7897eV f72432d;

    /* renamed from: e, reason: collision with root package name */
    private final C8715m60 f72433e;

    /* renamed from: f, reason: collision with root package name */
    private final C8856nT f72434f;

    public C7471aV(AbstractC9010ou abstractC9010ou, GB gb2, ZE ze2, C8715m60 c8715m60, C7897eV c7897eV, C8856nT c8856nT) {
        this.f72429a = abstractC9010ou;
        this.f72430b = gb2;
        this.f72431c = ze2;
        this.f72433e = c8715m60;
        this.f72432d = c7897eV;
        this.f72434f = c8856nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60) {
        C8715m60 c8715m60;
        GB gb2 = this.f72430b;
        gb2.k(c9570u60);
        gb2.g(bundle);
        gb2.h(new C10007yB(c8608l60, z50, this.f72432d));
        if (((Boolean) Mc.A.c().a(C8659lf.f75974G3)).booleanValue() && (c8715m60 = this.f72433e) != null) {
            this.f72430b.j(c8715m60);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue()) {
            this.f72430b.e(this.f72434f);
        }
        AbstractC9010ou abstractC9010ou = this.f72429a;
        GB gb3 = this.f72430b;
        CL clP = abstractC9010ou.p();
        clP.b(gb3.l());
        clP.a(this.f72431c);
        C8082gA c8082gAZzb = clP.zze().zzb();
        return c8082gAZzb.h(c8082gAZzb.i());
    }
}
