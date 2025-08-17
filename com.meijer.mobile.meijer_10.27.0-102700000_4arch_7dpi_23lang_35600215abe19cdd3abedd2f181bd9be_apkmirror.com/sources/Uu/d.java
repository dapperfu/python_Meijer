package Uu;

import Pu.o;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class d extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f36342a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends io.reactivex.d> f36343b;

    static final class a extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f36344a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Throwable, ? extends io.reactivex.d> f36345b;

        /* renamed from: c, reason: collision with root package name */
        boolean f36346c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            this.f36344a.onComplete();
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f36346c) {
                this.f36344a.onError(th2);
                return;
            }
            this.f36346c = true;
            try {
                ((io.reactivex.d) Ru.b.e(this.f36345b.apply(th2), "The errorMapper returned a null CompletableSource")).a(this);
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f36344a.onError(new CompositeException(th2, th3));
            }
        }

        a(io.reactivex.c cVar, o<? super Throwable, ? extends io.reactivex.d> oVar) {
            this.f36344a = cVar;
            this.f36345b = oVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            Qu.d.e(this, bVar);
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        a aVar = new a(cVar, this.f36343b);
        cVar.onSubscribe(aVar);
        this.f36342a.a(aVar);
    }

    public d(io.reactivex.d dVar, o<? super Throwable, ? extends io.reactivex.d> oVar) {
        this.f36342a = dVar;
        this.f36343b = oVar;
    }
}
