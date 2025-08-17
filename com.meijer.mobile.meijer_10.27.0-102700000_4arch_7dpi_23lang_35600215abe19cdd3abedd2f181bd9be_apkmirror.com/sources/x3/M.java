package x3;

import x3.J;

/* loaded from: classes.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f169092a;

    /* renamed from: b, reason: collision with root package name */
    private final long f169093b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public M(long j10, long j11) {
        this.f169092a = j10;
        this.f169093b = j11;
    }

    @Override // x3.J
    public J.a d(long j10) {
        return new J.a(new K(j10, this.f169093b));
    }

    @Override // x3.J
    public long l() {
        return this.f169092a;
    }
}
