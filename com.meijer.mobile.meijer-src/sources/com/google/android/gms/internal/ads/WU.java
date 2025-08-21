package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class WU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f71935a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f71936b;

    /* renamed from: c, reason: collision with root package name */
    private final C8770lW f71937c;

    /* renamed from: d, reason: collision with root package name */
    private final ZE f71938d;

    /* renamed from: e, reason: collision with root package name */
    private final BH f71939e;

    /* renamed from: f, reason: collision with root package name */
    private final C9708uD f71940f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f71941g;

    /* renamed from: h, reason: collision with root package name */
    private final DE f71942h;

    /* renamed from: i, reason: collision with root package name */
    private final C8022eV f71943i;

    /* renamed from: j, reason: collision with root package name */
    private final C8981nT f71944j;

    public WU(AbstractC9135ou abstractC9135ou, GB gb2, C8770lW c8770lW, ZE ze2, BH bh2, C9708uD c9708uD, ViewGroup viewGroup, DE de2, C8022eV c8022eV, C8981nT c8981nT) {
        this.f71935a = abstractC9135ou;
        this.f71936b = gb2;
        this.f71937c = c8770lW;
        this.f71938d = ze2;
        this.f71939e = bh2;
        this.f71940f = c9708uD;
        this.f71941g = viewGroup;
        this.f71942h = de2;
        this.f71943i = c8022eV;
        this.f71944j = c8981nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60) {
        GB gb2 = this.f71936b;
        gb2.k(c9695u60);
        gb2.g(bundle);
        gb2.h(new C10132yB(c8733l60, z50, this.f71943i));
        if (((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue()) {
            this.f71936b.e(this.f71944j);
        }
        AbstractC9135ou abstractC9135ou = this.f71935a;
        GB gb3 = this.f71936b;
        InterfaceC7244Qy interfaceC7244QyL = abstractC9135ou.l();
        interfaceC7244QyL.e(gb3.l());
        interfaceC7244QyL.m(this.f71938d);
        interfaceC7244QyL.g(this.f71937c);
        interfaceC7244QyL.c(this.f71939e);
        interfaceC7244QyL.l(new C9572sz(this.f71940f, this.f71942h));
        interfaceC7244QyL.d(new C8608jy(this.f71941g));
        C8207gA c8207gAD = interfaceC7244QyL.zzk().d();
        return c8207gAD.h(c8207gAD.i());
    }
}
