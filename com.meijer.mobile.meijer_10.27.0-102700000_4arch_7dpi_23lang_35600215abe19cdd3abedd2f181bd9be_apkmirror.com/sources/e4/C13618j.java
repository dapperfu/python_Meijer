package e4;

import a3.t;
import android.util.SparseArray;
import d3.C13474i;
import e4.L;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13618j implements L.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f128356a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a3.t> f128357b;

    public C13618j(int i10) {
        this(i10, Ce.L.x());
    }

    public C13618j(int i10, List<a3.t> list) {
        this.f128356a = i10;
        this.f128357b = list;
    }

    private G c(L.b bVar) {
        return new G(e(bVar), "video/mp2t");
    }

    private N d(L.b bVar) {
        return new N(e(bVar), "video/mp2t");
    }

    private List<a3.t> e(L.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f128357b;
        }
        d3.D d10 = new d3.D(bVar.f128273e);
        List<a3.t> arrayList = this.f128357b;
        while (d10.a() > 0) {
            int iH = d10.H();
            int iF = d10.f() + d10.H();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = d10.H() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strE = d10.E(3);
                    int iH3 = d10.H();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bH = (byte) d10.H();
                    d10.X(1);
                    arrayList.add(new t.b().u0(str).j0(strE).O(i10).g0(z10 ? C13474i.e((bH & 64) != 0) : null).N());
                }
            }
            d10.W(iF);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (i10 & this.f128356a) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // e4.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e4.L a(int r6, e4.L.b r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C13618j.a(int, e4.L$b):e4.L");
    }

    @Override // e4.L.c
    public SparseArray<L> b() {
        return new SparseArray<>();
    }
}
