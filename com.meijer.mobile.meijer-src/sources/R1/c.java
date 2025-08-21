package R1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f31571k;

    /* renamed from: l, reason: collision with root package name */
    private int f31572l;

    private Q1.e r() {
        for (int i10 = 0; i10 < this.f31571k.size(); i10++) {
            p pVar = this.f31571k.get(i10);
            if (pVar.f31636b.L() != 8) {
                return pVar.f31636b;
            }
        }
        return null;
    }

    @Override // R1.p
    public void e() {
        for (int i10 = 0; i10 < this.f31571k.size(); i10++) {
            this.f31571k.get(i10).e();
        }
    }

    @Override // R1.p
    void f() {
        this.f31637c = null;
        Iterator<p> it = this.f31571k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    private void q() {
        Q1.e eVar;
        Q1.e eVar2 = this.f31636b;
        Q1.e eVarE = eVar2.E(this.f31640f);
        while (true) {
            Q1.e eVar3 = eVarE;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarE = eVar2.E(this.f31640f);
            }
        }
        this.f31636b = eVar;
        this.f31571k.add(eVar.G(this.f31640f));
        Q1.e eVarC = eVar.C(this.f31640f);
        while (eVarC != null) {
            this.f31571k.add(eVarC.G(this.f31640f));
            eVarC = eVarC.C(this.f31640f);
        }
        Iterator<p> it = this.f31571k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f31640f;
            if (i10 == 0) {
                next.f31636b.f27596c = this;
            } else if (i10 == 1) {
                next.f31636b.f27598d = this;
            }
        }
        if (this.f31640f == 0 && ((Q1.f) this.f31636b.D()).t1() && this.f31571k.size() > 1) {
            ArrayList<p> arrayList = this.f31571k;
            this.f31636b = arrayList.get(arrayList.size() - 1).f31636b;
        }
        this.f31572l = this.f31640f == 0 ? this.f31636b.u() : this.f31636b.J();
    }

    private Q1.e s() {
        for (int size = this.f31571k.size() - 1; size >= 0; size--) {
            p pVar = this.f31571k.get(size);
            if (pVar.f31636b.L() != 8) {
                return pVar.f31636b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // R1.p, R1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(R1.d r27) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.c.a(R1.d):void");
    }

    @Override // R1.p
    void d() {
        Iterator<p> it = this.f31571k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f31571k.size();
        if (size < 1) {
            return;
        }
        Q1.e eVar = this.f31571k.get(0).f31636b;
        Q1.e eVar2 = this.f31571k.get(size - 1).f31636b;
        if (this.f31640f == 0) {
            Q1.d dVar = eVar.f27579N;
            Q1.d dVar2 = eVar2.f27581P;
            f fVarI = i(dVar, 0);
            int iE = dVar.e();
            Q1.e eVarR = r();
            if (eVarR != null) {
                iE = eVarR.f27579N.e();
            }
            if (fVarI != null) {
                b(this.f31642h, fVarI, iE);
            }
            f fVarI2 = i(dVar2, 0);
            int iE2 = dVar2.e();
            Q1.e eVarS = s();
            if (eVarS != null) {
                iE2 = eVarS.f27581P.e();
            }
            if (fVarI2 != null) {
                b(this.f31643i, fVarI2, -iE2);
            }
        } else {
            Q1.d dVar3 = eVar.f27580O;
            Q1.d dVar4 = eVar2.f27582Q;
            f fVarI3 = i(dVar3, 1);
            int iE3 = dVar3.e();
            Q1.e eVarR2 = r();
            if (eVarR2 != null) {
                iE3 = eVarR2.f27580O.e();
            }
            if (fVarI3 != null) {
                b(this.f31642h, fVarI3, iE3);
            }
            f fVarI4 = i(dVar4, 1);
            int iE4 = dVar4.e();
            Q1.e eVarS2 = s();
            if (eVarS2 != null) {
                iE4 = eVarS2.f27582Q.e();
            }
            if (fVarI4 != null) {
                b(this.f31643i, fVarI4, -iE4);
            }
        }
        this.f31642h.f31582a = this;
        this.f31643i.f31582a = this;
    }

    @Override // R1.p
    public long j() {
        int size = this.f31571k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f31642h.f31587f + this.f31571k.get(i10).j() + r4.f31643i.f31587f;
        }
        return j10;
    }

    @Override // R1.p
    boolean m() {
        int size = this.f31571k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f31571k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f31640f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f31571k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }

    public c(Q1.e eVar, int i10) {
        super(eVar);
        this.f31571k = new ArrayList<>();
        this.f31640f = i10;
        q();
    }
}
