package Uu;

import cv.C13558a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class J<T, K> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, K> f37981b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f37982c;

    static final class a<T, K> extends Pu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<? super K> f37983f;

        /* renamed from: g, reason: collision with root package name */
        final Lu.o<? super T, K> f37984g;

        @Override // Pu.a, Ou.f
        public void clear() {
            this.f37983f.clear();
            super.clear();
        }

        @Override // Pu.a, io.reactivex.s
        public void onComplete() {
            if (this.f27221d) {
                return;
            }
            this.f27221d = true;
            this.f37983f.clear();
            this.f27218a.onComplete();
        }

        @Override // Pu.a, io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f27221d) {
                C13558a.s(th2);
                return;
            }
            this.f27221d = true;
            this.f37983f.clear();
            this.f27218a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f27221d) {
                return;
            }
            if (this.f27222e != 0) {
                this.f27218a.onNext(null);
                return;
            }
            try {
                if (this.f37983f.add(Nu.b.e(this.f37984g.apply(t10), "The keySelector returned a null key"))) {
                    this.f27218a.onNext(t10);
                }
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f27220c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f37983f.add((Object) Nu.b.e(this.f37984g.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super T, K> oVar, Collection<? super K> collection) {
            super(sVar);
            this.f37984g = oVar;
            this.f37983f = collection;
        }

        @Override // Ou.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            this.f38360a.subscribe(new a(sVar, this.f37981b, (Collection) Nu.b.e(this.f37982c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }

    public J(io.reactivex.q<T> qVar, Lu.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(qVar);
        this.f37981b = oVar;
        this.f37982c = callable;
    }
}
