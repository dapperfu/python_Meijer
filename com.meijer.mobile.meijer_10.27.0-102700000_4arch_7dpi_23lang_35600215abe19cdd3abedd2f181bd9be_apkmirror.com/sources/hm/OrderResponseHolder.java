package hm;

import Gl.FlyBuyOrderDetail;
import gj.OrderDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhm/b;", "", "Lgj/c;", "fullOrderDetails", "LGl/b;", "flyBuyResponse", "<init>", "(Lgj/c;LGl/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/c;", "b", "()Lgj/c;", "LGl/b;", "()LGl/b;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hm.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderResponseHolder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDetail fullOrderDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlyBuyOrderDetail flyBuyResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderResponseHolder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResponseHolder)) {
            return false;
        }
        OrderResponseHolder orderResponseHolder = (OrderResponseHolder) other;
        return Intrinsics.e(this.fullOrderDetails, orderResponseHolder.fullOrderDetails) && Intrinsics.e(this.flyBuyResponse, orderResponseHolder.flyBuyResponse);
    }

    public OrderResponseHolder(OrderDetail orderDetail, FlyBuyOrderDetail flyBuyOrderDetail) {
        this.fullOrderDetails = orderDetail;
        this.flyBuyResponse = flyBuyOrderDetail;
    }

    /* renamed from: a, reason: from getter */
    public final FlyBuyOrderDetail getFlyBuyResponse() {
        return this.flyBuyResponse;
    }

    /* renamed from: b, reason: from getter */
    public final OrderDetail getFullOrderDetails() {
        return this.fullOrderDetails;
    }

    public int hashCode() {
        OrderDetail orderDetail = this.fullOrderDetails;
        int iHashCode = (orderDetail == null ? 0 : orderDetail.hashCode()) * 31;
        FlyBuyOrderDetail flyBuyOrderDetail = this.flyBuyResponse;
        return iHashCode + (flyBuyOrderDetail != null ? flyBuyOrderDetail.hashCode() : 0);
    }

    public String toString() {
        return "OrderResponseHolder(fullOrderDetails=" + this.fullOrderDetails + ", flyBuyResponse=" + this.flyBuyResponse + ')';
    }

    public /* synthetic */ OrderResponseHolder(OrderDetail orderDetail, FlyBuyOrderDetail flyBuyOrderDetail, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : orderDetail, (i10 & 2) != 0 ? null : flyBuyOrderDetail);
    }
}
