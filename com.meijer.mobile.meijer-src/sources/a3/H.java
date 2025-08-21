package a3;

import d3.P;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44456c = P.y0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f44457d = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final G f44458a;

    /* renamed from: b, reason: collision with root package name */
    public final Ee.L<Integer> f44459b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H.class == obj.getClass()) {
            H h10 = (H) obj;
            if (this.f44458a.equals(h10.f44458a) && this.f44459b.equals(h10.f44459b)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f44458a.f44453c;
    }

    public int hashCode() {
        return this.f44458a.hashCode() + (this.f44459b.hashCode() * 31);
    }

    public H(G g10, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= g10.f44451a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f44458a = g10;
        this.f44459b = Ee.L.s(list);
    }
}
