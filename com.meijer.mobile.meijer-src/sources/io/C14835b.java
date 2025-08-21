package io;

import com.squareup.moshi.t;
import ho.InterfaceC14561a;
import ho.InterfaceC14562b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/b;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lho/a;", "d", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lho/a;", "Lho/b;", "e", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)Lho/b;", "Lcom/squareup/moshi/t;", "b", "Lkotlin/Lazy;", "()Lcom/squareup/moshi/t;", "mPerksMoshi", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: io.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14835b {

    /* renamed from: a, reason: collision with root package name */
    public static final C14835b f138793a = new C14835b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy mPerksMoshi = LazyKt.b(new Function0() { // from class: io.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C14835b.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final t c() {
        return new t.a().d();
    }

    public final t b() {
        Object value = mPerksMoshi.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (t) value;
    }

    public final InterfaceC14561a d(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(b())).baseUrl(baseUrl).build().create(InterfaceC14561a.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14561a) objCreate;
    }

    public final InterfaceC14562b e(HttpUrl baseUrl, OkHttpClient okHttpClient) throws SecurityException {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().client(okHttpClient).addConverterFactory(MoshiConverterFactory.create(b())).baseUrl(baseUrl).build().create(InterfaceC14562b.class);
        Intrinsics.i(objCreate, "create(...)");
        return (InterfaceC14562b) objCreate;
    }

    private C14835b() {
    }
}
