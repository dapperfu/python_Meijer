package uc;

import uc.AbstractC17374g;

/* renamed from: uc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17369b extends AbstractC17374g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17374g.a f163879a;

    /* renamed from: b, reason: collision with root package name */
    private final long f163880b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17374g) {
            AbstractC17374g abstractC17374g = (AbstractC17374g) obj;
            if (this.f163879a.equals(abstractC17374g.c()) && this.f163880b == abstractC17374g.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // uc.AbstractC17374g
    public long b() {
        return this.f163880b;
    }

    @Override // uc.AbstractC17374g
    public AbstractC17374g.a c() {
        return this.f163879a;
    }

    public int hashCode() {
        int iHashCode = (this.f163879a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f163880b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f163879a + ", nextRequestWaitMillis=" + this.f163880b + "}";
    }

    C17369b(AbstractC17374g.a aVar, long j10) {
        if (aVar != null) {
            this.f163879a = aVar;
            this.f163880b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
