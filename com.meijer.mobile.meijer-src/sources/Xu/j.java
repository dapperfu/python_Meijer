package Xu;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class j extends a implements Callable<Void> {
    public j(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f42672b = Thread.currentThread();
        try {
            this.f42671a.run();
            return null;
        } finally {
            lazySet(a.f42669c);
            this.f42672b = null;
        }
    }
}
