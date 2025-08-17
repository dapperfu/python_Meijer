package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "", "", "partnerCustomerId", "partnerEligibility", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsScheduleResponse;", "schedules", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GetReservationSlotsOmsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OmsScheduleResponse> schedules;

    public GetReservationSlotsOmsResponse() {
        this(null, null, null, 7, null);
    }

    public final GetReservationSlotsOmsResponse copy(@g(name = "partnerCustomerId") String partnerCustomerId, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "schedules") List<OmsScheduleResponse> schedules) {
        Intrinsics.j(schedules, "schedules");
        return new GetReservationSlotsOmsResponse(partnerCustomerId, partnerEligibility, schedules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReservationSlotsOmsResponse)) {
            return false;
        }
        GetReservationSlotsOmsResponse getReservationSlotsOmsResponse = (GetReservationSlotsOmsResponse) other;
        return Intrinsics.e(this.partnerCustomerId, getReservationSlotsOmsResponse.partnerCustomerId) && Intrinsics.e(this.partnerEligibility, getReservationSlotsOmsResponse.partnerEligibility) && Intrinsics.e(this.schedules, getReservationSlotsOmsResponse.schedules);
    }

    public int hashCode() {
        String str = this.partnerCustomerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.partnerEligibility;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.schedules.hashCode();
    }

    public String toString() {
        return "GetReservationSlotsOmsResponse(partnerCustomerId=" + this.partnerCustomerId + ", partnerEligibility=" + this.partnerEligibility + ", schedules=" + this.schedules + ')';
    }

    public GetReservationSlotsOmsResponse(@g(name = "partnerCustomerId") String str, @g(name = "partnerEligibility") String str2, @g(name = "schedules") List<OmsScheduleResponse> schedules) {
        Intrinsics.j(schedules, "schedules");
        this.partnerCustomerId = str;
        this.partnerEligibility = str2;
        this.schedules = schedules;
    }

    /* renamed from: a, reason: from getter */
    public final String getPartnerCustomerId() {
        return this.partnerCustomerId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    public final List<OmsScheduleResponse> c() {
        return this.schedules;
    }

    public /* synthetic */ GetReservationSlotsOmsResponse(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
