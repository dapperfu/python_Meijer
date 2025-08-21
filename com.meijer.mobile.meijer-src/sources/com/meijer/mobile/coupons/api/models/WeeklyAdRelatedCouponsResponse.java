package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse;", "", "", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "adBlockWithCouponsList", "", "responseCode", "", "message", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "copy", "(Ljava/util/List;ILjava/lang/String;)Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "Ljava/lang/String;", "AdBlockWithCoupons", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WeeklyAdRelatedCouponsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AdBlockWithCoupons> adBlockWithCouponsList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int responseCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0003\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0012\b\u0003\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "", "", "adBlockId", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "meijerOfferIds", "<init>", "(JLjava/util/List;)V", "copy", "(JLjava/util/List;)Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/util/List;", "()Ljava/util/List;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdBlockWithCoupons {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long adBlockId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Long> meijerOfferIds;

        public AdBlockWithCoupons() {
            this(0L, null, 3, null);
        }

        public final AdBlockWithCoupons copy(@g(name = "adBlockId") long adBlockId, @g(name = "meijerOfferIds") List<Long> meijerOfferIds) {
            Intrinsics.j(meijerOfferIds, "meijerOfferIds");
            return new AdBlockWithCoupons(adBlockId, meijerOfferIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdBlockWithCoupons)) {
                return false;
            }
            AdBlockWithCoupons adBlockWithCoupons = (AdBlockWithCoupons) other;
            return this.adBlockId == adBlockWithCoupons.adBlockId && Intrinsics.e(this.meijerOfferIds, adBlockWithCoupons.meijerOfferIds);
        }

        public int hashCode() {
            return (Long.hashCode(this.adBlockId) * 31) + this.meijerOfferIds.hashCode();
        }

        public String toString() {
            return "AdBlockWithCoupons(adBlockId=" + this.adBlockId + ", meijerOfferIds=" + this.meijerOfferIds + ')';
        }

        public AdBlockWithCoupons(@g(name = "adBlockId") long j10, @g(name = "meijerOfferIds") List<Long> meijerOfferIds) {
            Intrinsics.j(meijerOfferIds, "meijerOfferIds");
            this.adBlockId = j10;
            this.meijerOfferIds = meijerOfferIds;
        }

        /* renamed from: a, reason: from getter */
        public final long getAdBlockId() {
            return this.adBlockId;
        }

        public final List<Long> b() {
            return this.meijerOfferIds;
        }

        public /* synthetic */ AdBlockWithCoupons(long j10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? CollectionsKt.m() : list);
        }
    }

    public WeeklyAdRelatedCouponsResponse() {
        this(null, 0, null, 7, null);
    }

    public final WeeklyAdRelatedCouponsResponse copy(@g(name = "adsWithOffers") List<AdBlockWithCoupons> adBlockWithCouponsList, @g(name = "statusCodeEnum") int responseCode, @g(name = "message") String message) {
        return new WeeklyAdRelatedCouponsResponse(adBlockWithCouponsList, responseCode, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdRelatedCouponsResponse)) {
            return false;
        }
        WeeklyAdRelatedCouponsResponse weeklyAdRelatedCouponsResponse = (WeeklyAdRelatedCouponsResponse) other;
        return Intrinsics.e(this.adBlockWithCouponsList, weeklyAdRelatedCouponsResponse.adBlockWithCouponsList) && this.responseCode == weeklyAdRelatedCouponsResponse.responseCode && Intrinsics.e(this.message, weeklyAdRelatedCouponsResponse.message);
    }

    public int hashCode() {
        List<AdBlockWithCoupons> list = this.adBlockWithCouponsList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.responseCode)) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WeeklyAdRelatedCouponsResponse(adBlockWithCouponsList=" + this.adBlockWithCouponsList + ", responseCode=" + this.responseCode + ", message=" + this.message + ')';
    }

    public WeeklyAdRelatedCouponsResponse(@g(name = "adsWithOffers") List<AdBlockWithCoupons> list, @g(name = "statusCodeEnum") int i10, @g(name = "message") String str) {
        this.adBlockWithCouponsList = list;
        this.responseCode = i10;
        this.message = str;
    }

    public final List<AdBlockWithCoupons> a() {
        return this.adBlockWithCouponsList;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    public /* synthetic */ WeeklyAdRelatedCouponsResponse(List list, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str);
    }
}
