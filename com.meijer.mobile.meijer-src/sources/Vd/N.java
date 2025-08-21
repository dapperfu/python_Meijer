package Vd;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class N<TResult> extends AbstractC5516j<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39852a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final J f39853b = new J();

    /* renamed from: c, reason: collision with root package name */
    private boolean f39854c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f39855d;

    /* renamed from: e, reason: collision with root package name */
    private Object f39856e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f39857f;

    private final void A() {
        if (this.f39855d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void B() {
        if (this.f39854c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void C() {
        synchronized (this.f39852a) {
            try {
                if (this.f39854c) {
                    this.f39853b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void z() {
        com.google.android.gms.common.internal.r.q(this.f39854c, "Task is not yet complete");
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> a(InterfaceC5510d interfaceC5510d) {
        b(C5518l.f39866a, interfaceC5510d);
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> b(Executor executor, InterfaceC5510d interfaceC5510d) {
        this.f39853b.a(new z(executor, interfaceC5510d));
        C();
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> c(InterfaceC5511e<TResult> interfaceC5511e) {
        this.f39853b.a(new B(C5518l.f39866a, interfaceC5511e));
        C();
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> d(Executor executor, InterfaceC5511e<TResult> interfaceC5511e) {
        this.f39853b.a(new B(executor, interfaceC5511e));
        C();
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> e(InterfaceC5512f interfaceC5512f) {
        f(C5518l.f39866a, interfaceC5512f);
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> f(Executor executor, InterfaceC5512f interfaceC5512f) {
        this.f39853b.a(new D(executor, interfaceC5512f));
        C();
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> g(InterfaceC5513g<? super TResult> interfaceC5513g) {
        h(C5518l.f39866a, interfaceC5513g);
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final AbstractC5516j<TResult> h(Executor executor, InterfaceC5513g<? super TResult> interfaceC5513g) {
        this.f39853b.a(new F(executor, interfaceC5513g));
        C();
        return this;
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> i(InterfaceC5509c<TResult, TContinuationResult> interfaceC5509c) {
        return j(C5518l.f39866a, interfaceC5509c);
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> j(Executor executor, InterfaceC5509c<TResult, TContinuationResult> interfaceC5509c) {
        N n10 = new N();
        this.f39853b.a(new v(executor, interfaceC5509c, n10));
        C();
        return n10;
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> k(InterfaceC5509c<TResult, AbstractC5516j<TContinuationResult>> interfaceC5509c) {
        return l(C5518l.f39866a, interfaceC5509c);
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> l(Executor executor, InterfaceC5509c<TResult, AbstractC5516j<TContinuationResult>> interfaceC5509c) {
        N n10 = new N();
        this.f39853b.a(new x(executor, interfaceC5509c, n10));
        C();
        return n10;
    }

    @Override // Vd.AbstractC5516j
    public final Exception m() {
        Exception exc;
        synchronized (this.f39852a) {
            exc = this.f39857f;
        }
        return exc;
    }

    @Override // Vd.AbstractC5516j
    public final TResult n() {
        TResult tresult;
        synchronized (this.f39852a) {
            try {
                z();
                A();
                Exception exc = this.f39857f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f39856e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // Vd.AbstractC5516j
    public final <X extends Throwable> TResult o(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f39852a) {
            try {
                z();
                A();
                if (cls.isInstance(this.f39857f)) {
                    throw cls.cast(this.f39857f);
                }
                Exception exc = this.f39857f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f39856e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // Vd.AbstractC5516j
    public final boolean p() {
        return this.f39855d;
    }

    @Override // Vd.AbstractC5516j
    public final boolean q() {
        boolean z10;
        synchronized (this.f39852a) {
            z10 = this.f39854c;
        }
        return z10;
    }

    @Override // Vd.AbstractC5516j
    public final boolean r() {
        boolean z10;
        synchronized (this.f39852a) {
            try {
                z10 = false;
                if (this.f39854c && !this.f39855d && this.f39857f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> s(InterfaceC5515i<TResult, TContinuationResult> interfaceC5515i) {
        Executor executor = C5518l.f39866a;
        N n10 = new N();
        this.f39853b.a(new H(executor, interfaceC5515i, n10));
        C();
        return n10;
    }

    @Override // Vd.AbstractC5516j
    public final <TContinuationResult> AbstractC5516j<TContinuationResult> t(Executor executor, InterfaceC5515i<TResult, TContinuationResult> interfaceC5515i) {
        N n10 = new N();
        this.f39853b.a(new H(executor, interfaceC5515i, n10));
        C();
        return n10;
    }

    public final void u(Exception exc) {
        com.google.android.gms.common.internal.r.m(exc, "Exception must not be null");
        synchronized (this.f39852a) {
            B();
            this.f39854c = true;
            this.f39857f = exc;
        }
        this.f39853b.b(this);
    }

    public final void v(Object obj) {
        synchronized (this.f39852a) {
            B();
            this.f39854c = true;
            this.f39856e = obj;
        }
        this.f39853b.b(this);
    }

    public final boolean w() {
        synchronized (this.f39852a) {
            try {
                if (this.f39854c) {
                    return false;
                }
                this.f39854c = true;
                this.f39855d = true;
                this.f39853b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x(Exception exc) {
        com.google.android.gms.common.internal.r.m(exc, "Exception must not be null");
        synchronized (this.f39852a) {
            try {
                if (this.f39854c) {
                    return false;
                }
                this.f39854c = true;
                this.f39857f = exc;
                this.f39853b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean y(Object obj) {
        synchronized (this.f39852a) {
            try {
                if (this.f39854c) {
                    return false;
                }
                this.f39854c = true;
                this.f39856e = obj;
                this.f39853b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    N() {
    }
}
