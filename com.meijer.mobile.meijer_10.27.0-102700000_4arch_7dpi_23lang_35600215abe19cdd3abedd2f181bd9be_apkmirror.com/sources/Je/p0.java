package Je;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class p0 extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final a f15022a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15023b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15024b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f15025c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f15026a;

        public String toString() {
            return this.f15026a;
        }

        private a(String str) {
            this.f15026a = str;
        }
    }

    public static p0 b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new p0(aVar, i10);
    }

    @Override // Ie.x
    public boolean a() {
        return this.f15022a != a.f15025c;
    }

    public int c() {
        return this.f15023b;
    }

    public a d() {
        return this.f15022a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.d() == d() && p0Var.c() == c();
    }

    public int hashCode() {
        return Objects.hash(p0.class, this.f15022a, Integer.valueOf(this.f15023b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f15022a + "salt_size_bytes: " + this.f15023b + ")";
    }

    private p0(a aVar, int i10) {
        this.f15022a = aVar;
        this.f15023b = i10;
    }
}
