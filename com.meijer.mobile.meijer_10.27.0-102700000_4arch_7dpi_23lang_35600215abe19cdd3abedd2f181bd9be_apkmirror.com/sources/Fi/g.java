package Fi;

import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5673e;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.E;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.TextStyle;
import d0.C13439f;
import d0.C13442i;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.P;
import ni.P0;
import pi.C16307b;
import r0.C16692i;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LFi/a;", "Landroidx/compose/ui/Modifier;", "modifier", "", "i", "(LFi/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "f", "", "isInputTextFieldFocused", "", "currentPlaceHolderText", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fi.a f10849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f10850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f10851c;

        a(Fi.a aVar, LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0) {
            this.f10849a = aVar;
            this.f10850b = localThemeScope;
            this.f10851c = interfaceC5730l0;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
            int i11;
            Intrinsics.j(innerTextField, "innerTextField");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.D(innerTextField) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(538493200, i11, -1, "com.meijer.mobile.android_acres_library.composables.search.SearchEnabled.<anonymous>.<anonymous>.<anonymous> (SearchComposer.kt:164)");
            }
            P0.e eVarH = P0.e.INSTANCE.h();
            Fi.a aVar = this.f10849a;
            LocalThemeScope localThemeScope = this.f10850b;
            InterfaceC5730l0<String> interfaceC5730l0 = this.f10851c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(eVarH, false);
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
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            composer.startReplaceGroup(-2065240008);
            if (aVar.getSearchQuery().length() == 0) {
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorPlaceholder()), null, 383, null), g.o(interfaceC5730l0), null, composer, 0, 4);
            }
            composer.P();
            composer.v();
            innerTextField.invoke(composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void f(final Fi.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(2091733218);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2091733218, i12, -1, "com.meijer.mobile.android_acres_library.composables.search.SearchDisabled (SearchComposer.kt:199)");
            }
            LocalThemeScope localThemeScope = aVar.getLocalThemeScope();
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierThen = C13439f.e(androidx.compose.foundation.b.d(T0.e.a(companion2, C16692i.c(localThemeScope.getAdsCornerRadii().getRadius04().getDp())), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C13442i.a(H1.h.p(1), localThemeScope.getAdsColors().getAdsColorsDisabled().getColor()), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius04().getDp())).then(modifier);
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierI = D.i(companion2, localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyG = C5662h.g(companion.o(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyG, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.a.B.f15320e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorsDisabled(), null, 94, null), null, null, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.v();
            C14802K.a(J.z(companion2, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion.h(), false);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, companion2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyG2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            I iD = localThemeScope.getAdsTypography().getBodyCompact().getOne().d(localThemeScope.getAdsColors().getAdsColorPlaceholder());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 14) == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(aVar));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Fi.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.g(aVar, (u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            ri.j.h(localThemeScope, new q1.Label(C16705m.d(companion2, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, iD, null, 382, null), aVar.getPlaceholderText(), null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.v();
            C14802K.a(J.z(companion2, localThemeScope.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            Unit unit = Unit.f142422a;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Fi.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.h(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Fi.a aVar, u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        s.g0(semantics, "Edit box. " + aVar.getLabelFor());
        s.l(semantics);
        s.x0(semantics, "Disabled");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Fi.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        f(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void i(final Fi.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332586585);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1332586585, i12, -1, "com.meijer.mobile.android_acres_library.composables.search.SearchEnabled (SearchComposer.kt:107)");
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(aVar.getPlaceholderText(), null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            LocalThemeScope localThemeScope = aVar.getLocalThemeScope();
            e.Companion companion2 = P0.e.INSTANCE;
            e.c cVarI = companion2.i();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierThen = C13439f.e(androidx.compose.foundation.b.d(T0.e.a(companion3, C16692i.c(localThemeScope.getAdsCornerRadii().getRadius04().getDp())), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C13442i.a(j(interfaceC5730l0) ? H1.h.p(2) : H1.h.p(1), j(interfaceC5730l0) ? localThemeScope.getAdsColors().getAdsColorFocus().getColor() : localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor()), C16692i.c(localThemeScope.getAdsCornerRadii().getRadius04().getDp())).then(modifier);
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyB, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierI = D.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp());
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyG, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C5664j c5664j = C5664j.f48612a;
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.a.B.f15320e, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorIcon02(), null, 94, null), null, null, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.v();
            C14802K.a(J.z(companion3, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
            TextStyle textStyleC = TextStyle.c(localThemeScope.getAdsTypography().getBody().getOne().getStyle(), aVar.getSearchQuery().length() == 0 ? localThemeScope.getAdsColors().getAdsColorPlaceholder().getColor() : localThemeScope.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            String strI0 = aVar.getSearchQuery();
            Function1<String, Unit> function1O0 = aVar.o0();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i13 = i12 & 14;
            boolean z10 = i13 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(aVar));
            Object objB3 = composerStartRestartGroup.B();
            if (z10 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Fi.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.l(aVar, (u) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            Modifier modifierD = C16705m.d(companion3, false, (Function1) objB3, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z11 = i13 == 4 || ((i12 & 8) != 0 && composerStartRestartGroup.D(aVar));
            Object objB4 = composerStartRestartGroup.B();
            if (z11 || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: Fi.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.k(aVar, interfaceC5730l0, interfaceC5730l02, (E) obj);
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.P();
            C5673e.a(strI0, function1O0, InterfaceC14800I.b(c14801j, C5761d.a(modifierD, (Function1) objB4), 1.0f, false, 2, null), false, false, textStyleC, null, null, true, 1, 0, null, null, null, null, ComposableLambdaKt.c(538493200, true, new a(aVar, localThemeScope, interfaceC5730l02), composerStartRestartGroup, 54), composerStartRestartGroup, 905969664, 196608, 31960);
            composerStartRestartGroup = composerStartRestartGroup;
            if (aVar.getSearchQuery().length() == 0) {
                composerStartRestartGroup.startReplaceGroup(1627876314);
                C14802K.a(J.z(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1627966555);
                C14802K.a(J.z(companion3, localThemeScope.getAdsSpacing().getTwo().getDp()), composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            }
            composerStartRestartGroup.startReplaceGroup(1022349766);
            if (aVar.getSearchQuery().length() > 0) {
                P0.i(localThemeScope, P.f151555a, aVar.Y(), C.f.o.f15522e, String.valueOf(aVar.getClearDescription()), null, false, false, 0L, composerStartRestartGroup, 3120, 240);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            Unit unit = Unit.f142422a;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Fi.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.m(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Fi.a aVar, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, E it) {
        Intrinsics.j(it, "it");
        n(interfaceC5730l0, it.a());
        p(interfaceC5730l02, it.a() ? "" : aVar.getPlaceholderText());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Fi.a aVar, u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        s.g0(semantics, aVar.getLabelFor());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Fi.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        i(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final boolean j(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void n(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void p(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }
}
