package com.radiusnetworks.flybuy.api.mapbox.interceptors;

import com.radiusnetworks.flybuy.api.mapbox.MapboxApi;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes12.dex */
public final class a implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        HttpUrl.a aVarK = request.getUrl().k();
        MapboxApi mapboxApi = MapboxApi.INSTANCE;
        aVarK.f("session_token", mapboxApi.getSessionId$api_defaultRelease().toString());
        if (mapboxApi.getTokenKey().length() > 0) {
            aVarK.f("access_token", mapboxApi.getTokenKey());
        }
        return chain.proceed(request.g().v(aVarK.g()).b());
    }
}
