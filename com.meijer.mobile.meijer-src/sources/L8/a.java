package L8;

import i8.l;
import v8.C17648a;

/* loaded from: classes4.dex */
public class a implements B8.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f18058a;

    @Override // B8.a
    public e b(String str, C17648a c17648a) {
        return new e(i.a(this.f18058a.a(str), c17648a));
    }

    public a(b bVar) {
        this.f18058a = bVar;
    }

    @Override // B8.a
    public void a(C8.a<I8.a> aVar, h hVar, B8.c cVar) {
        f fVarE = aVar.e();
        fVarE.O(aVar, cVar);
        hVar.f(fVarE);
        l.k().a(fVarE);
    }
}
