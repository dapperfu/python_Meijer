package yh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import qk.j;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rk.C16915a;
import zh.InterfaceC18489a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyh/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "accountServicesUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lzh/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lzh/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18314a {

    /* renamed from: a, reason: collision with root package name */
    public static final C18314a f171424a = new C18314a();

    public final InterfaceC18489a a(HttpUrl accountServicesUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(accountServicesUrl, "accountServicesUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(accountServicesUrl).addConverterFactory(GsonConverterFactory.create(C16915a.a())).addCallAdapterFactory(j.b()).client(okHttpClient).build().create(InterfaceC18489a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC18489a) objCreate;
    }

    private C18314a() {
    }
}
