package Uu;

import cv.C13558a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5381c<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38397a;

    /* renamed from: Uu.c$a */
    static final class a<T> extends io.reactivex.observers.d<io.reactivex.k<T>> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.k<T> f38398b;

        /* renamed from: c, reason: collision with root package name */
        final Semaphore f38399c = new Semaphore(0);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.k<T>> f38400d = new AtomicReference<>();

        @Override // io.reactivex.s
        public void onComplete() {
        }

        @Override // io.reactivex.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.k<T> kVar) {
            if (this.f38400d.getAndSet(kVar) == null) {
                this.f38399c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws InterruptedException {
            io.reactivex.k<T> kVar = this.f38398b;
            if (kVar != null && kVar.g()) {
                throw av.j.d(this.f38398b.d());
            }
            if (this.f38398b == null) {
                try {
                    av.e.b();
                    this.f38399c.acquire();
                    io.reactivex.k<T> andSet = this.f38400d.getAndSet(null);
                    this.f38398b = andSet;
                    if (andSet.g()) {
                        throw av.j.d(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f38398b = io.reactivex.k.b(e10);
                    throw av.j.d(e10);
                }
            }
            return this.f38398b.h();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        a() {
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tE = this.f38398b.e();
                this.f38398b = null;
                return tE;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C13558a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.l.wrap(this.f38397a).materialize().subscribe(aVar);
        return aVar;
    }

    public C5381c(io.reactivex.q<T> qVar) {
        this.f38397a = qVar;
    }
}
