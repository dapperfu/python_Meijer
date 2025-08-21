package Nv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "a", "(Lokhttp3/Response;)Lokhttp3/Response;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    public static final Response a(Response response) {
        Intrinsics.j(response, "<this>");
        return response.p().b(new b(response.getBody().getMediaType(), response.getBody().getContentLength())).c();
    }
}
