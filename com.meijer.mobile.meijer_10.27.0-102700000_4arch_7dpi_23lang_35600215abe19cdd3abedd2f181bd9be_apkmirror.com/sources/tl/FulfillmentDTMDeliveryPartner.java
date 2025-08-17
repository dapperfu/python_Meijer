package tl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, d2 = {"Ltl/a;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "partnerEligibility", "fulfillmentEligibility", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentDTMDeliveryPartner {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentDTMDeliveryPartner)) {
            return false;
        }
        FulfillmentDTMDeliveryPartner fulfillmentDTMDeliveryPartner = (FulfillmentDTMDeliveryPartner) other;
        return this.storeId == fulfillmentDTMDeliveryPartner.storeId && Intrinsics.e(this.partnerEligibility, fulfillmentDTMDeliveryPartner.partnerEligibility) && Intrinsics.e(this.fulfillmentEligibility, fulfillmentDTMDeliveryPartner.fulfillmentEligibility);
    }

    public FulfillmentDTMDeliveryPartner(int i10, String partnerEligibility, String str) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        this.storeId = i10;
        this.partnerEligibility = partnerEligibility;
        this.fulfillmentEligibility = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: c, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.storeId) * 31) + this.partnerEligibility.hashCode()) * 31;
        String str = this.fulfillmentEligibility;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FulfillmentDTMDeliveryPartner(storeId=" + this.storeId + ", partnerEligibility=" + this.partnerEligibility + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ')';
    }
}
