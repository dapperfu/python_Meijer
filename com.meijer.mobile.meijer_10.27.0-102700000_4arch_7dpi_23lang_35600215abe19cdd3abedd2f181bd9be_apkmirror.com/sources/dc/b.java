package dc;

import Za.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.C15395a;

/* loaded from: classes4.dex */
public final class b extends Ya.b implements InterfaceC13502a {

    /* renamed from: n, reason: collision with root package name */
    private final d f127332n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f127333o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Za.d
    public final void h() {
    }

    public b(Za.c cVar, e eVar, d dVar, String str) {
        super(cVar, eVar, str, 5000L);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f127333o = atomicBoolean;
        this.f127332n = dVar;
        atomicBoolean.set(true);
    }

    @Override // dc.InterfaceC13502a
    public final void a() {
        if (this.f127333o.get()) {
            return;
        }
        this.f127333o.set(true);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        if (this.f127332n.f127342e.get() && this.f127332n.f127338a.f()) {
            return super.p();
        }
        this.f127333o.set(false);
        return 4611686018427387903L;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        d dVar = this.f127332n;
        d.f127337o.c("checking for gimbal visit depart events", new Object[0]);
        ArrayList arrayList = new ArrayList();
        synchronized (dVar.f127338a) {
            try {
                for (C15395a c15395a : dVar.f127338a.e()) {
                    Long lC = d.c(c15395a);
                    long jLongValue = dVar.f127340c;
                    if (dVar.f127341d) {
                        if (c15395a.g() != null) {
                            jLongValue = c15395a.g().longValue();
                        }
                    } else if (c15395a.h() != null) {
                        jLongValue = c15395a.h().longValue();
                    }
                    if (lC.longValue() > jLongValue * 1000) {
                        c15395a.w(c15395a.e());
                        dVar.f127350m.remove(c15395a.n());
                        arrayList.add(c15395a);
                    }
                }
                dVar.f127338a.d(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c cVar = dVar.f127345h;
        if (cVar != null) {
            cVar.a(arrayList);
        }
    }
}
