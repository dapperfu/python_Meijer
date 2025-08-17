package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/PickupDay;", "", "", "date", "", "scheduleType", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;", "reservationSlots", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "copy", "(Ljava/lang/String;ILjava/util/List;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/PickupDay;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PickupDay {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scheduleType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ReservationSlot> reservationSlots;

    public PickupDay(@g(name = "date") String date, @g(name = "scheduleType") int i10, @g(name = "reservationSlots") List<ReservationSlot> reservationSlots) {
        Intrinsics.j(date, "date");
        Intrinsics.j(reservationSlots, "reservationSlots");
        this.date = date;
        this.scheduleType = i10;
        this.reservationSlots = reservationSlots;
    }

    public final PickupDay copy(@g(name = "date") String date, @g(name = "scheduleType") int scheduleType, @g(name = "reservationSlots") List<ReservationSlot> reservationSlots) {
        Intrinsics.j(date, "date");
        Intrinsics.j(reservationSlots, "reservationSlots");
        return new PickupDay(date, scheduleType, reservationSlots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupDay)) {
            return false;
        }
        PickupDay pickupDay = (PickupDay) other;
        return Intrinsics.e(this.date, pickupDay.date) && this.scheduleType == pickupDay.scheduleType && Intrinsics.e(this.reservationSlots, pickupDay.reservationSlots);
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + Integer.hashCode(this.scheduleType)) * 31) + this.reservationSlots.hashCode();
    }

    public String toString() {
        return "PickupDay(date=" + this.date + ", scheduleType=" + this.scheduleType + ", reservationSlots=" + this.reservationSlots + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<ReservationSlot> b() {
        return this.reservationSlots;
    }

    /* renamed from: c, reason: from getter */
    public final int getScheduleType() {
        return this.scheduleType;
    }

    public /* synthetic */ PickupDay(String str, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
