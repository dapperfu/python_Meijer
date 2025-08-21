package G;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f11125a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11126b;

    k(long j10, long j11) {
        this.f11125a = j10;
        this.f11126b = j11;
    }

    long a() {
        return this.f11126b;
    }

    long b() {
        return this.f11125a;
    }

    public String toString() {
        return this.f11125a + q2.f93563c + this.f11126b;
    }

    k(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
