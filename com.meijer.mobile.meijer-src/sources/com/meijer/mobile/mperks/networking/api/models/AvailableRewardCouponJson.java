package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010Jz\u0010\u0011\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0014¨\u0006("}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AvailableRewardCouponJson;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "couponId", "", "imageUrl", "name", "description", "displayStart", "displayEnd", "termsAndConditions", "", "pointCost", "rewardCouponType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/AvailableRewardCouponJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "e", "c", "f", "d", "g", "i", "h", "I", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AvailableRewardCouponJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayEnd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointCost;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardCouponType;

    public AvailableRewardCouponJson() {
        this(0L, null, null, null, null, null, null, 0, null, 511, null);
    }

    public final AvailableRewardCouponJson copy(@g(name = "couponId") long couponId, @g(name = "imageUrl") String imageUrl, @g(name = "name") String name, @g(name = "description") String description, @g(name = "displayStart") String displayStart, @g(name = "displayEnd") String displayEnd, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "pointCost") int pointCost, @g(name = "rewardCouponType") String rewardCouponType) {
        Intrinsics.j(name, "name");
        return new AvailableRewardCouponJson(couponId, imageUrl, name, description, displayStart, displayEnd, termsAndConditions, pointCost, rewardCouponType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableRewardCouponJson)) {
            return false;
        }
        AvailableRewardCouponJson availableRewardCouponJson = (AvailableRewardCouponJson) other;
        return this.couponId == availableRewardCouponJson.couponId && Intrinsics.e(this.imageUrl, availableRewardCouponJson.imageUrl) && Intrinsics.e(this.name, availableRewardCouponJson.name) && Intrinsics.e(this.description, availableRewardCouponJson.description) && Intrinsics.e(this.displayStart, availableRewardCouponJson.displayStart) && Intrinsics.e(this.displayEnd, availableRewardCouponJson.displayEnd) && Intrinsics.e(this.termsAndConditions, availableRewardCouponJson.termsAndConditions) && this.pointCost == availableRewardCouponJson.pointCost && Intrinsics.e(this.rewardCouponType, availableRewardCouponJson.rewardCouponType);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayStart;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayEnd;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.termsAndConditions;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.pointCost)) * 31;
        String str6 = this.rewardCouponType;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AvailableRewardCouponJson(couponId=" + this.couponId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", description=" + this.description + ", displayStart=" + this.displayStart + ", displayEnd=" + this.displayEnd + ", termsAndConditions=" + this.termsAndConditions + ", pointCost=" + this.pointCost + ", rewardCouponType=" + this.rewardCouponType + ')';
    }

    public AvailableRewardCouponJson(@g(name = "couponId") long j10, @g(name = "imageUrl") String str, @g(name = "name") String name, @g(name = "description") String str2, @g(name = "displayStart") String str3, @g(name = "displayEnd") String str4, @g(name = "termsAndConditions") String str5, @g(name = "pointCost") int i10, @g(name = "rewardCouponType") String str6) {
        Intrinsics.j(name, "name");
        this.couponId = j10;
        this.imageUrl = str;
        this.name = name;
        this.description = str2;
        this.displayStart = str3;
        this.displayEnd = str4;
        this.termsAndConditions = str5;
        this.pointCost = i10;
        this.rewardCouponType = str6;
    }

    /* renamed from: a, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getDisplayEnd() {
        return this.displayEnd;
    }

    /* renamed from: d, reason: from getter */
    public final String getDisplayStart() {
        return this.displayStart;
    }

    /* renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    /* renamed from: h, reason: from getter */
    public final String getRewardCouponType() {
        return this.rewardCouponType;
    }

    /* renamed from: i, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public /* synthetic */ AvailableRewardCouponJson(long j10, String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1L : j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? null : str7);
    }
}
