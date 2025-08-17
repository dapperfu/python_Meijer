package fj;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b&\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001\u001eB\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010(R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b\u001e\u00100R\u0011\u0010<\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u00100¨\u0006>"}, d2 = {"Lfj/c;", "", "", "pickUpSlotId", "j$/time/LocalTime", "pickupEndTime", "activePickupSlotId", "pickupStartTime", "j$/time/LocalDate", "pickupDate", "j$/time/ZoneId", "pickupSlotTimeZone", "", "pickUpSlotIsAvailable", "activeSlotTransactionId", "pickUpSlotTime", "pickUpSlotDay", "scheduleTypeId", "pickupSlotDate", "earlyDelivery", "<init>", "(Ljava/lang/String;Lj$/time/LocalTime;Ljava/lang/String;Lj$/time/LocalTime;Lj$/time/LocalDate;Lj$/time/ZoneId;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lj$/time/LocalTime;", "d", "()Lj$/time/LocalTime;", "c", "getActivePickupSlotId", "e", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "f", "Lj$/time/ZoneId;", "getPickupSlotTimeZone", "()Lj$/time/ZoneId;", "g", "Z", "getPickUpSlotIsAvailable", "()Z", "h", "getActiveSlotTransactionId", "i", "getPickUpSlotTime", "j", "getPickUpSlotDay", "k", "getScheduleTypeId", "l", "getPickupSlotDate", "m", "isBopasTimeSlot", "n", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.c, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class PickupSlotInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime pickupEndTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activePickupSlotId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime pickupStartTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate pickupDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZoneId pickupSlotTimeZone;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pickUpSlotIsAvailable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotTime;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotDay;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheduleTypeId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate pickupSlotDate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    public PickupSlotInfo() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupSlotInfo)) {
            return false;
        }
        PickupSlotInfo pickupSlotInfo = (PickupSlotInfo) other;
        return Intrinsics.e(this.pickUpSlotId, pickupSlotInfo.pickUpSlotId) && Intrinsics.e(this.pickupEndTime, pickupSlotInfo.pickupEndTime) && Intrinsics.e(this.activePickupSlotId, pickupSlotInfo.activePickupSlotId) && Intrinsics.e(this.pickupStartTime, pickupSlotInfo.pickupStartTime) && Intrinsics.e(this.pickupDate, pickupSlotInfo.pickupDate) && Intrinsics.e(this.pickupSlotTimeZone, pickupSlotInfo.pickupSlotTimeZone) && this.pickUpSlotIsAvailable == pickupSlotInfo.pickUpSlotIsAvailable && Intrinsics.e(this.activeSlotTransactionId, pickupSlotInfo.activeSlotTransactionId) && Intrinsics.e(this.pickUpSlotTime, pickupSlotInfo.pickUpSlotTime) && Intrinsics.e(this.pickUpSlotDay, pickupSlotInfo.pickUpSlotDay) && Intrinsics.e(this.scheduleTypeId, pickupSlotInfo.scheduleTypeId) && Intrinsics.e(this.pickupSlotDate, pickupSlotInfo.pickupSlotDate) && this.earlyDelivery == pickupSlotInfo.earlyDelivery;
    }

    public PickupSlotInfo(String pickUpSlotId, LocalTime localTime, String str, LocalTime localTime2, LocalDate localDate, ZoneId zoneId, boolean z10, String str2, String str3, String pickUpSlotDay, String str4, LocalDate localDate2, boolean z11) {
        Intrinsics.j(pickUpSlotId, "pickUpSlotId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        this.pickUpSlotId = pickUpSlotId;
        this.pickupEndTime = localTime;
        this.activePickupSlotId = str;
        this.pickupStartTime = localTime2;
        this.pickupDate = localDate;
        this.pickupSlotTimeZone = zoneId;
        this.pickUpSlotIsAvailable = z10;
        this.activeSlotTransactionId = str2;
        this.pickUpSlotTime = str3;
        this.pickUpSlotDay = pickUpSlotDay;
        this.scheduleTypeId = str4;
        this.pickupSlotDate = localDate2;
        this.earlyDelivery = z11;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: b, reason: from getter */
    public final String getPickUpSlotId() {
        return this.pickUpSlotId;
    }

    /* renamed from: c, reason: from getter */
    public final LocalDate getPickupDate() {
        return this.pickupDate;
    }

    /* renamed from: d, reason: from getter */
    public final LocalTime getPickupEndTime() {
        return this.pickupEndTime;
    }

    /* renamed from: e, reason: from getter */
    public final LocalTime getPickupStartTime() {
        return this.pickupStartTime;
    }

    public final boolean f() {
        return Intrinsics.e(StringsKt.J1(this.pickUpSlotId, 3), "999");
    }

    public int hashCode() {
        int iHashCode = this.pickUpSlotId.hashCode() * 31;
        LocalTime localTime = this.pickupEndTime;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str = this.activePickupSlotId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalTime localTime2 = this.pickupStartTime;
        int iHashCode4 = (iHashCode3 + (localTime2 == null ? 0 : localTime2.hashCode())) * 31;
        LocalDate localDate = this.pickupDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ZoneId zoneId = this.pickupSlotTimeZone;
        int iHashCode6 = (((iHashCode5 + (zoneId == null ? 0 : zoneId.hashCode())) * 31) + Boolean.hashCode(this.pickUpSlotIsAvailable)) * 31;
        String str2 = this.activeSlotTransactionId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pickUpSlotTime;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.pickUpSlotDay.hashCode()) * 31;
        String str4 = this.scheduleTypeId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate2 = this.pickupSlotDate;
        return ((iHashCode9 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31) + Boolean.hashCode(this.earlyDelivery);
    }

    public String toString() {
        return "PickupSlotInfo(pickUpSlotId=" + this.pickUpSlotId + ", pickupEndTime=" + this.pickupEndTime + ", activePickupSlotId=" + this.activePickupSlotId + ", pickupStartTime=" + this.pickupStartTime + ", pickupDate=" + this.pickupDate + ", pickupSlotTimeZone=" + this.pickupSlotTimeZone + ", pickUpSlotIsAvailable=" + this.pickUpSlotIsAvailable + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", pickUpSlotTime=" + this.pickUpSlotTime + ", pickUpSlotDay=" + this.pickUpSlotDay + ", scheduleTypeId=" + this.scheduleTypeId + ", pickupSlotDate=" + this.pickupSlotDate + ", earlyDelivery=" + this.earlyDelivery + ')';
    }

    public /* synthetic */ PickupSlotInfo(String str, LocalTime localTime, String str2, LocalTime localTime2, LocalDate localDate, ZoneId zoneId, boolean z10, String str3, String str4, String str5, String str6, LocalDate localDate2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : localTime, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : localTime2, (i10 & 16) != 0 ? null : localDate, (i10 & 32) != 0 ? null : zoneId, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str3, (i10 & 256) != 0 ? null : str4, (i10 & 512) == 0 ? str5 : "", (i10 & 1024) != 0 ? null : str6, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? localDate2 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11);
    }
}
