package J8;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f15662a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15663b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15664c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15665d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (Float.compare(fVar.f15662a, this.f15662a) == 0 && Float.compare(fVar.f15663b, this.f15663b) == 0 && this.f15664c == fVar.f15664c && this.f15665d == fVar.f15665d) {
                return true;
            }
        }
        return false;
    }

    public long a() {
        return this.f15664c;
    }

    public float b() {
        return this.f15662a;
    }

    public float c() {
        return this.f15663b;
    }

    public int hashCode() {
        float f10 = this.f15662a;
        int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
        float f11 = this.f15663b;
        int iFloatToIntBits2 = f11 != 0.0f ? Float.floatToIntBits(f11) : 0;
        long j10 = this.f15664c;
        int i10 = (((iFloatToIntBits + iFloatToIntBits2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f15665d;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "TapEventData{x=" + this.f15662a + ", y=" + this.f15663b + ", timestamp=" + this.f15664c + ", eventTime=" + this.f15665d + '}';
    }

    public f(float f10, float f11, long j10, long j11) {
        this.f15662a = f10;
        this.f15663b = f11;
        this.f15664c = j10;
        this.f15665d = j11;
    }
}
