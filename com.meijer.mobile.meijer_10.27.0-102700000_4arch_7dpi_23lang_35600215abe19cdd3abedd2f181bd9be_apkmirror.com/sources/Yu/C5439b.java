package Yu;

import av.C6159c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Yu.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5439b<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41154a;

    /* renamed from: b, reason: collision with root package name */
    final int f41155b;

    /* renamed from: Yu.b$a */
    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Iterator<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final C6159c<T> f41156a;

        /* renamed from: b, reason: collision with root package name */
        final Lock f41157b;

        /* renamed from: c, reason: collision with root package name */
        final Condition f41158c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41159d;

        /* renamed from: e, reason: collision with root package name */
        volatile Throwable f41160e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41159d = true;
            a();
        }

        void a() {
            this.f41157b.lock();
            try {
                this.f41158c.signalAll();
            } finally {
                this.f41157b.unlock();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41160e = th2;
            this.f41159d = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41156a.offer(t10);
            a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        a(int i10) {
            this.f41156a = new C6159c<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f41157b = reentrantLock;
            this.f41158c = reentrantLock.newCondition();
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
            a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z10 = this.f41159d;
                boolean zIsEmpty = this.f41156a.isEmpty();
                if (z10) {
                    Throwable th2 = this.f41160e;
                    if (th2 == null) {
                        if (zIsEmpty) {
                            return false;
                        }
                    } else {
                        throw ev.j.d(th2);
                    }
                }
                if (zIsEmpty) {
                    try {
                        ev.e.b();
                        this.f41157b.lock();
                        while (!this.f41159d && this.f41156a.isEmpty() && !isDisposed()) {
                            try {
                                this.f41158c.await();
                            } finally {
                            }
                        }
                        this.f41157b.unlock();
                    } catch (InterruptedException e10) {
                        Qu.d.a(this);
                        a();
                        throw ev.j.d(e10);
                    }
                } else {
                    return true;
                }
            }
            Throwable th3 = this.f41160e;
            if (th3 == null) {
                return false;
            }
            throw ev.j.d(th3);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f41156a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f41155b);
        this.f41154a.subscribe(aVar);
        return aVar;
    }

    public C5439b(io.reactivex.q<? extends T> qVar, int i10) {
        this.f41154a = qVar;
        this.f41155b = i10;
    }
}
