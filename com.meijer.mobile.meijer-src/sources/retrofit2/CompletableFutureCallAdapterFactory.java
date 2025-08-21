package retrofit2;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.CallAdapter;

@TargetApi(24)
@IgnoreJRERequirement
/* loaded from: classes14.dex */
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    @IgnoreJRERequirement
    private static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {
        private final Type responseType;

        @IgnoreJRERequirement
        private class BodyCallback implements Callback<R> {
            private final CompletableFuture<R> future;

            public BodyCallback(CompletableFuture<R> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> call, Throwable th2) {
                this.future.completeExceptionally(th2);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> call, Response<R> response) {
                if (response.isSuccessful()) {
                    this.future.complete(response.body());
                } else {
                    this.future.completeExceptionally(new HttpException(response));
                }
            }
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<R> adapt(Call<R> call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.enqueue(new BodyCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        BodyCallAdapter(Type type) {
            this.responseType = type;
        }
    }

    @IgnoreJRERequirement
    private static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {
        private final Call<?> call;

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.call.cancel();
            }
            return super.cancel(z10);
        }

        CallCancelCompletableFuture(Call<?> call) {
            this.call = call;
        }
    }

    @IgnoreJRERequirement
    private static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {
        private final Type responseType;

        @IgnoreJRERequirement
        private class ResponseCallback implements Callback<R> {
            private final CompletableFuture<Response<R>> future;

            public ResponseCallback(CompletableFuture<Response<R>> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> call, Throwable th2) {
                this.future.completeExceptionally(th2);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> call, Response<R> response) {
                this.future.complete(response);
            }
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<Response<R>> adapt(Call<R> call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.enqueue(new ResponseCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        ResponseCallAdapter(Type type) {
            this.responseType = type;
        }
    }

    CompletableFutureCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
            if (CallAdapter.Factory.getRawType(parameterUpperBound) != Response.class) {
                return new BodyCallAdapter(parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new ResponseCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
