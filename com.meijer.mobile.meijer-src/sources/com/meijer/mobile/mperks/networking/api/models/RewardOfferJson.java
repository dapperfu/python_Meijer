package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0090\u0001\u0010\u0014\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b!\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b\u001d\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b/\u0010$¨\u00060"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardOfferJson;", "", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "meijerOfferId", "", "isClippable", "", "title", "subTitle", "description", "termsConditionsDescription", "endDate", "", "pointCost", "conditionTypeId", "imageURL", "isClipped", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Z)V", "copy", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Z)Lcom/meijer/mobile/mperks/networking/api/models/RewardOfferJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Z", "j", "()Z", "c", "Ljava/lang/String;", "i", "d", "g", "f", "h", "I", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "k", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardOfferJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long meijerOfferId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClippable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsConditionsDescription;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointCost;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer conditionTypeId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    public RewardOfferJson() {
        this(0L, false, null, null, null, null, null, 0, null, null, false, 2047, null);
    }

    public final RewardOfferJson copy(@g(name = "meijerOfferId") long meijerOfferId, @g(name = "isClippable") boolean isClippable, @g(name = "title") String title, @g(name = "subTitle") String subTitle, @g(name = "description") String description, @g(name = "termsConditionsDescription") String termsConditionsDescription, @g(name = "endDate") String endDate, @g(name = "pointCost") int pointCost, Integer conditionTypeId, @g(name = "imageURL") String imageURL, @g(name = "isClipped") boolean isClipped) {
        return new RewardOfferJson(meijerOfferId, isClippable, title, subTitle, description, termsConditionsDescription, endDate, pointCost, conditionTypeId, imageURL, isClipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardOfferJson)) {
            return false;
        }
        RewardOfferJson rewardOfferJson = (RewardOfferJson) other;
        return this.meijerOfferId == rewardOfferJson.meijerOfferId && this.isClippable == rewardOfferJson.isClippable && Intrinsics.e(this.title, rewardOfferJson.title) && Intrinsics.e(this.subTitle, rewardOfferJson.subTitle) && Intrinsics.e(this.description, rewardOfferJson.description) && Intrinsics.e(this.termsConditionsDescription, rewardOfferJson.termsConditionsDescription) && Intrinsics.e(this.endDate, rewardOfferJson.endDate) && this.pointCost == rewardOfferJson.pointCost && Intrinsics.e(this.conditionTypeId, rewardOfferJson.conditionTypeId) && Intrinsics.e(this.imageURL, rewardOfferJson.imageURL) && this.isClipped == rewardOfferJson.isClipped;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.meijerOfferId) * 31) + Boolean.hashCode(this.isClippable)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsConditionsDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endDate;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.pointCost)) * 31;
        Integer num = this.conditionTypeId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.imageURL;
        return ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClipped);
    }

    public String toString() {
        return "RewardOfferJson(meijerOfferId=" + this.meijerOfferId + ", isClippable=" + this.isClippable + ", title=" + this.title + ", subTitle=" + this.subTitle + ", description=" + this.description + ", termsConditionsDescription=" + this.termsConditionsDescription + ", endDate=" + this.endDate + ", pointCost=" + this.pointCost + ", conditionTypeId=" + this.conditionTypeId + ", imageURL=" + this.imageURL + ", isClipped=" + this.isClipped + ')';
    }

    public RewardOfferJson(@g(name = "meijerOfferId") long j10, @g(name = "isClippable") boolean z10, @g(name = "title") String str, @g(name = "subTitle") String str2, @g(name = "description") String str3, @g(name = "termsConditionsDescription") String str4, @g(name = "endDate") String str5, @g(name = "pointCost") int i10, Integer num, @g(name = "imageURL") String str6, @g(name = "isClipped") boolean z11) {
        this.meijerOfferId = j10;
        this.isClippable = z10;
        this.title = str;
        this.subTitle = str2;
        this.description = str3;
        this.termsConditionsDescription = str4;
        this.endDate = str5;
        this.pointCost = i10;
        this.conditionTypeId = num;
        this.imageURL = str6;
        this.isClipped = z11;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getConditionTypeId() {
        return this.conditionTypeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: e, reason: from getter */
    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    /* renamed from: f, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    /* renamed from: g, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: h, reason: from getter */
    public final String getTermsConditionsDescription() {
        return this.termsConditionsDescription;
    }

    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsClippable() {
        return this.isClippable;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public /* synthetic */ RewardOfferJson(long j10, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Integer num, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? 0 : num, (i11 & 512) == 0 ? str6 : null, (i11 & 1024) != 0 ? false : z11);
    }
}
