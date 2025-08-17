package Tu;

import gv.C14313a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class n<T> extends CountDownLatch implements io.reactivex.s<T>, Future<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    T f35475a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f35476b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Nu.b> f35477c;

    public n() {
        super(1);
        this.f35477c = new AtomicReference<>();
    }

    @Override // Nu.b
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            ev.e.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f35476b;
        if (th2 == null) {
            return this.f35475a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Nu.b bVar;
        Qu.d dVar;
        do {
            bVar = this.f35477c.get();
            if (bVar == this || bVar == (dVar = Qu.d.DISPOSED)) {
                return false;
            }
        } while (!U.d.a(this.f35477c, bVar, dVar));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return Qu.d.b(this.f35477c.get());
    }

    @Override // io.reactivex.s
    public void onComplete() {
        Nu.b bVar;
        if (this.f35475a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f35477c.get();
            if (bVar == this || bVar == Qu.d.DISPOSED) {
                return;
            }
        } while (!U.d.a(this.f35477c, bVar, this));
        countDown();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Nu.b bVar;
        if (this.f35476b != null) {
            C14313a.s(th2);
            return;
        }
        this.f35476b = th2;
        do {
            bVar = this.f35477c.get();
            if (bVar == this || bVar == Qu.d.DISPOSED) {
                C14313a.s(th2);
                return;
            }
        } while (!U.d.a(this.f35477c, bVar, this));
        countDown();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f35475a == null) {
            this.f35475a = t10;
        } else {
            this.f35477c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        Qu.d.o(this.f35477c, bVar);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            ev.e.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ev.j.c(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f35476b;
            if (th2 == null) {
                return this.f35475a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
