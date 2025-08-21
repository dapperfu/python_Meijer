package Mh;

import Gh.a;
import Ki.LocalThemeScope;
import Mh.t0;
import P0.e;
import V0.AbstractC5467i0;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
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
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13590y;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "h", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "header", "body", "f", "(LKi/M;Landroidx/compose/ui/Modifier;ILbk/a;Lbk/a;Landroidx/compose/runtime/Composer;II)V", "m", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class t0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20162a;

        a(LocalThemeScope localThemeScope) {
            this.f20162a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(834666986, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CardSection.<anonymous> (EducationScreen.kt:147)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f20162a.getAdsSpacing().getFive().getDp()), this.f20162a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            C5800d.f fVarO = C5800d.f48779a.o(this.f20162a.getAdsSpacing().getEight().getDp());
            LocalThemeScope localThemeScope = this.f20162a;
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            int i11 = Gh.e.f12644i;
            AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aD = companion2.d(Gh.h.f12798T0, new Object[0]);
            AbstractC6392a abstractC6392aD2 = companion2.d(Gh.h.f12805U0, new Object[0]);
            int i12 = LocalThemeScope.f17314g;
            int i13 = AbstractC6392a.f60445b;
            t0.f(localThemeScope, null, i11, abstractC6392aD, abstractC6392aD2, composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Gh.e.f12643h, companion2.d(Gh.h.f12770P0, new Object[0]), companion2.d(Gh.h.f12777Q0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Gh.e.f12645j, companion2.d(Gh.h.f12812V0, new Object[0]), companion2.d(Gh.h.f12819W0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
            t0.f(localThemeScope, null, Gh.e.f12646k, companion2.d(Gh.h.f12826X0, new Object[0]), companion2.d(Gh.h.f12833Y0, new Object[0]), composer, (i13 << 9) | i12 | (i13 << 12), 1);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20163a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f20164a;

            a(LocalThemeScope localThemeScope) {
                this.f20164a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1654029662, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.EducationScreen.<anonymous>.<anonymous> (EducationScreen.kt:76)");
                }
                Dr.g.g(this.f20164a, C16338g.c(Gh.h.f12797T, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        b(LocalThemeScope localThemeScope) {
            this.f20163a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-208684898, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.EducationScreen.<anonymous> (EducationScreen.kt:74)");
            }
            LocalThemeScope localThemeScope = this.f20163a;
            Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(1654029662, true, new a(localThemeScope), composer, 54), null, null, 0.0f, false, AbstractC6392a.INSTANCE.a(), composer, 100687872 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 27), 119);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f20166b;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
            this.f20165a = localThemeScope;
            this.f20166b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.e.f12607a);
            return Unit.f143329a;
        }

        public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f20165a;
            final Function1<Gh.a, Unit> function1 = this.f20166b;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C13590y.a(C16335d.c(Gh.e.f12642g, composer, 0), null, androidx.compose.foundation.b.b(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), AbstractC5467i0.Companion.f(AbstractC5467i0.INSTANCE, CollectionsKt.p(C5489q0.m(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor()), C5489q0.m(localThemeScope.getAdsColors().getAdsColorUIBackground02().getColor())), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(d0.T.g(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp());
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.b(), companion2.k(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierJ);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            int i12 = LocalThemeScope.f17314g;
            t0.m(localThemeScope, null, composer, i12, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getNine().getDp()), composer, 0);
            t0.h(localThemeScope, null, composer, i12, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getEleven().getDp()), composer, 0);
            composer.v();
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(c5806j.g(companion, companion2.b()), 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierD);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C17983Z.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyG2, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            Modifier modifierF = C18370z.f(companion, "education_got_it_button", null, 2, null);
            C16194s0 c16194s0 = C16194s0.f154251a;
            String strC = C16338g.c(Gh.h.f12784R0, composer, 0);
            String strC2 = C16338g.c(Gh.h.f12784R0, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Mh.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return t0.c.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope, c16194s0, strC, (Function0) objB, modifierF, strC2, true, 0L, false, composer, 1572864 | i12 | (C16194s0.f154252b << 3), 192);
            composer.v();
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            b(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void f(final Ki.LocalThemeScope r38, androidx.compose.ui.Modifier r39, final int r40, final bk.AbstractC6392a r41, final bk.AbstractC6392a r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.t0.f(Ki.M, androidx.compose.ui.Modifier, int, bk.a, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i11, int i12, Composer composer, int i13) {
        f(localThemeScope, modifier, i10, abstractC6392a, abstractC6392a2, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
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
    public static final void h(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
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
            Ki.A r3 = r0.getAdsCornerRadii()
            Ki.S r3 = r3.getRadius05()
            float r3 = r3.getDp()
            r0.h r3 = r0.C16806i.c(r3)
            r6 = 1
            float r7 = (float) r6
            float r7 = H1.h.p(r7)
            Ki.z r8 = r0.getAdsColors()
            Ki.T r8 = r8.getAdsColorUIBackground02()
            long r8 = r8.getColor()
            d0.h r10 = d0.C13575i.a(r7, r8)
            Mh.t0$a r7 = new Mh.t0$a
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
            kotlin.C18051y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.M()
            if (r3 == 0) goto Lc0
            androidx.compose.runtime.ComposerKt.T()
        Lc0:
            androidx.compose.runtime.T0 r3 = r13.l()
            if (r3 == 0) goto Lce
            Mh.r0 r5 = new Mh.r0
            r5.<init>()
            r3.a(r5)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.t0.h(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void j(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.t0.j(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(a.k.f12614a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void m(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.t0.m(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
