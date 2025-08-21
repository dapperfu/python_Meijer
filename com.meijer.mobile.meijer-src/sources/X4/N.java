package X4;

import O4.AbstractC4373v;
import W4.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class N {

    /* renamed from: e, reason: collision with root package name */
    private static final String f41576e = AbstractC4373v.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final O4.I f41577a;

    /* renamed from: b, reason: collision with root package name */
    final Map<WorkGenerationalId, b> f41578b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<WorkGenerationalId, a> f41579c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f41580d = new Object();

    public interface a {
        void a(WorkGenerationalId workGenerationalId);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final N f41581a;

        /* renamed from: b, reason: collision with root package name */
        private final WorkGenerationalId f41582b;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f41581a.f41580d) {
                try {
                    if (this.f41581a.f41578b.remove(this.f41582b) != null) {
                        a aVarRemove = this.f41581a.f41579c.remove(this.f41582b);
                        if (aVarRemove != null) {
                            aVarRemove.a(this.f41582b);
                        }
                    } else {
                        AbstractC4373v.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f41582b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b(N n10, WorkGenerationalId workGenerationalId) {
            this.f41581a = n10;
            this.f41582b = workGenerationalId;
        }
    }

    public void a(WorkGenerationalId workGenerationalId, long j10, a aVar) {
        synchronized (this.f41580d) {
            AbstractC4373v.e().a(f41576e, "Starting timer for " + workGenerationalId);
            b(workGenerationalId);
            b bVar = new b(this, workGenerationalId);
            this.f41578b.put(workGenerationalId, bVar);
            this.f41579c.put(workGenerationalId, aVar);
            this.f41577a.b(j10, bVar);
        }
    }

    public void b(WorkGenerationalId workGenerationalId) {
        synchronized (this.f41580d) {
            try {
                if (this.f41578b.remove(workGenerationalId) != null) {
                    AbstractC4373v.e().a(f41576e, "Stopping timer for " + workGenerationalId);
                    this.f41579c.remove(workGenerationalId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public N(O4.I i10) {
        this.f41577a = i10;
    }
}
