package sl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsl/b;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lsl/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lsl/a;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17082b {

    /* renamed from: a, reason: collision with root package name */
    public static final C17082b f160836a = new C17082b();

    public final InterfaceC17081a a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(No.b.f22510a.b())).build().create(InterfaceC17081a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC17081a) objCreate;
    }

    private C17082b() {
    }
}
