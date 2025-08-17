package Yu;

import dv.EnumC13584b;

/* renamed from: Yu.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5455g0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final pw.a<? extends T> f41260a;

    /* renamed from: Yu.g0$a */
    static final class a<T> implements io.reactivex.g<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41261a;

        /* renamed from: b, reason: collision with root package name */
        pw.c f41262b;

        @Override // pw.b
        public void b(pw.c cVar) {
            if (EnumC13584b.p(this.f41262b, cVar)) {
                this.f41262b = cVar;
                this.f41261a.onSubscribe(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41262b.cancel();
            this.f41262b = EnumC13584b.CANCELLED;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41262b == EnumC13584b.CANCELLED;
        }

        @Override // pw.b
        public void onComplete() {
            this.f41261a.onComplete();
        }

        @Override // pw.b
        public void onError(Throwable th2) {
            this.f41261a.onError(th2);
        }

        @Override // pw.b
        public void onNext(T t10) {
            this.f41261a.onNext(t10);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41261a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41260a.a(new a(sVar));
    }

    public C5455g0(pw.a<? extends T> aVar) {
        this.f41260a = aVar;
    }
}
