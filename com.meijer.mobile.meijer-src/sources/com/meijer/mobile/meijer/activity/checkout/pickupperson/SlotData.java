package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import j$.time.LocalDate;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/P;", "", "j$/time/LocalDate", "date", "j$/time/LocalTime", "startTime", "endTime", "<init>", "(Lj$/time/LocalDate;Lj$/time/LocalTime;Lj$/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "b", "Lj$/time/LocalTime;", "c", "()Lj$/time/LocalTime;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.P, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class SlotData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime endTime;

    public SlotData() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotData)) {
            return false;
        }
        SlotData slotData = (SlotData) other;
        return Intrinsics.e(this.date, slotData.date) && Intrinsics.e(this.startTime, slotData.startTime) && Intrinsics.e(this.endTime, slotData.endTime);
    }

    public int hashCode() {
        LocalDate localDate = this.date;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalTime localTime = this.startTime;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        LocalTime localTime2 = this.endTime;
        return iHashCode2 + (localTime2 != null ? localTime2.hashCode() : 0);
    }

    public String toString() {
        return "SlotData(date=" + this.date + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    public SlotData(LocalDate localDate, LocalTime localTime, LocalTime localTime2) {
        this.date = localDate;
        this.startTime = localTime;
        this.endTime = localTime2;
    }

    /* renamed from: a, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final LocalTime getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final LocalTime getStartTime() {
        return this.startTime;
    }

    public /* synthetic */ SlotData(LocalDate localDate, LocalTime localTime, LocalTime localTime2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? LocalDate.now() : localDate, (i10 & 2) != 0 ? LocalTime.now() : localTime, (i10 & 4) != 0 ? LocalTime.now() : localTime2);
    }
}
