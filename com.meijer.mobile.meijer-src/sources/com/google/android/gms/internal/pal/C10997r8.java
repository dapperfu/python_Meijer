package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.r8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10997r8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10982q8(this, Wb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final int f() {
        return 2;
    }

    C10997r8() {
        super(Tb.class, new C10966p8(InterfaceC10901l7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Tb tb2 = (Tb) interfaceC10815g1;
        Ye.b(tb2.t(), 0);
        Ye.a(tb2.y().f());
    }

    static /* bridge */ /* synthetic */ V9 k(int i10, int i11) {
        Vb vbU = Wb.u();
        vbU.m(i10);
        return new V9((Wb) vbU.j(), i11);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Tb.w(abstractC10730b0, C10958p0.a());
    }
}
