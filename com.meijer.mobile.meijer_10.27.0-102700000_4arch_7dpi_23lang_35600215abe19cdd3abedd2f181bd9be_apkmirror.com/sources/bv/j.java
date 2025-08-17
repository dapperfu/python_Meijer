package bv;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class j extends AbstractC6285a implements Callable<Void> {
    public j(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f60774b = Thread.currentThread();
        try {
            this.f60773a.run();
            return null;
        } finally {
            lazySet(AbstractC6285a.f60771c);
            this.f60774b = null;
        }
    }
}
