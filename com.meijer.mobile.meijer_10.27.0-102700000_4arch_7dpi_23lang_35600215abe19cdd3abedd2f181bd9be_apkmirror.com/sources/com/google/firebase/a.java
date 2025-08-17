package com.google.firebase;

/* loaded from: classes7.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f88601a;

    /* renamed from: b, reason: collision with root package name */
    private final long f88602b;

    /* renamed from: c, reason: collision with root package name */
    private final long f88603c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f88601a == nVar.c() && this.f88602b == nVar.b() && this.f88603c == nVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f88602b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f88601a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f88603c;
    }

    public int hashCode() {
        long j10 = this.f88601a;
        long j11 = this.f88602b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f88603c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f88601a + ", elapsedRealtime=" + this.f88602b + ", uptimeMillis=" + this.f88603c + "}";
    }

    a(long j10, long j11, long j12) {
        this.f88601a = j10;
        this.f88602b = j11;
        this.f88603c = j12;
    }
}
