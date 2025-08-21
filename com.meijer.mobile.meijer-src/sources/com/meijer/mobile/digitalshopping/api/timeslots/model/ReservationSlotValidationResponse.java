package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlotValidationResponse;", "", "", "isReservationSlotActive", "<init>", "(Z)V", "copy", "(Z)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlotValidationResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ReservationSlotValidationResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReservationSlotActive;

    public final ReservationSlotValidationResponse copy(@g(name = "isReservationSlotActive") boolean isReservationSlotActive) {
        return new ReservationSlotValidationResponse(isReservationSlotActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReservationSlotValidationResponse) && this.isReservationSlotActive == ((ReservationSlotValidationResponse) other).isReservationSlotActive;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReservationSlotActive);
    }

    public String toString() {
        return "ReservationSlotValidationResponse(isReservationSlotActive=" + this.isReservationSlotActive + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsReservationSlotActive() {
        return this.isReservationSlotActive;
    }

    public ReservationSlotValidationResponse(@g(name = "isReservationSlotActive") boolean z10) {
        this.isReservationSlotActive = z10;
    }
}
