package Hh;

import Uh.OrderCardEmptyOrErrorStateDecorator;
import Uh.OrderStatusCardDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nl.OrderHistoryItem;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"LHh/n;", "", "", "isLoading", "", "Lnl/b;", "orderHistory", "LUh/c;", "orderStatusCardDecorator", "LUh/b;", "orderCardEmptyOrErrorStateDecorator", "<init>", "(ZLjava/util/List;LUh/c;LUh/b;)V", "a", "(ZLjava/util/List;LUh/c;LUh/b;)LHh/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "LUh/c;", "e", "()LUh/c;", "LUh/b;", "()LUh/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hh.n, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class OrdersCardViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderHistoryItem> orderHistory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderStatusCardDecorator orderStatusCardDecorator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator;

    public OrdersCardViewState() {
        this(false, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersCardViewState)) {
            return false;
        }
        OrdersCardViewState ordersCardViewState = (OrdersCardViewState) other;
        return this.isLoading == ordersCardViewState.isLoading && Intrinsics.e(this.orderHistory, ordersCardViewState.orderHistory) && Intrinsics.e(this.orderStatusCardDecorator, ordersCardViewState.orderStatusCardDecorator) && Intrinsics.e(this.orderCardEmptyOrErrorStateDecorator, ordersCardViewState.orderCardEmptyOrErrorStateDecorator);
    }

    public OrdersCardViewState(boolean z10, List<OrderHistoryItem> list, OrderStatusCardDecorator orderStatusCardDecorator, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator) {
        this.isLoading = z10;
        this.orderHistory = list;
        this.orderStatusCardDecorator = orderStatusCardDecorator;
        this.orderCardEmptyOrErrorStateDecorator = orderCardEmptyOrErrorStateDecorator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrdersCardViewState b(OrdersCardViewState ordersCardViewState, boolean z10, List list, OrderStatusCardDecorator orderStatusCardDecorator, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ordersCardViewState.isLoading;
        }
        if ((i10 & 2) != 0) {
            list = ordersCardViewState.orderHistory;
        }
        if ((i10 & 4) != 0) {
            orderStatusCardDecorator = ordersCardViewState.orderStatusCardDecorator;
        }
        if ((i10 & 8) != 0) {
            orderCardEmptyOrErrorStateDecorator = ordersCardViewState.orderCardEmptyOrErrorStateDecorator;
        }
        return ordersCardViewState.a(z10, list, orderStatusCardDecorator, orderCardEmptyOrErrorStateDecorator);
    }

    public final OrdersCardViewState a(boolean isLoading, List<OrderHistoryItem> orderHistory, OrderStatusCardDecorator orderStatusCardDecorator, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator) {
        return new OrdersCardViewState(isLoading, orderHistory, orderStatusCardDecorator, orderCardEmptyOrErrorStateDecorator);
    }

    /* renamed from: c, reason: from getter */
    public final OrderCardEmptyOrErrorStateDecorator getOrderCardEmptyOrErrorStateDecorator() {
        return this.orderCardEmptyOrErrorStateDecorator;
    }

    public final List<OrderHistoryItem> d() {
        return this.orderHistory;
    }

    /* renamed from: e, reason: from getter */
    public final OrderStatusCardDecorator getOrderStatusCardDecorator() {
        return this.orderStatusCardDecorator;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        List<OrderHistoryItem> list = this.orderHistory;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        OrderStatusCardDecorator orderStatusCardDecorator = this.orderStatusCardDecorator;
        int iHashCode3 = (iHashCode2 + (orderStatusCardDecorator == null ? 0 : orderStatusCardDecorator.hashCode())) * 31;
        OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator = this.orderCardEmptyOrErrorStateDecorator;
        return iHashCode3 + (orderCardEmptyOrErrorStateDecorator != null ? orderCardEmptyOrErrorStateDecorator.hashCode() : 0);
    }

    public String toString() {
        return "OrdersCardViewState(isLoading=" + this.isLoading + ", orderHistory=" + this.orderHistory + ", orderStatusCardDecorator=" + this.orderStatusCardDecorator + ", orderCardEmptyOrErrorStateDecorator=" + this.orderCardEmptyOrErrorStateDecorator + ')';
    }

    public /* synthetic */ OrdersCardViewState(boolean z10, List list, OrderStatusCardDecorator orderStatusCardDecorator, OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : orderStatusCardDecorator, (i10 & 8) != 0 ? null : orderCardEmptyOrErrorStateDecorator);
    }
}
