package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "", "", "alcoholEligible", "", "partnerEligibility", "storeId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FulfillmentOptionEligibility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean alcoholEligible;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    public FulfillmentOptionEligibility(@g(name = "alcoholEligible") boolean z10, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "storeId") String str) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        this.alcoholEligible = z10;
        this.partnerEligibility = partnerEligibility;
        this.storeId = str;
    }

    public final FulfillmentOptionEligibility copy(@g(name = "alcoholEligible") boolean alcoholEligible, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "storeId") String storeId) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        return new FulfillmentOptionEligibility(alcoholEligible, partnerEligibility, storeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentOptionEligibility)) {
            return false;
        }
        FulfillmentOptionEligibility fulfillmentOptionEligibility = (FulfillmentOptionEligibility) other;
        return this.alcoholEligible == fulfillmentOptionEligibility.alcoholEligible && Intrinsics.e(this.partnerEligibility, fulfillmentOptionEligibility.partnerEligibility) && Intrinsics.e(this.storeId, fulfillmentOptionEligibility.storeId);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.alcoholEligible) * 31) + this.partnerEligibility.hashCode()) * 31;
        String str = this.storeId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FulfillmentOptionEligibility(alcoholEligible=" + this.alcoholEligible + ", partnerEligibility=" + this.partnerEligibility + ", storeId=" + this.storeId + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAlcoholEligible() {
        return this.alcoholEligible;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: c, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ FulfillmentOptionEligibility(boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, str, (i10 & 4) != 0 ? null : str2);
    }
}
