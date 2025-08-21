package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.pal.s9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11014s9 implements InterfaceC11046u9 {
    C11014s9() {
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11046u9
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new O8(bArr).c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11046u9
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11046u9
    public final byte[] zzb() {
        return I9.f83510k;
    }
}
