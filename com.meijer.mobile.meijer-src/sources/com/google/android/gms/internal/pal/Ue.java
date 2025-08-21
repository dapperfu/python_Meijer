package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Ue implements J7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10857ib f83757a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83758b;

    @Override // com.google.android.gms.internal.pal.J7
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f83757a.a(bArr, this.f83758b);
    }

    public Ue(InterfaceC10857ib interfaceC10857ib, int i10) throws GeneralSecurityException {
        this.f83757a = interfaceC10857ib;
        this.f83758b = i10;
        if (i10 >= 10) {
            interfaceC10857ib.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
