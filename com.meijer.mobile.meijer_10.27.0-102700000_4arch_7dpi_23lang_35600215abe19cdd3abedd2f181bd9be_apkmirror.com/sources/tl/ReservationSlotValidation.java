package tl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltl/e;", "", "", "isReservationSlotActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tl.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ReservationSlotValidation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReservationSlotActive;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReservationSlotValidation) && this.isReservationSlotActive == ((ReservationSlotValidation) other).isReservationSlotActive;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsReservationSlotActive() {
        return this.isReservationSlotActive;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReservationSlotActive);
    }

    public String toString() {
        return "ReservationSlotValidation(isReservationSlotActive=" + this.isReservationSlotActive + ')';
    }

    public ReservationSlotValidation(boolean z10) {
        this.isReservationSlotActive = z10;
    }
}
