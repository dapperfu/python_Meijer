package lp;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.InterfaceC15297a;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llp/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/squareup/moshi/t;", "constructorMoshi", "Lkp/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)Lkp/a;", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15460a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15460a f149112a = new C15460a();

    public final InterfaceC15297a a(HttpUrl baseUrl, OkHttpClient okHttpClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC15297a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC15297a) objCreate;
    }

    private C15460a() {
    }
}
