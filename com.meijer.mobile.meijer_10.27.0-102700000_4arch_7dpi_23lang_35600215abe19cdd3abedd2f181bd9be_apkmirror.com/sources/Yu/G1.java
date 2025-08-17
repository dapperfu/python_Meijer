package Yu;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jv.C15083f;

/* loaded from: classes9.dex */
public final class G1<T> extends AbstractC5436a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f40687b;

    /* renamed from: c, reason: collision with root package name */
    final long f40688c;

    /* renamed from: d, reason: collision with root package name */
    final int f40689d;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f40690a;

        /* renamed from: b, reason: collision with root package name */
        final long f40691b;

        /* renamed from: c, reason: collision with root package name */
        final int f40692c;

        /* renamed from: d, reason: collision with root package name */
        long f40693d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f40694e;

        /* renamed from: f, reason: collision with root package name */
        C15083f<T> f40695f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f40696g;

        @Override // Nu.b
        public void dispose() {
            this.f40696g = true;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40696g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            C15083f<T> c15083f = this.f40695f;
            if (c15083f != null) {
                this.f40695f = null;
                c15083f.onComplete();
            }
            this.f40690a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            C15083f<T> c15083f = this.f40695f;
            if (c15083f != null) {
                this.f40695f = null;
                c15083f.onError(th2);
            }
            this.f40690a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C15083f<T> c15083fF = this.f40695f;
            if (c15083fF == null && !this.f40696g) {
                c15083fF = C15083f.f(this.f40692c, this);
                this.f40695f = c15083fF;
                this.f40690a.onNext(c15083fF);
            }
            if (c15083fF != null) {
                c15083fF.onNext(t10);
                long j10 = this.f40693d + 1;
                this.f40693d = j10;
                if (j10 >= this.f40691b) {
                    this.f40693d = 0L;
                    this.f40695f = null;
                    c15083fF.onComplete();
                    if (this.f40696g) {
                        this.f40694e.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40694e, bVar)) {
                this.f40694e = bVar;
                this.f40690a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40696g) {
                this.f40694e.dispose();
            }
        }

        a(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, int i10) {
            this.f40690a = sVar;
            this.f40691b = j10;
            this.f40692c = i10;
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f40697a;

        /* renamed from: b, reason: collision with root package name */
        final long f40698b;

        /* renamed from: c, reason: collision with root package name */
        final long f40699c;

        /* renamed from: d, reason: collision with root package name */
        final int f40700d;

        /* renamed from: f, reason: collision with root package name */
        long f40702f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f40703g;

        /* renamed from: h, reason: collision with root package name */
        long f40704h;

        /* renamed from: i, reason: collision with root package name */
        Nu.b f40705i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f40706j = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        final ArrayDeque<C15083f<T>> f40701e = new ArrayDeque<>();

        @Override // Nu.b
        public void dispose() {
            this.f40703g = true;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40703g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayDeque<C15083f<T>> arrayDeque = this.f40701e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f40697a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            ArrayDeque<C15083f<T>> arrayDeque = this.f40701e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f40697a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ArrayDeque<C15083f<T>> arrayDeque = this.f40701e;
            long j10 = this.f40702f;
            long j11 = this.f40699c;
            if (j10 % j11 == 0 && !this.f40703g) {
                this.f40706j.getAndIncrement();
                C15083f<T> c15083fF = C15083f.f(this.f40700d, this);
                arrayDeque.offer(c15083fF);
                this.f40697a.onNext(c15083fF);
            }
            long j12 = this.f40704h + 1;
            Iterator<C15083f<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.f40698b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f40703g) {
                    this.f40705i.dispose();
                    return;
                }
                this.f40704h = j12 - j11;
            } else {
                this.f40704h = j12;
            }
            this.f40702f = j10 + 1;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40705i, bVar)) {
                this.f40705i = bVar;
                this.f40697a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40706j.decrementAndGet() == 0 && this.f40703g) {
                this.f40705i.dispose();
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, long j11, int i10) {
            this.f40697a = sVar;
            this.f40698b = j10;
            this.f40699c = j11;
            this.f40700d = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        if (this.f40687b == this.f40688c) {
            this.f41135a.subscribe(new a(sVar, this.f40687b, this.f40689d));
        } else {
            this.f41135a.subscribe(new b(sVar, this.f40687b, this.f40688c, this.f40689d));
        }
    }

    public G1(io.reactivex.q<T> qVar, long j10, long j11, int i10) {
        super(qVar);
        this.f40687b = j10;
        this.f40688c = j11;
        this.f40689d = i10;
    }
}
