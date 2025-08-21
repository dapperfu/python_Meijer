package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Tu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7342Tu implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71310a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71311b;

    public C7342Tu(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f71310a = interfaceC10213yy0;
        this.f71311b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC9337qo zzb() {
        Context contextA = ((C9990wu) this.f71310a).a();
        Z80 z80 = (Z80) this.f71311b.zzb();
        C7943dl c7943dlB = Nc.v.j().b(contextA, Sc.a.B(), z80);
        InterfaceC7464Xk interfaceC7464Xk = C7623al.f73326b;
        c7943dlB.a("google.afma.request.getAdDictionary", interfaceC7464Xk, interfaceC7464Xk);
        return new C9550so(contextA, Nc.v.j().b(contextA, Sc.a.B(), z80).a("google.afma.sdkConstants.getSdkConstants", interfaceC7464Xk, interfaceC7464Xk), Sc.a.B());
    }
}
