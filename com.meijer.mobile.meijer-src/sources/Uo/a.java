package Uo;

import I6.d;
import com.fullstory.FS;
import j$.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import qk.k;
import y6.C18292b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LUo/a;", "", "<init>", "()V", "Lqk/k;", "userAgentInterceptor", "Lew/a;", "loggingInterceptor", "Lokhttp3/OkHttpClient$Builder;", "b", "(Lqk/k;Lew/a;)Lokhttp3/OkHttpClient$Builder;", "okHttpClientBuilder", "Lokhttp3/HttpUrl;", "baseUrl", "Ly6/b;", "a", "(Lokhttp3/OkHttpClient$Builder;Lokhttp3/HttpUrl;)Ly6/b;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37635a = new a();

    public final C18292b a(OkHttpClient.Builder okHttpClientBuilder, HttpUrl baseUrl) {
        Intrinsics.j(okHttpClientBuilder, "okHttpClientBuilder");
        Intrinsics.j(baseUrl, "baseUrl");
        C18292b.a aVarC0 = new C18292b.a().c0(baseUrl.getUrl());
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.i(durationOfSeconds, "ofSeconds(...)");
        OkHttpClient.Builder builderE = okHttpClientBuilder.e(durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(10L);
        Intrinsics.i(durationOfSeconds2, "ofSeconds(...)");
        OkHttpClient.Builder builderW = builderE.W(durationOfSeconds2);
        Duration durationOfSeconds3 = Duration.ofSeconds(10L);
        Intrinsics.i(durationOfSeconds3, "ofSeconds(...)");
        return d.d(aVarC0, builderW.c0(durationOfSeconds3).a()).c();
    }

    public final OkHttpClient.Builder b(k userAgentInterceptor, ew.a loggingInterceptor) {
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addInterceptor(userAgentInterceptor).addInterceptor(loggingInterceptor);
    }

    private a() {
    }
}
