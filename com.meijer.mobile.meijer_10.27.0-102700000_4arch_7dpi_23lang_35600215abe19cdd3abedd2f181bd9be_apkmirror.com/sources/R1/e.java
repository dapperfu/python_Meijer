package R1;

import Q1.e;
import R1.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Q1.f f31571a;

    /* renamed from: d, reason: collision with root package name */
    private Q1.f f31574d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31572b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31573c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f31575e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f31576f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0714b f31577g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f31578h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f31579i = new ArrayList<>();

    public void j() {
        this.f31572b = true;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f31583d;
        if (pVar.f31635c == null) {
            Q1.f fVar4 = this.f31571a;
            if (pVar == fVar4.f29587e || pVar == fVar4.f29589f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f31635c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f31640h.f31590k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
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
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.f31641i.f31590k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f31615k.f31590k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f31640h.f31591l) {
                if (fVar6 == fVar5) {
                    mVar2.f31609b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f31641i.f31591l) {
                if (fVar7 == fVar5) {
                    mVar2.f31609b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f31615k.f31591l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(Q1.f r20) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.e.b(Q1.f):boolean");
    }

    private int e(Q1.f fVar, int i10) {
        int size = this.f31579i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f31579i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f31640h.f31590k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f31641i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f31640h, i10, 0, pVar.f31641i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f31641i.f31590k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f31640h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f31641i, i10, 1, pVar.f31640h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f31615k.f31590k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void k(Q1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f31578h;
        aVar.f31559a = bVar;
        aVar.f31560b = bVar2;
        aVar.f31561c = i10;
        aVar.f31562d = i11;
        this.f31577g.b(eVar, aVar);
        eVar.R0(this.f31578h.f31563e);
        eVar.w0(this.f31578h.f31564f);
        eVar.v0(this.f31578h.f31566h);
        eVar.l0(this.f31578h.f31565g);
    }

    public void c() {
        d(this.f31575e);
        this.f31579i.clear();
        m.f31607h = 0;
        i(this.f31571a.f29587e, 0, this.f31579i);
        i(this.f31571a.f29589f, 1, this.f31579i);
        this.f31572b = false;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f31572b || this.f31573c) {
            Iterator<Q1.e> it = this.f31571a.f29693K0.iterator();
            while (it.hasNext()) {
                Q1.e next = it.next();
                next.i();
                next.f29579a = false;
                next.f29587e.r();
                next.f29589f.q();
            }
            this.f31571a.i();
            Q1.f fVar = this.f31571a;
            fVar.f29579a = false;
            fVar.f29587e.r();
            this.f31571a.f29589f.q();
            this.f31573c = false;
        }
        if (b(this.f31574d)) {
            return false;
        }
        this.f31571a.S0(0);
        this.f31571a.T0(0);
        e.b bVarP = this.f31571a.p(0);
        e.b bVarP2 = this.f31571a.p(1);
        if (this.f31572b) {
            c();
        }
        int iN = this.f31571a.N();
        int iO = this.f31571a.O();
        this.f31571a.f29587e.f31640h.d(iN);
        this.f31571a.f29589f.f31640h.d(iO);
        l();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarP == bVar || bVarP2 == bVar) {
            if (z10) {
                Iterator<p> it2 = this.f31575e.iterator();
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
            if (z10 && bVarP == e.b.WRAP_CONTENT) {
                this.f31571a.A0(e.b.FIXED);
                Q1.f fVar2 = this.f31571a;
                fVar2.R0(e(fVar2, 0));
                Q1.f fVar3 = this.f31571a;
                fVar3.f29587e.f31637e.d(fVar3.M());
            }
            if (z10 && bVarP2 == e.b.WRAP_CONTENT) {
                this.f31571a.N0(e.b.FIXED);
                Q1.f fVar4 = this.f31571a;
                fVar4.w0(e(fVar4, 1));
                Q1.f fVar5 = this.f31571a;
                fVar5.f29589f.f31637e.d(fVar5.s());
            }
        }
        Q1.f fVar6 = this.f31571a;
        e.b bVar2 = fVar6.f29577Y[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iM = fVar6.M() + iN;
            this.f31571a.f29587e.f31641i.d(iM);
            this.f31571a.f29587e.f31637e.d(iM - iN);
            l();
            Q1.f fVar7 = this.f31571a;
            e.b bVar4 = fVar7.f29577Y[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iS = fVar7.s() + iO;
                this.f31571a.f29589f.f31641i.d(iS);
                this.f31571a.f29589f.f31637e.d(iS - iO);
            }
            l();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f31575e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f31634b != this.f31571a || next2.f31639g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f31575e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it4.next();
            if (z11 || next3.f31634b != this.f31571a) {
                if (!next3.f31640h.f31589j || ((!next3.f31641i.f31589j && !(next3 instanceof j)) || (!next3.f31637e.f31589j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    break;
                }
            }
        }
        this.f31571a.A0(bVarP);
        this.f31571a.N0(bVarP2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f31572b) {
            Iterator<Q1.e> it = this.f31571a.f29693K0.iterator();
            while (it.hasNext()) {
                Q1.e next = it.next();
                next.i();
                next.f29579a = false;
                l lVar = next.f29587e;
                lVar.f31637e.f31589j = false;
                lVar.f31639g = false;
                lVar.r();
                n nVar = next.f29589f;
                nVar.f31637e.f31589j = false;
                nVar.f31639g = false;
                nVar.q();
            }
            this.f31571a.i();
            Q1.f fVar = this.f31571a;
            fVar.f29579a = false;
            l lVar2 = fVar.f29587e;
            lVar2.f31637e.f31589j = false;
            lVar2.f31639g = false;
            lVar2.r();
            n nVar2 = this.f31571a.f29589f;
            nVar2.f31637e.f31589j = false;
            nVar2.f31639g = false;
            nVar2.q();
            c();
        }
        if (b(this.f31574d)) {
            return false;
        }
        this.f31571a.S0(0);
        this.f31571a.T0(0);
        this.f31571a.f29587e.f31640h.d(0);
        this.f31571a.f29589f.f31640h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarP = this.f31571a.p(0);
        e.b bVarP2 = this.f31571a.p(1);
        int iN = this.f31571a.N();
        int iO = this.f31571a.O();
        if (z10 && (bVarP == (bVar = e.b.WRAP_CONTENT) || bVarP2 == bVar)) {
            Iterator<p> it = this.f31575e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f31638f == i10 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarP == e.b.WRAP_CONTENT) {
                    this.f31571a.A0(e.b.FIXED);
                    Q1.f fVar = this.f31571a;
                    fVar.R0(e(fVar, 0));
                    Q1.f fVar2 = this.f31571a;
                    fVar2.f29587e.f31637e.d(fVar2.M());
                }
            } else if (z10 && bVarP2 == e.b.WRAP_CONTENT) {
                this.f31571a.N0(e.b.FIXED);
                Q1.f fVar3 = this.f31571a;
                fVar3.w0(e(fVar3, 1));
                Q1.f fVar4 = this.f31571a;
                fVar4.f29589f.f31637e.d(fVar4.s());
            }
        }
        if (i10 == 0) {
            Q1.f fVar5 = this.f31571a;
            e.b bVar2 = fVar5.f29577Y[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iM = fVar5.M() + iN;
                this.f31571a.f29587e.f31641i.d(iM);
                this.f31571a.f29587e.f31637e.d(iM - iN);
                z11 = true;
            }
            z11 = false;
        } else {
            Q1.f fVar6 = this.f31571a;
            e.b bVar3 = fVar6.f29577Y[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iS = fVar6.s() + iO;
                this.f31571a.f29589f.f31641i.d(iS);
                this.f31571a.f29589f.f31637e.d(iS - iO);
                z11 = true;
            }
            z11 = false;
        }
        l();
        Iterator<p> it2 = this.f31575e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f31638f == i10 && (next2.f31634b != this.f31571a || next2.f31639g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f31575e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f31638f == i10 && (z11 || next3.f31634b != this.f31571a)) {
                if (!next3.f31640h.f31589j || !next3.f31641i.f31589j || (!(next3 instanceof c) && !next3.f31637e.f31589j)) {
                    break;
                }
            }
        }
        this.f31571a.A0(bVarP);
        this.f31571a.N0(bVarP2);
        return z12;
    }

    public void l() {
        g gVar;
        Iterator<Q1.e> it = this.f31571a.f29693K0.iterator();
        while (it.hasNext()) {
            Q1.e next = it.next();
            if (!next.f29579a) {
                e.b[] bVarArr = next.f29577Y;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f29623w;
                int i11 = next.f29625x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f29587e.f31637e;
                boolean z12 = gVar2.f31589j;
                g gVar3 = next.f29589f.f31637e;
                boolean z13 = gVar3.f31589j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    k(next, bVar4, gVar2.f31586g, bVar4, gVar3.f31586g);
                    next.f29579a = true;
                } else if (z12 && z10) {
                    k(next, e.b.FIXED, gVar2.f31586g, bVar3, gVar3.f31586g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f29589f.f31637e.f31601m = next.s();
                    } else {
                        next.f29589f.f31637e.d(next.s());
                        next.f29579a = true;
                    }
                } else if (z13 && z11) {
                    k(next, bVar3, gVar2.f31586g, e.b.FIXED, gVar3.f31586g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f29587e.f31637e.f31601m = next.M();
                    } else {
                        next.f29587e.f31637e.d(next.M());
                        next.f29579a = true;
                    }
                }
                if (next.f29579a && (gVar = next.f29589f.f31616l) != null) {
                    gVar.d(next.k());
                }
            }
        }
    }

    public void m(b.InterfaceC0714b interfaceC0714b) {
        this.f31577g = interfaceC0714b;
    }

    public e(Q1.f fVar) {
        this.f31571a = fVar;
        this.f31574d = fVar;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f31574d.f29587e.f();
        this.f31574d.f29589f.f();
        arrayList.add(this.f31574d.f29587e);
        arrayList.add(this.f31574d.f29589f);
        Iterator<Q1.e> it = this.f31574d.f29693K0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            Q1.e next = it.next();
            if (next instanceof Q1.g) {
                arrayList.add(new j(next));
            } else {
                if (next.Y()) {
                    if (next.f29583c == null) {
                        next.f29583c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f29583c);
                } else {
                    arrayList.add(next.f29587e);
                }
                if (next.Z()) {
                    if (next.f29585d == null) {
                        next.f29585d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f29585d);
                } else {
                    arrayList.add(next.f29589f);
                }
                if (next instanceof Q1.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f31634b != this.f31574d) {
                next2.d();
            }
        }
    }
}
