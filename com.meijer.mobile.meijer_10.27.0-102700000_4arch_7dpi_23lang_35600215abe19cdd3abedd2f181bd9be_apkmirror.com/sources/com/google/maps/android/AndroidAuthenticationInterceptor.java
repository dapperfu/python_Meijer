package com.google.maps.android;

import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes7.dex */
public class AndroidAuthenticationInterceptor implements Interceptor {
    private final AndroidAuthenticationConfig config;

    public AndroidAuthenticationInterceptor(AndroidAuthenticationConfig androidAuthenticationConfig) {
        this.config = androidAuthenticationConfig;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (this.config == AndroidAuthenticationConfig.EMPTY) {
            return chain.proceed(request);
        }
        Request.a aVarG = chain.request().g();
        String str = this.config.packageName;
        if (str != null) {
            aVarG.a(HttpHeaders.X_ANDROID_PACKAGE, str);
        }
        String str2 = this.config.certFingerprint;
        if (str2 != null) {
            aVarG.a(HttpHeaders.X_ANDROID_CERT, str2);
        }
        return chain.proceed(aVarG.b());
    }
}
