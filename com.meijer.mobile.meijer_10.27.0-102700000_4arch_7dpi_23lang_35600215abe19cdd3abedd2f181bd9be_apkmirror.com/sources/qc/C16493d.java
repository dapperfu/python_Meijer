package qc;

import java.util.List;

/* renamed from: qc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16493d extends AbstractC16503n {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC16510u> f157073a;

    @Override // qc.AbstractC16503n
    public List<AbstractC16510u> c() {
        return this.f157073a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16503n) {
            return this.f157073a.equals(((AbstractC16503n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f157073a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f157073a + "}";
    }

    C16493d(List<AbstractC16510u> list) {
        if (list != null) {
            this.f157073a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }
}
