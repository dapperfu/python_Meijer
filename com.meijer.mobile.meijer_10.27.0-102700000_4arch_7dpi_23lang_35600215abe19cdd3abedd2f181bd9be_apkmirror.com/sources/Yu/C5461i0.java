package Yu;

import gv.C14313a;
import java.util.concurrent.Callable;

/* renamed from: Yu.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5461i0<T, S> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<S> f41289a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.c<S, io.reactivex.e<T>, S> f41290b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.g<? super S> f41291c;

    /* renamed from: Yu.i0$a */
    static final class a<T, S> implements io.reactivex.e<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41292a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<S, ? super io.reactivex.e<T>, S> f41293b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.g<? super S> f41294c;

        /* renamed from: d, reason: collision with root package name */
        S f41295d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f41296e;

        /* renamed from: f, reason: collision with root package name */
        boolean f41297f;

        /* renamed from: g, reason: collision with root package name */
        boolean f41298g;

        @Override // Nu.b
        public void dispose() {
            this.f41296e = true;
        }

        private void c(S s10) {
            try {
                this.f41294c.accept(s10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                C14313a.s(th2);
            }
        }

        public void d() {
            S sApply = this.f41295d;
            if (this.f41296e) {
                this.f41295d = null;
                c(sApply);
                return;
            }
            Pu.c<S, ? super io.reactivex.e<T>, S> cVar = this.f41293b;
            while (!this.f41296e) {
                this.f41298g = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f41297f) {
                        this.f41296e = true;
                        this.f41295d = null;
                        c(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f41295d = null;
                    this.f41296e = true;
                    onError(th2);
                    c(sApply);
                    return;
                }
            }
            this.f41295d = null;
            c(sApply);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41296e;
        }

        @Override // io.reactivex.e
        public void onError(Throwable th2) {
            if (this.f41297f) {
                C14313a.s(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f41297f = true;
            this.f41292a.onError(th2);
        }

        a(io.reactivex.s<? super T> sVar, Pu.c<S, ? super io.reactivex.e<T>, S> cVar, Pu.g<? super S> gVar, S s10) {
            this.f41292a = sVar;
            this.f41293b = cVar;
            this.f41294c = gVar;
            this.f41295d = s10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            a aVar = new a(sVar, this.f41290b, this.f41291c, this.f41289a.call());
            sVar.onSubscribe(aVar);
            aVar.d();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }

    public C5461i0(Callable<S> callable, Pu.c<S, io.reactivex.e<T>, S> cVar, Pu.g<? super S> gVar) {
        this.f41289a = callable;
        this.f41290b = cVar;
        this.f41291c = gVar;
    }
}
