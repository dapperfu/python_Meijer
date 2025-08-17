package com.radiusnetworks.flybuy.sdk.data.order;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003Ji\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/States;", "", "order", "", "", "customer", "orderOpen", "customerOpen", "orderDeferred", "customerDeferred", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCustomer", "()Ljava/util/List;", "getCustomerDeferred", "getCustomerOpen", "getOrder", "getOrderDeferred", "getOrderOpen", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class States {
    private final List<String> customer;
    private final List<String> customerDeferred;
    private final List<String> customerOpen;
    private final List<String> order;
    private final List<String> orderDeferred;
    private final List<String> orderOpen;

    public static /* synthetic */ States copy$default(States states, List list, List list2, List list3, List list4, List list5, List list6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = states.order;
        }
        if ((i10 & 2) != 0) {
            list2 = states.customer;
        }
        if ((i10 & 4) != 0) {
            list3 = states.orderOpen;
        }
        if ((i10 & 8) != 0) {
            list4 = states.customerOpen;
        }
        if ((i10 & 16) != 0) {
            list5 = states.orderDeferred;
        }
        if ((i10 & 32) != 0) {
            list6 = states.customerDeferred;
        }
        List list7 = list5;
        List list8 = list6;
        return states.copy(list, list2, list3, list4, list7, list8);
    }

    public final List<String> component1() {
        return this.order;
    }

    public final List<String> component2() {
        return this.customer;
    }

    public final List<String> component3() {
        return this.orderOpen;
    }

    public final List<String> component4() {
        return this.customerOpen;
    }

    public final List<String> component5() {
        return this.orderDeferred;
    }

    public final List<String> component6() {
        return this.customerDeferred;
    }

    public final States copy(List<String> order, List<String> customer, List<String> orderOpen, List<String> customerOpen, List<String> orderDeferred, List<String> customerDeferred) {
        Intrinsics.j(order, "order");
        Intrinsics.j(customer, "customer");
        Intrinsics.j(orderOpen, "orderOpen");
        Intrinsics.j(customerOpen, "customerOpen");
        Intrinsics.j(orderDeferred, "orderDeferred");
        Intrinsics.j(customerDeferred, "customerDeferred");
        return new States(order, customer, orderOpen, customerOpen, orderDeferred, customerDeferred);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof States)) {
            return false;
        }
        States states = (States) other;
        return Intrinsics.e(this.order, states.order) && Intrinsics.e(this.customer, states.customer) && Intrinsics.e(this.orderOpen, states.orderOpen) && Intrinsics.e(this.customerOpen, states.customerOpen) && Intrinsics.e(this.orderDeferred, states.orderDeferred) && Intrinsics.e(this.customerDeferred, states.customerDeferred);
    }

    public int hashCode() {
        return this.customerDeferred.hashCode() + ((this.orderDeferred.hashCode() + ((this.customerOpen.hashCode() + ((this.orderOpen.hashCode() + ((this.customer.hashCode() + (this.order.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "States(order=" + this.order + ", customer=" + this.customer + ", orderOpen=" + this.orderOpen + ", customerOpen=" + this.customerOpen + ", orderDeferred=" + this.orderDeferred + ", customerDeferred=" + this.customerDeferred + ')';
    }

    public States(List<String> order, List<String> customer, List<String> orderOpen, List<String> customerOpen, List<String> orderDeferred, List<String> customerDeferred) {
        Intrinsics.j(order, "order");
        Intrinsics.j(customer, "customer");
        Intrinsics.j(orderOpen, "orderOpen");
        Intrinsics.j(customerOpen, "customerOpen");
        Intrinsics.j(orderDeferred, "orderDeferred");
        Intrinsics.j(customerDeferred, "customerDeferred");
        this.order = order;
        this.customer = customer;
        this.orderOpen = orderOpen;
        this.customerOpen = customerOpen;
        this.orderDeferred = orderDeferred;
        this.customerDeferred = customerDeferred;
    }

    public final List<String> getCustomer() {
        return this.customer;
    }

    public final List<String> getCustomerDeferred() {
        return this.customerDeferred;
    }

    public final List<String> getCustomerOpen() {
        return this.customerOpen;
    }

    public final List<String> getOrder() {
        return this.order;
    }

    public final List<String> getOrderDeferred() {
        return this.orderDeferred;
    }

    public final List<String> getOrderOpen() {
        return this.orderOpen;
    }
}
