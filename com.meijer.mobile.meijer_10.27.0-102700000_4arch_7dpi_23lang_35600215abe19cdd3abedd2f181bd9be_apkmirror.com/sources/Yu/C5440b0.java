package Yu;

import gv.C14313a;
import java.util.Iterator;

/* renamed from: Yu.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5440b0<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends Iterable<? extends R>> f41161b;

    /* renamed from: Yu.b0$a */
    static final class a<T, R> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41162a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends Iterable<? extends R>> f41163b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41164c;

        @Override // Nu.b
        public void dispose() {
            this.f41164c.dispose();
            this.f41164c = Qu.d.DISPOSED;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41164c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Nu.b bVar = this.f41164c;
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar == dVar) {
                return;
            }
            this.f41164c = dVar;
            this.f41162a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Nu.b bVar = this.f41164c;
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar == dVar) {
                C14313a.s(th2);
            } else {
                this.f41164c = dVar;
                this.f41162a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41164c == Qu.d.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f41163b.apply(t10).iterator();
                io.reactivex.s<? super R> sVar = this.f41162a;
                while (it.hasNext()) {
                    try {
                        try {
                            sVar.onNext((Object) Ru.b.e(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            Ou.a.b(th2);
                            this.f41164c.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Ou.a.b(th3);
                        this.f41164c.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Ou.a.b(th4);
                this.f41164c.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41164c, bVar)) {
                this.f41164c = bVar;
                this.f41162a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f41162a = sVar;
            this.f41163b = oVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41161b));
    }

    public C5440b0(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(qVar);
        this.f41161b = oVar;
    }
}
