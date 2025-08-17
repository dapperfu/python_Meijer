package retrofit2.adapter.rxjava2;

import Nu.b;
import Ou.a;
import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.l;
import io.reactivex.s;
import retrofit2.Response;

/* loaded from: classes13.dex */
final class ResultObservable<T> extends l<Result<T>> {
    private final l<Response<T>> upstream;

    private static class ResultObserver<R> implements s<Response<R>> {
        private final s<? super Result<R>> observer;

        @Override // io.reactivex.s
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                this.observer.onNext(Result.error(th2));
                this.observer.onComplete();
            } catch (Throwable th3) {
                try {
                    this.observer.onError(th3);
                } catch (Throwable th4) {
                    a.b(th4);
                    C14313a.s(new CompositeException(th3, th4));
                }
            }
        }

        @Override // io.reactivex.s
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        @Override // io.reactivex.s
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        ResultObserver(s<? super Result<R>> sVar) {
            this.observer = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super Result<T>> sVar) {
        this.upstream.subscribe(new ResultObserver(sVar));
    }

    ResultObservable(l<Response<T>> lVar) {
        this.upstream = lVar;
    }
}
