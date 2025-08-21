package sh;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import rh.InterfaceC16907a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsh/a;", "", "<init>", "()V", "Lcom/squareup/moshi/t;", "c", "()Lcom/squareup/moshi/t;", "accountLinkingMoshi", "Lretrofit2/Retrofit$Builder;", "a", "(Lcom/squareup/moshi/t;)Lretrofit2/Retrofit$Builder;", "retrofitBuilder", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lrh/a;", "b", "(Lretrofit2/Retrofit$Builder;Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lrh/a;", "accountlinking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17074a {

    /* renamed from: a, reason: collision with root package name */
    public static final C17074a f160396a = new C17074a();

    public final Retrofit.Builder a(t accountLinkingMoshi) {
        Intrinsics.j(accountLinkingMoshi, "accountLinkingMoshi");
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(accountLinkingMoshi));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final InterfaceC16907a b(Retrofit.Builder retrofitBuilder, HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(retrofitBuilder, "retrofitBuilder");
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = retrofitBuilder.baseUrl(baseUrl).client(okHttpClient).build().create(InterfaceC16907a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC16907a) objCreate;
    }

    public final t c() {
        t tVarD = new t.a().d();
        Intrinsics.i(tVarD, "build(...)");
        return tVarD;
    }

    private C17074a() {
    }
}
