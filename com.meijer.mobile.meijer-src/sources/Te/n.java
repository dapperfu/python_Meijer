package Te;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f36170a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36171b;

    /* renamed from: c, reason: collision with root package name */
    private final d f36172c;

    /* renamed from: d, reason: collision with root package name */
    private final c f36173d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f36174a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f36175b;

        /* renamed from: c, reason: collision with root package name */
        private c f36176c;

        /* renamed from: d, reason: collision with root package name */
        private d f36177d;

        private b() {
            this.f36174a = null;
            this.f36175b = null;
            this.f36176c = null;
            this.f36177d = d.f36187e;
        }

        private static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f36178b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f36179c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f36180d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f36181e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f36182f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public n a() throws GeneralSecurityException {
            Integer num = this.f36174a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f36175b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f36176c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f36177d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f36174a));
            }
            f(this.f36175b.intValue(), this.f36176c);
            return new n(this.f36174a.intValue(), this.f36175b.intValue(), this.f36177d, this.f36176c);
        }

        public b b(c cVar) {
            this.f36176c = cVar;
            return this;
        }

        public b e(d dVar) {
            this.f36177d = dVar;
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            this.f36174a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            this.f36175b = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36178b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f36179c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f36180d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f36181e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f36182f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f36183a;

        public String toString() {
            return this.f36183a;
        }

        private c(String str) {
            this.f36183a = str;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f36184b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f36185c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f36186d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f36187e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f36188a;

        public String toString() {
            return this.f36188a;
        }

        private d(String str) {
            this.f36188a = str;
        }
    }

    private n(int i10, int i11, d dVar, c cVar) {
        this.f36170a = i10;
        this.f36171b = i11;
        this.f36172c = dVar;
        this.f36173d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f36172c != d.f36187e;
    }

    public int c() {
        return this.f36171b;
    }

    public c d() {
        return this.f36173d;
    }

    public int e() {
        return this.f36170a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.e() == e() && nVar.f() == f() && nVar.g() == g() && nVar.d() == d();
    }

    public int f() {
        d dVar = this.f36172c;
        if (dVar == d.f36187e) {
            return c();
        }
        if (dVar != d.f36184b && dVar != d.f36185c && dVar != d.f36186d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f36172c;
    }

    public int hashCode() {
        return Objects.hash(n.class, Integer.valueOf(this.f36170a), Integer.valueOf(this.f36171b), this.f36172c, this.f36173d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f36172c + ", hashType: " + this.f36173d + ", " + this.f36171b + "-byte tags, and " + this.f36170a + "-byte key)";
    }
}
