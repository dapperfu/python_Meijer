package com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable;

import com.meijer.mobile.core.util.moshi.Stringable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "message", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderIsEditCancelableResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean status;

    public final OrderIsEditCancelableResponse copy(@g(name = "orderId") String orderId, @g(name = "message") String message, @g(name = "status") @Stringable boolean status) {
        Intrinsics.j(orderId, "orderId");
        return new OrderIsEditCancelableResponse(orderId, message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderIsEditCancelableResponse)) {
            return false;
        }
        OrderIsEditCancelableResponse orderIsEditCancelableResponse = (OrderIsEditCancelableResponse) other;
        return Intrinsics.e(this.orderId, orderIsEditCancelableResponse.orderId) && Intrinsics.e(this.message, orderIsEditCancelableResponse.message) && this.status == orderIsEditCancelableResponse.status;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.message;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.status);
    }

    public String toString() {
        return "OrderIsEditCancelableResponse(orderId=" + this.orderId + ", message=" + this.message + ", status=" + this.status + ')';
    }

    public OrderIsEditCancelableResponse(@g(name = "orderId") String orderId, @g(name = "message") String str, @g(name = "status") @Stringable boolean z10) {
        Intrinsics.j(orderId, "orderId");
        this.orderId = orderId;
        this.message = str;
        this.status = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }
}
