package Pr;

import Ai.C2832m0;
import Ai.H1;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Pr.P;
import Qk.a;
import Xr.CouponListTabContent;
import Xr.a;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.meijer.mobile.core.models.coupon.CouponAd;
import d0.C13572f;
import d0.C13575i;
import dk.C13698b;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.List;
import java.util.Locale;
import ki.InterfaceC15153W;
import ki.j1;
import ki.q1;
import kotlin.A1;
import kotlin.AbstractC16037C;
import kotlin.C1;
import kotlin.InterfaceC16060u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.C15430B;
import l0.InterfaceC15433c;
import mv.C15809k;
import mv.InterfaceC15783O;
import oi.E0;
import p1.C16338g;
import r0.C16806i;
import yr.C18357l;
import yr.C18370z;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\u00020\u0004*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001aí\u0001\u0010(\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u000e2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00112\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u001dH\u0007¢\u0006\u0004\b(\u0010)\u001aA\u0010+\u001a\u00020\u0004*\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010,\u001aÁ\u0001\u00100\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u000e2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00112\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u001dH\u0007¢\u0006\u0004\b0\u00101\u001a\u00ad\u0001\u00105\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u00104\u001a\u0002032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\u000e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00112\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u001dH\u0007¢\u0006\u0004\b5\u00106\u001a9\u00108\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u00107\u001a\u00020$2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u001dH\u0003¢\u0006\u0004\b8\u00109¨\u0006=²\u0006\f\u0010:\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010;\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010;\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010<\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "totalCouponsText", "Lkotlin/Function0;", "", "onFilterAndSortClicked", "Landroidx/compose/ui/Modifier;", "modifier", "s", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onSearchBarClicked", "onBarcodeClicked", "x", "(LKi/M;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isCouponsLoading", "isFetchCouponsFailed", "", "LXr/a;", "availableContent", "clippedContent", "Lbk/a;", "availableCouponsCountText", "clippedCouponsCountText", "Ll0/A;", "listState", "Lo0/C;", "pagerState", "onTabsClickAction", "Lkotlin/Function1;", "LQk/a;", "onCouponAction", "onRetryButtonClicked", "isGoogleAdEnabled", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "onAdClicked", "Lgi/d;", "googleAdSlots", "Lgi/a;", "googleAdClicked", "n", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLjava/util/List;Ljava/util/List;Lbk/a;Lbk/a;Ll0/A;Lo0/C;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "tabsTitles", "l", "(LKi/M;Ljava/util/List;Lo0/C;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LXr/d;", "tabs", "googleAsSlots", "j", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLjava/util/List;Lo0/C;Ll0/A;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "couponItems", "", "selectedTabIndex", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lbk/a;Ll0/A;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "adData", "u", "(LKi/M;Landroidx/compose/ui/Modifier;Lgi/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isPressed", "lastAction", "isLoadingFailure", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26681d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<CouponListTabContent> f26682e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15429A f26683f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26684g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Qk.a, Unit> f26685h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<CouponAd, Unit> f26686i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f26687j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<GoogleAdData> f26688k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f26689l;

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z11, List<CouponListTabContent> list, C15429A c15429a, Function0<Unit> function02, Function1<? super Qk.a, Unit> function1, Function1<? super CouponAd, Unit> function12, boolean z12, List<GoogleAdData> list2, Function1<? super GoogleAdAnalytics, Unit> function13) {
            this.f26678a = z10;
            this.f26679b = localThemeScope;
            this.f26680c = function0;
            this.f26681d = z11;
            this.f26682e = list;
            this.f26683f = c15429a;
            this.f26684g = function02;
            this.f26685h = function1;
            this.f26686i = function12;
            this.f26687j = z12;
            this.f26688k = list2;
            this.f26689l = function13;
        }

        public final void a(InterfaceC16060u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(975002829, i11, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListHorizontalPager.<anonymous> (CouponListTabsComposables.kt:321)");
            }
            if (this.f26678a) {
                composer.startReplaceGroup(674850320);
                LocalThemeScope localThemeScope = this.f26679b;
                String strC = C16338g.c(Nr.g.f22658I, composer, 0);
                String upperCase = C16338g.c(Nr.g.f22679b0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                C18357l.b(localThemeScope, strC, upperCase, null, this.f26680c, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else if (this.f26681d || this.f26682e.get(i10).a().isEmpty()) {
                composer.startReplaceGroup(-554175734);
                C5800d.f fVarB = C5800d.f48779a.b();
                e.b bVarG = P0.e.INSTANCE.g();
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                LocalThemeScope localThemeScope2 = this.f26679b;
                MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                yr.N.b(localThemeScope2, C13698b.a(AbstractC6392a.INSTANCE.d(Cj.o.f5013E, "Coupons"), composer, AbstractC6392a.f60445b), composer, LocalThemeScope.f17314g, 0);
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(674874552);
                LocalThemeScope localThemeScope3 = this.f26679b;
                List<Xr.a> listA = this.f26682e.get(i10).a();
                AbstractC6392a totalCouponsCountText = this.f26682e.get(i10).getTotalCouponsCountText();
                composer.startReplaceGroup(674879426);
                C15429A c15429aB = i10 == 0 ? this.f26683f : C15430B.b(0, 0, composer, 0, 3);
                composer.P();
                P.p(localThemeScope3, null, listA, totalCouponsCountText, c15429aB, i10, this.f26684g, this.f26685h, this.f26686i, this.f26687j, this.f26688k, this.f26689l, composer, ((i11 << 12) & 458752) | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9), 0, 1);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16060u interfaceC16060u, Integer num, Composer composer, Integer num2) {
            a(interfaceC16060u, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f26690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26691b;

        b(AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope) {
            this.f26690a = abstractC16037C;
            this.f26691b = localThemeScope;
        }

        public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
            Intrinsics.j(tabPositions, "tabPositions");
            if (ComposerKt.M()) {
                ComposerKt.U(-496783425, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListTabs.<anonymous> (CouponListTabsComposables.kt:266)");
            }
            C1 c12 = C1.f167869a;
            c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(this.f26690a.v())), 0.0f, this.f26691b.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, C1.f167873e << 9, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f26692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f26693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26694c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f26695d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26696e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.coupon.composable.list.CouponListTabsComposablesKt$CouponListTabs$2$1$1$1$1", f = "CouponListTabsComposables.kt", l = {292}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f26697a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f26698b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f26699c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f26700d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0, AbstractC16037C abstractC16037C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f26698b = function0;
                this.f26699c = abstractC16037C;
                this.f26700d = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f26698b, this.f26699c, this.f26700d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f26697a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    this.f26698b.invoke();
                    AbstractC16037C abstractC16037C = this.f26699c;
                    int i11 = this.f26700d;
                    this.f26697a = 1;
                    if (AbstractC16037C.n(abstractC16037C, i11, 0.0f, null, this, 6, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26701a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f26702b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f26703c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f26704d;

            b(LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, int i10, String str) {
                this.f26701a = localThemeScope;
                this.f26702b = abstractC16037C;
                this.f26703c = i10;
                this.f26704d = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1330923277, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListTabs.<anonymous>.<anonymous>.<anonymous> (CouponListTabsComposables.kt:278)");
                }
                LocalThemeScope localThemeScope = this.f26701a;
                q1.Label label = new q1.Label(null, this.f26702b.v() == this.f26703c ? this.f26701a.getAdsColors().getAdsColorText03() : this.f26701a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String upperCase = this.f26704d.toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(List<String> list, AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, Function0<Unit> function0) {
            this.f26692a = list;
            this.f26693b = abstractC16037C;
            this.f26694c = localThemeScope;
            this.f26695d = interfaceC15783O;
            this.f26696e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15783O interfaceC15783O, Function0 function0, AbstractC16037C abstractC16037C, int i10) {
            C15809k.d(interfaceC15783O, null, null, new a(function0, abstractC16037C, i10, null), 3, null);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1785446977, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponListTabs.<anonymous> (CouponListTabsComposables.kt:272)");
            }
            List<String> list = this.f26692a;
            final AbstractC16037C abstractC16037C = this.f26693b;
            LocalThemeScope localThemeScope = this.f26694c;
            final InterfaceC15783O interfaceC15783O = this.f26695d;
            final Function0<Unit> function0 = this.f26696e;
            final int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                String str = (String) obj;
                boolean z10 = abstractC16037C.v() == i11;
                long color = localThemeScope.getAdsColors().getAdsColorText03().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                composer2.startReplaceGroup(-1224400529);
                boolean zD = composer2.D(interfaceC15783O) | composer2.V(function0) | composer2.V(abstractC16037C) | composer2.d(i11);
                Object objB = composer2.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pr.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return P.c.c(interfaceC15783O, function0, abstractC16037C, i11);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                A1.b(z10, (Function0) objB, null, false, ComposableLambdaKt.c(-1330923277, true, new b(localThemeScope, abstractC16037C, i11, str), composer2, 54), null, null, color, color2, composer2, 24576, 108);
                composer2 = composer;
                i11 = i12;
                function0 = function0;
                localThemeScope = localThemeScope;
                interfaceC15783O = interfaceC15783O;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<GoogleAdData> f26705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<GoogleAdAnalytics, Unit> f26707c;

        /* JADX WARN: Multi-variable type inference failed */
        d(List<GoogleAdData> list, LocalThemeScope localThemeScope, Function1<? super GoogleAdAnalytics, Unit> function1) {
            this.f26705a = list;
            this.f26706b = localThemeScope;
            this.f26707c = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1916868521, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListTabsComposables.kt:392)");
            }
            List<GoogleAdData> list = this.f26705a;
            GoogleAdData googleAdData = list != null ? (GoogleAdData) CollectionsKt.v0(list, 0) : null;
            if (googleAdData != null) {
                P.u(this.f26706b, null, googleAdData, this.f26707c, composer, LocalThemeScope.f17314g | (GoogleAdData.f134248f << 6), 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<CouponAd, Unit> f26708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Xr.a f26709b;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super CouponAd, Unit> function1, Xr.a aVar) {
            this.f26708a = function1;
            this.f26709b = aVar;
        }

        public final void a() {
            Function1<CouponAd, Unit> function1 = this.f26708a;
            if (function1 != null) {
                function1.invoke(Xr.b.c((a.Ad) this.f26709b));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Qk.a, Unit> f26710a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super Qk.a, Unit> function1) {
            this.f26710a = function1;
        }

        public final void a() {
            this.f26710a.invoke(new a.ViewCouponList(Qk.c.f31048l, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f26711f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f26711f = list;
        }

        public final Object a(int i10) {
            this.f26711f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f26712f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26713g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f26714h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f26715i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f26716j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Xr.a f26717k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Xr.a f26718l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f26719m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f26720n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f26721o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function1 function1, boolean z10, int i10, Xr.a aVar, Xr.a aVar2, List list2, Function1 function12, Function1 function13) {
            super(4);
            this.f26712f = list;
            this.f26713g = localThemeScope;
            this.f26714h = function1;
            this.f26715i = z10;
            this.f26716j = i10;
            this.f26717k = aVar;
            this.f26718l = aVar2;
            this.f26719m = list2;
            this.f26720n = function12;
            this.f26721o = function13;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            GoogleAdData googleAdData;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Xr.a aVar = (Xr.a) this.f26712f.get(i10);
            composer.startReplaceGroup(-941688657);
            if (aVar instanceof a.Coupon) {
                composer.startReplaceGroup(-941678397);
                LocalThemeScope localThemeScope = this.f26713g;
                Function1 function1 = this.f26714h;
                int i13 = LocalThemeScope.f17314g;
                C.f(localThemeScope, null, Xr.b.b(aVar).getCouponListItemDecorator(), "coupon_at_" + i10 + "_index", function1, composer, i13, 1);
                if (this.f26715i && this.f26716j == 0 && (Intrinsics.e(aVar, this.f26717k) || Intrinsics.e(aVar, this.f26718l))) {
                    List list = this.f26719m;
                    if (list != null) {
                        googleAdData = (GoogleAdData) CollectionsKt.v0(list, Intrinsics.e((a.Coupon) aVar, this.f26717k) ? 1 : 2);
                    } else {
                        googleAdData = null;
                    }
                    GoogleAdData googleAdData2 = googleAdData;
                    if (googleAdData2 != null) {
                        P.u(this.f26713g, null, googleAdData2, this.f26721o, composer, i13 | (GoogleAdData.f134248f << 6), 1);
                    }
                }
                composer.P();
            } else if (aVar instanceof a.Ad) {
                composer.startReplaceGroup(-940575665);
                a.Ad ad2 = (a.Ad) aVar;
                String imageURL = ad2.getImageURL();
                String imageDescription = ad2.getImageDescription();
                if (imageDescription == null) {
                    imageDescription = ad2.getTitle();
                }
                LocalThemeScope localThemeScope2 = this.f26713g;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f26720n) | composer.V(aVar);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new e(this.f26720n, aVar);
                    composer.t(objB);
                }
                composer.P();
                w.e(localThemeScope2, null, imageURL, "coupon_ad_banner", imageDescription, false, (Function0) objB, composer, LocalThemeScope.f17314g | 3072, 17);
                composer.P();
            } else if (aVar instanceof a.Header) {
                composer.startReplaceGroup(-940157444);
                LocalThemeScope localThemeScope3 = this.f26713g;
                a.Header header = (a.Header) aVar;
                String name = header.getName();
                String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Nr.g.f22651D, Integer.valueOf(header.getSize()));
                Intrinsics.i(string, "getString(...)");
                w.h(localThemeScope3, name, string, null, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else if (aVar instanceof a.SpecialOffersBanner) {
                composer.startReplaceGroup(-939736185);
                String specialOffersUrl = ((a.SpecialOffersBanner) aVar).getSpecialOffersUrl();
                LocalThemeScope localThemeScope4 = this.f26713g;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f26714h);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new f(this.f26714h);
                    composer.t(objB2);
                }
                composer.P();
                w.e(localThemeScope4, null, specialOffersUrl, "coupon_special_offer_banner", null, true, (Function0) objB2, composer, LocalThemeScope.f17314g | 224256, 1);
                composer.P();
            } else {
                if (!(aVar instanceof a.SpecialOffersHeader)) {
                    composer.startReplaceGroup(1632190932);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-939245393);
                composer.P();
            }
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26722a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26723b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26724a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f26725b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f26724a = localThemeScope;
                this.f26725b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1725081997, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.FilterAndSortBar.<anonymous>.<anonymous>.<anonymous> (CouponListTabsComposables.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f26724a;
                q1.Label labelY = q1.Label.y(this.f26725b.getLabels().getEnabledLabel(), null, null, null, null, 0, false, 0, this.f26724a.getAdsTypography().getHeadings().getSeven().d(this.f26724a.getAdsColors().getAdsColorEnabled01()), null, 383, null);
                String upperCase = C16338g.c(Nr.g.f22724y, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        i(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f26722a = localThemeScope;
            this.f26723b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1438759008, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.FilterAndSortBar.<anonymous>.<anonymous> (CouponListTabsComposables.kt:122)");
            }
            E0.b(this.f26722a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, C18370z.f(Modifier.INSTANCE, "filter_and_sort_button", null, 2, null), false, null, 831, null), this.f26723b, ComposableLambdaKt.c(1725081997, true, new a(this.f26722a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Pr/P$j", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdManagerAdView f26726a;

        public j(AdManagerAdView adManagerAdView) {
            this.f26726a = adManagerAdView;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            Intrinsics.h(this.f26726a, "null cannot be cast to non-null type android.view.ViewGroup");
            AdManagerAdView adManagerAdView = this.f26726a;
            adManagerAdView.removeView(adManagerAdView);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26728b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26729c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26730d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26731e;

        k(LocalThemeScope localThemeScope, String str, String str2, Function0<Unit> function0, Function0<Unit> function02) {
            this.f26727a = localThemeScope;
            this.f26728b = str;
            this.f26729c = str2;
            this.f26730d = function0;
            this.f26731e = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC15153W interfaceC15153W, String str, LocalThemeScope localThemeScope, String str2, Function0 function0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str);
            H1.L(AdsInputField, q1.h.DrawableIcon.y(interfaceC15153W.getIcons().getFieldIcon(), null, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorPlaceholder(), null, 95, null), C.a.B.f16864e, null, null, 8, null);
            AdsInputField.q0(q1.h.DrawableIcon.y(interfaceC15153W.getIcons().getBarCodeIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getSeven().getDp()), 63, null), C.b.h.C0301b.f17006e, str2, function0);
            return Unit.f143329a;
        }

        public final void c(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-795300279, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.SearchBar.<anonymous>.<anonymous> (CouponListTabsComposables.kt:157)");
            }
            LocalThemeScope localThemeScope = this.f26727a;
            String str = this.f26728b;
            q1.f.TextInput textInput = Assemble.getInputFields().getStatic();
            Ki.I iC = Assemble.getInputFields().getStatic().getTextStyle().d(this.f26727a.getAdsColors().getAdsColorPlaceholder()).c(H1.w.i(16));
            composer.startReplaceGroup(220624027);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composer.P();
            Function0<Unit> function0 = this.f26731e;
            if (d(h0.o.a(lVar, composer, 0))) {
                function0.invoke();
            }
            Unit unit = Unit.f143329a;
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInput, null, true, null, iC, null, null, null, false, 0, lVar, null, null, 3573, null);
            Modifier modifierE = C13572f.e(androidx.compose.foundation.b.d(T0.e.a(Assemble.getInputFields().getStatic().getModifier(), C16806i.c(this.f26727a.getAdsSpacing().getTwo().getDp())), this.f26727a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C13575i.a(this.f26727a.getAdsSpacing().getOne().getDp(), this.f26727a.getAdsColors().getAdsColorUIBackground01().getColor()), C16806i.c(this.f26727a.getAdsSpacing().getTwo().getDp()));
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Pr.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P.k.e((String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f26728b) | composer.D(this.f26727a) | composer.V(this.f26729c) | composer.V(this.f26730d);
            final String str2 = this.f26728b;
            final LocalThemeScope localThemeScope2 = this.f26727a;
            final String str3 = this.f26729c;
            final Function0<Unit> function02 = this.f26730d;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                Function1 function12 = new Function1() { // from class: Pr.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P.k.f(Assemble, str2, localThemeScope2, str3, function02, (H1) obj);
                    }
                };
                composer.t(function12);
                objB3 = function12;
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInputY, modifierE, function1, (Function1) objB3, composer, LocalThemeScope.f17314g | 24576 | (q1.f.TextInput.f142293m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            c(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean d(z1<Boolean> z1Var) {
            return z1Var.getValue().booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final boolean r31, final boolean r32, final java.util.List<Xr.CouponListTabContent> r33, final kotlin.AbstractC16037C r34, final l0.C15429A r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final boolean r39, kotlin.jvm.functions.Function1<? super com.meijer.mobile.core.models.coupon.CouponAd, kotlin.Unit> r40, java.util.List<gi.GoogleAdData> r41, final kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.j(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, java.util.List, o0.C, l0.A, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final boolean r41, final boolean r42, final java.util.List<? extends Xr.a> r43, final java.util.List<? extends Xr.a> r44, final bk.AbstractC6392a r45, final bk.AbstractC6392a r46, final l0.C15429A r47, final kotlin.AbstractC16037C r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final boolean r53, kotlin.jvm.functions.Function1<? super com.meijer.mobile.core.models.coupon.CouponAd, kotlin.Unit> r54, java.util.List<gi.GoogleAdData> r55, final kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.n(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, java.util.List, java.util.List, bk.a, bk.a, l0.A, o0.C, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, final java.util.List<? extends Xr.a> r34, final bk.AbstractC6392a r35, final l0.C15429A r36, int r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super Qk.a, kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super com.meijer.mobile.core.models.coupon.CouponAd, kotlin.Unit> r40, final boolean r41, java.util.List<gi.GoogleAdData> r42, final kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.p(Ki.M, androidx.compose.ui.Modifier, java.util.List, bk.a, l0.A, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, List list, AbstractC16037C abstractC16037C, C15429A c15429a, Function0 function0, Function1 function1, Function0 function02, boolean z12, Function1 function12, List list2, Function1 function13, int i10, int i11, int i12, Composer composer, int i13) {
        j(localThemeScope, modifier, z10, z11, list, abstractC16037C, c15429a, function0, function1, function02, z12, function12, list2, function13, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r19, final java.util.List<java.lang.String> r20, final kotlin.AbstractC16037C r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.l(Ki.M, java.util.List, o0.C, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, List list, AbstractC16037C abstractC16037C, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, list, abstractC16037C, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, List list, List list2, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, C15429A c15429a, AbstractC16037C abstractC16037C, Function0 function0, Function0 function02, Function1 function1, Function0 function03, boolean z12, Function1 function12, List list3, Function1 function13, int i10, int i11, int i12, Composer composer, int i13) {
        n(localThemeScope, modifier, z10, z11, list, list2, abstractC6392a, abstractC6392a2, c15429a, abstractC16037C, function0, function02, function1, function03, z12, function12, list3, function13, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(boolean z10, int i10, List list, List list2, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Xr.a aVar, Xr.a aVar2, Function1 function13, l0.w LazyColumn) {
        List list3;
        LocalThemeScope localThemeScope2;
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (z10 && i10 == 0) {
            list3 = list2;
            localThemeScope2 = localThemeScope;
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1916868521, true, new d(list3, localThemeScope2, function1)), 3, null);
        } else {
            list3 = list2;
            localThemeScope2 = localThemeScope;
        }
        LazyColumn.i(list.size(), null, new g(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(list, localThemeScope2, function12, z10, i10, aVar, aVar2, list3, function13, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, List list, AbstractC6392a abstractC6392a, C15429A c15429a, int i10, Function0 function0, Function1 function1, Function1 function12, boolean z10, List list2, Function1 function13, int i11, int i12, int i13, Composer composer, int i14) {
        p(localThemeScope, modifier, list, abstractC6392a, c15429a, i10, function0, function1, function12, z10, list2, function13, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ki.LocalThemeScope r29, final java.lang.String r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.s(Ki.M, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, String str, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, str, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, gi.GoogleAdData r18, final kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.u(Ki.M, androidx.compose.ui.Modifier, gi.d, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E v(AdManagerAdView adManagerAdView, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        return new j(adManagerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Modifier modifier, GoogleAdData googleAdData, Function1 function1, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, modifier, googleAdData, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ki.LocalThemeScope r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.P.x(Ki.M, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Function0 function0, Function0 function02, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, function0, function02, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
