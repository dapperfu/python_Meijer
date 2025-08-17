package Lh;

import Fh.a;
import Ji.LocalThemeScope;
import Lh.t0;
import P0.e;
import V0.AbstractC5324i0;
import V0.C5346q0;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
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
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", BarcodePickDeserializer.FIELD_ICON, "Lak/a;", "header", "body", "f", "(LJi/M;Landroidx/compose/ui/Modifier;ILak/a;Lak/a;Landroidx/compose/runtime/Composer;II)V", "m", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class t0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18353a;

        a(LocalThemeScope localThemeScope) {
            this.f18353a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(834666986, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CardSection.<anonymous> (EducationScreen.kt:147)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f18353a.getAdsSpacing().getFive().getDp()), this.f18353a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            C5658d.f fVarO = C5658d.f48555a.o(this.f18353a.getAdsSpacing().getEight().getDp());
            LocalThemeScope localThemeScope = this.f18353a;
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            int i11 = Fh.e.f10453i;
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            AbstractC5607a abstractC5607aD = companion2.d(Fh.h.f10607T0, new Object[0]);
            AbstractC5607a abstractC5607aD2 = companion2.d(Fh.h.f10614U0, new Object[0]);
            int i12 = LocalThemeScope.f15770g;
            int i13 = AbstractC5607a.f45514b;
            t0.f(localThemeScope, null, i11, abstractC5607aD, abstractC5607aD2, composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Fh.e.f10452h, companion2.d(Fh.h.f10579P0, new Object[0]), companion2.d(Fh.h.f10586Q0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Fh.e.f10454j, companion2.d(Fh.h.f10621V0, new Object[0]), companion2.d(Fh.h.f10628W0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Fh.e.f10455k, companion2.d(Fh.h.f10635X0, new Object[0]), companion2.d(Fh.h.f10642Y0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18354a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18355a;

            a(LocalThemeScope localThemeScope) {
                this.f18355a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1654029662, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.EducationScreen.<anonymous>.<anonymous> (EducationScreen.kt:76)");
                }
                Dr.g.g(this.f18355a, C16193g.c(Fh.h.f10606T, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f18354a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-208684898, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.EducationScreen.<anonymous> (EducationScreen.kt:74)");
            }
            LocalThemeScope localThemeScope = this.f18354a;
            Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(1654029662, true, new a(localThemeScope), composer, 54), null, null, 0.0f, false, AbstractC5607a.INSTANCE.a(), composer, 100687872 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 27), 119);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f18357b;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f18356a = localThemeScope;
            this.f18357b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.e.f10416a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-998456617, i11, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.EducationScreen.<anonymous> (EducationScreen.kt:83)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.D.h(companion, paddingValues);
            LocalThemeScope localThemeScope = this.f18356a;
            final Function1<Fh.a, Unit> function1 = this.f18357b;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C13457y.a(C16190d.c(Fh.e.f10451g, composer, 0), null, androidx.compose.foundation.b.b(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), AbstractC5324i0.Companion.f(AbstractC5324i0.INSTANCE, CollectionsKt.p(C5346q0.m(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor()), C5346q0.m(localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor())), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(d0.T.g(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.b(), companion2.k(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierJ);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            int i12 = LocalThemeScope.f15770g;
            t0.m(localThemeScope, null, composer, i12, 1);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getNine().getDp()), composer, 0);
            t0.h(localThemeScope, null, composer, i12, 1);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEleven().getDp()), composer, 0);
            composer.v();
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(c5664j.g(companion, companion2.b()), 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierD);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C17917Z.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyG2, companion3.e());
            D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            Modifier modifierF = C18299z.f(companion, "education_got_it_button", null, 2, null);
            C15860s0 c15860s0 = C15860s0.f151792a;
            String strC = C16193g.c(Fh.h.f10593R0, composer, 0);
            String strC2 = C16193g.c(Fh.h.f10593R0, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Lh.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t0.c.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope, c15860s0, strC, (Function0) objB, modifierF, strC2, true, 0L, false, composer, 1572864 | i12 | (C15860s0.f151793b << 3), 192);
            composer.v();
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r38, androidx.compose.ui.Modifier r39, final int r40, final ak.AbstractC5607a r41, final ak.AbstractC5607a r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.t0.f(Ji.M, androidx.compose.ui.Modifier, int, ak.a, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i11, int i12, Composer composer, int i13) {
        f(localThemeScope, modifier, i10, abstractC5607a, abstractC5607a2, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = -903472761(0xffffffffca261987, float:-2721377.8)
            r4 = r18
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            if (r4 == 0) goto L17
            r4 = r1 | 6
            goto L30
        L17:
            r4 = r1 & 6
            if (r4 != 0) goto L2f
            r4 = r1 & 8
            if (r4 != 0) goto L24
            boolean r4 = r13.V(r0)
            goto L28
        L24:
            boolean r4 = r13.D(r0)
        L28:
            if (r4 == 0) goto L2c
            r4 = 4
            goto L2d
        L2c:
            r4 = 2
        L2d:
            r4 = r4 | r1
            goto L30
        L2f:
            r4 = r1
        L30:
            r5 = r2 & 1
            if (r5 == 0) goto L39
            r4 = r4 | 48
        L36:
            r6 = r17
            goto L4b
        L39:
            r6 = r1 & 48
            if (r6 != 0) goto L36
            r6 = r17
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L48
            r7 = 32
            goto L4a
        L48:
            r7 = 16
        L4a:
            r4 = r4 | r7
        L4b:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L5d
            boolean r7 = r13.j()
            if (r7 != 0) goto L58
            goto L5d
        L58:
            r13.K()
            r4 = r6
            goto Lc0
        L5d:
            if (r5 == 0) goto L62
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            goto L63
        L62:
            r5 = r6
        L63:
            boolean r6 = androidx.compose.runtime.ComposerKt.M()
            if (r6 == 0) goto L6f
            r6 = -1
            java.lang.String r7 = "com.meijer.mobile.accounts.ux.composables.createaccount.CardSection (EducationScreen.kt:141)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r6, r7)
        L6f:
            Ji.A r3 = r0.getAdsCornerRadii()
            Ji.S r3 = r3.getRadius05()
            float r3 = r3.getDp()
            r0.h r3 = r0.C16692i.c(r3)
            r6 = 1
            float r7 = (float) r6
            float r7 = H1.h.p(r7)
            Ji.z r8 = r0.getAdsColors()
            Ji.T r8 = r8.getAdsColorUIBackground02()
            long r8 = r8.getColor()
            d0.h r10 = d0.C13442i.a(r7, r8)
            Lh.t0$a r7 = new Lh.t0$a
            r7.<init>(r0)
            r8 = 54
            r9 = 834666986(0x31c001ea, float:5.588153E-9)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r9, r6, r7, r13, r8)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r6 = 1572864(0x180000, float:2.204052E-39)
            r14 = r4 | r6
            r15 = 44
            r6 = 0
            r8 = 0
            r11 = 0
            r4 = r5
            r5 = r3
            kotlin.C17985y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.M()
            if (r3 == 0) goto Lc0
            androidx.compose.runtime.ComposerKt.T()
        Lc0:
            androidx.compose.runtime.T0 r3 = r13.l()
            if (r3 == 0) goto Lce
            Lh.r0 r5 = new Lh.r0
            r5.<init>()
            r3.a(r5)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.t0.h(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.t0.j(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(a.k.f10423a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.t0.m(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
