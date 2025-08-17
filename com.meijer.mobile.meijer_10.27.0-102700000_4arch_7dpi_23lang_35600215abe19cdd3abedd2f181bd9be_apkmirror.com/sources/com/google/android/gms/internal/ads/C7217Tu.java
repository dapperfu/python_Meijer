package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Tu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7217Tu implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70470a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70471b;

    public C7217Tu(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70470a = interfaceC10088yy0;
        this.f70471b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC9212qo zzb() {
        Context contextA = ((C9865wu) this.f70470a).a();
        Z80 z80 = (Z80) this.f70471b.zzb();
        C7818dl c7818dlB = Lc.v.j().b(contextA, Qc.a.B(), z80);
        InterfaceC7339Xk interfaceC7339Xk = C7498al.f72486b;
        c7818dlB.a("google.afma.request.getAdDictionary", interfaceC7339Xk, interfaceC7339Xk);
        return new C9425so(contextA, Lc.v.j().b(contextA, Qc.a.B(), z80).a("google.afma.sdkConstants.getSdkConstants", interfaceC7339Xk, interfaceC7339Xk), Qc.a.B());
    }
}
