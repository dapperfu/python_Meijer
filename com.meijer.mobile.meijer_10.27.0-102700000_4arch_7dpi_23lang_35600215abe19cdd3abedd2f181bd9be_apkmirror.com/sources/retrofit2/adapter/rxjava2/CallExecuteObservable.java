package retrofit2.adapter.rxjava2;

import Nu.b;
import Ou.a;
import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.l;
import io.reactivex.s;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes13.dex */
final class CallExecuteObservable<T> extends l<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallDisposable implements b {
        private final Call<?> call;
        private volatile boolean disposed;

        @Override // Nu.b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.disposed;
        }

        CallDisposable(Call<?> call) {
            this.call = call;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super Response<T>> sVar) {
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        sVar.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        boolean z10 = false;
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                sVar.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                sVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                a.b(th);
                if (z10) {
                    C14313a.s(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    sVar.onError(th);
                } catch (Throwable th3) {
                    a.b(th3);
                    C14313a.s(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }
}
