package x3;

import x3.J;

/* loaded from: classes.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f170180a;

    /* renamed from: b, reason: collision with root package name */
    private final long f170181b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public M(long j10, long j11) {
        this.f170180a = j10;
        this.f170181b = j11;
    }

    @Override // x3.J
    public J.a d(long j10) {
        return new J.a(new K(j10, this.f170181b));
    }

    @Override // x3.J
    public long l() {
        return this.f170180a;
    }
}
