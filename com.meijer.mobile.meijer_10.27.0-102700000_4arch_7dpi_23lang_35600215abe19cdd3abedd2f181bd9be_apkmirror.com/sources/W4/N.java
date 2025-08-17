package W4;

import N4.AbstractC4333v;
import V4.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class N {

    /* renamed from: e, reason: collision with root package name */
    private static final String f38506e = AbstractC4333v.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final N4.I f38507a;

    /* renamed from: b, reason: collision with root package name */
    final Map<WorkGenerationalId, b> f38508b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<WorkGenerationalId, a> f38509c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f38510d = new Object();

    public interface a {
        void a(WorkGenerationalId workGenerationalId);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final N f38511a;

        /* renamed from: b, reason: collision with root package name */
        private final WorkGenerationalId f38512b;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f38511a.f38510d) {
                try {
                    if (this.f38511a.f38508b.remove(this.f38512b) != null) {
                        a aVarRemove = this.f38511a.f38509c.remove(this.f38512b);
                        if (aVarRemove != null) {
                            aVarRemove.a(this.f38512b);
                        }
                    } else {
                        AbstractC4333v.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f38512b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b(N n10, WorkGenerationalId workGenerationalId) {
            this.f38511a = n10;
            this.f38512b = workGenerationalId;
        }
    }

    public void a(WorkGenerationalId workGenerationalId, long j10, a aVar) {
        synchronized (this.f38510d) {
            AbstractC4333v.e().a(f38506e, "Starting timer for " + workGenerationalId);
            b(workGenerationalId);
            b bVar = new b(this, workGenerationalId);
            this.f38508b.put(workGenerationalId, bVar);
            this.f38509c.put(workGenerationalId, aVar);
            this.f38507a.b(j10, bVar);
        }
    }

    public void b(WorkGenerationalId workGenerationalId) {
        synchronized (this.f38510d) {
            try {
                if (this.f38508b.remove(workGenerationalId) != null) {
                    AbstractC4333v.e().a(f38506e, "Stopping timer for " + workGenerationalId);
                    this.f38509c.remove(workGenerationalId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public N(N4.I i10) {
        this.f38507a = i10;
    }
}
