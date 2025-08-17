package Re;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f32170a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32171b;

    /* renamed from: c, reason: collision with root package name */
    private final d f32172c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32173d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f32174a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f32175b;

        /* renamed from: c, reason: collision with root package name */
        private c f32176c;

        /* renamed from: d, reason: collision with root package name */
        private d f32177d;

        private b() {
            this.f32174a = null;
            this.f32175b = null;
            this.f32176c = null;
            this.f32177d = d.f32187e;
        }

        private static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f32178b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f32179c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f32180d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f32181e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f32182f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public n a() throws GeneralSecurityException {
            Integer num = this.f32174a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f32175b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f32176c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f32177d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f32174a));
            }
            f(this.f32175b.intValue(), this.f32176c);
            return new n(this.f32174a.intValue(), this.f32175b.intValue(), this.f32177d, this.f32176c);
        }

        public b b(c cVar) {
            this.f32176c = cVar;
            return this;
        }

        public b e(d dVar) {
            this.f32177d = dVar;
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            this.f32174a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            this.f32175b = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f32178b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f32179c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f32180d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f32181e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f32182f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f32183a;

        public String toString() {
            return this.f32183a;
        }

        private c(String str) {
            this.f32183a = str;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f32184b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f32185c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f32186d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f32187e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f32188a;

        public String toString() {
            return this.f32188a;
        }

        private d(String str) {
            this.f32188a = str;
        }
    }

    private n(int i10, int i11, d dVar, c cVar) {
        this.f32170a = i10;
        this.f32171b = i11;
        this.f32172c = dVar;
        this.f32173d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f32172c != d.f32187e;
    }

    public int c() {
        return this.f32171b;
    }

    public c d() {
        return this.f32173d;
    }

    public int e() {
        return this.f32170a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.e() == e() && nVar.f() == f() && nVar.g() == g() && nVar.d() == d();
    }

    public int f() {
        d dVar = this.f32172c;
        if (dVar == d.f32187e) {
            return c();
        }
        if (dVar != d.f32184b && dVar != d.f32185c && dVar != d.f32186d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f32172c;
    }

    public int hashCode() {
        return Objects.hash(n.class, Integer.valueOf(this.f32170a), Integer.valueOf(this.f32171b), this.f32172c, this.f32173d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f32172c + ", hashType: " + this.f32173d + ", " + this.f32171b + "-byte tags, and " + this.f32170a + "-byte key)";
    }
}
