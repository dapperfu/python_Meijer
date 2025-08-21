package R1;

/* loaded from: classes.dex */
class j extends p {
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
        f fVar = this.f31642h;
        if (fVar.f31584c && !fVar.f31591j) {
            this.f31642h.d((int) ((fVar.f31593l.get(0).f31588g * ((Q1.g) this.f31636b).b1()) + 0.5f));
        }
    }

    @Override // R1.p
    void d() {
        Q1.g gVar = (Q1.g) this.f31636b;
        int iZ0 = gVar.Z0();
        int iA1 = gVar.a1();
        gVar.b1();
        if (gVar.Y0() == 1) {
            if (iZ0 != -1) {
                this.f31642h.f31593l.add(this.f31636b.f27591Z.f27600e.f31642h);
                this.f31636b.f27591Z.f27600e.f31642h.f31592k.add(this.f31642h);
                this.f31642h.f31587f = iZ0;
            } else if (iA1 != -1) {
                this.f31642h.f31593l.add(this.f31636b.f27591Z.f27600e.f31643i);
                this.f31636b.f27591Z.f27600e.f31643i.f31592k.add(this.f31642h);
                this.f31642h.f31587f = -iA1;
            } else {
                f fVar = this.f31642h;
                fVar.f31583b = true;
                fVar.f31593l.add(this.f31636b.f27591Z.f27600e.f31643i);
                this.f31636b.f27591Z.f27600e.f31643i.f31592k.add(this.f31642h);
            }
            q(this.f31636b.f27600e.f31642h);
            q(this.f31636b.f27600e.f31643i);
            return;
        }
        if (iZ0 != -1) {
            this.f31642h.f31593l.add(this.f31636b.f27591Z.f27602f.f31642h);
            this.f31636b.f27591Z.f27602f.f31642h.f31592k.add(this.f31642h);
            this.f31642h.f31587f = iZ0;
        } else if (iA1 != -1) {
            this.f31642h.f31593l.add(this.f31636b.f27591Z.f27602f.f31643i);
            this.f31636b.f27591Z.f27602f.f31643i.f31592k.add(this.f31642h);
            this.f31642h.f31587f = -iA1;
        } else {
            f fVar2 = this.f31642h;
            fVar2.f31583b = true;
            fVar2.f31593l.add(this.f31636b.f27591Z.f27602f.f31643i);
            this.f31636b.f27591Z.f27602f.f31643i.f31592k.add(this.f31642h);
        }
        q(this.f31636b.f27602f.f31642h);
        q(this.f31636b.f27602f.f31643i);
    }

    @Override // R1.p
    public void e() {
        if (((Q1.g) this.f31636b).Y0() == 1) {
            this.f31636b.S0(this.f31642h.f31588g);
        } else {
            this.f31636b.T0(this.f31642h.f31588g);
        }
    }

    @Override // R1.p
    void f() {
        this.f31642h.c();
    }

    public j(Q1.e eVar) {
        super(eVar);
        eVar.f27600e.f();
        eVar.f27602f.f();
        this.f31640f = ((Q1.g) eVar).Y0();
    }
}
