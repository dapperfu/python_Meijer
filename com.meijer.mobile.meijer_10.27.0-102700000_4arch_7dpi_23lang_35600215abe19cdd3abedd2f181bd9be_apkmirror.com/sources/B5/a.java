package B5;

import H1.d;
import H1.h;
import H1.t;
import P0.e;
import V0.C5346q0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import j0.C14815g;
import kotlin.C17906T0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.C17509a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: B5.a$a, reason: collision with other inner class name */
    static final class C0042a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f2077f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0042a(int i10) {
            super(2);
            this.f2077f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f2077f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2121044911);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2121044911, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.loading.PinConnectingView (PinConnectingView.kt:36)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            E5.a aVar = E5.a.f7617a;
            Modifier modifierK = D.k(b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getXLarge(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion2 = e.INSTANCE;
            MeasurePolicy measurePolicyI = C5662h.i(companion2.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar = (d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierK);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyI, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5664j c5664j = C5664j.f48612a;
            Modifier modifierA = F1.a(J.f(companion, 0.0f, 1, null), "pinConnectingView");
            C5658d.f fVarO = C5658d.f48555a.o(aVar.b().c().getMedium());
            e.b bVarG = companion2.g();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, bVarG, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar2 = (d) composerStartRestartGroup.o(C5892t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C2 = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, dVar2, companion3.c());
            D1.c(composerA2, tVar2, companion3.d());
            D1.c(composerA2, q13, companion3.h());
            composerStartRestartGroup.c();
            function3C2.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14815g c14815g = C14815g.f139108a;
            C17509a.a(composerStartRestartGroup, 0);
            C17906T0.a(F1.a(J.z(companion, h.p(64)), "pinConnectingLoadingIndicator"), C5346q0.INSTANCE.f(), h.p(6), 0L, 0, composerStartRestartGroup, 438, 24);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C0042a(i10));
    }
}
