package Uu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Uu.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5378b<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38379a;

    /* renamed from: b, reason: collision with root package name */
    final int f38380b;

    /* renamed from: Uu.b$a */
    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Iterator<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final Wu.c<T> f38381a;

        /* renamed from: b, reason: collision with root package name */
        final Lock f38382b;

        /* renamed from: c, reason: collision with root package name */
        final Condition f38383c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38384d;

        /* renamed from: e, reason: collision with root package name */
        volatile Throwable f38385e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38384d = true;
            a();
        }

        void a() {
            this.f38382b.lock();
            try {
                this.f38383c.signalAll();
            } finally {
                this.f38382b.unlock();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38385e = th2;
            this.f38384d = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38381a.offer(t10);
            a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        a(int i10) {
            this.f38381a = new Wu.c<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f38382b = reentrantLock;
            this.f38383c = reentrantLock.newCondition();
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
            a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z10 = this.f38384d;
                boolean zIsEmpty = this.f38381a.isEmpty();
                if (z10) {
                    Throwable th2 = this.f38385e;
                    if (th2 == null) {
                        if (zIsEmpty) {
                            return false;
                        }
                    } else {
                        throw av.j.d(th2);
                    }
                }
                if (zIsEmpty) {
                    try {
                        av.e.b();
                        this.f38382b.lock();
                        while (!this.f38384d && this.f38381a.isEmpty() && !isDisposed()) {
                            try {
                                this.f38383c.await();
                            } finally {
                            }
                        }
                        this.f38382b.unlock();
                    } catch (InterruptedException e10) {
                        Mu.d.a(this);
                        a();
                        throw av.j.d(e10);
                    }
                } else {
                    return true;
                }
            }
            Throwable th3 = this.f38385e;
            if (th3 == null) {
                return false;
            }
            throw av.j.d(th3);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f38381a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f38380b);
        this.f38379a.subscribe(aVar);
        return aVar;
    }

    public C5378b(io.reactivex.q<? extends T> qVar, int i10) {
        this.f38379a = qVar;
        this.f38380b = i10;
    }
}
