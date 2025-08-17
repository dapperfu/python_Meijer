package vp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvp/c;", "", "", "success", "Lvp/a;", "rateShopperRequest", "<init>", "(ZLvp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSuccess", "()Z", "b", "Lvp/a;", "getRateShopperRequest", "()Lvp/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vp.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class RateShopperResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RateShopperRequest rateShopperRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public RateShopperResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateShopperResponse)) {
            return false;
        }
        RateShopperResponse rateShopperResponse = (RateShopperResponse) other;
        return this.success == rateShopperResponse.success && Intrinsics.e(this.rateShopperRequest, rateShopperResponse.rateShopperRequest);
    }

    public RateShopperResponse(boolean z10, RateShopperRequest rateShopperRequest) {
        Intrinsics.j(rateShopperRequest, "rateShopperRequest");
        this.success = z10;
        this.rateShopperRequest = rateShopperRequest;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.rateShopperRequest.hashCode();
    }

    public String toString() {
        return "RateShopperResponse(success=" + this.success + ", rateShopperRequest=" + this.rateShopperRequest + ')';
    }

    public /* synthetic */ RateShopperResponse(boolean z10, RateShopperRequest rateShopperRequest, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new RateShopperRequest("", "") : rateShopperRequest);
    }
}
