package Xe;

import Pe.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes8.dex */
public final class n implements Ve.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0429b f42234e = b.EnumC0429b.f25765b;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f42235a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42236b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f42237c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42238d;

    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() throws InvalidKeyException {
            try {
                Mac macA = i.f42219c.a(n.this.f42236b);
                macA.init(n.this.f42237c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // Ve.a
    public byte[] a(byte[] bArr, int i10) throws IllegalStateException, GeneralSecurityException {
        if (i10 > this.f42238d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f42235a.get().update(bArr);
        return Arrays.copyOf(this.f42235a.get().doFinal(), i10);
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f42235a = aVar;
        if (f42234e.a()) {
            this.f42236b = str;
            this.f42237c = key;
            if (key.getEncoded().length >= 16) {
                str.getClass();
                switch (str) {
                    case "HMACSHA1":
                        this.f42238d = 20;
                        break;
                    case "HMACSHA224":
                        this.f42238d = 28;
                        break;
                    case "HMACSHA256":
                        this.f42238d = 32;
                        break;
                    case "HMACSHA384":
                        this.f42238d = 48;
                        break;
                    case "HMACSHA512":
                        this.f42238d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                aVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
