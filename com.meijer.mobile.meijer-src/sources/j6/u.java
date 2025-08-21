package j6;

import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import q6.t;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class u implements InterfaceC14951c, AbstractC15093a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f140128a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f140129b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC15093a.b> f140130c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final t.a f140131d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140132e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140133f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140134g;

    @Override // k6.AbstractC15093a.b
    public void a() {
        for (int i10 = 0; i10 < this.f140130c.size(); i10++) {
            this.f140130c.get(i10).a();
        }
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
    }

    void f(AbstractC15093a.b bVar) {
        this.f140130c.add(bVar);
    }

    public AbstractC15093a<?, Float> g() {
        return this.f140133f;
    }

    public AbstractC15093a<?, Float> i() {
        return this.f140134g;
    }

    public AbstractC15093a<?, Float> j() {
        return this.f140132e;
    }

    t.a k() {
        return this.f140131d;
    }

    public boolean l() {
        return this.f140129b;
    }

    public u(AbstractC16860b abstractC16860b, q6.t tVar) {
        this.f140128a = tVar.c();
        this.f140129b = tVar.g();
        this.f140131d = tVar.f();
        C15096d c15096dA = tVar.e().a();
        this.f140132e = c15096dA;
        C15096d c15096dA2 = tVar.b().a();
        this.f140133f = c15096dA2;
        C15096d c15096dA3 = tVar.d().a();
        this.f140134g = c15096dA3;
        abstractC16860b.j(c15096dA);
        abstractC16860b.j(c15096dA2);
        abstractC16860b.j(c15096dA3);
        c15096dA.a(this);
        c15096dA2.a(this);
        c15096dA3.a(this);
    }
}
