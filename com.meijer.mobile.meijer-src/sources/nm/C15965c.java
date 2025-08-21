package nm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnm/c;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lretrofit2/Retrofit$Builder;", "retrofitBuilder", "Lnm/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lretrofit2/Retrofit$Builder;)Lnm/a;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nm.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15965c {

    /* renamed from: a, reason: collision with root package name */
    public static final C15965c f152529a = new C15965c();

    public final InterfaceC15963a a(HttpUrl baseUrl, OkHttpClient okHttpClient, Retrofit.Builder retrofitBuilder) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(retrofitBuilder, "retrofitBuilder");
        Object objCreate = retrofitBuilder.baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC15963a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC15963a) objCreate;
    }

    private C15965c() {
    }
}
