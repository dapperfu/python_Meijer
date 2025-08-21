package mr;

import j$.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmr/j;", "", "j$/time/LocalDate", "date", "", "Lmr/k;", "fulfillmentSlots", "<init>", "(Lj$/time/LocalDate;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "b", "Ljava/util/List;", "getFulfillmentSlots", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.j, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class FulfillmentDay {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentSlot> fulfillmentSlots;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentDay)) {
            return false;
        }
        FulfillmentDay fulfillmentDay = (FulfillmentDay) other;
        return Intrinsics.e(this.date, fulfillmentDay.date) && Intrinsics.e(this.fulfillmentSlots, fulfillmentDay.fulfillmentSlots);
    }

    public FulfillmentDay(LocalDate date, List<FulfillmentSlot> fulfillmentSlots) {
        Intrinsics.j(date, "date");
        Intrinsics.j(fulfillmentSlots, "fulfillmentSlots");
        this.date = date;
        this.fulfillmentSlots = fulfillmentSlots;
    }

    /* renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.fulfillmentSlots.hashCode();
    }

    public String toString() {
        return "FulfillmentDay(date=" + this.date + ", fulfillmentSlots=" + this.fulfillmentSlots + ')';
    }
}
