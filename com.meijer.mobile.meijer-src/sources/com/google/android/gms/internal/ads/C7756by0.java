package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.by0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7756by0 {

    /* renamed from: j, reason: collision with root package name */
    public static final C7756by0 f73873j = new C7756by0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C7756by0 f73874k = new C7756by0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C7756by0 f73875l = new C7756by0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C7756by0 f73876m = new C7756by0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f73877a;

    /* renamed from: b, reason: collision with root package name */
    public final double f73878b;

    /* renamed from: c, reason: collision with root package name */
    public final double f73879c;

    /* renamed from: d, reason: collision with root package name */
    public final double f73880d;

    /* renamed from: e, reason: collision with root package name */
    public final double f73881e;

    /* renamed from: f, reason: collision with root package name */
    public final double f73882f;

    /* renamed from: g, reason: collision with root package name */
    public final double f73883g;

    /* renamed from: h, reason: collision with root package name */
    public final double f73884h;

    /* renamed from: i, reason: collision with root package name */
    public final double f73885i;

    public C7756by0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f73877a = d14;
        this.f73878b = d15;
        this.f73879c = d16;
        this.f73880d = d10;
        this.f73881e = d11;
        this.f73882f = d12;
        this.f73883g = d13;
        this.f73884h = d17;
        this.f73885i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7756by0.class != obj.getClass()) {
            return false;
        }
        C7756by0 c7756by0 = (C7756by0) obj;
        return Double.compare(c7756by0.f73880d, this.f73880d) == 0 && Double.compare(c7756by0.f73881e, this.f73881e) == 0 && Double.compare(c7756by0.f73882f, this.f73882f) == 0 && Double.compare(c7756by0.f73883g, this.f73883g) == 0 && Double.compare(c7756by0.f73884h, this.f73884h) == 0 && Double.compare(c7756by0.f73885i, this.f73885i) == 0 && Double.compare(c7756by0.f73877a, this.f73877a) == 0 && Double.compare(c7756by0.f73878b, this.f73878b) == 0 && Double.compare(c7756by0.f73879c, this.f73879c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f73877a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f73878b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f73879c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f73880d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f73881e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f73882f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f73883g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f73884h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f73885i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f73873j)) {
            return "Rotate 0°";
        }
        if (equals(f73874k)) {
            return "Rotate 90°";
        }
        if (equals(f73875l)) {
            return "Rotate 180°";
        }
        if (equals(f73876m)) {
            return "Rotate 270°";
        }
        double d10 = this.f73877a;
        double d11 = this.f73878b;
        double d12 = this.f73879c;
        double d13 = this.f73880d;
        double d14 = this.f73881e;
        double d15 = this.f73882f;
        double d16 = this.f73883g;
        double d17 = this.f73884h;
        double d18 = this.f73885i;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d10);
        sb2.append(", v=");
        sb2.append(d11);
        sb2.append(", w=");
        sb2.append(d12);
        sb2.append(", a=");
        sb2.append(d13);
        sb2.append(", b=");
        sb2.append(d14);
        sb2.append(", c=");
        sb2.append(d15);
        sb2.append(", d=");
        sb2.append(d16);
        sb2.append(", tx=");
        sb2.append(d17);
        sb2.append(", ty=");
        sb2.append(d18);
        sb2.append("}");
        return sb2.toString();
    }
}
