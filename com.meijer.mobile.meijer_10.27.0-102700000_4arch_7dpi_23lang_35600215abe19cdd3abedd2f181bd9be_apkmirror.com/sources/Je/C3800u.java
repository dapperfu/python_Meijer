package Je;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Je.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3800u extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final int f15047a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15048b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15049c;

    /* renamed from: d, reason: collision with root package name */
    private final c f15050d;

    /* renamed from: Je.u$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f15051a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f15052b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15053c;

        /* renamed from: d, reason: collision with root package name */
        private c f15054d;

        private b() {
            this.f15051a = null;
            this.f15052b = null;
            this.f15053c = null;
            this.f15054d = c.f15057d;
        }

        public C3800u a() throws GeneralSecurityException {
            Integer num = this.f15051a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f15054d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f15052b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f15053c != null) {
                return new C3800u(num.intValue(), this.f15052b.intValue(), this.f15053c.intValue(), this.f15054d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f15052b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f15051a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f15053c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f15054d = cVar;
            return this;
        }
    }

    /* renamed from: Je.u$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15055b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f15056c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f15057d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f15058a;

        public String toString() {
            return this.f15058a;
        }

        private c(String str) {
            this.f15058a = str;
        }
    }

    private C3800u(int i10, int i11, int i12, c cVar) {
        this.f15047a = i10;
        this.f15048b = i11;
        this.f15049c = i12;
        this.f15050d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f15050d != c.f15057d;
    }

    public int c() {
        return this.f15048b;
    }

    public int d() {
        return this.f15047a;
    }

    public int e() {
        return this.f15049c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3800u)) {
            return false;
        }
        C3800u c3800u = (C3800u) obj;
        return c3800u.d() == d() && c3800u.c() == c() && c3800u.e() == e() && c3800u.f() == f();
    }

    public c f() {
        return this.f15050d;
    }

    public int hashCode() {
        return Objects.hash(C3800u.class, Integer.valueOf(this.f15047a), Integer.valueOf(this.f15048b), Integer.valueOf(this.f15049c), this.f15050d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f15050d + ", " + this.f15048b + "-byte IV, " + this.f15049c + "-byte tag, and " + this.f15047a + "-byte key)";
    }
}
