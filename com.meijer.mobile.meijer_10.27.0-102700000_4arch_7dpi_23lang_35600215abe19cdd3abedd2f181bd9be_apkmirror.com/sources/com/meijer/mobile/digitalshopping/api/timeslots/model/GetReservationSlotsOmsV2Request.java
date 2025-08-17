package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV2Request;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "customer", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DeliveryPartner;", "deliveryPartners", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV2Request;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "()Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsCustomerRequest;", "c", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GetReservationSlotsOmsV2Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OmsCustomerRequest customer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DeliveryPartner> deliveryPartners;

    public final GetReservationSlotsOmsV2Request copy(@g(name = "cartId") String cartId, @g(name = "customer") OmsCustomerRequest customer, @g(name = "deliveryPartners") List<DeliveryPartner> deliveryPartners) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(customer, "customer");
        Intrinsics.j(deliveryPartners, "deliveryPartners");
        return new GetReservationSlotsOmsV2Request(cartId, customer, deliveryPartners);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReservationSlotsOmsV2Request)) {
            return false;
        }
        GetReservationSlotsOmsV2Request getReservationSlotsOmsV2Request = (GetReservationSlotsOmsV2Request) other;
        return Intrinsics.e(this.cartId, getReservationSlotsOmsV2Request.cartId) && Intrinsics.e(this.customer, getReservationSlotsOmsV2Request.customer) && Intrinsics.e(this.deliveryPartners, getReservationSlotsOmsV2Request.deliveryPartners);
    }

    public int hashCode() {
        return (((this.cartId.hashCode() * 31) + this.customer.hashCode()) * 31) + this.deliveryPartners.hashCode();
    }

    public String toString() {
        return "GetReservationSlotsOmsV2Request(cartId=" + this.cartId + ", customer=" + this.customer + ", deliveryPartners=" + this.deliveryPartners + ')';
    }

    public GetReservationSlotsOmsV2Request(@g(name = "cartId") String cartId, @g(name = "customer") OmsCustomerRequest customer, @g(name = "deliveryPartners") List<DeliveryPartner> deliveryPartners) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(customer, "customer");
        Intrinsics.j(deliveryPartners, "deliveryPartners");
        this.cartId = cartId;
        this.customer = customer;
        this.deliveryPartners = deliveryPartners;
    }

    /* renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* renamed from: b, reason: from getter */
    public final OmsCustomerRequest getCustomer() {
        return this.customer;
    }

    public final List<DeliveryPartner> c() {
        return this.deliveryPartners;
    }
}
