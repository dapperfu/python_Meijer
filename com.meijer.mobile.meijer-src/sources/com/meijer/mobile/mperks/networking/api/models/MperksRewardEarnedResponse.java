package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedResponse;", "", "Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "summary", "", "Lcom/meijer/mobile/mperks/networking/api/models/MperksEarnedRewardJson;", "rewards", "redeemedRewards", "<init>", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;Ljava/util/List;Ljava/util/List;)V", "copy", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "c", "()Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedSummaryJson;", "b", "Ljava/util/List;", "()Ljava/util/List;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksRewardEarnedResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksRewardEarnedSummaryJson summary;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MperksEarnedRewardJson> rewards;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MperksEarnedRewardJson> redeemedRewards;

    public MperksRewardEarnedResponse() {
        this(null, null, null, 7, null);
    }

    public final MperksRewardEarnedResponse copy(@g(name = "summary") MperksRewardEarnedSummaryJson summary, @g(name = "rewards") List<MperksEarnedRewardJson> rewards, @g(name = "redeemedRewards") List<MperksEarnedRewardJson> redeemedRewards) {
        Intrinsics.j(summary, "summary");
        Intrinsics.j(rewards, "rewards");
        Intrinsics.j(redeemedRewards, "redeemedRewards");
        return new MperksRewardEarnedResponse(summary, rewards, redeemedRewards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksRewardEarnedResponse)) {
            return false;
        }
        MperksRewardEarnedResponse mperksRewardEarnedResponse = (MperksRewardEarnedResponse) other;
        return Intrinsics.e(this.summary, mperksRewardEarnedResponse.summary) && Intrinsics.e(this.rewards, mperksRewardEarnedResponse.rewards) && Intrinsics.e(this.redeemedRewards, mperksRewardEarnedResponse.redeemedRewards);
    }

    public int hashCode() {
        return (((this.summary.hashCode() * 31) + this.rewards.hashCode()) * 31) + this.redeemedRewards.hashCode();
    }

    public String toString() {
        return "MperksRewardEarnedResponse(summary=" + this.summary + ", rewards=" + this.rewards + ", redeemedRewards=" + this.redeemedRewards + ')';
    }

    public MperksRewardEarnedResponse(@g(name = "summary") MperksRewardEarnedSummaryJson summary, @g(name = "rewards") List<MperksEarnedRewardJson> rewards, @g(name = "redeemedRewards") List<MperksEarnedRewardJson> redeemedRewards) {
        Intrinsics.j(summary, "summary");
        Intrinsics.j(rewards, "rewards");
        Intrinsics.j(redeemedRewards, "redeemedRewards");
        this.summary = summary;
        this.rewards = rewards;
        this.redeemedRewards = redeemedRewards;
    }

    public final List<MperksEarnedRewardJson> a() {
        return this.redeemedRewards;
    }

    public final List<MperksEarnedRewardJson> b() {
        return this.rewards;
    }

    /* renamed from: c, reason: from getter */
    public final MperksRewardEarnedSummaryJson getSummary() {
        return this.summary;
    }

    public /* synthetic */ MperksRewardEarnedResponse(MperksRewardEarnedSummaryJson mperksRewardEarnedSummaryJson, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MperksRewardEarnedSummaryJson(0, 1, null) : mperksRewardEarnedSummaryJson, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2);
    }
}
