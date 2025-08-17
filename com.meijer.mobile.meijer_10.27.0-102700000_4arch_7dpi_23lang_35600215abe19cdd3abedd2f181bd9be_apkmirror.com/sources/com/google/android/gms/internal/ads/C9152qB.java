package com.google.android.gms.internal.ads;

import Pc.C4591v;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9152qB implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f77746a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f77747b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f77748c;

    public C9152qB(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f77746a = interfaceC10088yy0;
        this.f77747b = interfaceC10088yy02;
        this.f77748c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f77746a.zzb();
        final Qc.a aVarA = ((C6912Ku) this.f77747b).a();
        final C9570u60 c9570u60A = ((QB) this.f77748c).a();
        return new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.pB
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                Z50 z50 = (Z50) obj;
                C4591v c4591v = new C4591v(context);
                c4591v.p(z50.f71996B);
                c4591v.q(z50.f71997C.toString());
                c4591v.o(aVarA.f29929a);
                c4591v.n(c9570u60A.f78740f);
                return c4591v;
            }
        };
    }
}
