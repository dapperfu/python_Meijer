package W1;

import W1.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f40666m;

    @Override // W1.f
    public void d(int i10) {
        if (this.f40654j) {
            return;
        }
        this.f40654j = true;
        this.f40651g = i10;
        for (d dVar : this.f40655k) {
            dVar.a(dVar);
        }
    }

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f40649e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f40649e = f.a.VERTICAL_DIMENSION;
        }
    }
}
