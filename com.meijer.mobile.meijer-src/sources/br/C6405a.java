package br;

import com.meijer.mobile.core.models.store.FuelTypesAdapter;
import com.meijer.mobile.core.util.moshi.SerializedNulls;
import com.meijer.mobile.core.util.moshi.Stringable;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import zk.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbr/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "LZq/a;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LZq/a;", "Lcom/squareup/moshi/t;", "c", "()Lcom/squareup/moshi/t;", "Lretrofit2/Retrofit$Builder;", "a", "()Lretrofit2/Retrofit$Builder;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: br.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6405a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6405a f60490a = new C6405a();

    public final Retrofit.Builder a() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(c()));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final Zq.a b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = a().baseUrl(baseUrl).client(okHttpClient).build().create(Zq.a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Zq.a) objCreate;
    }

    public final t c() {
        t tVarD = new t.a().b(FuelTypesAdapter.f96993a).a(c.a.f172813a).a(SerializedNulls.a.f97012a).a(Stringable.b.f97014a).d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    private C6405a() {
    }
}
