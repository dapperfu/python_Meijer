package com.radiusnetworks.flybuy.api.network.interceptors;

import com.radiusnetworks.flybuy.api.FlyBuyApi;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes11.dex */
public final class c implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
        if (StringsKt.r0(flyBuyApi.getCustomerApiToken())) {
            return chain.proceed(request);
        }
        Request.a aVarG = request.g();
        String str = String.format("Token token=\"%s\"", Arrays.copyOf(new Object[]{flyBuyApi.getCustomerApiToken()}, 1));
        Intrinsics.i(str, "format(this, *args)");
        return chain.proceed(aVarG.m("Authorization", str).b());
    }
}
