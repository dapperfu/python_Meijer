package Wk;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LWk/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "gatewayClient", "Lcom/squareup/moshi/t;", "constructorMoshi", "LUk/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)LUk/a;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41131a = new a();

    public final Uk.a a(HttpUrl baseUrl, OkHttpClient gatewayClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(gatewayClient, "gatewayClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).baseUrl(baseUrl).client(gatewayClient).build().create(Uk.a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Uk.a) objCreate;
    }

    private a() {
    }
}
