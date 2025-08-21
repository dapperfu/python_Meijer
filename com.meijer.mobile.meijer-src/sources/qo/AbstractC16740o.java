package qo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lqo/o;", "", "<init>", "()V", "c", "b", "a", "Lqo/o$a;", "Lqo/o$b;", "Lqo/o$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qo.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC16740o {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lqo/o$a;", "Lqo/o;", "", "rewardId", "rewardValidThruDate", "daysLeftToApply", "mperksPoints", "previousTrackAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "getPreviousTrackAction", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qo.o$a, reason: from toString */
    public static final /* data */ class AnalyticsRewardDetailsPage extends AbstractC16740o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardValidThruDate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String daysLeftToApply;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mperksPoints;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsRewardDetailsPage)) {
                return false;
            }
            AnalyticsRewardDetailsPage analyticsRewardDetailsPage = (AnalyticsRewardDetailsPage) other;
            return Intrinsics.e(this.rewardId, analyticsRewardDetailsPage.rewardId) && Intrinsics.e(this.rewardValidThruDate, analyticsRewardDetailsPage.rewardValidThruDate) && Intrinsics.e(this.daysLeftToApply, analyticsRewardDetailsPage.daysLeftToApply) && Intrinsics.e(this.mperksPoints, analyticsRewardDetailsPage.mperksPoints) && Intrinsics.e(this.previousTrackAction, analyticsRewardDetailsPage.previousTrackAction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnalyticsRewardDetailsPage(String rewardId, String str, String daysLeftToApply, String mperksPoints, String previousTrackAction) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(daysLeftToApply, "daysLeftToApply");
            Intrinsics.j(mperksPoints, "mperksPoints");
            Intrinsics.j(previousTrackAction, "previousTrackAction");
            this.rewardId = rewardId;
            this.rewardValidThruDate = str;
            this.daysLeftToApply = daysLeftToApply;
            this.mperksPoints = mperksPoints;
            this.previousTrackAction = previousTrackAction;
        }

        /* renamed from: a, reason: from getter */
        public final String getDaysLeftToApply() {
            return this.daysLeftToApply;
        }

        /* renamed from: b, reason: from getter */
        public final String getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: d, reason: from getter */
        public final String getRewardValidThruDate() {
            return this.rewardValidThruDate;
        }

        public int hashCode() {
            int iHashCode = this.rewardId.hashCode() * 31;
            String str = this.rewardValidThruDate;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.daysLeftToApply.hashCode()) * 31) + this.mperksPoints.hashCode()) * 31) + this.previousTrackAction.hashCode();
        }

        public String toString() {
            return "AnalyticsRewardDetailsPage(rewardId=" + this.rewardId + ", rewardValidThruDate=" + this.rewardValidThruDate + ", daysLeftToApply=" + this.daysLeftToApply + ", mperksPoints=" + this.mperksPoints + ", previousTrackAction=" + this.previousTrackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lqo/o$b;", "Lqo/o;", "", "mperksPoints", "", "availableRewardIds", "previousTrackAction", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qo.o$b, reason: from toString */
    public static final /* data */ class AnalyticsRewardsAction extends AbstractC16740o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mperksPoints;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> availableRewardIds;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousTrackAction;

        public AnalyticsRewardsAction(String str, List<String> list, String str2) {
            super(null);
            this.mperksPoints = str;
            this.availableRewardIds = list;
            this.previousTrackAction = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsRewardsAction)) {
                return false;
            }
            AnalyticsRewardsAction analyticsRewardsAction = (AnalyticsRewardsAction) other;
            return Intrinsics.e(this.mperksPoints, analyticsRewardsAction.mperksPoints) && Intrinsics.e(this.availableRewardIds, analyticsRewardsAction.availableRewardIds) && Intrinsics.e(this.previousTrackAction, analyticsRewardsAction.previousTrackAction);
        }

        public final List<String> a() {
            return this.availableRewardIds;
        }

        /* renamed from: b, reason: from getter */
        public final String getMperksPoints() {
            return this.mperksPoints;
        }

        /* renamed from: c, reason: from getter */
        public final String getPreviousTrackAction() {
            return this.previousTrackAction;
        }

        public int hashCode() {
            String str = this.mperksPoints;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.availableRewardIds;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.previousTrackAction;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AnalyticsRewardsAction(mperksPoints=" + this.mperksPoints + ", availableRewardIds=" + this.availableRewardIds + ", previousTrackAction=" + this.previousTrackAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqo/o$c;", "Lqo/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qo.o$c */
    public static final /* data */ class c extends AbstractC16740o {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158878a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public String toString() {
            return "FetchRewards";
        }

        public int hashCode() {
            return -123837554;
        }
    }

    public /* synthetic */ AbstractC16740o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC16740o() {
    }
}
