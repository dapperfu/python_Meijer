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
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15197u;
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
public final class M1 implements Function3<LocalThemeScope, Composer, Integer, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC15197u f29166a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f29167b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f29168c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29169a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29170b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29173b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29174c;

            public b(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29172a = localThemeScope;
                this.f29173b = j1Var;
                this.f29174c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1794476520, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:440)");
                }
                si.j.h(this.f29172a, this.f29173b.getLabels().getDestructiveLabel(), this.f29174c, null, composer, 0, 4);
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
            final /* synthetic */ LocalThemeScope f29176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29177b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29178c;

            public d(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29176a = localThemeScope;
                this.f29177b = j1Var;
                this.f29178c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1547017247, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:450)");
                }
                si.j.h(this.f29176a, this.f29177b.getLabels().getDisabledLabel(), this.f29178c, null, composer, 0, 4);
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
            final /* synthetic */ LocalThemeScope f29180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29182c;

            public f(LocalThemeScope localThemeScope, ki.j1 j1Var, String str) {
                this.f29180a = localThemeScope;
                this.f29181b = j1Var;
                this.f29182c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(723206432, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:459)");
                }
                si.j.h(this.f29180a, this.f29181b.getLabels().getEnabledLabel(), this.f29182c, null, composer, 0, 4);
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
        public static final class h implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29184a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29185b;

            public h(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f29184a = localThemeScope;
                this.f29185b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-100604383, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:468)");
                }
                C16671b.b(this.f29184a, q1.h.DrawableIcon.y(this.f29185b.getIcons().getDestructiveIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
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
        public static final class j implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29187a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29188b;

            public j(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f29187a = localThemeScope;
                this.f29188b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-924415198, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:477)");
                }
                C16671b.b(this.f29187a, q1.h.DrawableIcon.y(this.f29188b.getIcons().getDisabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
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
        public static final class l implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29190a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.j1 f29191b;

            public l(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                this.f29190a = localThemeScope;
                this.f29191b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1748226013, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:486)");
                }
                C16671b.b(this.f29190a, q1.h.DrawableIcon.y(this.f29191b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, 0, 6);
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
        /* renamed from: Qi.M1$a$a, reason: collision with other inner class name */
        public static final class C0570a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0570a f29171a = new C0570a();

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
            public static final c f29175a = new c();

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
            public static final e f29179a = new e();

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
            public static final g f29183a = new g();

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
            public static final i f29186a = new i();

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
            public static final k f29189a = new k();

            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        public a(LocalThemeScope localThemeScope, String str) {
            this.f29169a = localThemeScope;
            this.f29170b = str;
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
                ComposerKt.U(1871673697, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous>.<anonymous> (ButtonShowcaseLegacy.kt:433)");
            }
            LocalThemeScope localThemeScope = this.f29169a;
            String str = this.f29170b;
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
                objB = C0570a.f29171a;
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, destructiveButton, (Function0) objB, ComposableLambdaKt.c(1794476520, true, new b(localThemeScope, Assemble, str), composer, 54), composer, 3456);
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
                objB2 = c.f29175a;
                composer.t(objB2);
            }
            composer.P();
            oi.E0.b(localThemeScope, disabledButton, (Function0) objB2, ComposableLambdaKt.c(1547017247, true, new d(localThemeScope, Assemble, str), composer, 54), composer, 3456);
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
                objB3 = e.f29179a;
                composer.t(objB3);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton, (Function0) objB3, ComposableLambdaKt.c(723206432, true, new f(localThemeScope, Assemble, str), composer, 54), composer, 3456);
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
                objB4 = g.f29183a;
                composer.t(objB4);
            }
            composer.P();
            oi.E0.b(localThemeScope, destructiveButton2, (Function0) objB4, ComposableLambdaKt.c(-100604383, true, new h(localThemeScope, Assemble), composer, 54), composer, 3456);
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
                objB5 = i.f29186a;
                composer.t(objB5);
            }
            composer.P();
            oi.E0.b(localThemeScope, disabledButton2, (Function0) objB5, ComposableLambdaKt.c(-924415198, true, new j(localThemeScope, Assemble), composer, 54), composer, 3456);
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
                objB6 = k.f29189a;
                composer.t(objB6);
            }
            composer.P();
            oi.E0.b(localThemeScope, enabledButton2, (Function0) objB6, ComposableLambdaKt.c(-1748226013, true, new l(localThemeScope, Assemble), composer, 54), composer, 3456);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public M1(InterfaceC15197u interfaceC15197u, int i10, String str) {
        this.f29166a = interfaceC15197u;
        this.f29167b = i10;
        this.f29168c = str;
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
            ComposerKt.U(-2035438339, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ButtonShowcaseLegacy.AssembleStandardCircleButtonsFromScope.<anonymous> (ButtonShowcaseLegacy.kt:432)");
        }
        Ki.Q.e(AdsTheme, this.f29166a, ComposableLambdaKt.c(1871673697, true, new a(AdsTheme, this.f29168c), composer, 54), composer, (i10 & 14) | 384 | ((this.f29167b & 8) << 3));
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
