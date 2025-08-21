package Le;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Le.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4049z extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final int f18412a;

    /* renamed from: b, reason: collision with root package name */
    private final c f18413b;

    /* renamed from: Le.z$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f18414a;

        /* renamed from: b, reason: collision with root package name */
        private c f18415b;

        private b() {
            this.f18414a = null;
            this.f18415b = c.f18418d;
        }

        public C4049z a() throws GeneralSecurityException {
            Integer num = this.f18414a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f18415b != null) {
                return new C4049z(num.intValue(), this.f18415b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f18414a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f18415b = cVar;
            return this;
        }
    }

    /* renamed from: Le.z$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18416b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f18417c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f18418d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18419a;

        public String toString() {
            return this.f18419a;
        }

        private c(String str) {
            this.f18419a = str;
        }
    }

    private C4049z(int i10, c cVar) {
        this.f18412a = i10;
        this.f18413b = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18413b != c.f18418d;
    }

    public int c() {
        return this.f18412a;
    }

    public c d() {
        return this.f18413b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4049z)) {
            return false;
        }
        C4049z c4049z = (C4049z) obj;
        return c4049z.c() == c() && c4049z.d() == d();
    }

    public int hashCode() {
        return Objects.hash(C4049z.class, Integer.valueOf(this.f18412a), this.f18413b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f18413b + ", " + this.f18412a + "-byte key)";
    }
}
