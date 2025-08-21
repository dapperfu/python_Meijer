package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\b\u0003\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u008c\u0001\u0010\u0012\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0003\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b(\u0010\u0015¨\u0006*"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksEarnedRewardJson;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "logixOfferId", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "meijerOfferId", "", "imageUrl", "title", "description", "termsAndConditions", "transactionDate", "earnDate", "redeemedDate", "rewardProgram", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/MperksEarnedRewardJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "e", "c", "Ljava/lang/String;", "i", "f", "h", "g", "j", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksEarnedRewardJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long logixOfferId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long meijerOfferId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String earnDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redeemedDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardProgram;

    public MperksEarnedRewardJson() {
        this(0L, 0L, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final MperksEarnedRewardJson copy(@g(name = "logixOfferId") long logixOfferId, @g(name = "meijerOfferId") long meijerOfferId, @g(name = "imageUrl") String imageUrl, @g(name = "title") String title, @g(name = "description") String description, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "transactionDate") String transactionDate, @g(name = "earnDate") String earnDate, @g(name = "redeemDate") String redeemedDate, @g(name = "rewardProgram") String rewardProgram) {
        return new MperksEarnedRewardJson(logixOfferId, meijerOfferId, imageUrl, title, description, termsAndConditions, transactionDate, earnDate, redeemedDate, rewardProgram);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksEarnedRewardJson)) {
            return false;
        }
        MperksEarnedRewardJson mperksEarnedRewardJson = (MperksEarnedRewardJson) other;
        return this.logixOfferId == mperksEarnedRewardJson.logixOfferId && this.meijerOfferId == mperksEarnedRewardJson.meijerOfferId && Intrinsics.e(this.imageUrl, mperksEarnedRewardJson.imageUrl) && Intrinsics.e(this.title, mperksEarnedRewardJson.title) && Intrinsics.e(this.description, mperksEarnedRewardJson.description) && Intrinsics.e(this.termsAndConditions, mperksEarnedRewardJson.termsAndConditions) && Intrinsics.e(this.transactionDate, mperksEarnedRewardJson.transactionDate) && Intrinsics.e(this.earnDate, mperksEarnedRewardJson.earnDate) && Intrinsics.e(this.redeemedDate, mperksEarnedRewardJson.redeemedDate) && Intrinsics.e(this.rewardProgram, mperksEarnedRewardJson.rewardProgram);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.logixOfferId) * 31) + Long.hashCode(this.meijerOfferId)) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.earnDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.redeemedDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rewardProgram;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "MperksEarnedRewardJson(logixOfferId=" + this.logixOfferId + ", meijerOfferId=" + this.meijerOfferId + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", description=" + this.description + ", termsAndConditions=" + this.termsAndConditions + ", transactionDate=" + this.transactionDate + ", earnDate=" + this.earnDate + ", redeemedDate=" + this.redeemedDate + ", rewardProgram=" + this.rewardProgram + ')';
    }

    public MperksEarnedRewardJson(@g(name = "logixOfferId") long j10, @g(name = "meijerOfferId") long j11, @g(name = "imageUrl") String str, @g(name = "title") String str2, @g(name = "description") String str3, @g(name = "termsAndConditions") String str4, @g(name = "transactionDate") String str5, @g(name = "earnDate") String str6, @g(name = "redeemDate") String str7, @g(name = "rewardProgram") String str8) {
        this.logixOfferId = j10;
        this.meijerOfferId = j11;
        this.imageUrl = str;
        this.title = str2;
        this.description = str3;
        this.termsAndConditions = str4;
        this.transactionDate = str5;
        this.earnDate = str6;
        this.redeemedDate = str7;
        this.rewardProgram = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getEarnDate() {
        return this.earnDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final long getLogixOfferId() {
        return this.logixOfferId;
    }

    /* renamed from: e, reason: from getter */
    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    /* renamed from: f, reason: from getter */
    public final String getRedeemedDate() {
        return this.redeemedDate;
    }

    /* renamed from: g, reason: from getter */
    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: h, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: j, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public /* synthetic */ MperksEarnedRewardJson(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) == 0 ? j11 : 0L, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8);
    }
}
