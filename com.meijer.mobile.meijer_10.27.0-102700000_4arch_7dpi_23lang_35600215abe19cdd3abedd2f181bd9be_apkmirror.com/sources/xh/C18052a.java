package xh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import pk.j;
import qk.C16534a;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yh.InterfaceC18213a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxh/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "accountServicesUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lyh/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lyh/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18052a {

    /* renamed from: a, reason: collision with root package name */
    public static final C18052a f169647a = new C18052a();

    public final InterfaceC18213a a(HttpUrl accountServicesUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(accountServicesUrl, "accountServicesUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(accountServicesUrl).addConverterFactory(GsonConverterFactory.create(C16534a.a())).addCallAdapterFactory(j.b()).client(okHttpClient).build().create(InterfaceC18213a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC18213a) objCreate;
    }

    private C18052a() {
    }
}
