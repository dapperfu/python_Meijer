package mr;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lmr/n;", "", "Lmr/k;", "slot", "", "isSelected", "<init>", "(Lmr/k;Z)V", "a", "(Lmr/k;Z)Lmr/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmr/k;", "c", "()Lmr/k;", "b", "Z", "e", "()Z", "d", "timeSlotText", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.n, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class TimeSlotTimeDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlot slot;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public TimeSlotTimeDecorator(FulfillmentSlot slot, boolean z10) {
        Intrinsics.j(slot, "slot");
        this.slot = slot;
        this.isSelected = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlotTimeDecorator)) {
            return false;
        }
        TimeSlotTimeDecorator timeSlotTimeDecorator = (TimeSlotTimeDecorator) other;
        return Intrinsics.e(this.slot, timeSlotTimeDecorator.slot) && this.isSelected == timeSlotTimeDecorator.isSelected;
    }

    public static /* synthetic */ TimeSlotTimeDecorator b(TimeSlotTimeDecorator timeSlotTimeDecorator, FulfillmentSlot fulfillmentSlot, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fulfillmentSlot = timeSlotTimeDecorator.slot;
        }
        if ((i10 & 2) != 0) {
            z10 = timeSlotTimeDecorator.isSelected;
        }
        return timeSlotTimeDecorator.a(fulfillmentSlot, z10);
    }

    public final TimeSlotTimeDecorator a(FulfillmentSlot slot, boolean isSelected) {
        Intrinsics.j(slot, "slot");
        return new TimeSlotTimeDecorator(slot, isSelected);
    }

    /* renamed from: c, reason: from getter */
    public final FulfillmentSlot getSlot() {
        return this.slot;
    }

    public final String d() {
        return this.slot.getId();
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        return (this.slot.hashCode() * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "TimeSlotTimeDecorator(slot=" + this.slot + ", isSelected=" + this.isSelected + ')';
    }

    public /* synthetic */ TimeSlotTimeDecorator(FulfillmentSlot fulfillmentSlot, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fulfillmentSlot, (i10 & 2) != 0 ? false : z10);
    }
}
