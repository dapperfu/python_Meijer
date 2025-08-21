package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "", "data", "Lcom/radiusnetworks/flybuy/api/model/Order;", "included", "Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;", "(Lcom/radiusnetworks/flybuy/api/model/Order;Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;)V", "getData", "()Lcom/radiusnetworks/flybuy/api/model/Order;", "getIncluded", "()Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderResponse {
    private final Order data;
    private final OrdersIncluded included;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrderResponse copy$default(OrderResponse orderResponse, Order order, OrdersIncluded ordersIncluded, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            order = orderResponse.data;
        }
        if ((i10 & 2) != 0) {
            ordersIncluded = orderResponse.included;
        }
        return orderResponse.copy(order, ordersIncluded);
    }

    /* renamed from: component1, reason: from getter */
    public final Order getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final OrdersIncluded getIncluded() {
        return this.included;
    }

    public final OrderResponse copy(Order data, OrdersIncluded included) {
        return new OrderResponse(data, included);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResponse)) {
            return false;
        }
        OrderResponse orderResponse = (OrderResponse) other;
        return Intrinsics.e(this.data, orderResponse.data) && Intrinsics.e(this.included, orderResponse.included);
    }

    public int hashCode() {
        Order order = this.data;
        int iHashCode = (order == null ? 0 : order.hashCode()) * 31;
        OrdersIncluded ordersIncluded = this.included;
        return iHashCode + (ordersIncluded != null ? ordersIncluded.hashCode() : 0);
    }

    public String toString() {
        return "OrderResponse(data=" + this.data + ", included=" + this.included + ')';
    }

    public OrderResponse(Order order, OrdersIncluded ordersIncluded) {
        this.data = order;
        this.included = ordersIncluded;
    }

    public final Order getData() {
        return this.data;
    }

    public final OrdersIncluded getIncluded() {
        return this.included;
    }

    public /* synthetic */ OrderResponse(Order order, OrdersIncluded ordersIncluded, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : order, (i10 & 2) != 0 ? null : ordersIncluded);
    }
}
