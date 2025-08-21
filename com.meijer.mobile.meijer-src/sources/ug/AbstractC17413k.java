package ug;

import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.C5517k;
import Vd.C5519m;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ug.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC17413k {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f163950b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f163951c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    protected final C17417o f163949a = new C17417o();

    public abstract void b() throws MlKitException;

    protected abstract void d();

    public <T> AbstractC5516j<T> a(final Executor executor, final Callable<T> callable, final AbstractC5507a abstractC5507a) {
        com.google.android.gms.common.internal.r.p(this.f163950b.get() > 0);
        if (abstractC5507a.a()) {
            return C5519m.d();
        }
        final C5508b c5508b = new C5508b();
        final C5517k c5517k = new C5517k(c5508b.b());
        this.f163949a.a(new Executor() { // from class: ug.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC5507a.a()) {
                        c5508b.a();
                    } else {
                        c5517k.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: ug.A
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f163923a.g(abstractC5507a, c5508b, callable, c5517k);
            }
        });
        return c5517k.a();
    }

    public void c() {
        this.f163950b.incrementAndGet();
    }

    public AbstractC5516j<Void> f(Executor executor) {
        com.google.android.gms.common.internal.r.p(this.f163950b.get() > 0);
        final C5517k c5517k = new C5517k();
        this.f163949a.a(executor, new Runnable() { // from class: ug.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f164007a.h(c5517k);
            }
        });
        return c5517k.a();
    }

    final /* synthetic */ void h(C5517k c5517k) {
        int iDecrementAndGet = this.f163950b.decrementAndGet();
        com.google.android.gms.common.internal.r.p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f163951c.set(false);
        }
        Ed.B.a();
        c5517k.c(null);
    }

    public void e(Executor executor) {
        f(executor);
    }

    final /* synthetic */ void g(AbstractC5507a abstractC5507a, C5508b c5508b, Callable callable, C5517k c5517k) throws Exception {
        try {
            if (abstractC5507a.a()) {
                c5508b.a();
                return;
            }
            try {
                if (!this.f163951c.get()) {
                    b();
                    this.f163951c.set(true);
                }
                if (abstractC5507a.a()) {
                    c5508b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC5507a.a()) {
                    c5508b.a();
                } else {
                    c5517k.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC5507a.a()) {
                c5508b.a();
            } else {
                c5517k.b(e11);
            }
        }
    }
}
