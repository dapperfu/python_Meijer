package Dp;

import com.meijer.mobile.core.util.moshi.SerializedNulls;
import com.meijer.mobile.core.util.moshi.Stringable;
import com.squareup.moshi.t;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import yk.c;
import zk.C18531a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LDp/a;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "a", "()Lcom/squareup/moshi/t;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "LBp/a;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LBp/a;", "client", "Lokhttp3/Headers;", "globalHeaders", "c", "(Lokhttp3/OkHttpClient;Lokhttp3/Headers;)Lokhttp3/OkHttpClient;", "LEp/b;", "dataSource", "LEp/g;", "d", "(LEp/b;)LEp/g;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7048a = new a();

    public final Ep.g d(Ep.b dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        return dataSource;
    }

    public final t a() {
        t tVarD = new t.a().a(Stringable.b.f96156a).a(SerializedNulls.a.f96154a).a(c.a.f170513a).d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    public final Bp.a b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(a())).baseUrl(baseUrl).client(okHttpClient).build().create(Bp.a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Bp.a) objCreate;
    }

    public final OkHttpClient c(OkHttpClient client, Headers globalHeaders) {
        Intrinsics.j(client, "client");
        Intrinsics.j(globalHeaders, "globalHeaders");
        OkHttpClient.Builder builderB = client.B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderB0 = builderB.c(0L, timeUnit).d(10L, timeUnit).V(20L, timeUnit).b0(10L, timeUnit);
        builderB0.R().add(0, new C18531a(globalHeaders));
        return builderB0.a();
    }

    private a() {
    }
}
