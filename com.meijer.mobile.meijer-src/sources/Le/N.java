package Le;

import java.util.Objects;

/* loaded from: classes8.dex */
public final class N extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final String f18226a;

    /* renamed from: b, reason: collision with root package name */
    private final a f18227b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18228b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f18229c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18230a;

        public String toString() {
            return this.f18230a;
        }

        private a(String str) {
            this.f18230a = str;
        }
    }

    public static N b(String str, a aVar) {
        return new N(str, aVar);
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18227b != a.f18229c;
    }

    public String c() {
        return this.f18226a;
    }

    public a d() {
        return this.f18227b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return n10.f18226a.equals(this.f18226a) && n10.f18227b.equals(this.f18227b);
    }

    public int hashCode() {
        return Objects.hash(N.class, this.f18226a, this.f18227b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f18226a + ", variant: " + this.f18227b + ")";
    }

    private N(String str, a aVar) {
        this.f18226a = str;
        this.f18227b = aVar;
    }
}
