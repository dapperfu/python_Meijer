package Je;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Je.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3791k extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final int f14960a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14961b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14962c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14963d;

    /* renamed from: e, reason: collision with root package name */
    private final d f14964e;

    /* renamed from: f, reason: collision with root package name */
    private final c f14965f;

    /* renamed from: Je.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f14966a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f14967b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f14968c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f14969d;

        /* renamed from: e, reason: collision with root package name */
        private c f14970e;

        /* renamed from: f, reason: collision with root package name */
        private d f14971f;

        private b() {
            this.f14966a = null;
            this.f14967b = null;
            this.f14968c = null;
            this.f14969d = null;
            this.f14970e = null;
            this.f14971f = d.f14980d;
        }

        private static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.f14972b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f14973c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f14974d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f14975e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f14976f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public C3791k a() throws GeneralSecurityException {
            if (this.f14966a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f14967b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f14968c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f14969d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f14970e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f14971f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f14970e);
            return new C3791k(this.f14966a.intValue(), this.f14967b.intValue(), this.f14968c.intValue(), this.f14969d.intValue(), this.f14971f, this.f14970e);
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f14966a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f14970e = cVar;
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.f14967b = Integer.valueOf(i10);
            return this;
        }

        public b e(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f14968c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f14969d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f14971f = dVar;
            return this;
        }
    }

    /* renamed from: Je.k$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f14972b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f14973c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f14974d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f14975e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f14976f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f14977a;

        public String toString() {
            return this.f14977a;
        }

        private c(String str) {
            this.f14977a = str;
        }
    }

    /* renamed from: Je.k$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14978b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f14979c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f14980d = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f14981a;

        public String toString() {
            return this.f14981a;
        }

        private d(String str) {
            this.f14981a = str;
        }
    }

    private C3791k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f14960a = i10;
        this.f14961b = i11;
        this.f14962c = i12;
        this.f14963d = i13;
        this.f14964e = dVar;
        this.f14965f = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f14964e != d.f14980d;
    }

    public int c() {
        return this.f14960a;
    }

    public c d() {
        return this.f14965f;
    }

    public int e() {
        return this.f14961b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3791k)) {
            return false;
        }
        C3791k c3791k = (C3791k) obj;
        return c3791k.c() == c() && c3791k.e() == e() && c3791k.f() == f() && c3791k.g() == g() && c3791k.h() == h() && c3791k.d() == d();
    }

    public int f() {
        return this.f14962c;
    }

    public int g() {
        return this.f14963d;
    }

    public d h() {
        return this.f14964e;
    }

    public int hashCode() {
        return Objects.hash(C3791k.class, Integer.valueOf(this.f14960a), Integer.valueOf(this.f14961b), Integer.valueOf(this.f14962c), Integer.valueOf(this.f14963d), this.f14964e, this.f14965f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f14964e + ", hashType: " + this.f14965f + ", " + this.f14962c + "-byte IV, and " + this.f14963d + "-byte tags, and " + this.f14960a + "-byte AES key, and " + this.f14961b + "-byte HMAC key)";
    }
}
