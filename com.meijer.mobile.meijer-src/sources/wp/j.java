package wp;

import F1.j;
import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.rateandtip.ux.C12828a;
import com.meijer.mobile.rateandtip.ux.y;
import j0.C14890K;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.List;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
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
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import m5.C15669h;
import p1.C16338g;
import pi.C16453n;
import r0.C16806i;
import r1.C16819m;
import r1.u;
import wp.j;
import ws.C17918b;
import ws.C17920d;
import ws.s;
import xs.EnumC18220b;
import xs.TipSuggestionButtonDecorator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "viewState", "Lkotlin/Function1;", "Lxs/b;", "", "onTipOptionSelected", "", "onCustomTipUpdated", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/rateandtip/ux/y$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f167399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<EnumC18220b, Unit> f167400c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f167401d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.j$a$a, reason: collision with other inner class name */
        static final class C2668a implements Function1<EnumC18220b, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<EnumC18220b, Unit> f167402a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TipSuggestionButtonDecorator f167403b;

            /* JADX WARN: Multi-variable type inference failed */
            C2668a(Function1<? super EnumC18220b, Unit> function1, TipSuggestionButtonDecorator tipSuggestionButtonDecorator) {
                this.f167402a = function1;
                this.f167403b = tipSuggestionButtonDecorator;
            }

            public final void a(EnumC18220b it) {
                Intrinsics.j(it, "it");
                this.f167402a.invoke(this.f167403b.getTipOption());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EnumC18220b enumC18220b) {
                a(enumC18220b);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167404a;

            b(LocalThemeScope localThemeScope) {
                this.f167404a = localThemeScope;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(378182899, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous>.<anonymous> (TipScreen.kt:135)");
                }
                String strC = C16338g.c(C12828a.f116053p, composer, 0);
                q1.m.Inline error = Assemble.getToastVariant().getError();
                Di.j.i(this.f167404a, D.k(Modifier.INSTANCE, this.f167404a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), strC, null, error, null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 20);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
                a(interfaceC15160b0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167405a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y.ViewState f167406b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Double, Unit> f167407c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wp.j$a$c$a, reason: collision with other inner class name */
            static final class C2669a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f167408a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y.ViewState f167409b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<Double, Unit> f167410c;

                /* JADX WARN: Multi-variable type inference failed */
                C2669a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super Double, Unit> function1) {
                    this.f167408a = localThemeScope;
                    this.f167409b = viewState;
                    this.f167410c = function1;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1735436543, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous>.<anonymous> (TipScreen.kt:162)");
                    }
                    s.g(this.f167408a, null, this.f167409b.getTipAmount(), this.f167409b.getShouldShowErrorOnTipScreen(), this.f167410c, composer, LocalThemeScope.f17314g, 1);
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

            /* JADX WARN: Multi-variable type inference failed */
            c(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super Double, Unit> function1) {
                this.f167405a = localThemeScope;
                this.f167406b = viewState;
                this.f167407c = function1;
            }

            public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(-609243255, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.TipScreen.<anonymous>.<anonymous> (TipScreen.kt:151)");
                }
                C16453n.e(this.f167405a, new q1.Column(D.m(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f167405a.getAdsSpacing().getFive().getDp(), this.f167405a.getAdsSpacing().getFive().getDp(), this.f167405a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, null, 6, null), ComposableLambdaKt.c(1735436543, true, new C2669a(this.f167405a, this.f167406b, this.f167407c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
                a(interfaceC6305e, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final d f167411f = new d();

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
            final /* synthetic */ Function1 f167412f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f167413g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Function1 function1, List list) {
                super(1);
                this.f167412f = function1;
                this.f167413g = list;
            }

            public final Object a(int i10) {
                return this.f167412f.invoke(this.f167413g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f167414f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167415g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f167416h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List list, LocalThemeScope localThemeScope, Function1 function1) {
                super(4);
                this.f167414f = list;
                this.f167415g = localThemeScope;
                this.f167416h = function1;
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
                TipSuggestionButtonDecorator tipSuggestionButtonDecorator = (TipSuggestionButtonDecorator) this.f167414f.get(i10);
                composer.startReplaceGroup(-1011896319);
                LocalThemeScope localThemeScope = this.f167415g;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f167416h) | composer.D(tipSuggestionButtonDecorator);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C2668a(this.f167416h, tipSuggestionButtonDecorator);
                    composer.t(objB);
                }
                composer.P();
                s.k(localThemeScope, null, tipSuggestionButtonDecorator, (Function1) objB, composer, LocalThemeScope.f17314g | (TipSuggestionButtonDecorator.f171020e << 6), 1);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super EnumC18220b, Unit> function1, Function1<? super Double, Unit> function12) {
            this.f167398a = localThemeScope;
            this.f167399b = viewState;
            this.f167400c = function1;
            this.f167401d = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(y.ViewState viewState, LocalThemeScope localThemeScope, Function1 function1, w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List<TipSuggestionButtonDecorator> listU = viewState.u();
            LazyRow.i(listU.size(), null, new e(d.f167411f, listU), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listU, localThemeScope, function1)));
            return Unit.f143329a;
        }

        public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) throws Resources.NotFoundException {
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
            C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getNine().getDp()), composer, 0);
            int i15 = i11;
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f167399b.getShopperImageUrl()).e(true).p(C17918b.f167503a).j(C17918b.f167503a).c(), C16338g.c(C17920d.f167518m, composer, 0), a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), FullStoryAnnotationsKt.fsMask(T0.e.a(J.v(companion, H1.h.p(72)), C16806i.c(H1.h.p(36)))), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582912, 0, 8048);
            C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope = this.f167398a;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion2 = F1.j.INSTANCE;
            int iA = companion2.a();
            Modifier modifierK = D.k(companion, this.f167398a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
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
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(C16819m.d(modifierK, false, (Function1) objB, 1, null)), null, null, F1.j.h(iA), 0, false, 0, six, null, 374, null);
            int i16 = C12828a.f116062y;
            String shopperName = this.f167399b.getShopperName();
            composer.startReplaceGroup(-801577455);
            if (shopperName == null) {
                i12 = 0;
                shopperName = C16338g.c(C17920d.f167514i, composer, 0);
            } else {
                i12 = 0;
            }
            composer.P();
            String strD = C16338g.d(i16, new Object[]{shopperName}, composer, i12);
            int i17 = LocalThemeScope.f17314g;
            int i18 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strD, null, composer, (i18 << 3) | i17, 4);
            LocalThemeScope localThemeScope2 = this.f167398a;
            si.j.h(localThemeScope2, new q1.Label(D.k(companion, this.f167398a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, F1.j.h(companion2.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 374, null), C16338g.c(C12828a.f116031C, composer, 0), null, composer, i17 | (i18 << 3), 4);
            C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getEight().getDp()), composer, 0);
            InterfaceC14882C interfaceC14882CC = D.c(this.f167398a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            C5800d.f fVarO = C5800d.f48779a.o(this.f167398a.getAdsSpacing().getFive().getDp());
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f167399b) | composer.D(this.f167398a) | composer.V(this.f167400c);
            final y.ViewState viewState = this.f167399b;
            final LocalThemeScope localThemeScope3 = this.f167398a;
            final Function1<EnumC18220b, Unit> function1 = this.f167400c;
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
            C15432b.c(null, null, interfaceC14882CC, false, fVarO, null, null, false, null, (Function1) objB2, composer, 0, 491);
            composer.startReplaceGroup(-801545702);
            if (this.f167399b.getShouldShowErrorOnTipScreen() && (this.f167399b.getSelectedTipOption() == EnumC18220b.f171003o || this.f167399b.getSelectedTipOption() == EnumC18220b.f170993e)) {
                C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getThree().getDp()), composer, 0);
                i14 = 2;
                Modifier modifierK2 = D.k(companion, this.f167398a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope4 = this.f167398a;
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion4.a();
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
                D1.c(composerA, measurePolicyG, companion4.e());
                D1.c(composerA, interfaceC5884sR, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA2))) {
                    composerA.t(Integer.valueOf(iA2));
                    composerA.n(Integer.valueOf(iA2), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C5806j c5806j = C5806j.f48836a;
                z11 = true;
                i13 = i17;
                Q.e(localThemeScope4, a1.f142015a, ComposableLambdaKt.c(378182899, true, new b(localThemeScope4), composer, 54), composer, i13 | 384 | (a1.f142016b << 3));
                composer.v();
                Modifier modifierI = J.i(companion, this.f167398a.getAdsSpacing().getThree().getDp());
                z10 = false;
                C14890K.a(modifierI, composer, 0);
            } else {
                i13 = i17;
                z10 = false;
                i14 = 2;
                z11 = true;
            }
            composer.P();
            C6304d.e(AdsColumn, this.f167399b.getSelectedTipOption() == EnumC18220b.f171000l ? z11 : z10, null, androidx.compose.animation.f.k(null, null, false, null, 15, null), androidx.compose.animation.f.u(null, null, false, null, 15, null), null, ComposableLambdaKt.c(-609243255, z11, new c(this.f167398a, this.f167399b, this.f167401d), composer, 54), composer, (i15 & 14) | 1600512, 18);
            C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getFive().getDp()), composer, 0);
            C14890K.a(J.i(companion, this.f167398a.getAdsSpacing().getFive().getDp()), composer, 0);
            C17907b.b(this.f167398a, D.k(companion, this.f167398a.getAdsSpacing().getFive().getDp(), 0.0f, i14, null), this.f167399b.getTotalPrice(), this.f167399b.getCardDetails(), composer, ((C.g.f17069d | AbstractC6392a.f60445b) << 9) | i13, 0);
            C14890K.a(J.i(companion, H1.h.p(16)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws Resources.NotFoundException {
            c(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final com.meijer.mobile.rateandtip.ux.y.ViewState r20, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r21, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.j.b(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.rateandtip.ux.y$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, y.ViewState viewState, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, viewState, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
