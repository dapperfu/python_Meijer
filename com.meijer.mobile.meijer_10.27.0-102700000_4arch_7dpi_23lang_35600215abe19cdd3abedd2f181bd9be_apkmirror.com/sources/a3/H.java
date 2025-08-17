package a3;

import d3.P;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    private static final String f43638c = P.y0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f43639d = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final G f43640a;

    /* renamed from: b, reason: collision with root package name */
    public final Ce.L<Integer> f43641b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H.class == obj.getClass()) {
            H h10 = (H) obj;
            if (this.f43640a.equals(h10.f43640a) && this.f43641b.equals(h10.f43641b)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f43640a.f43635c;
    }

    public int hashCode() {
        return this.f43640a.hashCode() + (this.f43641b.hashCode() * 31);
    }

    public H(G g10, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= g10.f43633a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f43640a = g10;
        this.f43641b = Ce.L.s(list);
    }
}
