package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.gt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8280gt0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9989wt0 f75255a;

    /* renamed from: b, reason: collision with root package name */
    private final Pk0 f75256b;

    /* renamed from: c, reason: collision with root package name */
    private final int f75257c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f75258d;

    private C8280gt0(InterfaceC9989wt0 interfaceC9989wt0, Pk0 pk0, int i10, byte[] bArr) {
        this.f75255a = interfaceC9989wt0;
        this.f75256b = pk0;
        this.f75257c = i10;
        this.f75258d = bArr;
    }

    public static InterfaceC9543sk0 a(C8477il0 c8477il0) throws GeneralSecurityException {
        Zs0 zs0 = new Zs0(c8477il0.d().d(Bk0.a()), c8477il0.b().d());
        String strValueOf = String.valueOf(c8477il0.b().g());
        return new C8280gt0(zs0, new Bt0(new At0("HMAC".concat(strValueOf), new SecretKeySpec(c8477il0.e().d(Bk0.a()), "HMAC")), c8477il0.b().e()), c8477il0.b().e(), c8477il0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f75258d;
        int i10 = this.f75257c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i10 + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f75258d.length, length2 - this.f75257c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.f75257c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((Bt0) this.f75256b).c(C8066et0.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.f75255a.a(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
