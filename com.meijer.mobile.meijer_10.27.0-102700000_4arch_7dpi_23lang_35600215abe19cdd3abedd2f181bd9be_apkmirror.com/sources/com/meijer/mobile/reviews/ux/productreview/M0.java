package com.meijer.mobile.reviews.ux.productreview;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import b5.C6197c;
import com.meijer.mobile.reviews.ux.productreview.M0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import java.util.List;
import ji.C14898A;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import l5.C15372h;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import r0.C16692i;
import r1.C16705m;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aW\u0010#\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0003¢\u0006\u0004\b#\u0010$\u001aN\u0010,\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00070'H\u0003¢\u0006\u0004\b,\u0010-¨\u0006/²\u0006\u000e\u0010.\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/reviews/ux/productreview/U0;", "productReviewDecorator", "", "feedbackEnabled", "", "q", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/reviews/ux/productreview/U0;ZLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onWriteReviewClick", "E", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isRecommended", "C", "(LJi/M;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;I)V", "", "reviewText", "", "maxLines", "onReadMoreClick", "t", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "title", "date", "", "starsRating", "A", "(LJi/M;Ljava/lang/String;Ljava/lang/String;DLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "thumbsUpCount", "thumbsDownCount", "thumbsUpClick", "thumbsDownClick", "onReportClick", "y", "(LJi/M;Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "imageList", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "onImageClicked", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showReadMore", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class M0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f115514a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f115515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f115516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f115517d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<String> list, Context context, String str, Function1<? super Integer, Unit> function1) {
            this.f115514a = list;
            this.f115515b = context;
            this.f115516c = str;
            this.f115517d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
        public final void c(InterfaceC15343c item, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1369854851, i10, -1, "com.meijer.mobile.reviews.ux.productreview.HorizontalScrollableImages.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:367)");
            }
            List<String> list = this.f115514a;
            Context context = this.f115515b;
            String str = this.f115516c;
            final Function1<Integer, Unit> function1 = this.f115517d;
            boolean z10 = 0;
            final int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                final String strD = C16193g.d(Lp.c.f18635e, new Object[]{Integer.valueOf(i12), Integer.valueOf(list.size())}, composer, z10);
                C15372h c15372hC = new C15372h.a(context).f((String) obj).p(Bj.i.f2681O1).j(Bj.i.f2681O1).e(true).c();
                Z4.h hVarA = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
                InterfaceC5784k interfaceC5784kA = InterfaceC5784k.INSTANCE.a();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierV = androidx.compose.foundation.layout.J.v(T0.e.a(companion, C16692i.c(H1.h.p(8))), H1.h.p(72));
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function1) | composer.d(i11);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.K0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return M0.a.d(function1, i11);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierD = ClickableKt.d(modifierV, false, str, null, (Function0) objB, 5, null);
                String str2 = str;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(strD);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.L0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return M0.a.e(strD, (r1.u) obj2);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C6197c.e(c15372hC, null, hVarA, C16705m.d(modifierD, z10, (Function1) objB2, 1, null), null, null, null, interfaceC5784kA, 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(6)), composer, 6);
                i11 = i12;
                str = str2;
                function1 = function1;
                z10 = z10;
                context = context;
                list = list;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) throws Resources.NotFoundException {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, int i10) {
            function1.invoke(Integer.valueOf(i10));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f115518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115520c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115521a;

            a(LocalThemeScope localThemeScope) {
                this.f115521a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-439837654, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewBody.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:208)");
                }
                LocalThemeScope localThemeScope = this.f115521a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f115521a.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16193g.c(Lp.c.f18640g0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f115518a = modifier;
            this.f115519b = localThemeScope;
            this.f115520c = function0;
        }

        public final void a(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(129989081, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewBody.<anonymous> (ProductReviewCompose.kt:200)");
            }
            Modifier modifier = this.f115518a;
            LocalThemeScope localThemeScope = this.f115519b;
            Function0<Unit> function0 = this.f115520c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            ni.E0.b(localThemeScope, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(8)), null, null, null, Modifier.INSTANCE, false, localThemeScope.getAdsColors().getAdsColorSupportInformationalBg(), 375, null), function0, ComposableLambdaKt.c(-439837654, true, new a(localThemeScope), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115523b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115524c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115525d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f115526e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f115527f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f115528g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f115529h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f115531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f115532c;

            a(LocalThemeScope localThemeScope, String str, int i10) {
                this.f115530a = localThemeScope;
                this.f115531b = str;
                this.f115532c = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            public final void b(InterfaceC14800I AdsButton, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.V(AdsButton) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1342327688, i11, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewFeedback.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:284)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierV = androidx.compose.foundation.layout.J.v(companion, H1.h.p(20));
                e.Companion companion2 = P0.e.INSTANCE;
                C17988z0.a(C16190d.c(Bj.i.f2702V1, composer, 0), ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(Lp.c.f18662r0), AdsButton.d(modifierV, companion2.i()), this.f115530a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 0, 0);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
                LocalThemeScope localThemeScope = this.f115530a;
                Modifier modifierD = AdsButton.d(companion, companion2.i());
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f115531b);
                final String str = this.f115531b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.N0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return M0.c.a.c(str, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, new q1.Label(C16705m.d(modifierD, false, (Function1) objB, 1, null), this.f115530a.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, this.f115530a.getAdsTypography().getHeadings().getEight(), null, 380, null), String.valueOf(this.f115532c), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115533a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f115534b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f115535c;

            b(LocalThemeScope localThemeScope, String str, int i10) {
                this.f115533a = localThemeScope;
                this.f115534b = str;
                this.f115535c = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            public final void b(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(339915313, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewFeedback.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:314)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                C17988z0.a(C16190d.c(Bj.i.f2699U1, composer, 0), C16193g.c(Lp.c.f18660q0, composer, 0), androidx.compose.foundation.layout.J.v(companion, H1.h.p(20)), this.f115533a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 384, 0);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(8)), composer, 6);
                LocalThemeScope localThemeScope = this.f115533a;
                Ji.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
                Ji.T adsColorLink = this.f115533a.getAdsColors().getAdsColorLink();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f115534b);
                final String str = this.f115534b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.O0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return M0.c.b.c(str, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), adsColorLink, null, null, 0, false, 0, eight, null, 380, null), String.valueOf(this.f115535c), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.M0$c$c, reason: collision with other inner class name */
        static final class C1848c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115536a;

            C1848c(LocalThemeScope localThemeScope) {
                this.f115536a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(831519916, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewFeedback.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:340)");
                }
                LocalThemeScope localThemeScope = this.f115536a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f115536a.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16193g.c(Lp.c.f18644i0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str, int i10, String str2, int i11) {
            this.f115522a = localThemeScope;
            this.f115523b = function0;
            this.f115524c = function02;
            this.f115525d = function03;
            this.f115526e = str;
            this.f115527f = i10;
            this.f115528g = str2;
            this.f115529h = i11;
        }

        public final void a(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1982538567, i10, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewFeedback.<anonymous>.<anonymous> (ProductReviewCompose.kt:273)");
            }
            LocalThemeScope localThemeScope = this.f115522a;
            Function0<Unit> function0 = this.f115524c;
            Function0<Unit> function02 = this.f115525d;
            String str = this.f115526e;
            int i11 = this.f115527f;
            String str2 = this.f115528g;
            int i12 = this.f115529h;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            float f10 = 16;
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            float f11 = 8;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(f11)), null, null, null, companion, false, localThemeScope.getAdsColors().getAdsColorSupportInformationalBg(), 375, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1342327688, true, new a(localThemeScope, str, i11), composer, 54);
            int i13 = LocalThemeScope.f15770g;
            int i14 = q1.d.StandardButton.f139974k;
            ni.E0.b(localThemeScope, standardButtonY, function0, composableLambdaC, composer, i13 | 3072 | (i14 << 3));
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f10)), composer, 6);
            ni.E0.b(localThemeScope, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(f11)), null, null, null, companion, false, localThemeScope.getAdsColors().getAdsColorSupportInformationalBg(), 375, null), function02, ComposableLambdaKt.c(339915313, true, new b(localThemeScope, str2, i12), composer, 54), composer, i13 | 3072 | (i14 << 3));
            composer.v();
            ni.E0.b(this.f115522a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16692i.c(H1.h.p(f11)), null, null, null, companion, false, this.f115522a.getAdsColors().getAdsColorSupportInformationalBg(), 375, null), this.f115523b, ComposableLambdaKt.c(831519916, true, new C1848c(this.f115522a), composer, 54), composer, i13 | 3072 | (i14 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115538b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f115539a;

            a(LocalThemeScope localThemeScope) {
                this.f115539a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1223893535, i10, -1, "com.meijer.mobile.reviews.ux.productreview.WriteProductReview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:140)");
                }
                LocalThemeScope localThemeScope = this.f115539a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f115539a.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null), C16193g.c(Lp.c.f18622W0, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f115537a = localThemeScope;
            this.f115538b = function0;
        }

        public final void a(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1412865196, i10, -1, "com.meijer.mobile.reviews.ux.productreview.WriteProductReview.<anonymous>.<anonymous>.<anonymous> (ProductReviewCompose.kt:136)");
            }
            ni.E0.b(this.f115537a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null), this.f115538b, ComposableLambdaKt.c(1223893535, true, new a(this.f115537a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b8  */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void A(final Ji.LocalThemeScope r33, final java.lang.String r34, final java.lang.String r35, final double r36, androidx.compose.ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.M0.A(Ji.M, java.lang.String, java.lang.String, double, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, String str, String str2, double d10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, str, str2, d10, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void C(LocalThemeScope localThemeScope, final Boolean bool, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-9180752);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(bool) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-9180752, i11, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewRecommendation (ProductReviewCompose.kt:152)");
            }
            if (bool != null) {
                composerStartRestartGroup.startReplaceGroup(-232761302);
                if (bool.booleanValue()) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(8)), composerStartRestartGroup, 6);
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.i(), composerStartRestartGroup, 48);
                    int iA = C5717f.a(composerStartRestartGroup, 0);
                    InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composerStartRestartGroup.k() == null) {
                        C5717f.c();
                    }
                    composerStartRestartGroup.F();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.I(function0A);
                    } else {
                        composerStartRestartGroup.s();
                    }
                    Composer composerA = D1.a(composerStartRestartGroup);
                    D1.c(composerA, measurePolicyB, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14801J c14801j = C14801J.f139030a;
                    q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.b.f15549d, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(companion, H1.h.p(16)), 62, null);
                    int i12 = LocalThemeScope.f15770g;
                    int i13 = i11 & 14;
                    C16307b.b(localThemeScope2, drawableIcon, null, null, composerStartRestartGroup, i12 | i13 | (q1.h.DrawableIcon.f140067h << 3), 6);
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(4)), composerStartRestartGroup, 6);
                    localThemeScope2 = localThemeScope;
                    ri.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), C16193g.c(Lp.c.f18642h0, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (q1.Label.f140080j << 3), 4);
                    composerStartRestartGroup.v();
                }
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.productreview.A0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M0.D(localThemeScope2, bool, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, Boolean bool, int i10, Composer composer, int i11) {
        C(localThemeScope, bool, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final Ji.LocalThemeScope r40, androidx.compose.ui.Modifier r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.M0.E(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void m(final LocalThemeScope localThemeScope, Modifier modifier, final List<String> list, final Function1<? super Integer, Unit> function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Function1<? super Integer, Unit> function12;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(865207878);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 48;
            modifier2 = modifier;
        } else if ((i10 & 48) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 32 : 16) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(list) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 2048 : 1024;
        }
        if ((i12 & 1169) == 1168 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            function12 = function1;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(865207878, i12, -1, "com.meijer.mobile.reviews.ux.productreview.HorizontalScrollableImages (ProductReviewCompose.kt:355)");
            }
            if (list.isEmpty()) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
                if (t0L != null) {
                    final Modifier modifier5 = modifier4;
                    t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.productreview.G0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return M0.n(localThemeScope, modifier5, list, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifier6 = modifier4;
            function12 = function1;
            final String strC = C16193g.c(Lp.c.f18633d, composerStartRestartGroup, 0);
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            float f10 = 16;
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(f10)), composerStartRestartGroup, 6);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(modifier6, 0.0f, 1, null);
            InterfaceC14794C interfaceC14794CC = androidx.compose.foundation.layout.D.c(H1.h.p(f10), 0.0f, 2, null);
            C5658d.f fVarO = C5658d.f48555a.o(H1.h.p(8));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = ((i12 & 7168) == 2048) | composerStartRestartGroup.D(list) | composerStartRestartGroup.D(context) | composerStartRestartGroup.V(strC);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.H0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M0.o(list, context, strC, function12, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.c(modifierH, null, interfaceC14794CC, false, fVarO, null, null, false, null, (Function1) objB, composerStartRestartGroup, 24960, 490);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier6;
        }
        androidx.compose.runtime.T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 != null) {
            final Function1<? super Integer, Unit> function13 = function12;
            t0L2.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.productreview.I0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M0.p(localThemeScope, modifier3, list, function13, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, list, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(List list, Context context, String str, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(1369854851, true, new a(list, context, str, function1)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, list, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final com.meijer.mobile.reviews.ux.productreview.ProductReviewDecorator r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.M0.q(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.reviews.ux.productreview.U0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, ProductReviewDecorator productReviewDecorator, boolean z10, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, productReviewDecorator, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void t(final LocalThemeScope localThemeScope, final Modifier modifier, final String reviewText, final int i10, final Function0<Unit> onReadMoreClick, Composer composer, final int i11) {
        int i12;
        int i13;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(reviewText, "reviewText");
        Intrinsics.j(onReadMoreClick, "onReadMoreClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-595910374);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(reviewText) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 = i10;
            i12 |= composerStartRestartGroup.d(i13) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            i13 = i10;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onReadMoreClick) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-595910374, i12, -1, "com.meijer.mobile.reviews.ux.productreview.ReviewBody (ProductReviewCompose.kt:181)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14801J c14801j = C14801J.f139030a;
            q1.Label label = new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, i13, localThemeScope.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.D0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M0.w(interfaceC5730l0, (TextLayoutResult) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            int i14 = LocalThemeScope.f15770g;
            int i15 = i12 & 14;
            ri.j.h(localThemeScope, label, reviewText, (Function1) objB2, composerStartRestartGroup, (i12 & 896) | i14 | 3072 | i15 | (q1.Label.f140080j << 3), 0);
            composerStartRestartGroup.v();
            if (u(interfaceC5730l0)) {
                Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(129989081, true, new b(modifier, localThemeScope, onReadMoreClick), composerStartRestartGroup, 54), composerStartRestartGroup, i14 | 384 | i15 | (C14898A.f139597b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.reviews.ux.productreview.E0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M0.x(localThemeScope, modifier, reviewText, i10, onReadMoreClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC5730l0 interfaceC5730l0, TextLayoutResult it) {
        Intrinsics.j(it, "it");
        if (it.i()) {
            v(interfaceC5730l0, true);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, Function0 function0, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, str, i10, function0, composer, androidx.compose.runtime.J0.a(i11 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final int r20, final int r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.M0.y(Ji.M, androidx.compose.ui.Modifier, int, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Function0 function0, Function0 function02, Function0 function03, int i12, int i13, Composer composer, int i14) {
        y(localThemeScope, modifier, i10, i11, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    private static final boolean u(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void v(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
