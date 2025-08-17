package hp;

import com.squareup.moshi.t;
import gp.C14303a;
import gp.InterfaceC14304b;
import gp.InterfaceC14305c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhp/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/squareup/moshi/t;", "constructorMoshi", "Lgp/c;", "a", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/t;)Lgp/c;", "Lgp/a;", "dataSource", "Lgp/b;", "b", "(Lgp/a;)Lgp/b;", "multi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14557a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14557a f136155a = new C14557a();

    public final InterfaceC14304b b(C14303a dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        return dataSource;
    }

    public final InterfaceC14305c a(HttpUrl baseUrl, OkHttpClient okHttpClient, t constructorMoshi) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(constructorMoshi, "constructorMoshi");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(constructorMoshi)).baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC14305c.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14305c) objCreate;
    }

    private C14557a() {
    }
}
