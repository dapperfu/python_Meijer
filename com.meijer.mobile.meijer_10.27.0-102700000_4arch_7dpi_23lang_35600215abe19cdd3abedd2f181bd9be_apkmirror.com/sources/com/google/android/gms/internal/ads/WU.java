package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class WU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f71095a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f71096b;

    /* renamed from: c, reason: collision with root package name */
    private final C8645lW f71097c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f71098d;

    /* renamed from: e, reason: collision with root package name */
    private final BH f71099e;

    /* renamed from: f, reason: collision with root package name */
    private final C9583uD f71100f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f71101g;

    /* renamed from: h, reason: collision with root package name */
    private final DE f71102h;

    /* renamed from: i, reason: collision with root package name */
    private final C7897eV f71103i;

    /* renamed from: j, reason: collision with root package name */
    private final C8856nT f71104j;

    public WU(AbstractC9010ou abstractC9010ou, GB gb2, C8645lW c8645lW, ZE ze2, BH bh2, C9583uD c9583uD, ViewGroup viewGroup, DE de2, C7897eV c7897eV, C8856nT c8856nT) {
        this.f71095a = abstractC9010ou;
        this.f71096b = gb2;
        this.f71097c = c8645lW;
        this.f71098d = ze2;
        this.f71099e = bh2;
        this.f71100f = c9583uD;
        this.f71101g = viewGroup;
        this.f71102h = de2;
        this.f71103i = c7897eV;
        this.f71104j = c8856nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60) {
        GB gb2 = this.f71096b;
        gb2.k(c9570u60);
        gb2.g(bundle);
        gb2.h(new C10007yB(c8608l60, z50, this.f71103i));
        if (((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue()) {
            this.f71096b.e(this.f71104j);
        }
        AbstractC9010ou abstractC9010ou = this.f71095a;
        GB gb3 = this.f71096b;
        InterfaceC7119Qy interfaceC7119QyL = abstractC9010ou.l();
        interfaceC7119QyL.e(gb3.l());
        interfaceC7119QyL.m(this.f71098d);
        interfaceC7119QyL.g(this.f71097c);
        interfaceC7119QyL.c(this.f71099e);
        interfaceC7119QyL.l(new C9447sz(this.f71100f, this.f71102h));
        interfaceC7119QyL.d(new C8483jy(this.f71101g));
        C8082gA c8082gAD = interfaceC7119QyL.zzk().d();
        return c8082gAD.h(c8082gAD.i());
    }
}
