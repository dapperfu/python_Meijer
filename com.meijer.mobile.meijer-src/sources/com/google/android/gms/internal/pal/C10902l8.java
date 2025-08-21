package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.l8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10902l8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10886k8(this, Eb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    C10902l8() {
        super(Bb.class, new C10870j8(Qe.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        l((Bb) interfaceC10815g1);
    }

    public static final void l(Bb bb2) throws GeneralSecurityException {
        Ye.b(bb2.t(), 0);
        Ye.a(bb2.A().f());
        m(bb2.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Hb hb2) throws GeneralSecurityException {
        if (hb2.t() >= 12 && hb2.t() <= 16) {
        } else {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Bb.y(abstractC10730b0, C10958p0.a());
    }
}
