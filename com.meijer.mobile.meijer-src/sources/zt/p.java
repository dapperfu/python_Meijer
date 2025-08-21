package zt;

import Et.n;
import eb.C13784a;
import eb.C13785b;
import java.util.Collections;
import java.util.List;
import ut.C17467a;
import ut.C17476j;
import ut.InterfaceC17468b;
import ut.InterfaceC17477k;
import ut.InterfaceC17481o;
import xt.InterfaceC18221a;

/* loaded from: classes13.dex */
public class p implements InterfaceC17468b, InterfaceC17477k {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f173268j = C13785b.a(p.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.h f173269a;

    /* renamed from: b, reason: collision with root package name */
    private final Et.n f173270b;

    /* renamed from: c, reason: collision with root package name */
    private final Et.j f173271c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18221a f173272d;

    /* renamed from: e, reason: collision with root package name */
    private final Dt.d f173273e;

    /* renamed from: f, reason: collision with root package name */
    private final bb.e f173274f;

    /* renamed from: g, reason: collision with root package name */
    private C17467a f173275g;

    /* renamed from: h, reason: collision with root package name */
    private long f173276h;

    /* renamed from: i, reason: collision with root package name */
    private float f173277i = Float.MAX_VALUE;

    @Override // ut.InterfaceC17477k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17477k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17468b
    public final void a(C17467a c17467a) {
        if (c17467a != null) {
            C17467a c17467a2 = this.f173275g;
            if (c17467a2 != null) {
                this.f173277i = this.f173272d.a(c17467a2, c17467a);
            }
            this.f173275g = c17467a;
        }
    }

    @Override // ut.InterfaceC17477k
    public final boolean b(At.a aVar, List<C17476j> list) {
        if (Math.random() <= this.f173271c.f8561a) {
            return true;
        }
        if (this.f173277i > 20.0d && this.f173273e.f(aVar) < 30) {
            return true;
        }
        Et.n nVar = this.f173270b;
        List<Et.m> listA = this.f173269a.a();
        if (!nVar.f8576a.isEmpty()) {
            long jA = nVar.f8578c.a() - 900000;
            int i10 = 0;
            for (Et.m mVar : listA) {
                Et.m mVar2 = nVar.f8576a.get(mVar.f8568a);
                if (mVar2 != null) {
                    long j10 = mVar2.f8573f;
                    if (mVar.f8570c != mVar2.f8570c) {
                        i10++;
                        nVar.f8576a.put(mVar.f8568a, mVar);
                    } else if (j10 >= jA) {
                        i10++;
                    }
                }
            }
            if (i10 > 0) {
                synchronized (nVar) {
                    for (InterfaceC17481o interfaceC17481o : nVar.f8577b) {
                        try {
                            interfaceC17481o.a();
                        } catch (Exception e10) {
                            Et.n.f8575f.g("Listener failed {}", interfaceC17481o, e10);
                        }
                    }
                }
                if (this.f173274f.a() - Math.max(this.f173276h, this.f173270b.f8579d) > 480000) {
                    this.f173276h = this.f173274f.a();
                }
                return false;
            }
        }
        nVar.f8579d = nVar.f8578c.a();
        int size = nVar.f8576a.size();
        nVar.f8576a.clear();
        Collections.sort(listA, new n.a(nVar, (byte) 0));
        int iA = Et.n.a(listA);
        for (int i11 = 0; i11 < iA; i11++) {
            Et.m mVar3 = listA.get(i11);
            nVar.f8576a.put(mVar3.f8568a, mVar3);
        }
        if (nVar.f8576a.size() < size - 2) {
            nVar.f8576a.size();
        }
        return true;
    }

    public p(Dt.h hVar, Et.n nVar, Et.j jVar, InterfaceC18221a interfaceC18221a, Dt.d dVar, bb.e eVar) {
        this.f173269a = hVar;
        this.f173270b = nVar;
        this.f173271c = jVar;
        this.f173272d = interfaceC18221a;
        this.f173273e = dVar;
        this.f173274f = eVar;
    }
}
