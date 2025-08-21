package up;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lup/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lup/f;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lup/f;", "Lup/e;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lup/e;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: up.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17451a {

    /* renamed from: a, reason: collision with root package name */
    public static final C17451a f164299a = new C17451a();

    public final e a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(baseUrl).client(okHttpClient).build().create(e.class);
        Intrinsics.i(objCreate, "create(...)");
        return (e) objCreate;
    }

    public final f b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(baseUrl).client(okHttpClient).build().create(f.class);
        Intrinsics.i(objCreate, "create(...)");
        return (f) objCreate;
    }

    private C17451a() {
    }
}
