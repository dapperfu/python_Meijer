package com.radiusnetworks.flybuy.api.network.interceptors;

import com.radiusnetworks.flybuy.api.FlyBuyApi;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes11.dex */
public final class b implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request.a aVarG = chain.request().g();
        FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
        String appId = flyBuyApi.getAppId();
        if (appId != null) {
            aVarG.a("App-Id", appId);
        }
        String appVersion = flyBuyApi.getAppVersion();
        if (appVersion != null) {
            aVarG.a("App-Version", appVersion);
        }
        String appInstanceId = flyBuyApi.getAppInstanceId();
        if (appInstanceId != null) {
            aVarG.a("App-Instance-Id", appInstanceId);
        }
        return chain.proceed(aVarG.b());
    }
}
