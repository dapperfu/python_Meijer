package Yu;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Yu.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5469l<T, U extends Collection<? super T>> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final int f41384b;

    /* renamed from: c, reason: collision with root package name */
    final int f41385c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<U> f41386d;

    /* renamed from: Yu.l$a */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f41387a;

        /* renamed from: b, reason: collision with root package name */
        final int f41388b;

        /* renamed from: c, reason: collision with root package name */
        final Callable<U> f41389c;

        /* renamed from: d, reason: collision with root package name */
        U f41390d;

        /* renamed from: e, reason: collision with root package name */
        int f41391e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f41392f;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41390d = null;
            this.f41387a.onError(th2);
        }

        boolean a() {
            try {
                this.f41390d = (U) Ru.b.e(this.f41389c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41390d = null;
                Nu.b bVar = this.f41392f;
                if (bVar == null) {
                    Qu.e.m(th2, this.f41387a);
                    return false;
                }
                bVar.dispose();
                this.f41387a.onError(th2);
                return false;
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41392f.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41392f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f41390d;
            if (u10 != null) {
                this.f41390d = null;
                if (!u10.isEmpty()) {
                    this.f41387a.onNext(u10);
                }
                this.f41387a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            U u10 = this.f41390d;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f41391e + 1;
                this.f41391e = i10;
                if (i10 >= this.f41388b) {
                    this.f41387a.onNext(u10);
                    this.f41391e = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41392f, bVar)) {
                this.f41392f = bVar;
                this.f41387a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, int i10, Callable<U> callable) {
            this.f41387a = sVar;
            this.f41388b = i10;
            this.f41389c = callable;
        }
    }

    /* renamed from: Yu.l$b */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f41393a;

        /* renamed from: b, reason: collision with root package name */
        final int f41394b;

        /* renamed from: c, reason: collision with root package name */
        final int f41395c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<U> f41396d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f41397e;

        /* renamed from: f, reason: collision with root package name */
        final ArrayDeque<U> f41398f = new ArrayDeque<>();

        /* renamed from: g, reason: collision with root package name */
        long f41399g;

        @Override // Nu.b
        public void dispose() {
            this.f41397e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41397e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            while (!this.f41398f.isEmpty()) {
                this.f41393a.onNext(this.f41398f.poll());
            }
            this.f41393a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41398f.clear();
            this.f41393a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f41399g;
            this.f41399g = 1 + j10;
            if (j10 % this.f41395c == 0) {
                try {
                    this.f41398f.offer((Collection) Ru.b.e(this.f41396d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th2) {
                    this.f41398f.clear();
                    this.f41397e.dispose();
                    this.f41393a.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.f41398f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f41394b <= next.size()) {
                    it.remove();
                    this.f41393a.onNext(next);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41397e, bVar)) {
                this.f41397e = bVar;
                this.f41393a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, int i10, int i11, Callable<U> callable) {
            this.f41393a = sVar;
            this.f41394b = i10;
            this.f41395c = i11;
            this.f41396d = callable;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        int i10 = this.f41385c;
        int i11 = this.f41384b;
        if (i10 != i11) {
            this.f41135a.subscribe(new b(sVar, this.f41384b, this.f41385c, this.f41386d));
            return;
        }
        a aVar = new a(sVar, i11, this.f41386d);
        if (aVar.a()) {
            this.f41135a.subscribe(aVar);
        }
    }

    public C5469l(io.reactivex.q<T> qVar, int i10, int i11, Callable<U> callable) {
        super(qVar);
        this.f41384b = i10;
        this.f41385c = i11;
        this.f41386d = callable;
    }
}
