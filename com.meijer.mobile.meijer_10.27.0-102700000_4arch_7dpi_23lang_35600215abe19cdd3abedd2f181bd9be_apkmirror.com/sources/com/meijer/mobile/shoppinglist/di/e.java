package com.meijer.mobile.shoppinglist.di;

import com.meijer.mobile.core.util.moshi.SerializedNulls;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/shoppinglist/di/e;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "c", "()Lcom/squareup/moshi/t;", "Lretrofit2/Retrofit$Builder;", "a", "()Lretrofit2/Retrofit$Builder;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "LHq/d;", "d", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LHq/d;", "LHq/e;", "dataSource", "LHq/c;", "e", "(LHq/e;)LHq/c;", "LHq/b;", "LHq/a;", "b", "(LHq/b;)LHq/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f117074a = new e();

    public final Hq.a b(Hq.b dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        return dataSource;
    }

    public final Hq.c e(Hq.e dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        return dataSource;
    }

    public final Retrofit.Builder a() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(c()));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final t c() {
        t tVarD = new t.a().a(SerializedNulls.a.f96154a).d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    public final Hq.d d(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = a().baseUrl(baseUrl).client(okHttpClient).build().create(Hq.d.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Hq.d) objCreate;
    }

    private e() {
    }
}
