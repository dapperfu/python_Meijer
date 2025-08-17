package com.scandit.datacapture.core.ui.animation;

/* loaded from: classes11.dex */
public final class SpringForce {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;

    /* renamed from: a, reason: collision with root package name */
    double f125995a;

    /* renamed from: b, reason: collision with root package name */
    double f125996b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f125997c;

    /* renamed from: d, reason: collision with root package name */
    private double f125998d;

    /* renamed from: e, reason: collision with root package name */
    private double f125999e;

    /* renamed from: f, reason: collision with root package name */
    private double f126000f;

    /* renamed from: g, reason: collision with root package name */
    private double f126001g;

    /* renamed from: h, reason: collision with root package name */
    private double f126002h;

    /* renamed from: i, reason: collision with root package name */
    private double f126003i;

    /* renamed from: j, reason: collision with root package name */
    private final t f126004j;

    public SpringForce() {
        this.f125995a = Math.sqrt(1500.0d);
        this.f125996b = 1.0d;
        this.f125997c = false;
        this.f126003i = Double.MAX_VALUE;
        this.f126004j = new t();
    }

    final t a(double d10, double d11, long j10) {
        double dSin;
        double dCos;
        if (!this.f125997c) {
            if (this.f126003i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f125996b;
            if (d12 > 1.0d) {
                double d13 = this.f125995a;
                this.f126000f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f125996b;
                double d15 = this.f125995a;
                this.f126001g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f126002h = Math.sqrt(1.0d - (d12 * d12)) * this.f125995a;
            }
            this.f125997c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.f126003i;
        double d18 = this.f125996b;
        if (d18 > 1.0d) {
            double d19 = this.f126001g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f126000f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f126000f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f126001g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f126000f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f125995a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f125995a) * d16) * d26;
            double d27 = -this.f125995a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f126002h;
            double d29 = this.f125995a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f126002h * d16) * d30) + (Math.cos(this.f126002h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f125995a;
            double d32 = this.f125996b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f126002h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f126002h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        t tVar = this.f126004j;
        tVar.f126016a = (float) (dSin + this.f126003i);
        tVar.f126017b = (float) dCos;
        return tVar;
    }

    public SpringForce setDampingRatio(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f125996b = f10;
        this.f125997c = false;
        return this;
    }

    public SpringForce setFinalPosition(float f10) {
        this.f126003i = f10;
        return this;
    }

    public SpringForce setStiffness(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f125995a = Math.sqrt(f10);
        this.f125997c = false;
        return this;
    }

    public float getDampingRatio() {
        return (float) this.f125996b;
    }

    public float getFinalPosition() {
        return (float) this.f126003i;
    }

    public float getStiffness() {
        double d10 = this.f125995a;
        return (float) (d10 * d10);
    }

    public float getAcceleration(float f10, float f11) {
        float finalPosition = f10 - getFinalPosition();
        double d10 = this.f125995a;
        return (float) (((-(d10 * d10)) * finalPosition) - (((d10 * 2.0d) * this.f125996b) * f11));
    }

    public boolean isAtEquilibrium(float f10, float f11) {
        if (Math.abs(f11) < this.f125999e && Math.abs(f10 - getFinalPosition()) < this.f125998d) {
            return true;
        }
        return false;
    }

    public SpringForce(float f10) {
        this.f125995a = Math.sqrt(1500.0d);
        this.f125996b = 1.0d;
        this.f125997c = false;
        this.f126004j = new t();
        this.f126003i = f10;
    }

    final void a(double d10) {
        double dAbs = Math.abs(d10);
        this.f125998d = dAbs;
        this.f125999e = dAbs * 62.5d;
    }
}
