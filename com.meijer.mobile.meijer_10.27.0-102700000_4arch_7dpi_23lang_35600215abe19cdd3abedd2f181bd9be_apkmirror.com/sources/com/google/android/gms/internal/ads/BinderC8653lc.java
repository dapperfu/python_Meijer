package com.google.android.gms.internal.ads;

import Gc.a;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8653lc extends AbstractBinderC9615uc {

    /* renamed from: a, reason: collision with root package name */
    private final a.AbstractC0161a f75869a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75870b;

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void P8(Mc.W0 w02) {
        if (this.f75869a != null) {
            this.f75869a.a(w02.T());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void T0(InterfaceC9401sc interfaceC9401sc) {
        if (this.f75869a != null) {
            this.f75869a.b(new C8760mc(interfaceC9401sc, this.f75870b));
        }
    }

    public BinderC8653lc(a.AbstractC0161a abstractC0161a, String str) {
        this.f75869a = abstractC0161a;
        this.f75870b = str;
    }
}
