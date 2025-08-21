package W1;

/* loaded from: classes.dex */
class h extends m {
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
        f fVar = this.f40687h;
        if (fVar.f40647c && !fVar.f40654j) {
            this.f40687h.d((int) ((fVar.f40656l.get(0).f40651g * ((V1.h) this.f40681b).N0()) + 0.5f));
        }
    }

    @Override // W1.m
    void d() {
        V1.h hVar = (V1.h) this.f40681b;
        int iL0 = hVar.L0();
        int iM0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            if (iL0 != -1) {
                this.f40687h.f40656l.add(this.f40681b.f39471N.f39492e.f40687h);
                this.f40681b.f39471N.f39492e.f40687h.f40655k.add(this.f40687h);
                this.f40687h.f40650f = iL0;
            } else if (iM0 != -1) {
                this.f40687h.f40656l.add(this.f40681b.f39471N.f39492e.f40688i);
                this.f40681b.f39471N.f39492e.f40688i.f40655k.add(this.f40687h);
                this.f40687h.f40650f = -iM0;
            } else {
                f fVar = this.f40687h;
                fVar.f40646b = true;
                fVar.f40656l.add(this.f40681b.f39471N.f39492e.f40688i);
                this.f40681b.f39471N.f39492e.f40688i.f40655k.add(this.f40687h);
            }
            q(this.f40681b.f39492e.f40687h);
            q(this.f40681b.f39492e.f40688i);
            return;
        }
        if (iL0 != -1) {
            this.f40687h.f40656l.add(this.f40681b.f39471N.f39494f.f40687h);
            this.f40681b.f39471N.f39494f.f40687h.f40655k.add(this.f40687h);
            this.f40687h.f40650f = iL0;
        } else if (iM0 != -1) {
            this.f40687h.f40656l.add(this.f40681b.f39471N.f39494f.f40688i);
            this.f40681b.f39471N.f39494f.f40688i.f40655k.add(this.f40687h);
            this.f40687h.f40650f = -iM0;
        } else {
            f fVar2 = this.f40687h;
            fVar2.f40646b = true;
            fVar2.f40656l.add(this.f40681b.f39471N.f39494f.f40688i);
            this.f40681b.f39471N.f39494f.f40688i.f40655k.add(this.f40687h);
        }
        q(this.f40681b.f39494f.f40687h);
        q(this.f40681b.f39494f.f40688i);
    }

    @Override // W1.m
    public void e() {
        if (((V1.h) this.f40681b).K0() == 1) {
            this.f40681b.F0(this.f40687h.f40651g);
        } else {
            this.f40681b.G0(this.f40687h.f40651g);
        }
    }

    @Override // W1.m
    void f() {
        this.f40687h.c();
    }

    public h(V1.e eVar) {
        super(eVar);
        eVar.f39492e.f();
        eVar.f39494f.f();
        this.f40685f = ((V1.h) eVar).K0();
    }
}
