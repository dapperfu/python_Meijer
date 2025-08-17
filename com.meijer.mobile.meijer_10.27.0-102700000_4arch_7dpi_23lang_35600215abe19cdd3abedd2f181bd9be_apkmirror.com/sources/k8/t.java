package k8;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    static final t f141757c = a().c();

    /* renamed from: a, reason: collision with root package name */
    private final int f141758a;

    /* renamed from: b, reason: collision with root package name */
    private final int f141759b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f141760a = 360;

        /* renamed from: b, reason: collision with root package name */
        private int f141761b = 600;

        public t c() {
            return new t(this);
        }

        public b d(int i10) {
            this.f141761b = i10;
            return this;
        }

        public b e(int i10) {
            this.f141760a = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f141758a == tVar.f141758a && this.f141759b == tVar.f141759b) {
                return true;
            }
        }
        return false;
    }

    private t(b bVar) {
        this.f141758a = bVar.f141760a;
        this.f141759b = bVar.f141761b;
    }

    public static b a() {
        return new b();
    }

    public long b() {
        return this.f141759b * 1000;
    }

    public long c() {
        return this.f141759b;
    }

    public long d() {
        return this.f141758a;
    }

    public long e() {
        return this.f141758a * 60 * 1000;
    }

    public int hashCode() {
        return (this.f141758a * 31) + this.f141759b;
    }

    public String toString() {
        return "SessionSplitConfiguration{maxSessionDuration=" + this.f141758a + ", inactivityTimeout=" + this.f141759b + '}';
    }
}
