package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksAvailableRewardCouponsResponse;", "", "availableRewardCoupons", "", "Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "<init>", "(Ljava/util/List;)V", "getAvailableRewardCoupons", "()Ljava/util/List;", "setAvailableRewardCoupons", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksAvailableRewardCouponsResponse {
    private List<AvailableRewardCoupon> availableRewardCoupons;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksAvailableRewardCouponsResponse copy$default(MperksAvailableRewardCouponsResponse mperksAvailableRewardCouponsResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mperksAvailableRewardCouponsResponse.availableRewardCoupons;
        }
        return mperksAvailableRewardCouponsResponse.copy(list);
    }

    public final List<AvailableRewardCoupon> component1() {
        return this.availableRewardCoupons;
    }

    public final MperksAvailableRewardCouponsResponse copy(@g(name = "availableRewardCoupons") List<AvailableRewardCoupon> availableRewardCoupons) {
        Intrinsics.j(availableRewardCoupons, "availableRewardCoupons");
        return new MperksAvailableRewardCouponsResponse(availableRewardCoupons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MperksAvailableRewardCouponsResponse) && Intrinsics.e(this.availableRewardCoupons, ((MperksAvailableRewardCouponsResponse) other).availableRewardCoupons);
    }

    public int hashCode() {
        return this.availableRewardCoupons.hashCode();
    }

    public String toString() {
        return "MperksAvailableRewardCouponsResponse(availableRewardCoupons=" + this.availableRewardCoupons + ')';
    }

    public MperksAvailableRewardCouponsResponse(@g(name = "availableRewardCoupons") List<AvailableRewardCoupon> availableRewardCoupons) {
        Intrinsics.j(availableRewardCoupons, "availableRewardCoupons");
        this.availableRewardCoupons = availableRewardCoupons;
    }

    public final List<AvailableRewardCoupon> getAvailableRewardCoupons() {
        return this.availableRewardCoupons;
    }

    public final void setAvailableRewardCoupons(List<AvailableRewardCoupon> list) {
        Intrinsics.j(list, "<set-?>");
        this.availableRewardCoupons = list;
    }
}
