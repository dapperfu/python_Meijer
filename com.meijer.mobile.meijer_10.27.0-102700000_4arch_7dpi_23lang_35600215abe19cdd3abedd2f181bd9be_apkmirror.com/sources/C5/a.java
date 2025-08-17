package C5;

import C5.c;
import C5.g;
import H1.t;
import P0.e;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import d0.BorderStroke;
import d0.C13442i;
import j0.C14801J;
import kotlin.C17979v;
import kotlin.C17983x;
import kotlin.InterfaceC17977u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r0.RoundedCornerShape;
import v5.AbstractC17511c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv5/c;", "quickConnectState", "Lkotlin/Function1;", "LC5/g;", "", "onAction", "a", "(Lv5/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: C5.a$a, reason: collision with other inner class name */
    static final class C0062a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f3624f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0062a(Function1<? super g, Unit> function1) {
            super(0);
            this.f3624f = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3624f.invoke(g.a.f3649a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5.c f3625f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f3626g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C5.c cVar, Function1<? super g, Unit> function1) {
            super(0);
            this.f3625f = cVar;
            this.f3626g = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3626g.invoke(this.f3625f instanceof c.b ? g.b.f3650a : g.c.f3651a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC17511c f3627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f3628g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3629h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractC17511c abstractC17511c, Function1<? super g, Unit> function1, int i10) {
            super(2);
            this.f3627f = abstractC17511c;
            this.f3628g = function1;
            this.f3629h = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f3627f, this.f3628g, composer, J0.a(this.f3629h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(AbstractC17511c quickConnectState, Function1<? super g, Unit> onAction, Composer composer, int i10) {
        int i11;
        Intrinsics.j(quickConnectState, "quickConnectState");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(284006471);
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
                ComposerKt.U(284006471, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.ActionButtonRow (ActionButtonRow.kt:43)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            E5.a aVar = E5.a.f7617a;
            Modifier modifierJ = D.j(modifierH, aVar.b().b().getSmall(), aVar.b().b().getMedium());
            C5658d.f fVarF = C5658d.f48555a.f();
            e.c cVarI = P0.e.INSTANCE.i();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarF, cVarI, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierJ);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, dVar, companion2.c());
            D1.c(composerA, tVar, companion2.d());
            D1.c(composerA, q12, companion2.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierA = F1.a(J.a(companion, H1.h.p(aVar.b().a().getWidth().getMedium()), H1.h.p(aVar.b().a().getHeight().getMedium())), "cancelButton");
            float fP = H1.h.p(2);
            C5346q0.Companion companion3 = C5346q0.INSTANCE;
            BorderStroke borderStrokeA = C13442i.a(fP, companion3.k());
            RoundedCornerShape roundedCornerShapeC = C16692i.c(H1.h.p(20));
            InterfaceC17977u interfaceC17977uH = C17979v.f168713a.h(companion3.i(), companion3.k(), 0L, composerStartRestartGroup, (C17979v.f168724l << 9) | 54, 4);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onAction);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0062a(onAction);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            C17983x.c((Function0) objB, modifierA, false, null, null, roundedCornerShapeC, borderStrokeA, interfaceC17977uH, null, d.f3638a.a(), composerStartRestartGroup, 806879232, 284);
            C5.c cVarA = C5.c.INSTANCE.a(quickConnectState);
            Modifier modifierA2 = J.a(companion, H1.h.p(aVar.b().a().getWidth().getMedium()), H1.h.p(aVar.b().a().getHeight().getMedium()));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zV2 = composerStartRestartGroup.V(cVarA) | composerStartRestartGroup.V(onAction);
            Object objB2 = composerStartRestartGroup.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(cVarA, onAction);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            e.a(modifierA2, cVarA, (Function0) objB2, composerStartRestartGroup, 0, 0);
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
        t0L.a(new c(quickConnectState, onAction, i10));
    }
}
