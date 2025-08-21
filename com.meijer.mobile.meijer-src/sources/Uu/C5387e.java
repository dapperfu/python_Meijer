package Uu;

import cv.C13558a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Uu.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5387e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38449a;

    /* renamed from: Uu.e$a */
    static final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f38450a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.q<T> f38451b;

        /* renamed from: c, reason: collision with root package name */
        private T f38452c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f38453d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f38454e = true;

        /* renamed from: f, reason: collision with root package name */
        private Throwable f38455f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f38456g;

        private boolean a() {
            if (!this.f38456g) {
                this.f38456g = true;
                this.f38450a.d();
                new C5439y0(this.f38451b).subscribe(this.f38450a);
            }
            try {
                io.reactivex.k<T> kVarE = this.f38450a.e();
                if (kVarE.h()) {
                    this.f38454e = false;
                    this.f38452c = kVarE.e();
                    return true;
                }
                this.f38453d = false;
                if (kVarE.f()) {
                    return false;
                }
                Throwable thD = kVarE.d();
                this.f38455f = thD;
                throw av.j.d(thD);
            } catch (InterruptedException e10) {
                this.f38450a.dispose();
                this.f38455f = e10;
                throw av.j.d(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f38455f;
            if (th2 != null) {
                throw av.j.d(th2);
            }
            if (this.f38453d) {
                return !this.f38454e || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f38455f;
            if (th2 != null) {
                throw av.j.d(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f38454e = true;
            return this.f38452c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        a(io.reactivex.q<T> qVar, b<T> bVar) {
            this.f38451b = qVar;
            this.f38450a = bVar;
        }
    }

    /* renamed from: Uu.e$b */
    static final class b<T> extends io.reactivex.observers.d<io.reactivex.k<T>> {

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.k<T>> f38457b = new ArrayBlockingQueue(1);

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f38458c = new AtomicInteger();

        @Override // io.reactivex.s
        public void onComplete() {
        }

        @Override // io.reactivex.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.k<T> kVar) {
            if (this.f38458c.getAndSet(0) == 1 || !kVar.h()) {
                while (!this.f38457b.offer(kVar)) {
                    io.reactivex.k<T> kVarPoll = this.f38457b.poll();
                    if (kVarPoll != null && !kVarPoll.h()) {
                        kVar = kVarPoll;
                    }
                }
            }
        }

        void d() {
            this.f38458c.set(1);
        }

        b() {
        }

        public io.reactivex.k<T> e() throws InterruptedException {
            d();
            av.e.b();
            return this.f38457b.take();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C13558a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f38449a, new b());
    }

    public C5387e(io.reactivex.q<T> qVar) {
        this.f38449a = qVar;
    }
}
