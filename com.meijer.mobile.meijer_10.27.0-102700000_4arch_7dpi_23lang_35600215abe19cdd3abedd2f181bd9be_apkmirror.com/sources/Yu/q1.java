package Yu;

import java.util.ArrayDeque;

/* loaded from: classes9.dex */
public final class q1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f41577b;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41578a;

        /* renamed from: b, reason: collision with root package name */
        final int f41579b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41580c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41581d;

        @Override // Nu.b
        public void dispose() {
            if (this.f41581d) {
                return;
            }
            this.f41581d = true;
            this.f41580c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41581d;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            io.reactivex.s<? super T> sVar = this.f41578a;
            while (!this.f41581d) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f41581d) {
                        return;
                    }
                    sVar.onComplete();
                    return;
                }
                sVar.onNext(tPoll);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41578a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41579b == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41580c, bVar)) {
                this.f41580c = bVar;
                this.f41578a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            this.f41578a = sVar;
            this.f41579b = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41577b));
    }

    public q1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f41577b = i10;
    }
}
