package fsimpl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class fN {

    /* renamed from: a, reason: collision with root package name */
    static boolean f133470a = false;

    /* renamed from: c, reason: collision with root package name */
    private final long f133472c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f133473d;

    /* renamed from: f, reason: collision with root package name */
    private fP f133475f;

    /* renamed from: g, reason: collision with root package name */
    private final List f133476g;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f133471b = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    private boolean f133474e = false;

    public fN(boolean z10, long j10) {
        this.f133476g = f133470a ? new ArrayList() : null;
        this.f133473d = z10;
        this.f133472c = j10;
    }

    private void c(Runnable runnable) {
        this.f133471b.addFirst(runnable);
    }

    public void a() {
        fP fPVar;
        synchronized (this) {
            fPVar = this.f133475f;
            this.f133474e = true;
        }
        if (fPVar != null) {
            fPVar.b();
        }
    }

    public void a(Runnable runnable) {
        C14228fu.a("push", new Object[0]);
        c(runnable);
    }

    public fQ b(Runnable runnable) throws InterruptedException {
        fP fPVar;
        boolean z10;
        fQ fQVar;
        if (C14228fu.f133537a) {
            C14228fu.b("process", new Object[0]);
            C14228fu.b(this.f133471b.isEmpty(), "The work stack should always be empty at the beginning of `process`", new Object[0]);
        }
        c(runnable);
        synchronized (this) {
            fPVar = new fP(this);
            this.f133475f = fPVar;
            z10 = this.f133474e;
        }
        long jLongValue = 0;
        if (z10) {
            fQVar = new fQ(null, 0L);
        } else {
            fZ.b(fPVar);
            this.f133475f.a();
            fQVar = new fQ(this.f133475f.f133478b, (this.f133475f.f133481e - this.f133475f.f133480d) / 1000);
            if (f133470a) {
                String str = "";
                List list = this.f133476g;
                if (list != null) {
                    list.add(Long.valueOf(fQVar.f133486b));
                    if (this.f133476g.size() > 5) {
                        this.f133476g.remove(0);
                    }
                    int size = this.f133476g.size();
                    Iterator it = this.f133476g.iterator();
                    while (it.hasNext()) {
                        jLongValue += ((Long) it.next()).longValue();
                    }
                    str = "; rollingAvg=" + (jLongValue / size) + " μs (last " + size + " items)";
                }
                System.out.println("Scan time: " + fQVar.f133486b + " μs; t=" + fQVar.f133485a + "; uiThreadCalls=" + this.f133475f.f133483g + "; runnablesProcessed=" + this.f133475f.f133482f + str);
            }
        }
        synchronized (this) {
            this.f133475f = null;
        }
        this.f133471b.clear();
        return fQVar;
    }
}
