package Ya;

import cb.C6380a;
import cb.C6381b;
import com.medallia.digital.mobilesdk.l8;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class c extends Za.d {

    /* renamed from: l, reason: collision with root package name */
    private static final C6380a f40215l = C6381b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    protected Za.c f40216e;

    /* renamed from: f, reason: collision with root package name */
    protected Za.e f40217f;

    /* renamed from: g, reason: collision with root package name */
    protected String f40218g;

    /* renamed from: h, reason: collision with root package name */
    e f40219h;

    /* renamed from: i, reason: collision with root package name */
    Long f40220i;

    /* renamed from: j, reason: collision with root package name */
    Integer f40221j;

    /* renamed from: k, reason: collision with root package name */
    Integer f40222k;

    private synchronized int m() {
        try {
            if (this.f40221j == null) {
                this.f40221j = Integer.valueOf(this.f40216e.a(k("RUN_NOW_COUNT")));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f40221j.intValue();
    }

    private synchronized void n(int i10) {
        this.f40221j = Integer.valueOf(Math.max(0, m() - i10));
        this.f40216e.d(k("RUN_NOW_COUNT"), this.f40221j.intValue());
    }

    protected final void a(long j10) {
        this.f40220i = Long.valueOf(j10);
        this.f40216e.e(k("LAST_RUN"), j10);
    }

    public abstract long o();

    public abstract long p();

    public final void r() {
        synchronized (this) {
            try {
                if (t() != 0) {
                    return;
                }
                l(t() + 1);
                this.f40219h.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void x() throws Exception;

    private String k(String str) {
        return e() + "_" + str;
    }

    @Override // Za.d
    public String e() {
        String str = this.f40218g;
        return str != null ? str : getClass().getSimpleName();
    }

    protected final void q() {
        e eVar = this.f40219h;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final long s() {
        if (this.f40220i == null) {
            this.f40220i = Long.valueOf(this.f40216e.b(k("LAST_RUN"), 0L));
        }
        return this.f40220i.longValue();
    }

    public final int t() {
        if (this.f40222k == null) {
            this.f40222k = Integer.valueOf(this.f40216e.a(k("FAILURES")));
        }
        return this.f40222k.intValue();
    }

    protected final long y() {
        return this.f40217f.a();
    }

    public c(Za.c cVar, Za.e eVar, String str) {
        this.f40216e = cVar;
        this.f40217f = eVar;
        this.f40218g = str;
    }

    private synchronized void a() {
        this.f40221j = Integer.valueOf(m() + 1);
        this.f40216e.d(k("RUN_NOW_COUNT"), this.f40221j.intValue());
    }

    private void l(int i10) {
        this.f40222k = Integer.valueOf(i10);
        this.f40216e.d(k("FAILURES"), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Za.d
    public final void b(Throwable th2) {
        e();
        l(t() + 1);
        e eVar = this.f40219h;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // Za.d
    public final void c(AtomicBoolean atomicBoolean) throws Exception {
        a(y());
        int iM = m();
        try {
            x();
        } finally {
            n(iM);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Za.d
    public final void f() {
        e();
        l(0);
        e eVar = this.f40219h;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void u() {
        a();
        q();
    }

    public long v() {
        if (j()) {
            return 4611686018427387903L;
        }
        if (m() > 0) {
            return y();
        }
        if (t() > 0) {
            e();
            t();
            return s() + w();
        }
        return p();
    }

    protected final long w() {
        int iT = t();
        if (iT == 0) {
            return 4611686018427387903L;
        }
        long j10 = l8.b.f92525b;
        for (int i10 = 1; i10 < Math.min(9, iT); i10++) {
            j10 *= 3;
        }
        return j10;
    }
}
