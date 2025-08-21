package Jq;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LJq/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "LOq/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LOq/a;", "Lcom/squareup/moshi/t;", "constructorMoshi", "LOq/b;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)LOq/b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16163a = new a();

    public final Oq.a a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build().create(Oq.a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Oq.a) objCreate;
    }

    public final Oq.b b(HttpUrl baseUrl, OkHttpClient okHttpClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).build().create(Oq.b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Oq.b) objCreate;
    }

    private a() {
    }
}
