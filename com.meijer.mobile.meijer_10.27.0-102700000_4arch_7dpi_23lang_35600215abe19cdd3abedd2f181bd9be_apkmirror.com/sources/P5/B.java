package P5;

import P5.q;

/* loaded from: classes4.dex */
public class B<A> implements e {

    /* renamed from: a, reason: collision with root package name */
    private final j<A> f24765a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24766b;

    @Override // P5.e
    public q a(c cVar) {
        j<A> jVar = this.f24765a;
        A a10 = jVar != null ? jVar.a(cVar) : null;
        String str = this.f24766b;
        return (str == null || str.isEmpty()) ? new q(q.a.INVALID_OPERAND, String.format("Evaluating %s %s returned false", a10, this.f24766b)) : cVar.f24775b.a(this.f24766b, a10);
    }

    public B(j<A> jVar, String str) {
        this.f24765a = jVar;
        this.f24766b = str;
    }
}
