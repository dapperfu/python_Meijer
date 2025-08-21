package C;

import android.util.Rational;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private int f3941a;

    /* renamed from: b, reason: collision with root package name */
    private Rational f3942b;

    /* renamed from: c, reason: collision with root package name */
    private int f3943c;

    /* renamed from: d, reason: collision with root package name */
    private int f3944d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private final Rational f3946b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3947c;

        /* renamed from: a, reason: collision with root package name */
        private int f3945a = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f3948d = 0;

        public r0 a() {
            o2.i.h(this.f3946b, "The crop aspect ratio must be set.");
            return new r0(this.f3945a, this.f3946b, this.f3947c, this.f3948d);
        }

        public a b(int i10) {
            this.f3948d = i10;
            return this;
        }

        public a c(int i10) {
            this.f3945a = i10;
            return this;
        }

        public a(Rational rational, int i10) {
            this.f3946b = rational;
            this.f3947c = i10;
        }
    }

    public Rational a() {
        return this.f3942b;
    }

    public int b() {
        return this.f3944d;
    }

    public int c() {
        return this.f3943c;
    }

    public int d() {
        return this.f3941a;
    }

    r0(int i10, Rational rational, int i11, int i12) {
        this.f3941a = i10;
        this.f3942b = rational;
        this.f3943c = i11;
        this.f3944d = i12;
    }
}
