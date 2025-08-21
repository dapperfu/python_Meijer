package rf;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import Vd.N;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f159536a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f159537b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5516j<?> f159538c = C5519m.f(null);

    public ExecutorService c() {
        return this.f159536a;
    }

    public AbstractC5516j<Void> d(final Runnable runnable) {
        AbstractC5516j abstractC5516jL;
        synchronized (this.f159537b) {
            abstractC5516jL = this.f159538c.l(this.f159536a, new InterfaceC5509c() { // from class: rf.d
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j) {
                    return e.a(runnable, abstractC5516j);
                }
            });
            this.f159538c = abstractC5516jL;
        }
        return abstractC5516jL;
    }

    public <T> AbstractC5516j<T> e(final Callable<AbstractC5516j<T>> callable) {
        N n10;
        synchronized (this.f159537b) {
            n10 = (AbstractC5516j<T>) this.f159538c.l(this.f159536a, new InterfaceC5509c() { // from class: rf.c
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j) {
                    return e.b(callable, abstractC5516j);
                }
            });
            this.f159538c = n10;
        }
        return n10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f159536a.execute(runnable);
    }

    e(ExecutorService executorService) {
        this.f159536a = executorService;
    }

    public static /* synthetic */ AbstractC5516j a(Runnable runnable, AbstractC5516j abstractC5516j) {
        runnable.run();
        return C5519m.f(null);
    }

    public static /* synthetic */ AbstractC5516j b(Callable callable, AbstractC5516j abstractC5516j) {
        return (AbstractC5516j) callable.call();
    }
}
