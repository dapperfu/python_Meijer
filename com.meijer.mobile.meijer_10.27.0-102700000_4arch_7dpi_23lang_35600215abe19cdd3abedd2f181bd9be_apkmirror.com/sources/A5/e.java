package A5;

import H1.t;
import P0.e;
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
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import j0.C14815g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.C17509a;
import y5.AbstractC18162a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a:\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "assuranceConnectionError", "Lkotlin/Function1;", "Ly5/a;", "Lkotlin/ParameterName;", "name", "action", "", "onAction", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function1<AbstractC18162a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f118f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super AbstractC18162a, Unit> function1) {
            super(1);
            this.f118f = function1;
        }

        public final void a(AbstractC18162a action) {
            Intrinsics.j(action, "action");
            this.f118f.invoke(action);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC18162a abstractC18162a) {
            a(abstractC18162a);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6425g f119f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f120g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f121h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC6425g enumC6425g, Function1<? super AbstractC18162a, Unit> function1, int i10) {
            super(2);
            this.f119f = enumC6425g;
            this.f120g = function1;
            this.f121h = i10;
        }

        public final void a(Composer composer, int i10) {
            e.a(this.f119f, this.f120g, composer, J0.a(this.f121h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(EnumC6425g assuranceConnectionError, Function1<? super AbstractC18162a, Unit> onAction, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(assuranceConnectionError, "assuranceConnectionError");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-394119839);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(assuranceConnectionError) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-394119839, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.error.PinErrorView (PinErrorView.kt:39)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            E5.a aVar = E5.a.f7617a;
            Modifier modifierA = F1.a(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), "pinErrorView");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyI = C5662h.i(companion2.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyI, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5664j c5664j = C5664j.f48612a;
            Modifier modifierK = D.k(J.f(companion, 0.0f, 1, null), aVar.b().b().getXLarge(), 0.0f, 2, null);
            C5658d.f fVarO = C5658d.f48555a.o(aVar.b().c().getMedium());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, companion2.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C2 = A.c(modifierK);
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
            d.a(assuranceConnectionError.e(), composerStartRestartGroup, 0);
            c.a(assuranceConnectionError.b(), composerStartRestartGroup, 0);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            Modifier modifierA2 = F1.a(D.m(c5664j.g(J.h(companion, 0.0f, 1, null), companion2.d()), aVar.b().b().getXxLarge(), 0.0f, aVar.b().b().getXxLarge(), aVar.b().b().getMedium(), 2, null), "pinErrorActionButtonRow");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onAction);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(onAction);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            composer2 = composerStartRestartGroup;
            A5.a.a(modifierA2, assuranceConnectionError, (Function1) objB, composer2, (i11 << 3) & 112, 0);
            composer2.U();
            composer2.v();
            composer2.U();
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new b(assuranceConnectionError, onAction, i10));
    }
}
