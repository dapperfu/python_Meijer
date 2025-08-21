package sc;

/* renamed from: sc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17049l extends AbstractC17059v {

    /* renamed from: a, reason: collision with root package name */
    private final long f160237a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC17059v) && this.f160237a == ((AbstractC17059v) obj).c();
    }

    @Override // sc.AbstractC17059v
    public long c() {
        return this.f160237a;
    }

    public int hashCode() {
        long j10 = this.f160237a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f160237a + "}";
    }

    C17049l(long j10) {
        this.f160237a = j10;
    }
}
