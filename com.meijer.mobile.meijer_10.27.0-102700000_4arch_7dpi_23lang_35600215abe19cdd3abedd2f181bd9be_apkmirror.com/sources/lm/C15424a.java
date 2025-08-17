package lm;

import com.fullstory.FS;
import com.meijer.mobile.instoreshopping.adapters.ProductImageAdapter;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import pk.k;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llm/a;", "", "<init>", "()V", "Lretrofit2/Retrofit$Builder;", "a", "()Lretrofit2/Retrofit$Builder;", "Liw/a;", "loggingInterceptor", "Lpk/k;", "userAgentInterceptor", "Lokhttp3/OkHttpClient;", "b", "(Liw/a;Lpk/k;)Lokhttp3/OkHttpClient;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15424a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15424a f148951a = new C15424a();

    public final Retrofit.Builder a() {
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(MoshiConverterFactory.create(new t.a().b(new ProductImageAdapter()).d()));
        Intrinsics.i(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }

    public final OkHttpClient b(iw.a loggingInterceptor, k userAgentInterceptor) {
        Intrinsics.j(loggingInterceptor, "loggingInterceptor");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addInterceptor(userAgentInterceptor).addInterceptor(loggingInterceptor).a();
    }

    private C15424a() {
    }
}
