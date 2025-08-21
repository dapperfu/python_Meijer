package Uu;

import java.util.Iterator;

/* renamed from: Uu.f0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5391f0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f38467a;

    /* renamed from: Uu.f0$a */
    static final class a<T> extends Pu.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38468a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f38469b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f38470c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38471d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38472e;

        /* renamed from: f, reason: collision with root package name */
        boolean f38473f;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f38471d = true;
            return 1;
        }

        @Override // Ou.f
        public void clear() {
            this.f38472e = true;
        }

        @Override // Ju.b
        public void dispose() {
            this.f38470c = true;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38470c;
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f38472e;
        }

        @Override // Ou.f
        public T poll() {
            if (this.f38472e) {
                return null;
            }
            if (!this.f38473f) {
                this.f38473f = true;
            } else if (!this.f38469b.hasNext()) {
                this.f38472e = true;
                return null;
            }
            return (T) Nu.b.e(this.f38469b.next(), "The iterator returned a null value");
        }

        a(io.reactivex.s<? super T> sVar, Iterator<? extends T> it) {
            this.f38468a = sVar;
            this.f38469b = it;
        }

        void b() {
            while (!isDisposed()) {
                try {
                    this.f38468a.onNext(Nu.b.e(this.f38469b.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f38469b.hasNext()) {
                                if (!isDisposed()) {
                                    this.f38468a.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            Ku.a.b(th2);
                            this.f38468a.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    this.f38468a.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            Iterator<? extends T> it = this.f38467a.iterator();
            try {
                if (!it.hasNext()) {
                    Mu.e.e(sVar);
                    return;
                }
                a aVar = new a(sVar, it);
                sVar.onSubscribe(aVar);
                if (aVar.f38471d) {
                    return;
                }
                aVar.b();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                Mu.e.m(th2, sVar);
            }
        } catch (Throwable th3) {
            Ku.a.b(th3);
            Mu.e.m(th3, sVar);
        }
    }

    public C5391f0(Iterable<? extends T> iterable) {
        this.f38467a = iterable;
    }
}
