package com.meijer.mobile.coupons.api.models;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsRequest;", "", "", "startDate", "", "Lcom/meijer/mobile/core/model/common/StoreId;", PlaceTypes.STORE, "", "promoBlockId", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WeeklyAdRelatedCouponsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startDate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long promoBlockId;

    public WeeklyAdRelatedCouponsRequest() {
        this(null, 0, null, 7, null);
    }

    public final WeeklyAdRelatedCouponsRequest copy(@g(name = "startDate") String startDate, @g(name = PlaceTypes.STORE) int store, @g(name = "promoBlockId") Long promoBlockId) {
        Intrinsics.j(startDate, "startDate");
        return new WeeklyAdRelatedCouponsRequest(startDate, store, promoBlockId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdRelatedCouponsRequest)) {
            return false;
        }
        WeeklyAdRelatedCouponsRequest weeklyAdRelatedCouponsRequest = (WeeklyAdRelatedCouponsRequest) other;
        return Intrinsics.e(this.startDate, weeklyAdRelatedCouponsRequest.startDate) && this.store == weeklyAdRelatedCouponsRequest.store && Intrinsics.e(this.promoBlockId, weeklyAdRelatedCouponsRequest.promoBlockId);
    }

    public int hashCode() {
        int iHashCode = ((this.startDate.hashCode() * 31) + Integer.hashCode(this.store)) * 31;
        Long l10 = this.promoBlockId;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "WeeklyAdRelatedCouponsRequest(startDate=" + this.startDate + ", store=" + this.store + ", promoBlockId=" + this.promoBlockId + ')';
    }

    public WeeklyAdRelatedCouponsRequest(@g(name = "startDate") String startDate, @g(name = PlaceTypes.STORE) int i10, @g(name = "promoBlockId") Long l10) {
        Intrinsics.j(startDate, "startDate");
        this.startDate = startDate;
        this.store = i10;
        this.promoBlockId = l10;
    }

    /* renamed from: a, reason: from getter */
    public final Long getPromoBlockId() {
        return this.promoBlockId;
    }

    /* renamed from: b, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: c, reason: from getter */
    public final int getStore() {
        return this.store;
    }

    public /* synthetic */ WeeklyAdRelatedCouponsRequest(String str, int i10, Long l10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? LocalDate.now().format(C17898a.ISO_LOCAL_DATE) : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : l10);
    }
}
