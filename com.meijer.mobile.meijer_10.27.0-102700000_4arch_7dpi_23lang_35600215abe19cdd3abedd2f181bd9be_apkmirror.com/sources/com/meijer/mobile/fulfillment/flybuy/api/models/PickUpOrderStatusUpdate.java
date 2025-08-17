package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;", "", "", "eventType", "customerState", "", "orderId", "etaSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderStatusUpdate;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PickUpOrderStatusUpdate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer orderId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer etaSeconds;

    public PickUpOrderStatusUpdate() {
        this(null, null, null, null, 15, null);
    }

    public final PickUpOrderStatusUpdate copy(@g(name = "event_type") String eventType, @g(name = "customer_state") String customerState, @g(name = "order_id") Integer orderId, @g(name = "eta_seconds") Integer etaSeconds) {
        return new PickUpOrderStatusUpdate(eventType, customerState, orderId, etaSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickUpOrderStatusUpdate)) {
            return false;
        }
        PickUpOrderStatusUpdate pickUpOrderStatusUpdate = (PickUpOrderStatusUpdate) other;
        return Intrinsics.e(this.eventType, pickUpOrderStatusUpdate.eventType) && Intrinsics.e(this.customerState, pickUpOrderStatusUpdate.customerState) && Intrinsics.e(this.orderId, pickUpOrderStatusUpdate.orderId) && Intrinsics.e(this.etaSeconds, pickUpOrderStatusUpdate.etaSeconds);
    }

    public int hashCode() {
        String str = this.eventType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerState;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.orderId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.etaSeconds;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "PickUpOrderStatusUpdate(eventType=" + this.eventType + ", customerState=" + this.customerState + ", orderId=" + this.orderId + ", etaSeconds=" + this.etaSeconds + ')';
    }

    public PickUpOrderStatusUpdate(@g(name = "event_type") String str, @g(name = "customer_state") String str2, @g(name = "order_id") Integer num, @g(name = "eta_seconds") Integer num2) {
        this.eventType = str;
        this.customerState = str2;
        this.orderId = num;
        this.etaSeconds = num2;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerState() {
        return this.customerState;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getEtaSeconds() {
        return this.etaSeconds;
    }

    /* renamed from: c, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getOrderId() {
        return this.orderId;
    }

    public /* synthetic */ PickUpOrderStatusUpdate(String str, String str2, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2);
    }
}
