package C;

/* loaded from: classes.dex */
public class O {

    /* renamed from: f, reason: collision with root package name */
    public static final O f3762f = new b().b(1.0f).d(0.0f).e(0.0f).f(1.0f).c(1.0f).a();

    /* renamed from: a, reason: collision with root package name */
    private final float f3763a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3764b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3765c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3766d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3767e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f3768a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        private float f3769b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        private float f3770c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        private float f3771d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        private float f3772e = 0.0f;

        public O a() {
            return new O(this.f3768a, this.f3769b, this.f3770c, this.f3771d, this.f3772e);
        }

        public b b(float f10) {
            this.f3768a = f10;
            return this;
        }

        public b c(float f10) {
            this.f3772e = f10;
            return this;
        }

        public b d(float f10) {
            this.f3769b = f10;
            return this;
        }

        public b e(float f10) {
            this.f3770c = f10;
            return this;
        }

        public b f(float f10) {
            this.f3771d = f10;
            return this;
        }
    }

    private O(float f10, float f11, float f12, float f13, float f14) {
        this.f3763a = f10;
        this.f3764b = f11;
        this.f3765c = f12;
        this.f3766d = f13;
        this.f3767e = f14;
    }

    public float a() {
        return this.f3763a;
    }

    public float b() {
        return this.f3767e;
    }

    public float c() {
        return this.f3764b;
    }

    public float d() {
        return this.f3765c;
    }

    public float e() {
        return this.f3766d;
    }
}
