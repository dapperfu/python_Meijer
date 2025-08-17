package Ps;

import Js.WeeklyAdPublication;
import Oj.a;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import fi.C13902c;
import fi.C13904e;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003$ \"B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020+0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u0002060:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"LPs/i;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LTq/j;", "storeProvider", "LLs/c;", "getFlippWeeklyAdPublicationsCall", "Lgi/a;", "analyticsEngine", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "<init>", "(LTq/j;LLs/c;Lgi/a;Lyo/k;Lyl/k;)V", "", "r", "()V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "", "shopperId", "", "isGamEnabled", "q", "(Ljava/lang/String;Z)V", "LPs/i$a;", "action", "u", "(LPs/i$a;)V", "a", "LTq/j;", "b", "LLs/c;", "c", "Lgi/a;", "d", "Lyo/k;", "e", "Lyl/k;", "Ltv/B;", "LPs/i$c;", "f", "Ltv/B;", "_viewStateFlow", "Ltv/P;", "g", "Ltv/P;", "t", "()Ltv/P;", "viewState", "Ltv/A;", "LPs/i$b;", "h", "Ltv/A;", "_effectsFlow", "Ltv/F;", "i", "Ltv/F;", "s", "()Ltv/F;", "effectsFlow", "", "j", "I", "storeId", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class i extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ls.c getFlippWeeklyAdPublicationsCall;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewStateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<b> _effectsFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<b> effectsFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int storeId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LPs/i$a;", "", "<init>", "()V", "d", "e", "c", "a", "b", "LPs/i$a$a;", "LPs/i$a$b;", "LPs/i$a$c;", "LPs/i$a$d;", "LPs/i$a$e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/i$a$a;", "LPs/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.i$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0678a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0678a f29190a = new C0678a();

            private C0678a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0678a);
            }

            public String toString() {
                return "FetchGoogleAdData";
            }

            public int hashCode() {
                return -425547337;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/i$a$b;", "LPs/i$a;", "Lfi/a;", "analytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.i$a$b, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f29191b = GoogleAdAnalytics.f131141f;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final GoogleAdAnalytics analytics;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoogleAdClicked) && Intrinsics.e(this.analytics, ((GoogleAdClicked) other).analytics);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoogleAdClicked(GoogleAdAnalytics analytics) {
                super(null);
                Intrinsics.j(analytics, "analytics");
                this.analytics = analytics;
            }

            /* renamed from: a, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }

            public int hashCode() {
                return this.analytics.hashCode();
            }

            public String toString() {
                return "GoogleAdClicked(analytics=" + this.analytics + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/i$a$c;", "LPs/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f29193a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "ReloadWeeklyAdList";
            }

            public int hashCode() {
                return 1327591044;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/i$a$d;", "LPs/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f29194a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "ViewStoreChooser";
            }

            public int hashCode() {
                return -1852190296;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/i$a$e;", "LPs/i$a;", "LJs/e;", "weeklyAdPublication", "<init>", "(LJs/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/e;", "()LJs/e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.i$a$e, reason: from toString */
        public static final /* data */ class ViewWeeklyAd extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdPublication weeklyAdPublication;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewWeeklyAd) && Intrinsics.e(this.weeklyAdPublication, ((ViewWeeklyAd) other).weeklyAdPublication);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewWeeklyAd(WeeklyAdPublication weeklyAdPublication) {
                super(null);
                Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
                this.weeklyAdPublication = weeklyAdPublication;
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdPublication getWeeklyAdPublication() {
                return this.weeklyAdPublication;
            }

            public int hashCode() {
                return this.weeklyAdPublication.hashCode();
            }

            public String toString() {
                return "ViewWeeklyAd(weeklyAdPublication=" + this.weeklyAdPublication + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LPs/i$b;", "", "<init>", "()V", "a", "b", "LPs/i$b$a;", "LPs/i$b$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"LPs/i$b$a;", "LPs/i$b;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStoreId", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.i$b$a, reason: from toString */
        public static final /* data */ class StoreChanged extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public StoreChanged(int i10) {
                super(null);
                this.storeId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StoreChanged) && this.storeId == ((StoreChanged) other).storeId;
            }

            public int hashCode() {
                return Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "StoreChanged(storeId=" + this.storeId + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/i$b$b;", "LPs/i$b;", "LJs/e;", "weeklyAdPublication", "<init>", "(LJs/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/e;", "()LJs/e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.i$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class WeeklyAdSelected extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdPublication weeklyAdPublication;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WeeklyAdSelected) && Intrinsics.e(this.weeklyAdPublication, ((WeeklyAdSelected) other).weeklyAdPublication);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeeklyAdSelected(WeeklyAdPublication weeklyAdPublication) {
                super(null);
                Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
                this.weeklyAdPublication = weeklyAdPublication;
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdPublication getWeeklyAdPublication() {
                return this.weeklyAdPublication;
            }

            public int hashCode() {
                return this.weeklyAdPublication.hashCode();
            }

            public String toString() {
                return "WeeklyAdSelected(weeklyAdPublication=" + this.weeklyAdPublication + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"LPs/i$c;", "", "", "LJs/e;", "weeklyAdPublications", "", "storeName", "LOj/a;", "loadingState", "Lfi/d;", "googleAdData", "<init>", "(Ljava/util/List;Ljava/lang/String;LOj/a;Lfi/d;)V", "a", "(Ljava/util/List;Ljava/lang/String;LOj/a;Lfi/d;)LPs/i$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "LOj/a;", "d", "()LOj/a;", "Lfi/d;", "()Lfi/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ps.i$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<WeeklyAdPublication> weeklyAdPublications;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storeName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Oj.a loadingState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdData;

        public ViewState() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.weeklyAdPublications, viewState.weeklyAdPublications) && Intrinsics.e(this.storeName, viewState.storeName) && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.googleAdData, viewState.googleAdData);
        }

        public ViewState(List<WeeklyAdPublication> weeklyAdPublications, String storeName, Oj.a loadingState, GoogleAdData googleAdData) {
            Intrinsics.j(weeklyAdPublications, "weeklyAdPublications");
            Intrinsics.j(storeName, "storeName");
            Intrinsics.j(loadingState, "loadingState");
            this.weeklyAdPublications = weeklyAdPublications;
            this.storeName = storeName;
            this.loadingState = loadingState;
            this.googleAdData = googleAdData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, String str, Oj.a aVar, GoogleAdData googleAdData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.weeklyAdPublications;
            }
            if ((i10 & 2) != 0) {
                str = viewState.storeName;
            }
            if ((i10 & 4) != 0) {
                aVar = viewState.loadingState;
            }
            if ((i10 & 8) != 0) {
                googleAdData = viewState.googleAdData;
            }
            return viewState.a(list, str, aVar, googleAdData);
        }

        public final ViewState a(List<WeeklyAdPublication> weeklyAdPublications, String storeName, Oj.a loadingState, GoogleAdData googleAdData) {
            Intrinsics.j(weeklyAdPublications, "weeklyAdPublications");
            Intrinsics.j(storeName, "storeName");
            Intrinsics.j(loadingState, "loadingState");
            return new ViewState(weeklyAdPublications, storeName, loadingState, googleAdData);
        }

        /* renamed from: c, reason: from getter */
        public final GoogleAdData getGoogleAdData() {
            return this.googleAdData;
        }

        /* renamed from: d, reason: from getter */
        public final Oj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: e, reason: from getter */
        public final String getStoreName() {
            return this.storeName;
        }

        public final List<WeeklyAdPublication> f() {
            return this.weeklyAdPublications;
        }

        public int hashCode() {
            int iHashCode = ((((this.weeklyAdPublications.hashCode() * 31) + this.storeName.hashCode()) * 31) + this.loadingState.hashCode()) * 31;
            GoogleAdData googleAdData = this.googleAdData;
            return iHashCode + (googleAdData == null ? 0 : googleAdData.hashCode());
        }

        public String toString() {
            return "ViewState(weeklyAdPublications=" + this.weeklyAdPublications + ", storeName=" + this.storeName + ", loadingState=" + this.loadingState + ", googleAdData=" + this.googleAdData + ')';
        }

        public /* synthetic */ ViewState(List list, String str, Oj.a aVar, GoogleAdData googleAdData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 8) != 0 ? null : googleAdData);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdSelectionViewModel$fetchWeeklyAdPublications$1", f = "WeeklyAdSelectionViewModel.kt", l = {84}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29202a;

        /* renamed from: b, reason: collision with root package name */
        Object f29203b;

        /* renamed from: c, reason: collision with root package name */
        Object f29204c;

        /* renamed from: d, reason: collision with root package name */
        Object f29205d;

        /* renamed from: e, reason: collision with root package name */
        int f29206e;

        /* renamed from: f, reason: collision with root package name */
        int f29207f;

        /* renamed from: g, reason: collision with root package name */
        int f29208g;

        /* renamed from: h, reason: collision with root package name */
        int f29209h;

        /* renamed from: i, reason: collision with root package name */
        int f29210i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29211j;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = i.this.new d(continuation);
            dVar.f29211j = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object value3;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29210i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29211j;
                    InterfaceC17140B interfaceC17140B = i.this._viewStateFlow;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, ViewState.b((ViewState) value3, null, null, new a.Loading(null, null, 3, null), null, 11, null)));
                    i iVar = i.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ls.c cVar = iVar.getFlippWeeklyAdPublicationsCall;
                    this.f29211j = interfaceC16622O;
                    this.f29202a = interfaceC16622O;
                    this.f29203b = this;
                    this.f29204c = this;
                    this.f29205d = interfaceC16622O;
                    this.f29206e = 0;
                    this.f29207f = 0;
                    this.f29208g = 0;
                    this.f29209h = 0;
                    this.f29210i = 1;
                    obj = Ls.c.b(cVar, 0, this, 1, null);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                InterfaceC17140B interfaceC17140B2 = iVar2._viewStateFlow;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, ViewState.b((ViewState) value2, list, null, new a.NotLoading(null, 1, null), null, 10, null)));
            }
            i iVar3 = i.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.d("Get WeeklyAdPublications Call failed from WeeklyAdSelectionViewModel", thE);
                InterfaceC17140B interfaceC17140B3 = iVar3._viewStateFlow;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, ViewState.b((ViewState) value, null, null, new a.Failed(null, null, 3, null), null, 11, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdSelectionViewModel$onAction$1", f = "WeeklyAdSelectionViewModel.kt", l = {125}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29213a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29213a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = i.this._effectsFlow;
                b.StoreChanged storeChanged = new b.StoreChanged(i.this.storeProvider.b());
                this.f29213a = 1;
                if (interfaceC17139A.emit(storeChanged, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdSelectionViewModel$onAction$2", f = "WeeklyAdSelectionViewModel.kt", l = {132}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29215a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f29217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f29217c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new f(this.f29217c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29215a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = i.this._effectsFlow;
                b.WeeklyAdSelected weeklyAdSelected = new b.WeeklyAdSelected(((a.ViewWeeklyAd) this.f29217c).getWeeklyAdPublication());
                this.f29215a = 1;
                if (interfaceC17139A.emit(weeklyAdSelected, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public i(Tq.j storeProvider, Ls.c getFlippWeeklyAdPublicationsCall, InterfaceC14261a analyticsEngine, yo.k userManager, yl.k featureManager) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(getFlippWeeklyAdPublicationsCall, "getFlippWeeklyAdPublicationsCall");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        this.storeProvider = storeProvider;
        this.getFlippWeeklyAdPublicationsCall = getFlippWeeklyAdPublicationsCall;
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        this.featureManager = featureManager;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, null, null, 15, null));
        this._viewStateFlow = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<b> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC17139AB;
        this.effectsFlow = C17154h.b(interfaceC17139AB);
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        ViewState value;
        ViewState viewState;
        String strE;
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        if (this.storeProvider.b() != this.storeId) {
            this.storeId = this.storeProvider.b();
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
            do {
                value = interfaceC17140B.getValue();
                viewState = value;
                strE = this.storeProvider.e();
                if (strE == null) {
                    strE = "";
                }
            } while (!interfaceC17140B.e(value, ViewState.b(viewState, null, strE, null, null, 13, null)));
            r();
        }
    }

    public final void q(String shopperId, boolean isGamEnabled) {
        ViewState value;
        Intrinsics.j(shopperId, "shopperId");
        if (this._viewStateFlow.getValue().getGoogleAdData() != null) {
            return;
        }
        GoogleAdData googleAdDataB = C13904e.b(C13904e.f131155a, EnumC13905f.f131156d, "WeeklyAdPage", isGamEnabled, null, shopperId, 1, 8, null);
        if (Intrinsics.e(this._viewStateFlow.getValue().getGoogleAdData(), googleAdDataB)) {
            return;
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, null, null, googleAdDataB, 7, null)));
    }

    public final InterfaceC17144F<b> s() {
        return this.effectsFlow;
    }

    public final P<ViewState> t() {
        return this.viewState;
    }

    public final void u(a action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, a.d.f29194a)) {
            C16648k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (Intrinsics.e(action, a.c.f29193a)) {
            r();
            return;
        }
        if (action instanceof a.ViewWeeklyAd) {
            C16648k.d(d0.a(this), null, null, new f(action, null), 3, null);
        } else if (action instanceof a.C0678a) {
            q(this.userManager.y(), this.featureManager.e(AbstractC18227f.C.f170544h));
        } else {
            if (!(action instanceof a.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.e(C13902c.b(((a.GoogleAdClicked) action).getAnalytics(), "weekly ad"));
        }
    }

    private final void r() {
        C16648k.d(d0.a(this), null, null, new d(null), 3, null);
    }
}
