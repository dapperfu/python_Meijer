package H2;

import H2.b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    double f12070a;

    /* renamed from: b, reason: collision with root package name */
    double f12071b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12072c;

    /* renamed from: d, reason: collision with root package name */
    private double f12073d;

    /* renamed from: e, reason: collision with root package name */
    private double f12074e;

    /* renamed from: f, reason: collision with root package name */
    private double f12075f;

    /* renamed from: g, reason: collision with root package name */
    private double f12076g;

    /* renamed from: h, reason: collision with root package name */
    private double f12077h;

    /* renamed from: i, reason: collision with root package name */
    private double f12078i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f12079j;

    public f() {
        this.f12070a = Math.sqrt(1500.0d);
        this.f12071b = 0.5d;
        this.f12072c = false;
        this.f12078i = Double.MAX_VALUE;
        this.f12079j = new b.p();
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f12071b = f10;
        this.f12072c = false;
        return this;
    }

    public f e(float f10) {
        this.f12078i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f12070a = Math.sqrt(f10);
        this.f12072c = false;
        return this;
    }

    private void b() {
        if (this.f12072c) {
            return;
        }
        if (this.f12078i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f12071b;
        if (d10 > 1.0d) {
            double d11 = this.f12070a;
            this.f12075f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f12071b;
            double d13 = this.f12070a;
            this.f12076g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f12077h = this.f12070a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f12072c = true;
    }

    public float a() {
        return (float) this.f12078i;
    }

    b.p h(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f12078i;
        double d14 = this.f12071b;
        if (d14 > 1.0d) {
            double d15 = this.f12076g;
            double d16 = this.f12075f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f12075f * d12) * d18);
            double d19 = this.f12076g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f12075f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f12070a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f12070a) * d12);
            double d24 = this.f12070a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f12077h;
            double d26 = this.f12070a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f12077h * d12) * d13) + (Math.sin(this.f12077h * d12) * d27));
            double d28 = this.f12070a;
            double d29 = this.f12071b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f12077h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f12077h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f12079j;
        pVar.f12063a = (float) (dPow + this.f12078i);
        pVar.f12064b = (float) dCos;
        return pVar;
    }

    public boolean c(float f10, float f11) {
        if (Math.abs(f11) < this.f12074e && Math.abs(f10 - a()) < this.f12073d) {
            return true;
        }
        return false;
    }

    void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f12073d = dAbs;
        this.f12074e = dAbs * 62.5d;
    }

    public f(float f10) {
        this.f12070a = Math.sqrt(1500.0d);
        this.f12071b = 0.5d;
        this.f12072c = false;
        this.f12078i = Double.MAX_VALUE;
        this.f12079j = new b.p();
        this.f12078i = f10;
    }
}
