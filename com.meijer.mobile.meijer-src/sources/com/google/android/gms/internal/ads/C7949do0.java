package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.do0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7949do0 implements InterfaceC9543sk0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f74321c = C9882vt0.a("7a806c");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f74322d = C9882vt0.a("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f74323e = C9882vt0.a("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f74324f = C9882vt0.a("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f74325g = C9882vt0.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f74326h = new C7843co0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f74327a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f74328b;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = f74324f;
            cipher.init(2, new SecretKeySpec(f74323e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f74322d);
            byte[] bArr2 = f74325g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f74321c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static InterfaceC9543sk0 a(Ql0 ql0) throws GeneralSecurityException {
        return new C7949do0(ql0.d().d(Bk0.a()), ql0.c().c());
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f74326h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f74327a, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f74328b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f74328b;
        return d(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    private C7949do0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f74328b = bArr2;
        Ct0.a(bArr.length);
        this.f74327a = new SecretKeySpec(bArr, "AES");
    }
}
