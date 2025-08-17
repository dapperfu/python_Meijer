package Pi;

import Ji.C;
import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.C4904ra;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import j0.C14801J;
import j0.C14815g;
import ji.InterfaceC14917U;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import zi.C18504m0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"LJi/M;", "LNi/l$v;", "state", "", "c", "(LJi/M;LNi/l$v;Landroidx/compose/runtime/Composer;I)V", "e", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.ra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4904ra {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.ra$a */
    static final class a implements Function3<InterfaceC14917U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.SearchState f27818b;

        public final void B(final InterfaceC14917U Assemble, Composer composer, int i10) {
            int i11;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(763030964, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SearchTextFieldAssemblies.<anonymous> (SearchShowcase.kt:76)");
            }
            LocalThemeScope localThemeScope = this.f27817a;
            final l.SearchState searchState = this.f27818b;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            q1.h.DrawableIcon outerIcon = Assemble.getIcons().getOuterIcon();
            C.f.d dVar = C.f.d.f15507e;
            C16307b.b(localThemeScope, outerIcon, dVar, null, composer, 384, 4);
            String value = searchState.c().getValue();
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(searchState);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.V9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.V(searchState, (String) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            int i12 = i11 & 14;
            boolean z10 = true;
            boolean z11 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
            Object objB2 = composer.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Pi.ma
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.W(Assemble, (zi.H1) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C18504m0.i(localThemeScope, value, textInput, null, function1, (Function1) objB2, composer, 0, 4);
            composer.v();
            Modifier modifierI2 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierI2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            C16307b.b(localThemeScope, Assemble.getIcons().getOuterIcon(), dVar, null, composer, 384, 4);
            String value2 = searchState.d().getValue();
            q1.f.TextInput textInput2 = Assemble.getInputFields().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(searchState);
            Object objB3 = composer.B();
            if (zV2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: Pi.na
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.G(searchState, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function12 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zV3 = (i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.V(searchState);
            Object objB4 = composer.B();
            if (zV3 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: Pi.oa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.C(Assemble, searchState, (zi.H1) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C18504m0.i(localThemeScope, value2, textInput2, null, function12, (Function1) objB4, composer, 0, 4);
            composer.v();
            Modifier modifierI3 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI3);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            String value3 = searchState.e().getValue();
            q1.f.TextInput textInput3 = Assemble.getInputFields().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(searchState);
            Object objB5 = composer.B();
            if (zV4 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new Function1() { // from class: Pi.pa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.H(searchState, (String) obj);
                    }
                };
                composer.t(objB5);
            }
            Function1 function13 = (Function1) objB5;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean z12 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
            Object objB6 = composer.B();
            if (z12 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new Function1() { // from class: Pi.qa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.I(Assemble, (zi.H1) obj);
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            C18504m0.i(localThemeScope, value3, textInput3, null, function13, (Function1) objB6, composer, 0, 4);
            composer.v();
            Modifier modifierI4 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA5 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierI4);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            String value4 = searchState.b().getValue();
            q1.f.TextInput textInput4 = Assemble.getInputFields().getDefault();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(searchState);
            Object objB7 = composer.B();
            if (zV5 || objB7 == Composer.INSTANCE.a()) {
                objB7 = new Function1() { // from class: Pi.W9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.J(searchState, (String) obj);
                    }
                };
                composer.t(objB7);
            }
            Function1 function14 = (Function1) objB7;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean z13 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
            Object objB8 = composer.B();
            if (z13 || objB8 == Composer.INSTANCE.a()) {
                objB8 = new Function1() { // from class: Pi.X9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.K(Assemble, (zi.H1) obj);
                    }
                };
                composer.t(objB8);
            }
            composer.P();
            C18504m0.i(localThemeScope, value4, textInput4, null, function14, (Function1) objB8, composer, 0, 4);
            composer.v();
            Modifier modifierI5 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA6 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR6 = composer.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierI5);
            Function0<InterfaceC5811g> function0A6 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A6);
            } else {
                composer.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyB5, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5742sR6, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            q1.f.TextInput disabled = Assemble.getInputFields().getDisabled();
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(searchState);
            Object objB9 = composer.B();
            if (zV6 || objB9 == Composer.INSTANCE.a()) {
                objB9 = new Function1() { // from class: Pi.Y9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.N(searchState, (String) obj);
                    }
                };
                composer.t(objB9);
            }
            Function1 function15 = (Function1) objB9;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean z14 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
            Object objB10 = composer.B();
            if (z14 || objB10 == Composer.INSTANCE.a()) {
                objB10 = new Function1() { // from class: Pi.Z9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.O(Assemble, (zi.H1) obj);
                    }
                };
                composer.t(objB10);
            }
            composer.P();
            C18504m0.i(localThemeScope, "Disabled search", disabled, null, function15, (Function1) objB10, composer, 48, 4);
            composer.v();
            Modifier modifierI6 = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), H1.h.p(f10));
            MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA7 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR7 = composer.r();
            Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierI6);
            Function0<InterfaceC5811g> function0A7 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A7);
            } else {
                composer.s();
            }
            Composer composerA7 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA7, measurePolicyB6, companion3.e());
            androidx.compose.runtime.D1.c(composerA7, interfaceC5742sR7, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B7 = companion3.b();
            if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                composerA7.t(Integer.valueOf(iA7));
                composerA7.n(Integer.valueOf(iA7), function2B7);
            }
            androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
            String value5 = searchState.b().getValue();
            q1.f.TextInput alternative = Assemble.getInputFields().getAlternative();
            composer.startReplaceGroup(5004770);
            boolean zV7 = composer.V(searchState);
            Object objB11 = composer.B();
            if (zV7 || objB11 == Composer.INSTANCE.a()) {
                objB11 = new Function1() { // from class: Pi.ga
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.P(searchState, (String) obj);
                    }
                };
                composer.t(objB11);
            }
            Function1 function16 = (Function1) objB11;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean z15 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
            Object objB12 = composer.B();
            if (z15 || objB12 == Composer.INSTANCE.a()) {
                objB12 = new Function1() { // from class: Pi.ja
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.Q(Assemble, (zi.H1) obj);
                    }
                };
                composer.t(objB12);
            }
            composer.P();
            C18504m0.i(localThemeScope, value5, alternative, null, function16, (Function1) objB12, composer, 0, 4);
            composer.v();
            Modifier modifierI7 = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), H1.h.p(f10));
            MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
            int iA8 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR8 = composer.r();
            Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierI7);
            Function0<InterfaceC5811g> function0A8 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A8);
            } else {
                composer.s();
            }
            Composer composerA8 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA8, measurePolicyB7, companion3.e());
            androidx.compose.runtime.D1.c(composerA8, interfaceC5742sR8, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B8 = companion3.b();
            if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                composerA8.t(Integer.valueOf(iA8));
                composerA8.n(Integer.valueOf(iA8), function2B8);
            }
            androidx.compose.runtime.D1.c(composerA8, modifierE8, companion3.f());
            String value6 = searchState.b().getValue();
            q1.f.TextInput alternative2 = Assemble.getInputFields().getAlternative();
            composer.startReplaceGroup(5004770);
            boolean zV8 = composer.V(searchState);
            Object objB13 = composer.B();
            if (zV8 || objB13 == Composer.INSTANCE.a()) {
                objB13 = new Function1() { // from class: Pi.ka
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.R(searchState, (String) obj);
                    }
                };
                composer.t(objB13);
            }
            Function1 function17 = (Function1) objB13;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            if (i12 != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                z10 = false;
            }
            boolean zV9 = z10 | composer.V(searchState);
            Object objB14 = composer.B();
            if (zV9 || objB14 == Composer.INSTANCE.a()) {
                objB14 = new Function1() { // from class: Pi.la
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.a.S(Assemble, searchState, (zi.H1) obj);
                    }
                };
                composer.t(objB14);
            }
            composer.P();
            C18504m0.i(localThemeScope, value6, alternative2, null, function17, (Function1) objB14, composer, 0, 4);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, l.SearchState searchState) {
            this.f27817a = localThemeScope;
            this.f27818b = searchState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit C(InterfaceC14917U interfaceC14917U, l.SearchState searchState, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getPlaceholder(), "Placeholder");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.a.B.f15320e, null, new Function0() { // from class: Pi.ca
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4904ra.a.E();
                }
            }, 4, null);
            if (searchState.d().getValue().length() == 0) {
                zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.b.h.C0259b.f15462e, null, new Function0() { // from class: Pi.da
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.a.F();
                    }
                }, 4, null);
            } else {
                zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.f.o.f15522e, null, new Function0() { // from class: Pi.ea
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.a.D();
                    }
                }, 4, null);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit D() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit F() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit G(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.d().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit H(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.e().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit I(InterfaceC14917U interfaceC14917U, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getPlaceholder(), "Placeholder");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.a.B.f15320e, null, null, 12, null);
            zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.b.h.C0259b.f15462e, null, null, 12, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.b().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit K(InterfaceC14917U interfaceC14917U, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getPlaceholder(), "Search products");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.a.B.f15320e, null, new Function0() { // from class: Pi.aa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4904ra.a.L();
                }
            }, 4, null);
            zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.f.o.f15522e, null, new Function0() { // from class: Pi.ba
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4904ra.a.M();
                }
            }, 4, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit L() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit M() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit N(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.e().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(InterfaceC14917U interfaceC14917U, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getDisabledIcon(), C.a.B.f15320e, null, null, 12, null);
            zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getDisabledIcon(), C.b.h.C0259b.f15462e, null, null, 12, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit P(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.b().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Q(InterfaceC14917U interfaceC14917U, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getInversePlaceholder(), "Placeholder");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInverseInnerIcon(), C.a.B.f15320e, null, null, 12, null);
            zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInverseInnerIcon(), C.f.o.f15522e, null, null, 12, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit R(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.b().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(InterfaceC14917U interfaceC14917U, l.SearchState searchState, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getInversePlaceholder(), "Placeholder");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInverseInnerIcon(), C.a.B.f15320e, null, null, 12, null);
            if (searchState.d().getValue().length() == 0) {
                zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInverseInnerIcon(), C.b.h.C0259b.f15462e, null, new Function0() { // from class: Pi.ha
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.a.T();
                    }
                }, 4, null);
            } else {
                zi.H1.w(AdsInputField, interfaceC14917U.getIcons().getInverseInnerIcon(), C.f.o.f15522e, null, new Function0() { // from class: Pi.ia
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.a.U();
                    }
                }, 4, null);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit T() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit V(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.c().setValue(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit W(InterfaceC14917U interfaceC14917U, zi.H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14917U.getLabels().getPlaceholder(), "Placeholder");
            zi.H1.N(AdsInputField, interfaceC14917U.getIcons().getInnerIcon(), C.a.B.f15320e, null, new Function0() { // from class: Pi.fa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4904ra.a.X();
                }
            }, 4, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit X() {
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14917U interfaceC14917U, Composer composer, Integer num) {
            B(interfaceC14917U, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.ra$b */
    static final class b implements Function3<InterfaceC14917U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.SearchState f27819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27820b;

        b(l.SearchState searchState, LocalThemeScope localThemeScope) {
            this.f27819a = searchState;
            this.f27820b = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(String it) {
            Intrinsics.j(it, "it");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(l.SearchState searchState, String it) {
            Intrinsics.j(it, "it");
            searchState.b().setValue(it);
            return Unit.f142422a;
        }

        public final void g(InterfaceC14917U Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(828751175, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SearchTextFieldRoundedCorners.<anonymous> (SearchShowcase.kt:269)");
            }
            final l.SearchState searchState = this.f27819a;
            LocalThemeScope localThemeScope = this.f27820b;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String value = searchState.b().getValue();
            KeyboardOptions.Companion companion4 = KeyboardOptions.INSTANCE;
            KeyboardOptions keyboardOptionsA = companion4.a();
            a.Companion companion5 = androidx.compose.ui.text.input.a.INSTANCE;
            int iG = companion5.g();
            KeyboardType.Companion companion6 = KeyboardType.INSTANCE;
            KeyboardOptions keyboardOptionsC = KeyboardOptions.c(keyboardOptionsA, 0, null, companion6.h(), iG, null, null, null, 115, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion7 = Composer.INSTANCE;
            if (objB == companion7.a()) {
                objB = new Function1() { // from class: Pi.sa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.b.p((InterfaceC5692y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C5693z c5693z = new C5693z(null, null, null, null, (Function1) objB, null, 47, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(searchState);
            Object objB2 = composer.B();
            if (zV || objB2 == companion7.a()) {
                objB2 = new Function1() { // from class: Pi.ta
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.b.q(searchState, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(searchState);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion7.a()) {
                objB3 = new Function0() { // from class: Pi.ua
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.b.r(searchState);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            Fi.i.b(localThemeScope, function1, (Function0) objB3, true, "Clear search", "Search for zip code", "Placeholder", c5693z, keyboardOptionsC, modifierH, value, composer, 807103488, 0, 0);
            composer.v();
            Modifier modifierI2 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierI2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            KeyboardOptions keyboardOptionsC2 = KeyboardOptions.c(companion4.a(), 0, null, companion6.h(), companion5.g(), null, null, null, 115, null);
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion7.a()) {
                objB4 = new Function1() { // from class: Pi.va
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.b.o((InterfaceC5692y) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C5693z c5693z2 = new C5693z(null, null, null, null, (Function1) objB4, null, 47, null);
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion7.a()) {
                objB5 = new Function1() { // from class: Pi.wa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4904ra.b.k((String) obj);
                    }
                };
                composer.t(objB5);
            }
            Function1 function12 = (Function1) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion7.a()) {
                objB6 = new Function0() { // from class: Pi.xa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4904ra.b.l();
                    }
                };
                composer.t(objB6);
            }
            composer.P();
            Fi.i.b(localThemeScope, function12, (Function0) objB6, false, "Clear search", "Search for zip code", "Placeholder", c5693z2, keyboardOptionsC2, modifierH2, null, composer, 807103920, 0, 512);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14917U interfaceC14917U, Composer composer, Integer num) {
            g(interfaceC14917U, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(l.SearchState searchState) {
            searchState.b().setValue("");
            return Unit.f142422a;
        }
    }

    public static final void c(final LocalThemeScope localThemeScope, final l.SearchState state, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1402366736);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(state) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1402366736, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SearchTextFieldAssemblies (SearchShowcase.kt:75)");
            }
            Ji.Q.e(localThemeScope, ji.J0.f139671a, ComposableLambdaKt.c(763030964, true, new a(localThemeScope, state), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.U9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4904ra.d(localThemeScope, state, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, l.SearchState searchState, int i10, Composer composer, int i11) {
        c(localThemeScope, searchState, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void e(final LocalThemeScope localThemeScope, final l.SearchState state, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1198838621);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(state) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1198838621, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SearchTextFieldRoundedCorners (SearchShowcase.kt:268)");
            }
            Ji.Q.e(localThemeScope, ji.J0.f139671a, ComposableLambdaKt.c(828751175, true, new b(state, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.T9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4904ra.f(localThemeScope, state, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, l.SearchState searchState, int i10, Composer composer, int i11) {
        e(localThemeScope, searchState, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
