package R1;

import R1.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f31603m;

    @Override // R1.f
    public void d(int i10) {
        if (this.f31591j) {
            return;
        }
        this.f31591j = true;
        this.f31588g = i10;
        for (d dVar : this.f31592k) {
            dVar.a(dVar);
        }
    }

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f31586e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f31586e = f.a.VERTICAL_DIMENSION;
        }
    }
}
