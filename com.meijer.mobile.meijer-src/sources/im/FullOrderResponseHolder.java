package im;

import Co.ProductFullDetails;
import Hl.FlyBuyOrderDetail;
import hj.OrderDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uo.OrderOutOfStockItem;
import xl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJV\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lim/a;", "", "Lhj/c;", "fullOrderDetails", "LHl/b;", "flyBuyResponse", "Lxl/a;", "substitutionOrderDetails", "", "LCo/h;", "substitutionProductDetailsList", "Luo/a;", "listOutOfStockItems", "<init>", "(Lhj/c;LHl/b;Lxl/a;Ljava/util/List;Ljava/util/List;)V", "a", "(Lhj/c;LHl/b;Lxl/a;Ljava/util/List;Ljava/util/List;)Lim/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhj/c;", "d", "()Lhj/c;", "b", "LHl/b;", "c", "()LHl/b;", "Lxl/a;", "f", "()Lxl/a;", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: im.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class FullOrderResponseHolder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDetail fullOrderDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlyBuyOrderDetail flyBuyResponse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderSubstitutionsDetail substitutionOrderDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> substitutionProductDetailsList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderOutOfStockItem> listOutOfStockItems;

    public FullOrderResponseHolder(OrderDetail fullOrderDetails, FlyBuyOrderDetail flyBuyOrderDetail, OrderSubstitutionsDetail orderSubstitutionsDetail, List<ProductFullDetails> list, List<OrderOutOfStockItem> list2) {
        Intrinsics.j(fullOrderDetails, "fullOrderDetails");
        this.fullOrderDetails = fullOrderDetails;
        this.flyBuyResponse = flyBuyOrderDetail;
        this.substitutionOrderDetails = orderSubstitutionsDetail;
        this.substitutionProductDetailsList = list;
        this.listOutOfStockItems = list2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullOrderResponseHolder)) {
            return false;
        }
        FullOrderResponseHolder fullOrderResponseHolder = (FullOrderResponseHolder) other;
        return Intrinsics.e(this.fullOrderDetails, fullOrderResponseHolder.fullOrderDetails) && Intrinsics.e(this.flyBuyResponse, fullOrderResponseHolder.flyBuyResponse) && Intrinsics.e(this.substitutionOrderDetails, fullOrderResponseHolder.substitutionOrderDetails) && Intrinsics.e(this.substitutionProductDetailsList, fullOrderResponseHolder.substitutionProductDetailsList) && Intrinsics.e(this.listOutOfStockItems, fullOrderResponseHolder.listOutOfStockItems);
    }

    public static /* synthetic */ FullOrderResponseHolder b(FullOrderResponseHolder fullOrderResponseHolder, OrderDetail orderDetail, FlyBuyOrderDetail flyBuyOrderDetail, OrderSubstitutionsDetail orderSubstitutionsDetail, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            orderDetail = fullOrderResponseHolder.fullOrderDetails;
        }
        if ((i10 & 2) != 0) {
            flyBuyOrderDetail = fullOrderResponseHolder.flyBuyResponse;
        }
        if ((i10 & 4) != 0) {
            orderSubstitutionsDetail = fullOrderResponseHolder.substitutionOrderDetails;
        }
        if ((i10 & 8) != 0) {
            list = fullOrderResponseHolder.substitutionProductDetailsList;
        }
        if ((i10 & 16) != 0) {
            list2 = fullOrderResponseHolder.listOutOfStockItems;
        }
        List list3 = list2;
        OrderSubstitutionsDetail orderSubstitutionsDetail2 = orderSubstitutionsDetail;
        return fullOrderResponseHolder.a(orderDetail, flyBuyOrderDetail, orderSubstitutionsDetail2, list, list3);
    }

    public final FullOrderResponseHolder a(OrderDetail fullOrderDetails, FlyBuyOrderDetail flyBuyResponse, OrderSubstitutionsDetail substitutionOrderDetails, List<ProductFullDetails> substitutionProductDetailsList, List<OrderOutOfStockItem> listOutOfStockItems) {
        Intrinsics.j(fullOrderDetails, "fullOrderDetails");
        return new FullOrderResponseHolder(fullOrderDetails, flyBuyResponse, substitutionOrderDetails, substitutionProductDetailsList, listOutOfStockItems);
    }

    /* renamed from: c, reason: from getter */
    public final FlyBuyOrderDetail getFlyBuyResponse() {
        return this.flyBuyResponse;
    }

    /* renamed from: d, reason: from getter */
    public final OrderDetail getFullOrderDetails() {
        return this.fullOrderDetails;
    }

    public final List<OrderOutOfStockItem> e() {
        return this.listOutOfStockItems;
    }

    /* renamed from: f, reason: from getter */
    public final OrderSubstitutionsDetail getSubstitutionOrderDetails() {
        return this.substitutionOrderDetails;
    }

    public final List<ProductFullDetails> g() {
        return this.substitutionProductDetailsList;
    }

    public int hashCode() {
        int iHashCode = this.fullOrderDetails.hashCode() * 31;
        FlyBuyOrderDetail flyBuyOrderDetail = this.flyBuyResponse;
        int iHashCode2 = (iHashCode + (flyBuyOrderDetail == null ? 0 : flyBuyOrderDetail.hashCode())) * 31;
        OrderSubstitutionsDetail orderSubstitutionsDetail = this.substitutionOrderDetails;
        int iHashCode3 = (iHashCode2 + (orderSubstitutionsDetail == null ? 0 : orderSubstitutionsDetail.hashCode())) * 31;
        List<ProductFullDetails> list = this.substitutionProductDetailsList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<OrderOutOfStockItem> list2 = this.listOutOfStockItems;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FullOrderResponseHolder(fullOrderDetails=" + this.fullOrderDetails + ", flyBuyResponse=" + this.flyBuyResponse + ", substitutionOrderDetails=" + this.substitutionOrderDetails + ", substitutionProductDetailsList=" + this.substitutionProductDetailsList + ", listOutOfStockItems=" + this.listOutOfStockItems + ')';
    }

    public /* synthetic */ FullOrderResponseHolder(OrderDetail orderDetail, FlyBuyOrderDetail flyBuyOrderDetail, OrderSubstitutionsDetail orderSubstitutionsDetail, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetail, (i10 & 2) != 0 ? null : flyBuyOrderDetail, (i10 & 4) != 0 ? null : orderSubstitutionsDetail, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : list2);
    }
}
