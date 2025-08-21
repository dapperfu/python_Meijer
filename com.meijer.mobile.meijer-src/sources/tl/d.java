package tl;

import com.meijer.mobile.core.util.moshi.SerializedNulls;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import zk.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltl/d;", "", "<init>", "()V", "Lretrofit2/Retrofit$Builder;", "a", "()Lretrofit2/Retrofit$Builder;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ltl/c;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Ltl/c;", "Ltl/g;", "c", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Ltl/g;", "Lcom/squareup/moshi/t;", "d", "()Lcom/squareup/moshi/t;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f163109a = new d();

    private final Retrofit.Builder a() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(d()));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final InterfaceC17272c b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = a().baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC17272c.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC17272c) objCreate;
    }

    public final g c(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = a().baseUrl(baseUrl).client(okHttpClient).build().create(g.class);
        Intrinsics.i(objCreate, "create(...)");
        return (g) objCreate;
    }

    public final t d() {
        t tVarD = new t.a().a(c.a.f172813a).a(SerializedNulls.a.f97012a).d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    private d() {
    }
}
