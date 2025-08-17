package fp;

import ep.InterfaceC13720a;
import ep.InterfaceC13721b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfp/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lep/b;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lep/b;", "Lep/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lep/a;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13923a {

    /* renamed from: a, reason: collision with root package name */
    public static final C13923a f131266a = new C13923a();

    public final InterfaceC13720a a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(No.b.f22554a.b())).baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC13720a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC13720a) objCreate;
    }

    public final InterfaceC13721b b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(No.b.f22554a.b())).baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC13721b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC13721b) objCreate;
    }

    private C13923a() {
    }
}
