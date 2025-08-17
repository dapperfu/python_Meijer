package com.meijer.mobile.digitalshopping.api.orders.model.orderhistory;

import com.meijer.mobile.product.model.hybris.api.models.search.HybrisSortDescriptor;
import com.meijer.mobile.product.model.search.api.Pagination;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;", "", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "ordersHistory", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "pagination", "Lcom/meijer/mobile/product/model/hybris/api/models/search/HybrisSortDescriptor;", "sortedOrders", "", "offloadedOrders", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/product/model/search/api/Pagination;Ljava/util/List;Z)V", "copy", "(Ljava/util/List;Lcom/meijer/mobile/product/model/search/api/Pagination;Ljava/util/List;Z)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "c", "()Lcom/meijer/mobile/product/model/search/api/Pagination;", "d", "Z", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderHistoryResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderHistoryItemDto> ordersHistory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pagination pagination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisSortDescriptor> sortedOrders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean offloadedOrders;

    public OrderHistoryResponse() {
        this(null, null, null, false, 15, null);
    }

    public final OrderHistoryResponse copy(@g(name = "orders") List<OrderHistoryItemDto> ordersHistory, @g(name = "pagination") Pagination pagination, @g(name = "sorts") List<HybrisSortDescriptor> sortedOrders, @g(name = "offloadedOrders") boolean offloadedOrders) {
        Intrinsics.j(ordersHistory, "ordersHistory");
        Intrinsics.j(pagination, "pagination");
        Intrinsics.j(sortedOrders, "sortedOrders");
        return new OrderHistoryResponse(ordersHistory, pagination, sortedOrders, offloadedOrders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHistoryResponse)) {
            return false;
        }
        OrderHistoryResponse orderHistoryResponse = (OrderHistoryResponse) other;
        return Intrinsics.e(this.ordersHistory, orderHistoryResponse.ordersHistory) && Intrinsics.e(this.pagination, orderHistoryResponse.pagination) && Intrinsics.e(this.sortedOrders, orderHistoryResponse.sortedOrders) && this.offloadedOrders == orderHistoryResponse.offloadedOrders;
    }

    public int hashCode() {
        return (((((this.ordersHistory.hashCode() * 31) + this.pagination.hashCode()) * 31) + this.sortedOrders.hashCode()) * 31) + Boolean.hashCode(this.offloadedOrders);
    }

    public String toString() {
        return "OrderHistoryResponse(ordersHistory=" + this.ordersHistory + ", pagination=" + this.pagination + ", sortedOrders=" + this.sortedOrders + ", offloadedOrders=" + this.offloadedOrders + ')';
    }

    public OrderHistoryResponse(@g(name = "orders") List<OrderHistoryItemDto> ordersHistory, @g(name = "pagination") Pagination pagination, @g(name = "sorts") List<HybrisSortDescriptor> sortedOrders, @g(name = "offloadedOrders") boolean z10) {
        Intrinsics.j(ordersHistory, "ordersHistory");
        Intrinsics.j(pagination, "pagination");
        Intrinsics.j(sortedOrders, "sortedOrders");
        this.ordersHistory = ordersHistory;
        this.pagination = pagination;
        this.sortedOrders = sortedOrders;
        this.offloadedOrders = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getOffloadedOrders() {
        return this.offloadedOrders;
    }

    public final List<OrderHistoryItemDto> b() {
        return this.ordersHistory;
    }

    /* renamed from: c, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final List<HybrisSortDescriptor> d() {
        return this.sortedOrders;
    }

    public /* synthetic */ OrderHistoryResponse(List list, Pagination pagination, List list2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new Pagination(0, 0, 0, 0, 15, null) : pagination, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? false : z10);
    }
}
