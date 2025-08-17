package Vu;

import Pu.g;
import dv.EnumC13584b;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public final class d<T> extends Vu.a<T, T> implements g<T> {

    /* renamed from: c, reason: collision with root package name */
    final g<? super T> f38044c;

    static final class a<T> extends AtomicLong implements io.reactivex.g<T>, pw.c {

        /* renamed from: a, reason: collision with root package name */
        final pw.b<? super T> f38045a;

        /* renamed from: b, reason: collision with root package name */
        final g<? super T> f38046b;

        /* renamed from: c, reason: collision with root package name */
        pw.c f38047c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38048d;

        @Override // pw.b
        public void b(pw.c cVar) {
            if (EnumC13584b.p(this.f38047c, cVar)) {
                this.f38047c = cVar;
                this.f38045a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // pw.c
        public void cancel() {
            this.f38047c.cancel();
        }

        @Override // pw.b
        public void onComplete() {
            if (this.f38048d) {
                return;
            }
            this.f38048d = true;
            this.f38045a.onComplete();
        }

        @Override // pw.b
        public void onError(Throwable th2) {
            if (this.f38048d) {
                C14313a.s(th2);
            } else {
                this.f38048d = true;
                this.f38045a.onError(th2);
            }
        }

        @Override // pw.b
        public void onNext(T t10) {
            if (this.f38048d) {
                return;
            }
            if (get() != 0) {
                this.f38045a.onNext(t10);
                ev.d.c(this, 1L);
                return;
            }
            try {
                this.f38046b.accept(t10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        a(pw.b<? super T> bVar, g<? super T> gVar) {
            this.f38045a = bVar;
            this.f38046b = gVar;
        }

        @Override // pw.c
        public void t(long j10) {
            if (EnumC13584b.o(j10)) {
                ev.d.a(this, j10);
            }
        }
    }

    @Override // Pu.g
    public void accept(T t10) {
    }

    @Override // io.reactivex.f
    protected void h(pw.b<? super T> bVar) {
        this.f38026b.g(new a(bVar, this.f38044c));
    }

    public d(io.reactivex.f<T> fVar) {
        super(fVar);
        this.f38044c = this;
    }
}
