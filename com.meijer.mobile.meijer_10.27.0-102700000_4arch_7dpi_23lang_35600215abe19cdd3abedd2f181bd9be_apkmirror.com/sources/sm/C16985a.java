package sm;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lretrofit2/Response;", "Lkotlin/Result;", "a", "(Lretrofit2/Response;)Ljava/lang/Object;", "instoreshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: sm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16985a {
    public static final <T> Object a(Response<T> response) {
        String strString;
        Intrinsics.j(response, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (response.isSuccessful()) {
                T tBody = response.body();
                if (tBody != null) {
                    return Result.b(tBody);
                }
                throw new NullPointerException("Response body is null");
            }
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody == null || (strString = responseBodyErrorBody.string()) == null) {
                strString = "Unknown API error";
            }
            throw new Exception(strString);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.b(ResultKt.a(th2));
        }
    }
}
