package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ft0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8048ft0 implements InterfaceC9418sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Jn0 f74186a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f74187b;

    private final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f74186a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public static InterfaceC9418sk0 a(Zl0 zl0) throws GeneralSecurityException {
        return new C8048ft0(zl0.d().d(Bk0.a()), zl0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f74187b;
        if (bArr3.length == 0) {
            return b(bArr, bArr2);
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f74187b;
        return b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    private C8048ft0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f74186a = new Jn0(bArr);
        this.f74187b = bArr2;
    }
}
