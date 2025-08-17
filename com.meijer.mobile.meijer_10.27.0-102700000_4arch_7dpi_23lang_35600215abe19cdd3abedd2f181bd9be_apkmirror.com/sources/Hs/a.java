package Hs;

import Hs.a;
import Ji.LocalThemeScope;
import Js.WeeklyAdItem;
import Js.WeeklyAdPrintPage;
import Ls.a;
import P0.e;
import Ps.o;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13457y;
import j0.InterfaceC14814f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import p1.C16190d;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13185a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15343c, Composer, Integer, Unit> f13186b = ComposableLambdaKt.composableLambdaInstance(-1197788430, false, C0208a.f13188a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f13187c = ComposableLambdaKt.composableLambdaInstance(-196516957, false, b.f13189a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Hs.a$a, reason: collision with other inner class name */
    static final class C0208a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0208a f13188a = new C0208a();

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            int i11;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(item) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1197788430, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-1197788430.<anonymous> (WeeklyAdViewScreen.kt:128)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = InterfaceC15343c.f(item, companion, 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C13457y.a(C16190d.c(Bj.i.f2684P1, composer, 0), null, C5664j.f48612a.g(companion, companion2.e()), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        C0208a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13189a = new b();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hs.a$b$a, reason: collision with other inner class name */
        static final class C0209a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f13190a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f13191b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<o.ViewState> f13192c;

            C0209a(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<o.ViewState> interfaceC5730l02) {
                this.f13190a = localThemeScope;
                this.f13191b = interfaceC5730l0;
                this.f13192c = interfaceC5730l02;
            }

            public final void a(InterfaceC14814f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-686066952, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-196516957.<anonymous>.<anonymous> (WeeklyAdViewScreen.kt:299)");
                }
                LocalThemeScope localThemeScope = this.f13190a;
                String strF = b.f(this.f13191b);
                int i11 = LocalThemeScope.f15770g;
                Li.h.h(localThemeScope, "Last Action", strF, null, composer, i11 | 48, 4);
                Li.h.h(this.f13190a, "Last Action", String.valueOf(b.k(this.f13192c).getCurrentPage()), null, composer, i11 | 48, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Hs.a$b$b, reason: collision with other inner class name */
        static final class C0210b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f13193a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<o.ViewState> f13194b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f13195c;

            C0210b(LocalThemeScope localThemeScope, InterfaceC5730l0<o.ViewState> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02) {
                this.f13193a = localThemeScope;
                this.f13194b = interfaceC5730l0;
                this.f13195c = interfaceC5730l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, o.f action) {
                Intrinsics.j(action, "action");
                b.g(interfaceC5730l0, action.toString());
                if (!(action instanceof o.f.FlyerClicked) && !(action instanceof o.f.BottomSheetScrollStateChange) && !(action instanceof o.f.HybridListItemClicked) && !(action instanceof o.f.PagerSwipe)) {
                    if (Intrinsics.e(action, o.f.C0680f.f29258a)) {
                        b.l(interfaceC5730l02, o.ViewState.d(b.k(interfaceC5730l02), null, null, b.k(interfaceC5730l02).getCurrentPage() + 1, false, null, false, null, 123, null));
                    } else {
                        if (!Intrinsics.e(action, o.f.d.f29256a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b.l(interfaceC5730l02, o.ViewState.d(b.k(interfaceC5730l02), null, null, b.k(interfaceC5730l02).getCurrentPage() - 1, false, null, false, null, 123, null));
                    }
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5730l0 interfaceC5730l0) {
                b.g(interfaceC5730l0, "Change DrawerState clicked");
                return Unit.f142422a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1985815209, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-196516957.<anonymous>.<anonymous> (WeeklyAdViewScreen.kt:303)");
                }
                LocalThemeScope localThemeScope = this.f13193a;
                o.ViewState viewStateK = b.k(this.f13194b);
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5730l0<String> interfaceC5730l0 = this.f13195c;
                final InterfaceC5730l0<o.ViewState> interfaceC5730l02 = this.f13194b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Hs.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a.b.C0210b.d(interfaceC5730l0, interfaceC5730l02, (o.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<String> interfaceC5730l03 = this.f13195c;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: Hs.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.b.C0210b.e(interfaceC5730l03);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                o.g(localThemeScope, null, viewStateK, function1, (Function0) objB2, composer, LocalThemeScope.f15770g | 27648, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-196516957, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-196516957.<anonymous> (WeeklyAdViewScreen.kt:238)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e("No Action", null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                List listP = CollectionsKt.p(new WeeklyAdPrintPage(0, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null), new WeeklyAdPrintPage(1, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null), new WeeklyAdPrintPage(2, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                List listE = CollectionsKt.e("Category1");
                WeeklyAdItem.PriceText priceText = new WeeklyAdItem.PriceText("1", null, null, 6, null);
                Js.d dVar = Js.d.f16106b;
                objB2 = t1.e(new o.ViewState(null, null, 0, false, new a.WeeklyAdPrintInfo(listP, CollectionsKt.s(new WeeklyAdItem(0, 0, "Product 1", null, listE, 1, 0, null, null, null, 0L, priceText, null, dVar, null, null, null, null, false, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 2", null, CollectionsKt.e("Category2"), 1, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 3", null, CollectionsKt.e("Category2"), 1, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 5", null, CollectionsKt.e("Category1"), 2, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 1", null, CollectionsKt.e("Category1"), 2, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null))), false, null, 67, null), null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composer.P();
            Li.h.f(AdsTheme, ComposableLambdaKt.c(-686066952, true, new C0209a(AdsTheme, interfaceC5730l0, interfaceC5730l02), composer, 54), ComposableLambdaKt.c(1985815209, true, new C0210b(AdsTheme, interfaceC5730l02, interfaceC5730l0), composer, 54), composer, (i11 & 14) | LocalThemeScope.f15770g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            e(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.ViewState k(InterfaceC5730l0<o.ViewState> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5730l0<o.ViewState> interfaceC5730l0, o.ViewState viewState) {
            interfaceC5730l0.setValue(viewState);
        }
    }

    public final Function3<InterfaceC15343c, Composer, Integer, Unit> a() {
        return f13186b;
    }
}
