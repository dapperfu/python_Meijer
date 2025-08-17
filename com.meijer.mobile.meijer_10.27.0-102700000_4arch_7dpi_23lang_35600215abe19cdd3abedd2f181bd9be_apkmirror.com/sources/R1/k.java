package R1;

import R1.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends p {
    @Override // R1.p
    void f() {
        this.f31635c = null;
        this.f31640h.c();
    }

    @Override // R1.p
    boolean m() {
        return false;
    }

    private void q(f fVar) {
        this.f31640h.f31590k.add(fVar);
        fVar.f31591l.add(this.f31640h);
    }

    @Override // R1.p, R1.d
    public void a(d dVar) {
        Q1.a aVar = (Q1.a) this.f31634b;
        int iC1 = aVar.c1();
        Iterator<f> it = this.f31640h.f31591l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f31586g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iC1 == 0 || iC1 == 2) {
            this.f31640h.d(i11 + aVar.d1());
        } else {
            this.f31640h.d(i10 + aVar.d1());
        }
    }

    @Override // R1.p
    void d() {
        Q1.e eVar = this.f31634b;
        if (eVar instanceof Q1.a) {
            this.f31640h.f31581b = true;
            Q1.a aVar = (Q1.a) eVar;
            int iC1 = aVar.c1();
            boolean zB1 = aVar.b1();
            int i10 = 0;
            if (iC1 == 0) {
                this.f31640h.f31584e = f.a.LEFT;
                while (i10 < aVar.f29678L0) {
                    Q1.e eVar2 = aVar.f29677K0[i10];
                    if (zB1 || eVar2.L() != 8) {
                        f fVar = eVar2.f29587e.f31640h;
                        fVar.f31590k.add(this.f31640h);
                        this.f31640h.f31591l.add(fVar);
                    }
                    i10++;
                }
                q(this.f31634b.f29587e.f31640h);
                q(this.f31634b.f29587e.f31641i);
                return;
            }
            if (iC1 == 1) {
                this.f31640h.f31584e = f.a.RIGHT;
                while (i10 < aVar.f29678L0) {
                    Q1.e eVar3 = aVar.f29677K0[i10];
                    if (zB1 || eVar3.L() != 8) {
                        f fVar2 = eVar3.f29587e.f31641i;
                        fVar2.f31590k.add(this.f31640h);
                        this.f31640h.f31591l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f31634b.f29587e.f31640h);
                q(this.f31634b.f29587e.f31641i);
                return;
            }
            if (iC1 == 2) {
                this.f31640h.f31584e = f.a.TOP;
                while (i10 < aVar.f29678L0) {
                    Q1.e eVar4 = aVar.f29677K0[i10];
                    if (zB1 || eVar4.L() != 8) {
                        f fVar3 = eVar4.f29589f.f31640h;
                        fVar3.f31590k.add(this.f31640h);
                        this.f31640h.f31591l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f31634b.f29589f.f31640h);
                q(this.f31634b.f29589f.f31641i);
                return;
            }
            if (iC1 != 3) {
                return;
            }
            this.f31640h.f31584e = f.a.BOTTOM;
            while (i10 < aVar.f29678L0) {
                Q1.e eVar5 = aVar.f29677K0[i10];
                if (zB1 || eVar5.L() != 8) {
                    f fVar4 = eVar5.f29589f.f31641i;
                    fVar4.f31590k.add(this.f31640h);
                    this.f31640h.f31591l.add(fVar4);
                }
                i10++;
            }
            q(this.f31634b.f29589f.f31640h);
            q(this.f31634b.f29589f.f31641i);
        }
    }

    @Override // R1.p
    public void e() {
        Q1.e eVar = this.f31634b;
        if (eVar instanceof Q1.a) {
            int iC1 = ((Q1.a) eVar).c1();
            if (iC1 == 0 || iC1 == 1) {
                this.f31634b.S0(this.f31640h.f31586g);
            } else {
                this.f31634b.T0(this.f31640h.f31586g);
            }
        }
    }

    public k(Q1.e eVar) {
        super(eVar);
    }
}
