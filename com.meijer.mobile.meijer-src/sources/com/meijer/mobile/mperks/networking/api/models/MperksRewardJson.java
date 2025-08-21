package com.meijer.mobile.mperks.networking.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJÄ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00042\b\b\u0003\u0010\u0016\u001a\u00020\u00042\b\b\u0003\u0010\u0017\u001a\u00020\u00042\b\b\u0003\u0010\u0018\u001a\u00020\u00042\b\b\u0003\u0010\u0019\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b,\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00106R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b.\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b9\u0010!R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b:\u0010!R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b<\u0010!R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b%\u0010>R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b?\u0010\u001fR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b4\u0010>¨\u0006A"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardJson;", "", "", "rewardId", "", "rewardProgram", "startAt", "endAt", "Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;", "rewardDetails", "earnKind", "", "earnRequirement", "progress", "earnMetric", "", "maxDaysToEarn", "maxDaysToRedeem", "maxEarnCount", "", "allowCarryOver", "title", "description", "imageUrl", "terms", "hasUpcs", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;Ljava/lang/String;DDLjava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;Ljava/lang/String;DDLjava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "n", "()J", "b", "Ljava/lang/String;", "o", "c", "p", "d", "f", "e", "Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;", "m", "()Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;", "g", "D", "()D", "h", "l", "i", "j", "I", "k", "Z", "()Z", "r", "q", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksRewardJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardProgram;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final RewardDetailsJson rewardDetails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String earnKind;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double earnRequirement;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double progress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String earnMetric;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxDaysToEarn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxDaysToRedeem;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxEarnCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowCarryOver;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String terms;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUpcs;

    public MperksRewardJson(@g(name = "rewardId") long j10, @g(name = "rewardProgram") String rewardProgram, @g(name = "startAt") String startAt, @g(name = "endAt") String endAt, @g(name = "rewardDetails") RewardDetailsJson rewardDetails, @g(name = "earnKind") String earnKind, @g(name = "earnRequirement") double d10, @g(name = "progress") double d11, @g(name = "earnMetric") String earnMetric, @g(name = "maxDaysToEarn") int i10, @g(name = "maxDaysToRedeem") int i11, @g(name = "maxEarnCount") int i12, @g(name = "allowCarryOver") boolean z10, @g(name = "title") String title, @g(name = "description") String description, @g(name = "imageUrl") String imageUrl, @g(name = "terms") String terms, @g(name = "hasUpcs") boolean z11) {
        Intrinsics.j(rewardProgram, "rewardProgram");
        Intrinsics.j(startAt, "startAt");
        Intrinsics.j(endAt, "endAt");
        Intrinsics.j(rewardDetails, "rewardDetails");
        Intrinsics.j(earnKind, "earnKind");
        Intrinsics.j(earnMetric, "earnMetric");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(imageUrl, "imageUrl");
        Intrinsics.j(terms, "terms");
        this.rewardId = j10;
        this.rewardProgram = rewardProgram;
        this.startAt = startAt;
        this.endAt = endAt;
        this.rewardDetails = rewardDetails;
        this.earnKind = earnKind;
        this.earnRequirement = d10;
        this.progress = d11;
        this.earnMetric = earnMetric;
        this.maxDaysToEarn = i10;
        this.maxDaysToRedeem = i11;
        this.maxEarnCount = i12;
        this.allowCarryOver = z10;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.terms = terms;
        this.hasUpcs = z11;
    }

    public final MperksRewardJson copy(@g(name = "rewardId") long rewardId, @g(name = "rewardProgram") String rewardProgram, @g(name = "startAt") String startAt, @g(name = "endAt") String endAt, @g(name = "rewardDetails") RewardDetailsJson rewardDetails, @g(name = "earnKind") String earnKind, @g(name = "earnRequirement") double earnRequirement, @g(name = "progress") double progress, @g(name = "earnMetric") String earnMetric, @g(name = "maxDaysToEarn") int maxDaysToEarn, @g(name = "maxDaysToRedeem") int maxDaysToRedeem, @g(name = "maxEarnCount") int maxEarnCount, @g(name = "allowCarryOver") boolean allowCarryOver, @g(name = "title") String title, @g(name = "description") String description, @g(name = "imageUrl") String imageUrl, @g(name = "terms") String terms, @g(name = "hasUpcs") boolean hasUpcs) {
        Intrinsics.j(rewardProgram, "rewardProgram");
        Intrinsics.j(startAt, "startAt");
        Intrinsics.j(endAt, "endAt");
        Intrinsics.j(rewardDetails, "rewardDetails");
        Intrinsics.j(earnKind, "earnKind");
        Intrinsics.j(earnMetric, "earnMetric");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(imageUrl, "imageUrl");
        Intrinsics.j(terms, "terms");
        return new MperksRewardJson(rewardId, rewardProgram, startAt, endAt, rewardDetails, earnKind, earnRequirement, progress, earnMetric, maxDaysToEarn, maxDaysToRedeem, maxEarnCount, allowCarryOver, title, description, imageUrl, terms, hasUpcs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksRewardJson)) {
            return false;
        }
        MperksRewardJson mperksRewardJson = (MperksRewardJson) other;
        return this.rewardId == mperksRewardJson.rewardId && Intrinsics.e(this.rewardProgram, mperksRewardJson.rewardProgram) && Intrinsics.e(this.startAt, mperksRewardJson.startAt) && Intrinsics.e(this.endAt, mperksRewardJson.endAt) && Intrinsics.e(this.rewardDetails, mperksRewardJson.rewardDetails) && Intrinsics.e(this.earnKind, mperksRewardJson.earnKind) && Double.compare(this.earnRequirement, mperksRewardJson.earnRequirement) == 0 && Double.compare(this.progress, mperksRewardJson.progress) == 0 && Intrinsics.e(this.earnMetric, mperksRewardJson.earnMetric) && this.maxDaysToEarn == mperksRewardJson.maxDaysToEarn && this.maxDaysToRedeem == mperksRewardJson.maxDaysToRedeem && this.maxEarnCount == mperksRewardJson.maxEarnCount && this.allowCarryOver == mperksRewardJson.allowCarryOver && Intrinsics.e(this.title, mperksRewardJson.title) && Intrinsics.e(this.description, mperksRewardJson.description) && Intrinsics.e(this.imageUrl, mperksRewardJson.imageUrl) && Intrinsics.e(this.terms, mperksRewardJson.terms) && this.hasUpcs == mperksRewardJson.hasUpcs;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Long.hashCode(this.rewardId) * 31) + this.rewardProgram.hashCode()) * 31) + this.startAt.hashCode()) * 31) + this.endAt.hashCode()) * 31) + this.rewardDetails.hashCode()) * 31) + this.earnKind.hashCode()) * 31) + Double.hashCode(this.earnRequirement)) * 31) + Double.hashCode(this.progress)) * 31) + this.earnMetric.hashCode()) * 31) + Integer.hashCode(this.maxDaysToEarn)) * 31) + Integer.hashCode(this.maxDaysToRedeem)) * 31) + Integer.hashCode(this.maxEarnCount)) * 31) + Boolean.hashCode(this.allowCarryOver)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.terms.hashCode()) * 31) + Boolean.hashCode(this.hasUpcs);
    }

    public String toString() {
        return "MperksRewardJson(rewardId=" + this.rewardId + ", rewardProgram=" + this.rewardProgram + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", rewardDetails=" + this.rewardDetails + ", earnKind=" + this.earnKind + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", earnMetric=" + this.earnMetric + ", maxDaysToEarn=" + this.maxDaysToEarn + ", maxDaysToRedeem=" + this.maxDaysToRedeem + ", maxEarnCount=" + this.maxEarnCount + ", allowCarryOver=" + this.allowCarryOver + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", terms=" + this.terms + ", hasUpcs=" + this.hasUpcs + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAllowCarryOver() {
        return this.allowCarryOver;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getEarnKind() {
        return this.earnKind;
    }

    /* renamed from: d, reason: from getter */
    public final String getEarnMetric() {
        return this.earnMetric;
    }

    /* renamed from: e, reason: from getter */
    public final double getEarnRequirement() {
        return this.earnRequirement;
    }

    /* renamed from: f, reason: from getter */
    public final String getEndAt() {
        return this.endAt;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHasUpcs() {
        return this.hasUpcs;
    }

    /* renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: i, reason: from getter */
    public final int getMaxDaysToEarn() {
        return this.maxDaysToEarn;
    }

    /* renamed from: j, reason: from getter */
    public final int getMaxDaysToRedeem() {
        return this.maxDaysToRedeem;
    }

    /* renamed from: k, reason: from getter */
    public final int getMaxEarnCount() {
        return this.maxEarnCount;
    }

    /* renamed from: l, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: m, reason: from getter */
    public final RewardDetailsJson getRewardDetails() {
        return this.rewardDetails;
    }

    /* renamed from: n, reason: from getter */
    public final long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: o, reason: from getter */
    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: p, reason: from getter */
    public final String getStartAt() {
        return this.startAt;
    }

    /* renamed from: q, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: r, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ MperksRewardJson(long j10, String str, String str2, String str3, RewardDetailsJson rewardDetailsJson, String str4, double d10, double d11, String str5, int i10, int i11, int i12, boolean z10, String str6, String str7, String str8, String str9, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j10, str, str2, str3, (i13 & 16) != 0 ? new RewardDetailsJson(null, null, null, null, 15, null) : rewardDetailsJson, (i13 & 32) != 0 ? "Undefined" : str4, (i13 & 64) != 0 ? 0.0d : d10, (i13 & 128) != 0 ? 0.0d : d11, (i13 & 256) != 0 ? "Undefined" : str5, (i13 & 512) != 0 ? 365 : i10, (i13 & 1024) != 0 ? 365 : i11, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : i12, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z10, (i13 & 8192) != 0 ? "" : str6, (i13 & 16384) != 0 ? "" : str7, (32768 & i13) != 0 ? "" : str8, (65536 & i13) != 0 ? "" : str9, (i13 & 131072) != 0 ? false : z11);
    }
}
