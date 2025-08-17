package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0001\u0010\t\u001a\u00060\u0002j\u0002`\u0004¢\u0006\u0004\b\n\u0010\u000bJV\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\f\b\u0003\u0010\t\u001a\u00060\u0002j\u0002`\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001b\u0010\t\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsRequest;", "", "", "partnerEligibility", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "facilityId", "customerId", "partnerCustomerId", "slotId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "f", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ValidateReservationSlotOmsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String slotId;

    public final ValidateReservationSlotOmsRequest copy(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "slotId") String slotId) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(slotId, "slotId");
        return new ValidateReservationSlotOmsRequest(partnerEligibility, cartId, facilityId, customerId, partnerCustomerId, slotId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateReservationSlotOmsRequest)) {
            return false;
        }
        ValidateReservationSlotOmsRequest validateReservationSlotOmsRequest = (ValidateReservationSlotOmsRequest) other;
        return Intrinsics.e(this.partnerEligibility, validateReservationSlotOmsRequest.partnerEligibility) && Intrinsics.e(this.cartId, validateReservationSlotOmsRequest.cartId) && Intrinsics.e(this.facilityId, validateReservationSlotOmsRequest.facilityId) && Intrinsics.e(this.customerId, validateReservationSlotOmsRequest.customerId) && Intrinsics.e(this.partnerCustomerId, validateReservationSlotOmsRequest.partnerCustomerId) && Intrinsics.e(this.slotId, validateReservationSlotOmsRequest.slotId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.partnerEligibility.hashCode() * 31) + this.cartId.hashCode()) * 31) + this.facilityId.hashCode()) * 31) + this.customerId.hashCode()) * 31;
        String str = this.partnerCustomerId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.slotId.hashCode();
    }

    public String toString() {
        return "ValidateReservationSlotOmsRequest(partnerEligibility=" + this.partnerEligibility + ", cartId=" + this.cartId + ", facilityId=" + this.facilityId + ", customerId=" + this.customerId + ", partnerCustomerId=" + this.partnerCustomerId + ", slotId=" + this.slotId + ')';
    }

    public ValidateReservationSlotOmsRequest(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String str, @g(name = "slotId") String slotId) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(slotId, "slotId");
        this.partnerEligibility = partnerEligibility;
        this.cartId = cartId;
        this.facilityId = facilityId;
        this.customerId = customerId;
        this.partnerCustomerId = str;
        this.slotId = slotId;
    }

    /* renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* renamed from: b, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: d, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: e, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: f, reason: from getter */
    public final String getSlotId() {
        return this.slotId;
    }
}
