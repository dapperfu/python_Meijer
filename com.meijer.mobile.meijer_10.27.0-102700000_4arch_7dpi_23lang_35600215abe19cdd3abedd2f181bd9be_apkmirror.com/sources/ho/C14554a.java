package ho;

import go.InterfaceC14299a;
import go.InterfaceC14300b;
import go.InterfaceC14301c;
import go.InterfaceC14302d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lho/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lgo/d;", "d", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lgo/d;", "Lgo/c;", "c", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lgo/c;", "Lgo/b;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lgo/b;", "Lgo/e;", "e", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lgo/e;", "Lgo/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lgo/a;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ho.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14554a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14554a f136153a = new C14554a();

    public final InterfaceC14299a a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(g.f136154a.a())).baseUrl(baseUrl).build().create(InterfaceC14299a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14299a) objCreate;
    }

    public final InterfaceC14300b b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(g.f136154a.a())).baseUrl(baseUrl).build().create(InterfaceC14300b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14300b) objCreate;
    }

    public final InterfaceC14301c c(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(g.f136154a.a())).baseUrl(baseUrl).build().create(InterfaceC14301c.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14301c) objCreate;
    }

    public final InterfaceC14302d d(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(g.f136154a.a())).baseUrl(baseUrl).build().create(InterfaceC14302d.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14302d) objCreate;
    }

    public final go.e e(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(g.f136154a.a())).baseUrl(baseUrl).build().create(go.e.class);
        Intrinsics.i(objCreate, "create(...)");
        return (go.e) objCreate;
    }

    private C14554a() {
    }
}
