package I7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Lokhttp3/Response;", "", "c", "(Lokhttp3/Response;)Z", "a", "b", "e", "d", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final boolean a(Response response) {
        Intrinsics.j(response, "<this>");
        return response.getCode() == 405;
    }

    public static final boolean b(Response response) {
        Intrinsics.j(response, "<this>");
        return response.getCode() == 200;
    }

    public static final boolean c(Response response) {
        Intrinsics.j(response, "<this>");
        return response.getCode() == 429;
    }

    public static final boolean d(Response response) {
        Intrinsics.j(response, "<this>");
        return a(response) || e(response);
    }

    public static final boolean e(Response response) {
        Intrinsics.j(response, "<this>");
        return (response.getCode() == 405 || response.getCode() == 429 || response.getCode() == 200 || response.getCode() == 503 || response.getCode() == 500 || response.getCode() == 411 || response.getCode() == 413 || response.getCode() == 403 || response.getCode() == 400) ? false : true;
    }
}
