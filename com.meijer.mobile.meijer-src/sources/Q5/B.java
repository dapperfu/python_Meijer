package Q5;

import Q5.q;

/* loaded from: classes4.dex */
public class B<A> implements e {

    /* renamed from: a, reason: collision with root package name */
    private final j<A> f27795a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27796b;

    @Override // Q5.e
    public q a(c cVar) {
        j<A> jVar = this.f27795a;
        A a10 = jVar != null ? jVar.a(cVar) : null;
        String str = this.f27796b;
        return (str == null || str.isEmpty()) ? new q(q.a.INVALID_OPERAND, String.format("Evaluating %s %s returned false", a10, this.f27796b)) : cVar.f27805b.a(this.f27796b, a10);
    }

    public B(j<A> jVar, String str) {
        this.f27795a = jVar;
        this.f27796b = str;
    }
}
