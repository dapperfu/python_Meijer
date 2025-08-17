package com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0003\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableRequest;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderIsEditCancelableRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    public final OrderIsEditCancelableRequest copy(@g(name = "store_id") int storeId, @g(name = "order_id") String orderId) {
        Intrinsics.j(orderId, "orderId");
        return new OrderIsEditCancelableRequest(storeId, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderIsEditCancelableRequest)) {
            return false;
        }
        OrderIsEditCancelableRequest orderIsEditCancelableRequest = (OrderIsEditCancelableRequest) other;
        return this.storeId == orderIsEditCancelableRequest.storeId && Intrinsics.e(this.orderId, orderIsEditCancelableRequest.orderId);
    }

    public int hashCode() {
        return (Integer.hashCode(this.storeId) * 31) + this.orderId.hashCode();
    }

    public String toString() {
        return "OrderIsEditCancelableRequest(storeId=" + this.storeId + ", orderId=" + this.orderId + ')';
    }

    public OrderIsEditCancelableRequest(@g(name = "store_id") int i10, @g(name = "order_id") String orderId) {
        Intrinsics.j(orderId, "orderId");
        this.storeId = i10;
        this.orderId = orderId;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: b, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }
}
