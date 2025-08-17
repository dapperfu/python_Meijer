package qc;

/* renamed from: qc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16501l extends AbstractC16511v {

    /* renamed from: a, reason: collision with root package name */
    private final long f157122a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC16511v) && this.f157122a == ((AbstractC16511v) obj).c();
    }

    @Override // qc.AbstractC16511v
    public long c() {
        return this.f157122a;
    }

    public int hashCode() {
        long j10 = this.f157122a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f157122a + "}";
    }

    C16501l(long j10) {
        this.f157122a = j10;
    }
}
