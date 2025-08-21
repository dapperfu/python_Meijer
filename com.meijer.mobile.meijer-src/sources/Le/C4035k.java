package Le;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Le.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4035k extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final int f18297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18298b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18299c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18300d;

    /* renamed from: e, reason: collision with root package name */
    private final d f18301e;

    /* renamed from: f, reason: collision with root package name */
    private final c f18302f;

    /* renamed from: Le.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f18303a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f18304b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18305c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f18306d;

        /* renamed from: e, reason: collision with root package name */
        private c f18307e;

        /* renamed from: f, reason: collision with root package name */
        private d f18308f;

        private b() {
            this.f18303a = null;
            this.f18304b = null;
            this.f18305c = null;
            this.f18306d = null;
            this.f18307e = null;
            this.f18308f = d.f18317d;
        }

        private static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.f18309b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f18310c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f18311d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f18312e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f18313f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public C4035k a() throws GeneralSecurityException {
            if (this.f18303a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f18304b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f18305c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f18306d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f18307e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f18308f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f18307e);
            return new C4035k(this.f18303a.intValue(), this.f18304b.intValue(), this.f18305c.intValue(), this.f18306d.intValue(), this.f18308f, this.f18307e);
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f18303a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f18307e = cVar;
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.f18304b = Integer.valueOf(i10);
            return this;
        }

        public b e(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f18305c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f18306d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f18308f = dVar;
            return this;
        }
    }

    /* renamed from: Le.k$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18309b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f18310c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f18311d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f18312e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f18313f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f18314a;

        public String toString() {
            return this.f18314a;
        }

        private c(String str) {
            this.f18314a = str;
        }
    }

    /* renamed from: Le.k$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f18315b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f18316c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f18317d = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18318a;

        public String toString() {
            return this.f18318a;
        }

        private d(String str) {
            this.f18318a = str;
        }
    }

    private C4035k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f18297a = i10;
        this.f18298b = i11;
        this.f18299c = i12;
        this.f18300d = i13;
        this.f18301e = dVar;
        this.f18302f = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18301e != d.f18317d;
    }

    public int c() {
        return this.f18297a;
    }

    public c d() {
        return this.f18302f;
    }

    public int e() {
        return this.f18298b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4035k)) {
            return false;
        }
        C4035k c4035k = (C4035k) obj;
        return c4035k.c() == c() && c4035k.e() == e() && c4035k.f() == f() && c4035k.g() == g() && c4035k.h() == h() && c4035k.d() == d();
    }

    public int f() {
        return this.f18299c;
    }

    public int g() {
        return this.f18300d;
    }

    public d h() {
        return this.f18301e;
    }

    public int hashCode() {
        return Objects.hash(C4035k.class, Integer.valueOf(this.f18297a), Integer.valueOf(this.f18298b), Integer.valueOf(this.f18299c), Integer.valueOf(this.f18300d), this.f18301e, this.f18302f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f18301e + ", hashType: " + this.f18302f + ", " + this.f18299c + "-byte IV, and " + this.f18300d + "-byte tags, and " + this.f18297a + "-byte AES key, and " + this.f18298b + "-byte HMAC key)";
    }
}
