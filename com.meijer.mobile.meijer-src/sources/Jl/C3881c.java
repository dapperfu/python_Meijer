package Jl;

import com.meijer.mobile.gateway.apim.BuildConfig;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"LJl/c;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "r", "()Lokhttp3/HttpUrl;", "d", "e", "p", "k", "a", "n", "g", "f", "o", "l", "m", "i", "u", "t", "c", "q", "h", "s", "b", "v", "w", "j", "apim_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jl.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3881c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3881c f15937a = new C3881c();

    public final HttpUrl a() {
        return HttpUrl.INSTANCE.c(BuildConfig.ACCOUNT_LINKING_BASE_URL);
    }

    public final HttpUrl b() {
        return HttpUrl.INSTANCE.c(BuildConfig.ADDRESS_VALIDATION_BASE_URL);
    }

    public final HttpUrl c() {
        return HttpUrl.INSTANCE.c(BuildConfig.ARCHIVED_ORDERS_BASE_URL);
    }

    public final HttpUrl d() {
        return HttpUrl.INSTANCE.c("https://api.meijer.com/digital/");
    }

    public final HttpUrl e() {
        return HttpUrl.INSTANCE.c("https://api.meijer.com/digital/");
    }

    public final HttpUrl f() {
        return HttpUrl.INSTANCE.c(BuildConfig.DIGITAL_LOYALTY_BASE_URL);
    }

    public final HttpUrl g() {
        return HttpUrl.INSTANCE.c(BuildConfig.DELIVERY_PARTNERS_BASE_URL);
    }

    public final HttpUrl h() {
        return HttpUrl.INSTANCE.c(BuildConfig.DIGITAL_SECURITY_BASE_URL);
    }

    public final HttpUrl i() {
        return HttpUrl.INSTANCE.c(BuildConfig.FLY_BUY_BASE_URL);
    }

    public final HttpUrl j() {
        return HttpUrl.INSTANCE.c(BuildConfig.DIGITAL_GRAPHQL_BASE_URL);
    }

    public final HttpUrl k() {
        return HttpUrl.INSTANCE.c(BuildConfig.MMA_DIGITAL_SERVICES_BASE_URL);
    }

    public final HttpUrl l() {
        return HttpUrl.INSTANCE.c(BuildConfig.LOYALTY_MPERKS_BASE_URL);
    }

    public final HttpUrl m() {
        return HttpUrl.INSTANCE.c(BuildConfig.MEIJER_WEB_BASE_URL);
    }

    public final HttpUrl n() {
        return HttpUrl.INSTANCE.c(BuildConfig.MMA_SERVICES_BASE_URL);
    }

    public final HttpUrl o() {
        return HttpUrl.INSTANCE.c(BuildConfig.MPERKS_CUSTOMER_SUMMARY_BASE_URL);
    }

    public final HttpUrl p() {
        return HttpUrl.INSTANCE.c(BuildConfig.MPERKS_OFFERS_SERVICES_BASE_URL);
    }

    public final HttpUrl q() {
        return HttpUrl.INSTANCE.c(BuildConfig.NEXT_GEN_RECEIPTS_BASE_URL);
    }

    public final HttpUrl r() {
        return HttpUrl.INSTANCE.c(BuildConfig.OCC_BASE_URL);
    }

    public final HttpUrl s() {
        return HttpUrl.INSTANCE.c(BuildConfig.OKTA_ISSUER_URL);
    }

    public final HttpUrl t() {
        return HttpUrl.INSTANCE.c(BuildConfig.ORDER_SUBSTITUTION_BASE_URL);
    }

    public final HttpUrl u() {
        return HttpUrl.INSTANCE.c(BuildConfig.SHORTENER_BASE_URL);
    }

    public final HttpUrl v() {
        return HttpUrl.INSTANCE.c(BuildConfig.TEACHER_LISTS_BASE_URL);
    }

    public final HttpUrl w() {
        return HttpUrl.INSTANCE.c(BuildConfig.TEACHER_LISTS_SUPPLIES_BASE_URL);
    }

    private C3881c() {
    }
}
