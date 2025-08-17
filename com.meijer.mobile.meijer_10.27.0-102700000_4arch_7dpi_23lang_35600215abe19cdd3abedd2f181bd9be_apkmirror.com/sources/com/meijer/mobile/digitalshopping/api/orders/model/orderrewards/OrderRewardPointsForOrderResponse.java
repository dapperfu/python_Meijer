package com.meijer.mobile.digitalshopping.api.orders.model.orderrewards;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;", "payload", "", "success", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;Ljava/lang/Boolean;)V", "copy", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;Ljava/lang/Boolean;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/Payload;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderRewardPointsForOrderResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Payload payload;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderRewardPointsForOrderResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final OrderRewardPointsForOrderResponse copy(@g(name = "payload") Payload payload, @g(name = "success") Boolean success) {
        return new OrderRewardPointsForOrderResponse(payload, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderRewardPointsForOrderResponse)) {
            return false;
        }
        OrderRewardPointsForOrderResponse orderRewardPointsForOrderResponse = (OrderRewardPointsForOrderResponse) other;
        return Intrinsics.e(this.payload, orderRewardPointsForOrderResponse.payload) && Intrinsics.e(this.success, orderRewardPointsForOrderResponse.success);
    }

    public int hashCode() {
        Payload payload = this.payload;
        int iHashCode = (payload == null ? 0 : payload.hashCode()) * 31;
        Boolean bool = this.success;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "OrderRewardPointsForOrderResponse(payload=" + this.payload + ", success=" + this.success + ')';
    }

    public OrderRewardPointsForOrderResponse(@g(name = "payload") Payload payload, @g(name = "success") Boolean bool) {
        this.payload = payload;
        this.success = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ OrderRewardPointsForOrderResponse(Payload payload, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : payload, (i10 & 2) != 0 ? null : bool);
    }
}
