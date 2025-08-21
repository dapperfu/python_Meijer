package R1;

import Q1.e;
import R1.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Q1.f f31573a;

    /* renamed from: d, reason: collision with root package name */
    private Q1.f f31576d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31574b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31575c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f31577e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f31578f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0733b f31579g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f31580h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f31581i = new ArrayList<>();

    public void j() {
        this.f31574b = true;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.f31585d;
        if (pVar.f31637c == null) {
            Q1.f fVar4 = this.f31573a;
            if (pVar == fVar4.f27600e || pVar == fVar4.f27602f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f31637c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f31642h.f31592k) {
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
            for (d dVar2 : pVar.f31643i.f31592k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f31617k.f31592k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f31642h.f31593l) {
                if (fVar6 == fVar5) {
                    mVar2.f31611b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f31643i.f31593l) {
                if (fVar7 == fVar5) {
                    mVar2.f31611b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f31617k.f31593l.iterator();
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
        int size = this.f31581i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f31581i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f31642h.f31592k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f31643i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f31642h, i10, 0, pVar.f31643i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f31643i.f31592k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f31642h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f31643i, i10, 1, pVar.f31642h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f31617k.f31592k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void k(Q1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f31580h;
        aVar.f31561a = bVar;
        aVar.f31562b = bVar2;
        aVar.f31563c = i10;
        aVar.f31564d = i11;
        this.f31579g.b(eVar, aVar);
        eVar.R0(this.f31580h.f31565e);
        eVar.w0(this.f31580h.f31566f);
        eVar.v0(this.f31580h.f31568h);
        eVar.l0(this.f31580h.f31567g);
    }

    public void c() {
        d(this.f31577e);
        this.f31581i.clear();
        m.f31609h = 0;
        i(this.f31573a.f27600e, 0, this.f31581i);
        i(this.f31573a.f27602f, 1, this.f31581i);
        this.f31574b = false;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f31574b || this.f31575c) {
            Iterator<Q1.e> it = this.f31573a.f27706K0.iterator();
            while (it.hasNext()) {
                Q1.e next = it.next();
                next.i();
                next.f27592a = false;
                next.f27600e.r();
                next.f27602f.q();
            }
            this.f31573a.i();
            Q1.f fVar = this.f31573a;
            fVar.f27592a = false;
            fVar.f27600e.r();
            this.f31573a.f27602f.q();
            this.f31575c = false;
        }
        if (b(this.f31576d)) {
            return false;
        }
        this.f31573a.S0(0);
        this.f31573a.T0(0);
        e.b bVarP = this.f31573a.p(0);
        e.b bVarP2 = this.f31573a.p(1);
        if (this.f31574b) {
            c();
        }
        int iN = this.f31573a.N();
        int iO = this.f31573a.O();
        this.f31573a.f27600e.f31642h.d(iN);
        this.f31573a.f27602f.f31642h.d(iO);
        l();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarP == bVar || bVarP2 == bVar) {
            if (z10) {
                Iterator<p> it2 = this.f31577e.iterator();
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
                this.f31573a.A0(e.b.FIXED);
                Q1.f fVar2 = this.f31573a;
                fVar2.R0(e(fVar2, 0));
                Q1.f fVar3 = this.f31573a;
                fVar3.f27600e.f31639e.d(fVar3.M());
            }
            if (z10 && bVarP2 == e.b.WRAP_CONTENT) {
                this.f31573a.N0(e.b.FIXED);
                Q1.f fVar4 = this.f31573a;
                fVar4.w0(e(fVar4, 1));
                Q1.f fVar5 = this.f31573a;
                fVar5.f27602f.f31639e.d(fVar5.s());
            }
        }
        Q1.f fVar6 = this.f31573a;
        e.b bVar2 = fVar6.f27590Y[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iM = fVar6.M() + iN;
            this.f31573a.f27600e.f31643i.d(iM);
            this.f31573a.f27600e.f31639e.d(iM - iN);
            l();
            Q1.f fVar7 = this.f31573a;
            e.b bVar4 = fVar7.f27590Y[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iS = fVar7.s() + iO;
                this.f31573a.f27602f.f31643i.d(iS);
                this.f31573a.f27602f.f31639e.d(iS - iO);
            }
            l();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f31577e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f31636b != this.f31573a || next2.f31641g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f31577e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it4.next();
            if (z11 || next3.f31636b != this.f31573a) {
                if (!next3.f31642h.f31591j || ((!next3.f31643i.f31591j && !(next3 instanceof j)) || (!next3.f31639e.f31591j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    break;
                }
            }
        }
        this.f31573a.A0(bVarP);
        this.f31573a.N0(bVarP2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f31574b) {
            Iterator<Q1.e> it = this.f31573a.f27706K0.iterator();
            while (it.hasNext()) {
                Q1.e next = it.next();
                next.i();
                next.f27592a = false;
                l lVar = next.f27600e;
                lVar.f31639e.f31591j = false;
                lVar.f31641g = false;
                lVar.r();
                n nVar = next.f27602f;
                nVar.f31639e.f31591j = false;
                nVar.f31641g = false;
                nVar.q();
            }
            this.f31573a.i();
            Q1.f fVar = this.f31573a;
            fVar.f27592a = false;
            l lVar2 = fVar.f27600e;
            lVar2.f31639e.f31591j = false;
            lVar2.f31641g = false;
            lVar2.r();
            n nVar2 = this.f31573a.f27602f;
            nVar2.f31639e.f31591j = false;
            nVar2.f31641g = false;
            nVar2.q();
            c();
        }
        if (b(this.f31576d)) {
            return false;
        }
        this.f31573a.S0(0);
        this.f31573a.T0(0);
        this.f31573a.f27600e.f31642h.d(0);
        this.f31573a.f27602f.f31642h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarP = this.f31573a.p(0);
        e.b bVarP2 = this.f31573a.p(1);
        int iN = this.f31573a.N();
        int iO = this.f31573a.O();
        if (z10 && (bVarP == (bVar = e.b.WRAP_CONTENT) || bVarP2 == bVar)) {
            Iterator<p> it = this.f31577e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f31640f == i10 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarP == e.b.WRAP_CONTENT) {
                    this.f31573a.A0(e.b.FIXED);
                    Q1.f fVar = this.f31573a;
                    fVar.R0(e(fVar, 0));
                    Q1.f fVar2 = this.f31573a;
                    fVar2.f27600e.f31639e.d(fVar2.M());
                }
            } else if (z10 && bVarP2 == e.b.WRAP_CONTENT) {
                this.f31573a.N0(e.b.FIXED);
                Q1.f fVar3 = this.f31573a;
                fVar3.w0(e(fVar3, 1));
                Q1.f fVar4 = this.f31573a;
                fVar4.f27602f.f31639e.d(fVar4.s());
            }
        }
        if (i10 == 0) {
            Q1.f fVar5 = this.f31573a;
            e.b bVar2 = fVar5.f27590Y[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iM = fVar5.M() + iN;
                this.f31573a.f27600e.f31643i.d(iM);
                this.f31573a.f27600e.f31639e.d(iM - iN);
                z11 = true;
            }
            z11 = false;
        } else {
            Q1.f fVar6 = this.f31573a;
            e.b bVar3 = fVar6.f27590Y[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iS = fVar6.s() + iO;
                this.f31573a.f27602f.f31643i.d(iS);
                this.f31573a.f27602f.f31639e.d(iS - iO);
                z11 = true;
            }
            z11 = false;
        }
        l();
        Iterator<p> it2 = this.f31577e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f31640f == i10 && (next2.f31636b != this.f31573a || next2.f31641g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f31577e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f31640f == i10 && (z11 || next3.f31636b != this.f31573a)) {
                if (!next3.f31642h.f31591j || !next3.f31643i.f31591j || (!(next3 instanceof c) && !next3.f31639e.f31591j)) {
                    break;
                }
            }
        }
        this.f31573a.A0(bVarP);
        this.f31573a.N0(bVarP2);
        return z12;
    }

    public void l() {
        g gVar;
        Iterator<Q1.e> it = this.f31573a.f27706K0.iterator();
        while (it.hasNext()) {
            Q1.e next = it.next();
            if (!next.f27592a) {
                e.b[] bVarArr = next.f27590Y;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f27636w;
                int i11 = next.f27638x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f27600e.f31639e;
                boolean z12 = gVar2.f31591j;
                g gVar3 = next.f27602f.f31639e;
                boolean z13 = gVar3.f31591j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    k(next, bVar4, gVar2.f31588g, bVar4, gVar3.f31588g);
                    next.f27592a = true;
                } else if (z12 && z10) {
                    k(next, e.b.FIXED, gVar2.f31588g, bVar3, gVar3.f31588g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f27602f.f31639e.f31603m = next.s();
                    } else {
                        next.f27602f.f31639e.d(next.s());
                        next.f27592a = true;
                    }
                } else if (z13 && z11) {
                    k(next, bVar3, gVar2.f31588g, e.b.FIXED, gVar3.f31588g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f27600e.f31639e.f31603m = next.M();
                    } else {
                        next.f27600e.f31639e.d(next.M());
                        next.f27592a = true;
                    }
                }
                if (next.f27592a && (gVar = next.f27602f.f31618l) != null) {
                    gVar.d(next.k());
                }
            }
        }
    }

    public void m(b.InterfaceC0733b interfaceC0733b) {
        this.f31579g = interfaceC0733b;
    }

    public e(Q1.f fVar) {
        this.f31573a = fVar;
        this.f31576d = fVar;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f31576d.f27600e.f();
        this.f31576d.f27602f.f();
        arrayList.add(this.f31576d.f27600e);
        arrayList.add(this.f31576d.f27602f);
        Iterator<Q1.e> it = this.f31576d.f27706K0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            Q1.e next = it.next();
            if (next instanceof Q1.g) {
                arrayList.add(new j(next));
            } else {
                if (next.Y()) {
                    if (next.f27596c == null) {
                        next.f27596c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f27596c);
                } else {
                    arrayList.add(next.f27600e);
                }
                if (next.Z()) {
                    if (next.f27598d == null) {
                        next.f27598d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f27598d);
                } else {
                    arrayList.add(next.f27602f);
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
            if (next2.f31636b != this.f31576d) {
                next2.d();
            }
        }
    }
}
