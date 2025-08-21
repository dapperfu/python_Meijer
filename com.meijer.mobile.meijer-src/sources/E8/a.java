package E8;

import X7.e;

/* loaded from: classes4.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f7038a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7039b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7040c;

    /* renamed from: d, reason: collision with root package name */
    private final float f7041d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f7042a;

        /* renamed from: b, reason: collision with root package name */
        private int f7043b;

        /* renamed from: c, reason: collision with root package name */
        private int f7044c;

        /* renamed from: d, reason: collision with root package name */
        private float f7045d;

        public a e() {
            return new a(this);
        }

        public b f(int i10) {
            this.f7044c = i10;
            return this;
        }

        public b g(float f10) {
            this.f7045d = f10;
            return this;
        }

        public b h(int i10) {
            this.f7043b = i10;
            return this;
        }

        public b i(int i10) {
            this.f7042a = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7038a == aVar.f7038a && this.f7039b == aVar.f7039b && this.f7040c == aVar.f7040c && Float.compare(aVar.f7041d, this.f7041d) == 0) {
                return true;
            }
        }
        return false;
    }

    private a(b bVar) {
        this.f7038a = bVar.f7042a;
        this.f7039b = bVar.f7043b;
        this.f7041d = bVar.f7045d;
        this.f7040c = bVar.f7044c;
    }

    @Override // X7.e
    public int a() {
        return this.f7039b;
    }

    @Override // X7.e
    public int b() {
        return this.f7038a;
    }

    public int c() {
        return this.f7040c;
    }

    public float d() {
        return this.f7041d;
    }

    public int hashCode() {
        int i10 = ((((this.f7038a * 31) + this.f7039b) * 31) + this.f7040c) * 31;
        float f10 = this.f7041d;
        return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public String toString() {
        return "ActivityMetrics{screenWidth=" + this.f7038a + ", screenHeight=" + this.f7039b + ", screenDensityDpi=" + this.f7040c + ", screenDensityFactor=" + this.f7041d + '}';
    }
}
