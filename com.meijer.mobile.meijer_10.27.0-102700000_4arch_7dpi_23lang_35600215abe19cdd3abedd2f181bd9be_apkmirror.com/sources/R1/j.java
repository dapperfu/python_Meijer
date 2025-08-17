package R1;

/* loaded from: classes.dex */
class j extends p {
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
        f fVar = this.f31640h;
        if (fVar.f31582c && !fVar.f31589j) {
            this.f31640h.d((int) ((fVar.f31591l.get(0).f31586g * ((Q1.g) this.f31634b).b1()) + 0.5f));
        }
    }

    @Override // R1.p
    void d() {
        Q1.g gVar = (Q1.g) this.f31634b;
        int iZ0 = gVar.Z0();
        int iA1 = gVar.a1();
        gVar.b1();
        if (gVar.Y0() == 1) {
            if (iZ0 != -1) {
                this.f31640h.f31591l.add(this.f31634b.f29578Z.f29587e.f31640h);
                this.f31634b.f29578Z.f29587e.f31640h.f31590k.add(this.f31640h);
                this.f31640h.f31585f = iZ0;
            } else if (iA1 != -1) {
                this.f31640h.f31591l.add(this.f31634b.f29578Z.f29587e.f31641i);
                this.f31634b.f29578Z.f29587e.f31641i.f31590k.add(this.f31640h);
                this.f31640h.f31585f = -iA1;
            } else {
                f fVar = this.f31640h;
                fVar.f31581b = true;
                fVar.f31591l.add(this.f31634b.f29578Z.f29587e.f31641i);
                this.f31634b.f29578Z.f29587e.f31641i.f31590k.add(this.f31640h);
            }
            q(this.f31634b.f29587e.f31640h);
            q(this.f31634b.f29587e.f31641i);
            return;
        }
        if (iZ0 != -1) {
            this.f31640h.f31591l.add(this.f31634b.f29578Z.f29589f.f31640h);
            this.f31634b.f29578Z.f29589f.f31640h.f31590k.add(this.f31640h);
            this.f31640h.f31585f = iZ0;
        } else if (iA1 != -1) {
            this.f31640h.f31591l.add(this.f31634b.f29578Z.f29589f.f31641i);
            this.f31634b.f29578Z.f29589f.f31641i.f31590k.add(this.f31640h);
            this.f31640h.f31585f = -iA1;
        } else {
            f fVar2 = this.f31640h;
            fVar2.f31581b = true;
            fVar2.f31591l.add(this.f31634b.f29578Z.f29589f.f31641i);
            this.f31634b.f29578Z.f29589f.f31641i.f31590k.add(this.f31640h);
        }
        q(this.f31634b.f29589f.f31640h);
        q(this.f31634b.f29589f.f31641i);
    }

    @Override // R1.p
    public void e() {
        if (((Q1.g) this.f31634b).Y0() == 1) {
            this.f31634b.S0(this.f31640h.f31586g);
        } else {
            this.f31634b.T0(this.f31640h.f31586g);
        }
    }

    @Override // R1.p
    void f() {
        this.f31640h.c();
    }

    public j(Q1.e eVar) {
        super(eVar);
        eVar.f29587e.f();
        eVar.f29589f.f();
        this.f31638f = ((Q1.g) eVar).Y0();
    }
}
