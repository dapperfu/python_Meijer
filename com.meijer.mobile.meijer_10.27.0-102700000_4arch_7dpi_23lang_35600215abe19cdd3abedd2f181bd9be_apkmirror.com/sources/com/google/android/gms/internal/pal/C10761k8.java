package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10761k8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10777l8 f83210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10761k8(C10777l8 c10777l8, Class cls) {
        super(cls);
        this.f83210b = c10777l8;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        return g((Eb) interfaceC10690g1);
    }

    public static final Bb g(Eb eb2) throws GeneralSecurityException {
        Ab abU = Bb.u();
        abU.n(eb2.z());
        abU.m(AbstractC10605b0.s(We.a(eb2.t())));
        abU.o(0);
        return (Bb) abU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Eb.y(abstractC10605b0, C10833p0.a());
    }

    @Override // com.google.android.gms.internal.pal.W9
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void d(Eb eb2) throws GeneralSecurityException {
        Ye.a(eb2.t());
        C10777l8 c10777l8 = this.f83210b;
        C10777l8.m(eb2.z());
    }
}
