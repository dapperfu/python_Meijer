package Ll;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LLl/a;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Integer numV;
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        String strD = request.d("READ_TIMEOUT_MILLIS");
        if (strD != null && (numV = StringsKt.v(strD)) != null) {
            Response responseProceed = chain.b(numV.intValue(), TimeUnit.MILLISECONDS).proceed(request.g().q("READ_TIMEOUT_MILLIS").b());
            if (responseProceed != null) {
                return responseProceed;
            }
        }
        return chain.proceed(request);
    }
}
