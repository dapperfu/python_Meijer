package Tv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "b", "(Lokhttp3/Request;)Lokhttp3/Request;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request b(Request request) {
        HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        if (cacheUrlOverride != null) {
            if (Intrinsics.e(request.getMethod(), "GET") || Intrinsics.e(request.getMethod(), "POST")) {
                return request.g().f().v(cacheUrlOverride).d(null).b();
            }
            return request;
        }
        return request;
    }
}
