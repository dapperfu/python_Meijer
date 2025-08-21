package Jl;

import com.meijer.mobile.gateway.apim.BuildConfig;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LJl/z;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "a", "()Lokhttp3/HttpUrl;", "e", "b", "c", "d", "apim_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f15938a = new z();

    public final HttpUrl a() {
        return HttpUrl.INSTANCE.c(BuildConfig.ACCOUNTS_BASE_URL);
    }

    public final HttpUrl b() {
        return HttpUrl.INSTANCE.c(BuildConfig.EDAA_PRODUCT_IMAGES_URL);
    }

    public final HttpUrl c() {
        return HttpUrl.INSTANCE.c(BuildConfig.GREENVILLE_BASE_URL);
    }

    public final HttpUrl d() {
        return HttpUrl.INSTANCE.c(BuildConfig.STORE_ROUTING_BASE_URL);
    }

    public final HttpUrl e() {
        return HttpUrl.INSTANCE.c(BuildConfig.PRODUCT_IMAGES_URL);
    }

    private z() {
    }
}
