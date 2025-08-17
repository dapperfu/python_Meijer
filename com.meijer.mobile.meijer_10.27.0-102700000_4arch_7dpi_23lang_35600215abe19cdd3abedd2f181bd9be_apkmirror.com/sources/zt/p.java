package zt;

import Et.n;
import cb.C6380a;
import cb.C6381b;
import java.util.Collections;
import java.util.List;
import ut.C17315a;
import ut.C17324j;
import ut.InterfaceC17316b;
import ut.InterfaceC17325k;
import ut.InterfaceC17329o;
import xt.InterfaceC18093a;

/* loaded from: classes12.dex */
public class p implements InterfaceC17316b, InterfaceC17325k {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f173307j = C6381b.a(p.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Dt.h f173308a;

    /* renamed from: b, reason: collision with root package name */
    private final Et.n f173309b;

    /* renamed from: c, reason: collision with root package name */
    private final Et.j f173310c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18093a f173311d;

    /* renamed from: e, reason: collision with root package name */
    private final Dt.d f173312e;

    /* renamed from: f, reason: collision with root package name */
    private final Za.e f173313f;

    /* renamed from: g, reason: collision with root package name */
    private C17315a f173314g;

    /* renamed from: h, reason: collision with root package name */
    private long f173315h;

    /* renamed from: i, reason: collision with root package name */
    private float f173316i = Float.MAX_VALUE;

    @Override // ut.InterfaceC17325k
    public final void c(At.a aVar) {
    }

    @Override // ut.InterfaceC17325k
    public final void f(At.a aVar) {
    }

    @Override // ut.InterfaceC17316b
    public final void a(C17315a c17315a) {
        if (c17315a != null) {
            C17315a c17315a2 = this.f173314g;
            if (c17315a2 != null) {
                this.f173316i = this.f173311d.a(c17315a2, c17315a);
            }
            this.f173314g = c17315a;
        }
    }

    @Override // ut.InterfaceC17325k
    public final boolean b(At.a aVar, List<C17324j> list) {
        if (Math.random() <= this.f173310c.f9849a) {
            return true;
        }
        if (this.f173316i > 20.0d && this.f173312e.f(aVar) < 30) {
            return true;
        }
        Et.n nVar = this.f173309b;
        List<Et.m> listA = this.f173308a.a();
        if (!nVar.f9864a.isEmpty()) {
            long jA = nVar.f9866c.a() - 900000;
            int i10 = 0;
            for (Et.m mVar : listA) {
                Et.m mVar2 = nVar.f9864a.get(mVar.f9856a);
                if (mVar2 != null) {
                    long j10 = mVar2.f9861f;
                    if (mVar.f9858c != mVar2.f9858c) {
                        i10++;
                        nVar.f9864a.put(mVar.f9856a, mVar);
                    } else if (j10 >= jA) {
                        i10++;
                    }
                }
            }
            if (i10 > 0) {
                synchronized (nVar) {
                    for (InterfaceC17329o interfaceC17329o : nVar.f9865b) {
                        try {
                            interfaceC17329o.a();
                        } catch (Exception e10) {
                            Et.n.f9863f.g("Listener failed {}", interfaceC17329o, e10);
                        }
                    }
                }
                if (this.f173313f.a() - Math.max(this.f173315h, this.f173309b.f9867d) > 480000) {
                    this.f173315h = this.f173313f.a();
                }
                return false;
            }
        }
        nVar.f9867d = nVar.f9866c.a();
        int size = nVar.f9864a.size();
        nVar.f9864a.clear();
        Collections.sort(listA, new n.a(nVar, (byte) 0));
        int iA = Et.n.a(listA);
        for (int i11 = 0; i11 < iA; i11++) {
            Et.m mVar3 = listA.get(i11);
            nVar.f9864a.put(mVar3.f9856a, mVar3);
        }
        if (nVar.f9864a.size() < size - 2) {
            nVar.f9864a.size();
        }
        return true;
    }

    public p(Dt.h hVar, Et.n nVar, Et.j jVar, InterfaceC18093a interfaceC18093a, Dt.d dVar, Za.e eVar) {
        this.f173308a = hVar;
        this.f173309b = nVar;
        this.f173310c = jVar;
        this.f173311d = interfaceC18093a;
        this.f173312e = dVar;
        this.f173313f = eVar;
    }
}
