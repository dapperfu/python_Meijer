package ug;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ug.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17417o {

    /* renamed from: b, reason: collision with root package name */
    private boolean f163993b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f163992a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Queue f163994c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f163995d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f163992a) {
            try {
                if (this.f163994c.isEmpty()) {
                    this.f163993b = false;
                } else {
                    C17400I c17400i = (C17400I) this.f163994c.remove();
                    e(c17400i.f163932a, c17400i.f163933b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: ug.G
                @Override // java.lang.Runnable
                public final void run() {
                    C17402K c17402k = new C17402K(this.f163930a, null);
                    try {
                        runnable.run();
                        c17402k.close();
                    } catch (Throwable th2) {
                        try {
                            c17402k.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f163992a) {
            try {
                if (this.f163993b) {
                    this.f163994c.add(new C17400I(executor, runnable, null));
                } else {
                    this.f163993b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
