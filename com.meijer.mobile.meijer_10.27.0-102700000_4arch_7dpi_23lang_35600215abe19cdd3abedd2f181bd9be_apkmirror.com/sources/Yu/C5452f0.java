package Yu;

import java.util.Iterator;

/* renamed from: Yu.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5452f0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f41242a;

    /* renamed from: Yu.f0$a */
    static final class a<T> extends Tu.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41243a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f41244b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f41245c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41246d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41247e;

        /* renamed from: f, reason: collision with root package name */
        boolean f41248f;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f41246d = true;
            return 1;
        }

        @Override // Su.f
        public void clear() {
            this.f41247e = true;
        }

        @Override // Nu.b
        public void dispose() {
            this.f41245c = true;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41245c;
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f41247e;
        }

        @Override // Su.f
        public T poll() {
            if (this.f41247e) {
                return null;
            }
            if (!this.f41248f) {
                this.f41248f = true;
            } else if (!this.f41244b.hasNext()) {
                this.f41247e = true;
                return null;
            }
            return (T) Ru.b.e(this.f41244b.next(), "The iterator returned a null value");
        }

        a(io.reactivex.s<? super T> sVar, Iterator<? extends T> it) {
            this.f41243a = sVar;
            this.f41244b = it;
        }

        void b() {
            while (!isDisposed()) {
                try {
                    this.f41243a.onNext(Ru.b.e(this.f41244b.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f41244b.hasNext()) {
                                if (!isDisposed()) {
                                    this.f41243a.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            Ou.a.b(th2);
                            this.f41243a.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    this.f41243a.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            Iterator<? extends T> it = this.f41242a.iterator();
            try {
                if (!it.hasNext()) {
                    Qu.e.e(sVar);
                    return;
                }
                a aVar = new a(sVar, it);
                sVar.onSubscribe(aVar);
                if (aVar.f41246d) {
                    return;
                }
                aVar.b();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                Qu.e.m(th2, sVar);
            }
        } catch (Throwable th3) {
            Ou.a.b(th3);
            Qu.e.m(th3, sVar);
        }
    }

    public C5452f0(Iterable<? extends T> iterable) {
        this.f41242a = iterable;
    }
}
