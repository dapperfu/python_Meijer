package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5495w<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.d f41729b;

    /* renamed from: Yu.w$a */
    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, io.reactivex.c, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41730a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.d f41731b;

        /* renamed from: c, reason: collision with root package name */
        boolean f41732c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41732c) {
                this.f41730a.onComplete();
                return;
            }
            this.f41732c = true;
            Qu.d.e(this, null);
            io.reactivex.d dVar = this.f41731b;
            this.f41731b = null;
            dVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41730a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41730a.onNext(t10);
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.d dVar) {
            this.f41730a = sVar;
            this.f41731b = dVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar) && !this.f41732c) {
                this.f41730a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41729b));
    }

    public C5495w(io.reactivex.l<T> lVar, io.reactivex.d dVar) {
        super(lVar);
        this.f41729b = dVar;
    }
}
