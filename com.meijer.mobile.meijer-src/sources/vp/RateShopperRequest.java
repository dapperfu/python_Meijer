package vp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lvp/a;", "", "", "shopperName", "rate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vp.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class RateShopperRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopperName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rate;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateShopperRequest)) {
            return false;
        }
        RateShopperRequest rateShopperRequest = (RateShopperRequest) other;
        return Intrinsics.e(this.shopperName, rateShopperRequest.shopperName) && Intrinsics.e(this.rate, rateShopperRequest.rate);
    }

    public RateShopperRequest(String shopperName, String rate) {
        Intrinsics.j(shopperName, "shopperName");
        Intrinsics.j(rate, "rate");
        this.shopperName = shopperName;
        this.rate = rate;
    }

    /* renamed from: a, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* renamed from: b, reason: from getter */
    public final String getShopperName() {
        return this.shopperName;
    }

    public int hashCode() {
        return (this.shopperName.hashCode() * 31) + this.rate.hashCode();
    }

    public String toString() {
        return "RateShopperRequest(shopperName=" + this.shopperName + ", rate=" + this.rate + ')';
    }
}
