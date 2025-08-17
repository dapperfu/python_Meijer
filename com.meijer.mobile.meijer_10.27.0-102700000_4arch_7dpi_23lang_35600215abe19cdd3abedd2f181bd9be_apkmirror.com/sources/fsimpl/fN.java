package fsimpl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class fN {

    /* renamed from: a, reason: collision with root package name */
    static boolean f132220a = false;

    /* renamed from: c, reason: collision with root package name */
    private final long f132222c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f132223d;

    /* renamed from: f, reason: collision with root package name */
    private fP f132225f;

    /* renamed from: g, reason: collision with root package name */
    private final List f132226g;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f132221b = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    private boolean f132224e = false;

    public fN(boolean z10, long j10) {
        this.f132226g = f132220a ? new ArrayList() : null;
        this.f132223d = z10;
        this.f132222c = j10;
    }

    private void c(Runnable runnable) {
        this.f132221b.addFirst(runnable);
    }

    public void a() {
        fP fPVar;
        synchronized (this) {
            fPVar = this.f132225f;
            this.f132224e = true;
        }
        if (fPVar != null) {
            fPVar.b();
        }
    }

    public void a(Runnable runnable) {
        C14103fu.a("push", new Object[0]);
        c(runnable);
    }

    public fQ b(Runnable runnable) throws InterruptedException {
        fP fPVar;
        boolean z10;
        fQ fQVar;
        if (C14103fu.f132287a) {
            C14103fu.b("process", new Object[0]);
            C14103fu.b(this.f132221b.isEmpty(), "The work stack should always be empty at the beginning of `process`", new Object[0]);
        }
        c(runnable);
        synchronized (this) {
            fPVar = new fP(this);
            this.f132225f = fPVar;
            z10 = this.f132224e;
        }
        long jLongValue = 0;
        if (z10) {
            fQVar = new fQ(null, 0L);
        } else {
            fZ.b(fPVar);
            this.f132225f.a();
            fQVar = new fQ(this.f132225f.f132228b, (this.f132225f.f132231e - this.f132225f.f132230d) / 1000);
            if (f132220a) {
                String str = "";
                List list = this.f132226g;
                if (list != null) {
                    list.add(Long.valueOf(fQVar.f132236b));
                    if (this.f132226g.size() > 5) {
                        this.f132226g.remove(0);
                    }
                    int size = this.f132226g.size();
                    Iterator it = this.f132226g.iterator();
                    while (it.hasNext()) {
                        jLongValue += ((Long) it.next()).longValue();
                    }
                    str = "; rollingAvg=" + (jLongValue / size) + " μs (last " + size + " items)";
                }
                System.out.println("Scan time: " + fQVar.f132236b + " μs; t=" + fQVar.f132235a + "; uiThreadCalls=" + this.f132225f.f132233g + "; runnablesProcessed=" + this.f132225f.f132232f + str);
            }
        }
        synchronized (this) {
            this.f132225f = null;
        }
        this.f132221b.clear();
        return fQVar;
    }
}
