package Xj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006#"}, d2 = {"LXj/t;", "", "", "stepperValue", "quantity", "", "isLoading", "", "unitOfMeasure", "isInTransition", "maxQuantityAllowed", "<init>", "(DDZLjava/lang/String;ZD)V", "a", "(DDZLjava/lang/String;ZD)LXj/t;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "e", "()D", "b", "d", "c", "Z", "h", "()Z", "Ljava/lang/String;", "f", "g", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xj.t, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ValueState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double stepperValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInTransition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxQuantityAllowed;

    public ValueState() {
        this(0.0d, 0.0d, false, null, false, 0.0d, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueState)) {
            return false;
        }
        ValueState valueState = (ValueState) other;
        return Double.compare(this.stepperValue, valueState.stepperValue) == 0 && Double.compare(this.quantity, valueState.quantity) == 0 && this.isLoading == valueState.isLoading && Intrinsics.e(this.unitOfMeasure, valueState.unitOfMeasure) && this.isInTransition == valueState.isInTransition && Double.compare(this.maxQuantityAllowed, valueState.maxQuantityAllowed) == 0;
    }

    public ValueState(double d10, double d11, boolean z10, String unitOfMeasure, boolean z11, double d12) {
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        this.stepperValue = d10;
        this.quantity = d11;
        this.isLoading = z10;
        this.unitOfMeasure = unitOfMeasure;
        this.isInTransition = z11;
        this.maxQuantityAllowed = d12;
    }

    public static /* synthetic */ ValueState b(ValueState valueState, double d10, double d11, boolean z10, String str, boolean z11, double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = valueState.stepperValue;
        }
        double d13 = d10;
        if ((i10 & 2) != 0) {
            d11 = valueState.quantity;
        }
        double d14 = d11;
        if ((i10 & 4) != 0) {
            z10 = valueState.isLoading;
        }
        return valueState.a(d13, d14, z10, (i10 & 8) != 0 ? valueState.unitOfMeasure : str, (i10 & 16) != 0 ? valueState.isInTransition : z11, (i10 & 32) != 0 ? valueState.maxQuantityAllowed : d12);
    }

    public final ValueState a(double stepperValue, double quantity, boolean isLoading, String unitOfMeasure, boolean isInTransition, double maxQuantityAllowed) {
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        return new ValueState(stepperValue, quantity, isLoading, unitOfMeasure, isInTransition, maxQuantityAllowed);
    }

    /* renamed from: c, reason: from getter */
    public final double getMaxQuantityAllowed() {
        return this.maxQuantityAllowed;
    }

    /* renamed from: d, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: e, reason: from getter */
    public final double getStepperValue() {
        return this.stepperValue;
    }

    /* renamed from: f, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsInTransition() {
        return this.isInTransition;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.stepperValue) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.unitOfMeasure.hashCode()) * 31) + Boolean.hashCode(this.isInTransition)) * 31) + Double.hashCode(this.maxQuantityAllowed);
    }

    public String toString() {
        return "ValueState(stepperValue=" + this.stepperValue + ", quantity=" + this.quantity + ", isLoading=" + this.isLoading + ", unitOfMeasure=" + this.unitOfMeasure + ", isInTransition=" + this.isInTransition + ", maxQuantityAllowed=" + this.maxQuantityAllowed + ')';
    }

    public /* synthetic */ ValueState(double d10, double d11, boolean z10, String str, boolean z11, double d12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "Each" : str, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? 2.147483647E9d : d12);
    }
}
