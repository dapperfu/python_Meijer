package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/FulfillmentSlotRequest;", "", "", "storeId", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/TimeSlotsRequestDeliveryAddress;", "deliveryAddress", "", "fulfillmentType", "", "curbsideEligible", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/LineItem;", "lineItems", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/TimeSlotsRequestDeliveryAddress;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/TimeSlotsRequestDeliveryAddress;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/FulfillmentSlotRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/TimeSlotsRequestDeliveryAddress;", "()Lcom/meijer/mobile/digitalshopping/api/timeslots/model/TimeSlotsRequestDeliveryAddress;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentSlotRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TimeSlotsRequestDeliveryAddress deliveryAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fulfillmentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean curbsideEligible;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LineItem> lineItems;

    public FulfillmentSlotRequest(@g(name = "storeId") String storeId, @g(name = "deliveryAddress") TimeSlotsRequestDeliveryAddress timeSlotsRequestDeliveryAddress, @g(name = "fulfillmentType") Integer num, @g(name = "curbsideEligible") Boolean bool, @g(name = "lineItems") List<LineItem> lineItems) {
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(lineItems, "lineItems");
        this.storeId = storeId;
        this.deliveryAddress = timeSlotsRequestDeliveryAddress;
        this.fulfillmentType = num;
        this.curbsideEligible = bool;
        this.lineItems = lineItems;
    }

    public final FulfillmentSlotRequest copy(@g(name = "storeId") String storeId, @g(name = "deliveryAddress") TimeSlotsRequestDeliveryAddress deliveryAddress, @g(name = "fulfillmentType") Integer fulfillmentType, @g(name = "curbsideEligible") Boolean curbsideEligible, @g(name = "lineItems") List<LineItem> lineItems) {
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(lineItems, "lineItems");
        return new FulfillmentSlotRequest(storeId, deliveryAddress, fulfillmentType, curbsideEligible, lineItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotRequest)) {
            return false;
        }
        FulfillmentSlotRequest fulfillmentSlotRequest = (FulfillmentSlotRequest) other;
        return Intrinsics.e(this.storeId, fulfillmentSlotRequest.storeId) && Intrinsics.e(this.deliveryAddress, fulfillmentSlotRequest.deliveryAddress) && Intrinsics.e(this.fulfillmentType, fulfillmentSlotRequest.fulfillmentType) && Intrinsics.e(this.curbsideEligible, fulfillmentSlotRequest.curbsideEligible) && Intrinsics.e(this.lineItems, fulfillmentSlotRequest.lineItems);
    }

    public int hashCode() {
        int iHashCode = this.storeId.hashCode() * 31;
        TimeSlotsRequestDeliveryAddress timeSlotsRequestDeliveryAddress = this.deliveryAddress;
        int iHashCode2 = (iHashCode + (timeSlotsRequestDeliveryAddress == null ? 0 : timeSlotsRequestDeliveryAddress.hashCode())) * 31;
        Integer num = this.fulfillmentType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.curbsideEligible;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.lineItems.hashCode();
    }

    public String toString() {
        return "FulfillmentSlotRequest(storeId=" + this.storeId + ", deliveryAddress=" + this.deliveryAddress + ", fulfillmentType=" + this.fulfillmentType + ", curbsideEligible=" + this.curbsideEligible + ", lineItems=" + this.lineItems + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getCurbsideEligible() {
        return this.curbsideEligible;
    }

    /* renamed from: b, reason: from getter */
    public final TimeSlotsRequestDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getFulfillmentType() {
        return this.fulfillmentType;
    }

    public final List<LineItem> d() {
        return this.lineItems;
    }

    /* renamed from: e, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ FulfillmentSlotRequest(String str, TimeSlotsRequestDeliveryAddress timeSlotsRequestDeliveryAddress, Integer num, Boolean bool, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : timeSlotsRequestDeliveryAddress, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? CollectionsKt.m() : list);
    }
}
