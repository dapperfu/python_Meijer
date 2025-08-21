package hj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lhj/h;", "", "", "adjustedUnitPrice", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "orderEntryNumber", "", "quantity", "<init>", "(DLjava/lang/String;IJ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getAdjustedUnitPrice", "()D", "b", "Ljava/lang/String;", "getCode", "c", "I", "getOrderEntryNumber", "d", "J", "getQuantity", "()J", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.h, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PromotionOrderEntryConsumed {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double adjustedUnitPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int orderEntryNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    public PromotionOrderEntryConsumed() {
        this(0.0d, null, 0, 0L, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionOrderEntryConsumed)) {
            return false;
        }
        PromotionOrderEntryConsumed promotionOrderEntryConsumed = (PromotionOrderEntryConsumed) other;
        return Double.compare(this.adjustedUnitPrice, promotionOrderEntryConsumed.adjustedUnitPrice) == 0 && Intrinsics.e(this.code, promotionOrderEntryConsumed.code) && this.orderEntryNumber == promotionOrderEntryConsumed.orderEntryNumber && this.quantity == promotionOrderEntryConsumed.quantity;
    }

    public PromotionOrderEntryConsumed(double d10, String code, int i10, long j10) {
        Intrinsics.j(code, "code");
        this.adjustedUnitPrice = d10;
        this.code = code;
        this.orderEntryNumber = i10;
        this.quantity = j10;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.adjustedUnitPrice) * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.orderEntryNumber)) * 31) + Long.hashCode(this.quantity);
    }

    public String toString() {
        return "PromotionOrderEntryConsumed(adjustedUnitPrice=" + this.adjustedUnitPrice + ", code=" + this.code + ", orderEntryNumber=" + this.orderEntryNumber + ", quantity=" + this.quantity + ')';
    }

    public /* synthetic */ PromotionOrderEntryConsumed(double d10, String str, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d10, (i11 & 2) != 0 ? "-1" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0L : j10);
    }
}
