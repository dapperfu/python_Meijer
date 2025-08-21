package m8;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    static final t f150903c = a().c();

    /* renamed from: a, reason: collision with root package name */
    private final int f150904a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150905b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f150906a = 360;

        /* renamed from: b, reason: collision with root package name */
        private int f150907b = 600;

        public t c() {
            return new t(this);
        }

        public b d(int i10) {
            this.f150907b = i10;
            return this;
        }

        public b e(int i10) {
            this.f150906a = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f150904a == tVar.f150904a && this.f150905b == tVar.f150905b) {
                return true;
            }
        }
        return false;
    }

    private t(b bVar) {
        this.f150904a = bVar.f150906a;
        this.f150905b = bVar.f150907b;
    }

    public static b a() {
        return new b();
    }

    public long b() {
        return this.f150905b * 1000;
    }

    public long c() {
        return this.f150905b;
    }

    public long d() {
        return this.f150904a;
    }

    public long e() {
        return this.f150904a * 60 * 1000;
    }

    public int hashCode() {
        return (this.f150904a * 31) + this.f150905b;
    }

    public String toString() {
        return "SessionSplitConfiguration{maxSessionDuration=" + this.f150904a + ", inactivityTimeout=" + this.f150905b + '}';
    }
}
