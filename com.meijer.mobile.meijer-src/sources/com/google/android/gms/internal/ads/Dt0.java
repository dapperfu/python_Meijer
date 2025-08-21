package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Dt0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Nn0 f67133a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f67134b;

    private final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f67133a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public static InterfaceC9543sk0 a(Vm0 vm0) throws GeneralSecurityException {
        return new Dt0(vm0.d().d(Bk0.a()), vm0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f67134b;
        if (bArr3.length == 0) {
            return b(bArr, bArr2);
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f67134b;
        return b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    private Dt0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f67133a = new Nn0(bArr);
        this.f67134b = bArr2;
    }
}
