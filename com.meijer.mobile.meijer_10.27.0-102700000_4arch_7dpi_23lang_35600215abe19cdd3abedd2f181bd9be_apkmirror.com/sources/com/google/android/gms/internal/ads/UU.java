package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class UU extends TU {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f70620a;

    /* renamed from: b, reason: collision with root package name */
    private final GB f70621b;

    /* renamed from: c, reason: collision with root package name */
    private final ZE f70622c;

    /* renamed from: d, reason: collision with root package name */
    private final C7897eV f70623d;

    /* renamed from: e, reason: collision with root package name */
    private final C8856nT f70624e;

    UU(AbstractC9010ou abstractC9010ou, GB gb2, ZE ze2, C7897eV c7897eV, C8856nT c8856nT) {
        this.f70620a = abstractC9010ou;
        this.f70621b = gb2;
        this.f70622c = ze2;
        this.f70623d = c7897eV;
        this.f70624e = c8856nT;
    }

    @Override // com.google.android.gms.internal.ads.TU
    protected final com.google.common.util.concurrent.q c(C9570u60 c9570u60, Bundle bundle, Z50 z50, C8608l60 c8608l60) {
        GB gb2 = this.f70621b;
        gb2.k(c9570u60);
        gb2.g(bundle);
        gb2.h(new C10007yB(c8608l60, z50, this.f70623d));
        if (((Boolean) Mc.A.c().a(C8659lf.f75988H3)).booleanValue()) {
            this.f70621b.e(this.f70624e);
        }
        AbstractC9010ou abstractC9010ou = this.f70620a;
        GB gb3 = this.f70621b;
        InterfaceC7352Xx interfaceC7352XxK = abstractC9010ou.k();
        interfaceC7352XxK.b(gb3.l());
        interfaceC7352XxK.a(this.f70622c);
        C8082gA c8082gAZzb = interfaceC7352XxK.zze().zzb();
        return c8082gAZzb.h(c8082gAZzb.i());
    }
}
