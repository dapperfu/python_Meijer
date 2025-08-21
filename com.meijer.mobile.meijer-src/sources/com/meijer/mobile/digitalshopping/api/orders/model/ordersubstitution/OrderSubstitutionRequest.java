package com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionRequest;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderSubstitutionRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderSubstitutionRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final OrderSubstitutionRequest copy(@g(name = "orderId") String orderId) {
        return new OrderSubstitutionRequest(orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderSubstitutionRequest) && Intrinsics.e(this.orderId, ((OrderSubstitutionRequest) other).orderId);
    }

    public int hashCode() {
        String str = this.orderId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "OrderSubstitutionRequest(orderId=" + this.orderId + ')';
    }

    public OrderSubstitutionRequest(@g(name = "orderId") String str) {
        this.orderId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public /* synthetic */ OrderSubstitutionRequest(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
