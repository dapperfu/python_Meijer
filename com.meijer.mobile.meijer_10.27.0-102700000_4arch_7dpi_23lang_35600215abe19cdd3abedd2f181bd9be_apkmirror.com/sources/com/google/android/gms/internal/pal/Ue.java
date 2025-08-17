package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Ue implements J7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10732ib f82917a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82918b;

    @Override // com.google.android.gms.internal.pal.J7
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f82917a.a(bArr, this.f82918b);
    }

    public Ue(InterfaceC10732ib interfaceC10732ib, int i10) throws GeneralSecurityException {
        this.f82917a = interfaceC10732ib;
        this.f82918b = i10;
        if (i10 >= 10) {
            interfaceC10732ib.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
