package Vu;

import dv.EnumC13584b;
import gv.C14313a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public final class e<T> extends Vu.a<T, T> {

    static final class a<T> extends AtomicLong implements g<T>, pw.c {

        /* renamed from: a, reason: collision with root package name */
        final pw.b<? super T> f38049a;

        /* renamed from: b, reason: collision with root package name */
        pw.c f38050b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38051c;

        @Override // pw.b
        public void b(pw.c cVar) {
            if (EnumC13584b.p(this.f38050b, cVar)) {
                this.f38050b = cVar;
                this.f38049a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // pw.c
        public void cancel() {
            this.f38050b.cancel();
        }

        @Override // pw.b
        public void onComplete() {
            if (this.f38051c) {
                return;
            }
            this.f38051c = true;
            this.f38049a.onComplete();
        }

        @Override // pw.b
        public void onError(Throwable th2) {
            if (this.f38051c) {
                C14313a.s(th2);
            } else {
                this.f38051c = true;
                this.f38049a.onError(th2);
            }
        }

        @Override // pw.b
        public void onNext(T t10) {
            if (this.f38051c) {
                return;
            }
            if (get() != 0) {
                this.f38049a.onNext(t10);
                ev.d.c(this, 1L);
            } else {
                this.f38050b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        a(pw.b<? super T> bVar) {
            this.f38049a = bVar;
        }

        @Override // pw.c
        public void t(long j10) {
            if (EnumC13584b.o(j10)) {
                ev.d.a(this, j10);
            }
        }
    }

    @Override // io.reactivex.f
    protected void h(pw.b<? super T> bVar) {
        this.f38026b.g(new a(bVar));
    }

    public e(io.reactivex.f<T> fVar) {
        super(fVar);
    }
}
