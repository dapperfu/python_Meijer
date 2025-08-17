package rc;

import java.util.concurrent.Executor;
import vc.C17544a;

/* loaded from: classes4.dex */
class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f157984a;

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f157985a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f157985a.run();
            } catch (Exception e10) {
                C17544a.d("Executor", "Background execution failure.", e10);
            }
        }

        a(Runnable runnable) {
            this.f157985a = runnable;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f157984a.execute(new a(runnable));
    }

    n(Executor executor) {
        this.f157984a = executor;
    }
}
