package Ru;

import Lu.g;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class d<T> extends Ru.a<T, T> implements g<T> {

    /* renamed from: c, reason: collision with root package name */
    final g<? super T> f34055c;

    static final class a<T> extends AtomicLong implements io.reactivex.g<T>, lw.c {

        /* renamed from: a, reason: collision with root package name */
        final lw.b<? super T> f34056a;

        /* renamed from: b, reason: collision with root package name */
        final g<? super T> f34057b;

        /* renamed from: c, reason: collision with root package name */
        lw.c f34058c;

        /* renamed from: d, reason: collision with root package name */
        boolean f34059d;

        @Override // lw.b
        public void b(lw.c cVar) {
            if (Zu.b.p(this.f34058c, cVar)) {
                this.f34058c = cVar;
                this.f34056a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        @Override // lw.c
        public void cancel() {
            this.f34058c.cancel();
        }

        @Override // lw.b
        public void onComplete() {
            if (this.f34059d) {
                return;
            }
            this.f34059d = true;
            this.f34056a.onComplete();
        }

        @Override // lw.b
        public void onError(Throwable th2) {
            if (this.f34059d) {
                C13558a.s(th2);
            } else {
                this.f34059d = true;
                this.f34056a.onError(th2);
            }
        }

        @Override // lw.b
        public void onNext(T t10) {
            if (this.f34059d) {
                return;
            }
            if (get() != 0) {
                this.f34056a.onNext(t10);
                av.d.c(this, 1L);
                return;
            }
            try {
                this.f34057b.accept(t10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        a(lw.b<? super T> bVar, g<? super T> gVar) {
            this.f34056a = bVar;
            this.f34057b = gVar;
        }

        @Override // lw.c
        public void t(long j10) {
            if (Zu.b.o(j10)) {
                av.d.a(this, j10);
            }
        }
    }

    @Override // Lu.g
    public void accept(T t10) {
    }

    @Override // io.reactivex.f
    protected void h(lw.b<? super T> bVar) {
        this.f34037b.g(new a(bVar, this.f34055c));
    }

    public d(io.reactivex.f<T> fVar) {
        super(fVar);
        this.f34055c = this;
    }
}
