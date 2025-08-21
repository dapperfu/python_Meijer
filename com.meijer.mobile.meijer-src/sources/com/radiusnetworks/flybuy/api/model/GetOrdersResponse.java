package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "", "data", "", "Lcom/radiusnetworks/flybuy/api/model/Order;", "included", "Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;", "(Ljava/util/List;Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;)V", "getData", "()Ljava/util/List;", "getIncluded", "()Lcom/radiusnetworks/flybuy/api/model/OrdersIncluded;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetOrdersResponse {
    private final List<Order> data;
    private final OrdersIncluded included;

    /* JADX WARN: Multi-variable type inference failed */
    public GetOrdersResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOrdersResponse copy$default(GetOrdersResponse getOrdersResponse, List list, OrdersIncluded ordersIncluded, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getOrdersResponse.data;
        }
        if ((i10 & 2) != 0) {
            ordersIncluded = getOrdersResponse.included;
        }
        return getOrdersResponse.copy(list, ordersIncluded);
    }

    public final List<Order> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final OrdersIncluded getIncluded() {
        return this.included;
    }

    public final GetOrdersResponse copy(List<Order> data, OrdersIncluded included) {
        return new GetOrdersResponse(data, included);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOrdersResponse)) {
            return false;
        }
        GetOrdersResponse getOrdersResponse = (GetOrdersResponse) other;
        return Intrinsics.e(this.data, getOrdersResponse.data) && Intrinsics.e(this.included, getOrdersResponse.included);
    }

    public int hashCode() {
        List<Order> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        OrdersIncluded ordersIncluded = this.included;
        return iHashCode + (ordersIncluded != null ? ordersIncluded.hashCode() : 0);
    }

    public String toString() {
        return "GetOrdersResponse(data=" + this.data + ", included=" + this.included + ')';
    }

    public GetOrdersResponse(List<Order> list, OrdersIncluded ordersIncluded) {
        this.data = list;
        this.included = ordersIncluded;
    }

    public final List<Order> getData() {
        return this.data;
    }

    public final OrdersIncluded getIncluded() {
        return this.included;
    }

    public /* synthetic */ GetOrdersResponse(List list, OrdersIncluded ordersIncluded, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : ordersIncluded);
    }
}
