package t8;

/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17073a {

    /* renamed from: a, reason: collision with root package name */
    private final long f161522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f161523b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C17073a c17073a = (C17073a) obj;
            if (this.f161523b == c17073a.f161523b && this.f161522a == c17073a.f161522a) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f161523b;
    }

    public long b() {
        return this.f161522a;
    }

    public int hashCode() {
        int i10 = this.f161523b * 31;
        long j10 = this.f161522a;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "MeasurementPoint{sequenceNumber=" + this.f161523b + ", timestamp=" + this.f161522a + '}';
    }

    public C17073a(long j10, int i10) {
        this.f161522a = j10;
        this.f161523b = i10;
    }
}
