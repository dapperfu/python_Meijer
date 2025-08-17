package Je;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class E extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final a f14870a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14871b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f14872c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f14873d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f14874a;

        public String toString() {
            return this.f14874a;
        }

        private a(String str) {
            this.f14874a = str;
        }
    }

    public static E b(a aVar) {
        return new E(aVar);
    }

    @Override // Ie.x
    public boolean a() {
        return this.f14870a != a.f14873d;
    }

    public a c() {
        return this.f14870a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(E.class, this.f14870a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f14870a + ")";
    }

    private E(a aVar) {
        this.f14870a = aVar;
    }
}
