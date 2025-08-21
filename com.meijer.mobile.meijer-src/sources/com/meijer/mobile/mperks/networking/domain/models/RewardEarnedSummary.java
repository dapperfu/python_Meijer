package com.meijer.mobile.mperks.networking.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardEarnedSummary;", "Landroid/os/Parcelable;", "earnedCount", "", "<init>", "(I)V", "getEarnedCount", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardEarnedSummary implements Parcelable {
    public static final Parcelable.Creator<RewardEarnedSummary> CREATOR = new Creator();
    private final int earnedCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardEarnedSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardEarnedSummary createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new RewardEarnedSummary(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardEarnedSummary[] newArray(int i10) {
            return new RewardEarnedSummary[i10];
        }
    }

    public RewardEarnedSummary() {
        this(0, 1, null);
    }

    public static /* synthetic */ RewardEarnedSummary copy$default(RewardEarnedSummary rewardEarnedSummary, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = rewardEarnedSummary.earnedCount;
        }
        return rewardEarnedSummary.copy(i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEarnedCount() {
        return this.earnedCount;
    }

    public final RewardEarnedSummary copy(int earnedCount) {
        return new RewardEarnedSummary(earnedCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardEarnedSummary) && this.earnedCount == ((RewardEarnedSummary) other).earnedCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.earnedCount);
    }

    public String toString() {
        return "RewardEarnedSummary(earnedCount=" + this.earnedCount + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.earnedCount);
    }

    public RewardEarnedSummary(int i10) {
        this.earnedCount = i10;
    }

    public final int getEarnedCount() {
        return this.earnedCount;
    }

    public /* synthetic */ RewardEarnedSummary(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
