package Uu;

import cv.C13558a;
import java.util.concurrent.Callable;

/* renamed from: Uu.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5400i0<T, S> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<S> f38514a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.c<S, io.reactivex.e<T>, S> f38515b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.g<? super S> f38516c;

    /* renamed from: Uu.i0$a */
    static final class a<T, S> implements io.reactivex.e<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38517a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<S, ? super io.reactivex.e<T>, S> f38518b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.g<? super S> f38519c;

        /* renamed from: d, reason: collision with root package name */
        S f38520d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f38521e;

        /* renamed from: f, reason: collision with root package name */
        boolean f38522f;

        /* renamed from: g, reason: collision with root package name */
        boolean f38523g;

        @Override // Ju.b
        public void dispose() {
            this.f38521e = true;
        }

        private void c(S s10) {
            try {
                this.f38519c.accept(s10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                C13558a.s(th2);
            }
        }

        public void d() {
            S sApply = this.f38520d;
            if (this.f38521e) {
                this.f38520d = null;
                c(sApply);
                return;
            }
            Lu.c<S, ? super io.reactivex.e<T>, S> cVar = this.f38518b;
            while (!this.f38521e) {
                this.f38523g = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f38522f) {
                        this.f38521e = true;
                        this.f38520d = null;
                        c(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f38520d = null;
                    this.f38521e = true;
                    onError(th2);
                    c(sApply);
                    return;
                }
            }
            this.f38520d = null;
            c(sApply);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38521e;
        }

        @Override // io.reactivex.e
        public void onError(Throwable th2) {
            if (this.f38522f) {
                C13558a.s(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f38522f = true;
            this.f38517a.onError(th2);
        }

        a(io.reactivex.s<? super T> sVar, Lu.c<S, ? super io.reactivex.e<T>, S> cVar, Lu.g<? super S> gVar, S s10) {
            this.f38517a = sVar;
            this.f38518b = cVar;
            this.f38519c = gVar;
            this.f38520d = s10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            a aVar = new a(sVar, this.f38515b, this.f38516c, this.f38514a.call());
            sVar.onSubscribe(aVar);
            aVar.d();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }

    public C5400i0(Callable<S> callable, Lu.c<S, io.reactivex.e<T>, S> cVar, Lu.g<? super S> gVar) {
        this.f38514a = callable;
        this.f38515b = cVar;
        this.f38516c = gVar;
    }
}
