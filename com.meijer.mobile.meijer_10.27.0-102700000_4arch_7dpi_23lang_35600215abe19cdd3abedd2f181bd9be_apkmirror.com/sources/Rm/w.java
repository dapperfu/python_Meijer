package Rm;

import ak.AbstractC5607a;
import androidx.view.c0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import com.meijer.mobile.meijer.activity.find.model.ChartDataType;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import vk.C17590a;
import zp.CustomerSavings;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0015\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LRm/w;", "Landroidx/lifecycle/c0;", "Lyo/k;", "userManager", "<init>", "(Lyo/k;)V", "Lzp/a;", "customerSavings", "", "n", "(Lzp/a;)V", "LRm/w$a;", "action", "o", "(LRm/w$a;)V", "a", "Lyo/k;", "getUserManager", "()Lyo/k;", "Ltv/B;", "LRm/w$b;", "b", "Ltv/B;", "_viewStateFlow", "Ltv/P;", "c", "Ltv/P;", "m", "()Ltv/P;", "viewStateFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class w extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewStateFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LRm/w$a;", "", "<init>", "()V", "a", "LRm/w$a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LRm/w$a$a;", "LRm/w$a;", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "chartDataTypeToChangeTo", "currentChartDataType", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "()Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.w$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class ChangeChartDataType extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ChartDataType chartDataTypeToChangeTo;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ChartDataType currentChartDataType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChangeChartDataType)) {
                    return false;
                }
                ChangeChartDataType changeChartDataType = (ChangeChartDataType) other;
                return this.chartDataTypeToChangeTo == changeChartDataType.chartDataTypeToChangeTo && this.currentChartDataType == changeChartDataType.currentChartDataType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChangeChartDataType(ChartDataType chartDataTypeToChangeTo, ChartDataType currentChartDataType) {
                super(null);
                Intrinsics.j(chartDataTypeToChangeTo, "chartDataTypeToChangeTo");
                Intrinsics.j(currentChartDataType, "currentChartDataType");
                this.chartDataTypeToChangeTo = chartDataTypeToChangeTo;
                this.currentChartDataType = currentChartDataType;
            }

            /* renamed from: a, reason: from getter */
            public final ChartDataType getChartDataTypeToChangeTo() {
                return this.chartDataTypeToChangeTo;
            }

            /* renamed from: b, reason: from getter */
            public final ChartDataType getCurrentChartDataType() {
                return this.currentChartDataType;
            }

            public int hashCode() {
                return (this.chartDataTypeToChangeTo.hashCode() * 31) + this.currentChartDataType.hashCode();
            }

            public String toString() {
                return "ChangeChartDataType(chartDataTypeToChangeTo=" + this.chartDataTypeToChangeTo + ", currentChartDataType=" + this.currentChartDataType + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0019\u0010&R\u0014\u0010)\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010,\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010.\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0011\u00100\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u00102\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u00104\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b3\u0010\u0011R\u0011\u00106\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u0010\u000eR\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010\u0011¨\u0006="}, d2 = {"LRm/w$b;", "", "Lzp/a;", "customerSavings", "j$/time/LocalDateTime", "savingsSince", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "chartDataType", "<init>", "(Lzp/a;Lj$/time/LocalDateTime;Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;)V", "a", "(Lzp/a;Lj$/time/LocalDateTime;Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;)LRm/w$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzp/a;", "b", "Lj$/time/LocalDateTime;", "c", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "d", "()Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "", "D", "n", "()D", "total", "", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "e", "Ljava/util/List;", "()Ljava/util/List;", "chartDataList", "i", "savingsSinceYear", "f", "mperksSavings", "couponsSavings", "l", "specialsSavings", "m", "teamMemberSavings", "o", "totalSavings", "g", "percentSaved", "h", "savingsSinceText", "Lak/a;", "j", "()Lak/a;", "savingsSinceYearTitle", "k", "savingsSummaryTextResource", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rm.w$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerSavings customerSavings;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDateTime savingsSince;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChartDataType chartDataType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final double total;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<ChartData> chartDataList;

        public ViewState() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.customerSavings, viewState.customerSavings) && Intrinsics.e(this.savingsSince, viewState.savingsSince) && this.chartDataType == viewState.chartDataType;
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.w$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChartDataType.values().length];
                try {
                    iArr[ChartDataType.MPERKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChartDataType.COUPONS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChartDataType.SPECIALS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChartDataType.TEAM_MEMBER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChartDataType.NONE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ViewState(CustomerSavings customerSavings, LocalDateTime savingsSince, ChartDataType chartDataType) {
            List listE;
            Intrinsics.j(customerSavings, "customerSavings");
            Intrinsics.j(savingsSince, "savingsSince");
            Intrinsics.j(chartDataType, "chartDataType");
            this.customerSavings = customerSavings;
            this.savingsSince = savingsSince;
            this.chartDataType = chartDataType;
            double dF = f() + e() + l() + m();
            this.total = dF;
            int i10 = a.$EnumSwitchMapping$0[chartDataType.ordinal()];
            if (i10 == 1) {
                listE = CollectionsKt.e(new ChartData(ChartDataType.MPERKS, f(), 0, 360));
            } else if (i10 == 2) {
                listE = CollectionsKt.e(new ChartData(ChartDataType.COUPONS, e(), 0, 360));
            } else if (i10 == 3) {
                listE = CollectionsKt.e(new ChartData(ChartDataType.SPECIALS, l(), 0, 360));
            } else if (i10 == 4) {
                listE = CollectionsKt.e(new ChartData(ChartDataType.TEAM_MEMBER, m(), 0, 360));
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                double d10 = 360;
                ChartData chartData = new ChartData(ChartDataType.MPERKS, f(), 0, (int) ((f() / dF) * d10));
                ChartData chartData2 = new ChartData(ChartDataType.COUPONS, e(), (int) ((f() / dF) * d10), (int) (((f() + e()) / dF) * d10));
                ChartData chartData3 = new ChartData(ChartDataType.SPECIALS, l(), (int) (((f() + e()) / dF) * d10), (int) ((((f() + e()) + l()) / dF) * d10));
                ChartData chartData4 = new ChartData(ChartDataType.TEAM_MEMBER, m(), (int) ((((f() + e()) + l()) / dF) * d10), 360);
                listE = CollectionsKt.p(chartData, chartData2, chartData3, chartData4.getValue() == 0.0d ? null : chartData4);
            }
            this.chartDataList = CollectionsKt.p0(listE);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, CustomerSavings customerSavings, LocalDateTime localDateTime, ChartDataType chartDataType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerSavings = viewState.customerSavings;
            }
            if ((i10 & 2) != 0) {
                localDateTime = viewState.savingsSince;
            }
            if ((i10 & 4) != 0) {
                chartDataType = viewState.chartDataType;
            }
            return viewState.a(customerSavings, localDateTime, chartDataType);
        }

        private final String i() {
            String str = this.savingsSince.format(C17590a.f164803a.h());
            Intrinsics.i(str, "format(...)");
            return str;
        }

        public final ViewState a(CustomerSavings customerSavings, LocalDateTime savingsSince, ChartDataType chartDataType) {
            Intrinsics.j(customerSavings, "customerSavings");
            Intrinsics.j(savingsSince, "savingsSince");
            Intrinsics.j(chartDataType, "chartDataType");
            return new ViewState(customerSavings, savingsSince, chartDataType);
        }

        public final List<ChartData> c() {
            return this.chartDataList;
        }

        /* renamed from: d, reason: from getter */
        public final ChartDataType getChartDataType() {
            return this.chartDataType;
        }

        public final double e() {
            return this.customerSavings.getCouponsTotal();
        }

        public final double f() {
            return this.customerSavings.getMPerksTotal();
        }

        public final int g() {
            return this.customerSavings.getSavingsPercentage();
        }

        public final String h() {
            String str = this.savingsSince.format(C17590a.f164803a.l());
            Intrinsics.i(str, "format(...)");
            return str;
        }

        public int hashCode() {
            return (((this.customerSavings.hashCode() * 31) + this.savingsSince.hashCode()) * 31) + this.chartDataType.hashCode();
        }

        public final int k() {
            int i10 = a.$EnumSwitchMapping$0[this.chartDataType.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Y.f99734Od : Y.f99905Xd : Y.f99867Vd : Y.f99715Nd : Y.f99772Qd;
        }

        public final double l() {
            return this.customerSavings.getSpecialsTotal();
        }

        public final double m() {
            return this.customerSavings.getTeamMemberTotal();
        }

        /* renamed from: n, reason: from getter */
        public final double getTotal() {
            return this.total;
        }

        public final double o() {
            return this.customerSavings.getSavingsTotal();
        }

        public String toString() {
            return "ViewState(customerSavings=" + this.customerSavings + ", savingsSince=" + this.savingsSince + ", chartDataType=" + this.chartDataType + ')';
        }

        public final AbstractC5607a j() {
            if (StringsKt.r0(i())) {
                return AbstractC5607a.INSTANCE.a();
            }
            return AbstractC5607a.INSTANCE.d(Y.f99924Yd, i());
        }

        public /* synthetic */ ViewState(CustomerSavings customerSavings, LocalDateTime localDateTime, ChartDataType chartDataType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new CustomerSavings(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, l3.f92484c, null) : customerSavings, (i10 & 2) != 0 ? LocalDateTime.now() : localDateTime, (i10 & 4) != 0 ? ChartDataType.NONE : chartDataType);
        }
    }

    public w(yo.k userManager) {
        Intrinsics.j(userManager, "userManager");
        this.userManager = userManager;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, null, 7, null));
        this._viewStateFlow = interfaceC17140BA;
        this.viewStateFlow = C17154h.c(interfaceC17140BA);
    }

    public final P<ViewState> m() {
        return this.viewStateFlow;
    }

    public final void n(CustomerSavings customerSavings) {
        Intrinsics.j(customerSavings, "customerSavings");
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            CustomerSavings customerSavings2 = customerSavings;
            if (interfaceC17140B.e(value, ViewState.b(value, customerSavings2, yo.k.x(this.userManager, null, 1, null), null, 4, null))) {
                return;
            } else {
                customerSavings = customerSavings2;
            }
        }
    }

    public final void o(a action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (!(action instanceof a.ChangeChartDataType)) {
            throw new NoWhenBranchMatchedException();
        }
        a.ChangeChartDataType changeChartDataType = (a.ChangeChartDataType) action;
        ChartDataType chartDataTypeToChangeTo = changeChartDataType.getChartDataTypeToChangeTo() == changeChartDataType.getCurrentChartDataType() ? ChartDataType.NONE : changeChartDataType.getChartDataTypeToChangeTo();
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, null, chartDataTypeToChangeTo, 3, null)));
    }
}
