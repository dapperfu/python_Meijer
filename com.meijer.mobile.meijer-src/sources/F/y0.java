package F;

import C.a0;

/* loaded from: classes.dex */
public final class y0 implements C.a0 {

    /* renamed from: d, reason: collision with root package name */
    private final long f8831d;

    /* renamed from: e, reason: collision with root package name */
    private final C.a0 f8832e;

    @Override // C.a0
    public long a() {
        return this.f8831d;
    }

    @Override // C.a0
    public a0.c b(a0.b bVar) {
        a0.c cVarB = this.f8832e.b(bVar);
        return (a() <= 0 || bVar.c() < a() - cVarB.b()) ? cVarB : a0.c.f3803d;
    }

    public y0(long j10, C.a0 a0Var) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.b(z10, "Timeout must be non-negative.");
        this.f8831d = j10;
        this.f8832e = a0Var;
    }
}
