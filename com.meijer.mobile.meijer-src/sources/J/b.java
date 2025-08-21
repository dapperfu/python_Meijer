package J;

import C.I;
import F.r;
import F.x0;
import G.h;

/* loaded from: classes.dex */
public final class b implements I {

    /* renamed from: a, reason: collision with root package name */
    private final r f15301a;

    @Override // C.I
    public int c() {
        return 0;
    }

    @Override // C.I
    public x0 a() {
        return this.f15301a.a();
    }

    @Override // C.I
    public void b(h.b bVar) {
        this.f15301a.b(bVar);
    }

    public r d() {
        return this.f15301a;
    }

    @Override // C.I
    public long getTimestamp() {
        return this.f15301a.getTimestamp();
    }

    public b(r rVar) {
        this.f15301a = rVar;
    }
}
