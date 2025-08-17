package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.by0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7631by0 {

    /* renamed from: j, reason: collision with root package name */
    public static final C7631by0 f73033j = new C7631by0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C7631by0 f73034k = new C7631by0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C7631by0 f73035l = new C7631by0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C7631by0 f73036m = new C7631by0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f73037a;

    /* renamed from: b, reason: collision with root package name */
    public final double f73038b;

    /* renamed from: c, reason: collision with root package name */
    public final double f73039c;

    /* renamed from: d, reason: collision with root package name */
    public final double f73040d;

    /* renamed from: e, reason: collision with root package name */
    public final double f73041e;

    /* renamed from: f, reason: collision with root package name */
    public final double f73042f;

    /* renamed from: g, reason: collision with root package name */
    public final double f73043g;

    /* renamed from: h, reason: collision with root package name */
    public final double f73044h;

    /* renamed from: i, reason: collision with root package name */
    public final double f73045i;

    public C7631by0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f73037a = d14;
        this.f73038b = d15;
        this.f73039c = d16;
        this.f73040d = d10;
        this.f73041e = d11;
        this.f73042f = d12;
        this.f73043g = d13;
        this.f73044h = d17;
        this.f73045i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7631by0.class != obj.getClass()) {
            return false;
        }
        C7631by0 c7631by0 = (C7631by0) obj;
        return Double.compare(c7631by0.f73040d, this.f73040d) == 0 && Double.compare(c7631by0.f73041e, this.f73041e) == 0 && Double.compare(c7631by0.f73042f, this.f73042f) == 0 && Double.compare(c7631by0.f73043g, this.f73043g) == 0 && Double.compare(c7631by0.f73044h, this.f73044h) == 0 && Double.compare(c7631by0.f73045i, this.f73045i) == 0 && Double.compare(c7631by0.f73037a, this.f73037a) == 0 && Double.compare(c7631by0.f73038b, this.f73038b) == 0 && Double.compare(c7631by0.f73039c, this.f73039c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f73037a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f73038b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f73039c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f73040d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f73041e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f73042f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f73043g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f73044h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f73045i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f73033j)) {
            return "Rotate 0°";
        }
        if (equals(f73034k)) {
            return "Rotate 90°";
        }
        if (equals(f73035l)) {
            return "Rotate 180°";
        }
        if (equals(f73036m)) {
            return "Rotate 270°";
        }
        double d10 = this.f73037a;
        double d11 = this.f73038b;
        double d12 = this.f73039c;
        double d13 = this.f73040d;
        double d14 = this.f73041e;
        double d15 = this.f73042f;
        double d16 = this.f73043g;
        double d17 = this.f73044h;
        double d18 = this.f73045i;
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
