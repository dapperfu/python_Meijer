package z8;

import F8.e;
import g8.x;
import java.util.HashMap;
import java.util.Map;
import q8.f;
import q8.g;
import t8.C17073a;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final String f171654g = x.f133195a + "LifecycleController";

    /* renamed from: a, reason: collision with root package name */
    private final Map<e, A8.a<G8.a>> f171655a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f171656b;

    /* renamed from: c, reason: collision with root package name */
    private final f f171657c;

    /* renamed from: d, reason: collision with root package name */
    private final g f171658d;

    /* renamed from: e, reason: collision with root package name */
    private final t8.b f171659e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC18402a f171660f;

    public void a(e eVar, G8.a aVar) {
        C17073a c17073aA;
        A8.a<G8.a> aVar2 = this.f171655a.get(eVar);
        if (aVar2 != null) {
            c17073aA = this.f171659e.a();
        } else {
            if (x.f133196b) {
                x8.f.u(f171654g, "start activity monitoring for " + eVar);
            }
            C17073a c17073aA2 = this.f171659e.a();
            C17073a c17073aA3 = this.f171659e.a();
            C17073a c17073aA4 = this.f171659e.a();
            J8.e eVarB = this.f171660f.b(eVar.a(), c17073aA2);
            A8.a<G8.a> aVarA = this.f171656b.a(eVar.a(), eVarB, c17073aA3);
            this.f171660f.a(aVarA, eVarB, this);
            this.f171655a.put(eVar, aVarA);
            aVar2 = aVarA;
            c17073aA = c17073aA4;
        }
        G8.b<T> bVar = new G8.b<>(aVar, c17073aA);
        synchronized (aVar2) {
            aVar2.f(bVar);
        }
    }

    public void b(e eVar) {
        A8.a<G8.a> aVarRemove = this.f171655a.remove(eVar);
        if (aVarRemove == null) {
            return;
        }
        if (x.f133196b) {
            x8.f.u(f171654g, "finish activity monitoring for " + eVar);
        }
        if (aVarRemove.a().compareAndSet(false, true)) {
            aVarRemove.h(this.f171659e.a());
            this.f171657c.a(aVarRemove);
        }
    }

    public c(A8.b bVar, f fVar, g gVar, t8.b bVar2, InterfaceC18402a interfaceC18402a) {
        this.f171656b = bVar;
        this.f171657c = fVar;
        this.f171658d = gVar;
        this.f171659e = bVar2;
        this.f171660f = interfaceC18402a;
    }

    public void c(A8.a<G8.a> aVar) {
        if (aVar.a().compareAndSet(false, true)) {
            aVar.h(this.f171659e.a());
            this.f171658d.a(aVar);
        }
    }
}
