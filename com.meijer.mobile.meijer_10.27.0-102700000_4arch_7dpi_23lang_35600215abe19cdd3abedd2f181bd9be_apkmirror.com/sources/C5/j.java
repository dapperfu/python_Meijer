package C5;

import H1.t;
import P0.e;
import android.content.res.Configuration;
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
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import d0.C13457y;
import d0.T;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import t5.C17064a;
import v5.AbstractC17511c;
import v5.C17509a;
import v5.C17510b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/z1;", "Lv5/c;", "quickConnectState", "Lkotlin/Function1;", "LC5/g;", "", "onAction", "a", "(Landroidx/compose/runtime/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<AbstractC17511c> f3660f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f3661g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1<? extends AbstractC17511c> z1Var, Function1<? super g, Unit> function1, int i10) {
            super(2);
            this.f3660f = z1Var;
            this.f3661g = function1;
            this.f3662h = i10;
        }

        public final void a(Composer composer, int i10) {
            j.a(this.f3660f, this.f3661g, composer, J0.a(this.f3662h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(z1<? extends AbstractC17511c> quickConnectState, Function1<? super g, Unit> onAction, Composer composer, int i10) {
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
            E5.a aVar = E5.a.f7617a;
            Modifier modifierA = F1.a(D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getLarge(), 0.0f, 2, null), "quickConnectView");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyI = C5662h.i(companion3.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
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
            D1.c(composerA, measurePolicyI, companion4.e());
            D1.c(composerA, dVar, companion4.c());
            D1.c(composerA, tVar, companion4.d());
            D1.c(composerA, q12, companion4.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5664j c5664j = C5664j.f48612a;
            Modifier modifierA2 = F1.a(T.g(J.f(companion2, 0.0f, 1, null), T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), "quickConnectScrollView");
            C5658d.f fVarO = C5658d.f48555a.o(aVar.b().c().getMedium());
            e.b bVarG = companion3.g();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, bVarG, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C2 = A.c(modifierA2);
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
            D1.c(composerA2, measurePolicyA, companion4.e());
            D1.c(composerA2, dVar2, companion4.c());
            D1.c(composerA2, tVar2, companion4.d());
            D1.c(composerA2, q13, companion4.h());
            composerStartRestartGroup.c();
            function3C2.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14815g c14815g = C14815g.f139108a;
            C17509a.a(composerStartRestartGroup, 0);
            C17510b.a(C16193g.c(t5.b.f161454G, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            Z0.c cVarC = C16190d.c(C17064a.f161447d, composerStartRestartGroup, 0);
            InterfaceC5784k.Companion companion5 = InterfaceC5784k.INSTANCE;
            int i13 = i11;
            C13457y.a(cVarC, "Quick Connect Flow", F1.a(J.g(D.j(companion2, aVar.b().b().getXLarge(), aVar.b().b().getMedium()), (zBooleanValue || zBooleanValue2) ? 0.3f : 1.0f), "quickConnectLogo"), null, companion5.d(), 0.0f, null, composerStartRestartGroup, 24632, 104);
            composerStartRestartGroup.startReplaceableGroup(1606358259);
            if (quickConnectState.getValue() instanceof AbstractC17511c.Disconnected) {
                AbstractC17511c value = quickConnectState.getValue();
                Intrinsics.h(value, "null cannot be cast to non-null type com.adobe.marketing.mobile.assurance.internal.ui.common.ConnectionState.Disconnected");
                AbstractC17511c.Disconnected disconnected = (AbstractC17511c.Disconnected) value;
                if (disconnected.getError() != null) {
                    f.a(disconnected.getError(), composerStartRestartGroup, 0);
                }
            }
            composerStartRestartGroup.U();
            C5.a.a(quickConnectState.getValue(), onAction, composerStartRestartGroup, i13 & 112);
            C14802K.a(InterfaceC14814f.b(c14815g, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            C13457y.a(C16190d.c(C17064a.f161446c, composerStartRestartGroup, 0), "Adobe Logo", F1.a(D.m(J.h(J.i(companion2, H1.h.p(20)), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, aVar.b().b().getXSmall(), 7, null), "adobeLogo"), null, companion5.f(), 0.0f, null, composerStartRestartGroup, 25016, 104);
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
