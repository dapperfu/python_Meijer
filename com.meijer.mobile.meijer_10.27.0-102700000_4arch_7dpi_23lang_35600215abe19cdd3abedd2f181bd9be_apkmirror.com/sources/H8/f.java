package H8;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f12352a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12353b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12354c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12355d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (Float.compare(fVar.f12352a, this.f12352a) == 0 && Float.compare(fVar.f12353b, this.f12353b) == 0 && this.f12354c == fVar.f12354c && this.f12355d == fVar.f12355d) {
                return true;
            }
        }
        return false;
    }

    public long a() {
        return this.f12354c;
    }

    public float b() {
        return this.f12352a;
    }

    public float c() {
        return this.f12353b;
    }

    public int hashCode() {
        float f10 = this.f12352a;
        int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.f12353b;
        int iFloatToIntBits2 = f11 != 0.0f ? Float.floatToIntBits(f11) : 0;
        long j10 = this.f12354c;
        int i10 = (((iFloatToIntBits + iFloatToIntBits2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f12355d;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "TapEventData{x=" + this.f12352a + ", y=" + this.f12353b + ", timestamp=" + this.f12354c + ", eventTime=" + this.f12355d + '}';
    }

    public f(float f10, float f11, long j10, long j11) {
        this.f12352a = f10;
        this.f12353b = f11;
        this.f12354c = j10;
        this.f12355d = j11;
    }
}
