package sg;

import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5224b;
import Td.C5233k;
import Td.C5235m;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC16966k {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f160464b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f160465c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    protected final C16970o f160463a = new C16970o();

    public abstract void b() throws MlKitException;

    protected abstract void d();

    public <T> AbstractC5232j<T> a(final Executor executor, final Callable<T> callable, final AbstractC5223a abstractC5223a) {
        com.google.android.gms.common.internal.r.p(this.f160464b.get() > 0);
        if (abstractC5223a.a()) {
            return C5235m.d();
        }
        final C5224b c5224b = new C5224b();
        final C5233k c5233k = new C5233k(c5224b.b());
        this.f160463a.a(new Executor() { // from class: sg.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC5223a.a()) {
                        c5224b.a();
                    } else {
                        c5233k.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: sg.A
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f160437a.g(abstractC5223a, c5224b, callable, c5233k);
            }
        });
        return c5233k.a();
    }

    public void c() {
        this.f160464b.incrementAndGet();
    }

    public AbstractC5232j<Void> f(Executor executor) {
        com.google.android.gms.common.internal.r.p(this.f160464b.get() > 0);
        final C5233k c5233k = new C5233k();
        this.f160463a.a(executor, new Runnable() { // from class: sg.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f160521a.h(c5233k);
            }
        });
        return c5233k.a();
    }

    final /* synthetic */ void h(C5233k c5233k) {
        int iDecrementAndGet = this.f160464b.decrementAndGet();
        com.google.android.gms.common.internal.r.p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f160465c.set(false);
        }
        Cd.B.a();
        c5233k.c(null);
    }

    public void e(Executor executor) {
        f(executor);
    }

    final /* synthetic */ void g(AbstractC5223a abstractC5223a, C5224b c5224b, Callable callable, C5233k c5233k) throws Exception {
        try {
            if (abstractC5223a.a()) {
                c5224b.a();
                return;
            }
            try {
                if (!this.f160465c.get()) {
                    b();
                    this.f160465c.set(true);
                }
                if (abstractC5223a.a()) {
                    c5224b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC5223a.a()) {
                    c5224b.a();
                } else {
                    c5233k.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC5223a.a()) {
                c5224b.a();
            } else {
                c5233k.b(e11);
            }
        }
    }
}
