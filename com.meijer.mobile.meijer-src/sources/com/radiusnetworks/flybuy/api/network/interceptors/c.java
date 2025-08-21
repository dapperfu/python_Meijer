package com.radiusnetworks.flybuy.api.network.interceptors;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes12.dex */
public final class c implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        return chain.proceed(chain.request().g().m("Cache-Control", "public, only-if-cached, max-stale=60").b());
    }
}
