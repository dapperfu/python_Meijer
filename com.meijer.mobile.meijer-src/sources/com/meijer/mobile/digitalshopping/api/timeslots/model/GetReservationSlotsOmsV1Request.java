package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV1Request;", "", "", "partnerEligibility", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "facilityId", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "customer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV1Request;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "()Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetReservationSlotsOmsV1Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OmsCustomerRequest customer;

    public final GetReservationSlotsOmsV1Request copy(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customer") OmsCustomerRequest customer) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customer, "customer");
        return new GetReservationSlotsOmsV1Request(partnerEligibility, cartId, facilityId, customer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReservationSlotsOmsV1Request)) {
            return false;
        }
        GetReservationSlotsOmsV1Request getReservationSlotsOmsV1Request = (GetReservationSlotsOmsV1Request) other;
        return Intrinsics.e(this.partnerEligibility, getReservationSlotsOmsV1Request.partnerEligibility) && Intrinsics.e(this.cartId, getReservationSlotsOmsV1Request.cartId) && Intrinsics.e(this.facilityId, getReservationSlotsOmsV1Request.facilityId) && Intrinsics.e(this.customer, getReservationSlotsOmsV1Request.customer);
    }

    public int hashCode() {
        return (((((this.partnerEligibility.hashCode() * 31) + this.cartId.hashCode()) * 31) + this.facilityId.hashCode()) * 31) + this.customer.hashCode();
    }

    public String toString() {
        return "GetReservationSlotsOmsV1Request(partnerEligibility=" + this.partnerEligibility + ", cartId=" + this.cartId + ", facilityId=" + this.facilityId + ", customer=" + this.customer + ')';
    }

    public GetReservationSlotsOmsV1Request(@g(name = "partnerEligibility") String partnerEligibility, @g(name = "cartId") String cartId, @g(name = "facilityId") String facilityId, @g(name = "customer") OmsCustomerRequest customer) {
        Intrinsics.j(partnerEligibility, "partnerEligibility");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(customer, "customer");
        this.partnerEligibility = partnerEligibility;
        this.cartId = cartId;
        this.facilityId = facilityId;
        this.customer = customer;
    }

    /* renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* renamed from: b, reason: from getter */
    public final OmsCustomerRequest getCustomer() {
        return this.customer;
    }

    /* renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: d, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }
}
