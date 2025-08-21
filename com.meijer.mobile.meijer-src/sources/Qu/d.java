package Qu;

import Lu.o;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class d extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f31459a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends io.reactivex.d> f31460b;

    static final class a extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f31461a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Throwable, ? extends io.reactivex.d> f31462b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31463c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            this.f31461a.onComplete();
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f31463c) {
                this.f31461a.onError(th2);
                return;
            }
            this.f31463c = true;
            try {
                ((io.reactivex.d) Nu.b.e(this.f31462b.apply(th2), "The errorMapper returned a null CompletableSource")).a(this);
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f31461a.onError(new CompositeException(th2, th3));
            }
        }

        a(io.reactivex.c cVar, o<? super Throwable, ? extends io.reactivex.d> oVar) {
            this.f31461a = cVar;
            this.f31462b = oVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            Mu.d.e(this, bVar);
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        a aVar = new a(cVar, this.f31460b);
        cVar.onSubscribe(aVar);
        this.f31459a.a(aVar);
    }

    public d(io.reactivex.d dVar, o<? super Throwable, ? extends io.reactivex.d> oVar) {
        this.f31459a = dVar;
        this.f31460b = oVar;
    }
}
