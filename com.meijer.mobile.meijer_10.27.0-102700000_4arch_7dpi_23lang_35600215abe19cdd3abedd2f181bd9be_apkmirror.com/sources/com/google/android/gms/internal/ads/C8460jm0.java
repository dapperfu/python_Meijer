package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8460jm0 implements InterfaceC9418sk0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f75515c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Set f75516d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f75517e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f75518a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9418sk0 f75519b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f75516d = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    C8460jm0(C7832ds0 c7832ds0, InterfaceC9418sk0 interfaceC9418sk0) throws GeneralSecurityException {
        if (f75516d.contains(c7832ds0.i0())) {
            this.f75518a = c7832ds0.i0();
            C7620bs0 c7620bs0C0 = C7832ds0.c0(c7832ds0);
            c7620bs0C0.u(Es0.RAW);
            Wk0.a(((C7832ds0) c7620bs0C0.p()).j());
            this.f75519b = interfaceC9418sk0;
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + c7832ds0.i0() + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 > 0 && i10 <= 4096 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                byteBufferWrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                byte[] bArrZza = this.f75519b.zza(bArr3, f75515c);
                String str = this.f75518a;
                Zt0 zt0 = Zt0.f72282b;
                return ((InterfaceC9418sk0) Uo0.a().c(Xo0.c().a(C9749vp0.a(str, Zt0.z(bArrZza, 0, bArrZza.length), Xr0.SYMMETRIC, Es0.RAW, null), Bk0.a()), InterfaceC9418sk0.class)).zza(bArr4, bArr2);
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
