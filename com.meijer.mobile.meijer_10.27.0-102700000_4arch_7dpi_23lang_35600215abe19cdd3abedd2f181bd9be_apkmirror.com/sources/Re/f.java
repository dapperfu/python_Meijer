package Re;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f32143a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32144b;

    /* renamed from: c, reason: collision with root package name */
    private final c f32145c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f32146a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f32147b;

        /* renamed from: c, reason: collision with root package name */
        private c f32148c;

        private b() {
            this.f32146a = null;
            this.f32147b = null;
            this.f32148c = c.f32152e;
        }

        public f a() throws GeneralSecurityException {
            Integer num = this.f32146a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f32147b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f32148c != null) {
                return new f(num.intValue(), this.f32147b.intValue(), this.f32148c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f32146a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f32147b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f32148c = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f32149b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f32150c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f32151d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f32152e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f32153a;

        public String toString() {
            return this.f32153a;
        }

        private c(String str) {
            this.f32153a = str;
        }
    }

    private f(int i10, int i11, c cVar) {
        this.f32143a = i10;
        this.f32144b = i11;
        this.f32145c = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f32145c != c.f32152e;
    }

    public int c() {
        return this.f32144b;
    }

    public int d() {
        return this.f32143a;
    }

    public int e() {
        c cVar = this.f32145c;
        if (cVar == c.f32152e) {
            return c();
        }
        if (cVar != c.f32149b && cVar != c.f32150c && cVar != c.f32151d) {
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
        return this.f32145c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f32143a), Integer.valueOf(this.f32144b), this.f32145c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f32145c + ", " + this.f32144b + "-byte tags, and " + this.f32143a + "-byte key)";
    }
}
