package W1;

import V1.e;
import W1.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private V1.f f40636a;

    /* renamed from: d, reason: collision with root package name */
    private V1.f f40639d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40637b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40638c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<m> f40640e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<k> f40641f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0873b f40642g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f40643h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<k> f40644i = new ArrayList<>();

    public void j() {
        this.f40637b = true;
    }

    public void k() {
        this.f40638c = true;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<k> arrayList, k kVar) {
        int i12;
        f fVar3;
        ArrayList<k> arrayList2;
        m mVar = fVar.f40648d;
        if (mVar.f40682c == null) {
            V1.f fVar4 = this.f40636a;
            if (mVar == fVar4.f39492e || mVar == fVar4.f39494f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i11);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            mVar.f40682c = kVar2;
            kVar2.a(mVar);
            for (d dVar : mVar.f40687h.f40655k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, kVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList<k> arrayList3 = arrayList;
            for (d dVar2 : mVar.f40688i.f40655k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, kVar2);
                }
            }
            if (i13 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f40677k.f40655k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, kVar2);
                    }
                }
            }
            for (f fVar6 : mVar.f40687h.f40656l) {
                if (fVar6 == fVar5) {
                    kVar2.f40671b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, kVar2);
            }
            for (f fVar7 : mVar.f40688i.f40656l) {
                if (fVar7 == fVar5) {
                    kVar2.f40671b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, kVar2);
            }
            if (i13 == 1 && (mVar instanceof l)) {
                Iterator<f> it = ((l) mVar).f40677k.f40656l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i13, 2, fVar5, arrayList3, kVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(V1.f r20) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.e.b(V1.f):boolean");
    }

    private int e(V1.f fVar, int i10) {
        int size = this.f40644i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f40644i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(m mVar, int i10, ArrayList<k> arrayList) {
        for (d dVar : mVar.f40687h.f40655k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, mVar.f40688i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f40687h, i10, 0, mVar.f40688i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f40688i.f40655k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, mVar.f40687h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f40688i, i10, 1, mVar.f40687h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((l) mVar).f40677k.f40655k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(V1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f40643h;
        aVar.f40624a = bVar;
        aVar.f40625b = bVar2;
        aVar.f40626c = i10;
        aVar.f40627d = i11;
        this.f40642g.b(eVar, aVar);
        eVar.E0(this.f40643h.f40628e);
        eVar.h0(this.f40643h.f40629f);
        eVar.g0(this.f40643h.f40631h);
        eVar.b0(this.f40643h.f40630g);
    }

    public void c() {
        d(this.f40640e);
        this.f40644i.clear();
        k.f40669h = 0;
        i(this.f40636a.f39492e, 0, this.f40644i);
        i(this.f40636a.f39494f, 1, this.f40644i);
        this.f40637b = false;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f40637b || this.f40638c) {
            Iterator<V1.e> it = this.f40636a.f39627w0.iterator();
            while (it.hasNext()) {
                V1.e next = it.next();
                next.f39484a = false;
                next.f39492e.r();
                next.f39494f.q();
            }
            V1.f fVar = this.f40636a;
            fVar.f39484a = false;
            fVar.f39492e.r();
            this.f40636a.f39494f.q();
            this.f40638c = false;
        }
        if (b(this.f40639d)) {
            return false;
        }
        this.f40636a.F0(0);
        this.f40636a.G0(0);
        e.b bVarS = this.f40636a.s(0);
        e.b bVarS2 = this.f40636a.s(1);
        if (this.f40637b) {
            c();
        }
        int iQ = this.f40636a.Q();
        int iR = this.f40636a.R();
        this.f40636a.f39492e.f40687h.d(iQ);
        this.f40636a.f39494f.f40687h.d(iR);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z10) {
                Iterator<m> it2 = this.f40640e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarS == e.b.WRAP_CONTENT) {
                this.f40636a.l0(e.b.FIXED);
                V1.f fVar2 = this.f40636a;
                fVar2.E0(e(fVar2, 0));
                V1.f fVar3 = this.f40636a;
                fVar3.f39492e.f40684e.d(fVar3.P());
            }
            if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f40636a.A0(e.b.FIXED);
                V1.f fVar4 = this.f40636a;
                fVar4.h0(e(fVar4, 1));
                V1.f fVar5 = this.f40636a;
                fVar5.f39494f.f40684e.d(fVar5.v());
            }
        }
        V1.f fVar6 = this.f40636a;
        e.b bVar2 = fVar6.f39470M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iP = fVar6.P() + iQ;
            this.f40636a.f39492e.f40688i.d(iP);
            this.f40636a.f39492e.f40684e.d(iP - iQ);
            m();
            V1.f fVar7 = this.f40636a;
            e.b bVar4 = fVar7.f39470M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iV = fVar7.v() + iR;
                this.f40636a.f39494f.f40688i.d(iV);
                this.f40636a.f39494f.f40684e.d(iV - iR);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<m> it3 = this.f40640e.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f40681b != this.f40636a || next2.f40686g) {
                next2.e();
            }
        }
        Iterator<m> it4 = this.f40640e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            m next3 = it4.next();
            if (z11 || next3.f40681b != this.f40636a) {
                if (!next3.f40687h.f40654j || ((!next3.f40688i.f40654j && !(next3 instanceof h)) || (!next3.f40684e.f40654j && !(next3 instanceof c) && !(next3 instanceof h)))) {
                    break;
                }
            }
        }
        this.f40636a.l0(bVarS);
        this.f40636a.A0(bVarS2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f40637b) {
            Iterator<V1.e> it = this.f40636a.f39627w0.iterator();
            while (it.hasNext()) {
                V1.e next = it.next();
                next.f39484a = false;
                j jVar = next.f39492e;
                jVar.f40684e.f40654j = false;
                jVar.f40686g = false;
                jVar.r();
                l lVar = next.f39494f;
                lVar.f40684e.f40654j = false;
                lVar.f40686g = false;
                lVar.q();
            }
            V1.f fVar = this.f40636a;
            fVar.f39484a = false;
            j jVar2 = fVar.f39492e;
            jVar2.f40684e.f40654j = false;
            jVar2.f40686g = false;
            jVar2.r();
            l lVar2 = this.f40636a.f39494f;
            lVar2.f40684e.f40654j = false;
            lVar2.f40686g = false;
            lVar2.q();
            c();
        }
        if (b(this.f40639d)) {
            return false;
        }
        this.f40636a.F0(0);
        this.f40636a.G0(0);
        this.f40636a.f39492e.f40687h.d(0);
        this.f40636a.f39494f.f40687h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarS = this.f40636a.s(0);
        e.b bVarS2 = this.f40636a.s(1);
        int iQ = this.f40636a.Q();
        int iR = this.f40636a.R();
        if (z10 && (bVarS == (bVar = e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator<m> it = this.f40640e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f40685f == i10 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarS == e.b.WRAP_CONTENT) {
                    this.f40636a.l0(e.b.FIXED);
                    V1.f fVar = this.f40636a;
                    fVar.E0(e(fVar, 0));
                    V1.f fVar2 = this.f40636a;
                    fVar2.f39492e.f40684e.d(fVar2.P());
                }
            } else if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f40636a.A0(e.b.FIXED);
                V1.f fVar3 = this.f40636a;
                fVar3.h0(e(fVar3, 1));
                V1.f fVar4 = this.f40636a;
                fVar4.f39494f.f40684e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            V1.f fVar5 = this.f40636a;
            e.b bVar2 = fVar5.f39470M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iP = fVar5.P() + iQ;
                this.f40636a.f39492e.f40688i.d(iP);
                this.f40636a.f39492e.f40684e.d(iP - iQ);
                z11 = true;
            }
            z11 = false;
        } else {
            V1.f fVar6 = this.f40636a;
            e.b bVar3 = fVar6.f39470M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iV = fVar6.v() + iR;
                this.f40636a.f39494f.f40688i.d(iV);
                this.f40636a.f39494f.f40684e.d(iV - iR);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<m> it2 = this.f40640e.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.f40685f == i10 && (next2.f40681b != this.f40636a || next2.f40686g)) {
                next2.e();
            }
        }
        Iterator<m> it3 = this.f40640e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            m next3 = it3.next();
            if (next3.f40685f == i10 && (z11 || next3.f40681b != this.f40636a)) {
                if (!next3.f40687h.f40654j || !next3.f40688i.f40654j || (!(next3 instanceof c) && !next3.f40684e.f40654j)) {
                    break;
                }
            }
        }
        this.f40636a.l0(bVarS);
        this.f40636a.A0(bVarS2);
        return z12;
    }

    public void m() {
        g gVar;
        Iterator<V1.e> it = this.f40636a.f39627w0.iterator();
        while (it.hasNext()) {
            V1.e next = it.next();
            if (!next.f39484a) {
                e.b[] bVarArr = next.f39470M;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f39506l;
                int i11 = next.f39508m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f39492e.f40684e;
                boolean z12 = gVar2.f40654j;
                g gVar3 = next.f39494f.f40684e;
                boolean z13 = gVar3.f40654j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f40651g, bVar4, gVar3.f40651g);
                    next.f39484a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f40651g, bVar3, gVar3.f40651g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f39494f.f40684e.f40666m = next.v();
                    } else {
                        next.f39494f.f40684e.d(next.v());
                        next.f39484a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f40651g, e.b.FIXED, gVar3.f40651g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f39492e.f40684e.f40666m = next.P();
                    } else {
                        next.f39492e.f40684e.d(next.P());
                        next.f39484a = true;
                    }
                }
                if (next.f39484a && (gVar = next.f39494f.f40678l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0873b interfaceC0873b) {
        this.f40642g = interfaceC0873b;
    }

    public e(V1.f fVar) {
        this.f40636a = fVar;
        this.f40639d = fVar;
    }

    public void d(ArrayList<m> arrayList) {
        arrayList.clear();
        this.f40639d.f39492e.f();
        this.f40639d.f39494f.f();
        arrayList.add(this.f40639d.f39492e);
        arrayList.add(this.f40639d.f39494f);
        Iterator<V1.e> it = this.f40639d.f39627w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            V1.e next = it.next();
            if (next instanceof V1.h) {
                arrayList.add(new h(next));
            } else {
                if (next.V()) {
                    if (next.f39488c == null) {
                        next.f39488c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f39488c);
                } else {
                    arrayList.add(next.f39492e);
                }
                if (next.X()) {
                    if (next.f39490d == null) {
                        next.f39490d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f39490d);
                } else {
                    arrayList.add(next.f39494f);
                }
                if (next instanceof V1.j) {
                    arrayList.add(new i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f40681b != this.f40639d) {
                next2.d();
            }
        }
    }
}
