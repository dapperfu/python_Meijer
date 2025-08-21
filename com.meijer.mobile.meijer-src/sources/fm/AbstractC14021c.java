package fm;

import Wl.HomeMperksClippedReward;
import co.ClaimReward;
import co.RewardDetail;
import fm.AbstractC14021c;
import gm.HomeMperksDecorator;
import ii.C14756c;
import ii.C14760g;
import ii.InterfaceC14754a;
import ii.TrackingData;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import wk.C17898a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lfm/c;", "Lii/a;", "<init>", "()V", "c", "a", "g", "i", "h", "d", "f", "e", "b", "Lfm/c$a;", "Lfm/c$b;", "Lfm/c$c;", "Lfm/c$d;", "Lfm/c$e;", "Lfm/c$f;", "Lfm/c$g;", "Lfm/c$h;", "Lfm/c$i;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC14021c implements InterfaceC14754a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfm/c$a;", "Lfm/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.c$a */
    public static final /* data */ class a extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f132024a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public String toString() {
            return "MperksRetryActionClicked";
        }

        public int hashCode() {
            return 48157924;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010#¨\u0006$"}, d2 = {"Lfm/c$b;", "Lfm/c;", "Lco/c;", "reward", "", "pointBalance", "j$/time/ZonedDateTime", "zonedDateTime", "Lii/f;", "trackingData", "<init>", "(Lco/c;ILj$/time/ZonedDateTime;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/c;", "getReward", "()Lco/c;", "b", "I", "getPointBalance", "c", "Lj$/time/ZonedDateTime;", "getZonedDateTime", "()Lj$/time/ZonedDateTime;", "d", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.c$b, reason: from toString */
    public static final /* data */ class OnClaimForButtonClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ClaimReward reward;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pointBalance;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZonedDateTime zonedDateTime;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OnClaimForButtonClicked(final ClaimReward claimReward, final int i10, final ZonedDateTime zonedDateTime, TrackingData trackingData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            zonedDateTime = (i11 & 4) != 0 ? ZonedDateTime.now() : zonedDateTime;
            this(claimReward, i10, zonedDateTime, (i11 & 8) != 0 ? C14760g.a(C14756c.a("mPerks:Reward Claimed"), new Function1() { // from class: fm.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.OnClaimForButtonClicked.c(claimReward, zonedDateTime, i10, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnClaimForButtonClicked)) {
                return false;
            }
            OnClaimForButtonClicked onClaimForButtonClicked = (OnClaimForButtonClicked) other;
            return Intrinsics.e(this.reward, onClaimForButtonClicked.reward) && this.pointBalance == onClaimForButtonClicked.pointBalance && Intrinsics.e(this.zonedDateTime, onClaimForButtonClicked.zonedDateTime) && Intrinsics.e(this.trackingData, onClaimForButtonClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(ClaimReward claimReward, ZonedDateTime zonedDateTime, int i10, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("rewardID", claimReward.getCouponId() + ':' + claimReward.getName());
            ZonedDateTime displayEnd = claimReward.getDisplayEnd();
            String str = displayEnd != null ? displayEnd.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null;
            if (str == null) {
                str = "";
            }
            TrackingData.h("rewardValidThrough", str);
            TrackingData.h("daysLeftToRedeem", String.valueOf(ChronoUnit.DAYS.between(zonedDateTime, claimReward.getDisplayEnd())));
            TrackingData.h("rewardLocation", "mPerks homescreen carousel");
            TrackingData.h("pointsUsed", String.valueOf(claimReward.getPointCost()));
            TrackingData.h("mperksPoints", String.valueOf(i10 - claimReward.getPointCost()));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = ((((this.reward.hashCode() * 31) + Integer.hashCode(this.pointBalance)) * 31) + this.zonedDateTime.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "OnClaimForButtonClicked(reward=" + this.reward + ", pointBalance=" + this.pointBalance + ", zonedDateTime=" + this.zonedDateTime + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnClaimForButtonClicked(ClaimReward reward, int i10, ZonedDateTime zonedDateTime, TrackingData trackingData) {
            super(null);
            Intrinsics.j(reward, "reward");
            Intrinsics.j(zonedDateTime, "zonedDateTime");
            this.reward = reward;
            this.pointBalance = i10;
            this.zonedDateTime = zonedDateTime;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfm/c$c;", "Lfm/c;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class OnClaimRewardClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long couponId;

        public OnClaimRewardClicked(long j10) {
            super(null);
            this.couponId = j10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnClaimRewardClicked) && this.couponId == ((OnClaimRewardClicked) other).couponId;
        }

        /* renamed from: b, reason: from getter */
        public final long getCouponId() {
            return this.couponId;
        }

        public int hashCode() {
            return Long.hashCode(this.couponId);
        }

        public String toString() {
            return "OnClaimRewardClicked(couponId=" + this.couponId + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfm/c$d;", "Lfm/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.c$d */
    public static final /* data */ class d extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f132030a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public String toString() {
            return "OnLearnMoreClicked";
        }

        public int hashCode() {
            return -1725772560;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfm/c$e;", "Lfm/c;", "Lgm/b;", "decorator", "Lii/f;", "trackingData", "<init>", "(Lgm/b;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm/b;", "getDecorator", "()Lgm/b;", "b", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fm.c$e, reason: from toString */
    public static final /* data */ class OnRedeemRewardsTabClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeMperksDecorator decorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ OnRedeemRewardsTabClicked(final HomeMperksDecorator homeMperksDecorator, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeMperksDecorator, (i10 & 2) != 0 ? C14760g.a(C14756c.a("mPerks: Redeem carousel tab"), new Function1() { // from class: fm.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.OnRedeemRewardsTabClicked.c(homeMperksDecorator, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRedeemRewardsTabClicked)) {
                return false;
            }
            OnRedeemRewardsTabClicked onRedeemRewardsTabClicked = (OnRedeemRewardsTabClicked) other;
            return Intrinsics.e(this.decorator, onRedeemRewardsTabClicked.decorator) && Intrinsics.e(this.trackingData, onRedeemRewardsTabClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeMperksDecorator homeMperksDecorator, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            List<ClaimReward> listC = homeMperksDecorator.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ClaimReward) it.next()).getCouponId()));
            }
            TrackingData.h("redeemableRewards", StringsKt.Q(StringsKt.Q(arrayList.toString(), "[", "", false, 4, null), "]", "", false, 4, null));
            TrackingData.h("mperksPoints", String.valueOf(homeMperksDecorator.getPointBalance()));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = this.decorator.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "OnRedeemRewardsTabClicked(decorator=" + this.decorator + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRedeemRewardsTabClicked(HomeMperksDecorator decorator, TrackingData trackingData) {
            super(null);
            Intrinsics.j(decorator, "decorator");
            this.decorator = decorator;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfm/c$f;", "Lfm/c;", "Lgm/b;", "decorator", "Lii/f;", "trackingData", "<init>", "(Lgm/b;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm/b;", "getDecorator", "()Lgm/b;", "b", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fm.c$f, reason: from toString */
    public static final /* data */ class OnYourRewardsTabClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeMperksDecorator decorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ OnYourRewardsTabClicked(final HomeMperksDecorator homeMperksDecorator, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeMperksDecorator, (i10 & 2) != 0 ? C14760g.a(C14756c.a("mPerks: Rewards carousel tab"), new Function1() { // from class: fm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.OnYourRewardsTabClicked.c(homeMperksDecorator, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnYourRewardsTabClicked)) {
                return false;
            }
            OnYourRewardsTabClicked onYourRewardsTabClicked = (OnYourRewardsTabClicked) other;
            return Intrinsics.e(this.decorator, onYourRewardsTabClicked.decorator) && Intrinsics.e(this.trackingData, onYourRewardsTabClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeMperksDecorator homeMperksDecorator, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("mperksPoints", String.valueOf(homeMperksDecorator.getPointBalance()));
            List<HomeMperksClippedReward> listE = homeMperksDecorator.e();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((HomeMperksClippedReward) it.next()).getCouponId()));
            }
            TrackingData.h("availableRewards", StringsKt.Q(StringsKt.Q(arrayList.toString(), "[", "", false, 4, null), "]", "", false, 4, null));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = this.decorator.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "OnYourRewardsTabClicked(decorator=" + this.decorator + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnYourRewardsTabClicked(HomeMperksDecorator decorator, TrackingData trackingData) {
            super(null);
            Intrinsics.j(decorator, "decorator");
            this.decorator = decorator;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfm/c$g;", "Lfm/c;", "Lgm/b;", "decorator", "Lii/f;", "trackingData", "<init>", "(Lgm/b;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm/b;", "getDecorator", "()Lgm/b;", "b", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fm.c$g, reason: from toString */
    public static final /* data */ class RedeemMPerksViewAllClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeMperksDecorator decorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ RedeemMPerksViewAllClicked(final HomeMperksDecorator homeMperksDecorator, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeMperksDecorator, (i10 & 2) != 0 ? C14760g.a(C14756c.a("mPerks:Claim Page"), new Function1() { // from class: fm.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.RedeemMPerksViewAllClicked.c(homeMperksDecorator, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedeemMPerksViewAllClicked)) {
                return false;
            }
            RedeemMPerksViewAllClicked redeemMPerksViewAllClicked = (RedeemMPerksViewAllClicked) other;
            return Intrinsics.e(this.decorator, redeemMPerksViewAllClicked.decorator) && Intrinsics.e(this.trackingData, redeemMPerksViewAllClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeMperksDecorator homeMperksDecorator, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            List<ClaimReward> listC = homeMperksDecorator.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ClaimReward) it.next()).getCouponId()));
            }
            TrackingData.h("redeemableRewards", StringsKt.Q(StringsKt.Q(arrayList.toString(), "[", "", false, 4, null), "]", "", false, 4, null));
            TrackingData.h("mperksPoints", String.valueOf(homeMperksDecorator.getPointBalance()));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            return (this.decorator.hashCode() * 31) + this.trackingData.hashCode();
        }

        public String toString() {
            return "RedeemMPerksViewAllClicked(decorator=" + this.decorator + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedeemMPerksViewAllClicked(HomeMperksDecorator decorator, TrackingData trackingData) {
            super(null);
            Intrinsics.j(decorator, "decorator");
            Intrinsics.j(trackingData, "trackingData");
            this.decorator = decorator;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001a\u0010-¨\u0006."}, d2 = {"Lfm/c$h;", "Lfm/c;", "Lco/k;", "rewardDescription", "", "isFromAvailableRewards", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "j$/time/ZonedDateTime", "rewardEndDate", "", "mPerksPointBalance", "Lii/f;", "trackingData", "<init>", "(Lco/k;ZJLj$/time/ZonedDateTime;ILii/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/k;", "d", "()Lco/k;", "b", "Z", "e", "()Z", "c", "J", "getCouponId", "()J", "Lj$/time/ZonedDateTime;", "getRewardEndDate", "()Lj$/time/ZonedDateTime;", "I", "getMPerksPointBalance", "f", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.c$h, reason: from toString */
    public static final /* data */ class RewardsMPerksClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RewardDetail rewardDescription;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromAvailableRewards;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long couponId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZonedDateTime rewardEndDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mPerksPointBalance;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ RewardsMPerksClicked(final RewardDetail rewardDetail, boolean z10, final long j10, final ZonedDateTime zonedDateTime, final int i10, TrackingData trackingData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(rewardDetail, (i11 & 2) != 0 ? false : z10, j10, zonedDateTime, i10, (i11 & 32) != 0 ? C14760g.a(C14756c.a("mPerks:Reward Details Page"), new Function1() { // from class: fm.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.RewardsMPerksClicked.c(j10, rewardDetail, zonedDateTime, i10, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardsMPerksClicked)) {
                return false;
            }
            RewardsMPerksClicked rewardsMPerksClicked = (RewardsMPerksClicked) other;
            return Intrinsics.e(this.rewardDescription, rewardsMPerksClicked.rewardDescription) && this.isFromAvailableRewards == rewardsMPerksClicked.isFromAvailableRewards && this.couponId == rewardsMPerksClicked.couponId && Intrinsics.e(this.rewardEndDate, rewardsMPerksClicked.rewardEndDate) && this.mPerksPointBalance == rewardsMPerksClicked.mPerksPointBalance && Intrinsics.e(this.trackingData, rewardsMPerksClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(long j10, RewardDetail rewardDetail, ZonedDateTime zonedDateTime, int i10, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("rewardID", j10 + ':' + rewardDetail.getName());
            String str = zonedDateTime != null ? zonedDateTime.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null;
            if (str == null) {
                str = "";
            }
            TrackingData.h("rewardValidThrough", str);
            TrackingData.h("daysLeftToRedeem", String.valueOf(ChronoUnit.DAYS.between(ZonedDateTime.now(), zonedDateTime)));
            TrackingData.h("mperksPoints", String.valueOf(i10));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: d, reason: from getter */
        public final RewardDetail getRewardDescription() {
            return this.rewardDescription;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsFromAvailableRewards() {
            return this.isFromAvailableRewards;
        }

        public int hashCode() {
            int iHashCode = ((((this.rewardDescription.hashCode() * 31) + Boolean.hashCode(this.isFromAvailableRewards)) * 31) + Long.hashCode(this.couponId)) * 31;
            ZonedDateTime zonedDateTime = this.rewardEndDate;
            int iHashCode2 = (((iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31) + Integer.hashCode(this.mPerksPointBalance)) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode2 + (trackingData != null ? trackingData.hashCode() : 0);
        }

        public String toString() {
            return "RewardsMPerksClicked(rewardDescription=" + this.rewardDescription + ", isFromAvailableRewards=" + this.isFromAvailableRewards + ", couponId=" + this.couponId + ", rewardEndDate=" + this.rewardEndDate + ", mPerksPointBalance=" + this.mPerksPointBalance + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RewardsMPerksClicked(RewardDetail rewardDescription, boolean z10, long j10, ZonedDateTime zonedDateTime, int i10, TrackingData trackingData) {
            super(null);
            Intrinsics.j(rewardDescription, "rewardDescription");
            this.rewardDescription = rewardDescription;
            this.isFromAvailableRewards = z10;
            this.couponId = j10;
            this.rewardEndDate = zonedDateTime;
            this.mPerksPointBalance = i10;
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfm/c$i;", "Lfm/c;", "Lgm/b;", "mperksDecorator", "Lii/f;", "trackingData", "<init>", "(Lgm/b;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm/b;", "d", "()Lgm/b;", "b", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fm.c$i, reason: from toString */
    public static final /* data */ class YourRewardsMPerksViewAllClicked extends AbstractC14021c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeMperksDecorator mperksDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ YourRewardsMPerksViewAllClicked(final HomeMperksDecorator homeMperksDecorator, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeMperksDecorator, (i10 & 2) != 0 ? C14760g.a(C14756c.a("mPerks:Your Rewards"), new Function1() { // from class: fm.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14021c.YourRewardsMPerksViewAllClicked.c(homeMperksDecorator, (TrackingData) obj);
                }
            }) : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YourRewardsMPerksViewAllClicked)) {
                return false;
            }
            YourRewardsMPerksViewAllClicked yourRewardsMPerksViewAllClicked = (YourRewardsMPerksViewAllClicked) other;
            return Intrinsics.e(this.mperksDecorator, yourRewardsMPerksViewAllClicked.mperksDecorator) && Intrinsics.e(this.trackingData, yourRewardsMPerksViewAllClicked.trackingData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(HomeMperksDecorator homeMperksDecorator, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            List<HomeMperksClippedReward> listE = homeMperksDecorator.e();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((HomeMperksClippedReward) it.next()).getCouponId()));
            }
            TrackingData.h("availableRewards", StringsKt.Q(StringsKt.Q(arrayList.toString(), "[", "", false, 4, null), "]", "", false, 4, null));
            TrackingData.h("mperksPoints", String.valueOf(homeMperksDecorator.getPointBalance()));
            return Unit.f143329a;
        }

        @Override // ii.InterfaceC14754a
        /* renamed from: a, reason: from getter */
        public TrackingData getTrackingData() {
            return this.trackingData;
        }

        /* renamed from: d, reason: from getter */
        public final HomeMperksDecorator getMperksDecorator() {
            return this.mperksDecorator;
        }

        public int hashCode() {
            int iHashCode = this.mperksDecorator.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "YourRewardsMPerksViewAllClicked(mperksDecorator=" + this.mperksDecorator + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YourRewardsMPerksViewAllClicked(HomeMperksDecorator mperksDecorator, TrackingData trackingData) {
            super(null);
            Intrinsics.j(mperksDecorator, "mperksDecorator");
            this.mperksDecorator = mperksDecorator;
            this.trackingData = trackingData;
        }
    }

    public /* synthetic */ AbstractC14021c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14021c() {
    }
}
