package com.meijer.mobile.mperks.networking.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import co.ClippedReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "Landroid/os/Parcelable;", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "summary", "", "Lco/e;", "rewards", "redeemedRewards", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "getSummary", "Ljava/util/List;", "getRewards", "getRedeemedRewards", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksRewardEarnedDetail implements Parcelable {
    public static final Parcelable.Creator<MperksRewardEarnedDetail> CREATOR = new Creator();
    private final List<ClippedReward> redeemedRewards;
    private final List<ClippedReward> rewards;
    private final RewardEarnedSummary summary;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MperksRewardEarnedDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MperksRewardEarnedDetail createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            RewardEarnedSummary rewardEarnedSummaryCreateFromParcel = RewardEarnedSummary.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(MperksRewardEarnedDetail.class.getClassLoader()));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(parcel.readParcelable(MperksRewardEarnedDetail.class.getClassLoader()));
            }
            return new MperksRewardEarnedDetail(rewardEarnedSummaryCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MperksRewardEarnedDetail[] newArray(int i10) {
            return new MperksRewardEarnedDetail[i10];
        }
    }

    public MperksRewardEarnedDetail() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksRewardEarnedDetail copy$default(MperksRewardEarnedDetail mperksRewardEarnedDetail, RewardEarnedSummary rewardEarnedSummary, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rewardEarnedSummary = mperksRewardEarnedDetail.summary;
        }
        if ((i10 & 2) != 0) {
            list = mperksRewardEarnedDetail.rewards;
        }
        if ((i10 & 4) != 0) {
            list2 = mperksRewardEarnedDetail.redeemedRewards;
        }
        return mperksRewardEarnedDetail.copy(rewardEarnedSummary, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardEarnedSummary getSummary() {
        return this.summary;
    }

    public final List<ClippedReward> component2() {
        return this.rewards;
    }

    public final List<ClippedReward> component3() {
        return this.redeemedRewards;
    }

    public final MperksRewardEarnedDetail copy(RewardEarnedSummary summary, List<ClippedReward> rewards, List<ClippedReward> redeemedRewards) {
        Intrinsics.j(summary, "summary");
        Intrinsics.j(rewards, "rewards");
        Intrinsics.j(redeemedRewards, "redeemedRewards");
        return new MperksRewardEarnedDetail(summary, rewards, redeemedRewards);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksRewardEarnedDetail)) {
            return false;
        }
        MperksRewardEarnedDetail mperksRewardEarnedDetail = (MperksRewardEarnedDetail) other;
        return Intrinsics.e(this.summary, mperksRewardEarnedDetail.summary) && Intrinsics.e(this.rewards, mperksRewardEarnedDetail.rewards) && Intrinsics.e(this.redeemedRewards, mperksRewardEarnedDetail.redeemedRewards);
    }

    public int hashCode() {
        return (((this.summary.hashCode() * 31) + this.rewards.hashCode()) * 31) + this.redeemedRewards.hashCode();
    }

    public String toString() {
        return "MperksRewardEarnedDetail(summary=" + this.summary + ", rewards=" + this.rewards + ", redeemedRewards=" + this.redeemedRewards + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        this.summary.writeToParcel(dest, flags);
        List<ClippedReward> list = this.rewards;
        dest.writeInt(list.size());
        Iterator<ClippedReward> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<ClippedReward> list2 = this.redeemedRewards;
        dest.writeInt(list2.size());
        Iterator<ClippedReward> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
    }

    public MperksRewardEarnedDetail(RewardEarnedSummary summary, List<ClippedReward> rewards, List<ClippedReward> redeemedRewards) {
        Intrinsics.j(summary, "summary");
        Intrinsics.j(rewards, "rewards");
        Intrinsics.j(redeemedRewards, "redeemedRewards");
        this.summary = summary;
        this.rewards = rewards;
        this.redeemedRewards = redeemedRewards;
    }

    public final List<ClippedReward> getRedeemedRewards() {
        return this.redeemedRewards;
    }

    public final List<ClippedReward> getRewards() {
        return this.rewards;
    }

    public final RewardEarnedSummary getSummary() {
        return this.summary;
    }

    public /* synthetic */ MperksRewardEarnedDetail(RewardEarnedSummary rewardEarnedSummary, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new RewardEarnedSummary(0, 1, null) : rewardEarnedSummary, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2);
    }
}
