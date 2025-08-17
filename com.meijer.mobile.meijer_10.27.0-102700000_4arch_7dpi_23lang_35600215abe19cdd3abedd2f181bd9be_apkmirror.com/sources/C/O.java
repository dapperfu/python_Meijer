package C;

/* loaded from: classes.dex */
public class O {

    /* renamed from: f, reason: collision with root package name */
    public static final O f3304f = new b().b(1.0f).d(0.0f).e(0.0f).f(1.0f).c(1.0f).a();

    /* renamed from: a, reason: collision with root package name */
    private final float f3305a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3306b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3307c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3308d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3309e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f3310a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        private float f3311b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        private float f3312c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        private float f3313d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        private float f3314e = 0.0f;

        public O a() {
            return new O(this.f3310a, this.f3311b, this.f3312c, this.f3313d, this.f3314e);
        }

        public b b(float f10) {
            this.f3310a = f10;
            return this;
        }

        public b c(float f10) {
            this.f3314e = f10;
            return this;
        }

        public b d(float f10) {
            this.f3311b = f10;
            return this;
        }

        public b e(float f10) {
            this.f3312c = f10;
            return this;
        }

        public b f(float f10) {
            this.f3313d = f10;
            return this;
        }
    }

    private O(float f10, float f11, float f12, float f13, float f14) {
        this.f3305a = f10;
        this.f3306b = f11;
        this.f3307c = f12;
        this.f3308d = f13;
        this.f3309e = f14;
    }

    public float a() {
        return this.f3305a;
    }

    public float b() {
        return this.f3309e;
    }

    public float c() {
        return this.f3306b;
    }

    public float d() {
        return this.f3307c;
    }

    public float e() {
        return this.f3308d;
    }
}
