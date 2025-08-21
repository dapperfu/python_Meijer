package ko;

import co.AbstractC6530b;
import co.AutoClaimReward;
import co.ClaimReward;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lko/a;", "", "<init>", "()V", "c", "b", "f", "e", "g", "a", "d", "Lko/a$a;", "Lko/a$b;", "Lko/a$c;", "Lko/a$d;", "Lko/a$e;", "Lko/a$f;", "Lko/a$g;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ko.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC15303a {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lko/a$a;", "Lko/a;", "", "enroll", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "<init>", "(ZLco/b;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lco/b;", "()Lco/b;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AutoClaimAction extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enroll;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6530b autoClaimType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double autoClaimAmount;

        public AutoClaimAction(boolean z10, AbstractC6530b abstractC6530b, Double d10) {
            super(null);
            this.enroll = z10;
            this.autoClaimType = abstractC6530b;
            this.autoClaimAmount = d10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClaimAction)) {
                return false;
            }
            AutoClaimAction autoClaimAction = (AutoClaimAction) other;
            return this.enroll == autoClaimAction.enroll && Intrinsics.e(this.autoClaimType, autoClaimAction.autoClaimType) && Intrinsics.e(this.autoClaimAmount, autoClaimAction.autoClaimAmount);
        }

        /* renamed from: a, reason: from getter */
        public final Double getAutoClaimAmount() {
            return this.autoClaimAmount;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6530b getAutoClaimType() {
            return this.autoClaimType;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getEnroll() {
            return this.enroll;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.enroll) * 31;
            AbstractC6530b abstractC6530b = this.autoClaimType;
            int iHashCode2 = (iHashCode + (abstractC6530b == null ? 0 : abstractC6530b.hashCode())) * 31;
            Double d10 = this.autoClaimAmount;
            return iHashCode2 + (d10 != null ? d10.hashCode() : 0);
        }

        public String toString() {
            return "AutoClaimAction(enroll=" + this.enroll + ", autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lko/a$b;", "Lko/a;", "Lco/c;", "claimReward", "<init>", "(Lco/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/c;", "()Lco/c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$b, reason: from toString */
    public static final /* data */ class BuyReward extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ClaimReward claimReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BuyReward) && Intrinsics.e(this.claimReward, ((BuyReward) other).claimReward);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyReward(ClaimReward claimReward) {
            super(null);
            Intrinsics.j(claimReward, "claimReward");
            this.claimReward = claimReward;
        }

        /* renamed from: a, reason: from getter */
        public final ClaimReward getClaimReward() {
            return this.claimReward;
        }

        public int hashCode() {
            return this.claimReward.hashCode();
        }

        public String toString() {
            return "BuyReward(claimReward=" + this.claimReward + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lko/a$c;", "Lko/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$c */
    public static final /* data */ class c extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f143091a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public String toString() {
            return "RefetchClaimableRewards";
        }

        public int hashCode() {
            return -321331147;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lko/a$d;", "Lko/a;", "", "isShowSwitchingButtons", "Lco/a;", "autoClaimReward", "<init>", "(ZLco/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lco/a;", "()Lco/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$d, reason: from toString */
    public static final /* data */ class ShowSwitchingButtonsAction extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isShowSwitchingButtons;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoClaimReward autoClaimReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSwitchingButtonsAction)) {
                return false;
            }
            ShowSwitchingButtonsAction showSwitchingButtonsAction = (ShowSwitchingButtonsAction) other;
            return this.isShowSwitchingButtons == showSwitchingButtonsAction.isShowSwitchingButtons && Intrinsics.e(this.autoClaimReward, showSwitchingButtonsAction.autoClaimReward);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSwitchingButtonsAction(boolean z10, AutoClaimReward autoClaimReward) {
            super(null);
            Intrinsics.j(autoClaimReward, "autoClaimReward");
            this.isShowSwitchingButtons = z10;
            this.autoClaimReward = autoClaimReward;
        }

        /* renamed from: a, reason: from getter */
        public final AutoClaimReward getAutoClaimReward() {
            return this.autoClaimReward;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsShowSwitchingButtons() {
            return this.isShowSwitchingButtons;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isShowSwitchingButtons) * 31) + this.autoClaimReward.hashCode();
        }

        public String toString() {
            return "ShowSwitchingButtonsAction(isShowSwitchingButtons=" + this.isShowSwitchingButtons + ", autoClaimReward=" + this.autoClaimReward + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, d2 = {"Lko/a$e;", "Lko/a;", "", "rewardId", "rewardValidThrough", "daysLeftToRedeem", "rewardStatus", "", "mperksPoints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$e, reason: from toString */
    public static final /* data */ class TrackClaimRewardCardClicked extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardValidThrough;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String daysLeftToRedeem;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardStatus;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackClaimRewardCardClicked)) {
                return false;
            }
            TrackClaimRewardCardClicked trackClaimRewardCardClicked = (TrackClaimRewardCardClicked) other;
            return Intrinsics.e(this.rewardId, trackClaimRewardCardClicked.rewardId) && Intrinsics.e(this.rewardValidThrough, trackClaimRewardCardClicked.rewardValidThrough) && Intrinsics.e(this.daysLeftToRedeem, trackClaimRewardCardClicked.daysLeftToRedeem) && Intrinsics.e(this.rewardStatus, trackClaimRewardCardClicked.rewardStatus) && this.mperksPoints == trackClaimRewardCardClicked.mperksPoints;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackClaimRewardCardClicked(String rewardId, String rewardValidThrough, String daysLeftToRedeem, String rewardStatus, int i10) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardValidThrough, "rewardValidThrough");
            Intrinsics.j(daysLeftToRedeem, "daysLeftToRedeem");
            Intrinsics.j(rewardStatus, "rewardStatus");
            this.rewardId = rewardId;
            this.rewardValidThrough = rewardValidThrough;
            this.daysLeftToRedeem = daysLeftToRedeem;
            this.rewardStatus = rewardStatus;
            this.mperksPoints = i10;
        }

        /* renamed from: a, reason: from getter */
        public final String getDaysLeftToRedeem() {
            return this.daysLeftToRedeem;
        }

        /* renamed from: b, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardStatus() {
            return this.rewardStatus;
        }

        /* renamed from: e, reason: from getter */
        public final String getRewardValidThrough() {
            return this.rewardValidThrough;
        }

        public int hashCode() {
            return (((((((this.rewardId.hashCode() * 31) + this.rewardValidThrough.hashCode()) * 31) + this.daysLeftToRedeem.hashCode()) * 31) + this.rewardStatus.hashCode()) * 31) + Integer.hashCode(this.mperksPoints);
        }

        public String toString() {
            return "TrackClaimRewardCardClicked(rewardId=" + this.rewardId + ", rewardValidThrough=" + this.rewardValidThrough + ", daysLeftToRedeem=" + this.daysLeftToRedeem + ", rewardStatus=" + this.rewardStatus + ", mperksPoints=" + this.mperksPoints + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lko/a$f;", "Lko/a;", "", "mperksPoints", "", "", "claimRewardIds", "previousTrackAction", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$f, reason: from toString */
    public static final /* data */ class TrackClaimTabSelected extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> claimRewardIds;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        public TrackClaimTabSelected(int i10, List<String> list, String str) {
            super(null);
            this.mperksPoints = i10;
            this.claimRewardIds = list;
            this.previousTrackAction = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackClaimTabSelected)) {
                return false;
            }
            TrackClaimTabSelected trackClaimTabSelected = (TrackClaimTabSelected) other;
            return this.mperksPoints == trackClaimTabSelected.mperksPoints && Intrinsics.e(this.claimRewardIds, trackClaimTabSelected.claimRewardIds) && Intrinsics.e(this.previousTrackAction, trackClaimTabSelected.previousTrackAction);
        }

        public final List<String> a() {
            return this.claimRewardIds;
        }

        /* renamed from: b, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getPreviousTrackAction() {
            return this.previousTrackAction;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.mperksPoints) * 31;
            List<String> list = this.claimRewardIds;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.previousTrackAction;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "TrackClaimTabSelected(mperksPoints=" + this.mperksPoints + ", claimRewardIds=" + this.claimRewardIds + ", previousTrackAction=" + this.previousTrackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001d"}, d2 = {"Lko/a$g;", "Lko/a;", "", "rewardId", "rewardValidThrough", "daysLeftToRedeem", "rewardLocation", "", "pointsUsed", "mperksPoints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ko.a$g, reason: from toString */
    public static final /* data */ class TrackRewardClaimedAction extends AbstractC15303a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardValidThrough;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String daysLeftToRedeem;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardLocation;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pointsUsed;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mperksPoints;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackRewardClaimedAction)) {
                return false;
            }
            TrackRewardClaimedAction trackRewardClaimedAction = (TrackRewardClaimedAction) other;
            return Intrinsics.e(this.rewardId, trackRewardClaimedAction.rewardId) && Intrinsics.e(this.rewardValidThrough, trackRewardClaimedAction.rewardValidThrough) && Intrinsics.e(this.daysLeftToRedeem, trackRewardClaimedAction.daysLeftToRedeem) && Intrinsics.e(this.rewardLocation, trackRewardClaimedAction.rewardLocation) && this.pointsUsed == trackRewardClaimedAction.pointsUsed && this.mperksPoints == trackRewardClaimedAction.mperksPoints;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackRewardClaimedAction(String str, String rewardValidThrough, String daysLeftToRedeem, String rewardLocation, int i10, int i11) {
            super(null);
            Intrinsics.j(rewardValidThrough, "rewardValidThrough");
            Intrinsics.j(daysLeftToRedeem, "daysLeftToRedeem");
            Intrinsics.j(rewardLocation, "rewardLocation");
            this.rewardId = str;
            this.rewardValidThrough = rewardValidThrough;
            this.daysLeftToRedeem = daysLeftToRedeem;
            this.rewardLocation = rewardLocation;
            this.pointsUsed = i10;
            this.mperksPoints = i11;
        }

        /* renamed from: a, reason: from getter */
        public final String getDaysLeftToRedeem() {
            return this.daysLeftToRedeem;
        }

        /* renamed from: b, reason: from getter */
        public final int getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final int getPointsUsed() {
            return this.pointsUsed;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: e, reason: from getter */
        public final String getRewardLocation() {
            return this.rewardLocation;
        }

        /* renamed from: f, reason: from getter */
        public final String getRewardValidThrough() {
            return this.rewardValidThrough;
        }

        public int hashCode() {
            String str = this.rewardId;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.rewardValidThrough.hashCode()) * 31) + this.daysLeftToRedeem.hashCode()) * 31) + this.rewardLocation.hashCode()) * 31) + Integer.hashCode(this.pointsUsed)) * 31) + Integer.hashCode(this.mperksPoints);
        }

        public String toString() {
            return "TrackRewardClaimedAction(rewardId=" + this.rewardId + ", rewardValidThrough=" + this.rewardValidThrough + ", daysLeftToRedeem=" + this.daysLeftToRedeem + ", rewardLocation=" + this.rewardLocation + ", pointsUsed=" + this.pointsUsed + ", mperksPoints=" + this.mperksPoints + ')';
        }
    }

    public /* synthetic */ AbstractC15303a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15303a() {
    }
}
