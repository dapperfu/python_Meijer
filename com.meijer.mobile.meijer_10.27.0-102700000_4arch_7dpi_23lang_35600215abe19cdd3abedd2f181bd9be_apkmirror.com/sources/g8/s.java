package g8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final long f133156a;

    /* renamed from: b, reason: collision with root package name */
    private final long f133157b;

    public long a() {
        return this.f133156a;
    }

    public long b() {
        return this.f133157b;
    }

    public s(long j10, long j11, long j12) {
        this.f133156a = j10 - j11;
        this.f133157b = TimeUnit.MILLISECONDS.toNanos(j10) - j12;
    }
}
