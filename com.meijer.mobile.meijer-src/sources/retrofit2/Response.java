package retrofit2;

import Mv.r;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;

/* loaded from: classes14.dex */
public final class Response<T> {
    private final T body;
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    public static <T> Response<T> error(int i10, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i10 >= 400) {
            return error(responseBody, new Response.a().b(new OkHttpCall.NoContentResponseBody(responseBody.getF154457a(), responseBody.getF154458b())).f(i10).l("Response.error()").o(r.f20501d).q(new Request.a().t("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> Response<T> success(T t10) {
        return success(t10, new Response.a().f(HttpResponseStatus.SUCCESS_OK).l("OK").o(r.f20501d).q(new Request.a().t("http://localhost/").b()).c());
    }

    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.getCode();
    }

    public ResponseBody errorBody() {
        return this.errorBody;
    }

    public Headers headers() {
        return this.rawResponse.getHeaders();
    }

    public boolean isSuccessful() {
        return this.rawResponse.getIsSuccessful();
    }

    public String message() {
        return this.rawResponse.getMessage();
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(okhttp3.Response response, T t10, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t10;
        this.errorBody = responseBody;
    }

    public static <T> Response<T> success(int i10, T t10) {
        if (i10 >= 200 && i10 < 300) {
            return success(t10, new Response.a().f(i10).l("Response.success()").o(r.f20501d).q(new Request.a().t("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.getIsSuccessful()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(T t10, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return success(t10, new Response.a().f(HttpResponseStatus.SUCCESS_OK).l("OK").o(r.f20501d).j(headers).q(new Request.a().t("http://localhost/").b()).c());
    }

    public static <T> Response<T> success(T t10, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            return new Response<>(response, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
