package Je;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class u0 extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final a f15059a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15060b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f15061c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f15062d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f15063a;

        public String toString() {
            return this.f15063a;
        }

        private a(String str) {
            this.f15063a = str;
        }
    }

    public static u0 b(a aVar) {
        return new u0(aVar);
    }

    @Override // Ie.x
    public boolean a() {
        return this.f15059a != a.f15062d;
    }

    public a c() {
        return this.f15059a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u0) && ((u0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.f15059a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f15059a + ")";
    }

    private u0(a aVar) {
        this.f15059a = aVar;
    }
}
