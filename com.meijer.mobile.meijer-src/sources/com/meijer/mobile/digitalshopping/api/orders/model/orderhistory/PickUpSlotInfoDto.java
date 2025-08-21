package com.meijer.mobile.digitalshopping.api.orders.model.orderhistory;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJp\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "", "", "activePickupSlotId", "activeSlotTransactionId", "pickUpSlotDay", "", "pickUpSlotIsAvailable", "pickUpSlotDateTime", "pickUpSlotTime", "pickupDate", "pickupSlotId", "scheduleTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "e", "()Z", "f", "g", "h", "i", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PickUpSlotInfoDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activePickupSlotId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotDay;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pickUpSlotIsAvailable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotDateTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupSlotId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheduleTypeId;

    public PickUpSlotInfoDto() {
        this(null, null, null, false, null, null, null, null, null, 511, null);
    }

    public final PickUpSlotInfoDto copy(@g(name = "activePickupSlotId") String activePickupSlotId, @g(name = "activeSlotTransactionId") String activeSlotTransactionId, @g(name = "pickUpSlotDay") String pickUpSlotDay, @g(name = "pickUpSlotIsAvailable") boolean pickUpSlotIsAvailable, @g(name = "pickUpSlotTime") String pickUpSlotDateTime, @g(name = "pickUpSlotTimeString") String pickUpSlotTime, @g(name = "pickUpDate") String pickupDate, @g(name = "pickupSlotId") String pickupSlotId, @g(name = "scheduleTypeId") String scheduleTypeId) {
        Intrinsics.j(activePickupSlotId, "activePickupSlotId");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        Intrinsics.j(pickupSlotId, "pickupSlotId");
        Intrinsics.j(scheduleTypeId, "scheduleTypeId");
        return new PickUpSlotInfoDto(activePickupSlotId, activeSlotTransactionId, pickUpSlotDay, pickUpSlotIsAvailable, pickUpSlotDateTime, pickUpSlotTime, pickupDate, pickupSlotId, scheduleTypeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickUpSlotInfoDto)) {
            return false;
        }
        PickUpSlotInfoDto pickUpSlotInfoDto = (PickUpSlotInfoDto) other;
        return Intrinsics.e(this.activePickupSlotId, pickUpSlotInfoDto.activePickupSlotId) && Intrinsics.e(this.activeSlotTransactionId, pickUpSlotInfoDto.activeSlotTransactionId) && Intrinsics.e(this.pickUpSlotDay, pickUpSlotInfoDto.pickUpSlotDay) && this.pickUpSlotIsAvailable == pickUpSlotInfoDto.pickUpSlotIsAvailable && Intrinsics.e(this.pickUpSlotDateTime, pickUpSlotInfoDto.pickUpSlotDateTime) && Intrinsics.e(this.pickUpSlotTime, pickUpSlotInfoDto.pickUpSlotTime) && Intrinsics.e(this.pickupDate, pickUpSlotInfoDto.pickupDate) && Intrinsics.e(this.pickupSlotId, pickUpSlotInfoDto.pickupSlotId) && Intrinsics.e(this.scheduleTypeId, pickUpSlotInfoDto.scheduleTypeId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.activePickupSlotId.hashCode() * 31) + this.activeSlotTransactionId.hashCode()) * 31) + this.pickUpSlotDay.hashCode()) * 31) + Boolean.hashCode(this.pickUpSlotIsAvailable)) * 31;
        String str = this.pickUpSlotDateTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pickUpSlotTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pickupDate;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.pickupSlotId.hashCode()) * 31) + this.scheduleTypeId.hashCode();
    }

    public String toString() {
        return "PickUpSlotInfoDto(activePickupSlotId=" + this.activePickupSlotId + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", pickUpSlotDay=" + this.pickUpSlotDay + ", pickUpSlotIsAvailable=" + this.pickUpSlotIsAvailable + ", pickUpSlotDateTime=" + this.pickUpSlotDateTime + ", pickUpSlotTime=" + this.pickUpSlotTime + ", pickupDate=" + this.pickupDate + ", pickupSlotId=" + this.pickupSlotId + ", scheduleTypeId=" + this.scheduleTypeId + ')';
    }

    public PickUpSlotInfoDto(@g(name = "activePickupSlotId") String activePickupSlotId, @g(name = "activeSlotTransactionId") String activeSlotTransactionId, @g(name = "pickUpSlotDay") String pickUpSlotDay, @g(name = "pickUpSlotIsAvailable") boolean z10, @g(name = "pickUpSlotTime") String str, @g(name = "pickUpSlotTimeString") String str2, @g(name = "pickUpDate") String str3, @g(name = "pickupSlotId") String pickupSlotId, @g(name = "scheduleTypeId") String scheduleTypeId) {
        Intrinsics.j(activePickupSlotId, "activePickupSlotId");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        Intrinsics.j(pickupSlotId, "pickupSlotId");
        Intrinsics.j(scheduleTypeId, "scheduleTypeId");
        this.activePickupSlotId = activePickupSlotId;
        this.activeSlotTransactionId = activeSlotTransactionId;
        this.pickUpSlotDay = pickUpSlotDay;
        this.pickUpSlotIsAvailable = z10;
        this.pickUpSlotDateTime = str;
        this.pickUpSlotTime = str2;
        this.pickupDate = str3;
        this.pickupSlotId = pickupSlotId;
        this.scheduleTypeId = scheduleTypeId;
    }

    /* renamed from: a, reason: from getter */
    public final String getActivePickupSlotId() {
        return this.activePickupSlotId;
    }

    /* renamed from: b, reason: from getter */
    public final String getActiveSlotTransactionId() {
        return this.activeSlotTransactionId;
    }

    /* renamed from: c, reason: from getter */
    public final String getPickUpSlotDateTime() {
        return this.pickUpSlotDateTime;
    }

    /* renamed from: d, reason: from getter */
    public final String getPickUpSlotDay() {
        return this.pickUpSlotDay;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getPickUpSlotIsAvailable() {
        return this.pickUpSlotIsAvailable;
    }

    /* renamed from: f, reason: from getter */
    public final String getPickUpSlotTime() {
        return this.pickUpSlotTime;
    }

    /* renamed from: g, reason: from getter */
    public final String getPickupDate() {
        return this.pickupDate;
    }

    /* renamed from: h, reason: from getter */
    public final String getPickupSlotId() {
        return this.pickupSlotId;
    }

    /* renamed from: i, reason: from getter */
    public final String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public /* synthetic */ PickUpSlotInfoDto(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? "" : str7, (i10 & 256) != 0 ? "" : str8);
    }
}
