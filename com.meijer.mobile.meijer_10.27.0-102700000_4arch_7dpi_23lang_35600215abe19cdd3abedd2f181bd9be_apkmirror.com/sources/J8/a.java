package J8;

import g8.l;
import t8.C17073a;
import z8.InterfaceC18402a;

/* loaded from: classes4.dex */
public class a implements InterfaceC18402a {

    /* renamed from: a, reason: collision with root package name */
    private final b f14721a;

    @Override // z8.InterfaceC18402a
    public e b(String str, C17073a c17073a) {
        return new e(i.a(this.f14721a.a(str), c17073a));
    }

    public a(b bVar) {
        this.f14721a = bVar;
    }

    @Override // z8.InterfaceC18402a
    public void a(A8.a<G8.a> aVar, h hVar, z8.c cVar) {
        f fVarC = aVar.c();
        fVarC.O(aVar, cVar);
        hVar.d(fVarC);
        l.k().a(fVarC);
    }
}
