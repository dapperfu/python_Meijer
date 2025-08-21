package Ij;

import H1.h;
import Ij.g;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.C15158a0;
import ki.R0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.O;
import oi.P0;
import si.j;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "LIj/d;", "modalData", "", "b", "(LKi/M;LIj/d;Landroidx/compose/runtime/Composer;I)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f14822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f14823b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ij.g$a$a, reason: collision with other inner class name */
        static final class C0238a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f14824a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f14825b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f14826c;

            C0238a(LocalThemeScope localThemeScope, d dVar, R0 r02) {
                this.f14824a = localThemeScope;
                this.f14825b = dVar;
                this.f14826c = r02;
            }

            public final void a(Composer composer, int i10) {
                Modifier.Companion companion;
                Composer composer2;
                int i11;
                int i12;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-50816039, i10, -1, "com.meijer.mobile.core.design.compose.widget.modals.SimpleModal.<anonymous>.<anonymous> (SimpleModal.kt:37)");
                }
                e.Companion companion2 = P0.e.INSTANCE;
                e.b bVarG = companion2.g();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierK = D.k(companion3, this.f14824a.getAdsSpacing().getSeven().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f14824a;
                d dVar = this.f14825b;
                R0 r02 = this.f14826c;
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarG, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                D1.c(composerA, measurePolicyA, companion4.e());
                D1.c(composerA, interfaceC5884sR, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion4.f());
                C14903g c14903g = C14903g.f139698a;
                C14890K.a(D.m(companion3, 0.0f, localThemeScope.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
                String cancelLabel = dVar.getCancelLabel();
                composer.startReplaceGroup(-1522562693);
                if (cancelLabel == null) {
                    companion = companion3;
                    composer2 = composer;
                    i11 = 8;
                    i12 = 6;
                } else {
                    MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.l(), composer, 0);
                    int iA2 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
                    Function0<InterfaceC5953g> function0A2 = companion4.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A2);
                    } else {
                        composer.s();
                    }
                    Composer composerA2 = D1.a(composer);
                    D1.c(composerA2, measurePolicyB, companion4.e());
                    D1.c(composerA2, interfaceC5884sR2, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    C14889J c14889j = C14889J.f139620a;
                    C14890K.a(InterfaceC14888I.b(c14889j, companion3, 1.0f, false, 2, null), composer, 0);
                    Modifier modifierD = c14889j.d(companion3, companion2.l());
                    MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                    int iA3 = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierD);
                    Function0<InterfaceC5953g> function0A3 = companion4.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A3);
                    } else {
                        composer.s();
                    }
                    Composer composerA3 = D1.a(composer);
                    D1.c(composerA3, measurePolicyG, companion4.e());
                    D1.c(composerA3, interfaceC5884sR3, companion4.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C5806j c5806j = C5806j.f48836a;
                    companion = companion3;
                    composer2 = composer;
                    i11 = 8;
                    P0.i(localThemeScope, O.f154006a, dVar.k(), C.f.o.f17066e, dVar.getCancelLabel(), null, false, false, 0L, composer2, LocalThemeScope.f17314g | (O.f154007b << 3) | (C.f.o.f17067f << 9), 240);
                    composer2.v();
                    i12 = 6;
                    C14890K.a(D.m(companion, 0.0f, 0.0f, h.p(8), 0.0f, 11, null), composer2, 6);
                    composer2.v();
                    Unit unit = Unit.f143329a;
                }
                composer2.P();
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null);
                String title = dVar.getTitle();
                if (title == null) {
                    title = "";
                }
                int i13 = LocalThemeScope.f17314g;
                int i14 = q1.Label.f142335j;
                j.h(localThemeScope, label, title, null, composer2, i13 | (i14 << 3), 4);
                String subTitle = dVar.getSubTitle();
                composer2.startReplaceGroup(-1522536533);
                if (subTitle != null) {
                    C14890K.a(D.m(companion, 0.0f, 0.0f, 0.0f, h.p(i11), 7, null), composer2, i12);
                    j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null), subTitle, null, composer2, i13 | (i14 << 3), 4);
                    Unit unit2 = Unit.f143329a;
                }
                composer2.P();
                C14890K.a(D.m(companion, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 7, null), composer2, 0);
                q1.Label body = r02.getLabels().getBody();
                String description = dVar.getDescription();
                j.h(localThemeScope, body, description == null ? "" : description, null, composer2, i13 | (i14 << 3), 4);
                C14890K.a(D.m(companion, 0.0f, 0.0f, 0.0f, h.p(32), 7, null), composer2, i12);
                C16194s0 c16194s0 = C16194s0.f154251a;
                Function0<Unit> function0J = dVar.j();
                String acceptLabel = dVar.getAcceptLabel();
                if (acceptLabel == null) {
                    acceptLabel = "";
                }
                int i15 = C16194s0.f154252b;
                int i16 = i12;
                P0.k(localThemeScope, c16194s0, acceptLabel, function0J, null, null, true, 0L, false, composer2, i13 | 1572864 | (i15 << 3), 216);
                String cancelLabel2 = dVar.getCancelLabel();
                composer2.startReplaceGroup(-1522511441);
                if (cancelLabel2 != null) {
                    C14890K.a(D.m(companion, 0.0f, 0.0f, 0.0f, h.p(12), 7, null), composer2, i16);
                    P0.k(localThemeScope, c16194s0, cancelLabel2, dVar.k(), null, null, true, 0L, false, composer2, i13 | 1572864 | (i15 << 3), 216);
                    Unit unit3 = Unit.f143329a;
                }
                composer2.P();
                C14890K.a(D.m(companion, 0.0f, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getSeven().getDp(), 7, null), composer2, 0);
                composer2.v();
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

        a(LocalThemeScope localThemeScope, d dVar) {
            this.f14822a = localThemeScope;
            this.f14823b = dVar;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(41694566, i10, -1, "com.meijer.mobile.core.design.compose.widget.modals.SimpleModal.<anonymous> (SimpleModal.kt:36)");
            }
            LocalThemeScope localThemeScope = this.f14822a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f14823b);
            final d dVar = this.f14823b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ij.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.c(dVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(-50816039, true, new C0238a(this.f14822a, this.f14823b, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(d dVar) {
            dVar.l().invoke();
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final d modalData, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modalData, "modalData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297364683);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modalData) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1297364683, i11, -1, "com.meijer.mobile.core.design.compose.widget.modals.SimpleModal (SimpleModal.kt:35)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(41694566, true, new a(localThemeScope, modalData), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ij.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.c(localThemeScope, modalData, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, d dVar, int i10, Composer composer, int i11) {
        b(localThemeScope, dVar, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
