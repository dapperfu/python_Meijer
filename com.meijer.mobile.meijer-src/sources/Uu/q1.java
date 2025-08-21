package Uu;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class q1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f38802b;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38803a;

        /* renamed from: b, reason: collision with root package name */
        final int f38804b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38805c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38806d;

        @Override // Ju.b
        public void dispose() {
            if (this.f38806d) {
                return;
            }
            this.f38806d = true;
            this.f38805c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38806d;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            io.reactivex.s<? super T> sVar = this.f38803a;
            while (!this.f38806d) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f38806d) {
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
            this.f38803a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38804b == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38805c, bVar)) {
                this.f38805c = bVar;
                this.f38803a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            this.f38803a = sVar;
            this.f38804b = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38802b));
    }

    public q1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f38802b = i10;
    }
}
