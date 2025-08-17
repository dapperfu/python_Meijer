package I;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q.InterfaceC16423a;

/* loaded from: classes.dex */
public class d<V> implements q<V> {

    /* renamed from: a, reason: collision with root package name */
    private final q<V> f13400a;

    /* renamed from: b, reason: collision with root package name */
    c.a<V> f13401b;

    class a implements c.InterfaceC1088c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC1088c
        public Object a(c.a<V> aVar) {
            o2.i.j(d.this.f13401b == null, "The result can only set once!");
            d.this.f13401b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(q<V> qVar) {
        this.f13400a = (q) o2.i.g(qVar);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f13400a.get();
    }

    public static <V> d<V> a(q<V> qVar) {
        return qVar instanceof d ? (d) qVar : new d<>(qVar);
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        this.f13400a.addListener(runnable, executor);
    }

    boolean b(V v10) {
        c.a<V> aVar = this.f13401b;
        if (aVar != null) {
            return aVar.c(v10);
        }
        return false;
    }

    boolean c(Throwable th2) {
        c.a<V> aVar = this.f13401b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f13400a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f13400a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13400a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f13400a.isDone();
    }

    d() {
        this.f13400a = androidx.concurrent.futures.c.a(new a());
    }

    public final <T> d<T> d(InterfaceC16423a<? super V, T> interfaceC16423a, Executor executor) {
        return (d) n.x(this, interfaceC16423a, executor);
    }

    public final <T> d<T> e(I.a<? super V, T> aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }
}
