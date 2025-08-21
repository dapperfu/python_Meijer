package Le;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Le.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4044u extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final int f18384a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18385b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18386c;

    /* renamed from: d, reason: collision with root package name */
    private final c f18387d;

    /* renamed from: Le.u$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f18388a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f18389b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18390c;

        /* renamed from: d, reason: collision with root package name */
        private c f18391d;

        private b() {
            this.f18388a = null;
            this.f18389b = null;
            this.f18390c = null;
            this.f18391d = c.f18394d;
        }

        public C4044u a() throws GeneralSecurityException {
            Integer num = this.f18388a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f18391d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f18389b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f18390c != null) {
                return new C4044u(num.intValue(), this.f18389b.intValue(), this.f18390c.intValue(), this.f18391d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f18389b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f18388a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f18390c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f18391d = cVar;
            return this;
        }
    }

    /* renamed from: Le.u$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18392b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f18393c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f18394d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18395a;

        public String toString() {
            return this.f18395a;
        }

        private c(String str) {
            this.f18395a = str;
        }
    }

    private C4044u(int i10, int i11, int i12, c cVar) {
        this.f18384a = i10;
        this.f18385b = i11;
        this.f18386c = i12;
        this.f18387d = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18387d != c.f18394d;
    }

    public int c() {
        return this.f18385b;
    }

    public int d() {
        return this.f18384a;
    }

    public int e() {
        return this.f18386c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4044u)) {
            return false;
        }
        C4044u c4044u = (C4044u) obj;
        return c4044u.d() == d() && c4044u.c() == c() && c4044u.e() == e() && c4044u.f() == f();
    }

    public c f() {
        return this.f18387d;
    }

    public int hashCode() {
        return Objects.hash(C4044u.class, Integer.valueOf(this.f18384a), Integer.valueOf(this.f18385b), Integer.valueOf(this.f18386c), this.f18387d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f18387d + ", " + this.f18385b + "-byte IV, " + this.f18386c + "-byte tag, and " + this.f18384a + "-byte key)";
    }
}
