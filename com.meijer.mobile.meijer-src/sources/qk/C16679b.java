package qk;

import Kk.AppVersion;
import com.fullstory.FS;
import com.meijer.mobile.core.util.networking.NetworkConnectivityInterceptor;
import ew.a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lqk/b;", "", "<init>", "()V", "", "", "headers", "Lcom/meijer/mobile/core/util/networking/a;", "manager", "Lqk/k;", "userAgentInterceptor", "Lew/a;", "logging", "Lokhttp3/Headers;", "globalHeaders", "", "readTimeoutSeconds", "Lokhttp3/OkHttpClient$Builder;", "b", "(Ljava/util/Map;Lcom/meijer/mobile/core/util/networking/a;Lqk/k;Lew/a;Lokhttp3/Headers;Ljava/lang/Long;)Lokhttp3/OkHttpClient$Builder;", "LKk/a;", "appVersion", "f", "(LKk/a;)Lew/a;", "g", "(LKk/a;)J", "loggingInterceptor", "Lokhttp3/OkHttpClient;", "e", "(Lcom/meijer/mobile/core/util/networking/a;Lqk/k;Lew/a;Lokhttp3/Headers;J)Lokhttp3/OkHttpClient;", "h", "(Lcom/meijer/mobile/core/util/networking/a;Lqk/k;Lew/a;Lokhttp3/Headers;)Lokhttp3/OkHttpClient;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qk.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16679b {

    /* renamed from: a, reason: collision with root package name */
    public static final C16679b f158500a = new C16679b();

    private final OkHttpClient.Builder b(final Map<String, String> headers, com.meijer.mobile.core.util.networking.a manager, k userAgentInterceptor, ew.a logging, Headers globalHeaders, Long readTimeoutSeconds) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        if (readTimeoutSeconds != null) {
            builder.V(readTimeoutSeconds.longValue(), TimeUnit.SECONDS);
        }
        builder.addInterceptor(userAgentInterceptor);
        builder.addInterceptor(new Ak.a(globalHeaders));
        builder.addInterceptor(new Interceptor() { // from class: qk.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return C16679b.d(headers, chain);
            }
        });
        builder.addInterceptor(logging);
        builder.addInterceptor(new NetworkConnectivityInterceptor(manager));
        return builder;
    }

    static /* synthetic */ OkHttpClient.Builder c(C16679b c16679b, Map map, com.meijer.mobile.core.util.networking.a aVar, k kVar, ew.a aVar2, Headers headers, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.k();
        }
        if ((i10 & 32) != 0) {
            l10 = null;
        }
        return c16679b.b(map, aVar, kVar, aVar2, headers, l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response d(Map map, Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        Request.a aVarO = request.g().n(request.getHeaders()).o(request.getMethod(), request.getBody());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (request.d(str) == null) {
                aVarO.a(str, str2);
            }
        }
        return chain.proceed(aVarO.b());
    }

    public final OkHttpClient e(com.meijer.mobile.core.util.networking.a manager, k userAgentInterceptor, ew.a loggingInterceptor, Headers globalHeaders, long readTimeoutSeconds) {
        Intrinsics.j(manager, "manager");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        Intrinsics.j(globalHeaders, "globalHeaders");
        return c(this, null, manager, userAgentInterceptor, loggingInterceptor, globalHeaders, Long.valueOf(readTimeoutSeconds), 1, null).a();
    }

    public final ew.a f(AppVersion appVersion) {
        Intrinsics.j(appVersion, "appVersion");
        return new ew.a(null, 1, null).e((appVersion.getIsDevMode() || appVersion.getIsDebug()) ? a.b.f130920d : a.b.f130917a);
    }

    public final long g(AppVersion appVersion) {
        Intrinsics.j(appVersion, "appVersion");
        String environment = appVersion.getEnvironment();
        int iHashCode = environment.hashCode();
        return iHashCode != 99349 ? iHashCode != 114214 ? (iHashCode == 3079869 && environment.equals("dev2")) ? 60L : 30L : environment.equals("stg") ? 60L : 30L : !environment.equals("dev") ? 30L : 60L;
    }

    public final OkHttpClient h(com.meijer.mobile.core.util.networking.a manager, k userAgentInterceptor, ew.a loggingInterceptor, Headers globalHeaders) {
        Intrinsics.j(manager, "manager");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        Intrinsics.j(globalHeaders, "globalHeaders");
        OkHttpClient.Builder builderC = c(this, null, manager, userAgentInterceptor, loggingInterceptor, globalHeaders, null, 33, null);
        builderC.V(60L, TimeUnit.SECONDS);
        return builderC.a();
    }

    private C16679b() {
    }
}
