package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public final class O8 extends P8 {
    @Override // com.google.android.gms.internal.pal.P8
    final N8 a(byte[] bArr, int i10) throws InvalidKeyException {
        return new M8(bArr, i10);
    }

    public O8(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }
}
