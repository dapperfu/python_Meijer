package com.meijer.mobile.mperks.networking.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;", "Landroid/os/Parcelable;", "summary", "Lcom/meijer/mobile/mperks/networking/domain/models/Summary;", "rewards", "", "Lcom/meijer/mobile/mperks/networking/domain/models/EarnedReward;", "redeemedRewards", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/Summary;Ljava/util/List;Ljava/util/List;)V", "getSummary", "()Lcom/meijer/mobile/mperks/networking/domain/models/Summary;", "getRewards", "()Ljava/util/List;", "getRedeemedRewards", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksRewardEarnedResponse implements Parcelable {
    public static final Parcelable.Creator<MperksRewardEarnedResponse> CREATOR = new Creator();
    private final List<EarnedReward> redeemedRewards;
    private final List<EarnedReward> rewards;
    private final Summary summary;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MperksRewardEarnedResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MperksRewardEarnedResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            ArrayList arrayList2 = null;
            Summary summaryCreateFromParcel = parcel.readInt() == 0 ? null : Summary.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(EarnedReward.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(EarnedReward.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new MperksRewardEarnedResponse(summaryCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MperksRewardEarnedResponse[] newArray(int i10) {
            return new MperksRewardEarnedResponse[i10];
        }
    }

    public MperksRewardEarnedResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksRewardEarnedResponse copy$default(MperksRewardEarnedResponse mperksRewardEarnedResponse, Summary summary, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            summary = mperksRewardEarnedResponse.summary;
        }
        if ((i10 & 2) != 0) {
            list = mperksRewardEarnedResponse.rewards;
        }
        if ((i10 & 4) != 0) {
            list2 = mperksRewardEarnedResponse.redeemedRewards;
        }
        return mperksRewardEarnedResponse.copy(summary, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    public final List<EarnedReward> component2() {
        return this.rewards;
    }

    public final List<EarnedReward> component3() {
        return this.redeemedRewards;
    }

    public final MperksRewardEarnedResponse copy(@g(name = "summary") Summary summary, @g(name = "rewards") List<EarnedReward> rewards, @g(name = "redeemedRewards") List<EarnedReward> redeemedRewards) {
        return new MperksRewardEarnedResponse(summary, rewards, redeemedRewards);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        Summary summary = this.summary;
        int iHashCode = (summary == null ? 0 : summary.hashCode()) * 31;
        List<EarnedReward> list = this.rewards;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<EarnedReward> list2 = this.redeemedRewards;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "MperksRewardEarnedResponse(summary=" + this.summary + ", rewards=" + this.rewards + ", redeemedRewards=" + this.redeemedRewards + ')';
    }

    public MperksRewardEarnedResponse(@g(name = "summary") Summary summary, @g(name = "rewards") List<EarnedReward> list, @g(name = "redeemedRewards") List<EarnedReward> list2) {
        this.summary = summary;
        this.rewards = list;
        this.redeemedRewards = list2;
    }

    public final List<EarnedReward> getRedeemedRewards() {
        return this.redeemedRewards;
    }

    public final List<EarnedReward> getRewards() {
        return this.rewards;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Summary summary = this.summary;
        if (summary == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            summary.writeToParcel(dest, flags);
        }
        List<EarnedReward> list = this.rewards;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<EarnedReward> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<EarnedReward> list2 = this.redeemedRewards;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<EarnedReward> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MperksRewardEarnedResponse(Summary summary, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : summary, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2);
    }
}
