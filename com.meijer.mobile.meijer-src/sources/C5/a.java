package C5;

import H1.d;
import H1.h;
import H1.t;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import j0.C14903g;
import kotlin.C17972T0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import w5.C17842a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: C5.a$a, reason: collision with other inner class name */
    static final class C0083a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0083a(int i10) {
            super(2);
            this.f4116f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f4116f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
            F5.a aVar = F5.a.f9034a;
            Modifier modifierK = D.k(b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getXLarge(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion2 = e.INSTANCE;
            MeasurePolicy measurePolicyI = C5804h.i(companion2.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar = (d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierK);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C5806j c5806j = C5806j.f48836a;
            Modifier modifierA = F1.a(J.f(companion, 0.0f, 1, null), "pinConnectingView");
            C5800d.f fVarO = C5800d.f48779a.o(aVar.b().c().getMedium());
            e.b bVarG = companion2.g();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, bVarG, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar2 = (d) composerStartRestartGroup.o(C6034t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C2 = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C14903g c14903g = C14903g.f139698a;
            C17842a.a(composerStartRestartGroup, 0);
            C17972T0.a(F1.a(J.z(companion, h.p(64)), "pinConnectingLoadingIndicator"), C5489q0.INSTANCE.f(), h.p(6), 0L, 0, composerStartRestartGroup, 438, 24);
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
        t0L.a(new C0083a(i10));
    }
}
