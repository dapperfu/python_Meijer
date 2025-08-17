package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.pal.r9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10873r9 implements InterfaceC10921u9 {

    /* renamed from: a, reason: collision with root package name */
    private final int f83836a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10921u9
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f83836a) {
            return new L8(bArr, false).a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10921u9
    public final int zza() {
        return this.f83836a;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10921u9
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.f83836a;
        if (i10 == 16) {
            return I9.f82668i;
        }
        if (i10 == 32) {
            return I9.f82669j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    C10873r9(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
        }
        this.f83836a = i10;
    }
}
