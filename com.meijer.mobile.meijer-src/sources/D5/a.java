package D5;

import D5.c;
import D5.g;
import H1.t;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import d0.BorderStroke;
import d0.C13575i;
import j0.C14889J;
import kotlin.C18045v;
import kotlin.C18049x;
import kotlin.InterfaceC18043u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16806i;
import r0.RoundedCornerShape;
import w5.AbstractC17844c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw5/c;", "quickConnectState", "Lkotlin/Function1;", "LD5/g;", "", "onAction", "a", "(Lw5/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: D5.a$a, reason: collision with other inner class name */
    static final class C0108a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f5923f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0108a(Function1<? super g, Unit> function1) {
            super(0);
            this.f5923f = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5923f.invoke(g.a.f5948a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D5.c f5924f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f5925g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(D5.c cVar, Function1<? super g, Unit> function1) {
            super(0);
            this.f5924f = cVar;
            this.f5925g = function1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5925g.invoke(this.f5924f instanceof c.b ? g.b.f5949a : g.c.f5950a);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC17844c f5926f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f5927g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5928h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractC17844c abstractC17844c, Function1<? super g, Unit> function1, int i10) {
            super(2);
            this.f5926f = abstractC17844c;
            this.f5927g = function1;
            this.f5928h = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f5926f, this.f5927g, composer, J0.a(this.f5928h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(AbstractC17844c quickConnectState, Function1<? super g, Unit> onAction, Composer composer, int i10) {
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
            F5.a aVar = F5.a.f9034a;
            Modifier modifierJ = D.j(modifierH, aVar.b().b().getSmall(), aVar.b().b().getMedium());
            C5800d.f fVarF = C5800d.f48779a.f();
            e.c cVarI = P0.e.INSTANCE.i();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarF, cVarI, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierJ);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, dVar, companion2.c());
            D1.c(composerA, tVar, companion2.d());
            D1.c(composerA, q12, companion2.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14889J c14889j = C14889J.f139620a;
            Modifier modifierA = F1.a(J.a(companion, H1.h.p(aVar.b().a().getWidth().getMedium()), H1.h.p(aVar.b().a().getHeight().getMedium())), "cancelButton");
            float fP = H1.h.p(2);
            C5489q0.Companion companion3 = C5489q0.INSTANCE;
            BorderStroke borderStrokeA = C13575i.a(fP, companion3.k());
            RoundedCornerShape roundedCornerShapeC = C16806i.c(H1.h.p(20));
            InterfaceC18043u interfaceC18043uH = C18045v.f169801a.h(companion3.i(), companion3.k(), 0L, composerStartRestartGroup, (C18045v.f169812l << 9) | 54, 4);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onAction);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new C0108a(onAction);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            C18049x.c((Function0) objB, modifierA, false, null, null, roundedCornerShapeC, borderStrokeA, interfaceC18043uH, null, d.f5937a.a(), composerStartRestartGroup, 806879232, 284);
            D5.c cVarA = D5.c.INSTANCE.a(quickConnectState);
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
