package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.pal.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10597a9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new Z8(this, C10749jc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    C10597a9() {
        super(C10701gc.class, new Y8(InterfaceC10824o7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10701gc c10701gc = (C10701gc) interfaceC10690g1;
        Ye.b(c10701gc.t(), 0);
        if (c10701gc.y().f() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + c10701gc.y().f() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10701gc.w(abstractC10605b0, C10833p0.a());
    }
}
