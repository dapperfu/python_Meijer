package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7712cl0 implements InterfaceC9418sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9535tp0 f73235a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (C9321rp0 c9321rp0 : this.f73235a.f(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((InterfaceC9418sk0) c9321rp0.d()).zza(bArr, bArr2);
                    c9321rp0.a();
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (C9321rp0 c9321rp02 : this.f73235a.f(C9953xk0.f79843a)) {
            try {
                byte[] bArrZza2 = ((InterfaceC9418sk0) c9321rp02.d()).zza(bArr, bArr2);
                c9321rp02.a();
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* synthetic */ C7712cl0(C9535tp0 c9535tp0, C7819dl0 c7819dl0) {
        this.f73235a = c9535tp0;
        if (c9535tp0.g()) {
            Do0 do0A = So0.b().a();
            Ho0 ho0A = Ko0.a(c9535tp0);
            do0A.a(ho0A, "aead", "encrypt");
            do0A.a(ho0A, "aead", "decrypt");
        }
    }
}
