package bv;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class i extends AbstractC6285a implements Runnable {
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f60774b = Thread.currentThread();
        try {
            this.f60773a.run();
            this.f60774b = null;
        } catch (Throwable th2) {
            this.f60774b = null;
            lazySet(AbstractC6285a.f60771c);
            C14313a.s(th2);
        }
    }
}
