package zh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzh/d;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "accountServicesUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lzh/c;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/c;", "baseUrl", "Lzh/b;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/b;", "Lzh/l;", "e", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/l;", "Lzh/j;", "c", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/j;", "digitalMPerksUrl", "Lzh/k;", "d", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f172796a = new d();

    public final b a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(MoshiConverterFactory.create(Bh.a.f2757a.a())).client(okHttpClient).build().create(b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (b) objCreate;
    }

    public final c b(HttpUrl accountServicesUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(accountServicesUrl, "accountServicesUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(accountServicesUrl).addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(c.class);
        Intrinsics.i(objCreate, "create(...)");
        return (c) objCreate;
    }

    public final j c(HttpUrl accountServicesUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(accountServicesUrl, "accountServicesUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(accountServicesUrl).addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(j.class);
        Intrinsics.i(objCreate, "create(...)");
        return (j) objCreate;
    }

    public final k d(HttpUrl digitalMPerksUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(digitalMPerksUrl, "digitalMPerksUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(digitalMPerksUrl).addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(k.class);
        Intrinsics.i(objCreate, "create(...)");
        return (k) objCreate;
    }

    public final l e(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(l.class);
        Intrinsics.i(objCreate, "create(...)");
        return (l) objCreate;
    }

    private d() {
    }
}
