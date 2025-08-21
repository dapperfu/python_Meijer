package com.radiusnetworks.flybuy.api.network.interceptors;

import android.os.Build;
import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.internal.EverythingIsNonNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/interceptors/SdkInfoInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SdkInfoInterceptor implements Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/interceptors/SdkInfoInterceptor$Companion;", "", "()V", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, String> getHeaders() {
            Map<String, String> mapR = MapsKt.r(TuplesKt.a("SDK-Platform", "android/" + Build.VERSION.RELEASE));
            FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
            String sdkVersion = flyBuyApi.getSdkVersion();
            if (sdkVersion != null) {
                mapR.put("SDK-Version", sdkVersion);
            }
            List<String> sdkPermissions = flyBuyApi.getSdkPermissions();
            if (!sdkPermissions.isEmpty()) {
                mapR.put("SDK-Permissions", CollectionsKt.B0(sdkPermissions, ",", null, null, 0, null, null, 62, null));
            }
            String appId = flyBuyApi.getAppId();
            if (appId != null) {
                mapR.put("App-Id", appId);
            }
            String appVersion = flyBuyApi.getAppVersion();
            if (appVersion != null) {
                mapR.put("App-Version", appVersion);
            }
            String appInstanceId = flyBuyApi.getAppInstanceId();
            if (appInstanceId != null) {
                mapR.put("App-Instance-Id", appInstanceId);
            }
            String id2 = TimeZone.getDefault().getID();
            Intrinsics.i(id2, "getID(...)");
            mapR.put("Time-Zone", id2);
            return mapR;
        }
    }

    @Override // okhttp3.Interceptor
    @EverythingIsNonNull
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.j(chain, "chain");
        Request.a aVarG = chain.request().g();
        for (Map.Entry<String, String> entry : INSTANCE.getHeaders().entrySet()) {
            aVarG.m(entry.getKey(), entry.getValue());
        }
        return chain.proceed(aVarG.b());
    }
}
