package Yu;

import gv.C14313a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Yu.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5448e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41224a;

    /* renamed from: Yu.e$a */
    static final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f41225a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.q<T> f41226b;

        /* renamed from: c, reason: collision with root package name */
        private T f41227c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41228d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f41229e = true;

        /* renamed from: f, reason: collision with root package name */
        private Throwable f41230f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f41231g;

        private boolean a() {
            if (!this.f41231g) {
                this.f41231g = true;
                this.f41225a.d();
                new C5500y0(this.f41226b).subscribe(this.f41225a);
            }
            try {
                io.reactivex.k<T> kVarE = this.f41225a.e();
                if (kVarE.h()) {
                    this.f41229e = false;
                    this.f41227c = kVarE.e();
                    return true;
                }
                this.f41228d = false;
                if (kVarE.f()) {
                    return false;
                }
                Throwable thD = kVarE.d();
                this.f41230f = thD;
                throw ev.j.d(thD);
            } catch (InterruptedException e10) {
                this.f41225a.dispose();
                this.f41230f = e10;
                throw ev.j.d(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f41230f;
            if (th2 != null) {
                throw ev.j.d(th2);
            }
            if (this.f41228d) {
                return !this.f41229e || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f41230f;
            if (th2 != null) {
                throw ev.j.d(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f41229e = true;
            return this.f41227c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        a(io.reactivex.q<T> qVar, b<T> bVar) {
            this.f41226b = qVar;
            this.f41225a = bVar;
        }
    }

    /* renamed from: Yu.e$b */
    static final class b<T> extends io.reactivex.observers.d<io.reactivex.k<T>> {

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.k<T>> f41232b = new ArrayBlockingQueue(1);

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f41233c = new AtomicInteger();

        @Override // io.reactivex.s
        public void onComplete() {
        }

        @Override // io.reactivex.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.k<T> kVar) {
            if (this.f41233c.getAndSet(0) == 1 || !kVar.h()) {
                while (!this.f41232b.offer(kVar)) {
                    io.reactivex.k<T> kVarPoll = this.f41232b.poll();
                    if (kVarPoll != null && !kVarPoll.h()) {
                        kVar = kVarPoll;
                    }
                }
            }
        }

        void d() {
            this.f41233c.set(1);
        }

        b() {
        }

        public io.reactivex.k<T> e() throws InterruptedException {
            d();
            ev.e.b();
            return this.f41232b.take();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C14313a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f41224a, new b());
    }

    public C5448e(io.reactivex.q<T> qVar) {
        this.f41224a = qVar;
    }
}
