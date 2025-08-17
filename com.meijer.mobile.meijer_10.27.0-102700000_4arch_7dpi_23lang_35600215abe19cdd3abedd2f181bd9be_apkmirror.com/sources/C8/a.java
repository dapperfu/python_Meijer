package C8;

import V7.e;

/* loaded from: classes4.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f3726a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3727b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3728c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3729d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f3730a;

        /* renamed from: b, reason: collision with root package name */
        private int f3731b;

        /* renamed from: c, reason: collision with root package name */
        private int f3732c;

        /* renamed from: d, reason: collision with root package name */
        private float f3733d;

        public a e() {
            return new a(this);
        }

        public b f(int i10) {
            this.f3732c = i10;
            return this;
        }

        public b g(float f10) {
            this.f3733d = f10;
            return this;
        }

        public b h(int i10) {
            this.f3731b = i10;
            return this;
        }

        public b i(int i10) {
            this.f3730a = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3726a == aVar.f3726a && this.f3727b == aVar.f3727b && this.f3728c == aVar.f3728c && Float.compare(aVar.f3729d, this.f3729d) == 0) {
                return true;
            }
        }
        return false;
    }

    private a(b bVar) {
        this.f3726a = bVar.f3730a;
        this.f3727b = bVar.f3731b;
        this.f3729d = bVar.f3733d;
        this.f3728c = bVar.f3732c;
    }

    @Override // V7.e
    public int a() {
        return this.f3727b;
    }

    @Override // V7.e
    public int b() {
        return this.f3726a;
    }

    public int c() {
        return this.f3728c;
    }

    public float d() {
        return this.f3729d;
    }

    public int hashCode() {
        int i10 = ((((this.f3726a * 31) + this.f3727b) * 31) + this.f3728c) * 31;
        float f10 = this.f3729d;
        return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public String toString() {
        return "ActivityMetrics{screenWidth=" + this.f3726a + ", screenHeight=" + this.f3727b + ", screenDensityDpi=" + this.f3728c + ", screenDensityFactor=" + this.f3729d + '}';
    }
}
