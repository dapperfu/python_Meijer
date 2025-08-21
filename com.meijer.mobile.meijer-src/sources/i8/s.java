package i8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final long f137372a;

    /* renamed from: b, reason: collision with root package name */
    private final long f137373b;

    public long a() {
        return this.f137372a;
    }

    public long b() {
        return this.f137373b;
    }

    public s(long j10, long j11, long j12) {
        this.f137372a = j10 - j11;
        this.f137373b = TimeUnit.MILLISECONDS.toNanos(j10) - j12;
    }
}
