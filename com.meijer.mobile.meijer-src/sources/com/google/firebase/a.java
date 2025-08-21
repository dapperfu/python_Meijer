package com.google.firebase;

/* loaded from: classes8.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f89441a;

    /* renamed from: b, reason: collision with root package name */
    private final long f89442b;

    /* renamed from: c, reason: collision with root package name */
    private final long f89443c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f89441a == nVar.c() && this.f89442b == nVar.b() && this.f89443c == nVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f89442b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f89441a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f89443c;
    }

    public int hashCode() {
        long j10 = this.f89441a;
        long j11 = this.f89442b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f89443c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f89441a + ", elapsedRealtime=" + this.f89442b + ", uptimeMillis=" + this.f89443c + "}";
    }

    a(long j10, long j11, long j12) {
        this.f89441a = j10;
        this.f89442b = j11;
        this.f89443c = j12;
    }
}
