package Je;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Je.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3796p extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final int f15010a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15011b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15012c;

    /* renamed from: d, reason: collision with root package name */
    private final c f15013d;

    /* renamed from: Je.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f15014a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f15015b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15016c;

        /* renamed from: d, reason: collision with root package name */
        private c f15017d;

        private b() {
            this.f15014a = null;
            this.f15015b = null;
            this.f15016c = null;
            this.f15017d = c.f15020d;
        }

        public C3796p a() throws GeneralSecurityException {
            Integer num = this.f15014a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f15015b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f15017d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f15016c != null) {
                return new C3796p(num.intValue(), this.f15015b.intValue(), this.f15016c.intValue(), this.f15017d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f15015b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f15014a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f15016c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f15017d = cVar;
            return this;
        }
    }

    /* renamed from: Je.p$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15018b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f15019c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f15020d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f15021a;

        public String toString() {
            return this.f15021a;
        }

        private c(String str) {
            this.f15021a = str;
        }
    }

    private C3796p(int i10, int i11, int i12, c cVar) {
        this.f15010a = i10;
        this.f15011b = i11;
        this.f15012c = i12;
        this.f15013d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f15013d != c.f15020d;
    }

    public int c() {
        return this.f15011b;
    }

    public int d() {
        return this.f15010a;
    }

    public int e() {
        return this.f15012c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3796p)) {
            return false;
        }
        C3796p c3796p = (C3796p) obj;
        return c3796p.d() == d() && c3796p.c() == c() && c3796p.e() == e() && c3796p.f() == f();
    }

    public c f() {
        return this.f15013d;
    }

    public int hashCode() {
        return Objects.hash(C3796p.class, Integer.valueOf(this.f15010a), Integer.valueOf(this.f15011b), Integer.valueOf(this.f15012c), this.f15013d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f15013d + ", " + this.f15011b + "-byte IV, " + this.f15012c + "-byte tag, and " + this.f15010a + "-byte key)";
    }
}
