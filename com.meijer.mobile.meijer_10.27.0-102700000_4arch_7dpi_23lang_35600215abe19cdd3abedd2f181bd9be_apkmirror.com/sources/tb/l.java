package tb;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.C15395a;

/* loaded from: classes4.dex */
public final class l extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private final m f161577n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f161578o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Za.d
    public final void h() {
    }

    public l(Za.c cVar, Za.e eVar, m mVar, String str) {
        super(cVar, eVar, str, 5000L);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f161578o = atomicBoolean;
        this.f161577n = mVar;
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        if (this.f161577n.f161590j.get() && this.f161577n.f161582b.f()) {
            return super.p();
        }
        this.f161578o.set(false);
        return 4611686018427387903L;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        m mVar = this.f161577n;
        m.f161580n.c("checking for ibeacon visit depart events", new Object[0]);
        ArrayList arrayList = new ArrayList();
        synchronized (mVar.f161582b) {
            try {
                for (C15395a c15395a : mVar.f161582b.a()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c15395a.e().longValue();
                    long jLongValue = mVar.f161589i;
                    if (mVar.f161588h) {
                        if (c15395a.g() != null) {
                            jLongValue = c15395a.g().longValue();
                        }
                    } else if (c15395a.h() != null) {
                        jLongValue = c15395a.h().longValue();
                    }
                    if (jCurrentTimeMillis > jLongValue * 1000) {
                        c15395a.w(c15395a.e());
                        arrayList.add(c15395a);
                    }
                }
                mVar.f161582b.d(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mVar.f161587g != null) {
            mVar.b(arrayList);
        }
    }
}
