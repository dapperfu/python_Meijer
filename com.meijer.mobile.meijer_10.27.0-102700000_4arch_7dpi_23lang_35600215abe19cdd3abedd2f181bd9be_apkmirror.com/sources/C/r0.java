package C;

import android.util.Rational;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private int f3483a;

    /* renamed from: b, reason: collision with root package name */
    private Rational f3484b;

    /* renamed from: c, reason: collision with root package name */
    private int f3485c;

    /* renamed from: d, reason: collision with root package name */
    private int f3486d;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private final Rational f3488b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3489c;

        /* renamed from: a, reason: collision with root package name */
        private int f3487a = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f3490d = 0;

        public r0 a() {
            o2.i.h(this.f3488b, "The crop aspect ratio must be set.");
            return new r0(this.f3487a, this.f3488b, this.f3489c, this.f3490d);
        }

        public a b(int i10) {
            this.f3490d = i10;
            return this;
        }

        public a c(int i10) {
            this.f3487a = i10;
            return this;
        }

        public a(Rational rational, int i10) {
            this.f3488b = rational;
            this.f3489c = i10;
        }
    }

    public Rational a() {
        return this.f3484b;
    }

    public int b() {
        return this.f3486d;
    }

    public int c() {
        return this.f3485c;
    }

    public int d() {
        return this.f3483a;
    }

    r0(int i10, Rational rational, int i11, int i12) {
        this.f3483a = i10;
        this.f3484b = rational;
        this.f3485c = i11;
        this.f3486d = i12;
    }
}
