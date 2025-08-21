package com.meijer.mobile.cart.model.hybris.checkout;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J¤\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b+\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b,\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b\"\u0010*¨\u0006-"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "", "", "pickUpSlotId", "pickUpEndTimeString", "activePickupSlotId", "pickUpSlotTimeString", "pickUpDateString", "pickUpSlotTimeZoneString", "", "pickUpSlotIsAvailable", "activeSlotTransactionId", "pickUpSlotTime", "pickUpSlotDay", "scheduleTypeId", "pickUpSlotDateString", "earlyDelivery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "e", "c", "d", "k", "f", "l", "g", "Z", "i", "()Z", "j", "m", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisPickupSlotInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpEndTimeString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activePickupSlotId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotTimeString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpDateString;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickUpSlotTimeZoneString;

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
    private final String pickUpSlotDateString;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    public HybrisPickupSlotInfo() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null);
    }

    public final HybrisPickupSlotInfo copy(@g(name = "pickUpSlotId") String pickUpSlotId, @g(name = "pickUpEndTime") String pickUpEndTimeString, @g(name = "activePickupSlotId") String activePickupSlotId, @g(name = "pickUpSlotTimeString") String pickUpSlotTimeString, @g(name = "pickUpDate") String pickUpDateString, @g(name = "pickUpSlotTimeZone") String pickUpSlotTimeZoneString, @g(name = "pickUpSlotIsAvailable") boolean pickUpSlotIsAvailable, @g(name = "activeSlotTransactionId") String activeSlotTransactionId, @g(name = "pickUpSlotTime") String pickUpSlotTime, @g(name = "pickUpSlotDay") String pickUpSlotDay, @g(name = "scheduleTypeId") String scheduleTypeId, @g(name = "pickUpSlotDateString") String pickUpSlotDateString, @g(name = "earlyDelivery") boolean earlyDelivery) {
        Intrinsics.j(pickUpSlotId, "pickUpSlotId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        return new HybrisPickupSlotInfo(pickUpSlotId, pickUpEndTimeString, activePickupSlotId, pickUpSlotTimeString, pickUpDateString, pickUpSlotTimeZoneString, pickUpSlotIsAvailable, activeSlotTransactionId, pickUpSlotTime, pickUpSlotDay, scheduleTypeId, pickUpSlotDateString, earlyDelivery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPickupSlotInfo)) {
            return false;
        }
        HybrisPickupSlotInfo hybrisPickupSlotInfo = (HybrisPickupSlotInfo) other;
        return Intrinsics.e(this.pickUpSlotId, hybrisPickupSlotInfo.pickUpSlotId) && Intrinsics.e(this.pickUpEndTimeString, hybrisPickupSlotInfo.pickUpEndTimeString) && Intrinsics.e(this.activePickupSlotId, hybrisPickupSlotInfo.activePickupSlotId) && Intrinsics.e(this.pickUpSlotTimeString, hybrisPickupSlotInfo.pickUpSlotTimeString) && Intrinsics.e(this.pickUpDateString, hybrisPickupSlotInfo.pickUpDateString) && Intrinsics.e(this.pickUpSlotTimeZoneString, hybrisPickupSlotInfo.pickUpSlotTimeZoneString) && this.pickUpSlotIsAvailable == hybrisPickupSlotInfo.pickUpSlotIsAvailable && Intrinsics.e(this.activeSlotTransactionId, hybrisPickupSlotInfo.activeSlotTransactionId) && Intrinsics.e(this.pickUpSlotTime, hybrisPickupSlotInfo.pickUpSlotTime) && Intrinsics.e(this.pickUpSlotDay, hybrisPickupSlotInfo.pickUpSlotDay) && Intrinsics.e(this.scheduleTypeId, hybrisPickupSlotInfo.scheduleTypeId) && Intrinsics.e(this.pickUpSlotDateString, hybrisPickupSlotInfo.pickUpSlotDateString) && this.earlyDelivery == hybrisPickupSlotInfo.earlyDelivery;
    }

    public int hashCode() {
        int iHashCode = this.pickUpSlotId.hashCode() * 31;
        String str = this.pickUpEndTimeString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activePickupSlotId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pickUpSlotTimeString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pickUpDateString;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pickUpSlotTimeZoneString;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.pickUpSlotIsAvailable)) * 31;
        String str6 = this.activeSlotTransactionId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pickUpSlotTime;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.pickUpSlotDay.hashCode()) * 31;
        String str8 = this.scheduleTypeId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pickUpSlotDateString;
        return ((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + Boolean.hashCode(this.earlyDelivery);
    }

    public String toString() {
        return "HybrisPickupSlotInfo(pickUpSlotId=" + this.pickUpSlotId + ", pickUpEndTimeString=" + this.pickUpEndTimeString + ", activePickupSlotId=" + this.activePickupSlotId + ", pickUpSlotTimeString=" + this.pickUpSlotTimeString + ", pickUpDateString=" + this.pickUpDateString + ", pickUpSlotTimeZoneString=" + this.pickUpSlotTimeZoneString + ", pickUpSlotIsAvailable=" + this.pickUpSlotIsAvailable + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", pickUpSlotTime=" + this.pickUpSlotTime + ", pickUpSlotDay=" + this.pickUpSlotDay + ", scheduleTypeId=" + this.scheduleTypeId + ", pickUpSlotDateString=" + this.pickUpSlotDateString + ", earlyDelivery=" + this.earlyDelivery + ')';
    }

    public HybrisPickupSlotInfo(@g(name = "pickUpSlotId") String pickUpSlotId, @g(name = "pickUpEndTime") String str, @g(name = "activePickupSlotId") String str2, @g(name = "pickUpSlotTimeString") String str3, @g(name = "pickUpDate") String str4, @g(name = "pickUpSlotTimeZone") String str5, @g(name = "pickUpSlotIsAvailable") boolean z10, @g(name = "activeSlotTransactionId") String str6, @g(name = "pickUpSlotTime") String str7, @g(name = "pickUpSlotDay") String pickUpSlotDay, @g(name = "scheduleTypeId") String str8, @g(name = "pickUpSlotDateString") String str9, @g(name = "earlyDelivery") boolean z11) {
        Intrinsics.j(pickUpSlotId, "pickUpSlotId");
        Intrinsics.j(pickUpSlotDay, "pickUpSlotDay");
        this.pickUpSlotId = pickUpSlotId;
        this.pickUpEndTimeString = str;
        this.activePickupSlotId = str2;
        this.pickUpSlotTimeString = str3;
        this.pickUpDateString = str4;
        this.pickUpSlotTimeZoneString = str5;
        this.pickUpSlotIsAvailable = z10;
        this.activeSlotTransactionId = str6;
        this.pickUpSlotTime = str7;
        this.pickUpSlotDay = pickUpSlotDay;
        this.scheduleTypeId = str8;
        this.pickUpSlotDateString = str9;
        this.earlyDelivery = z11;
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
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: d, reason: from getter */
    public final String getPickUpDateString() {
        return this.pickUpDateString;
    }

    /* renamed from: e, reason: from getter */
    public final String getPickUpEndTimeString() {
        return this.pickUpEndTimeString;
    }

    /* renamed from: f, reason: from getter */
    public final String getPickUpSlotDateString() {
        return this.pickUpSlotDateString;
    }

    /* renamed from: g, reason: from getter */
    public final String getPickUpSlotDay() {
        return this.pickUpSlotDay;
    }

    /* renamed from: h, reason: from getter */
    public final String getPickUpSlotId() {
        return this.pickUpSlotId;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getPickUpSlotIsAvailable() {
        return this.pickUpSlotIsAvailable;
    }

    /* renamed from: j, reason: from getter */
    public final String getPickUpSlotTime() {
        return this.pickUpSlotTime;
    }

    /* renamed from: k, reason: from getter */
    public final String getPickUpSlotTimeString() {
        return this.pickUpSlotTimeString;
    }

    /* renamed from: l, reason: from getter */
    public final String getPickUpSlotTimeZoneString() {
        return this.pickUpSlotTimeZoneString;
    }

    /* renamed from: m, reason: from getter */
    public final String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    public /* synthetic */ HybrisPickupSlotInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, String str9, String str10, String str11, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) == 0 ? str9 : "", (i10 & 1024) != 0 ? null : str10, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? str11 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11);
    }
}
