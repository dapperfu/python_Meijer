package Qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private final int f28095a;

    /* renamed from: b, reason: collision with root package name */
    private final c f28096b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f28097a;

        /* renamed from: b, reason: collision with root package name */
        private c f28098b;

        private b() {
            this.f28097a = null;
            this.f28098b = c.f28101d;
        }

        public e a() throws GeneralSecurityException {
            Integer num = this.f28097a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f28098b != null) {
                return new e(num.intValue(), this.f28098b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 32 && i10 != 48 && i10 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
            }
            this.f28097a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f28098b = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f28099b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f28100c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f28101d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f28102a;

        public String toString() {
            return this.f28102a;
        }

        private c(String str) {
            this.f28102a = str;
        }
    }

    private e(int i10, c cVar) {
        this.f28095a = i10;
        this.f28096b = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f28096b != c.f28101d;
    }

    public int c() {
        return this.f28095a;
    }

    public c d() {
        return this.f28096b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.c() == c() && eVar.d() == d();
    }

    public int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f28095a), this.f28096b);
    }

    public String toString() {
        return "AesSiv Parameters (variant: " + this.f28096b + ", " + this.f28095a + "-byte key)";
    }
}
