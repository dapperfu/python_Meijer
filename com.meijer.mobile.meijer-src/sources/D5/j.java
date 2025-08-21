package D5;

import H1.t;
import P0.e;
import android.content.res.Configuration;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import d0.C13590y;
import d0.T;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14902f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import u5.C17350a;
import w5.AbstractC17844c;
import w5.C17842a;
import w5.C17843b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/z1;", "Lw5/c;", "quickConnectState", "Lkotlin/Function1;", "LD5/g;", "", "onAction", "a", "(Landroidx/compose/runtime/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<AbstractC17844c> f5959f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f5960g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5961h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1<? extends AbstractC17844c> z1Var, Function1<? super g, Unit> function1, int i10) {
            super(2);
            this.f5959f = z1Var;
            this.f5960g = function1;
            this.f5961h = i10;
        }

        public final void a(Composer composer, int i10) {
            j.a(this.f5959f, this.f5960g, composer, J0.a(this.f5961h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(z1<? extends AbstractC17844c> quickConnectState, Function1<? super g, Unit> onAction, Composer composer, int i10) {
        int i11;
        Intrinsics.j(quickConnectState, "quickConnectState");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1141081827);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(quickConnectState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1141081827, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.QuickConnectView (QuickConnectView.kt:49)");
            }
            composerStartRestartGroup.startReplaceableGroup(1549438854);
            Configuration configuration = (Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = Boolean.valueOf((configuration.uiMode & 15) == 4);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            composerStartRestartGroup.U();
            composerStartRestartGroup.startReplaceableGroup(1549439030);
            Configuration configuration2 = (Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                int i12 = configuration2.orientation;
                objB2 = Boolean.valueOf(i12 == 2 || i12 == 0);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            boolean zBooleanValue2 = ((Boolean) objB2).booleanValue();
            composerStartRestartGroup.U();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion2, 0.0f, 1, null);
            F5.a aVar = F5.a.f9034a;
            Modifier modifierA = F1.a(D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getLarge(), 0.0f, 2, null), "quickConnectView");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyI = C5804h.i(companion3.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
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
            D1.c(composerA, measurePolicyI, companion4.e());
            D1.c(composerA, dVar, companion4.c());
            D1.c(composerA, tVar, companion4.d());
            D1.c(composerA, q12, companion4.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5806j c5806j = C5806j.f48836a;
            Modifier modifierA2 = F1.a(T.g(J.f(companion2, 0.0f, 1, null), T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), "quickConnectScrollView");
            C5800d.f fVarO = C5800d.f48779a.o(aVar.b().c().getMedium());
            e.b bVarG = companion3.g();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, bVarG, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C2 = A.c(modifierA2);
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
            D1.c(composerA2, measurePolicyA, companion4.e());
            D1.c(composerA2, dVar2, companion4.c());
            D1.c(composerA2, tVar2, companion4.d());
            D1.c(composerA2, q13, companion4.h());
            composerStartRestartGroup.c();
            function3C2.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14903g c14903g = C14903g.f139698a;
            C17842a.a(composerStartRestartGroup, 0);
            C17843b.a(C16338g.c(u5.b.f163707G, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            Z0.c cVarC = C16335d.c(C17350a.f163700d, composerStartRestartGroup, 0);
            InterfaceC5926k.Companion companion5 = InterfaceC5926k.INSTANCE;
            int i13 = i11;
            C13590y.a(cVarC, "Quick Connect Flow", F1.a(J.g(D.j(companion2, aVar.b().b().getXLarge(), aVar.b().b().getMedium()), (zBooleanValue || zBooleanValue2) ? 0.3f : 1.0f), "quickConnectLogo"), null, companion5.d(), 0.0f, null, composerStartRestartGroup, 24632, 104);
            composerStartRestartGroup.startReplaceableGroup(1606358259);
            if (quickConnectState.getValue() instanceof AbstractC17844c.Disconnected) {
                AbstractC17844c value = quickConnectState.getValue();
                Intrinsics.h(value, "null cannot be cast to non-null type com.adobe.marketing.mobile.assurance.internal.ui.common.ConnectionState.Disconnected");
                AbstractC17844c.Disconnected disconnected = (AbstractC17844c.Disconnected) value;
                if (disconnected.getError() != null) {
                    f.a(disconnected.getError(), composerStartRestartGroup, 0);
                }
            }
            composerStartRestartGroup.U();
            D5.a.a(quickConnectState.getValue(), onAction, composerStartRestartGroup, i13 & 112);
            C14890K.a(InterfaceC14902f.b(c14903g, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            C13590y.a(C16335d.c(C17350a.f163699c, composerStartRestartGroup, 0), "Adobe Logo", F1.a(D.m(J.h(J.i(companion2, H1.h.p(20)), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, aVar.b().b().getXSmall(), 7, null), "adobeLogo"), null, companion5.f(), 0.0f, null, composerStartRestartGroup, 25016, 104);
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
        t0L.a(new a(quickConnectState, onAction, i10));
    }
}
