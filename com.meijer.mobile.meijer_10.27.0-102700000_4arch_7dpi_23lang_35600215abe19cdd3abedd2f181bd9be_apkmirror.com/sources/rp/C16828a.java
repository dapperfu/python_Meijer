package rp;

import com.fullstory.FS;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import pk.k;
import qp.InterfaceC16593a;
import qp.InterfaceC16595c;
import qp.InterfaceC16596d;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrp/a;", "", "<init>", "()V", "Liw/a;", "loggingInterceptor", "Lpk/k;", "userAgentInterceptor", "Lokhttp3/OkHttpClient;", "b", "(Liw/a;Lpk/k;)Lokhttp3/OkHttpClient;", "httpClient", "Lqp/a;", "a", "(Lokhttp3/OkHttpClient;)Lqp/a;", "Lokhttp3/HttpUrl;", "baseUrl", "gatewayClient", "Lcom/squareup/moshi/t;", "constructorMoshi", "Lqp/d;", "d", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)Lqp/d;", "Lqp/c;", "c", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)Lqp/c;", "Lpp/d;", "e", "()Lpp/d;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16828a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16828a f159781a = new C16828a();

    public final InterfaceC16593a a(OkHttpClient httpClient) throws SecurityException {
        Intrinsics.j(httpClient, "httpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://b.criteo.com/").client(httpClient).build().create(InterfaceC16593a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC16593a) objCreate;
    }

    public final OkHttpClient b(iw.a loggingInterceptor, k userAgentInterceptor) {
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addInterceptor(loggingInterceptor).addInterceptor(userAgentInterceptor).a();
    }

    public final InterfaceC16595c c(HttpUrl baseUrl, OkHttpClient gatewayClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(gatewayClient, "gatewayClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).baseUrl(baseUrl).client(gatewayClient).build().create(InterfaceC16595c.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC16595c) objCreate;
    }

    public final InterfaceC16596d d(HttpUrl baseUrl, OkHttpClient gatewayClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(gatewayClient, "gatewayClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).client(gatewayClient).addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).build().create(InterfaceC16596d.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC16596d) objCreate;
    }

    public final pp.d e() {
        return new pp.d();
    }

    private C16828a() {
    }
}
