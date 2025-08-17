package J8;

import g8.q;
import g8.w;

/* loaded from: classes4.dex */
public class f extends q {

    /* renamed from: A, reason: collision with root package name */
    private z8.c f14725A;

    /* renamed from: B, reason: collision with root package name */
    private A8.a<G8.a> f14726B;

    public f(String str, e eVar) {
        super(str, w.f133170c, eVar.b(), eVar.f(), eVar.e(), false, eVar.g());
    }

    public void O(A8.a<G8.a> aVar, z8.c cVar) {
        this.f14725A = cVar;
        this.f14726B = aVar;
    }

    @Override // g8.q, g8.p
    public StringBuilder b() {
        return new StringBuilder();
    }

    @Override // g8.q
    protected void K(boolean z10) {
        if (s()) {
            return;
        }
        super.K(false);
        this.f14725A.c(this.f14726B);
    }
}
