package co;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lco/i;", "", "<init>", "()V", "h", "m", "j", "a", "k", "f", "b", "l", "g", "c", "o", "n", "e", "d", "i", "Lco/i$a;", "Lco/i$b;", "Lco/i$c;", "Lco/i$d;", "Lco/i$e;", "Lco/i$f;", "Lco/i$g;", "Lco/i$h;", "Lco/i$i;", "Lco/i$j;", "Lco/i$k;", "Lco/i$l;", "Lco/i$m;", "Lco/i$n;", "Lco/i$o;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC6537i {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lco/i$a;", "Lco/i;", "", "enroll", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "<init>", "(ZLco/b;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lco/b;", "()Lco/b;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$a, reason: from toString */
    public static final /* data */ class AutoClaimEnroll extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enroll;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6530b autoClaimType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double autoClaimAmount;

        public AutoClaimEnroll(boolean z10, AbstractC6530b abstractC6530b, Double d10) {
            super(null);
            this.enroll = z10;
            this.autoClaimType = abstractC6530b;
            this.autoClaimAmount = d10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClaimEnroll)) {
                return false;
            }
            AutoClaimEnroll autoClaimEnroll = (AutoClaimEnroll) other;
            return this.enroll == autoClaimEnroll.enroll && Intrinsics.e(this.autoClaimType, autoClaimEnroll.autoClaimType) && Intrinsics.e(this.autoClaimAmount, autoClaimEnroll.autoClaimAmount);
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
            return "AutoClaimEnroll(enroll=" + this.enroll + ", autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lco/i$b;", "Lco/i;", "Lco/c;", "claimReward", "<init>", "(Lco/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/c;", "()Lco/c;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$b, reason: from toString */
    public static final /* data */ class BuyReward extends AbstractC6537i {

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/i$c;", "Lco/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$c */
    public static final /* data */ class c extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f62758a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public String toString() {
            return "DismissDisclaimer";
        }

        public int hashCode() {
            return -668263284;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lco/i$d;", "Lco/i;", "Lco/g;", "earnReward", "", "isBoosterReward", "", "navigatedFrom", "isShoppableReward", "<init>", "(Lco/g;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/g;", "()Lco/g;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$d, reason: from toString */
    public static final /* data */ class EarnRewardCardClicked extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EarnReward earnReward;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBoosterReward;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String navigatedFrom;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isShoppableReward;

        public /* synthetic */ EarnRewardCardClicked(EarnReward earnReward, boolean z10, String str, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(earnReward, z10, str, (i10 & 8) != 0 ? earnReward.getHasUpcs() : z11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarnRewardCardClicked)) {
                return false;
            }
            EarnRewardCardClicked earnRewardCardClicked = (EarnRewardCardClicked) other;
            return Intrinsics.e(this.earnReward, earnRewardCardClicked.earnReward) && this.isBoosterReward == earnRewardCardClicked.isBoosterReward && Intrinsics.e(this.navigatedFrom, earnRewardCardClicked.navigatedFrom) && this.isShoppableReward == earnRewardCardClicked.isShoppableReward;
        }

        /* renamed from: a, reason: from getter */
        public final EarnReward getEarnReward() {
            return this.earnReward;
        }

        /* renamed from: b, reason: from getter */
        public final String getNavigatedFrom() {
            return this.navigatedFrom;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsBoosterReward() {
            return this.isBoosterReward;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsShoppableReward() {
            return this.isShoppableReward;
        }

        public int hashCode() {
            return (((((this.earnReward.hashCode() * 31) + Boolean.hashCode(this.isBoosterReward)) * 31) + this.navigatedFrom.hashCode()) * 31) + Boolean.hashCode(this.isShoppableReward);
        }

        public String toString() {
            return "EarnRewardCardClicked(earnReward=" + this.earnReward + ", isBoosterReward=" + this.isBoosterReward + ", navigatedFrom=" + this.navigatedFrom + ", isShoppableReward=" + this.isShoppableReward + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnRewardCardClicked(EarnReward earnReward, boolean z10, String navigatedFrom, boolean z11) {
            super(null);
            Intrinsics.j(earnReward, "earnReward");
            Intrinsics.j(navigatedFrom, "navigatedFrom");
            this.earnReward = earnReward;
            this.isBoosterReward = z10;
            this.navigatedFrom = navigatedFrom;
            this.isShoppableReward = z11;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lco/i$e;", "Lco/i;", "", "isEarnTabAnalyticsSent", "Lco/f;", "tab", "<init>", "(ZLco/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lco/f;", "()Lco/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$e, reason: from toString */
    public static final /* data */ class EarnTabAnalyticsFlagUpdate extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEarnTabAnalyticsSent;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC6534f tab;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarnTabAnalyticsFlagUpdate)) {
                return false;
            }
            EarnTabAnalyticsFlagUpdate earnTabAnalyticsFlagUpdate = (EarnTabAnalyticsFlagUpdate) other;
            return this.isEarnTabAnalyticsSent == earnTabAnalyticsFlagUpdate.isEarnTabAnalyticsSent && this.tab == earnTabAnalyticsFlagUpdate.tab;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EarnTabAnalyticsFlagUpdate(boolean z10, EnumC6534f tab) {
            super(null);
            Intrinsics.j(tab, "tab");
            this.isEarnTabAnalyticsSent = z10;
            this.tab = tab;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC6534f getTab() {
            return this.tab;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsEarnTabAnalyticsSent() {
            return this.isEarnTabAnalyticsSent;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEarnTabAnalyticsSent) * 31) + this.tab.hashCode();
        }

        public String toString() {
            return "EarnTabAnalyticsFlagUpdate(isEarnTabAnalyticsSent=" + this.isEarnTabAnalyticsSent + ", tab=" + this.tab + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lco/i$f;", "Lco/i;", "", "isShowSwitchingButtons", "Lco/a;", "autoClaimReward", "<init>", "(ZLco/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lco/a;", "()Lco/a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$f, reason: from toString */
    public static final /* data */ class OnConfirmingSwitchClick extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isShowSwitchingButtons;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoClaimReward autoClaimReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnConfirmingSwitchClick)) {
                return false;
            }
            OnConfirmingSwitchClick onConfirmingSwitchClick = (OnConfirmingSwitchClick) other;
            return this.isShowSwitchingButtons == onConfirmingSwitchClick.isShowSwitchingButtons && Intrinsics.e(this.autoClaimReward, onConfirmingSwitchClick.autoClaimReward);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnConfirmingSwitchClick(boolean z10, AutoClaimReward autoClaimReward) {
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
            return "OnConfirmingSwitchClick(isShowSwitchingButtons=" + this.isShowSwitchingButtons + ", autoClaimReward=" + this.autoClaimReward + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lco/i$g;", "Lco/i;", "", "continuationToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$g, reason: from toString */
    public static final /* data */ class OnLoadMoreButtonClick extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String continuationToken;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnLoadMoreButtonClick) && Intrinsics.e(this.continuationToken, ((OnLoadMoreButtonClick) other).continuationToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadMoreButtonClick(String continuationToken) {
            super(null);
            Intrinsics.j(continuationToken, "continuationToken");
            this.continuationToken = continuationToken;
        }

        /* renamed from: a, reason: from getter */
        public final String getContinuationToken() {
            return this.continuationToken;
        }

        public int hashCode() {
            return this.continuationToken.hashCode();
        }

        public String toString() {
            return "OnLoadMoreButtonClick(continuationToken=" + this.continuationToken + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/i$h;", "Lco/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$h */
    public static final /* data */ class h extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name */
        public static final h f62768a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public String toString() {
            return "OnShopToSaveButtonClick";
        }

        public int hashCode() {
            return -686025136;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lco/i$i;", "Lco/i;", "", "rewardId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$i, reason: collision with other inner class name and from toString */
    public static final /* data */ class OnTrackShopNowButtonClick extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnTrackShopNowButtonClick) && Intrinsics.e(this.rewardId, ((OnTrackShopNowButtonClick) other).rewardId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTrackShopNowButtonClick(String rewardId) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            this.rewardId = rewardId;
        }

        /* renamed from: a, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        public int hashCode() {
            return this.rewardId.hashCode();
        }

        public String toString() {
            return "OnTrackShopNowButtonClick(rewardId=" + this.rewardId + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/i$j;", "Lco/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$j */
    public static final /* data */ class j extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name */
        public static final j f62770a = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public String toString() {
            return "RefetchClaimableRewards";
        }

        public int hashCode() {
            return -818635588;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lco/i$k;", "Lco/i;", "", "claimAction", "Lco/a;", "autoClaimReward", "<init>", "(Ljava/lang/String;Lco/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lco/a;", "()Lco/a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$k, reason: from toString */
    public static final /* data */ class TrackAutoClaimAction extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String claimAction;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AutoClaimReward autoClaimReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackAutoClaimAction)) {
                return false;
            }
            TrackAutoClaimAction trackAutoClaimAction = (TrackAutoClaimAction) other;
            return Intrinsics.e(this.claimAction, trackAutoClaimAction.claimAction) && Intrinsics.e(this.autoClaimReward, trackAutoClaimAction.autoClaimReward);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackAutoClaimAction(String claimAction, AutoClaimReward autoClaimReward) {
            super(null);
            Intrinsics.j(claimAction, "claimAction");
            Intrinsics.j(autoClaimReward, "autoClaimReward");
            this.claimAction = claimAction;
            this.autoClaimReward = autoClaimReward;
        }

        /* renamed from: a, reason: from getter */
        public final AutoClaimReward getAutoClaimReward() {
            return this.autoClaimReward;
        }

        /* renamed from: b, reason: from getter */
        public final String getClaimAction() {
            return this.claimAction;
        }

        public int hashCode() {
            return (this.claimAction.hashCode() * 31) + this.autoClaimReward.hashCode();
        }

        public String toString() {
            return "TrackAutoClaimAction(claimAction=" + this.claimAction + ", autoClaimReward=" + this.autoClaimReward + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lco/i$l;", "Lco/i;", "", "rewardAction", "Lco/c;", "claimReward", "<init>", "(Ljava/lang/String;Lco/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lco/c;", "()Lco/c;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$l, reason: from toString */
    public static final /* data */ class TrackClaimRewardFromCart extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardAction;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ClaimReward claimReward;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackClaimRewardFromCart)) {
                return false;
            }
            TrackClaimRewardFromCart trackClaimRewardFromCart = (TrackClaimRewardFromCart) other;
            return Intrinsics.e(this.rewardAction, trackClaimRewardFromCart.rewardAction) && Intrinsics.e(this.claimReward, trackClaimRewardFromCart.claimReward);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackClaimRewardFromCart(String rewardAction, ClaimReward claimReward) {
            super(null);
            Intrinsics.j(rewardAction, "rewardAction");
            Intrinsics.j(claimReward, "claimReward");
            this.rewardAction = rewardAction;
            this.claimReward = claimReward;
        }

        /* renamed from: a, reason: from getter */
        public final ClaimReward getClaimReward() {
            return this.claimReward;
        }

        /* renamed from: b, reason: from getter */
        public final String getRewardAction() {
            return this.rewardAction;
        }

        public int hashCode() {
            return (this.rewardAction.hashCode() * 31) + this.claimReward.hashCode();
        }

        public String toString() {
            return "TrackClaimRewardFromCart(rewardAction=" + this.rewardAction + ", claimReward=" + this.claimReward + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/i$m;", "Lco/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$m */
    public static final /* data */ class m extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name */
        public static final m f62775a = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public String toString() {
            return "TrackClaimTabState";
        }

        public int hashCode() {
            return -880548122;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lco/i$n;", "Lco/i;", "Lco/f;", "earnPills", "<init>", "(Lco/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/f;", "()Lco/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$n, reason: from toString */
    public static final /* data */ class TrackEarnPillState extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC6534f earnPills;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrackEarnPillState) && this.earnPills == ((TrackEarnPillState) other).earnPills;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackEarnPillState(EnumC6534f earnPills) {
            super(null);
            Intrinsics.j(earnPills, "earnPills");
            this.earnPills = earnPills;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC6534f getEarnPills() {
            return this.earnPills;
        }

        public int hashCode() {
            return this.earnPills.hashCode();
        }

        public String toString() {
            return "TrackEarnPillState(earnPills=" + this.earnPills + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/i$o;", "Lco/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.i$o */
    public static final /* data */ class o extends AbstractC6537i {

        /* renamed from: a, reason: collision with root package name */
        public static final o f62777a = new o();

        private o() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        public String toString() {
            return "TrackRewardsTabState";
        }

        public int hashCode() {
            return 55476814;
        }
    }

    public /* synthetic */ AbstractC6537i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6537i() {
    }
}
