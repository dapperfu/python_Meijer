package ol;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001a\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001d\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001f\u0010-R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u0013¨\u00062"}, d2 = {"Lol/c;", "", "", "activePickupSlotId", "activeSlotTransactionId", "pickUpSlotDay", "", "pickUpSlotIsAvailable", "j$/time/OffsetDateTime", "pickUpSlotDateTime", "j$/time/LocalTime", "pickUpSlotTime", "j$/time/LocalDate", "pickupDate", "pickupSlotId", "scheduleTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/OffsetDateTime;Lj$/time/LocalTime;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getActivePickupSlotId", "b", "getActiveSlotTransactionId", "c", "getPickUpSlotDay", "d", "Z", "getPickUpSlotIsAvailable", "()Z", "e", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "f", "Lj$/time/LocalTime;", "()Lj$/time/LocalTime;", "g", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "h", "getPickupSlotId", "i", "getScheduleTypeId", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ol.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrdersPickUpSlotInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activePickupSlotId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotDay;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pickUpSlotIsAvailable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime pickUpSlotDateTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime pickUpSlotTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate pickupDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupSlotId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheduleTypeId;

    public OrdersPickUpSlotInfo() {
        this(null, null, null, false, null, null, null, null, null, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersPickUpSlotInfo)) {
            return false;
        }
        OrdersPickUpSlotInfo ordersPickUpSlotInfo = (OrdersPickUpSlotInfo) other;
        return Intrinsics.e(this.activePickupSlotId, ordersPickUpSlotInfo.activePickupSlotId) && Intrinsics.e(this.activeSlotTransactionId, ordersPickUpSlotInfo.activeSlotTransactionId) && Intrinsics.e(this.pickUpSlotDay, ordersPickUpSlotInfo.pickUpSlotDay) && this.pickUpSlotIsAvailable == ordersPickUpSlotInfo.pickUpSlotIsAvailable && Intrinsics.e(this.pickUpSlotDateTime, ordersPickUpSlotInfo.pickUpSlotDateTime) && Intrinsics.e(this.pickUpSlotTime, ordersPickUpSlotInfo.pickUpSlotTime) && Intrinsics.e(this.pickupDate, ordersPickUpSlotInfo.pickupDate) && Intrinsics.e(this.pickupSlotId, ordersPickUpSlotInfo.pickupSlotId) && Intrinsics.e(this.scheduleTypeId, ordersPickUpSlotInfo.scheduleTypeId);
    }

    public OrdersPickUpSlotInfo(String activePickupSlotId, String activeSlotTransactionId, String pickUpSlotDay, boolean z10, OffsetDateTime offsetDateTime, LocalTime localTime, LocalDate localDate, String pickupSlotId, String scheduleTypeId) {
        Intrinsics.j(activePickupSlotId, "activePickupSlotId");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        Intrinsics.j(pickupSlotId, "pickupSlotId");
        Intrinsics.j(scheduleTypeId, "scheduleTypeId");
        this.activePickupSlotId = activePickupSlotId;
        this.activeSlotTransactionId = activeSlotTransactionId;
        this.pickUpSlotDay = pickUpSlotDay;
        this.pickUpSlotIsAvailable = z10;
        this.pickUpSlotDateTime = offsetDateTime;
        this.pickUpSlotTime = localTime;
        this.pickupDate = localDate;
        this.pickupSlotId = pickupSlotId;
        this.scheduleTypeId = scheduleTypeId;
    }

    /* renamed from: a, reason: from getter */
    public final OffsetDateTime getPickUpSlotDateTime() {
        return this.pickUpSlotDateTime;
    }

    /* renamed from: b, reason: from getter */
    public final LocalTime getPickUpSlotTime() {
        return this.pickUpSlotTime;
    }

    /* renamed from: c, reason: from getter */
    public final LocalDate getPickupDate() {
        return this.pickupDate;
    }

    public int hashCode() {
        int iHashCode = ((((((this.activePickupSlotId.hashCode() * 31) + this.activeSlotTransactionId.hashCode()) * 31) + this.pickUpSlotDay.hashCode()) * 31) + Boolean.hashCode(this.pickUpSlotIsAvailable)) * 31;
        OffsetDateTime offsetDateTime = this.pickUpSlotDateTime;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        LocalTime localTime = this.pickUpSlotTime;
        int iHashCode3 = (iHashCode2 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        LocalDate localDate = this.pickupDate;
        return ((((iHashCode3 + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.pickupSlotId.hashCode()) * 31) + this.scheduleTypeId.hashCode();
    }

    public String toString() {
        return "OrdersPickUpSlotInfo(activePickupSlotId=" + this.activePickupSlotId + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", pickUpSlotDay=" + this.pickUpSlotDay + ", pickUpSlotIsAvailable=" + this.pickUpSlotIsAvailable + ", pickUpSlotDateTime=" + this.pickUpSlotDateTime + ", pickUpSlotTime=" + this.pickUpSlotTime + ", pickupDate=" + this.pickupDate + ", pickupSlotId=" + this.pickupSlotId + ", scheduleTypeId=" + this.scheduleTypeId + ')';
    }

    public /* synthetic */ OrdersPickUpSlotInfo(String str, String str2, String str3, boolean z10, OffsetDateTime offsetDateTime, LocalTime localTime, LocalDate localDate, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : offsetDateTime, (i10 & 32) != 0 ? null : localTime, (i10 & 64) != 0 ? null : localDate, (i10 & 128) != 0 ? "" : str4, (i10 & 256) != 0 ? "" : str5);
    }
}
