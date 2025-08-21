package Vu;

import cv.C13558a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes10.dex */
public final class c<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f40460a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super Ju.b> f40461b;

    static final class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40462a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.g<? super Ju.b> f40463b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40464c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f40464c) {
                C13558a.s(th2);
            } else {
                this.f40462a.onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            try {
                this.f40463b.accept(bVar);
                this.f40462a.onSubscribe(bVar);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f40464c = true;
                bVar.dispose();
                Mu.e.o(th2, this.f40462a);
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            if (this.f40464c) {
                return;
            }
            this.f40462a.onSuccess(t10);
        }

        a(w<? super T> wVar, Lu.g<? super Ju.b> gVar) {
            this.f40462a = wVar;
            this.f40463b = gVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f40460a.a(new a(wVar, this.f40461b));
    }

    public c(y<T> yVar, Lu.g<? super Ju.b> gVar) {
        this.f40460a = yVar;
        this.f40461b = gVar;
    }
}
