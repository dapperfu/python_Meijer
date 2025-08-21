package Du;

/* loaded from: classes8.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final long f6675a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6676b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f6675a == cVar.l() && this.f6676b == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // Du.c
    public int e() {
        return this.f6676b;
    }

    @Override // Du.c
    public long l() {
        return this.f6675a;
    }

    public String toString() {
        return "Timestamp{seconds=" + this.f6675a + ", nanos=" + this.f6676b + "}";
    }

    a(long j10, int i10) {
        this.f6675a = j10;
        this.f6676b = i10;
    }

    public int hashCode() {
        long j10 = this.f6675a;
        return this.f6676b ^ (((int) (1000003 ^ (j10 ^ (j10 >>> 32)))) * 1000003);
    }
}
