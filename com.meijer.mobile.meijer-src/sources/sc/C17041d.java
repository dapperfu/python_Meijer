package sc;

import java.util.List;

/* renamed from: sc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17041d extends AbstractC17051n {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC17058u> f160188a;

    @Override // sc.AbstractC17051n
    public List<AbstractC17058u> c() {
        return this.f160188a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17051n) {
            return this.f160188a.equals(((AbstractC17051n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f160188a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f160188a + "}";
    }

    C17041d(List<AbstractC17058u> list) {
        if (list != null) {
            this.f160188a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }
}
