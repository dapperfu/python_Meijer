package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.C4987y2;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14815g;
import ji.InterfaceC14905H;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15851n1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LPi/y2;", "LNi/c;", "LNi/l$g;", "state", "<init>", "(LNi/l$g;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$g;", "m", "()LNi/l$g;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.y2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4987y2 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.g state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.y2$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28176a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4987y2 f28177b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.y2$a$a, reason: collision with other inner class name */
        static final class C0651a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28178a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.y2$a$a$a, reason: collision with other inner class name */
            static final class C0652a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28179a;

                C0652a(LocalThemeScope localThemeScope) {
                    this.f28179a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit A() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit B(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getEnabledSelectedLabel(), "Label");
                    AcresChip.k0(interfaceC14905H.getIcons().getLeadingEnabledIcon());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit C() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit D(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getDisabledSelectedLabel(), "Label");
                    AcresChip.k0(interfaceC14905H.getIcons().getLeadingDisabledIcon());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getDisabledRestingLabel(), "Label");
                    AcresChip.m0(interfaceC14905H.getIcons().getTrailingDisabledIcon());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getEnabledRestingLabel(), "Label");
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit w(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getEnabledRestingLabel(), "Label");
                    AcresChip.m0(interfaceC14905H.getIcons().getTrailingEnabledIcon());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit y() {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit z(InterfaceC14905H interfaceC14905H, ni.o1 AcresChip) {
                    Intrinsics.j(AcresChip, "$this$AcresChip");
                    AcresChip.d(interfaceC14905H.getLabels().getEnabledSelectedLabel(), "Label");
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
                    r(interfaceC14905H, composer, num.intValue());
                    return Unit.f142422a;
                }

                public final void r(final InterfaceC14905H Assemble, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f28179a;
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
                    float f10 = 4;
                    Modifier modifierB = d0.T.b(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                    float f11 = 8;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.o(H1.h.p(f11)), companion2.l(), composer, 6);
                    int iA2 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
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
                    q1.d.ChipButton enabledResting = Assemble.getButtons().getEnabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objB == companion4.a()) {
                        objB = new Function0() { // from class: Pi.m2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.s();
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
                        objB2 = new Function1() { // from class: Pi.r2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.u(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    int i13 = i11;
                    C15851n1.e(localThemeScope, null, function0, enabledResting, "Label", false, (Function1) objB2, composer, 221568, 1);
                    q1.d.ChipButton enabledResting2 = Assemble.getButtons().getEnabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion4.a()) {
                        objB3 = new Function0() { // from class: Pi.s2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.v();
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
                        objB4 = new Function1() { // from class: Pi.t2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.w(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function02, enabledResting2, "Label", false, (Function1) objB4, composer, 221568, 1);
                    q1.d.ChipButton disabledResting = Assemble.getButtons().getDisabledResting();
                    composer.startReplaceGroup(1849434622);
                    Object objB5 = composer.B();
                    if (objB5 == companion4.a()) {
                        objB5 = new Function0() { // from class: Pi.u2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.x();
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
                        objB6 = new Function1() { // from class: Pi.v2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.t(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB6);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function03, disabledResting, "Label", false, (Function1) objB6, composer, 221568, 1);
                    composer.v();
                    Modifier modifierB2 = d0.T.b(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.o(H1.h.p(f11)), companion2.l(), composer, 6);
                    int iA3 = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierB2);
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
                    q1.d.ChipButton enabledSelected = Assemble.getButtons().getEnabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB7 = composer.B();
                    if (objB7 == companion4.a()) {
                        objB7 = new Function0() { // from class: Pi.w2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.y();
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
                        objB8 = new Function1() { // from class: Pi.x2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.z(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB8);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function04, enabledSelected, "Label", true, (Function1) objB8, composer, 221568, 1);
                    q1.d.ChipButton enabledSelected2 = Assemble.getButtons().getEnabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB9 = composer.B();
                    if (objB9 == companion4.a()) {
                        objB9 = new Function0() { // from class: Pi.n2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.A();
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
                        objB10 = new Function1() { // from class: Pi.o2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.B(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB10);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function05, enabledSelected2, "Label", true, (Function1) objB10, composer, 221568, 1);
                    q1.d.ChipButton disabledSelected = Assemble.getButtons().getDisabledSelected();
                    composer.startReplaceGroup(1849434622);
                    Object objB11 = composer.B();
                    if (objB11 == companion4.a()) {
                        objB11 = new Function0() { // from class: Pi.p2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4987y2.a.C0651a.C0652a.C();
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
                        objB12 = new Function1() { // from class: Pi.q2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4987y2.a.C0651a.C0652a.D(Assemble, (ni.o1) obj);
                            }
                        };
                        composer.t(objB12);
                    }
                    composer.P();
                    C15851n1.e(localThemeScope, null, function06, disabledSelected, "Label", false, (Function1) objB12, composer, 221568, 1);
                    composer.v();
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }
            }

            C0651a(LocalThemeScope localThemeScope) {
                this.f28178a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1243469466, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChipShowcase.kt:38)");
                }
                LocalThemeScope localThemeScope = this.f28178a;
                Ji.Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(-1161685221, true, new C0652a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, C4987y2 c4987y2) {
            this.f28176a = localThemeScope;
            this.f28177b = c4987y2;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-250546797, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ChipShowcase.Content.<anonymous>.<anonymous>.<anonymous> (ChipShowcase.kt:34)");
            }
            Ri.b.b(this.f28176a, null, this.f28177b.d("Chip examples"), "1.0", null, ComposableLambdaKt.c(-1243469466, true, new C0651a(this.f28176a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public C4987y2(l.g state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, C4987y2 c4987y2, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-250546797, true, new a(localThemeScope, c4987y2)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C4987y2 c4987y2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4987y2.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4987y2 c4987y2, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4987y2.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Pi.k2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4987y2.j(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4987y2.k(this.f27667a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            t0L.a(new Function2() { // from class: Pi.j2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4987y2.l(this.f27597a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Chip";
    }

    @Override // Ni.c
    /* renamed from: m, reason: from getter */
    public l.g getState() {
        return this.state;
    }
}
