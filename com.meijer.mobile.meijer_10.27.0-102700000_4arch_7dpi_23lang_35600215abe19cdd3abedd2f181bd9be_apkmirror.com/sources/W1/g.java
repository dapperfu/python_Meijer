package W1;

import W1.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f38378m;

    @Override // W1.f
    public void d(int i10) {
        if (this.f38366j) {
            return;
        }
        this.f38366j = true;
        this.f38363g = i10;
        for (d dVar : this.f38367k) {
            dVar.a(dVar);
        }
    }

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f38361e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f38361e = f.a.VERTICAL_DIMENSION;
        }
    }
}
