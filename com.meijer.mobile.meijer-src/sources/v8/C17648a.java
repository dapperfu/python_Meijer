package v8;

/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17648a {

    /* renamed from: a, reason: collision with root package name */
    private final long f165700a;

    /* renamed from: b, reason: collision with root package name */
    private final int f165701b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C17648a c17648a = (C17648a) obj;
            if (this.f165701b == c17648a.f165701b && this.f165700a == c17648a.f165700a) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f165701b;
    }

    public long b() {
        return this.f165700a;
    }

    public int hashCode() {
        int i10 = this.f165701b * 31;
        long j10 = this.f165700a;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "MeasurementPoint{sequenceNumber=" + this.f165701b + ", timestamp=" + this.f165700a + '}';
    }

    public C17648a(long j10, int i10) {
        this.f165700a = j10;
        this.f165701b = i10;
    }
}
