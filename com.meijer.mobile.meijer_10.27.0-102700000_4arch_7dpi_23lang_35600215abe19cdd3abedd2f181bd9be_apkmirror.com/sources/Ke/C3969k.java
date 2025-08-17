package Ke;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Ke.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3969k {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f16499a = new a();

    /* renamed from: Ke.k$a */
    class a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return Ve.i.f37506b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        a() {
        }
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static SecretKey c(byte[] bArr) throws GeneralSecurityException {
        Ve.r.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher d() {
        return f16499a.get();
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i10, int i11) {
        Integer numC = com.google.crypto.tink.internal.M.c();
        if (numC != null && numC.intValue() <= 19) {
            return new IvParameterSpec(bArr, i10, i11);
        }
        return new GCMParameterSpec(128, bArr, i10, i11);
    }
}
