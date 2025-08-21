package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class UU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f71460a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f71461b;

    /* renamed from: c, reason: collision with root package name */
    private final ZE f71462c;

    /* renamed from: d, reason: collision with root package name */
    private final C8022eV f71463d;

    /* renamed from: e, reason: collision with root package name */
    private final C8981nT f71464e;

    UU(AbstractC9135ou abstractC9135ou, GB gb2, ZE ze2, C8022eV c8022eV, C8981nT c8981nT) {
        this.f71460a = abstractC9135ou;
        this.f71461b = gb2;
        this.f71462c = ze2;
        this.f71463d = c8022eV;
        this.f71464e = c8981nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9695u60 c9695u60, Bundle bundle, Z50 z50, C8733l60 c8733l60) {
        GB gb2 = this.f71461b;
        gb2.k(c9695u60);
        gb2.g(bundle);
        gb2.h(new C10132yB(c8733l60, z50, this.f71463d));
        if (((Boolean) Oc.A.c().a(C8784lf.f76828H3)).booleanValue()) {
            this.f71461b.e(this.f71464e);
        }
        AbstractC9135ou abstractC9135ou = this.f71460a;
        GB gb3 = this.f71461b;
        InterfaceC7477Xx interfaceC7477XxK = abstractC9135ou.k();
        interfaceC7477XxK.b(gb3.l());
        interfaceC7477XxK.a(this.f71462c);
        C8207gA c8207gAZzb = interfaceC7477XxK.zze().zzb();
        return c8207gAZzb.h(c8207gAZzb.i());
    }
}
