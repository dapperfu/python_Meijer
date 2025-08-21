package Te;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f36143a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36144b;

    /* renamed from: c, reason: collision with root package name */
    private final c f36145c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f36146a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f36147b;

        /* renamed from: c, reason: collision with root package name */
        private c f36148c;

        private b() {
            this.f36146a = null;
            this.f36147b = null;
            this.f36148c = c.f36152e;
        }

        public f a() throws GeneralSecurityException {
            Integer num = this.f36146a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f36147b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f36148c != null) {
                return new f(num.intValue(), this.f36147b.intValue(), this.f36148c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f36146a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f36147b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f36148c = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f36149b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f36150c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f36151d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f36152e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f36153a;

        public String toString() {
            return this.f36153a;
        }

        private c(String str) {
            this.f36153a = str;
        }
    }

    private f(int i10, int i11, c cVar) {
        this.f36143a = i10;
        this.f36144b = i11;
        this.f36145c = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f36145c != c.f36152e;
    }

    public int c() {
        return this.f36144b;
    }

    public int d() {
        return this.f36143a;
    }

    public int e() {
        c cVar = this.f36145c;
        if (cVar == c.f36152e) {
            return c();
        }
        if (cVar != c.f36149b && cVar != c.f36150c && cVar != c.f36151d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.d() == d() && fVar.e() == e() && fVar.f() == f();
    }

    public c f() {
        return this.f36145c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f36143a), Integer.valueOf(this.f36144b), this.f36145c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f36145c + ", " + this.f36144b + "-byte tags, and " + this.f36143a + "-byte key)";
    }
}
