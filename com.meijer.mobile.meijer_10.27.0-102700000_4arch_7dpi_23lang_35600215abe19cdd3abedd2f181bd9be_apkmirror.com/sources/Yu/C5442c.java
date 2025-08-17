package Yu;

import gv.C14313a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5442c<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41172a;

    /* renamed from: Yu.c$a */
    static final class a<T> extends io.reactivex.observers.d<io.reactivex.k<T>> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.k<T> f41173b;

        /* renamed from: c, reason: collision with root package name */
        final Semaphore f41174c = new Semaphore(0);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.k<T>> f41175d = new AtomicReference<>();

        @Override // io.reactivex.s
        public void onComplete() {
        }

        @Override // io.reactivex.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.k<T> kVar) {
            if (this.f41175d.getAndSet(kVar) == null) {
                this.f41174c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws InterruptedException {
            io.reactivex.k<T> kVar = this.f41173b;
            if (kVar != null && kVar.g()) {
                throw ev.j.d(this.f41173b.d());
            }
            if (this.f41173b == null) {
                try {
                    ev.e.b();
                    this.f41174c.acquire();
                    io.reactivex.k<T> andSet = this.f41175d.getAndSet(null);
                    this.f41173b = andSet;
                    if (andSet.g()) {
                        throw ev.j.d(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f41173b = io.reactivex.k.b(e10);
                    throw ev.j.d(e10);
                }
            }
            return this.f41173b.h();
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
                T tE = this.f41173b.e();
                this.f41173b = null;
                return tE;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C14313a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.l.wrap(this.f41172a).materialize().subscribe(aVar);
        return aVar;
    }

    public C5442c(io.reactivex.q<T> qVar) {
        this.f41172a = qVar;
    }
}
