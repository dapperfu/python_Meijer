package W1;

import W1.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class i extends m {
    @Override // W1.m
    void f() {
        this.f38394c = null;
        this.f38399h.c();
    }

    @Override // W1.m
    boolean m() {
        return false;
    }

    private void q(f fVar) {
        this.f38399h.f38367k.add(fVar);
        fVar.f38368l.add(this.f38399h);
    }

    @Override // W1.m, W1.d
    public void a(d dVar) {
        V1.a aVar = (V1.a) this.f38393b;
        int iL0 = aVar.L0();
        Iterator<f> it = this.f38399h.f38368l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f38363g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iL0 == 0 || iL0 == 2) {
            this.f38399h.d(i11 + aVar.M0());
        } else {
            this.f38399h.d(i10 + aVar.M0());
        }
    }

    @Override // W1.m
    void d() {
        V1.e eVar = this.f38393b;
        if (eVar instanceof V1.a) {
            this.f38399h.f38358b = true;
            V1.a aVar = (V1.a) eVar;
            int iL0 = aVar.L0();
            boolean zK0 = aVar.K0();
            int i10 = 0;
            if (iL0 == 0) {
                this.f38399h.f38361e = f.a.LEFT;
                while (i10 < aVar.f36752x0) {
                    V1.e eVar2 = aVar.f36751w0[i10];
                    if (zK0 || eVar2.O() != 8) {
                        f fVar = eVar2.f36632e.f38399h;
                        fVar.f38367k.add(this.f38399h);
                        this.f38399h.f38368l.add(fVar);
                    }
                    i10++;
                }
                q(this.f38393b.f36632e.f38399h);
                q(this.f38393b.f36632e.f38400i);
                return;
            }
            if (iL0 == 1) {
                this.f38399h.f38361e = f.a.RIGHT;
                while (i10 < aVar.f36752x0) {
                    V1.e eVar3 = aVar.f36751w0[i10];
                    if (zK0 || eVar3.O() != 8) {
                        f fVar2 = eVar3.f36632e.f38400i;
                        fVar2.f38367k.add(this.f38399h);
                        this.f38399h.f38368l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f38393b.f36632e.f38399h);
                q(this.f38393b.f36632e.f38400i);
                return;
            }
            if (iL0 == 2) {
                this.f38399h.f38361e = f.a.TOP;
                while (i10 < aVar.f36752x0) {
                    V1.e eVar4 = aVar.f36751w0[i10];
                    if (zK0 || eVar4.O() != 8) {
                        f fVar3 = eVar4.f36634f.f38399h;
                        fVar3.f38367k.add(this.f38399h);
                        this.f38399h.f38368l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f38393b.f36634f.f38399h);
                q(this.f38393b.f36634f.f38400i);
                return;
            }
            if (iL0 != 3) {
                return;
            }
            this.f38399h.f38361e = f.a.BOTTOM;
            while (i10 < aVar.f36752x0) {
                V1.e eVar5 = aVar.f36751w0[i10];
                if (zK0 || eVar5.O() != 8) {
                    f fVar4 = eVar5.f36634f.f38400i;
                    fVar4.f38367k.add(this.f38399h);
                    this.f38399h.f38368l.add(fVar4);
                }
                i10++;
            }
            q(this.f38393b.f36634f.f38399h);
            q(this.f38393b.f36634f.f38400i);
        }
    }

    @Override // W1.m
    public void e() {
        V1.e eVar = this.f38393b;
        if (eVar instanceof V1.a) {
            int iL0 = ((V1.a) eVar).L0();
            if (iL0 == 0 || iL0 == 1) {
                this.f38393b.F0(this.f38399h.f38363g);
            } else {
                this.f38393b.G0(this.f38399h.f38363g);
            }
        }
    }

    public i(V1.e eVar) {
        super(eVar);
    }
}
