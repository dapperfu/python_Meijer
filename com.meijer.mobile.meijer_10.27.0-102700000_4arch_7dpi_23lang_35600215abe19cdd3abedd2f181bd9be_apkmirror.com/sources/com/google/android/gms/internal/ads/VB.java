package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class VB implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70811a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70812b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f70813c;

    public VB(UB ub2, InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f70811a = interfaceC10088yy0;
        this.f70812b = interfaceC10088yy02;
        this.f70813c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f70811a.zzb();
        Qc.a aVarA = ((C6912Ku) this.f70812b).a();
        Z50 z50A = ((C7188Sz) this.f70813c).a();
        C6669Dp c6669Dp = new C6669Dp();
        C6703Ep c6703Ep = z50A.f71995A;
        if (c6703Ep == null) {
            return null;
        }
        C7755d60 c7755d60 = z50A.f72057s;
        return new C6635Cp(context, aVarA, c6703Ep, c7755d60 != null ? c7755d60.f73364b : null, c6669Dp);
    }
}
