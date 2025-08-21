package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class VB implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71651a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71652b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f71653c;

    public VB(UB ub2, InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f71651a = interfaceC10213yy0;
        this.f71652b = interfaceC10213yy02;
        this.f71653c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f71651a.zzb();
        Sc.a aVarA = ((C7037Ku) this.f71652b).a();
        Z50 z50A = ((C7313Sz) this.f71653c).a();
        C6794Dp c6794Dp = new C6794Dp();
        C6828Ep c6828Ep = z50A.f72835A;
        if (c6828Ep == null) {
            return null;
        }
        C7880d60 c7880d60 = z50A.f72897s;
        return new C6760Cp(context, aVarA, c6828Ep, c7880d60 != null ? c7880d60.f74204b : null, c6794Dp);
    }
}
