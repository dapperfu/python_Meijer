package P5;

import P5.q;

/* renamed from: P5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4503a<A, B> implements e {

    /* renamed from: a, reason: collision with root package name */
    private final j<A> f24767a;

    /* renamed from: b, reason: collision with root package name */
    private final j<B> f24768b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24769c;

    @Override // P5.e
    public q a(c cVar) {
        if (this.f24769c == null) {
            return new q(q.a.MISSING_OPERATOR, "Operator is null, Comparison returned false");
        }
        j<A> jVar = this.f24767a;
        if (jVar == null || this.f24768b == null) {
            return new q(q.a.INVALID_OPERAND, "Operand is null, Comparison returned false.");
        }
        A a10 = jVar.a(cVar);
        B bA = this.f24768b.a(cVar);
        return (a10 == null || bA == null) ? new q(q.a.INVALID_OPERAND, String.format("Comparison %s %s %s returned false", a10, this.f24769c, bA)) : cVar.f24775b.b(a10, this.f24769c, bA);
    }

    public C4503a(j<A> jVar, String str, j<B> jVar2) {
        this.f24767a = jVar;
        this.f24769c = str;
        this.f24768b = jVar2;
    }
}
