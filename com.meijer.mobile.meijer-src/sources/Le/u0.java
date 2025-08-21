package Le;

import java.util.Objects;

/* loaded from: classes8.dex */
public final class u0 extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final a f18396a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18397b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f18398c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f18399d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18400a;

        public String toString() {
            return this.f18400a;
        }

        private a(String str) {
            this.f18400a = str;
        }
    }

    public static u0 b(a aVar) {
        return new u0(aVar);
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18396a != a.f18399d;
    }

    public a c() {
        return this.f18396a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u0) && ((u0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.f18396a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f18396a + ")";
    }

    private u0(a aVar) {
        this.f18396a = aVar;
    }
}
