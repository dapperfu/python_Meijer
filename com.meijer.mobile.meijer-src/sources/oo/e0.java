package oo;

import co.EnumC6534f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Loo/e0;", "", "<init>", "()V", "b", "d", "c", "a", "Loo/e0$a;", "Loo/e0$b;", "Loo/e0$c;", "Loo/e0$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class e0 {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loo/e0$a;", "Loo/e0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends e0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f155210a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public String toString() {
            return "LoadGoogleAdManager";
        }

        public int hashCode() {
            return -1522744970;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, d2 = {"Loo/e0$b;", "Loo/e0;", "", "rewardId", "rewardStatus", "", "daysLeftToEarn", "rewardEarnThrough", "mperksPoints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oo.e0$b, reason: from toString */
    public static final /* data */ class TrackAvailableRewardCardClicked extends e0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardStatus;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int daysLeftToEarn;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardEarnThrough;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackAvailableRewardCardClicked)) {
                return false;
            }
            TrackAvailableRewardCardClicked trackAvailableRewardCardClicked = (TrackAvailableRewardCardClicked) other;
            return Intrinsics.e(this.rewardId, trackAvailableRewardCardClicked.rewardId) && Intrinsics.e(this.rewardStatus, trackAvailableRewardCardClicked.rewardStatus) && this.daysLeftToEarn == trackAvailableRewardCardClicked.daysLeftToEarn && Intrinsics.e(this.rewardEarnThrough, trackAvailableRewardCardClicked.rewardEarnThrough) && this.mperksPoints == trackAvailableRewardCardClicked.mperksPoints;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackAvailableRewardCardClicked(String rewardId, String rewardStatus, int i10, String rewardEarnThrough, int i11) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardStatus, "rewardStatus");
            Intrinsics.j(rewardEarnThrough, "rewardEarnThrough");
            this.rewardId = rewardId;
            this.rewardStatus = rewardStatus;
            this.daysLeftToEarn = i10;
            this.rewardEarnThrough = rewardEarnThrough;
            this.mperksPoints = i11;
        }

        /* renamed from: a, reason: from getter */
        public final int getDaysLeftToEarn() {
            return this.daysLeftToEarn;
        }

        /* renamed from: b, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getRewardEarnThrough() {
            return this.rewardEarnThrough;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: e, reason: from getter */
        public final String getRewardStatus() {
            return this.rewardStatus;
        }

        public int hashCode() {
            return (((((((this.rewardId.hashCode() * 31) + this.rewardStatus.hashCode()) * 31) + Integer.hashCode(this.daysLeftToEarn)) * 31) + this.rewardEarnThrough.hashCode()) * 31) + Integer.hashCode(this.mperksPoints);
        }

        public String toString() {
            return "TrackAvailableRewardCardClicked(rewardId=" + this.rewardId + ", rewardStatus=" + this.rewardStatus + ", daysLeftToEarn=" + this.daysLeftToEarn + ", rewardEarnThrough=" + this.rewardEarnThrough + ", mperksPoints=" + this.mperksPoints + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\r¨\u0006\u001e"}, d2 = {"Loo/e0$c;", "Loo/e0;", "", "mperksPoints", "Lco/f;", "earnPills", "", "rewardsAvailable", "rewardsInProgress", "previousTrackAction", "<init>", "(ILco/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lco/f;", "()Lco/f;", "c", "Ljava/lang/String;", "d", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oo.e0$c, reason: from toString */
    public static final /* data */ class TrackEarnPillsSelected extends e0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC6534f earnPills;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardsAvailable;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardsInProgress;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackEarnPillsSelected)) {
                return false;
            }
            TrackEarnPillsSelected trackEarnPillsSelected = (TrackEarnPillsSelected) other;
            return this.mperksPoints == trackEarnPillsSelected.mperksPoints && this.earnPills == trackEarnPillsSelected.earnPills && Intrinsics.e(this.rewardsAvailable, trackEarnPillsSelected.rewardsAvailable) && Intrinsics.e(this.rewardsInProgress, trackEarnPillsSelected.rewardsInProgress) && Intrinsics.e(this.previousTrackAction, trackEarnPillsSelected.previousTrackAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackEarnPillsSelected(int i10, EnumC6534f earnPills, String str, String str2, String str3) {
            super(null);
            Intrinsics.j(earnPills, "earnPills");
            this.mperksPoints = i10;
            this.earnPills = earnPills;
            this.rewardsAvailable = str;
            this.rewardsInProgress = str2;
            this.previousTrackAction = str3;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC6534f getEarnPills() {
            return this.earnPills;
        }

        /* renamed from: b, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getPreviousTrackAction() {
            return this.previousTrackAction;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardsAvailable() {
            return this.rewardsAvailable;
        }

        /* renamed from: e, reason: from getter */
        public final String getRewardsInProgress() {
            return this.rewardsInProgress;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.mperksPoints) * 31) + this.earnPills.hashCode()) * 31;
            String str = this.rewardsAvailable;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rewardsInProgress;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.previousTrackAction;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "TrackEarnPillsSelected(mperksPoints=" + this.mperksPoints + ", earnPills=" + this.earnPills + ", rewardsAvailable=" + this.rewardsAvailable + ", rewardsInProgress=" + this.rewardsInProgress + ", previousTrackAction=" + this.previousTrackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Loo/e0$d;", "Loo/e0;", "", "rewardId", "rewardStatus", "", "daysLeftToEarn", "rewardEarnThrough", "mperksPoints", "", "boosterReward", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "I", "d", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oo.e0$d, reason: from toString */
    public static final /* data */ class TrackInProgressRewardCardClicked extends e0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardStatus;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int daysLeftToEarn;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardEarnThrough;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean boosterReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackInProgressRewardCardClicked)) {
                return false;
            }
            TrackInProgressRewardCardClicked trackInProgressRewardCardClicked = (TrackInProgressRewardCardClicked) other;
            return Intrinsics.e(this.rewardId, trackInProgressRewardCardClicked.rewardId) && Intrinsics.e(this.rewardStatus, trackInProgressRewardCardClicked.rewardStatus) && this.daysLeftToEarn == trackInProgressRewardCardClicked.daysLeftToEarn && Intrinsics.e(this.rewardEarnThrough, trackInProgressRewardCardClicked.rewardEarnThrough) && this.mperksPoints == trackInProgressRewardCardClicked.mperksPoints && this.boosterReward == trackInProgressRewardCardClicked.boosterReward;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackInProgressRewardCardClicked(String rewardId, String rewardStatus, int i10, String rewardEarnThrough, int i11, boolean z10) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardStatus, "rewardStatus");
            Intrinsics.j(rewardEarnThrough, "rewardEarnThrough");
            this.rewardId = rewardId;
            this.rewardStatus = rewardStatus;
            this.daysLeftToEarn = i10;
            this.rewardEarnThrough = rewardEarnThrough;
            this.mperksPoints = i11;
            this.boosterReward = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getBoosterReward() {
            return this.boosterReward;
        }

        /* renamed from: b, reason: from getter */
        public final int getDaysLeftToEarn() {
            return this.daysLeftToEarn;
        }

        /* renamed from: c, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardEarnThrough() {
            return this.rewardEarnThrough;
        }

        /* renamed from: e, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: f, reason: from getter */
        public final String getRewardStatus() {
            return this.rewardStatus;
        }

        public int hashCode() {
            return (((((((((this.rewardId.hashCode() * 31) + this.rewardStatus.hashCode()) * 31) + Integer.hashCode(this.daysLeftToEarn)) * 31) + this.rewardEarnThrough.hashCode()) * 31) + Integer.hashCode(this.mperksPoints)) * 31) + Boolean.hashCode(this.boosterReward);
        }

        public String toString() {
            return "TrackInProgressRewardCardClicked(rewardId=" + this.rewardId + ", rewardStatus=" + this.rewardStatus + ", daysLeftToEarn=" + this.daysLeftToEarn + ", rewardEarnThrough=" + this.rewardEarnThrough + ", mperksPoints=" + this.mperksPoints + ", boosterReward=" + this.boosterReward + ')';
        }
    }

    public /* synthetic */ e0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e0() {
    }
}
