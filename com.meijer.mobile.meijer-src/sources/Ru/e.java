package Ru;

import cv.C13558a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class e<T> extends Ru.a<T, T> {

    static final class a<T> extends AtomicLong implements g<T>, lw.c {

        /* renamed from: a, reason: collision with root package name */
        final lw.b<? super T> f34060a;

        /* renamed from: b, reason: collision with root package name */
        lw.c f34061b;

        /* renamed from: c, reason: collision with root package name */
        boolean f34062c;

        @Override // lw.b
        public void b(lw.c cVar) {
            if (Zu.b.p(this.f34061b, cVar)) {
                this.f34061b = cVar;
                this.f34060a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // lw.c
        public void cancel() {
            this.f34061b.cancel();
        }

        @Override // lw.b
        public void onComplete() {
            if (this.f34062c) {
                return;
            }
            this.f34062c = true;
            this.f34060a.onComplete();
        }

        @Override // lw.b
        public void onError(Throwable th2) {
            if (this.f34062c) {
                C13558a.s(th2);
            } else {
                this.f34062c = true;
                this.f34060a.onError(th2);
            }
        }

        @Override // lw.b
        public void onNext(T t10) {
            if (this.f34062c) {
                return;
            }
            if (get() != 0) {
                this.f34060a.onNext(t10);
                av.d.c(this, 1L);
            } else {
                this.f34061b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        a(lw.b<? super T> bVar) {
            this.f34060a = bVar;
        }

        @Override // lw.c
        public void t(long j10) {
            if (Zu.b.o(j10)) {
                av.d.a(this, j10);
            }
        }
    }

    @Override // io.reactivex.f
    protected void h(lw.b<? super T> bVar) {
        this.f34037b.g(new a(bVar));
    }

    public e(io.reactivex.f<T> fVar) {
        super(fVar);
    }
}
