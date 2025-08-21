package Uu;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Uu.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5408l<T, U extends Collection<? super T>> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final int f38609b;

    /* renamed from: c, reason: collision with root package name */
    final int f38610c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<U> f38611d;

    /* renamed from: Uu.l$a */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f38612a;

        /* renamed from: b, reason: collision with root package name */
        final int f38613b;

        /* renamed from: c, reason: collision with root package name */
        final Callable<U> f38614c;

        /* renamed from: d, reason: collision with root package name */
        U f38615d;

        /* renamed from: e, reason: collision with root package name */
        int f38616e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38617f;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38615d = null;
            this.f38612a.onError(th2);
        }

        boolean a() {
            try {
                this.f38615d = (U) Nu.b.e(this.f38614c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38615d = null;
                Ju.b bVar = this.f38617f;
                if (bVar == null) {
                    Mu.e.m(th2, this.f38612a);
                    return false;
                }
                bVar.dispose();
                this.f38612a.onError(th2);
                return false;
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38617f.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38617f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f38615d;
            if (u10 != null) {
                this.f38615d = null;
                if (!u10.isEmpty()) {
                    this.f38612a.onNext(u10);
                }
                this.f38612a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            U u10 = this.f38615d;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f38616e + 1;
                this.f38616e = i10;
                if (i10 >= this.f38613b) {
                    this.f38612a.onNext(u10);
                    this.f38616e = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38617f, bVar)) {
                this.f38617f = bVar;
                this.f38612a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, int i10, Callable<U> callable) {
            this.f38612a = sVar;
            this.f38613b = i10;
            this.f38614c = callable;
        }
    }

    /* renamed from: Uu.l$b */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f38618a;

        /* renamed from: b, reason: collision with root package name */
        final int f38619b;

        /* renamed from: c, reason: collision with root package name */
        final int f38620c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<U> f38621d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f38622e;

        /* renamed from: f, reason: collision with root package name */
        final ArrayDeque<U> f38623f = new ArrayDeque<>();

        /* renamed from: g, reason: collision with root package name */
        long f38624g;

        @Override // Ju.b
        public void dispose() {
            this.f38622e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38622e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            while (!this.f38623f.isEmpty()) {
                this.f38618a.onNext(this.f38623f.poll());
            }
            this.f38618a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38623f.clear();
            this.f38618a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f38624g;
            this.f38624g = 1 + j10;
            if (j10 % this.f38620c == 0) {
                try {
                    this.f38623f.offer((Collection) Nu.b.e(this.f38621d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th2) {
                    this.f38623f.clear();
                    this.f38622e.dispose();
                    this.f38618a.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.f38623f.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f38619b <= next.size()) {
                    it.remove();
                    this.f38618a.onNext(next);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38622e, bVar)) {
                this.f38622e = bVar;
                this.f38618a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, int i10, int i11, Callable<U> callable) {
            this.f38618a = sVar;
            this.f38619b = i10;
            this.f38620c = i11;
            this.f38621d = callable;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        int i10 = this.f38610c;
        int i11 = this.f38609b;
        if (i10 != i11) {
            this.f38360a.subscribe(new b(sVar, this.f38609b, this.f38610c, this.f38611d));
            return;
        }
        a aVar = new a(sVar, i11, this.f38611d);
        if (aVar.a()) {
            this.f38360a.subscribe(aVar);
        }
    }

    public C5408l(io.reactivex.q<T> qVar, int i10, int i11, Callable<U> callable) {
        super(qVar);
        this.f38609b = i10;
        this.f38610c = i11;
        this.f38611d = callable;
    }
}
