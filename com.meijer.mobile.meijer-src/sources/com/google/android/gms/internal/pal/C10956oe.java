package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.oe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10956oe implements InterfaceC10901l7 {

    /* renamed from: a, reason: collision with root package name */
    private final L8 f84107a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10901l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f84107a.a(We.a(12), bArr, bArr2);
    }

    public C10956oe(byte[] bArr) throws GeneralSecurityException {
        if (W8.a(2)) {
            this.f84107a = new L8(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
