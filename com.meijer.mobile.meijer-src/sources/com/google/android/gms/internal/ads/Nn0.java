package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public final class Nn0 extends Kn0 {
    @Override // com.google.android.gms.internal.ads.Kn0
    final In0 a(byte[] bArr, int i10) throws InvalidKeyException {
        return new Mn0(bArr, i10);
    }

    public Nn0(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }
}
