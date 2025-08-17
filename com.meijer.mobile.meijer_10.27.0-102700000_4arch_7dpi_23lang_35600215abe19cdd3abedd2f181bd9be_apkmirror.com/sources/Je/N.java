package Je;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class N extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14889a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14890b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14891b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f14892c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f14893a;

        public String toString() {
            return this.f14893a;
        }

        private a(String str) {
            this.f14893a = str;
        }
    }

    public static N b(String str, a aVar) {
        return new N(str, aVar);
    }

    @Override // Ie.x
    public boolean a() {
        return this.f14890b != a.f14892c;
    }

    public String c() {
        return this.f14889a;
    }

    public a d() {
        return this.f14890b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return n10.f14889a.equals(this.f14889a) && n10.f14890b.equals(this.f14890b);
    }

    public int hashCode() {
        return Objects.hash(N.class, this.f14889a, this.f14890b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f14889a + ", variant: " + this.f14890b + ")";
    }

    private N(String str, a aVar) {
        this.f14889a = str;
        this.f14890b = aVar;
    }
}
