package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001c\u0010\u0010¨\u0006!"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateDtmReservationSlotRequest;", "", "", "partnerEligibility", "cartId", "facilityId", "customerId", "partnerCustomerId", "slotId", "fulfillmentEligibility", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateDtmReservationSlotRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", "d", "e", "f", "h", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ValidateDtmReservationSlotRequest {

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

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    public final ValidateDtmReservationSlotRequest copy(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "slotId") String slotId, @g(name = "fulfillmentEligibility") String fulfillmentEligibility, @g(name = "date") String date) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(partnerCustomerId, "partnerCustomerId");
        Intrinsics.j(slotId, "slotId");
        Intrinsics.j(fulfillmentEligibility, "fulfillmentEligibility");
        Intrinsics.j(date, "date");
        return new ValidateDtmReservationSlotRequest(partnerEligibility, cartId, facilityId, customerId, partnerCustomerId, slotId, fulfillmentEligibility, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateDtmReservationSlotRequest)) {
            return false;
        }
        ValidateDtmReservationSlotRequest validateDtmReservationSlotRequest = (ValidateDtmReservationSlotRequest) other;
        return Intrinsics.e(this.partnerEligibility, validateDtmReservationSlotRequest.partnerEligibility) && Intrinsics.e(this.cartId, validateDtmReservationSlotRequest.cartId) && Intrinsics.e(this.facilityId, validateDtmReservationSlotRequest.facilityId) && Intrinsics.e(this.customerId, validateDtmReservationSlotRequest.customerId) && Intrinsics.e(this.partnerCustomerId, validateDtmReservationSlotRequest.partnerCustomerId) && Intrinsics.e(this.slotId, validateDtmReservationSlotRequest.slotId) && Intrinsics.e(this.fulfillmentEligibility, validateDtmReservationSlotRequest.fulfillmentEligibility) && Intrinsics.e(this.date, validateDtmReservationSlotRequest.date);
    }

    public int hashCode() {
        return (((((((((((((this.partnerEligibility.hashCode() * 31) + this.cartId.hashCode()) * 31) + this.facilityId.hashCode()) * 31) + this.customerId.hashCode()) * 31) + this.partnerCustomerId.hashCode()) * 31) + this.slotId.hashCode()) * 31) + this.fulfillmentEligibility.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "ValidateDtmReservationSlotRequest(partnerEligibility=" + this.partnerEligibility + ", cartId=" + this.cartId + ", facilityId=" + this.facilityId + ", customerId=" + this.customerId + ", partnerCustomerId=" + this.partnerCustomerId + ", slotId=" + this.slotId + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", date=" + this.date + ')';
    }

    public ValidateDtmReservationSlotRequest(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customerId") String customerId, @g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "slotId") String slotId, @g(name = "fulfillmentEligibility") String fulfillmentEligibility, @g(name = "date") String date) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(partnerCustomerId, "partnerCustomerId");
        Intrinsics.j(slotId, "slotId");
        Intrinsics.j(fulfillmentEligibility, "fulfillmentEligibility");
        Intrinsics.j(date, "date");
        this.partnerEligibility = partnerEligibility;
        this.cartId = cartId;
        this.facilityId = facilityId;
        this.customerId = customerId;
        this.partnerCustomerId = partnerCustomerId;
        this.slotId = slotId;
        this.fulfillmentEligibility = fulfillmentEligibility;
        this.date = date;
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
    public final String getDate() {
        return this.date;
    }

    /* renamed from: d, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: e, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: f, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: g, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: h, reason: from getter */
    public final String getSlotId() {
        return this.slotId;
    }
}
