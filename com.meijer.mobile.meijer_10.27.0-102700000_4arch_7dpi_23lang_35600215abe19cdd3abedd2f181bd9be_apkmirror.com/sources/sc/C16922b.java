package sc;

import sc.AbstractC16927g;

/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16922b extends AbstractC16927g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16927g.a f160393a;

    /* renamed from: b, reason: collision with root package name */
    private final long f160394b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16927g) {
            AbstractC16927g abstractC16927g = (AbstractC16927g) obj;
            if (this.f160393a.equals(abstractC16927g.c()) && this.f160394b == abstractC16927g.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // sc.AbstractC16927g
    public long b() {
        return this.f160394b;
    }

    @Override // sc.AbstractC16927g
    public AbstractC16927g.a c() {
        return this.f160393a;
    }

    public int hashCode() {
        int iHashCode = (this.f160393a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f160394b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f160393a + ", nextRequestWaitMillis=" + this.f160394b + "}";
    }

    C16922b(AbstractC16927g.a aVar, long j10) {
        if (aVar != null) {
            this.f160393a = aVar;
            this.f160394b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
