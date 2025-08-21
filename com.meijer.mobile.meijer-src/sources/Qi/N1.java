package Qi;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N1 implements Function3<LocalThemeScope, Composer, Integer, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC15205y f29213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f29214b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f29215c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29217b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29219a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29220b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29221c;

            public b(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29219a = localThemeScope;
                this.f29220b = j1Var;
                this.f29221c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-991955249, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:334)");
                }
                si.j.h(this.f29219a, this.f29220b.getLabels().getDestructiveLabel(), this.f29221c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class d implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29223a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29224b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29225c;

            public d(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29223a = localThemeScope;
                this.f29224b = j1Var;
                this.f29225c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1407690040, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:343)");
                }
                si.j.h(this.f29223a, this.f29224b.getLabels().getDisabledLabel(), this.f29225c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class f implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29227a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29228b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29229c;

            public f(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29227a = localThemeScope;
                this.f29228b = j1Var;
                this.f29229c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(702829719, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:352)");
                }
                si.j.h(this.f29227a, this.f29228b.getLabels().getEnabledLabel(), this.f29229c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class h implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29231a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29232b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29233c;

            public h(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29231a = localThemeScope;
                this.f29232b = j1Var;
                this.f29233c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2030602, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:361)");
                }
                C16671b.b(this.f29231a, q1.h.DrawableIcon.y(this.f29232b.getIcons().getDestructiveIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29231a, this.f29232b.getLabels().getDestructiveLabel(), this.f29233c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class j implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29235a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29236b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29237c;

            public j(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29235a = localThemeScope;
                this.f29236b = j1Var;
                this.f29237c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-706890923, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:372)");
                }
                C16671b.b(this.f29235a, q1.h.DrawableIcon.y(this.f29236b.getIcons().getDisabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29235a, this.f29236b.getLabels().getDisabledLabel(), this.f29237c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class l implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29240b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29241c;

            public l(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29239a = localThemeScope;
                this.f29240b = j1Var;
                this.f29241c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1411751244, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:383)");
                }
                C16671b.b(this.f29239a, q1.h.DrawableIcon.y(this.f29240b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29239a, this.f29240b.getLabels().getEnabledLabel(), this.f29241c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class n implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29243a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29244b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29245c;

            public n(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29243a = localThemeScope;
                this.f29244b = j1Var;
                this.f29245c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2116611565, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:394)");
                }
                C16671b.b(this.f29243a, q1.h.DrawableIcon.y(this.f29244b.getIcons().getDestructiveIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29243a, this.f29244b.getLabels().getDestructiveLabel(), this.f29245c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class p implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29247a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29248b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29249c;

            public p(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29247a = localThemeScope;
                this.f29248b = j1Var;
                this.f29249c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1473495410, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:405)");
                }
                C16671b.b(this.f29247a, q1.h.DrawableIcon.y(this.f29248b.getIcons().getDisabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29247a, this.f29248b.getLabels().getDisabledLabel(), this.f29249c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class r implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29251a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29252b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29253c;

            public r(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29251a = localThemeScope;
                this.f29252b = j1Var;
                this.f29253c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(768635089, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:416)");
                }
                C16671b.b(this.f29251a, q1.h.DrawableIcon.y(this.f29252b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
                C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
                si.j.h(this.f29251a, this.f29252b.getLabels().getEnabledLabel(), this.f29253c, null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        public final void a(ki.j1 Assemble, Composer composer, int i10) {
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
                ComposerKt.U(981641398, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:327)");
            }
            LocalThemeScope localThemeScope = this.f29216a;
            String str = this.f29217b;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            float f10 = 8;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierI);
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
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            q1.d.StandardButton destructiveButton = Assemble.getButtons().getDestructiveButton();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objB == companion4.a()) {
                objB = C0571a.f29218a;
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, destructiveButton, (Function0) objB, ComposableLambdaKt.c(-991955249, true, new b(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI2 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierI2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion4.a()) {
                objB2 = c.f29222a;
                composer.t(objB2);
            }
            composer.P();
            oi.E0.b(localThemeScope, disabledButton, (Function0) objB2, ComposableLambdaKt.c(1407690040, true, new d(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI3 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierI3);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion4.a()) {
                objB3 = e.f29226a;
                composer.t(objB3);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB3, ComposableLambdaKt.c(702829719, true, new f(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI4 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA5 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierI4);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            q1.d.StandardButton destructiveButton2 = Assemble.getButtons().getDestructiveButton();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion4.a()) {
                objB4 = g.f29230a;
                composer.t(objB4);
            }
            composer.P();
            oi.E0.b(localThemeScope, destructiveButton2, (Function0) objB4, ComposableLambdaKt.c(-2030602, true, new h(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI5 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB5 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA6 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR6 = composer.r();
            Modifier modifierE6 = androidx.compose.ui.b.e(composer, modifierI5);
            Function0<InterfaceC5953g> function0A6 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A6);
            } else {
                composer.s();
            }
            Composer composerA6 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA6, measurePolicyB5, companion3.e());
            androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion3.b();
            if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                composerA6.t(Integer.valueOf(iA6));
                composerA6.n(Integer.valueOf(iA6), function2B6);
            }
            androidx.compose.runtime.D1.c(composerA6, modifierE6, companion3.f());
            q1.d.StandardButton disabledButton2 = Assemble.getButtons().getDisabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion4.a()) {
                objB5 = i.f29234a;
                composer.t(objB5);
            }
            composer.P();
            oi.E0.b(localThemeScope, disabledButton2, (Function0) objB5, ComposableLambdaKt.c(-706890923, true, new j(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI6 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB6 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA7 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR7 = composer.r();
            Modifier modifierE7 = androidx.compose.ui.b.e(composer, modifierI6);
            Function0<InterfaceC5953g> function0A7 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A7);
            } else {
                composer.s();
            }
            Composer composerA7 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA7, measurePolicyB6, companion3.e());
            androidx.compose.runtime.D1.c(composerA7, interfaceC5884sR7, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B7 = companion3.b();
            if (composerA7.getInserting() || !Intrinsics.e(composerA7.B(), Integer.valueOf(iA7))) {
                composerA7.t(Integer.valueOf(iA7));
                composerA7.n(Integer.valueOf(iA7), function2B7);
            }
            androidx.compose.runtime.D1.c(composerA7, modifierE7, companion3.f());
            q1.d.StandardButton enabledButton2 = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion4.a()) {
                objB6 = k.f29238a;
                composer.t(objB6);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton2, (Function0) objB6, ComposableLambdaKt.c(-1411751244, true, new l(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI7 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB7 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA8 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR8 = composer.r();
            Modifier modifierE8 = androidx.compose.ui.b.e(composer, modifierI7);
            Function0<InterfaceC5953g> function0A8 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A8);
            } else {
                composer.s();
            }
            Composer composerA8 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA8, measurePolicyB7, companion3.e());
            androidx.compose.runtime.D1.c(composerA8, interfaceC5884sR8, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B8 = companion3.b();
            if (composerA8.getInserting() || !Intrinsics.e(composerA8.B(), Integer.valueOf(iA8))) {
                composerA8.t(Integer.valueOf(iA8));
                composerA8.n(Integer.valueOf(iA8), function2B8);
            }
            androidx.compose.runtime.D1.c(composerA8, modifierE8, companion3.f());
            q1.d.StandardButton destructiveButton3 = Assemble.getButtons().getDestructiveButton();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion4.a()) {
                objB7 = m.f29242a;
                composer.t(objB7);
            }
            composer.P();
            oi.E0.b(localThemeScope, destructiveButton3, (Function0) objB7, ComposableLambdaKt.c(-2116611565, true, new n(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI8 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB8 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA9 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR9 = composer.r();
            Modifier modifierE9 = androidx.compose.ui.b.e(composer, modifierI8);
            Function0<InterfaceC5953g> function0A9 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A9);
            } else {
                composer.s();
            }
            Composer composerA9 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA9, measurePolicyB8, companion3.e());
            androidx.compose.runtime.D1.c(composerA9, interfaceC5884sR9, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B9 = companion3.b();
            if (composerA9.getInserting() || !Intrinsics.e(composerA9.B(), Integer.valueOf(iA9))) {
                composerA9.t(Integer.valueOf(iA9));
                composerA9.n(Integer.valueOf(iA9), function2B9);
            }
            androidx.compose.runtime.D1.c(composerA9, modifierE9, companion3.f());
            q1.d.StandardButton disabledButton3 = Assemble.getButtons().getDisabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion4.a()) {
                objB8 = o.f29246a;
                composer.t(objB8);
            }
            composer.P();
            oi.E0.b(localThemeScope, disabledButton3, (Function0) objB8, ComposableLambdaKt.c(1473495410, true, new p(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            Modifier modifierI9 = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyB9 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA10 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR10 = composer.r();
            Modifier modifierE10 = androidx.compose.ui.b.e(composer, modifierI9);
            Function0<InterfaceC5953g> function0A10 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A10);
            } else {
                composer.s();
            }
            Composer composerA10 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA10, measurePolicyB9, companion3.e());
            androidx.compose.runtime.D1.c(composerA10, interfaceC5884sR10, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B10 = companion3.b();
            if (composerA10.getInserting() || !Intrinsics.e(composerA10.B(), Integer.valueOf(iA10))) {
                composerA10.t(Integer.valueOf(iA10));
                composerA10.n(Integer.valueOf(iA10), function2B10);
            }
            androidx.compose.runtime.D1.c(composerA10, modifierE10, companion3.f());
            q1.d.StandardButton enabledButton3 = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(1849434622);
            Object objB9 = composer.B();
            if (objB9 == companion4.a()) {
                objB9 = q.f29250a;
                composer.t(objB9);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton3, (Function0) objB9, ComposableLambdaKt.c(768635089, true, new r(localThemeScope, Assemble, str), composer, 54), composer, 3456);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.N1$a$a, reason: collision with other inner class name */
        public static final class C0571a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0571a f29218a = new C0571a();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class c implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f29222a = new c();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class e implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f29226a = new e();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class g implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final g f29230a = new g();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class i implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final i f29234a = new i();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class k implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final k f29238a = new k();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class m implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final m f29242a = new m();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class o implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final o f29246a = new o();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class q implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final q f29250a = new q();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        public a(LocalThemeScope localThemeScope, String str) {
            this.f29216a = localThemeScope;
            this.f29217b = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public N1(InterfaceC15205y interfaceC15205y, int i10, String str) {
        this.f29213a = interfaceC15205y;
        this.f29214b = i10;
        this.f29215c = str;
    }

    public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
        Intrinsics.j(AdsTheme, "$this$AdsTheme");
        if ((i10 & 6) == 0) {
            i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
        }
        if ((i10 & 19) == 18 && composer.j()) {
            composer.K();
            return;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(2115665818, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardRectangleButtonsFromScope.<anonymous> (ButtonShowcaseLegacy.kt:326)");
        }
        Ki.Q.e(AdsTheme, this.f29213a, ComposableLambdaKt.c(981641398, true, new a(AdsTheme, this.f29215c), composer, 54), composer, (i10 & 14) | 384 | ((this.f29214b & 8) << 3));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
        a(localThemeScope, composer, num.intValue());
        return Unit.f143329a;
    }
}
