package Hs;

import Hs.a;
import Js.WeeklyAdItem;
import Js.WeeklyAdPrintPage;
import Ki.LocalThemeScope;
import Ls.a;
import P0.e;
import Ps.o;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import j0.InterfaceC14902f;
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
import l0.InterfaceC15433c;
import p1.C16335d;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13995a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15433c, Composer, Integer, Unit> f13996b = ComposableLambdaKt.composableLambdaInstance(-1197788430, false, C0221a.f13998a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f13997c = ComposableLambdaKt.composableLambdaInstance(-196516957, false, b.f13999a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Hs.a$a, reason: collision with other inner class name */
    static final class C0221a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0221a f13998a = new C0221a();

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
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
            Modifier modifierF = InterfaceC15433c.f(item, companion, 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C13590y.a(C16335d.c(Cj.i.f4729P1, composer, 0), null, C5806j.f48836a.g(companion, companion2.e()), null, null, 0.0f, null, composer, 48, BinsView.TOTE_HEIGHT_DP);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        C0221a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13999a = new b();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hs.a$b$a, reason: collision with other inner class name */
        static final class C0222a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14000a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f14001b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<o.ViewState> f14002c;

            C0222a(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<o.ViewState> interfaceC5872l02) {
                this.f14000a = localThemeScope;
                this.f14001b = interfaceC5872l0;
                this.f14002c = interfaceC5872l02;
            }

            public final void a(InterfaceC14902f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-686066952, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-196516957.<anonymous>.<anonymous> (WeeklyAdViewScreen.kt:299)");
                }
                LocalThemeScope localThemeScope = this.f14000a;
                String strF = b.f(this.f14001b);
                int i11 = LocalThemeScope.f17314g;
                Mi.h.h(localThemeScope, "Last Action", strF, null, composer, i11 | 48, 4);
                Mi.h.h(this.f14000a, "Last Action", String.valueOf(b.k(this.f14002c).getCurrentPage()), null, composer, i11 | 48, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Hs.a$b$b, reason: collision with other inner class name */
        static final class C0223b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14003a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<o.ViewState> f14004b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f14005c;

            C0223b(LocalThemeScope localThemeScope, InterfaceC5872l0<o.ViewState> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
                this.f14003a = localThemeScope;
                this.f14004b = interfaceC5872l0;
                this.f14005c = interfaceC5872l02;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, o.f action) {
                Intrinsics.j(action, "action");
                b.g(interfaceC5872l0, action.toString());
                if (!(action instanceof o.f.FlyerClicked) && !(action instanceof o.f.BottomSheetScrollStateChange) && !(action instanceof o.f.HybridListItemClicked) && !(action instanceof o.f.PagerSwipe)) {
                    if (Intrinsics.e(action, o.f.C0500f.f27140a)) {
                        b.l(interfaceC5872l02, o.ViewState.d(b.k(interfaceC5872l02), null, null, b.k(interfaceC5872l02).getCurrentPage() + 1, false, null, false, null, 123, null));
                    } else {
                        if (!Intrinsics.e(action, o.f.d.f27138a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b.l(interfaceC5872l02, o.ViewState.d(b.k(interfaceC5872l02), null, null, b.k(interfaceC5872l02).getCurrentPage() - 1, false, null, false, null, 123, null));
                    }
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0) {
                b.g(interfaceC5872l0, "Change DrawerState clicked");
                return Unit.f143329a;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1985815209, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdHybrid.ComposableSingletons$WeeklyAdViewScreenKt.lambda$-196516957.<anonymous>.<anonymous> (WeeklyAdViewScreen.kt:303)");
                }
                LocalThemeScope localThemeScope = this.f14003a;
                o.ViewState viewStateK = b.k(this.f14004b);
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f14005c;
                final InterfaceC5872l0<o.ViewState> interfaceC5872l02 = this.f14004b;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Hs.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a.b.C0223b.d(interfaceC5872l0, interfaceC5872l02, (o.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<String> interfaceC5872l03 = this.f14005c;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: Hs.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.b.C0223b.e(interfaceC5872l03);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                o.g(localThemeScope, null, viewStateK, function1, (Function0) objB2, composer, LocalThemeScope.f17314g | 27648, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f143329a;
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
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                List listP = CollectionsKt.p(new WeeklyAdPrintPage(0, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null), new WeeklyAdPrintPage(1, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null), new WeeklyAdPrintPage(2, 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                List listE = CollectionsKt.e("Category1");
                WeeklyAdItem.PriceText priceText = new WeeklyAdItem.PriceText("1", null, null, 6, null);
                Js.d dVar = Js.d.f16204b;
                objB2 = t1.e(new o.ViewState(null, null, 0, false, new a.WeeklyAdPrintInfo(listP, CollectionsKt.s(new WeeklyAdItem(0, 0, "Product 1", null, listE, 1, 0, null, null, null, 0L, priceText, null, dVar, null, null, null, null, false, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 2", null, CollectionsKt.e("Category2"), 1, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 3", null, CollectionsKt.e("Category2"), 1, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 5", null, CollectionsKt.e("Category1"), 2, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null), new WeeklyAdItem(0, 0, "Product 1", null, CollectionsKt.e("Category1"), 2, 0, null, null, null, 0L, new WeeklyAdItem.PriceText("1", null, null, 6, null), null, dVar, null, null, null, null, true, null, null, null, 3921867, null))), false, null, 67, null), null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            Mi.h.f(AdsTheme, ComposableLambdaKt.c(-686066952, true, new C0222a(AdsTheme, interfaceC5872l0, interfaceC5872l02), composer, 54), ComposableLambdaKt.c(1985815209, true, new C0223b(AdsTheme, interfaceC5872l02, interfaceC5872l0), composer, 54), composer, (i11 & 14) | LocalThemeScope.f17314g | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            e(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.ViewState k(InterfaceC5872l0<o.ViewState> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5872l0<o.ViewState> interfaceC5872l0, o.ViewState viewState) {
            interfaceC5872l0.setValue(viewState);
        }
    }

    public final Function3<InterfaceC15433c, Composer, Integer, Unit> a() {
        return f13996b;
    }
}
