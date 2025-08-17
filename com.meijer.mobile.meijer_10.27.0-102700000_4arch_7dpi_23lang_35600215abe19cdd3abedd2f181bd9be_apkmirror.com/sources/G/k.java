package G;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f11200a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11201b;

    k(long j10, long j11) {
        this.f11200a = j10;
        this.f11201b = j11;
    }

    long a() {
        return this.f11201b;
    }

    long b() {
        return this.f11200a;
    }

    public String toString() {
        return this.f11200a + q2.f92724c + this.f11201b;
    }

    k(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
