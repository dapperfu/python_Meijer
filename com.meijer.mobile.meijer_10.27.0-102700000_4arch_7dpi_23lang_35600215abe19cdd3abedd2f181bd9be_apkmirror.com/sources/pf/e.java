package pf;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.N;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f155735a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f155736b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5232j<?> f155737c = C5235m.f(null);

    public ExecutorService c() {
        return this.f155735a;
    }

    public AbstractC5232j<Void> d(final Runnable runnable) {
        AbstractC5232j abstractC5232jL;
        synchronized (this.f155736b) {
            abstractC5232jL = this.f155737c.l(this.f155735a, new InterfaceC5225c() { // from class: pf.d
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return e.a(runnable, abstractC5232j);
                }
            });
            this.f155737c = abstractC5232jL;
        }
        return abstractC5232jL;
    }

    public <T> AbstractC5232j<T> e(final Callable<AbstractC5232j<T>> callable) {
        N n10;
        synchronized (this.f155736b) {
            n10 = (AbstractC5232j<T>) this.f155737c.l(this.f155735a, new InterfaceC5225c() { // from class: pf.c
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return e.b(callable, abstractC5232j);
                }
            });
            this.f155737c = n10;
        }
        return n10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f155735a.execute(runnable);
    }

    e(ExecutorService executorService) {
        this.f155735a = executorService;
    }

    public static /* synthetic */ AbstractC5232j a(Runnable runnable, AbstractC5232j abstractC5232j) {
        runnable.run();
        return C5235m.f(null);
    }

    public static /* synthetic */ AbstractC5232j b(Callable callable, AbstractC5232j abstractC5232j) {
        return (AbstractC5232j) callable.call();
    }
}
