package Yu;

import gv.C14313a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class J<T, K> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, K> f40756b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f40757c;

    static final class a<T, K> extends Tu.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<? super K> f40758f;

        /* renamed from: g, reason: collision with root package name */
        final Pu.o<? super T, K> f40759g;

        @Override // Tu.a, Su.f
        public void clear() {
            this.f40758f.clear();
            super.clear();
        }

        @Override // Tu.a, io.reactivex.s
        public void onComplete() {
            if (this.f35449d) {
                return;
            }
            this.f35449d = true;
            this.f40758f.clear();
            this.f35446a.onComplete();
        }

        @Override // Tu.a, io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f35449d) {
                C14313a.s(th2);
                return;
            }
            this.f35449d = true;
            this.f40758f.clear();
            this.f35446a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f35449d) {
                return;
            }
            if (this.f35450e != 0) {
                this.f35446a.onNext(null);
                return;
            }
            try {
                if (this.f40758f.add(Ru.b.e(this.f40759g.apply(t10), "The keySelector returned a null key"))) {
                    this.f35446a.onNext(t10);
                }
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f35448c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f40758f.add((Object) Ru.b.e(this.f40759g.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super T, K> oVar, Collection<? super K> collection) {
            super(sVar);
            this.f40759g = oVar;
            this.f40758f = collection;
        }

        @Override // Su.c
        public int a(int i10) {
            return e(i10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            this.f41135a.subscribe(new a(sVar, this.f40756b, (Collection) Ru.b.e(this.f40757c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }

    public J(io.reactivex.q<T> qVar, Pu.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(qVar);
        this.f40756b = oVar;
        this.f40757c = callable;
    }
}
