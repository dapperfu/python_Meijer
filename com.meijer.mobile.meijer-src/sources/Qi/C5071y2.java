package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import P0.e;
import Qi.C5071y2;
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
import ki.InterfaceC15139H;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import oi.C16185n1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LQi/y2;", "LOi/c;", "LOi/l$g;", "state", "<init>", "(LOi/l$g;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$g;", "m", "()LOi/l$g;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.y2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5071y2 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.g state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.y2$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5071y2 f30889b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.y2$a$a, reason: collision with other inner class name */
        static final class C0715a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30890a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.y2$a$a$a, reason: collision with other inner class name */
            static final class C0716a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30891a;

                C0716a(LocalThemeScope localThemeScope) {
                    this.f30891a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit A() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit B(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getEnabledSelectedLabel(), "Label");
                    AcresChip.Y(interfaceC15139H.getIcons().getLeadingEnabledIcon());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit C() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit D(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getDisabledSelectedLabel(), "Label");
                    AcresChip.Y(interfaceC15139H.getIcons().getLeadingDisabledIcon());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getDisabledRestingLabel(), "Label");
                    AcresChip.p(interfaceC15139H.getIcons().getTrailingDisabledIcon());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getEnabledRestingLabel(), "Label");
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit w(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getEnabledRestingLabel(), "Label");
                    AcresChip.p(interfaceC15139H.getIcons().getTrailingEnabledIcon());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit y() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit z(InterfaceC15139H interfaceC15139H, oi.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC15139H.getLabels().getEnabledSelectedLabel(), "Label");
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
                    r(interfaceC15139H, composer, num.intValue());
                    return Unit.f143329a;
                }

                public final void r(final InterfaceC15139H Assemble, Composer composer, int i10) {
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
                        ComposerKt.U(-1161685221, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChipShowcase.kt:41)");
                    }
                    LocalThemeScope localThemeScope = this.f30891a;
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
                    float f10 = 4;
                    Modifier modifierB = d0.T.b(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                    float f11 = 8;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.o(H1.h.p(f11)), companion2.l(), composer, 6);
                    int iA2 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
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
                    q1.d.ChipButton enabledResting = Assemble.getButtons().getEnabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objB == companion4.a()) {
                        objB = new Function0() { // from class: Qi.m2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.s();
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    int i12 = i11 & 14;
                    boolean z10 = i12 == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                    Object objB2 = composer.B();
                    if (z10 || objB2 == companion4.a()) {
                        objB2 = new Function1() { // from class: Qi.r2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.u(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    int i13 = i11;
                    C16185n1.e(localThemeScope, null, function0, enabledResting, "Label", false, (Function1) objB2, composer, 221568, 1);
                    q1.d.ChipButton enabledResting2 = Assemble.getButtons().getEnabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion4.a()) {
                        objB3 = new Function0() { // from class: Qi.s2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.v();
                            }
                        };
                        composer.t(objB3);
                    }
                    Function0 function02 = (Function0) objB3;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean z11 = i12 == 4 || ((i13 & 8) != 0 && composer.D(Assemble));
                    Object objB4 = composer.B();
                    if (z11 || objB4 == companion4.a()) {
                        objB4 = new Function1() { // from class: Qi.t2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.w(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function02, enabledResting2, "Label", false, (Function1) objB4, composer, 221568, 1);
                    q1.d.ChipButton disabledResting = Assemble.getButtons().getDisabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB5 = composer.B();
                    if (objB5 == companion4.a()) {
                        objB5 = new Function0() { // from class: Qi.u2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.x();
                            }
                        };
                        composer.t(objB5);
                    }
                    Function0 function03 = (Function0) objB5;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean z12 = i12 == 4 || ((i13 & 8) != 0 && composer.D(Assemble));
                    Object objB6 = composer.B();
                    if (z12 || objB6 == companion4.a()) {
                        objB6 = new Function1() { // from class: Qi.v2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.t(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB6);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function03, disabledResting, "Label", false, (Function1) objB6, composer, 221568, 1);
                    composer.v();
                    Modifier modifierB2 = d0.T.b(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.o(H1.h.p(f11)), companion2.l(), composer, 6);
                    int iA3 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierB2);
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
                    q1.d.ChipButton enabledSelected = Assemble.getButtons().getEnabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB7 = composer.B();
                    if (objB7 == companion4.a()) {
                        objB7 = new Function0() { // from class: Qi.w2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.y();
                            }
                        };
                        composer.t(objB7);
                    }
                    Function0 function04 = (Function0) objB7;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean z13 = i12 == 4 || ((i13 & 8) != 0 && composer.D(Assemble));
                    Object objB8 = composer.B();
                    if (z13 || objB8 == companion4.a()) {
                        objB8 = new Function1() { // from class: Qi.x2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.z(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB8);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function04, enabledSelected, "Label", true, (Function1) objB8, composer, 221568, 1);
                    q1.d.ChipButton enabledSelected2 = Assemble.getButtons().getEnabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB9 = composer.B();
                    if (objB9 == companion4.a()) {
                        objB9 = new Function0() { // from class: Qi.n2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.A();
                            }
                        };
                        composer.t(objB9);
                    }
                    Function0 function05 = (Function0) objB9;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean z14 = i12 == 4 || ((i13 & 8) != 0 && composer.D(Assemble));
                    Object objB10 = composer.B();
                    if (z14 || objB10 == companion4.a()) {
                        objB10 = new Function1() { // from class: Qi.o2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.B(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB10);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function05, enabledSelected2, "Label", true, (Function1) objB10, composer, 221568, 1);
                    q1.d.ChipButton disabledSelected = Assemble.getButtons().getDisabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB11 = composer.B();
                    if (objB11 == companion4.a()) {
                        objB11 = new Function0() { // from class: Qi.p2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C5071y2.a.C0715a.C0716a.C();
                            }
                        };
                        composer.t(objB11);
                    }
                    Function0 function06 = (Function0) objB11;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean z15 = i12 == 4 || ((i13 & 8) != 0 && composer.D(Assemble));
                    Object objB12 = composer.B();
                    if (z15 || objB12 == companion4.a()) {
                        objB12 = new Function1() { // from class: Qi.q2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C5071y2.a.C0715a.C0716a.D(Assemble, (oi.o1) obj);
                            }
                        };
                        composer.t(objB12);
                    }
                    composer.P();
                    C16185n1.e(localThemeScope, null, function06, disabledSelected, "Label", false, (Function1) objB12, composer, 221568, 1);
                    composer.v();
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }
            }

            C0715a(LocalThemeScope localThemeScope) {
                this.f30890a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1243469466, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChipShowcase.kt:38)");
                }
                LocalThemeScope localThemeScope = this.f30890a;
                Ki.Q.e(localThemeScope, InterfaceC15205y.a.C2257a.f142541a, ComposableLambdaKt.c(-1161685221, true, new C0716a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, C5071y2 c5071y2) {
            this.f30888a = localThemeScope;
            this.f30889b = c5071y2;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-250546797, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ChipShowcase.kt:34)");
            }
            Si.b.b(this.f30888a, null, this.f30889b.c("Chip examples"), "1.0", null, ComposableLambdaKt.c(-1243469466, true, new C0715a(this.f30888a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public C5071y2(l.g state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, C5071y2 c5071y2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-250546797, true, new a(localThemeScope, c5071y2)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C5071y2 c5071y2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5071y2.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C5071y2 c5071y2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5071y2.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(596614495);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(596614495, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Controls (ChipShowcase.kt:127)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.j2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5071y2.l(this.f30309a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-734311800);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-734311800, i11, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content (ChipShowcase.kt:29)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.k2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5071y2.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5071y2.k(this.f30379a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Chip";
    }

    @Override // Oi.c
    /* renamed from: m, reason: from getter */
    public l.g getState() {
        return this.state;
    }
}
