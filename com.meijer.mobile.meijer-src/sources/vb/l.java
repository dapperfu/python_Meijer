package vb;

import ab.AbstractC5677b;
import bb.C6346c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.C15929a;

/* loaded from: classes4.dex */
public final class l extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private final m f165755n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f165756o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.d
    public final void h() {
    }

    public l(C6346c c6346c, bb.e eVar, m mVar, String str) {
        super(c6346c, eVar, str, 5000L);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f165756o = atomicBoolean;
        this.f165755n = mVar;
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        if (this.f165755n.f165768j.get() && this.f165755n.f165760b.f()) {
            return super.p();
        }
        this.f165756o.set(false);
        return 4611686018427387903L;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        m mVar = this.f165755n;
        m.f165758n.c("checking for ibeacon visit depart events", new Object[0]);
        ArrayList arrayList = new ArrayList();
        synchronized (mVar.f165760b) {
            try {
                for (C15929a c15929a : mVar.f165760b.a()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c15929a.e().longValue();
                    long jLongValue = mVar.f165767i;
                    if (mVar.f165766h) {
                        if (c15929a.g() != null) {
                            jLongValue = c15929a.g().longValue();
                        }
                    } else if (c15929a.h() != null) {
                        jLongValue = c15929a.h().longValue();
                    }
                    if (jCurrentTimeMillis > jLongValue * 1000) {
                        c15929a.w(c15929a.e());
                        arrayList.add(c15929a);
                    }
                }
                mVar.f165760b.d(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mVar.f165765g != null) {
            mVar.b(arrayList);
        }
    }
}
