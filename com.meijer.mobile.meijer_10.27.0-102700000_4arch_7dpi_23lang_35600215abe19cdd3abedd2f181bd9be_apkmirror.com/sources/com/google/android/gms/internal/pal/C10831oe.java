package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.oe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10831oe implements InterfaceC10776l7 {

    /* renamed from: a, reason: collision with root package name */
    private final L8 f83267a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f83267a.a(We.a(12), bArr, bArr2);
    }

    public C10831oe(byte[] bArr) throws GeneralSecurityException {
        if (W8.a(2)) {
            this.f83267a = new L8(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
