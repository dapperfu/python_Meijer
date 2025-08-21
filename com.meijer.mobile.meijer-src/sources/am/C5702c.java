package am;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lam/c;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "gatewayClient", "LYl/b;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LYl/b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: am.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5702c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5702c f45489a = new C5702c();

    public final Yl.b a(HttpUrl baseUrl, OkHttpClient gatewayClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(gatewayClient, "gatewayClient");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).client(gatewayClient).addConverterFactory(MoshiConverterFactory.create(No.b.f22510a.b())).build().create(Yl.b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Yl.b) objCreate;
    }

    private C5702c() {
    }
}
