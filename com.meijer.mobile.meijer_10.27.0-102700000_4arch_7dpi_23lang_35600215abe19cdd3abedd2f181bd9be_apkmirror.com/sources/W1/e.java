package W1;

import V1.e;
import W1.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private V1.f f38348a;

    /* renamed from: d, reason: collision with root package name */
    private V1.f f38351d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38349b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38350c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<m> f38352e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<k> f38353f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0823b f38354g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f38355h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<k> f38356i = new ArrayList<>();

    public void j() {
        this.f38349b = true;
    }

    public void k() {
        this.f38350c = true;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<k> arrayList, k kVar) {
        int i12;
        f fVar3;
        ArrayList<k> arrayList2;
        m mVar = fVar.f38360d;
        if (mVar.f38394c == null) {
            V1.f fVar4 = this.f38348a;
            if (mVar == fVar4.f36632e || mVar == fVar4.f36634f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i11);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            mVar.f38394c = kVar2;
            kVar2.a(mVar);
            for (d dVar : mVar.f38399h.f38367k) {
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
            for (d dVar2 : mVar.f38400i.f38367k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, kVar2);
                }
            }
            if (i13 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f38389k.f38367k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, kVar2);
                    }
                }
            }
            for (f fVar6 : mVar.f38399h.f38368l) {
                if (fVar6 == fVar5) {
                    kVar2.f38383b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, kVar2);
            }
            for (f fVar7 : mVar.f38400i.f38368l) {
                if (fVar7 == fVar5) {
                    kVar2.f38383b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, kVar2);
            }
            if (i13 == 1 && (mVar instanceof l)) {
                Iterator<f> it = ((l) mVar).f38389k.f38368l.iterator();
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
        int size = this.f38356i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f38356i.get(i11).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(m mVar, int i10, ArrayList<k> arrayList) {
        for (d dVar : mVar.f38399h.f38367k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, mVar.f38400i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f38399h, i10, 0, mVar.f38400i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f38400i.f38367k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, mVar.f38399h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f38400i, i10, 1, mVar.f38399h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((l) mVar).f38389k.f38367k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(V1.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f38355h;
        aVar.f38336a = bVar;
        aVar.f38337b = bVar2;
        aVar.f38338c = i10;
        aVar.f38339d = i11;
        this.f38354g.b(eVar, aVar);
        eVar.E0(this.f38355h.f38340e);
        eVar.h0(this.f38355h.f38341f);
        eVar.g0(this.f38355h.f38343h);
        eVar.b0(this.f38355h.f38342g);
    }

    public void c() {
        d(this.f38352e);
        this.f38356i.clear();
        k.f38381h = 0;
        i(this.f38348a.f36632e, 0, this.f38356i);
        i(this.f38348a.f36634f, 1, this.f38356i);
        this.f38349b = false;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f38349b || this.f38350c) {
            Iterator<V1.e> it = this.f38348a.f36767w0.iterator();
            while (it.hasNext()) {
                V1.e next = it.next();
                next.f36624a = false;
                next.f36632e.r();
                next.f36634f.q();
            }
            V1.f fVar = this.f38348a;
            fVar.f36624a = false;
            fVar.f36632e.r();
            this.f38348a.f36634f.q();
            this.f38350c = false;
        }
        if (b(this.f38351d)) {
            return false;
        }
        this.f38348a.F0(0);
        this.f38348a.G0(0);
        e.b bVarS = this.f38348a.s(0);
        e.b bVarS2 = this.f38348a.s(1);
        if (this.f38349b) {
            c();
        }
        int iQ = this.f38348a.Q();
        int iR = this.f38348a.R();
        this.f38348a.f36632e.f38399h.d(iQ);
        this.f38348a.f36634f.f38399h.d(iR);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z10) {
                Iterator<m> it2 = this.f38352e.iterator();
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
                this.f38348a.l0(e.b.FIXED);
                V1.f fVar2 = this.f38348a;
                fVar2.E0(e(fVar2, 0));
                V1.f fVar3 = this.f38348a;
                fVar3.f36632e.f38396e.d(fVar3.P());
            }
            if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f38348a.A0(e.b.FIXED);
                V1.f fVar4 = this.f38348a;
                fVar4.h0(e(fVar4, 1));
                V1.f fVar5 = this.f38348a;
                fVar5.f36634f.f38396e.d(fVar5.v());
            }
        }
        V1.f fVar6 = this.f38348a;
        e.b bVar2 = fVar6.f36610M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iP = fVar6.P() + iQ;
            this.f38348a.f36632e.f38400i.d(iP);
            this.f38348a.f36632e.f38396e.d(iP - iQ);
            m();
            V1.f fVar7 = this.f38348a;
            e.b bVar4 = fVar7.f36610M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iV = fVar7.v() + iR;
                this.f38348a.f36634f.f38400i.d(iV);
                this.f38348a.f36634f.f38396e.d(iV - iR);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<m> it3 = this.f38352e.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f38393b != this.f38348a || next2.f38398g) {
                next2.e();
            }
        }
        Iterator<m> it4 = this.f38352e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            m next3 = it4.next();
            if (z11 || next3.f38393b != this.f38348a) {
                if (!next3.f38399h.f38366j || ((!next3.f38400i.f38366j && !(next3 instanceof h)) || (!next3.f38396e.f38366j && !(next3 instanceof c) && !(next3 instanceof h)))) {
                    break;
                }
            }
        }
        this.f38348a.l0(bVarS);
        this.f38348a.A0(bVarS2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f38349b) {
            Iterator<V1.e> it = this.f38348a.f36767w0.iterator();
            while (it.hasNext()) {
                V1.e next = it.next();
                next.f36624a = false;
                j jVar = next.f36632e;
                jVar.f38396e.f38366j = false;
                jVar.f38398g = false;
                jVar.r();
                l lVar = next.f36634f;
                lVar.f38396e.f38366j = false;
                lVar.f38398g = false;
                lVar.q();
            }
            V1.f fVar = this.f38348a;
            fVar.f36624a = false;
            j jVar2 = fVar.f36632e;
            jVar2.f38396e.f38366j = false;
            jVar2.f38398g = false;
            jVar2.r();
            l lVar2 = this.f38348a.f36634f;
            lVar2.f38396e.f38366j = false;
            lVar2.f38398g = false;
            lVar2.q();
            c();
        }
        if (b(this.f38351d)) {
            return false;
        }
        this.f38348a.F0(0);
        this.f38348a.G0(0);
        this.f38348a.f36632e.f38399h.d(0);
        this.f38348a.f36634f.f38399h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = false;
        e.b bVarS = this.f38348a.s(0);
        e.b bVarS2 = this.f38348a.s(1);
        int iQ = this.f38348a.Q();
        int iR = this.f38348a.R();
        if (z10 && (bVarS == (bVar = e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator<m> it = this.f38352e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f38397f == i10 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarS == e.b.WRAP_CONTENT) {
                    this.f38348a.l0(e.b.FIXED);
                    V1.f fVar = this.f38348a;
                    fVar.E0(e(fVar, 0));
                    V1.f fVar2 = this.f38348a;
                    fVar2.f36632e.f38396e.d(fVar2.P());
                }
            } else if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f38348a.A0(e.b.FIXED);
                V1.f fVar3 = this.f38348a;
                fVar3.h0(e(fVar3, 1));
                V1.f fVar4 = this.f38348a;
                fVar4.f36634f.f38396e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            V1.f fVar5 = this.f38348a;
            e.b bVar2 = fVar5.f36610M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iP = fVar5.P() + iQ;
                this.f38348a.f36632e.f38400i.d(iP);
                this.f38348a.f36632e.f38396e.d(iP - iQ);
                z11 = true;
            }
            z11 = false;
        } else {
            V1.f fVar6 = this.f38348a;
            e.b bVar3 = fVar6.f36610M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iV = fVar6.v() + iR;
                this.f38348a.f36634f.f38400i.d(iV);
                this.f38348a.f36634f.f38396e.d(iV - iR);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<m> it2 = this.f38352e.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.f38397f == i10 && (next2.f38393b != this.f38348a || next2.f38398g)) {
                next2.e();
            }
        }
        Iterator<m> it3 = this.f38352e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            m next3 = it3.next();
            if (next3.f38397f == i10 && (z11 || next3.f38393b != this.f38348a)) {
                if (!next3.f38399h.f38366j || !next3.f38400i.f38366j || (!(next3 instanceof c) && !next3.f38396e.f38366j)) {
                    break;
                }
            }
        }
        this.f38348a.l0(bVarS);
        this.f38348a.A0(bVarS2);
        return z12;
    }

    public void m() {
        g gVar;
        Iterator<V1.e> it = this.f38348a.f36767w0.iterator();
        while (it.hasNext()) {
            V1.e next = it.next();
            if (!next.f36624a) {
                e.b[] bVarArr = next.f36610M;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f36646l;
                int i11 = next.f36648m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f36632e.f38396e;
                boolean z12 = gVar2.f38366j;
                g gVar3 = next.f36634f.f38396e;
                boolean z13 = gVar3.f38366j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f38363g, bVar4, gVar3.f38363g);
                    next.f36624a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f38363g, bVar3, gVar3.f38363g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f36634f.f38396e.f38378m = next.v();
                    } else {
                        next.f36634f.f38396e.d(next.v());
                        next.f36624a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f38363g, e.b.FIXED, gVar3.f38363g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f36632e.f38396e.f38378m = next.P();
                    } else {
                        next.f36632e.f38396e.d(next.P());
                        next.f36624a = true;
                    }
                }
                if (next.f36624a && (gVar = next.f36634f.f38390l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0823b interfaceC0823b) {
        this.f38354g = interfaceC0823b;
    }

    public e(V1.f fVar) {
        this.f38348a = fVar;
        this.f38351d = fVar;
    }

    public void d(ArrayList<m> arrayList) {
        arrayList.clear();
        this.f38351d.f36632e.f();
        this.f38351d.f36634f.f();
        arrayList.add(this.f38351d.f36632e);
        arrayList.add(this.f38351d.f36634f);
        Iterator<V1.e> it = this.f38351d.f36767w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            V1.e next = it.next();
            if (next instanceof V1.h) {
                arrayList.add(new h(next));
            } else {
                if (next.V()) {
                    if (next.f36628c == null) {
                        next.f36628c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f36628c);
                } else {
                    arrayList.add(next.f36632e);
                }
                if (next.X()) {
                    if (next.f36630d == null) {
                        next.f36630d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f36630d);
                } else {
                    arrayList.add(next.f36634f);
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
            if (next2.f38393b != this.f38351d) {
                next2.d();
            }
        }
    }
}
