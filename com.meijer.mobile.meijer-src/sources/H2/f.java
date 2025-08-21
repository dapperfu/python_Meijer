package H2;

import H2.b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    double f13402a;

    /* renamed from: b, reason: collision with root package name */
    double f13403b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13404c;

    /* renamed from: d, reason: collision with root package name */
    private double f13405d;

    /* renamed from: e, reason: collision with root package name */
    private double f13406e;

    /* renamed from: f, reason: collision with root package name */
    private double f13407f;

    /* renamed from: g, reason: collision with root package name */
    private double f13408g;

    /* renamed from: h, reason: collision with root package name */
    private double f13409h;

    /* renamed from: i, reason: collision with root package name */
    private double f13410i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f13411j;

    public f() {
        this.f13402a = Math.sqrt(1500.0d);
        this.f13403b = 0.5d;
        this.f13404c = false;
        this.f13410i = Double.MAX_VALUE;
        this.f13411j = new b.p();
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f13403b = f10;
        this.f13404c = false;
        return this;
    }

    public f e(float f10) {
        this.f13410i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f13402a = Math.sqrt(f10);
        this.f13404c = false;
        return this;
    }

    private void b() {
        if (this.f13404c) {
            return;
        }
        if (this.f13410i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f13403b;
        if (d10 > 1.0d) {
            double d11 = this.f13402a;
            this.f13407f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f13403b;
            double d13 = this.f13402a;
            this.f13408g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f13409h = this.f13402a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f13404c = true;
    }

    public float a() {
        return (float) this.f13410i;
    }

    b.p h(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f13410i;
        double d14 = this.f13403b;
        if (d14 > 1.0d) {
            double d15 = this.f13408g;
            double d16 = this.f13407f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f13407f * d12) * d18);
            double d19 = this.f13408g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f13407f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f13402a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f13402a) * d12);
            double d24 = this.f13402a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f13409h;
            double d26 = this.f13402a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f13409h * d12) * d13) + (Math.sin(this.f13409h * d12) * d27));
            double d28 = this.f13402a;
            double d29 = this.f13403b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f13409h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f13409h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f13411j;
        pVar.f13395a = (float) (dPow + this.f13410i);
        pVar.f13396b = (float) dCos;
        return pVar;
    }

    public boolean c(float f10, float f11) {
        if (Math.abs(f11) < this.f13406e && Math.abs(f10 - a()) < this.f13405d) {
            return true;
        }
        return false;
    }

    void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f13405d = dAbs;
        this.f13406e = dAbs * 62.5d;
    }

    public f(float f10) {
        this.f13402a = Math.sqrt(1500.0d);
        this.f13403b = 0.5d;
        this.f13404c = false;
        this.f13410i = Double.MAX_VALUE;
        this.f13411j = new b.p();
        this.f13410i = f10;
    }
}
