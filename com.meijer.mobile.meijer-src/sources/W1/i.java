package W1;

import W1.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class i extends m {
    @Override // W1.m
    void f() {
        this.f40682c = null;
        this.f40687h.c();
    }

    @Override // W1.m
    boolean m() {
        return false;
    }

    private void q(f fVar) {
        this.f40687h.f40655k.add(fVar);
        fVar.f40656l.add(this.f40687h);
    }

    @Override // W1.m, W1.d
    public void a(d dVar) {
        V1.a aVar = (V1.a) this.f40681b;
        int iL0 = aVar.L0();
        Iterator<f> it = this.f40687h.f40656l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f40651g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iL0 == 0 || iL0 == 2) {
            this.f40687h.d(i11 + aVar.M0());
        } else {
            this.f40687h.d(i10 + aVar.M0());
        }
    }

    @Override // W1.m
    void d() {
        V1.e eVar = this.f40681b;
        if (eVar instanceof V1.a) {
            this.f40687h.f40646b = true;
            V1.a aVar = (V1.a) eVar;
            int iL0 = aVar.L0();
            boolean zK0 = aVar.K0();
            int i10 = 0;
            if (iL0 == 0) {
                this.f40687h.f40649e = f.a.LEFT;
                while (i10 < aVar.f39612x0) {
                    V1.e eVar2 = aVar.f39611w0[i10];
                    if (zK0 || eVar2.O() != 8) {
                        f fVar = eVar2.f39492e.f40687h;
                        fVar.f40655k.add(this.f40687h);
                        this.f40687h.f40656l.add(fVar);
                    }
                    i10++;
                }
                q(this.f40681b.f39492e.f40687h);
                q(this.f40681b.f39492e.f40688i);
                return;
            }
            if (iL0 == 1) {
                this.f40687h.f40649e = f.a.RIGHT;
                while (i10 < aVar.f39612x0) {
                    V1.e eVar3 = aVar.f39611w0[i10];
                    if (zK0 || eVar3.O() != 8) {
                        f fVar2 = eVar3.f39492e.f40688i;
                        fVar2.f40655k.add(this.f40687h);
                        this.f40687h.f40656l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f40681b.f39492e.f40687h);
                q(this.f40681b.f39492e.f40688i);
                return;
            }
            if (iL0 == 2) {
                this.f40687h.f40649e = f.a.TOP;
                while (i10 < aVar.f39612x0) {
                    V1.e eVar4 = aVar.f39611w0[i10];
                    if (zK0 || eVar4.O() != 8) {
                        f fVar3 = eVar4.f39494f.f40687h;
                        fVar3.f40655k.add(this.f40687h);
                        this.f40687h.f40656l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f40681b.f39494f.f40687h);
                q(this.f40681b.f39494f.f40688i);
                return;
            }
            if (iL0 != 3) {
                return;
            }
            this.f40687h.f40649e = f.a.BOTTOM;
            while (i10 < aVar.f39612x0) {
                V1.e eVar5 = aVar.f39611w0[i10];
                if (zK0 || eVar5.O() != 8) {
                    f fVar4 = eVar5.f39494f.f40688i;
                    fVar4.f40655k.add(this.f40687h);
                    this.f40687h.f40656l.add(fVar4);
                }
                i10++;
            }
            q(this.f40681b.f39494f.f40687h);
            q(this.f40681b.f39494f.f40688i);
        }
    }

    @Override // W1.m
    public void e() {
        V1.e eVar = this.f40681b;
        if (eVar instanceof V1.a) {
            int iL0 = ((V1.a) eVar).L0();
            if (iL0 == 0 || iL0 == 1) {
                this.f40681b.F0(this.f40687h.f40651g);
            } else {
                this.f40681b.G0(this.f40687h.f40651g);
            }
        }
    }

    public i(V1.e eVar) {
        super(eVar);
    }
}
