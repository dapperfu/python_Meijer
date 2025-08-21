package Ne;

import Ke.InterfaceC3886a;
import Le.C4045v;
import Xe.f;
import Xe.i;
import Xe.k;
import Xe.p;
import Xe.r;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class a implements InterfaceC3886a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f20885c = k.a("7a806c");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f20886d = k.a("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f20887e = k.a("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f20888f = k.a("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f20889g = k.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f20890h = new C0364a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f20891a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f20892b;

    /* renamed from: Ne.a$a, reason: collision with other inner class name */
    class C0364a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherA = i.f42218b.a("AES/GCM-SIV/NoPadding");
                if (a.h(cipherA)) {
                    return cipherA;
                }
                return null;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        C0364a() {
        }
    }

    private static AlgorithmParameterSpec f(byte[] bArr) throws GeneralSecurityException {
        return g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            cipher.init(2, new SecretKeySpec(f20887e, "AES"), f(f20888f));
            cipher.updateAAD(f20886d);
            byte[] bArr = f20889g;
            return f.b(cipher.doFinal(bArr, 0, bArr.length), f20885c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static InterfaceC3886a d(C4045v c4045v) throws GeneralSecurityException {
        return new a(c4045v.f().d(Ke.i.a()), c4045v.b().d());
    }

    private Cipher e() throws GeneralSecurityException {
        Cipher cipher = f20890h.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    private static AlgorithmParameterSpec g(byte[] bArr, int i10, int i11) throws GeneralSecurityException {
        return new GCMParameterSpec(128, bArr, i10, i11);
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f20892b;
        if (bArr3.length == 0) {
            return i(bArr, bArr2);
        }
        if (M.e(bArr3, bArr)) {
            return i(Arrays.copyOfRange(bArr, this.f20892b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    private a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f20892b = bArr2;
        r.a(bArr.length);
        this.f20891a = new SecretKeySpec(bArr, "AES");
    }

    private byte[] i(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherE = e();
        if (bArr.length >= 28) {
            cipherE.init(2, this.f20891a, g(bArr, 0, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipherE.updateAAD(bArr2);
            }
            return cipherE.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private byte[] j(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherE = e();
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] bArrA = p.a(12);
            System.arraycopy(bArrA, 0, bArr3, 0, 12);
            cipherE.init(1, this.f20891a, f(bArrA));
            if (bArr2 != null && bArr2.length != 0) {
                cipherE.updateAAD(bArr2);
            }
            int iDoFinal = cipherE.doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (iDoFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrJ = j(bArr, bArr2);
        byte[] bArr3 = this.f20892b;
        if (bArr3.length == 0) {
            return bArrJ;
        }
        return f.a(bArr3, bArrJ);
    }
}
