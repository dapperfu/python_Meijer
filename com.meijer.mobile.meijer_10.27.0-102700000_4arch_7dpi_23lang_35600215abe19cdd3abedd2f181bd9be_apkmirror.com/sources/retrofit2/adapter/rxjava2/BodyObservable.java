package retrofit2.adapter.rxjava2;

import Nu.b;
import Ou.a;
import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.l;
import io.reactivex.s;
import retrofit2.Response;

/* loaded from: classes13.dex */
final class BodyObservable<T> extends l<T> {
    private final l<Response<T>> upstream;

    private static class BodyObserver<R> implements s<Response<R>> {
        private final s<? super R> observer;
        private boolean terminated;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.terminated) {
                this.observer.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            C14313a.s(assertionError);
        }

        @Override // io.reactivex.s
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th2) {
                a.b(th2);
                C14313a.s(new CompositeException(httpException, th2));
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        BodyObserver(s<? super R> sVar) {
            this.observer = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        this.upstream.subscribe(new BodyObserver(sVar));
    }

    BodyObservable(l<Response<T>> lVar) {
        this.upstream = lVar;
    }
}
