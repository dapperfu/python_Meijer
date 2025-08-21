package p3;

import Ee.L;
import Ee.U;
import a3.G;
import d3.P;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f156147d = new w(new G[0]);

    /* renamed from: e, reason: collision with root package name */
    private static final String f156148e = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f156149a;

    /* renamed from: b, reason: collision with root package name */
    private final L<G> f156150b;

    /* renamed from: c, reason: collision with root package name */
    private int f156151c;

    private void e() {
        int i10 = 0;
        while (i10 < this.f156150b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f156150b.size(); i12++) {
                if (this.f156150b.get(i10).equals(this.f156150b.get(i12))) {
                    d3.r.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f156149a == wVar.f156149a && this.f156150b.equals(wVar.f156150b)) {
                return true;
            }
        }
        return false;
    }

    public G b(int i10) {
        return this.f156150b.get(i10);
    }

    public L<Integer> c() {
        return L.s(U.l(this.f156150b, new De.g() { // from class: p3.v
            @Override // De.g
            public final Object apply(Object obj) {
                return Integer.valueOf(((G) obj).f44453c);
            }
        }));
    }

    public int d(G g10) {
        int iIndexOf = this.f156150b.indexOf(g10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public int hashCode() {
        if (this.f156151c == 0) {
            this.f156151c = this.f156150b.hashCode();
        }
        return this.f156151c;
    }

    public String toString() {
        return this.f156150b.toString();
    }

    public w(G... gArr) {
        this.f156150b = L.t(gArr);
        this.f156149a = gArr.length;
        e();
    }
}
