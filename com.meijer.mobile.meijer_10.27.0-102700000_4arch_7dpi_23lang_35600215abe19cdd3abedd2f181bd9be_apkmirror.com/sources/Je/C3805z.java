package Je;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: Je.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3805z extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final int f15075a;

    /* renamed from: b, reason: collision with root package name */
    private final c f15076b;

    /* renamed from: Je.z$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f15077a;

        /* renamed from: b, reason: collision with root package name */
        private c f15078b;

        private b() {
            this.f15077a = null;
            this.f15078b = c.f15081d;
        }

        public C3805z a() throws GeneralSecurityException {
            Integer num = this.f15077a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f15078b != null) {
                return new C3805z(num.intValue(), this.f15078b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f15077a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f15078b = cVar;
            return this;
        }
    }

    /* renamed from: Je.z$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15079b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f15080c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f15081d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f15082a;

        public String toString() {
            return this.f15082a;
        }

        private c(String str) {
            this.f15082a = str;
        }
    }

    private C3805z(int i10, c cVar) {
        this.f15075a = i10;
        this.f15076b = cVar;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f15076b != c.f15081d;
    }

    public int c() {
        return this.f15075a;
    }

    public c d() {
        return this.f15076b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3805z)) {
            return false;
        }
        C3805z c3805z = (C3805z) obj;
        return c3805z.c() == c() && c3805z.d() == d();
    }

    public int hashCode() {
        return Objects.hash(C3805z.class, Integer.valueOf(this.f15075a), this.f15076b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f15076b + ", " + this.f15075a + "-byte key)";
    }
}
