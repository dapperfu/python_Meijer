package fm;

import Vl.AvailableReward;
import Vl.HomeMperksClippedReward;
import ak.AbstractC5607a;
import bo.ClaimReward;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0001\u001aBk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\u0010\u0013\u001a\u00060\u0012j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0016Jt\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b-\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lfm/b;", "", "Lak/a;", "clippedRewardsTabTitle", "availableRewardsTabTitle", "", "pointBalance", "availableSummary", "clippedSummary", "", "LVl/c;", "clippedRewards", "Lbo/b;", "availableRewards", "", "isErrorVisible", "<init>", "(Lak/a;Lak/a;ILak/a;Lak/a;Ljava/util/List;Ljava/util/List;Z)V", "", "couponId", "isLoading", "k", "(JZ)Ljava/util/List;", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "isRedemptionSuccessful", "j", "a", "(Lak/a;Lak/a;ILak/a;Lak/a;Ljava/util/List;Ljava/util/List;Z)Lfm/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "f", "()Lak/a;", "b", "d", "c", "I", "h", "getAvailableSummary", "e", "g", "Ljava/util/List;", "()Ljava/util/List;", "Z", "i", "()Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fm.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class HomeMperksDecorator {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f131207j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a clippedRewardsTabTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a availableRewardsTabTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointBalance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a availableSummary;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a clippedSummary;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HomeMperksClippedReward> clippedRewards;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClaimReward> availableRewards;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isErrorVisible;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfm/b$a;", "", "<init>", "()V", "", "LVl/a;", "rewards", "b", "(Ljava/util/List;)Ljava/util/List;", "LVl/b;", "model", "LOj/a;", "loadingState", "Lfm/b;", "a", "(LVl/b;LOj/a;)Lfm/b;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: fm.b$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: fm.b$a$a, reason: collision with other inner class name */
        public static final class C2081a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((AvailableReward) t10).getPointCost()), Integer.valueOf(((AvailableReward) t11).getPointCost()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final List<AvailableReward> b(List<AvailableReward> rewards) {
            return CollectionsKt.Z0(rewards, new C2081a());
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final fm.HomeMperksDecorator a(Vl.HomeMperks r12, Oj.a r13) {
            /*
                r11 = this;
                java.lang.String r0 = "loadingState"
                kotlin.jvm.internal.Intrinsics.j(r13, r0)
                r0 = 0
                if (r12 == 0) goto L1c
                Vl.d r1 = r12.getMperksCreditCard()
                if (r1 == 0) goto L1c
                java.lang.String r1 = r1.getClippedRewardTitle()
                if (r1 == 0) goto L1c
                ak.a$a r2 = ak.AbstractC5607a.INSTANCE
                ak.a r1 = r2.c(r1)
                r3 = r1
                goto L1d
            L1c:
                r3 = r0
            L1d:
                if (r12 == 0) goto L2a
                Vl.e r1 = r12.getMperksData()
                if (r1 == 0) goto L2a
                java.util.List r1 = r1.d()
                goto L2b
            L2a:
                r1 = r0
            L2b:
                if (r1 != 0) goto L31
                java.util.List r1 = kotlin.collections.CollectionsKt.m()
            L31:
                r8 = r1
                if (r12 == 0) goto L3f
                Vl.e r1 = r12.getMperksData()
                if (r1 == 0) goto L3f
                java.util.List r1 = r1.c()
                goto L40
            L3f:
                r1 = r0
            L40:
                if (r1 != 0) goto L46
                java.util.List r1 = kotlin.collections.CollectionsKt.m()
            L46:
                java.util.List r1 = r11.b(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r9 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r1, r2)
                r9.<init>(r2)
                java.util.Iterator r1 = r1.iterator()
            L5b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L6f
                java.lang.Object r2 = r1.next()
                Vl.a r2 = (Vl.AvailableReward) r2
                bo.b r2 = io.C14749d.a(r2)
                r9.add(r2)
                goto L5b
            L6f:
                r1 = 0
                if (r12 == 0) goto L7e
                Vl.e r2 = r12.getMperksData()
                if (r2 == 0) goto L7e
                int r2 = r2.getPointBalance()
                r5 = r2
                goto L7f
            L7e:
                r5 = r1
            L7f:
                if (r12 == 0) goto La4
                Vl.d r2 = r12.getMperksCreditCard()
                if (r2 == 0) goto La4
                java.lang.String r2 = r2.getClippedRewardSummary()
                if (r2 == 0) goto La4
                ak.a$a r2 = ak.AbstractC5607a.INSTANCE
                Vl.d r4 = r12.getMperksCreditCard()
                java.lang.String r4 = r4.getClippedRewardSummary()
                if (r4 != 0) goto L9b
                java.lang.String r4 = ""
            L9b:
                ak.a r2 = r2.c(r4)
                if (r2 != 0) goto La2
                goto La4
            La2:
                r7 = r2
                goto Laf
            La4:
                ak.a$a r2 = ak.AbstractC5607a.INSTANCE
                int r4 = Nr.g.f22698E0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                ak.a r2 = r2.d(r4, r1)
                goto La2
            Laf:
                if (r12 == 0) goto Lc5
                Vl.d r1 = r12.getMperksCreditCard()
                if (r1 == 0) goto Lc5
                java.lang.String r1 = r1.getAvailableRewardSummary()
                if (r1 == 0) goto Lc5
                ak.a$a r2 = ak.AbstractC5607a.INSTANCE
                ak.a r1 = r2.c(r1)
                r6 = r1
                goto Lc6
            Lc5:
                r6 = r0
            Lc6:
                if (r12 == 0) goto Le8
                Vl.e r12 = r12.getMperksData()
                if (r12 == 0) goto Le8
                java.util.List r12 = r12.c()
                if (r12 == 0) goto Le8
                int r12 = r12.size()
                ak.a$a r0 = ak.AbstractC5607a.INSTANCE
                int r1 = Nr.g.f22736i
                java.lang.String r12 = java.lang.String.valueOf(r12)
                java.lang.Object[] r12 = new java.lang.Object[]{r12}
                ak.a r0 = r0.d(r1, r12)
            Le8:
                r4 = r0
                boolean r10 = r13 instanceof Oj.a.Failed
                fm.b r2 = new fm.b
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: fm.HomeMperksDecorator.Companion.a(Vl.b, Oj.a):fm.b");
        }
    }

    public HomeMperksDecorator() {
        this(null, null, 0, null, null, null, null, false, l3.f92484c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMperksDecorator)) {
            return false;
        }
        HomeMperksDecorator homeMperksDecorator = (HomeMperksDecorator) other;
        return Intrinsics.e(this.clippedRewardsTabTitle, homeMperksDecorator.clippedRewardsTabTitle) && Intrinsics.e(this.availableRewardsTabTitle, homeMperksDecorator.availableRewardsTabTitle) && this.pointBalance == homeMperksDecorator.pointBalance && Intrinsics.e(this.availableSummary, homeMperksDecorator.availableSummary) && Intrinsics.e(this.clippedSummary, homeMperksDecorator.clippedSummary) && Intrinsics.e(this.clippedRewards, homeMperksDecorator.clippedRewards) && Intrinsics.e(this.availableRewards, homeMperksDecorator.availableRewards) && this.isErrorVisible == homeMperksDecorator.isErrorVisible;
    }

    public HomeMperksDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, List<HomeMperksClippedReward> clippedRewards, List<ClaimReward> availableRewards, boolean z10) {
        Intrinsics.j(clippedRewards, "clippedRewards");
        Intrinsics.j(availableRewards, "availableRewards");
        this.clippedRewardsTabTitle = abstractC5607a;
        this.availableRewardsTabTitle = abstractC5607a2;
        this.pointBalance = i10;
        this.availableSummary = abstractC5607a3;
        this.clippedSummary = abstractC5607a4;
        this.clippedRewards = clippedRewards;
        this.availableRewards = availableRewards;
        this.isErrorVisible = z10;
    }

    public static /* synthetic */ HomeMperksDecorator b(HomeMperksDecorator homeMperksDecorator, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, List list, List list2, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC5607a = homeMperksDecorator.clippedRewardsTabTitle;
        }
        if ((i11 & 2) != 0) {
            abstractC5607a2 = homeMperksDecorator.availableRewardsTabTitle;
        }
        if ((i11 & 4) != 0) {
            i10 = homeMperksDecorator.pointBalance;
        }
        if ((i11 & 8) != 0) {
            abstractC5607a3 = homeMperksDecorator.availableSummary;
        }
        if ((i11 & 16) != 0) {
            abstractC5607a4 = homeMperksDecorator.clippedSummary;
        }
        if ((i11 & 32) != 0) {
            list = homeMperksDecorator.clippedRewards;
        }
        if ((i11 & 64) != 0) {
            list2 = homeMperksDecorator.availableRewards;
        }
        if ((i11 & 128) != 0) {
            z10 = homeMperksDecorator.isErrorVisible;
        }
        List list3 = list2;
        boolean z11 = z10;
        AbstractC5607a abstractC5607a5 = abstractC5607a4;
        List list4 = list;
        return homeMperksDecorator.a(abstractC5607a, abstractC5607a2, i10, abstractC5607a3, abstractC5607a5, list4, list3, z11);
    }

    public final HomeMperksDecorator a(AbstractC5607a clippedRewardsTabTitle, AbstractC5607a availableRewardsTabTitle, int pointBalance, AbstractC5607a availableSummary, AbstractC5607a clippedSummary, List<HomeMperksClippedReward> clippedRewards, List<ClaimReward> availableRewards, boolean isErrorVisible) {
        Intrinsics.j(clippedRewards, "clippedRewards");
        Intrinsics.j(availableRewards, "availableRewards");
        return new HomeMperksDecorator(clippedRewardsTabTitle, availableRewardsTabTitle, pointBalance, availableSummary, clippedSummary, clippedRewards, availableRewards, isErrorVisible);
    }

    public final List<ClaimReward> c() {
        return this.availableRewards;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getAvailableRewardsTabTitle() {
        return this.availableRewardsTabTitle;
    }

    public final List<HomeMperksClippedReward> e() {
        return this.clippedRewards;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getClippedRewardsTabTitle() {
        return this.clippedRewardsTabTitle;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC5607a getClippedSummary() {
        return this.clippedSummary;
    }

    /* renamed from: h, reason: from getter */
    public final int getPointBalance() {
        return this.pointBalance;
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.clippedRewardsTabTitle;
        int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
        AbstractC5607a abstractC5607a2 = this.availableRewardsTabTitle;
        int iHashCode2 = (((iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31) + Integer.hashCode(this.pointBalance)) * 31;
        AbstractC5607a abstractC5607a3 = this.availableSummary;
        int iHashCode3 = (iHashCode2 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        AbstractC5607a abstractC5607a4 = this.clippedSummary;
        return ((((((iHashCode3 + (abstractC5607a4 != null ? abstractC5607a4.hashCode() : 0)) * 31) + this.clippedRewards.hashCode()) * 31) + this.availableRewards.hashCode()) * 31) + Boolean.hashCode(this.isErrorVisible);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsErrorVisible() {
        return this.isErrorVisible;
    }

    public final List<ClaimReward> j(long couponId, boolean isRedemptionSuccessful) {
        List<ClaimReward> list = this.availableRewards;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ClaimReward claimRewardB : list) {
            if (claimRewardB.getCouponId() == couponId) {
                claimRewardB = ClaimReward.b(claimRewardB, 0L, null, null, null, null, null, null, 0, null, isRedemptionSuccessful, false, 511, null);
            }
            arrayList.add(claimRewardB);
        }
        return arrayList;
    }

    public final List<ClaimReward> k(long couponId, boolean isLoading) {
        List<ClaimReward> list = this.availableRewards;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ClaimReward claimRewardB : list) {
            if (claimRewardB.getCouponId() == couponId) {
                claimRewardB = ClaimReward.b(claimRewardB, 0L, null, null, null, null, null, null, 0, null, false, isLoading, 1023, null);
            }
            arrayList.add(claimRewardB);
        }
        return arrayList;
    }

    public String toString() {
        return "HomeMperksDecorator(clippedRewardsTabTitle=" + this.clippedRewardsTabTitle + ", availableRewardsTabTitle=" + this.availableRewardsTabTitle + ", pointBalance=" + this.pointBalance + ", availableSummary=" + this.availableSummary + ", clippedSummary=" + this.clippedSummary + ", clippedRewards=" + this.clippedRewards + ", availableRewards=" + this.availableRewards + ", isErrorVisible=" + this.isErrorVisible + ')';
    }

    public /* synthetic */ HomeMperksDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, List list, List list2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : abstractC5607a, (i11 & 2) != 0 ? null : abstractC5607a2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : abstractC5607a3, (i11 & 16) != 0 ? null : abstractC5607a4, (i11 & 32) != 0 ? CollectionsKt.m() : list, (i11 & 64) != 0 ? CollectionsKt.m() : list2, (i11 & 128) != 0 ? false : z10);
    }
}
