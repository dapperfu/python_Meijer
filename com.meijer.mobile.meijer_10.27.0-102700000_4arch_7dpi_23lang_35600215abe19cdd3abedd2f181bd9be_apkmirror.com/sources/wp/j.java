package wp;

import F1.j;
import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import Ji.Q;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.rateandtip.ux.C12702a;
import com.meijer.mobile.rateandtip.ux.y;
import j0.C14802K;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.List;
import ji.InterfaceC14926b0;
import ji.a1;
import ji.q1;
import kotlin.C6165d;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import l5.C15372h;
import oi.C16088n;
import p1.C16193g;
import r0.C16692i;
import r1.C16705m;
import r1.u;
import wp.j;
import ws.C17856b;
import ws.C17858d;
import ws.s;
import xs.EnumC18092b;
import xs.TipSuggestionButtonDecorator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "viewState", "Lkotlin/Function1;", "Lxs/b;", "", "onTipOptionSelected", "", "onCustomTipUpdated", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/rateandtip/ux/y$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f166331b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18092b, Unit> f166332c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f166333d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.j$a$a, reason: collision with other inner class name */
        static final class C2643a implements Function1<EnumC18092b, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC18092b, Unit> f166334a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TipSuggestionButtonDecorator f166335b;

            /* JADX WARN: Multi-variable type inference failed */
            C2643a(Function1<? super EnumC18092b, Unit> function1, TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
                this.f166334a = function1;
                this.f166335b = tipSuggestionButtonDecorator;
            }

            public final void a(EnumC18092b it) {
                Intrinsics.j(it, "it");
                this.f166334a.invoke(this.f166335b.getTipOption());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EnumC18092b enumC18092b) {
                a(enumC18092b);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166336a;

            b(LocalThemeScope localThemeScope) {
                this.f166336a = localThemeScope;
            }

            public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(378182899, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous>.<anonymous> (TipScreen.kt:135)");
                }
                String strC = C16193g.c(C12702a.f115108p, composer, 0);
                q1.m.Inline error = Assemble.getToastVariant().getError();
                Ci.j.i(this.f166336a, D.k(Modifier.INSTANCE, this.f166336a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), strC, null, error, null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 20);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
                a(interfaceC14926b0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166337a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.ViewState f166338b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Double, Unit> f166339c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wp.j$a$c$a, reason: collision with other inner class name */
            static final class C2644a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f166340a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.ViewState f166341b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<Double, Unit> f166342c;

                /* JADX WARN: Multi-variable type inference failed */
                C2644a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super Double, Unit> function1) {
                    this.f166340a = localThemeScope;
                    this.f166341b = viewState;
                    this.f166342c = function1;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1735436543, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous>.<anonymous> (TipScreen.kt:162)");
                    }
                    s.g(this.f166340a, null, this.f166341b.getTipAmount(), this.f166341b.getShouldShowErrorOnTipScreen(), this.f166342c, composer, LocalThemeScope.f15770g, 1);
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

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super Double, Unit> function1) {
                this.f166337a = localThemeScope;
                this.f166338b = viewState;
                this.f166339c = function1;
            }

            public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-609243255, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous> (TipScreen.kt:151)");
                }
                C16088n.e(this.f166337a, new q1.Column(D.m(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f166337a.getAdsSpacing().getFive().getDp(), this.f166337a.getAdsSpacing().getFive().getDp(), this.f166337a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, null, 6, null), ComposableLambdaKt.c(1735436543, true, new C2644a(this.f166337a, this.f166338b, this.f166339c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final d f166343f = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class e extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f166344f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f166345g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Function1 function1, List list) {
                super(1);
                this.f166344f = function1;
                this.f166345g = list;
            }

            public final Object a(int i10) {
                return this.f166344f.invoke(this.f166345g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f166346f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166347g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f166348h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List list, LocalThemeScope localThemeScope, Function1 function1) {
                super(4);
                this.f166346f = list;
                this.f166347g = localThemeScope;
                this.f166348h = function1;
            }

            public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
                TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) this.f166346f.get(i10);
                composer.startReplaceGroup(-1011896319);
                LocalThemeScope localThemeScope = this.f166347g;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f166348h) | composer.D(tipSuggestionButtonDecorator);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C2643a(this.f166348h, tipSuggestionButtonDecorator);
                    composer.t(objB);
                }
                composer.P();
                s.k(localThemeScope, null, tipSuggestionButtonDecorator, (Function1) objB, composer, LocalThemeScope.f15770g | (TipSuggestionButtonDecorator.f169928e << 6), 1);
                composer.P();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super EnumC18092b, Unit> function1, Function1<? super Double, Unit> function12) {
            this.f166330a = localThemeScope;
            this.f166331b = viewState;
            this.f166332c = function1;
            this.f166333d = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(y.ViewState viewState, LocalThemeScope localThemeScope, Function1 function1, w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List<TipSuggestionButtonDecorator> listU = viewState.u();
            LazyRow.i(listU.size(), null, new e(d.f166343f, listU), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listU, localThemeScope, function1)));
            return Unit.f142422a;
        }

        public final void c(InterfaceC14814f AdsColumn, Composer composer, int i10) throws Resources.NotFoundException {
            int i11;
            int i12;
            int i13;
            boolean z10;
            int i14;
            boolean z11;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsColumn) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-894687903, i11, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous> (TipScreen.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getNine().getDp()), composer, 0);
            int i15 = i11;
            C6197c.e(new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f166331b.getShopperImageUrl()).e(true).p(C17856b.f166435a).j(C17856b.f166435a).c(), C16193g.c(C17858d.f166450m, composer, 0), Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), FullStoryAnnotationsKt.fsMask(T0.e.a(J.v(companion, H1.h.p(72)), C16692i.c(H1.h.p(36)))), null, null, null, InterfaceC5784k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582912, 0, 8048);
            C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope = this.f166330a;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion2 = F1.j.INSTANCE;
            int iA = companion2.a();
            Modifier modifierK = D.k(companion, this.f166330a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: wp.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.a.d((u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(C16705m.d(modifierK, false, (Function1) objB, 1, null)), null, null, F1.j.h(iA), 0, false, 0, six, null, 374, null);
            int i16 = C12702a.f115117y;
            String shopperName = this.f166331b.getShopperName();
            composer.startReplaceGroup(-801577455);
            if (shopperName == null) {
                i12 = 0;
                shopperName = C16193g.c(C17858d.f166446i, composer, 0);
            } else {
                i12 = 0;
            }
            composer.P();
            String strD = C16193g.d(i16, new Object[]{shopperName}, composer, i12);
            int i17 = LocalThemeScope.f15770g;
            int i18 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strD, null, composer, (i18 << 3) | i17, 4);
            LocalThemeScope localThemeScope2 = this.f166330a;
            ri.j.h(localThemeScope2, new q1.Label(D.k(companion, this.f166330a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, F1.j.h(companion2.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16193g.c(C12702a.f115086C, composer, 0), null, composer, i17 | (i18 << 3), 4);
            C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getEight().getDp()), composer, 0);
            InterfaceC14794C interfaceC14794CC = D.c(this.f166330a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            C5658d.f fVarO = C5658d.f48555a.o(this.f166330a.getAdsSpacing().getFive().getDp());
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f166331b) | composer.D(this.f166330a) | composer.V(this.f166332c);
            final y.ViewState viewState = this.f166331b;
            final LocalThemeScope localThemeScope3 = this.f166330a;
            final Function1<EnumC18092b, Unit> function1 = this.f166332c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion3.a()) {
                objB2 = new Function1() { // from class: wp.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.a.e(viewState, localThemeScope3, function1, (w) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C15342b.c(null, null, interfaceC14794CC, false, fVarO, null, null, false, null, (Function1) objB2, composer, 0, 491);
            composer.startReplaceGroup(-801545702);
            if (this.f166331b.getShouldShowErrorOnTipScreen() && (this.f166331b.getSelectedTipOption() == EnumC18092b.f169911o || this.f166331b.getSelectedTipOption() == EnumC18092b.f169901e)) {
                C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getThree().getDp()), composer, 0);
                i14 = 2;
                Modifier modifierK2 = D.k(companion, this.f166330a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope4 = this.f166330a;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
                InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion4.a();
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
                D1.c(composerA, measurePolicyG, companion4.e());
                D1.c(composerA, interfaceC5742sR, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA2))) {
                    composerA.t(Integer.valueOf(iA2));
                    composerA.n(Integer.valueOf(iA2), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C5664j c5664j = C5664j.f48612a;
                z11 = true;
                i13 = i17;
                Q.e(localThemeScope4, a1.f139760a, ComposableLambdaKt.c(378182899, true, new b(localThemeScope4), composer, 54), composer, i13 | 384 | (a1.f139761b << 3));
                composer.v();
                Modifier modifierI = J.i(companion, this.f166330a.getAdsSpacing().getThree().getDp());
                z10 = false;
                C14802K.a(modifierI, composer, 0);
            } else {
                i13 = i17;
                z10 = false;
                i14 = 2;
                z11 = true;
            }
            composer.P();
            C6165d.e(AdsColumn, this.f166331b.getSelectedTipOption() == EnumC18092b.f169908l ? z11 : z10, null, androidx.compose.animation.f.k(null, null, false, null, 15, null), androidx.compose.animation.f.u(null, null, false, null, 15, null), null, ComposableLambdaKt.c(-609243255, z11, new c(this.f166330a, this.f166331b, this.f166333d), composer, 54), composer, (i15 & 14) | 1600512, 18);
            C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getFive().getDp()), composer, 0);
            C14802K.a(J.i(companion, this.f166330a.getAdsSpacing().getFive().getDp()), composer, 0);
            C17845b.b(this.f166330a, D.k(companion, this.f166330a.getAdsSpacing().getFive().getDp(), 0.0f, i14, null), this.f166331b.getTotalPrice(), this.f166331b.getCardDetails(), composer, ((C.g.f15525d | AbstractC5607a.f45514b) << 9) | i13, 0);
            C14802K.a(J.i(companion, H1.h.p(16)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws Resources.NotFoundException {
            c(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final com.meijer.mobile.rateandtip.ux.y.ViewState r20, final kotlin.jvm.functions.Function1<? super xs.EnumC18092b, kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.j.b(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.rateandtip.ux.y$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, y.ViewState viewState, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, viewState, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
