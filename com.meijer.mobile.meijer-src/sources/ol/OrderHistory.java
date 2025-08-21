package ol;

import Go.SortDescriptor;
import com.meijer.mobile.product.model.search.api.Pagination;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lol/a;", "", "", "Lol/b;", "ordersHistory", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "pagination", "LGo/b;", "sortedOrders", "", "offloadedOrders", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/product/model/search/api/Pagination;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "c", "()Lcom/meijer/mobile/product/model/search/api/Pagination;", "getSortedOrders", "d", "Z", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ol.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderHistory {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderHistoryItem> ordersHistory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pagination pagination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SortDescriptor> sortedOrders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean offloadedOrders;

    public OrderHistory() {
        this(null, null, null, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHistory)) {
            return false;
        }
        OrderHistory orderHistory = (OrderHistory) other;
        return Intrinsics.e(this.ordersHistory, orderHistory.ordersHistory) && Intrinsics.e(this.pagination, orderHistory.pagination) && Intrinsics.e(this.sortedOrders, orderHistory.sortedOrders) && this.offloadedOrders == orderHistory.offloadedOrders;
    }

    public OrderHistory(List<OrderHistoryItem> ordersHistory, Pagination pagination, List<SortDescriptor> sortedOrders, boolean z10) {
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

    public final List<OrderHistoryItem> b() {
        return this.ordersHistory;
    }

    /* renamed from: c, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        return (((((this.ordersHistory.hashCode() * 31) + this.pagination.hashCode()) * 31) + this.sortedOrders.hashCode()) * 31) + Boolean.hashCode(this.offloadedOrders);
    }

    public String toString() {
        return "OrderHistory(ordersHistory=" + this.ordersHistory + ", pagination=" + this.pagination + ", sortedOrders=" + this.sortedOrders + ", offloadedOrders=" + this.offloadedOrders + ')';
    }

    public /* synthetic */ OrderHistory(List list, Pagination pagination, List list2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new Pagination(0, 0, 0, 0, 15, null) : pagination, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? false : z10);
    }
}
