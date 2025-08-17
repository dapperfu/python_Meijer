package sg;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sg.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16970o {

    /* renamed from: b, reason: collision with root package name */
    private boolean f160507b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f160506a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Queue f160508c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f160509d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f160506a) {
            try {
                if (this.f160508c.isEmpty()) {
                    this.f160507b = false;
                } else {
                    C16953I c16953i = (C16953I) this.f160508c.remove();
                    e(c16953i.f160446a, c16953i.f160447b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: sg.G
                @Override // java.lang.Runnable
                public final void run() {
                    C16955K c16955k = new C16955K(this.f160444a, null);
                    try {
                        runnable.run();
                        c16955k.close();
                    } catch (Throwable th2) {
                        try {
                            c16955k.close();
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
        synchronized (this.f160506a) {
            try {
                if (this.f160507b) {
                    this.f160508c.add(new C16953I(executor, runnable, null));
                } else {
                    this.f160507b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
