package ut;

/* renamed from: ut.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17467a {

    /* renamed from: a, reason: collision with root package name */
    public double f164529a;

    /* renamed from: b, reason: collision with root package name */
    public double f164530b;

    /* renamed from: c, reason: collision with root package name */
    public String f164531c;

    /* renamed from: d, reason: collision with root package name */
    public float f164532d;

    /* renamed from: e, reason: collision with root package name */
    public long f164533e;

    public C17467a() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17467a.class != obj.getClass()) {
            return false;
        }
        C17467a c17467a = (C17467a) obj;
        if (Float.floatToIntBits(this.f164532d) != Float.floatToIntBits(c17467a.f164532d) || Double.doubleToLongBits(this.f164529a) != Double.doubleToLongBits(c17467a.f164529a) || Double.doubleToLongBits(this.f164530b) != Double.doubleToLongBits(c17467a.f164530b)) {
            return false;
        }
        String str = this.f164531c;
        if (str == null) {
            if (c17467a.f164531c != null) {
                return false;
            }
        } else if (!str.equals(c17467a.f164531c)) {
            return false;
        }
        return this.f164533e == c17467a.f164533e;
    }

    public C17467a(double d10, double d11, float f10, String str, long j10) {
        this.f164529a = d10;
        this.f164530b = d11;
        this.f164532d = f10;
        this.f164531c = str;
        this.f164533e = j10;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f164532d) + 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f164529a);
        int i10 = (iFloatToIntBits * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f164530b);
        int i11 = ((i10 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        String str = this.f164531c;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        long j10 = this.f164533e;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Fix [latitude=" + this.f164529a + ", longitude=" + this.f164530b + ", provider=" + this.f164531c + ", accuracy=" + this.f164532d + ", time=" + this.f164533e + "]";
    }
}
