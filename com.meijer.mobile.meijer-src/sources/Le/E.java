package Le;

import java.util.Objects;

/* loaded from: classes8.dex */
public final class E extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final a f18207a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18208b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f18209c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f18210d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18211a;

        public String toString() {
            return this.f18211a;
        }

        private a(String str) {
            this.f18211a = str;
        }
    }

    public static E b(a aVar) {
        return new E(aVar);
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18207a != a.f18210d;
    }

    public a c() {
        return this.f18207a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(E.class, this.f18207a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f18207a + ")";
    }

    private E(a aVar) {
        this.f18207a = aVar;
    }
}
