package retrofit2.adapter.rxjava2;

import Ju.b;
import Ku.a;
import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.l;
import io.reactivex.s;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes14.dex */
final class CallEnqueueObservable<T> extends l<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallCallback<T> implements b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final s<? super Response<T>> observer;
        boolean terminated = false;

        @Override // Ju.b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th2) {
                a.b(th2);
                if (this.terminated) {
                    C13558a.s(th2);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    a.b(th3);
                    C13558a.s(new CompositeException(th2, th3));
                }
            }
        }

        CallCallback(Call<?> call, s<? super Response<T>> sVar) {
            this.call = call;
            this.observer = sVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th2) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th2);
            } catch (Throwable th3) {
                a.b(th3);
                C13558a.s(new CompositeException(th2, th3));
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super Response<T>> sVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, sVar);
        sVar.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        callClone.enqueue(callCallback);
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }
}
