package Q5;

import Q5.q;

/* renamed from: Q5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4667a<A, B> implements e {

    /* renamed from: a, reason: collision with root package name */
    private final j<A> f27797a;

    /* renamed from: b, reason: collision with root package name */
    private final j<B> f27798b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27799c;

    @Override // Q5.e
    public q a(c cVar) {
        if (this.f27799c == null) {
            return new q(q.a.MISSING_OPERATOR, "Operator is null, Comparison returned false");
        }
        j<A> jVar = this.f27797a;
        if (jVar == null || this.f27798b == null) {
            return new q(q.a.INVALID_OPERAND, "Operand is null, Comparison returned false.");
        }
        A a10 = jVar.a(cVar);
        B bA = this.f27798b.a(cVar);
        return (a10 == null || bA == null) ? new q(q.a.INVALID_OPERAND, String.format("Comparison %s %s %s returned false", a10, this.f27799c, bA)) : cVar.f27805b.b(a10, this.f27799c, bA);
    }

    public C4667a(j<A> jVar, String str, j<B> jVar2) {
        this.f27797a = jVar;
        this.f27799c = str;
        this.f27798b = jVar2;
    }
}
