package Yu;

import gv.C14313a;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class O1<T, U, V> extends io.reactivex.l<V> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.l<? extends T> f40919a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<U> f40920b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.c<? super T, ? super U, ? extends V> f40921c;

    static final class a<T, U, V> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super V> f40922a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<U> f40923b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.c<? super T, ? super U, ? extends V> f40924c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f40925d;

        /* renamed from: e, reason: collision with root package name */
        boolean f40926e;

        void a(Throwable th2) {
            this.f40926e = true;
            this.f40925d.dispose();
            this.f40922a.onError(th2);
        }

        @Override // Nu.b
        public void dispose() {
            this.f40925d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40925d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40926e) {
                return;
            }
            this.f40926e = true;
            this.f40922a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40926e) {
                C14313a.s(th2);
            } else {
                this.f40926e = true;
                this.f40922a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40926e) {
                return;
            }
            try {
                try {
                    this.f40922a.onNext(Ru.b.e(this.f40924c.apply(t10, Ru.b.e(this.f40923b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f40923b.hasNext()) {
                            return;
                        }
                        this.f40926e = true;
                        this.f40925d.dispose();
                        this.f40922a.onComplete();
                    } catch (Throwable th2) {
                        Ou.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    a(th3);
                }
            } catch (Throwable th4) {
                Ou.a.b(th4);
                a(th4);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40925d, bVar)) {
                this.f40925d = bVar;
                this.f40922a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super V> sVar, Iterator<U> it, Pu.c<? super T, ? super U, ? extends V> cVar) {
            this.f40922a = sVar;
            this.f40923b = it;
            this.f40924c = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super V> sVar) {
        try {
            Iterator it = (Iterator) Ru.b.e(this.f40920b.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f40919a.subscribe(new a(sVar, it, this.f40921c));
                } else {
                    Qu.e.e(sVar);
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                Qu.e.m(th2, sVar);
            }
        } catch (Throwable th3) {
            Ou.a.b(th3);
            Qu.e.m(th3, sVar);
        }
    }

    public O1(io.reactivex.l<? extends T> lVar, Iterable<U> iterable, Pu.c<? super T, ? super U, ? extends V> cVar) {
        this.f40919a = lVar;
        this.f40920b = iterable;
        this.f40921c = cVar;
    }
}
