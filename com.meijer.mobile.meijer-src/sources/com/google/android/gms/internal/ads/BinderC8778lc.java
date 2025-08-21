package com.google.android.gms.internal.ads;

import Ic.a;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8778lc extends AbstractBinderC9740uc {

    /* renamed from: a, reason: collision with root package name */
    private final a.AbstractC0230a f76709a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76710b;

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void U0(InterfaceC9526sc interfaceC9526sc) {
        if (this.f76709a != null) {
            this.f76709a.b(new C8885mc(interfaceC9526sc, this.f76710b));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void z2(Oc.W0 w02) {
        if (this.f76709a != null) {
            this.f76709a.a(w02.T());
        }
    }

    public BinderC8778lc(a.AbstractC0230a abstractC0230a, String str) {
        this.f76709a = abstractC0230a;
        this.f76710b = str;
    }
}
