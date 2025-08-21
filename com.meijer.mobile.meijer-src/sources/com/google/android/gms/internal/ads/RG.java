package com.google.android.gms.internal.ads;

import Rc.C5216z;
import android.content.Context;

/* loaded from: classes6.dex */
public final class RG implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70681a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70682b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f70683c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f70684d;

    public RG(JG jg2, InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f70681a = interfaceC10213yy0;
        this.f70682b = interfaceC10213yy02;
        this.f70683c = interfaceC10213yy03;
        this.f70684d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f70681a.zzb();
        final Sc.a aVarA = ((C7037Ku) this.f70682b).a();
        final Z50 z50A = ((C7313Sz) this.f70683c).a();
        final C9695u60 c9695u60A = ((QB) this.f70684d).a();
        return new ZF(new PC() { // from class: com.google.android.gms.internal.ads.HG
            @Override // com.google.android.gms.internal.ads.PC
            public final void zzs() {
                C5216z c5216zW = Nc.v.w();
                Context context2 = context;
                C9695u60 c9695u60 = c9695u60A;
                c5216zW.n(context2, aVarA.f34479a, z50A.f72837C.toString(), c9695u60.f79580f);
            }
        }, C7033Kq.f69020g);
    }
}
