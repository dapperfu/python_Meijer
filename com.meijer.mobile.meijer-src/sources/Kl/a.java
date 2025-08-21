package Kl;

import Ll.c;
import Ll.d;
import Ll.e;
import com.fullstory.FS;
import com.meijer.mobile.core.util.networking.NetworkConnectivityInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import qk.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKl/a;", "", "<init>", "()V", "", "subscriptionKey", "Lcom/meijer/mobile/core/util/networking/a;", "networkConnectivityManager", "Lqk/k;", "userAgentInterceptor", "Lew/a;", "loggingInterceptor", "LLl/c;", "hybrisResponseMonitor", "Lzl/k;", "featureManager", "", "readTimeout", "Lokhttp3/OkHttpClient;", "a", "(Ljava/lang/String;Lcom/meijer/mobile/core/util/networking/a;Lqk/k;Lew/a;LLl/c;Lzl/k;J)Lokhttp3/OkHttpClient;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17549a = new a();

    public final OkHttpClient a(String subscriptionKey, com.meijer.mobile.core.util.networking.a networkConnectivityManager, k userAgentInterceptor, ew.a loggingInterceptor, c hybrisResponseMonitor, zl.k featureManager, long readTimeout) {
        Intrinsics.j(subscriptionKey, "subscriptionKey");
        Intrinsics.j(networkConnectivityManager, "networkConnectivityManager");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        Intrinsics.j(hybrisResponseMonitor, "hybrisResponseMonitor");
        Intrinsics.j(featureManager, "featureManager");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.c(0L, timeUnit).d(10L, timeUnit).V(readTimeout, timeUnit).b0(10L, timeUnit).addInterceptor(new e(subscriptionKey)).addInterceptor(userAgentInterceptor).addInterceptor(new Ll.b(hybrisResponseMonitor)).addInterceptor(new Ll.a()).addInterceptor(new d(featureManager)).addInterceptor(new NetworkConnectivityInterceptor(networkConnectivityManager)).addInterceptor(loggingInterceptor).a();
    }

    private a() {
    }
}
