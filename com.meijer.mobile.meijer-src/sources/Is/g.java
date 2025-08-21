package Is;

import Is.g;
import Js.WeeklyAdPublication;
import Ki.K;
import Ki.LocalThemeScope;
import P0.e;
import Ps.i;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import java.util.List;
import java.util.Locale;
import ki.q1;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import l0.InterfaceC15433c;
import l0.w;
import m5.C15669h;
import mv.InterfaceC15783O;
import oi.C16208z0;
import oi.P0;
import p1.C16338g;
import si.j;
import sr.p;
import us.C17456B;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aC\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001ag\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LPs/i$c;", "viewState", "Lkotlin/Function1;", "LPs/i$a;", "", "onAction", "", "isGoogleAdEnabled", "l", "(LKi/M;Landroidx/compose/ui/Modifier;LPs/i$c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "La5/h;", "imageLoader", "Lm5/h$a;", "builder", "LJs/e;", "weeklyAdPublication", "Lkotlin/Function0;", "onClick", "Lgi/d;", "googleAdData", "onGoogleAdAction", "h", "(LKi/M;Landroidx/compose/ui/Modifier;La5/h;Lm5/h$a;LJs/e;Lkotlin/jvm/functions/Function0;Lgi/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(Lgi/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "date", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f15247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<i.a, Unit> f15248b;

        /* JADX WARN: Multi-variable type inference failed */
        a(GoogleAdData googleAdData, Function1<? super i.a, Unit> function1) {
            this.f15247a = googleAdData;
            this.f15248b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            function1.invoke(new i.a.GoogleAdClicked(googleAdAnalytics));
            return Unit.f143329a;
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(692152076, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdSelection.GoogleAdSection.<anonymous> (WeeklyAdSelectionScreen.kt:243)");
            }
            if (this.f15247a != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(J.h(companion, 0.0f, 1, null), AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                GoogleAdData googleAdData = this.f15247a;
                final Function1<i.a, Unit> function1 = this.f15248b;
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                C5806j c5806j = C5806j.f48836a;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion2.g(), composer, 48);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                C1 c12 = C1.f167869a;
                long color = AdsTheme.getAdsColors().getAdsColorUIDivider().getColor();
                int i12 = C1.f167873e;
                c12.a(null, 0.0f, color, composer, i12 << 9, 3);
                float f10 = 16;
                C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Is.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g.a.c(function1, (GoogleAdAnalytics) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                p.C(AdsTheme, null, googleAdData, (Function1) objB, composer, LocalThemeScope.f17314g | (i11 & 14) | (GoogleAdData.f134248f << 6), 1);
                C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
                c12.a(null, 0.0f, AdsTheme.getAdsColors().getAdsColorUIDivider().getColor(), composer, i12 << 9, 3);
                composer.v();
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15669h.a f15250b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdPublication f15251c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a5.h f15252d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f15253e;

        b(LocalThemeScope localThemeScope, C15669h.a aVar, WeeklyAdPublication weeklyAdPublication, a5.h hVar, InterfaceC5872l0<String> interfaceC5872l0) {
            this.f15249a = localThemeScope;
            this.f15250b = aVar;
            this.f15251c = weeklyAdPublication;
            this.f15252d = hVar;
            this.f15253e = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1676271154, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdSelection.WeeklyAdSelectionListItem.<anonymous>.<anonymous> (WeeklyAdSelectionScreen.kt:182)");
            }
            C1.f167869a.a(null, H1.h.p(1), this.f15249a.getAdsColors().getAdsColorUIDivider().getColor(), composer, (C1.f167873e << 9) | 48, 1);
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion2, H1.h.p(4));
            C15669h.a aVar = this.f15250b;
            WeeklyAdPublication weeklyAdPublication = this.f15251c;
            a5.h hVar = this.f15252d;
            LocalThemeScope localThemeScope2 = this.f15249a;
            InterfaceC5872l0<String> interfaceC5872l0 = this.f15253e;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            float f10 = 8;
            C6484c.e(aVar.f(weeklyAdPublication.getImageURL()).e(true).p(C17456B.f164381a).j(C17456B.f164381a).c(), null, hVar, J.w(D.k(companion2, H1.h.p(f10), 0.0f, 2, null), H1.h.p(HttpResponseStatus.SUCCESS_OK), H1.h.p(180)), null, null, null, null, 0.0f, null, 0, false, null, composer, 3120, 0, 8176);
            C14890K.a(J.z(companion2, H1.h.p(12)), composer, 6);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(1419183762);
            if (WeeklyAdPublication.E(weeklyAdPublication, null, 1, null)) {
                localThemeScope = localThemeScope2;
                j.h(localThemeScope, new q1.Label(androidx.compose.foundation.b.d(D.i(companion2, H1.h.p(f10)), localThemeScope2.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 382, null), C16338g.c(Bs.a.f3662d, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            } else {
                localThemeScope = localThemeScope2;
            }
            composer.P();
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            String title = weeklyAdPublication.getTitle();
            if (title == null) {
                title = "";
            }
            String str = title;
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            String strI = g.i(interfaceC5872l0);
            composer.startReplaceGroup(1419210396);
            if (strI != null) {
                j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null), strI, null, composer, i11 | (i12 << 3), 4);
            }
            composer.P();
            composer.v();
            composer.v();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.compose.weeklyAdSelection.WeeklyAdSelectionScreenKt$WeeklyAdSelectionScreen$1$1", f = "WeeklyAdSelectionScreen.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15254a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15255b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f15256c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<i.a, Unit> f15257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z10, GoogleAdData googleAdData, Function1<? super i.a, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15255b = z10;
            this.f15256c = googleAdData;
            this.f15257d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15255b, this.f15256c, this.f15257d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f15254a == 0) {
                ResultKt.b(obj);
                if (this.f15255b && this.f15256c == null) {
                    this.f15257d.invoke(i.a.C0498a.f27072a);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.ViewState f15259b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<i.a, Unit> f15260c;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, i.ViewState cVar, Function1<? super i.a, Unit> function1) {
            this.f15258a = localThemeScope;
            this.f15259b = cVar;
            this.f15260c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(i.a.d.f27076a);
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-214437696, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdSelection.WeeklyAdSelectionScreen.<anonymous>.<anonymous>.<anonymous> (WeeklyAdSelectionScreen.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 4;
            C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
            LocalThemeScope localThemeScope = this.f15258a;
            q1.Label label = new q1.Label(null, this.f15258a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null);
            String strC = C16338g.c(com.meijer.mobile.weeklyad.c.f120263o, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
            j.h(this.f15258a, new q1.Label(null, null, null, null, 0, false, 0, this.f15258a.getAdsTypography().getHeadings().getSix(), null, 383, null), this.f15259b.getStoreName(), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
            C16208z0 c16208z0 = C16208z0.f154285a;
            String upperCase = C16338g.c(com.meijer.mobile.weeklyad.c.f120260l, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            LocalThemeScope localThemeScope2 = this.f15258a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f15260c);
            final Function1<i.a, Unit> function1 = this.f15260c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Is.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.d.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope2, c16208z0, upperCase, (Function0) objB, null, null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 248);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<i.a, Unit> f15261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeeklyAdPublication f15262b;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super i.a, Unit> function1, WeeklyAdPublication weeklyAdPublication) {
            this.f15261a = function1;
            this.f15262b = weeklyAdPublication;
        }

        public final void a() {
            this.f15261a.invoke(new i.a.ViewWeeklyAd(this.f15262b));
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
        final /* synthetic */ Function1<i.a, Unit> f15263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeeklyAdPublication f15264b;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super i.a, Unit> function1, WeeklyAdPublication weeklyAdPublication) {
            this.f15263a = function1;
            this.f15264b = weeklyAdPublication;
        }

        public final void a() {
            this.f15263a.invoke(new i.a.ViewWeeklyAd(this.f15264b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: Is.g$g, reason: collision with other inner class name */
    public static final class C0245g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f15265f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0245g(List list) {
            super(1);
            this.f15265f = list;
        }

        public final Object a(int i10) {
            this.f15265f.get(i10);
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
        final /* synthetic */ List f15266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15267g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15268h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f15269i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ GoogleAdData f15270j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f15271k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, boolean z10, LocalThemeScope localThemeScope, Function1 function1, GoogleAdData googleAdData, InterfaceC5872l0 interfaceC5872l0) {
            super(4);
            this.f15266f = list;
            this.f15267g = z10;
            this.f15268h = localThemeScope;
            this.f15269i = function1;
            this.f15270j = googleAdData;
            this.f15271k = interfaceC5872l0;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            Composer composer2;
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
            WeeklyAdPublication weeklyAdPublication = (WeeklyAdPublication) this.f15266f.get(i10);
            composer.startReplaceGroup(1215371264);
            if (i10 == 0 && this.f15267g) {
                composer.startReplaceGroup(1215391227);
                LocalThemeScope localThemeScope = this.f15268h;
                Modifier.Companion companion = Modifier.INSTANCE;
                a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                C15669h.a aVarM = g.m(this.f15271k);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f15269i) | composer.D(weeklyAdPublication);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new e(this.f15269i, weeklyAdPublication);
                    composer.t(objB);
                }
                composer.P();
                composer2 = composer;
                g.h(localThemeScope, companion, hVarA, aVarM, weeklyAdPublication, (Function0) objB, this.f15270j, this.f15269i, composer2, LocalThemeScope.f17314g | 48 | (GoogleAdData.f134248f << 18), 0);
                composer2.P();
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1215984381);
                LocalThemeScope localThemeScope2 = this.f15268h;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                a5.h hVarA2 = a5.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                C15669h.a aVarM2 = g.m(this.f15271k);
                composer2.startReplaceGroup(-1633490746);
                boolean zV2 = composer2.V(this.f15269i) | composer2.D(weeklyAdPublication);
                Object objB2 = composer2.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new f(this.f15269i, weeklyAdPublication);
                    composer2.t(objB2);
                }
                composer2.P();
                g.h(localThemeScope2, companion2, hVarA2, aVarM2, weeklyAdPublication, (Function0) objB2, null, null, composer2, LocalThemeScope.f17314g | 48, 96);
                composer2.P();
            }
            composer2.P();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(GoogleAdData googleAdData, Function1 function1, int i10, Composer composer, int i11) {
        f(googleAdData, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[PHI: r15
      0x00d0: PHI (r15v18 int) = (r15v1 int), (r15v7 int), (r15v8 int) binds: [B:68:0x00ce, B:78:0x00e8, B:77:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final a5.h r24, final m5.C15669h.a r25, final Js.WeeklyAdPublication r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, gi.GoogleAdData r28, kotlin.jvm.functions.Function1<? super Ps.i.a, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Is.g.h(Ki.M, androidx.compose.ui.Modifier, a5.h, m5.h$a, Js.e, kotlin.jvm.functions.Function0, gi.d, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, a5.h hVar, C15669h.a aVar, WeeklyAdPublication weeklyAdPublication, Function0 function0, GoogleAdData googleAdData, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, hVar, aVar, weeklyAdPublication, function0, googleAdData, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final Ps.i.ViewState r25, final kotlin.jvm.functions.Function1<? super Ps.i.a, kotlin.Unit> r26, boolean r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Is.g.l(Ki.M, androidx.compose.ui.Modifier, Ps.i$c, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(i.ViewState cVar, LocalThemeScope localThemeScope, Function1 function1, boolean z10, GoogleAdData googleAdData, InterfaceC5872l0 interfaceC5872l0, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-214437696, true, new d(localThemeScope, cVar, function1)), 3, null);
        List<WeeklyAdPublication> listF = cVar.f();
        LazyColumn.i(listF.size(), null, new C0245g(listF), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(listF, z10, localThemeScope, function1, googleAdData, interfaceC5872l0)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, i.ViewState cVar, Function1 function1, boolean z10, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, cVar, function1, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void f(final GoogleAdData googleAdData, final Function1<? super i.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1317807803);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(googleAdData);
            } else {
                zD = composerStartRestartGroup.D(googleAdData);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1317807803, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdSelection.GoogleAdSection (WeeklyAdSelectionScreen.kt:240)");
            }
            K.b(null, ComposableLambdaKt.c(692152076, true, new a(googleAdData, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Is.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.g(googleAdData, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C15669h.a m(InterfaceC5872l0<C15669h.a> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }
}
