package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.pal.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10722a9 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new Z8(this, C10874jc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    C10722a9() {
        super(C10826gc.class, new Y8(InterfaceC10949o7.class));
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10826gc c10826gc = (C10826gc) interfaceC10815g1;
        Ye.b(c10826gc.t(), 0);
        if (c10826gc.y().f() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + c10826gc.y().f() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10826gc.w(abstractC10730b0, C10958p0.a());
    }
}
