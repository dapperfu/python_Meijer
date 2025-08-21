package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10886k8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10902l8 f84050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10886k8(C10902l8 c10902l8, Class cls) {
        super(cls);
        this.f84050b = c10902l8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        return g((Eb) interfaceC10815g1);
    }

    public static final Bb g(Eb eb2) throws GeneralSecurityException {
        Ab abU = Bb.u();
        abU.n(eb2.z());
        abU.m(AbstractC10730b0.s(We.a(eb2.t())));
        abU.o(0);
        return (Bb) abU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Eb.y(abstractC10730b0, C10958p0.a());
    }

    @Override // com.google.android.gms.internal.pal.W9
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void d(Eb eb2) throws GeneralSecurityException {
        Ye.a(eb2.t());
        C10902l8 c10902l8 = this.f84050b;
        C10902l8.m(eb2.z());
    }
}
