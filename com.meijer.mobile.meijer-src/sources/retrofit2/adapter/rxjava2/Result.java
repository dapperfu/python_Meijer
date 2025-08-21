package retrofit2.adapter.rxjava2;

import retrofit2.Response;

/* loaded from: classes14.dex */
public final class Result<T> {
    private final Throwable error;
    private final Response<T> response;

    public static <T> Result<T> error(Throwable th2) {
        if (th2 != null) {
            return new Result<>(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> Result<T> response(Response<T> response) {
        if (response != null) {
            return new Result<>(response, null);
        }
        throw new NullPointerException("response == null");
    }

    public boolean isError() {
        return this.error != null;
    }

    private Result(Response<T> response, Throwable th2) {
        this.response = response;
        this.error = th2;
    }

    public Throwable error() {
        return this.error;
    }

    public Response<T> response() {
        return this.response;
    }
}
