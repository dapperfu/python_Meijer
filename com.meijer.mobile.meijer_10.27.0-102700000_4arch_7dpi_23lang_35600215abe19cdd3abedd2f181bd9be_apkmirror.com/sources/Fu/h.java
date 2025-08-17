package Fu;

import com.fullstory.FS;
import com.squareup.moshi.t;
import io.constructor.data.interceptor.RequestInterceptor;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import io.constructor.data.model.dataadapter.ResultDataAdapter;
import iw.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LFu/h;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/squareup/moshi/t;", "moshi", "Lio/constructor/data/local/PreferencesHelper;", "preferencesHelper", "Lretrofit2/Retrofit;", "e", "(Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;Lio/constructor/data/local/PreferencesHelper;)Lretrofit2/Retrofit;", "Liw/a;", "httpLoggingInterceptor", "Lio/constructor/data/interceptor/RequestInterceptor;", "requestInterceptor", "c", "(Liw/a;Lio/constructor/data/interceptor/RequestInterceptor;)Lokhttp3/OkHttpClient;", "a", "()Liw/a;", "prefHelper", "Lio/constructor/data/memory/ConfigMemoryHolder;", "configMemoryHolder", "d", "(Lio/constructor/data/local/PreferencesHelper;Lio/constructor/data/memory/ConfigMemoryHolder;)Lio/constructor/data/interceptor/RequestInterceptor;", "b", "()Lcom/squareup/moshi/t;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11083a = new h();

    /* JADX WARN: Multi-variable type inference failed */
    public final iw.a a() {
        return new iw.a(null, 1, 0 == true ? 1 : 0).e(a.b.f138529b);
    }

    public final t b() {
        t tVarD = new t.a().b(new ResultDataAdapter()).d();
        Intrinsics.i(tVarD, "Builder()\n        .add(R…apter())\n        .build()");
        return tVarD;
    }

    public final OkHttpClient c(iw.a httpLoggingInterceptor, RequestInterceptor requestInterceptor) {
        Intrinsics.j(httpLoggingInterceptor, "httpLoggingInterceptor");
        Intrinsics.j(requestInterceptor, "requestInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        builder.addInterceptor(requestInterceptor);
        return builder.a();
    }

    public final RequestInterceptor d(PreferencesHelper prefHelper, ConfigMemoryHolder configMemoryHolder) {
        Intrinsics.j(prefHelper, "prefHelper");
        Intrinsics.j(configMemoryHolder, "configMemoryHolder");
        return new RequestInterceptor(prefHelper, configMemoryHolder);
    }

    public final Retrofit e(OkHttpClient okHttpClient, t moshi, PreferencesHelper preferencesHelper) {
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(preferencesHelper, "preferencesHelper");
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(preferencesHelper.getScheme() + "://" + preferencesHelper.getServiceUrl()).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(moshi)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        Intrinsics.i(retrofitBuild, "Builder()\n            .b…e())\n            .build()");
        return retrofitBuild;
    }

    private h() {
    }
}
