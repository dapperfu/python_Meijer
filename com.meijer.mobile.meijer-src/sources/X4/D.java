package X4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class D implements Y4.a {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f41541b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f41542c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f41540a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f41543d = new Object();

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final D f41544a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f41545b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41545b.run();
                synchronized (this.f41544a.f41543d) {
                    this.f41544a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f41544a.f41543d) {
                    this.f41544a.a();
                    throw th2;
                }
            }
        }

        a(D d10, Runnable runnable) {
            this.f41544a = d10;
            this.f41545b = runnable;
        }
    }

    void a() {
        a aVarPoll = this.f41540a.poll();
        this.f41542c = aVarPoll;
        if (aVarPoll != null) {
            this.f41541b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f41543d) {
            try {
                this.f41540a.add(new a(this, runnable));
                if (this.f41542c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Y4.a
    public boolean v0() {
        boolean z10;
        synchronized (this.f41543d) {
            z10 = !this.f41540a.isEmpty();
        }
        return z10;
    }

    public D(Executor executor) {
        this.f41541b = executor;
    }
}
