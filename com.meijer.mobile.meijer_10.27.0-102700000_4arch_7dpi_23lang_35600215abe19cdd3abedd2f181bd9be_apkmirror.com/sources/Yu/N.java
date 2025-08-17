package Yu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;

/* loaded from: classes9.dex */
public final class N<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super T> f40880b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.g<? super Throwable> f40881c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.a f40882d;

    /* renamed from: e, reason: collision with root package name */
    final Pu.a f40883e;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40884a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.g<? super T> f40885b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.g<? super Throwable> f40886c;

        /* renamed from: d, reason: collision with root package name */
        final Pu.a f40887d;

        /* renamed from: e, reason: collision with root package name */
        final Pu.a f40888e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f40889f;

        /* renamed from: g, reason: collision with root package name */
        boolean f40890g;

        @Override // Nu.b
        public void dispose() {
            this.f40889f.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40889f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40890g) {
                return;
            }
            try {
                this.f40887d.run();
                this.f40890g = true;
                this.f40884a.onComplete();
                try {
                    this.f40888e.run();
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    C14313a.s(th2);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40890g) {
                C14313a.s(th2);
                return;
            }
            this.f40890g = true;
            try {
                this.f40886c.accept(th2);
            } catch (Throwable th3) {
                Ou.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f40884a.onError(th2);
            try {
                this.f40888e.run();
            } catch (Throwable th4) {
                Ou.a.b(th4);
                C14313a.s(th4);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40890g) {
                return;
            }
            try {
                this.f40885b.accept(t10);
                this.f40884a.onNext(t10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f40889f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40889f, bVar)) {
                this.f40889f = bVar;
                this.f40884a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar, Pu.a aVar2) {
            this.f40884a = sVar;
            this.f40885b = gVar;
            this.f40886c = gVar2;
            this.f40887d = aVar;
            this.f40888e = aVar2;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40880b, this.f40881c, this.f40882d, this.f40883e));
    }

    public N(io.reactivex.q<T> qVar, Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar, Pu.a aVar2) {
        super(qVar);
        this.f40880b = gVar;
        this.f40881c = gVar2;
        this.f40882d = aVar;
        this.f40883e = aVar2;
    }
}
