package Uu;

import fv.C14273f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class G1<T> extends AbstractC5375a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f37912b;

    /* renamed from: c, reason: collision with root package name */
    final long f37913c;

    /* renamed from: d, reason: collision with root package name */
    final int f37914d;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f37915a;

        /* renamed from: b, reason: collision with root package name */
        final long f37916b;

        /* renamed from: c, reason: collision with root package name */
        final int f37917c;

        /* renamed from: d, reason: collision with root package name */
        long f37918d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f37919e;

        /* renamed from: f, reason: collision with root package name */
        C14273f<T> f37920f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f37921g;

        @Override // Ju.b
        public void dispose() {
            this.f37921g = true;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37921g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            C14273f<T> c14273f = this.f37920f;
            if (c14273f != null) {
                this.f37920f = null;
                c14273f.onComplete();
            }
            this.f37915a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C14273f<T> c14273f = this.f37920f;
            if (c14273f != null) {
                this.f37920f = null;
                c14273f.onError(th2);
            }
            this.f37915a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C14273f<T> c14273fF = this.f37920f;
            if (c14273fF == null && !this.f37921g) {
                c14273fF = C14273f.f(this.f37917c, this);
                this.f37920f = c14273fF;
                this.f37915a.onNext(c14273fF);
            }
            if (c14273fF != null) {
                c14273fF.onNext(t10);
                long j10 = this.f37918d + 1;
                this.f37918d = j10;
                if (j10 >= this.f37916b) {
                    this.f37918d = 0L;
                    this.f37920f = null;
                    c14273fF.onComplete();
                    if (this.f37921g) {
                        this.f37919e.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37919e, bVar)) {
                this.f37919e = bVar;
                this.f37915a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37921g) {
                this.f37919e.dispose();
            }
        }

        a(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, int i10) {
            this.f37915a = sVar;
            this.f37916b = j10;
            this.f37917c = i10;
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f37922a;

        /* renamed from: b, reason: collision with root package name */
        final long f37923b;

        /* renamed from: c, reason: collision with root package name */
        final long f37924c;

        /* renamed from: d, reason: collision with root package name */
        final int f37925d;

        /* renamed from: f, reason: collision with root package name */
        long f37927f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f37928g;

        /* renamed from: h, reason: collision with root package name */
        long f37929h;

        /* renamed from: i, reason: collision with root package name */
        Ju.b f37930i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f37931j = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        final ArrayDeque<C14273f<T>> f37926e = new ArrayDeque<>();

        @Override // Ju.b
        public void dispose() {
            this.f37928g = true;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37928g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayDeque<C14273f<T>> arrayDeque = this.f37926e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f37922a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            ArrayDeque<C14273f<T>> arrayDeque = this.f37926e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f37922a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ArrayDeque<C14273f<T>> arrayDeque = this.f37926e;
            long j10 = this.f37927f;
            long j11 = this.f37924c;
            if (j10 % j11 == 0 && !this.f37928g) {
                this.f37931j.getAndIncrement();
                C14273f<T> c14273fF = C14273f.f(this.f37925d, this);
                arrayDeque.offer(c14273fF);
                this.f37922a.onNext(c14273fF);
            }
            long j12 = this.f37929h + 1;
            Iterator<C14273f<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.f37923b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f37928g) {
                    this.f37930i.dispose();
                    return;
                }
                this.f37929h = j12 - j11;
            } else {
                this.f37929h = j12;
            }
            this.f37927f = j10 + 1;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37930i, bVar)) {
                this.f37930i = bVar;
                this.f37922a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37931j.decrementAndGet() == 0 && this.f37928g) {
                this.f37930i.dispose();
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, long j11, int i10) {
            this.f37922a = sVar;
            this.f37923b = j10;
            this.f37924c = j11;
            this.f37925d = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        if (this.f37912b == this.f37913c) {
            this.f38360a.subscribe(new a(sVar, this.f37912b, this.f37914d));
        } else {
            this.f38360a.subscribe(new b(sVar, this.f37912b, this.f37913c, this.f37914d));
        }
    }

    public G1(io.reactivex.q<T> qVar, long j10, long j11, int i10) {
        super(qVar);
        this.f37912b = j10;
        this.f37913c = j11;
        this.f37914d = i10;
    }
}
