package Pu;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class h<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f27231b = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Queue<Object> f27232a;

    @Override // io.reactivex.s
    public void onComplete() {
        this.f27232a.offer(av.m.e());
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f27232a.offer(av.m.m(th2));
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f27232a.offer(av.m.z(t10));
    }

    public h(Queue<Object> queue) {
        this.f27232a = queue;
    }

    @Override // Ju.b
    public void dispose() {
        if (Mu.d.a(this)) {
            this.f27232a.offer(f27231b);
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        if (get() == Mu.d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        Mu.d.o(this, bVar);
    }
}
