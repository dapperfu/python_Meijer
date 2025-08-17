package retrofit2.adapter.rxjava2;

import retrofit2.Response;

@Deprecated
/* loaded from: classes13.dex */
public final class HttpException extends retrofit2.HttpException {
    public HttpException(Response<?> response) {
        super(response);
    }
}
