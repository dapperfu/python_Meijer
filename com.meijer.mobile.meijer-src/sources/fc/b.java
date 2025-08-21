package fc;

import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.C15929a;

/* loaded from: classes4.dex */
public final class b extends AbstractC5677b implements InterfaceC13975a {

    /* renamed from: n, reason: collision with root package name */
    private final d f131661n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f131662o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.d
    public final void h() {
    }

    public b(C6346c c6346c, e eVar, d dVar, String str) {
        super(c6346c, eVar, str, 5000L);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f131662o = atomicBoolean;
        this.f131661n = dVar;
        atomicBoolean.set(true);
    }

    @Override // fc.InterfaceC13975a
    public final void a() {
        if (this.f131662o.get()) {
            return;
        }
        this.f131662o.set(true);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        if (this.f131661n.f131671e.get() && this.f131661n.f131667a.f()) {
            return super.p();
        }
        this.f131662o.set(false);
        return 4611686018427387903L;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        d dVar = this.f131661n;
        d.f131666o.c("checking for gimbal visit depart events", new Object[0]);
        ArrayList arrayList = new ArrayList();
        synchronized (dVar.f131667a) {
            try {
                for (C15929a c15929a : dVar.f131667a.e()) {
                    Long lC = d.c(c15929a);
                    long jLongValue = dVar.f131669c;
                    if (dVar.f131670d) {
                        if (c15929a.g() != null) {
                            jLongValue = c15929a.g().longValue();
                        }
                    } else if (c15929a.h() != null) {
                        jLongValue = c15929a.h().longValue();
                    }
                    if (lC.longValue() > jLongValue * 1000) {
                        c15929a.w(c15929a.e());
                        dVar.f131679m.remove(c15929a.n());
                        arrayList.add(c15929a);
                    }
                }
                dVar.f131667a.d(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c cVar = dVar.f131674h;
        if (cVar != null) {
            cVar.a(arrayList);
        }
    }
}
