package qo;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.ClippedReward;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.j0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import j0.C14903g;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import no.PointsExpState;
import oi.C16196t0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import qo.C16710B;
import r1.C16819m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001ac\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u001c\u0010\u0017\u001a\u001d\u0010\u001d\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LKi/M;", "Lqo/M;", "rewardsViewState", "Lno/d;", "pointsExpirationState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onViewDisclaimersBottomSheetClick", "Lkotlin/Function1;", "Lco/h;", "onNavigationRequest", "Lco/i;", "onResourceAction", "w", "(LKi/M;Lqo/M;Lno/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lco/e;", "clippedRewards", "l", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "activeRewardsCount", "n", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "A", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qo.B, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16710B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.B$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6536h, Unit> f158777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ClippedReward> f158778c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC6536h, Unit> function1, List<ClippedReward> list) {
            this.f158776a = localThemeScope;
            this.f158777b = function1;
            this.f158778c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, List list) {
            function1.invoke(new AbstractC6536h.OnViewAllRewardsClicked(list));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(246653389, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ClippedRewardsRow.<anonymous>.<anonymous>.<anonymous> (RewardsTabView.kt:356)");
            }
            LocalThemeScope localThemeScope = this.f158776a;
            float f10 = 30;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(145)), H1.h.p(142)), H1.h.p(f10), this.f158776a.getAdsSpacing().getFive().getDp(), H1.h.p(f10), 0.0f, 8, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f158777b) | composer.D(this.f158778c);
            final Function1<AbstractC6536h, Unit> function1 = this.f158777b;
            final List<ClippedReward> list = this.f158778c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: qo.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16710B.a.c(function1, list);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16710B.A(localThemeScope, ClickableKt.d(modifierM, false, null, null, (Function0) objB, 7, null), composer, LocalThemeScope.f17314g, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: qo.B$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f158779f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ClippedReward clippedReward) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: qo.B$c */
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f158780f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f158781g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f158780f = function1;
            this.f158781g = list;
        }

        public final Object a(int i10) {
            return this.f158780f.invoke(this.f158781g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: qo.B$d */
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f158782f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158783g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f158784h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f158782f = list;
            this.f158783g = localThemeScope;
            this.f158784h = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
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
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ClippedReward clippedReward = (ClippedReward) this.f158782f.get(i10);
            composer.startReplaceGroup(721504583);
            C16728c.c(this.f158783g, clippedReward, P0.o.a(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(311)), 0.0f, H1.h.p(148), 1, null), this.f158783g.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f), false, this.f158784h, composer, LocalThemeScope.f17314g, 4);
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
    @SourceDebugExtension
    /* renamed from: qo.B$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158785a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6536h, Unit> f158786b;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super AbstractC6536h, Unit> function1) {
            this.f158785a = localThemeScope;
            this.f158786b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(AbstractC6536h.i.f62749a);
            return Unit.f143329a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(363603179, i10, -1, "com.meijer.mobile.mperks.ux.rewards.RewardsEmptyState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RewardsTabView.kt:171)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f158785a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f158785a;
            final Function1<AbstractC6536h, Unit> function1 = this.f158786b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C13590y.a(C16335d.c(g0.f115004d, composer, 0), null, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, null, 0.0f, null, composer, 432, BinsView.TOTE_HEIGHT_DP);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getSix().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 5, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: qo.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16710B.e.d((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label labelY = q1.Label.y(label, C16819m.d(modifierM, false, (Function1) objB, 1, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, null, null, HttpResponseStatus.ERROR_BAD_GATEWAY, null);
            String strC = C16338g.c(j0.f115133a1, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, labelY, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC2 = C16338g.c(j0.f115129Z0, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB2 = composer.B();
            if (zV || objB2 == companion3.a()) {
                objB2 = new Function0() { // from class: qo.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16710B.e.e(function1);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            P0.k(localThemeScope, c16196t0, strC2, (Function0) objB2, null, null, true, 0L, false, composer, i11 | 1572864 | (C16196t0.f154257b << 3), 216);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.B$f */
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6536h, Unit> f158788b;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, Function1<? super AbstractC6536h, Unit> function1) {
            this.f158787a = localThemeScope;
            this.f158788b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(AbstractC6536h.C1234h.f62748a);
            return Unit.f143329a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1244423060, i10, -1, "com.meijer.mobile.mperks.ux.rewards.RewardsEmptyState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RewardsTabView.kt:212)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f158787a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f158787a;
            final Function1<AbstractC6536h, Unit> function1 = this.f158788b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C13590y.a(C16335d.c(g0.f115005e, composer, 0), null, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, null, 0.0f, null, composer, 432, BinsView.TOTE_HEIGHT_DP);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getSix().getDp(), 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 5, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: qo.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16710B.f.d((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label labelY = q1.Label.y(label, C16819m.d(modifierM, false, (Function1) objB, 1, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, null, null, HttpResponseStatus.ERROR_BAD_GATEWAY, null);
            String strC = C16338g.c(j0.f115141c1, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, labelY, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            C16196t0 c16196t0 = C16196t0.f154256a;
            String strC2 = C16338g.c(j0.f115137b1, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB2 = composer.B();
            if (zV || objB2 == companion3.a()) {
                objB2 = new Function0() { // from class: qo.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16710B.f.e(function1);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            P0.k(localThemeScope, c16196t0, strC2, (Function0) objB2, null, null, true, 0L, false, composer, i11 | 1572864 | (C16196t0.f154257b << 3), 216);
            composer.v();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.A(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void l(final Ki.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final java.util.List<co.ClippedReward> r27, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.l(Ki.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void n(final Ki.LocalThemeScope r34, final int r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.n(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        n(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final java.util.List<co.ClippedReward> r21, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.q(Ki.M, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(List list, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List listB1 = CollectionsKt.b1(list, 3);
        LazyRow.i(listB1.size(), null, new c(b.f158779f, listB1), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(listB1, localThemeScope, function1)));
        if (list.size() >= 3) {
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(246653389, true, new a(localThemeScope, function1, list)), 3, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.t(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    @android.annotation.SuppressLint({"CoroutineCreationDuringComposition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ki.LocalThemeScope r22, final qo.RewardsViewState r23, final no.PointsExpState r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16710B.w(Ki.M, qo.M, no.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1) {
        function1.invoke(AbstractC6537i.o.f62777a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1) {
        function1.invoke(AbstractC6536h.m.f62753a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, RewardsViewState rewardsViewState, PointsExpState pointsExpState, Modifier modifier, Function0 function0, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, rewardsViewState, pointsExpState, modifier, function0, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
