package Hu;

/* loaded from: classes7.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final long f13253a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13254b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f13253a == cVar.l() && this.f13254b == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // Hu.c
    public int e() {
        return this.f13254b;
    }

    @Override // Hu.c
    public long l() {
        return this.f13253a;
    }

    public String toString() {
        return "Timestamp{seconds=" + this.f13253a + ", nanos=" + this.f13254b + "}";
    }

    a(long j10, int i10) {
        this.f13253a = j10;
        this.f13254b = i10;
    }

    public int hashCode() {
        long j10 = this.f13253a;
        return this.f13254b ^ (((int) (1000003 ^ (j10 ^ (j10 >>> 32)))) * 1000003);
    }
}
