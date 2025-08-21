package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8585jm0 implements InterfaceC9543sk0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f76355c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Set f76356d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f76357e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f76358a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9543sk0 f76359b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f76356d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    C8585jm0(C7957ds0 c7957ds0, InterfaceC9543sk0 interfaceC9543sk0) throws GeneralSecurityException {
        if (f76356d.contains(c7957ds0.i0())) {
            this.f76358a = c7957ds0.i0();
            C7745bs0 c7745bs0C0 = C7957ds0.c0(c7957ds0);
            c7745bs0C0.u(Es0.RAW);
            Wk0.a(((C7957ds0) c7745bs0C0.p()).j());
            this.f76359b = interfaceC9543sk0;
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + c7957ds0.i0() + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 > 0 && i10 <= 4096 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                byteBufferWrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                byte[] bArrZza = this.f76359b.zza(bArr3, f76355c);
                String str = this.f76358a;
                Zt0 zt0 = Zt0.f73122b;
                return ((InterfaceC9543sk0) Uo0.a().c(Xo0.c().a(C9874vp0.a(str, Zt0.z(bArrZza, 0, bArrZza.length), Xr0.SYMMETRIC, Es0.RAW, null), Bk0.a()), InterfaceC9543sk0.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
