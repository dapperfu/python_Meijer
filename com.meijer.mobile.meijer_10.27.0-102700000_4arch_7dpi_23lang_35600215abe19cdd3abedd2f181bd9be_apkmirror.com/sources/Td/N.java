package Td;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class N<TResult> extends AbstractC5232j<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34919a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final J f34920b = new J();

    /* renamed from: c, reason: collision with root package name */
    private boolean f34921c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f34922d;

    /* renamed from: e, reason: collision with root package name */
    private Object f34923e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f34924f;

    private final void A() {
        if (this.f34922d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void B() {
        if (this.f34921c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void C() {
        synchronized (this.f34919a) {
            try {
                if (this.f34921c) {
                    this.f34920b.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void z() {
        com.google.android.gms.common.internal.r.q(this.f34921c, "Task is not yet complete");
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> a(InterfaceC5226d interfaceC5226d) {
        b(C5234l.f34933a, interfaceC5226d);
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> b(Executor executor, InterfaceC5226d interfaceC5226d) {
        this.f34920b.a(new z(executor, interfaceC5226d));
        C();
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> c(InterfaceC5227e<TResult> interfaceC5227e) {
        this.f34920b.a(new B(C5234l.f34933a, interfaceC5227e));
        C();
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> d(Executor executor, InterfaceC5227e<TResult> interfaceC5227e) {
        this.f34920b.a(new B(executor, interfaceC5227e));
        C();
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> e(InterfaceC5228f interfaceC5228f) {
        f(C5234l.f34933a, interfaceC5228f);
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> f(Executor executor, InterfaceC5228f interfaceC5228f) {
        this.f34920b.a(new D(executor, interfaceC5228f));
        C();
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> g(InterfaceC5229g<? super TResult> interfaceC5229g) {
        h(C5234l.f34933a, interfaceC5229g);
        return this;
    }

    @Override // Td.AbstractC5232j
    public final AbstractC5232j<TResult> h(Executor executor, InterfaceC5229g<? super TResult> interfaceC5229g) {
        this.f34920b.a(new F(executor, interfaceC5229g));
        C();
        return this;
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> i(InterfaceC5225c<TResult, TContinuationResult> interfaceC5225c) {
        return j(C5234l.f34933a, interfaceC5225c);
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> j(Executor executor, InterfaceC5225c<TResult, TContinuationResult> interfaceC5225c) {
        N n10 = new N();
        this.f34920b.a(new v(executor, interfaceC5225c, n10));
        C();
        return n10;
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> k(InterfaceC5225c<TResult, AbstractC5232j<TContinuationResult>> interfaceC5225c) {
        return l(C5234l.f34933a, interfaceC5225c);
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> l(Executor executor, InterfaceC5225c<TResult, AbstractC5232j<TContinuationResult>> interfaceC5225c) {
        N n10 = new N();
        this.f34920b.a(new x(executor, interfaceC5225c, n10));
        C();
        return n10;
    }

    @Override // Td.AbstractC5232j
    public final Exception m() {
        Exception exc;
        synchronized (this.f34919a) {
            exc = this.f34924f;
        }
        return exc;
    }

    @Override // Td.AbstractC5232j
    public final TResult n() {
        TResult tresult;
        synchronized (this.f34919a) {
            try {
                z();
                A();
                Exception exc = this.f34924f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f34923e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // Td.AbstractC5232j
    public final <X extends Throwable> TResult o(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f34919a) {
            try {
                z();
                A();
                if (cls.isInstance(this.f34924f)) {
                    throw cls.cast(this.f34924f);
                }
                Exception exc = this.f34924f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f34923e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // Td.AbstractC5232j
    public final boolean p() {
        return this.f34922d;
    }

    @Override // Td.AbstractC5232j
    public final boolean q() {
        boolean z10;
        synchronized (this.f34919a) {
            z10 = this.f34921c;
        }
        return z10;
    }

    @Override // Td.AbstractC5232j
    public final boolean r() {
        boolean z10;
        synchronized (this.f34919a) {
            try {
                z10 = false;
                if (this.f34921c && !this.f34922d && this.f34924f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> s(InterfaceC5231i<TResult, TContinuationResult> interfaceC5231i) {
        Executor executor = C5234l.f34933a;
        N n10 = new N();
        this.f34920b.a(new H(executor, interfaceC5231i, n10));
        C();
        return n10;
    }

    @Override // Td.AbstractC5232j
    public final <TContinuationResult> AbstractC5232j<TContinuationResult> t(Executor executor, InterfaceC5231i<TResult, TContinuationResult> interfaceC5231i) {
        N n10 = new N();
        this.f34920b.a(new H(executor, interfaceC5231i, n10));
        C();
        return n10;
    }

    public final void u(Exception exc) {
        com.google.android.gms.common.internal.r.m(exc, "Exception must not be null");
        synchronized (this.f34919a) {
            B();
            this.f34921c = true;
            this.f34924f = exc;
        }
        this.f34920b.b(this);
    }

    public final void v(Object obj) {
        synchronized (this.f34919a) {
            B();
            this.f34921c = true;
            this.f34923e = obj;
        }
        this.f34920b.b(this);
    }

    public final boolean w() {
        synchronized (this.f34919a) {
            try {
                if (this.f34921c) {
                    return false;
                }
                this.f34921c = true;
                this.f34922d = true;
                this.f34920b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x(Exception exc) {
        com.google.android.gms.common.internal.r.m(exc, "Exception must not be null");
        synchronized (this.f34919a) {
            try {
                if (this.f34921c) {
                    return false;
                }
                this.f34921c = true;
                this.f34924f = exc;
                this.f34920b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean y(Object obj) {
        synchronized (this.f34919a) {
            try {
                if (this.f34921c) {
                    return false;
                }
                this.f34921c = true;
                this.f34923e = obj;
                this.f34920b.b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    N() {
    }
}
