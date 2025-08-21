package B8;

import H8.e;
import i8.x;
import java.util.HashMap;
import java.util.Map;
import s8.f;
import s8.g;
import v8.C17648a;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final String f2568g = x.f137411a + "LifecycleController";

    /* renamed from: a, reason: collision with root package name */
    private final Map<e, C8.a<I8.a>> f2569a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C8.b f2570b;

    /* renamed from: c, reason: collision with root package name */
    private final f f2571c;

    /* renamed from: d, reason: collision with root package name */
    private final g f2572d;

    /* renamed from: e, reason: collision with root package name */
    private final v8.b f2573e;

    /* renamed from: f, reason: collision with root package name */
    private final a f2574f;

    public void a(e eVar, I8.a aVar) {
        C17648a c17648aA;
        C8.a<I8.a> aVar2 = this.f2569a.get(eVar);
        if (aVar2 != null) {
            c17648aA = this.f2573e.a();
        } else {
            if (x.f137412b) {
                z8.f.u(f2568g, "start activity monitoring for " + eVar);
            }
            C17648a c17648aA2 = this.f2573e.a();
            C17648a c17648aA3 = this.f2573e.a();
            C17648a c17648aA4 = this.f2573e.a();
            L8.e eVarB = this.f2574f.b(eVar.a(), c17648aA2);
            C8.a<I8.a> aVarA = this.f2570b.a(eVar.a(), eVarB, c17648aA3);
            this.f2574f.a(aVarA, eVarB, this);
            this.f2569a.put(eVar, aVarA);
            aVar2 = aVarA;
            c17648aA = c17648aA4;
        }
        I8.b<T> bVar = new I8.b<>(aVar, c17648aA);
        synchronized (aVar2) {
            aVar2.d(bVar);
        }
    }

    public void b(e eVar) {
        C8.a<I8.a> aVarRemove = this.f2569a.remove(eVar);
        if (aVarRemove == null) {
            return;
        }
        if (x.f137412b) {
            z8.f.u(f2568g, "finish activity monitoring for " + eVar);
        }
        if (aVarRemove.a().compareAndSet(false, true)) {
            aVarRemove.b(this.f2573e.a());
            this.f2571c.a(aVarRemove);
        }
    }

    public c(C8.b bVar, f fVar, g gVar, v8.b bVar2, a aVar) {
        this.f2570b = bVar;
        this.f2571c = fVar;
        this.f2572d = gVar;
        this.f2573e = bVar2;
        this.f2574f = aVar;
    }

    public void c(C8.a<I8.a> aVar) {
        if (aVar.a().compareAndSet(false, true)) {
            aVar.b(this.f2573e.a());
            this.f2572d.a(aVar);
        }
    }
}
