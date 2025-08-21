package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.aV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7596aV extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f73269a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f73270b;

    /* renamed from: c, reason: collision with root package name */
    private final ZE f73271c;

    /* renamed from: d, reason: collision with root package name */
    private final C8022eV f73272d;

    /* renamed from: e, reason: collision with root package name */
    private final C8840m60 f73273e;

    /* renamed from: f, reason: collision with root package name */
    private final C8981nT f73274f;

    public C7596aV(AbstractC9135ou abstractC9135ou, GB gb2, ZE ze2, C8840m60 c8840m60, C8022eV c8022eV, C8981nT c8981nT) {
        this.f73269a = abstractC9135ou;
        this.f73270b = gb2;
        this.f73271c = ze2;
        this.f73273e = c8840m60;
        this.f73272d = c8022eV;
        this.f73274f = c8981nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60) {
        C8840m60 c8840m60;
        GB gb2 = this.f73270b;
        gb2.k(c9695u60);
        gb2.g(bundle);
        gb2.h(new C10132yB(c8733l60, z50, this.f73272d));
        if (((Boolean) Oc.A.c().a(C8784lf.f76814G3)).booleanValue() && (c8840m60 = this.f73273e) != null) {
            this.f73270b.j(c8840m60);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue()) {
            this.f73270b.e(this.f73274f);
        }
        AbstractC9135ou abstractC9135ou = this.f73269a;
        GB gb3 = this.f73270b;
        CL clP = abstractC9135ou.p();
        clP.b(gb3.l());
        clP.a(this.f73271c);
        C8207gA c8207gAZzb = clP.zze().zzb();
        return c8207gAZzb.h(c8207gAZzb.i());
    }
}
