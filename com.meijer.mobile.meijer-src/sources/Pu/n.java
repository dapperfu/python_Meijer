package Pu;

import cv.C13558a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class n<T> extends CountDownLatch implements io.reactivex.s<T>, Future<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    T f27247a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f27248b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Ju.b> f27249c;

    public n() {
        super(1);
        this.f27249c = new AtomicReference<>();
    }

    @Override // Ju.b
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            av.e.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f27248b;
        if (th2 == null) {
            return this.f27247a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Ju.b bVar;
        Mu.d dVar;
        do {
            bVar = this.f27249c.get();
            if (bVar == this || bVar == (dVar = Mu.d.DISPOSED)) {
                return false;
            }
        } while (!U.d.a(this.f27249c, bVar, dVar));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return Mu.d.b(this.f27249c.get());
    }

    @Override // io.reactivex.s
    public void onComplete() {
        Ju.b bVar;
        if (this.f27247a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f27249c.get();
            if (bVar == this || bVar == Mu.d.DISPOSED) {
                return;
            }
        } while (!U.d.a(this.f27249c, bVar, this));
        countDown();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Ju.b bVar;
        if (this.f27248b != null) {
            C13558a.s(th2);
            return;
        }
        this.f27248b = th2;
        do {
            bVar = this.f27249c.get();
            if (bVar == this || bVar == Mu.d.DISPOSED) {
                C13558a.s(th2);
                return;
            }
        } while (!U.d.a(this.f27249c, bVar, this));
        countDown();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f27247a == null) {
            this.f27247a = t10;
        } else {
            this.f27249c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        Mu.d.o(this.f27249c, bVar);
    }

    @Override // Ju.b
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
            av.e.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(av.j.c(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f27248b;
            if (th2 == null) {
                return this.f27247a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
