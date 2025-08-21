package ab;

import bb.C6346c;
import com.medallia.digital.mobilesdk.l8;
import eb.C13784a;
import eb.C13785b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ab.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5678c extends bb.d {

    /* renamed from: l, reason: collision with root package name */
    private static final C13784a f45347l = C13785b.a(AbstractC5678c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    protected C6346c f45348e;

    /* renamed from: f, reason: collision with root package name */
    protected bb.e f45349f;

    /* renamed from: g, reason: collision with root package name */
    protected String f45350g;

    /* renamed from: h, reason: collision with root package name */
    e f45351h;

    /* renamed from: i, reason: collision with root package name */
    Long f45352i;

    /* renamed from: j, reason: collision with root package name */
    Integer f45353j;

    /* renamed from: k, reason: collision with root package name */
    Integer f45354k;

    private synchronized int m() {
        try {
            if (this.f45353j == null) {
                this.f45353j = Integer.valueOf(this.f45348e.a(k("RUN_NOW_COUNT")));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f45353j.intValue();
    }

    private synchronized void n(int i10) {
        this.f45353j = Integer.valueOf(Math.max(0, m() - i10));
        this.f45348e.d(k("RUN_NOW_COUNT"), this.f45353j.intValue());
    }

    protected final void a(long j10) {
        this.f45352i = Long.valueOf(j10);
        this.f45348e.e(k("LAST_RUN"), j10);
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
                this.f45351h.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void x() throws Exception;

    private String k(String str) {
        return e() + "_" + str;
    }

    @Override // bb.d
    public String e() {
        String str = this.f45350g;
        return str != null ? str : getClass().getSimpleName();
    }

    protected final void q() {
        e eVar = this.f45351h;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final long s() {
        if (this.f45352i == null) {
            this.f45352i = Long.valueOf(this.f45348e.b(k("LAST_RUN"), 0L));
        }
        return this.f45352i.longValue();
    }

    public final int t() {
        if (this.f45354k == null) {
            this.f45354k = Integer.valueOf(this.f45348e.a(k("FAILURES")));
        }
        return this.f45354k.intValue();
    }

    protected final long y() {
        return this.f45349f.a();
    }

    public AbstractC5678c(C6346c c6346c, bb.e eVar, String str) {
        this.f45348e = c6346c;
        this.f45349f = eVar;
        this.f45350g = str;
    }

    private synchronized void a() {
        this.f45353j = Integer.valueOf(m() + 1);
        this.f45348e.d(k("RUN_NOW_COUNT"), this.f45353j.intValue());
    }

    private void l(int i10) {
        this.f45354k = Integer.valueOf(i10);
        this.f45348e.d(k("FAILURES"), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.d
    public final void b(Throwable th2) {
        e();
        l(t() + 1);
        e eVar = this.f45351h;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // bb.d
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
    @Override // bb.d
    public final void f() {
        e();
        l(0);
        e eVar = this.f45351h;
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
        long j10 = l8.b.f93364b;
        for (int i10 = 1; i10 < Math.min(9, iT); i10++) {
            j10 *= 3;
        }
        return j10;
    }
}
