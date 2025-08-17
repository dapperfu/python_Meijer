package i6;

import j6.AbstractC14861a;
import j6.C14864d;
import java.util.ArrayList;
import java.util.List;
import p6.t;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class u implements InterfaceC14692c, AbstractC14861a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f137593a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f137594b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC14861a.b> f137595c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final t.a f137596d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137597e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137598f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137599g;

    @Override // j6.AbstractC14861a.b
    public void a() {
        for (int i10 = 0; i10 < this.f137595c.size(); i10++) {
            this.f137595c.get(i10).a();
        }
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
    }

    void d(AbstractC14861a.b bVar) {
        this.f137595c.add(bVar);
    }

    public AbstractC14861a<?, Float> h() {
        return this.f137598f;
    }

    public AbstractC14861a<?, Float> i() {
        return this.f137599g;
    }

    public AbstractC14861a<?, Float> j() {
        return this.f137597e;
    }

    t.a k() {
        return this.f137596d;
    }

    public boolean l() {
        return this.f137594b;
    }

    public u(AbstractC16472b abstractC16472b, p6.t tVar) {
        this.f137593a = tVar.c();
        this.f137594b = tVar.g();
        this.f137596d = tVar.f();
        C14864d c14864dA = tVar.e().a();
        this.f137597e = c14864dA;
        C14864d c14864dA2 = tVar.b().a();
        this.f137598f = c14864dA2;
        C14864d c14864dA3 = tVar.d().a();
        this.f137599g = c14864dA3;
        abstractC16472b.j(c14864dA);
        abstractC16472b.j(c14864dA2);
        abstractC16472b.j(c14864dA3);
        c14864dA.a(this);
        c14864dA2.a(this);
        c14864dA3.a(this);
    }
}
