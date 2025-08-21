package Le;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Le.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4040p extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final int f18347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18348b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18349c;

    /* renamed from: d, reason: collision with root package name */
    private final c f18350d;

    /* renamed from: Le.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f18351a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f18352b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18353c;

        /* renamed from: d, reason: collision with root package name */
        private c f18354d;

        private b() {
            this.f18351a = null;
            this.f18352b = null;
            this.f18353c = null;
            this.f18354d = c.f18357d;
        }

        public C4040p a() throws GeneralSecurityException {
            Integer num = this.f18351a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f18352b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f18354d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f18353c != null) {
                return new C4040p(num.intValue(), this.f18352b.intValue(), this.f18353c.intValue(), this.f18354d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f18352b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f18351a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f18353c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f18354d = cVar;
            return this;
        }
    }

    /* renamed from: Le.p$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18355b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f18356c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f18357d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18358a;

        public String toString() {
            return this.f18358a;
        }

        private c(String str) {
            this.f18358a = str;
        }
    }

    private C4040p(int i10, int i11, int i12, c cVar) {
        this.f18347a = i10;
        this.f18348b = i11;
        this.f18349c = i12;
        this.f18350d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18350d != c.f18357d;
    }

    public int c() {
        return this.f18348b;
    }

    public int d() {
        return this.f18347a;
    }

    public int e() {
        return this.f18349c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4040p)) {
            return false;
        }
        C4040p c4040p = (C4040p) obj;
        return c4040p.d() == d() && c4040p.c() == c() && c4040p.e() == e() && c4040p.f() == f();
    }

    public c f() {
        return this.f18350d;
    }

    public int hashCode() {
        return Objects.hash(C4040p.class, Integer.valueOf(this.f18347a), Integer.valueOf(this.f18348b), Integer.valueOf(this.f18349c), this.f18350d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f18350d + ", " + this.f18348b + "-byte IV, " + this.f18349c + "-byte tag, and " + this.f18347a + "-byte key)";
    }
}
