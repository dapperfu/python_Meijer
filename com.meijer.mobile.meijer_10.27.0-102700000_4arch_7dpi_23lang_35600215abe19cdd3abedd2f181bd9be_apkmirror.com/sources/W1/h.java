package W1;

/* loaded from: classes.dex */
class h extends m {
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
        f fVar = this.f38399h;
        if (fVar.f38359c && !fVar.f38366j) {
            this.f38399h.d((int) ((fVar.f38368l.get(0).f38363g * ((V1.h) this.f38393b).N0()) + 0.5f));
        }
    }

    @Override // W1.m
    void d() {
        V1.h hVar = (V1.h) this.f38393b;
        int iL0 = hVar.L0();
        int iM0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            if (iL0 != -1) {
                this.f38399h.f38368l.add(this.f38393b.f36611N.f36632e.f38399h);
                this.f38393b.f36611N.f36632e.f38399h.f38367k.add(this.f38399h);
                this.f38399h.f38362f = iL0;
            } else if (iM0 != -1) {
                this.f38399h.f38368l.add(this.f38393b.f36611N.f36632e.f38400i);
                this.f38393b.f36611N.f36632e.f38400i.f38367k.add(this.f38399h);
                this.f38399h.f38362f = -iM0;
            } else {
                f fVar = this.f38399h;
                fVar.f38358b = true;
                fVar.f38368l.add(this.f38393b.f36611N.f36632e.f38400i);
                this.f38393b.f36611N.f36632e.f38400i.f38367k.add(this.f38399h);
            }
            q(this.f38393b.f36632e.f38399h);
            q(this.f38393b.f36632e.f38400i);
            return;
        }
        if (iL0 != -1) {
            this.f38399h.f38368l.add(this.f38393b.f36611N.f36634f.f38399h);
            this.f38393b.f36611N.f36634f.f38399h.f38367k.add(this.f38399h);
            this.f38399h.f38362f = iL0;
        } else if (iM0 != -1) {
            this.f38399h.f38368l.add(this.f38393b.f36611N.f36634f.f38400i);
            this.f38393b.f36611N.f36634f.f38400i.f38367k.add(this.f38399h);
            this.f38399h.f38362f = -iM0;
        } else {
            f fVar2 = this.f38399h;
            fVar2.f38358b = true;
            fVar2.f38368l.add(this.f38393b.f36611N.f36634f.f38400i);
            this.f38393b.f36611N.f36634f.f38400i.f38367k.add(this.f38399h);
        }
        q(this.f38393b.f36634f.f38399h);
        q(this.f38393b.f36634f.f38400i);
    }

    @Override // W1.m
    public void e() {
        if (((V1.h) this.f38393b).K0() == 1) {
            this.f38393b.F0(this.f38399h.f38363g);
        } else {
            this.f38393b.G0(this.f38399h.f38363g);
        }
    }

    @Override // W1.m
    void f() {
        this.f38399h.c();
    }

    public h(V1.e eVar) {
        super(eVar);
        eVar.f36632e.f();
        eVar.f36634f.f();
        this.f38397f = ((V1.h) eVar).K0();
    }
}
