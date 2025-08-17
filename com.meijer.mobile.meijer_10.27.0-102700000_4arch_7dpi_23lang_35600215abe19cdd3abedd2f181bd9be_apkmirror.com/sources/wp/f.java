package wp;

import Ji.C;
import Ji.LocalThemeScope;
import Ji.Q;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import b5.C6197c;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.rateandtip.ux.C12702a;
import com.meijer.mobile.rateandtip.ux.y;
import j0.C14802K;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.C14973z;
import ji.InterfaceC14926b0;
import ji.a1;
import ji.j1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import ni.E0;
import oi.C16088n;
import p1.C16193g;
import r0.C16692i;
import tp.EnumC17127a;
import ws.C17856b;
import ws.C17858d;
import yr.h0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\r\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "viewState", "Lkotlin/Function0;", "", "onEditTipClicked", "onEditRatingClicked", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/rateandtip/ux/y$d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "shopperRating", "d", "(LJi/M;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "tipAmount", "h", "(LJi/M;Landroidx/compose/ui/Modifier;DLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f166300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166302c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.f$a$a, reason: collision with other inner class name */
        static final class C2640a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166303a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f166304b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wp.f$a$a$a, reason: collision with other inner class name */
            static final class C2641a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f166305a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f166306b;

                C2641a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f166305a = localThemeScope;
                    this.f166306b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-940676307, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.RatingSection.<anonymous>.<anonymous>.<anonymous> (SummaryScreen.kt:191)");
                    }
                    ri.j.h(this.f166305a, this.f166306b.getLabels().getEnabledLabel(), C16193g.c(C12702a.f115099g, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            C2640a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f166303a = localThemeScope;
                this.f166304b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-376429446, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.RatingSection.<anonymous>.<anonymous> (SummaryScreen.kt:187)");
                }
                E0.b(this.f166303a, Assemble.getButtons().getEnabledButton(), this.f166304b, ComposableLambdaKt.c(-940676307, true, new C2641a(this.f166303a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(int i10, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f166300a = i10;
            this.f166301b = localThemeScope;
            this.f166302c = function0;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1701234306, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.RatingSection.<anonymous> (SummaryScreen.kt:176)");
            }
            if (this.f166300a > 0) {
                composer.startReplaceGroup(857179992);
                h0.c(this.f166301b, null, this.f166300a, 0.0f, null, null, null, null, 0, composer, LocalThemeScope.f15770g, 253);
                composer.P();
            } else {
                composer.startReplaceGroup(857277642);
                LocalThemeScope localThemeScope = this.f166301b;
                q1.Label label = new q1.Label(null, this.f166301b.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 381, null);
                String strC = C16193g.c(C12702a.f115101i, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                LocalThemeScope localThemeScope2 = this.f166301b;
                Q.e(localThemeScope2, C14973z.f140302a, ComposableLambdaKt.c(-376429446, true, new C2640a(localThemeScope2, this.f166302c), composer, 54), composer, i11 | 384 | (C14973z.f140303b << 3));
                composer.P();
            }
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
    static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f166308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166309c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166310d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166311a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f166312b;

            a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
                this.f166311a = localThemeScope;
                this.f166312b = abstractC5607a;
            }

            public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(720205198, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.SummaryScreen.<anonymous>.<anonymous>.<anonymous> (SummaryScreen.kt:147)");
                }
                Ci.j.i(this.f166311a, null, C6408b.a(this.f166312b, composer, AbstractC5607a.f45514b), null, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 21);
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

        b(LocalThemeScope localThemeScope, y.ViewState viewState, Function0<Unit> function0, Function0<Unit> function02) {
            this.f166307a = localThemeScope;
            this.f166308b = viewState;
            this.f166309c = function0;
            this.f166310d = function02;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Modifier.Companion companion;
            int i11;
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-80615229, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.SummaryScreen.<anonymous> (SummaryScreen.kt:67)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C14802K.a(J.i(companion2, this.f166307a.getAdsSpacing().getNine().getDp()), composer, 0);
            C6197c.e(new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(Integer.valueOf(this.f166308b.getShopperRating())).e(true).p(C17856b.f166435a).j(C17856b.f166435a).c(), null, Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), FullStoryAnnotationsKt.fsMask(T0.e.a(J.v(companion2, H1.h.p(72)), C16692i.c(H1.h.p(36)))), null, null, null, InterfaceC5784k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582960, 0, 8048);
            EnumC17127a flowType = this.f166308b.getFlowType();
            EnumC17127a enumC17127a = EnumC17127a.f161941e;
            if (flowType == enumC17127a) {
                composer.startReplaceGroup(-720794448);
                if (this.f166308b.getTipAmount() == 0.0d) {
                    companion = companion2;
                    i11 = 0;
                    C14802K.a(J.i(companion, this.f166307a.getAdsSpacing().getFive().getDp()), composer, 0);
                    LocalThemeScope localThemeScope = this.f166307a;
                    q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(companion), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 374, null);
                    int i12 = C12702a.f115090G;
                    String shopperName = this.f166308b.getShopperName();
                    composer.startReplaceGroup(-161783331);
                    if (shopperName == null) {
                        shopperName = C16193g.c(C17858d.f166446i, composer, 0);
                    }
                    composer.P();
                    ri.j.h(localThemeScope, label, C16193g.d(i12, new Object[]{shopperName}, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                } else {
                    companion = companion2;
                    i11 = 0;
                }
                composer.P();
            } else {
                companion = companion2;
                i11 = 0;
                composer.startReplaceGroup(-720104729);
                C14802K.a(J.i(companion, this.f166307a.getAdsSpacing().getFive().getDp()), composer, 0);
                LocalThemeScope localThemeScope2 = this.f166307a;
                q1.Label label2 = new q1.Label(FullStoryAnnotationsKt.fsMask(companion), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSix(), null, 374, null);
                int i13 = this.f166308b.getShopperRating() != 0 ? C12702a.f115085B : C12702a.f115109q;
                String shopperName2 = this.f166308b.getShopperName();
                composer.startReplaceGroup(-161757959);
                if (shopperName2 == null) {
                    shopperName2 = C16193g.c(C17858d.f166446i, composer, 0);
                }
                composer.P();
                ri.j.h(localThemeScope2, label2, C16193g.d(i13, new Object[]{shopperName2}, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                composer.P();
            }
            if (this.f166308b.getFlowType() == enumC17127a) {
                composer.startReplaceGroup(-719320336);
                if (this.f166308b.getTipAmount() == 0.0d) {
                    LocalThemeScope localThemeScope3 = this.f166307a;
                    ri.j.h(localThemeScope3, new q1.Label(D.k(companion, this.f166307a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope3.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16193g.c(C12702a.f115086C, composer, i11), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                }
                composer.P();
            } else {
                composer.startReplaceGroup(-718892939);
                C14802K.a(J.i(companion, this.f166307a.getAdsSpacing().getFour().getDp()), composer, i11);
                f.d(this.f166307a, null, this.f166308b.getShopperRating(), this.f166309c, composer, LocalThemeScope.f15770g, 1);
                composer.P();
            }
            C14802K.a(J.i(companion, this.f166307a.getAdsSpacing().getNine().getDp()), composer, i11);
            LocalThemeScope localThemeScope4 = this.f166307a;
            double tipAmount = this.f166308b.getTipAmount();
            Function0<Unit> function0 = this.f166310d;
            int i14 = LocalThemeScope.f15770g;
            f.h(localThemeScope4, null, tipAmount, function0, composer, i14, 1);
            AbstractC5607a customTipError = this.f166308b.getCustomTipError();
            composer.startReplaceGroup(-161722698);
            if (customTipError != null) {
                LocalThemeScope localThemeScope5 = this.f166307a;
                Q.e(localThemeScope5, a1.f139760a, ComposableLambdaKt.c(720205198, true, new a(localThemeScope5, customTipError), composer, 54), composer, i14 | 384 | (a1.f139761b << 3));
                C14802K.a(J.i(companion, localThemeScope5.getAdsSpacing().getFive().getDp()), composer, i11);
                Unit unit = Unit.f142422a;
            }
            composer.P();
            C17845b.b(this.f166307a, null, this.f166308b.getTotalPrice(), this.f166308b.getCardDetails(), composer, i14 | ((C.g.f15525d | AbstractC5607a.f45514b) << 9), 1);
            C14802K.a(J.i(companion, H1.h.p(16)), composer, 6);
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
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166313a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f166314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166315c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f166317b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wp.f$c$a$a, reason: collision with other inner class name */
            static final class C2642a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f166318a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f166319b;

                C2642a(LocalThemeScope localThemeScope, j1 j1Var) {
                    this.f166318a = localThemeScope;
                    this.f166319b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1451426147, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipSection.<anonymous>.<anonymous>.<anonymous> (SummaryScreen.kt:239)");
                    }
                    ri.j.h(this.f166318a, this.f166319b.getLabels().getEnabledLabel(), C16193g.c(C12702a.f115100h, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f166316a = localThemeScope;
                this.f166317b = function0;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1002088528, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipSection.<anonymous>.<anonymous> (SummaryScreen.kt:238)");
                }
                E0.b(this.f166316a, Assemble.getButtons().getEnabledButton(), this.f166317b, ComposableLambdaKt.c(1451426147, true, new C2642a(this.f166316a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, double d10, Function0<Unit> function0) {
            this.f166313a = localThemeScope;
            this.f166314b = d10;
            this.f166315c = function0;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1102306708, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipSection.<anonymous> (SummaryScreen.kt:214)");
            }
            LocalThemeScope localThemeScope = this.f166313a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f166313a.getAdsTypography().getValues().getOne(), null, 383, null);
            String strD = C16193g.d(C12702a.f115115w, new Object[]{Double.valueOf(this.f166314b)}, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strD, null, composer, i11 | (i12 << 3), 4);
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(J.i(companion, this.f166313a.getAdsSpacing().getThree().getDp()), composer, 0);
            if (this.f166314b > 0.0d) {
                composer.startReplaceGroup(-500529054);
                LocalThemeScope localThemeScope2 = this.f166313a;
                ri.j.h(localThemeScope2, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 375, null), C16193g.c(C12702a.f115089F, composer, 0), null, composer, i11 | (i12 << 3), 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-500256812);
                LocalThemeScope localThemeScope3 = this.f166313a;
                ri.j.h(localThemeScope3, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 375, null), C16193g.c(C12702a.f115088E, composer, 0), null, composer, i11 | (i12 << 3), 4);
                composer.P();
            }
            C14802K.a(J.i(companion, this.f166313a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope4 = this.f166313a;
            Q.e(localThemeScope4, C14973z.f140302a, ComposableLambdaKt.c(-1002088528, true, new a(localThemeScope4, this.f166315c), composer, 54), composer, i11 | 384 | (C14973z.f140303b << 3));
            C14802K.a(J.i(companion, this.f166313a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws Resources.NotFoundException {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final LocalThemeScope localThemeScope, Modifier modifier, final int i10, final Function0<Unit> function0, Composer composer, final int i11, final int i12) {
        int i13;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-251932104);
        if ((i12 & Integer.MIN_VALUE) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= composerStartRestartGroup.D(function0) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i13 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i14 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-251932104, i13, -1, "com.meijer.mobile.rateandtip.ux.compose.RatingSection (SummaryScreen.kt:169)");
            }
            C16088n.e(localThemeScope, new q1.Column(modifier3, null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(1701234306, true, new a(i10, localThemeScope, function0), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i13 & 14) | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wp.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.e(localThemeScope, modifier2, i10, function0, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, int i10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, modifier, i10, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final com.meijer.mobile.rateandtip.ux.y.ViewState r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.f.f(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.rateandtip.ux.y$d, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, y.ViewState viewState, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, viewState, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final LocalThemeScope localThemeScope, Modifier modifier, final double d10, final Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850859702);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.g(d10) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(function0) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-850859702, i12, -1, "com.meijer.mobile.rateandtip.ux.compose.TipSection (SummaryScreen.kt:206)");
            }
            C16088n.e(localThemeScope, new q1.Column(modifier3, null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(1102306708, true, new c(localThemeScope, d10, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wp.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.i(localThemeScope, modifier2, d10, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, double d10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, d10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
