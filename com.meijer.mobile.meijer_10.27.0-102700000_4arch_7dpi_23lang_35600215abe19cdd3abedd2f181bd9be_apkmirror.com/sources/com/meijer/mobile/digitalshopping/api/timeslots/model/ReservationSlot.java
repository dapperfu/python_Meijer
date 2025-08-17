package com.meijer.mobile.digitalshopping.api.timeslots.model;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u009c\u0001\u0010\u0015\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "activeSlotId", "startTime", "endTime", "slotTimeZone", "", "maxActiveSlotsCount", "activeSlotsCount", "", "isAvailable", "reservationSlotTransactionId", "activeSlotTransactionId", "mustOrderBy", "mustHoldBy", "isHoldable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "k", "d", "j", "f", "I", "g", "h", "Z", "l", "()Z", "i", "m", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReservationSlot {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String slotTimeZone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxActiveSlotsCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int activeSlotsCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reservationSlotTransactionId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activeSlotTransactionId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mustOrderBy;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mustHoldBy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHoldable;

    public ReservationSlot(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "activeSlotId") String str, @g(name = "startTime") String startTime, @g(name = "endTime") String endTime, @g(name = "slotTimeZone") String slotTimeZone, @g(name = "maxActiveSlotsCount") int i10, @g(name = "activeSlotsCount") int i11, @g(name = "isAvailable") boolean z10, @g(name = "reservationSlotTransactionId") String reservationSlotTransactionId, String activeSlotTransactionId, @g(name = "mustOrderBy") String str2, @g(name = "mustHoldBy") String str3, @g(name = "isHoldable") boolean z11) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(slotTimeZone, "slotTimeZone");
        Intrinsics.j(reservationSlotTransactionId, "reservationSlotTransactionId");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        this.id = id2;
        this.activeSlotId = str;
        this.startTime = startTime;
        this.endTime = endTime;
        this.slotTimeZone = slotTimeZone;
        this.maxActiveSlotsCount = i10;
        this.activeSlotsCount = i11;
        this.isAvailable = z10;
        this.reservationSlotTransactionId = reservationSlotTransactionId;
        this.activeSlotTransactionId = activeSlotTransactionId;
        this.mustOrderBy = str2;
        this.mustHoldBy = str3;
        this.isHoldable = z11;
    }

    public final ReservationSlot copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "activeSlotId") String activeSlotId, @g(name = "startTime") String startTime, @g(name = "endTime") String endTime, @g(name = "slotTimeZone") String slotTimeZone, @g(name = "maxActiveSlotsCount") int maxActiveSlotsCount, @g(name = "activeSlotsCount") int activeSlotsCount, @g(name = "isAvailable") boolean isAvailable, @g(name = "reservationSlotTransactionId") String reservationSlotTransactionId, String activeSlotTransactionId, @g(name = "mustOrderBy") String mustOrderBy, @g(name = "mustHoldBy") String mustHoldBy, @g(name = "isHoldable") boolean isHoldable) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(slotTimeZone, "slotTimeZone");
        Intrinsics.j(reservationSlotTransactionId, "reservationSlotTransactionId");
        Intrinsics.j(activeSlotTransactionId, "activeSlotTransactionId");
        return new ReservationSlot(id2, activeSlotId, startTime, endTime, slotTimeZone, maxActiveSlotsCount, activeSlotsCount, isAvailable, reservationSlotTransactionId, activeSlotTransactionId, mustOrderBy, mustHoldBy, isHoldable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReservationSlot)) {
            return false;
        }
        ReservationSlot reservationSlot = (ReservationSlot) other;
        return Intrinsics.e(this.id, reservationSlot.id) && Intrinsics.e(this.activeSlotId, reservationSlot.activeSlotId) && Intrinsics.e(this.startTime, reservationSlot.startTime) && Intrinsics.e(this.endTime, reservationSlot.endTime) && Intrinsics.e(this.slotTimeZone, reservationSlot.slotTimeZone) && this.maxActiveSlotsCount == reservationSlot.maxActiveSlotsCount && this.activeSlotsCount == reservationSlot.activeSlotsCount && this.isAvailable == reservationSlot.isAvailable && Intrinsics.e(this.reservationSlotTransactionId, reservationSlot.reservationSlotTransactionId) && Intrinsics.e(this.activeSlotTransactionId, reservationSlot.activeSlotTransactionId) && Intrinsics.e(this.mustOrderBy, reservationSlot.mustOrderBy) && Intrinsics.e(this.mustHoldBy, reservationSlot.mustHoldBy) && this.isHoldable == reservationSlot.isHoldable;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.activeSlotId;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.slotTimeZone.hashCode()) * 31) + Integer.hashCode(this.maxActiveSlotsCount)) * 31) + Integer.hashCode(this.activeSlotsCount)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.reservationSlotTransactionId.hashCode()) * 31) + this.activeSlotTransactionId.hashCode()) * 31;
        String str2 = this.mustOrderBy;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mustHoldBy;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHoldable);
    }

    public String toString() {
        return "ReservationSlot(id=" + this.id + ", activeSlotId=" + this.activeSlotId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", slotTimeZone=" + this.slotTimeZone + ", maxActiveSlotsCount=" + this.maxActiveSlotsCount + ", activeSlotsCount=" + this.activeSlotsCount + ", isAvailable=" + this.isAvailable + ", reservationSlotTransactionId=" + this.reservationSlotTransactionId + ", activeSlotTransactionId=" + this.activeSlotTransactionId + ", mustOrderBy=" + this.mustOrderBy + ", mustHoldBy=" + this.mustHoldBy + ", isHoldable=" + this.isHoldable + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getActiveSlotId() {
        return this.activeSlotId;
    }

    /* renamed from: b, reason: from getter */
    public final String getActiveSlotTransactionId() {
        return this.activeSlotTransactionId;
    }

    /* renamed from: c, reason: from getter */
    public final int getActiveSlotsCount() {
        return this.activeSlotsCount;
    }

    /* renamed from: d, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: f, reason: from getter */
    public final int getMaxActiveSlotsCount() {
        return this.maxActiveSlotsCount;
    }

    /* renamed from: g, reason: from getter */
    public final String getMustHoldBy() {
        return this.mustHoldBy;
    }

    /* renamed from: h, reason: from getter */
    public final String getMustOrderBy() {
        return this.mustOrderBy;
    }

    /* renamed from: i, reason: from getter */
    public final String getReservationSlotTransactionId() {
        return this.reservationSlotTransactionId;
    }

    /* renamed from: j, reason: from getter */
    public final String getSlotTimeZone() {
        return this.slotTimeZone;
    }

    /* renamed from: k, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsHoldable() {
        return this.isHoldable;
    }

    public /* synthetic */ ReservationSlot(String str, String str2, String str3, String str4, String str5, int i10, int i11, boolean z10, String str6, String str7, String str8, String str9, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "-1" : str, (i12 & 2) != 0 ? null : str2, str3, str4, str5, i10, i11, z10, str6, str7, (i12 & 1024) != 0 ? null : str8, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str9, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11);
    }
}
