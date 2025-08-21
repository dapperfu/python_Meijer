package Ll;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import zl.k;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLl/d;", "Lokhttp3/Interceptor;", "Lzl/k;", "featureManager", "<init>", "(Lzl/k;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lzl/k;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    public d(k featureManager) {
        Intrinsics.j(featureManager, "featureManager");
        this.featureManager = featureManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        String strD = request.d("retainOutOfStock");
        if (strD == null) {
            return chain.proceed(request);
        }
        Boolean.parseBoolean(strD);
        return chain.proceed(request.g().v(request.getUrl().k().f("retainOutOfStock", request.d("retainOutOfStock")).g()).q("retainOutOfStock").b());
    }
}
