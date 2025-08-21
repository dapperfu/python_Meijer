package hr;

import er.InterfaceC13860a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhr/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "subscriptionServicesUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ler/a;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Ler/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14571a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14571a f136149a = new C14571a();

    public final InterfaceC13860a a(HttpUrl subscriptionServicesUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(subscriptionServicesUrl, "subscriptionServicesUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl(subscriptionServicesUrl).addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(InterfaceC13860a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC13860a) objCreate;
    }

    private C14571a() {
    }
}
