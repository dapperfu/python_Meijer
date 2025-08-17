package Tu;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class h<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f35459b = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Queue<Object> f35460a;

    @Override // io.reactivex.s
    public void onComplete() {
        this.f35460a.offer(ev.m.e());
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f35460a.offer(ev.m.m(th2));
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f35460a.offer(ev.m.z(t10));
    }

    public h(Queue<Object> queue) {
        this.f35460a = queue;
    }

    @Override // Nu.b
    public void dispose() {
        if (Qu.d.a(this)) {
            this.f35460a.offer(f35459b);
        }
    }

    @Override // Nu.b
    public boolean isDisposed() {
        if (get() == Qu.d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        Qu.d.o(this, bVar);
    }
}
