package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7837cl0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9660tp0 f74075a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (C9446rp0 c9446rp0 : this.f74075a.f(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((InterfaceC9543sk0) c9446rp0.d()).zza(bArr, bArr2);
                    c9446rp0.a();
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (C9446rp0 c9446rp02 : this.f74075a.f(C10078xk0.f80683a)) {
            try {
                byte[] bArrZza2 = ((InterfaceC9543sk0) c9446rp02.d()).zza(bArr, bArr2);
                c9446rp02.a();
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* synthetic */ C7837cl0(C9660tp0 c9660tp0, C7944dl0 c7944dl0) {
        this.f74075a = c9660tp0;
        if (c9660tp0.g()) {
            Do0 do0A = So0.b().a();
            Ho0 ho0A = Ko0.a(c9660tp0);
            do0A.a(ho0A, "aead", "encrypt");
            do0A.a(ho0A, "aead", "decrypt");
        }
    }
}
