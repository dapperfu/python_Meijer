package Ui;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LUi/a;", "", "<init>", "()V", "Lretrofit2/Retrofit$Builder;", "a", "()Lretrofit2/Retrofit$Builder;", "Lcom/squareup/moshi/t;", "c", "()Lcom/squareup/moshi/t;", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "LTi/a;", "b", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)LTi/a;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36069a = new a();

    private final Retrofit.Builder a() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(c()));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final Ti.a b(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = a().baseUrl(baseUrl).client(okHttpClient).build().create(Ti.a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (Ti.a) objCreate;
    }

    public final t c() {
        t tVarD = new t.a().d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    private a() {
    }
}
