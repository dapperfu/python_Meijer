package W4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class D implements X4.a {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f38471b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f38472c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f38470a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f38473d = new Object();

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final D f38474a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f38475b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38475b.run();
                synchronized (this.f38474a.f38473d) {
                    this.f38474a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f38474a.f38473d) {
                    this.f38474a.a();
                    throw th2;
                }
            }
        }

        a(D d10, Runnable runnable) {
            this.f38474a = d10;
            this.f38475b = runnable;
        }
    }

    void a() {
        a aVarPoll = this.f38470a.poll();
        this.f38472c = aVarPoll;
        if (aVarPoll != null) {
            this.f38471b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f38473d) {
            try {
                this.f38470a.add(new a(this, runnable));
                if (this.f38472c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // X4.a
    public boolean z0() {
        boolean z10;
        synchronized (this.f38473d) {
            z10 = !this.f38470a.isEmpty();
        }
        return z10;
    }

    public D(Executor executor) {
        this.f38471b = executor;
    }
}
