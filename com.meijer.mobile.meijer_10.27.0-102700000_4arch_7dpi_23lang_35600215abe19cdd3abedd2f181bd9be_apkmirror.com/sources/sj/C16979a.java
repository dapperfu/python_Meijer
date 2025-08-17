package sj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import rj.InterfaceC16792a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsj/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lrj/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lrj/a;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16979a {

    /* renamed from: a, reason: collision with root package name */
    public static final C16979a f160554a = new C16979a();

    public final InterfaceC16792a a(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(No.b.f22554a.b())).baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC16792a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC16792a) objCreate;
    }

    private C16979a() {
    }
}
