package p3;

import Ce.L;
import Ce.U;
import a3.G;
import d3.P;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f155473d = new w(new G[0]);

    /* renamed from: e, reason: collision with root package name */
    private static final String f155474e = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f155475a;

    /* renamed from: b, reason: collision with root package name */
    private final L<G> f155476b;

    /* renamed from: c, reason: collision with root package name */
    private int f155477c;

    private void e() {
        int i10 = 0;
        while (i10 < this.f155476b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f155476b.size(); i12++) {
                if (this.f155476b.get(i10).equals(this.f155476b.get(i12))) {
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
            if (this.f155475a == wVar.f155475a && this.f155476b.equals(wVar.f155476b)) {
                return true;
            }
        }
        return false;
    }

    public G b(int i10) {
        return this.f155476b.get(i10);
    }

    public L<Integer> c() {
        return L.s(U.l(this.f155476b, new Be.g() { // from class: p3.v
            @Override // Be.g
            public final Object apply(Object obj) {
                return Integer.valueOf(((G) obj).f43635c);
            }
        }));
    }

    public int d(G g10) {
        int iIndexOf = this.f155476b.indexOf(g10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public int hashCode() {
        if (this.f155477c == 0) {
            this.f155477c = this.f155476b.hashCode();
        }
        return this.f155477c;
    }

    public String toString() {
        return this.f155476b.toString();
    }

    public w(G... gArr) {
        this.f155476b = L.t(gArr);
        this.f155475a = gArr.length;
        e();
    }
}
