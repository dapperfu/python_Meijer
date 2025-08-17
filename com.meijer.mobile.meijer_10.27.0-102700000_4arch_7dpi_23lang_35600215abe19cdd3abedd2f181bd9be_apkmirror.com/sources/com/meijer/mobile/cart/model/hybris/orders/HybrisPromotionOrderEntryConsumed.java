package com.meijer.mobile.cart.model.hybris.orders;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionOrderEntryConsumed;", "", "", "adjustedUnitPrice", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "orderEntryNumber", "", "quantity", "<init>", "(DLjava/lang/String;IJ)V", "copy", "(DLjava/lang/String;IJ)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionOrderEntryConsumed;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "c", "I", "d", "J", "()J", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisPromotionOrderEntryConsumed {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double adjustedUnitPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int orderEntryNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    public HybrisPromotionOrderEntryConsumed() {
        this(0.0d, null, 0, 0L, 15, null);
    }

    public final HybrisPromotionOrderEntryConsumed copy(@g(name = "adjustedUnitPrice") double adjustedUnitPrice, @g(name = "code") String code, @g(name = "orderEntryNumber") int orderEntryNumber, @g(name = "quantity") long quantity) {
        Intrinsics.j(code, "code");
        return new HybrisPromotionOrderEntryConsumed(adjustedUnitPrice, code, orderEntryNumber, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPromotionOrderEntryConsumed)) {
            return false;
        }
        HybrisPromotionOrderEntryConsumed hybrisPromotionOrderEntryConsumed = (HybrisPromotionOrderEntryConsumed) other;
        return Double.compare(this.adjustedUnitPrice, hybrisPromotionOrderEntryConsumed.adjustedUnitPrice) == 0 && Intrinsics.e(this.code, hybrisPromotionOrderEntryConsumed.code) && this.orderEntryNumber == hybrisPromotionOrderEntryConsumed.orderEntryNumber && this.quantity == hybrisPromotionOrderEntryConsumed.quantity;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.adjustedUnitPrice) * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.orderEntryNumber)) * 31) + Long.hashCode(this.quantity);
    }

    public String toString() {
        return "HybrisPromotionOrderEntryConsumed(adjustedUnitPrice=" + this.adjustedUnitPrice + ", code=" + this.code + ", orderEntryNumber=" + this.orderEntryNumber + ", quantity=" + this.quantity + ')';
    }

    public HybrisPromotionOrderEntryConsumed(@g(name = "adjustedUnitPrice") double d10, @g(name = "code") String code, @g(name = "orderEntryNumber") int i10, @g(name = "quantity") long j10) {
        Intrinsics.j(code, "code");
        this.adjustedUnitPrice = d10;
        this.code = code;
        this.orderEntryNumber = i10;
        this.quantity = j10;
    }

    /* renamed from: a, reason: from getter */
    public final double getAdjustedUnitPrice() {
        return this.adjustedUnitPrice;
    }

    /* renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final int getOrderEntryNumber() {
        return this.orderEntryNumber;
    }

    /* renamed from: d, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    public /* synthetic */ HybrisPromotionOrderEntryConsumed(double d10, String str, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d10, (i11 & 2) != 0 ? "-1" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0L : j10);
    }
}
