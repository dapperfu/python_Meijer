package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.l8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10777l8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10761k8(this, Eb.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    C10777l8() {
        super(Bb.class, new C10745j8(Qe.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        l((Bb) interfaceC10690g1);
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
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Bb.y(abstractC10605b0, C10833p0.a());
    }
}
