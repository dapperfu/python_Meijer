package ut;

/* renamed from: ut.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17315a {

    /* renamed from: a, reason: collision with root package name */
    public double f163451a;

    /* renamed from: b, reason: collision with root package name */
    public double f163452b;

    /* renamed from: c, reason: collision with root package name */
    public String f163453c;

    /* renamed from: d, reason: collision with root package name */
    public float f163454d;

    /* renamed from: e, reason: collision with root package name */
    public long f163455e;

    public C17315a() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17315a.class != obj.getClass()) {
            return false;
        }
        C17315a c17315a = (C17315a) obj;
        if (Float.floatToIntBits(this.f163454d) != Float.floatToIntBits(c17315a.f163454d) || Double.doubleToLongBits(this.f163451a) != Double.doubleToLongBits(c17315a.f163451a) || Double.doubleToLongBits(this.f163452b) != Double.doubleToLongBits(c17315a.f163452b)) {
            return false;
        }
        String str = this.f163453c;
        if (str == null) {
            if (c17315a.f163453c != null) {
                return false;
            }
        } else if (!str.equals(c17315a.f163453c)) {
            return false;
        }
        return this.f163455e == c17315a.f163455e;
    }

    public C17315a(double d10, double d11, float f10, String str, long j10) {
        this.f163451a = d10;
        this.f163452b = d11;
        this.f163454d = f10;
        this.f163453c = str;
        this.f163455e = j10;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f163454d) + 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f163451a);
        int i10 = (iFloatToIntBits * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f163452b);
        int i11 = ((i10 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        String str = this.f163453c;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        long j10 = this.f163455e;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Fix [latitude=" + this.f163451a + ", longitude=" + this.f163452b + ", provider=" + this.f163453c + ", accuracy=" + this.f163454d + ", time=" + this.f163455e + "]";
    }
}
