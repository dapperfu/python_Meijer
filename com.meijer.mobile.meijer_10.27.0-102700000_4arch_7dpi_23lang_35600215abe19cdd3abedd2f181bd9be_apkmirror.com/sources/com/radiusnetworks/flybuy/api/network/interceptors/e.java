package com.radiusnetworks.flybuy.api.network.interceptors;

import android.os.Build;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes11.dex */
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request.a aVarM = chain.request().g().m("SDK-Platform", "android/" + Build.VERSION.RELEASE);
        FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
        String sdkVersion = flyBuyApi.getSdkVersion();
        if (sdkVersion != null) {
            aVarM.m("SDK-Version", sdkVersion);
        }
        List<String> sdkPermissions = flyBuyApi.getSdkPermissions();
        if (!sdkPermissions.isEmpty()) {
            aVarM.m("SDK-Permissions", CollectionsKt.B0(sdkPermissions, ",", null, null, 0, null, null, 62, null));
        }
        return chain.proceed(aVarM.b());
    }
}
