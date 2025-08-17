package com.meijer.mobile.cart.model.hybris.timeslots;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJt\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b$\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012¨\u0006%"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "", "", "activeSlotTransactionId", "pickUpSlotId", "pickUpStartTime", "pickUpEndTime", "pickUpDate", "pickUpSlotTimeZone", "", "pickUpSlotIsAvailable", "scheduleTypeId", "partnerCustomerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "h", "d", "f", "g", "Z", "()Z", "i", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisPickupSlotInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpStartTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpEndTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotTimeZone;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pickUpSlotIsAvailable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheduleTypeId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    public HybrisPickupSlotInfo(@g(name = "activeSlotTransactionId") String activeSlotTransactionId, @g(name = "pickUpSlotId") String pickUpSlotId, @g(name = "pickUpSlotTimeString") String str, @g(name = "pickUpEndTime") String str2, @g(name = "pickUpDate") String str3, @g(name = "pickUpSlotTimeZone") String str4, @g(name = "pickUpSlotIsAvailable") boolean z10, @g(name = "scheduleTypeId") String scheduleTypeId, @g(name = "partnerCustomerId") String str5) {
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        Intrinsics.j(pickUpSlotId, "pickUpSlotId");
        Intrinsics.j(scheduleTypeId, "scheduleTypeId");
        this.activeSlotTransactionId = activeSlotTransactionId;
        this.pickUpSlotId = pickUpSlotId;
        this.pickUpStartTime = str;
        this.pickUpEndTime = str2;
        this.pickUpDate = str3;
        this.pickUpSlotTimeZone = str4;
        this.pickUpSlotIsAvailable = z10;
        this.scheduleTypeId = scheduleTypeId;
        this.partnerCustomerId = str5;
    }

    public final HybrisPickupSlotInfo copy(@g(name = "activeSlotTransactionId") String activeSlotTransactionId, @g(name = "pickUpSlotId") String pickUpSlotId, @g(name = "pickUpSlotTimeString") String pickUpStartTime, @g(name = "pickUpEndTime") String pickUpEndTime, @g(name = "pickUpDate") String pickUpDate, @g(name = "pickUpSlotTimeZone") String pickUpSlotTimeZone, @g(name = "pickUpSlotIsAvailable") boolean pickUpSlotIsAvailable, @g(name = "scheduleTypeId") String scheduleTypeId, @g(name = "partnerCustomerId") String partnerCustomerId) {
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        Intrinsics.j(pickUpSlotId, "pickUpSlotId");
        Intrinsics.j(scheduleTypeId, "scheduleTypeId");
        return new HybrisPickupSlotInfo(activeSlotTransactionId, pickUpSlotId, pickUpStartTime, pickUpEndTime, pickUpDate, pickUpSlotTimeZone, pickUpSlotIsAvailable, scheduleTypeId, partnerCustomerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPickupSlotInfo)) {
            return false;
        }
        HybrisPickupSlotInfo hybrisPickupSlotInfo = (HybrisPickupSlotInfo) other;
        return Intrinsics.e(this.activeSlotTransactionId, hybrisPickupSlotInfo.activeSlotTransactionId) && Intrinsics.e(this.pickUpSlotId, hybrisPickupSlotInfo.pickUpSlotId) && Intrinsics.e(this.pickUpStartTime, hybrisPickupSlotInfo.pickUpStartTime) && Intrinsics.e(this.pickUpEndTime, hybrisPickupSlotInfo.pickUpEndTime) && Intrinsics.e(this.pickUpDate, hybrisPickupSlotInfo.pickUpDate) && Intrinsics.e(this.pickUpSlotTimeZone, hybrisPickupSlotInfo.pickUpSlotTimeZone) && this.pickUpSlotIsAvailable == hybrisPickupSlotInfo.pickUpSlotIsAvailable && Intrinsics.e(this.scheduleTypeId, hybrisPickupSlotInfo.scheduleTypeId) && Intrinsics.e(this.partnerCustomerId, hybrisPickupSlotInfo.partnerCustomerId);
    }

    public int hashCode() {
        int iHashCode = ((this.activeSlotTransactionId.hashCode() * 31) + this.pickUpSlotId.hashCode()) * 31;
        String str = this.pickUpStartTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pickUpEndTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pickUpDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pickUpSlotTimeZone;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.pickUpSlotIsAvailable)) * 31) + this.scheduleTypeId.hashCode()) * 31;
        String str5 = this.partnerCustomerId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPickupSlotInfo(activeSlotTransactionId=" + this.activeSlotTransactionId + ", pickUpSlotId=" + this.pickUpSlotId + ", pickUpStartTime=" + this.pickUpStartTime + ", pickUpEndTime=" + this.pickUpEndTime + ", pickUpDate=" + this.pickUpDate + ", pickUpSlotTimeZone=" + this.pickUpSlotTimeZone + ", pickUpSlotIsAvailable=" + this.pickUpSlotIsAvailable + ", scheduleTypeId=" + this.scheduleTypeId + ", partnerCustomerId=" + this.partnerCustomerId + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getActiveSlotTransactionId() {
        return this.activeSlotTransactionId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: c, reason: from getter */
    public final String getPickUpDate() {
        return this.pickUpDate;
    }

    /* renamed from: d, reason: from getter */
    public final String getPickUpEndTime() {
        return this.pickUpEndTime;
    }

    /* renamed from: e, reason: from getter */
    public final String getPickUpSlotId() {
        return this.pickUpSlotId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getPickUpSlotIsAvailable() {
        return this.pickUpSlotIsAvailable;
    }

    /* renamed from: g, reason: from getter */
    public final String getPickUpSlotTimeZone() {
        return this.pickUpSlotTimeZone;
    }

    /* renamed from: h, reason: from getter */
    public final String getPickUpStartTime() {
        return this.pickUpStartTime;
    }

    /* renamed from: i, reason: from getter */
    public final String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public /* synthetic */ HybrisPickupSlotInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, z10, str7, (i10 & 256) != 0 ? null : str8);
    }
}
