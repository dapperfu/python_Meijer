package Oe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private final int f23607a;

    /* renamed from: b, reason: collision with root package name */
    private final c f23608b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f23609a;

        /* renamed from: b, reason: collision with root package name */
        private c f23610b;

        private b() {
            this.f23609a = null;
            this.f23610b = c.f23613d;
        }

        public e a() throws GeneralSecurityException {
            Integer num = this.f23609a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f23610b != null) {
                return new e(num.intValue(), this.f23610b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 32 && i10 != 48 && i10 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
            }
            this.f23609a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f23610b = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f23611b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f23612c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f23613d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f23614a;

        public String toString() {
            return this.f23614a;
        }

        private c(String str) {
            this.f23614a = str;
        }
    }

    private e(int i10, c cVar) {
        this.f23607a = i10;
        this.f23608b = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f23608b != c.f23613d;
    }

    public int c() {
        return this.f23607a;
    }

    public c d() {
        return this.f23608b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.c() == c() && eVar.d() == d();
    }

    public int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f23607a), this.f23608b);
    }

    public String toString() {
        return "AesSiv Parameters (variant: " + this.f23608b + ", " + this.f23607a + "-byte key)";
    }
}
