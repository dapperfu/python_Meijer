package Ve;

import Ne.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes7.dex */
public final class n implements Te.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0342b f37522e = b.EnumC0342b.f21530b;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f37523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37524b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f37525c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37526d;

    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() throws InvalidKeyException {
            try {
                Mac macA = i.f37507c.a(n.this.f37524b);
                macA.init(n.this.f37525c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // Te.a
    public byte[] a(byte[] bArr, int i10) throws IllegalStateException, GeneralSecurityException {
        if (i10 > this.f37526d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f37523a.get().update(bArr);
        return Arrays.copyOf(this.f37523a.get().doFinal(), i10);
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f37523a = aVar;
        if (f37522e.a()) {
            this.f37524b = str;
            this.f37525c = key;
            if (key.getEncoded().length >= 16) {
                str.getClass();
                switch (str) {
                    case "HMACSHA1":
                        this.f37526d = 20;
                        break;
                    case "HMACSHA224":
                        this.f37526d = 28;
                        break;
                    case "HMACSHA256":
                        this.f37526d = 32;
                        break;
                    case "HMACSHA384":
                        this.f37526d = 48;
                        break;
                    case "HMACSHA512":
                        this.f37526d = 64;
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
