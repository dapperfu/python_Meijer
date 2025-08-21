package R1;

import R1.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends p {
    @Override // R1.p
    void f() {
        this.f31637c = null;
        this.f31642h.c();
    }

    @Override // R1.p
    boolean m() {
        return false;
    }

    private void q(f fVar) {
        this.f31642h.f31592k.add(fVar);
        fVar.f31593l.add(this.f31642h);
    }

    @Override // R1.p, R1.d
    public void a(d dVar) {
        Q1.a aVar = (Q1.a) this.f31636b;
        int iC1 = aVar.c1();
        Iterator<f> it = this.f31642h.f31593l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f31588g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iC1 == 0 || iC1 == 2) {
            this.f31642h.d(i11 + aVar.d1());
        } else {
            this.f31642h.d(i10 + aVar.d1());
        }
    }

    @Override // R1.p
    void d() {
        Q1.e eVar = this.f31636b;
        if (eVar instanceof Q1.a) {
            this.f31642h.f31583b = true;
            Q1.a aVar = (Q1.a) eVar;
            int iC1 = aVar.c1();
            boolean zB1 = aVar.b1();
            int i10 = 0;
            if (iC1 == 0) {
                this.f31642h.f31586e = f.a.LEFT;
                while (i10 < aVar.f27691L0) {
                    Q1.e eVar2 = aVar.f27690K0[i10];
                    if (zB1 || eVar2.L() != 8) {
                        f fVar = eVar2.f27600e.f31642h;
                        fVar.f31592k.add(this.f31642h);
                        this.f31642h.f31593l.add(fVar);
                    }
                    i10++;
                }
                q(this.f31636b.f27600e.f31642h);
                q(this.f31636b.f27600e.f31643i);
                return;
            }
            if (iC1 == 1) {
                this.f31642h.f31586e = f.a.RIGHT;
                while (i10 < aVar.f27691L0) {
                    Q1.e eVar3 = aVar.f27690K0[i10];
                    if (zB1 || eVar3.L() != 8) {
                        f fVar2 = eVar3.f27600e.f31643i;
                        fVar2.f31592k.add(this.f31642h);
                        this.f31642h.f31593l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f31636b.f27600e.f31642h);
                q(this.f31636b.f27600e.f31643i);
                return;
            }
            if (iC1 == 2) {
                this.f31642h.f31586e = f.a.TOP;
                while (i10 < aVar.f27691L0) {
                    Q1.e eVar4 = aVar.f27690K0[i10];
                    if (zB1 || eVar4.L() != 8) {
                        f fVar3 = eVar4.f27602f.f31642h;
                        fVar3.f31592k.add(this.f31642h);
                        this.f31642h.f31593l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f31636b.f27602f.f31642h);
                q(this.f31636b.f27602f.f31643i);
                return;
            }
            if (iC1 != 3) {
                return;
            }
            this.f31642h.f31586e = f.a.BOTTOM;
            while (i10 < aVar.f27691L0) {
                Q1.e eVar5 = aVar.f27690K0[i10];
                if (zB1 || eVar5.L() != 8) {
                    f fVar4 = eVar5.f27602f.f31643i;
                    fVar4.f31592k.add(this.f31642h);
                    this.f31642h.f31593l.add(fVar4);
                }
                i10++;
            }
            q(this.f31636b.f27602f.f31642h);
            q(this.f31636b.f27602f.f31643i);
        }
    }

    @Override // R1.p
    public void e() {
        Q1.e eVar = this.f31636b;
        if (eVar instanceof Q1.a) {
            int iC1 = ((Q1.a) eVar).c1();
            if (iC1 == 0 || iC1 == 1) {
                this.f31636b.S0(this.f31642h.f31588g);
            } else {
                this.f31636b.T0(this.f31642h.f31588g);
            }
        }
    }

    public k(Q1.e eVar) {
        super(eVar);
    }
}
