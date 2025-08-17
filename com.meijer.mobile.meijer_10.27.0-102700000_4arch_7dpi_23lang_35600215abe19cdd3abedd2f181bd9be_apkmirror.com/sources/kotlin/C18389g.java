package kotlin;

import H1.t;
import H1.w;
import V0.C5346q0;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5659e;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import j0.C14801J;
import j0.InterfaceC14800I;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.C18112F;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import y5.AbstractC18162a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "contents", "Lkotlin/Function1;", "Ly5/a;", "", "onClick", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: z5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18389g {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.g$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f171587f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f171587f = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(789330040, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.NumberRow.<anonymous>.<anonymous>.<anonymous> (NumberRow.kt:43)");
            }
            long jK = C5346q0.INSTANCE.k();
            long jI = w.i(28);
            C18112F c18112fD = AbstractC18142l.INSTANCE.d();
            N1.b(this.f171587f, F1.a(Modifier.INSTANCE, "dialPadNumericButton"), jK, jI, null, null, c18112fD, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 3504, 0, 130992);
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

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.g$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f171588f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f171589g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super AbstractC18162a, Unit> function1, String str) {
            super(0);
            this.f171588f = function1;
            this.f171589g = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f171588f.invoke(new AbstractC18162a.Number(this.f171589g));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.g$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f171590f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC18162a, Unit> f171591g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f171592h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<String> list, Function1<? super AbstractC18162a, Unit> function1, int i10) {
            super(2);
            this.f171590f = list;
            this.f171591g = function1;
            this.f171592h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18389g.a(this.f171590f, this.f171591g, composer, J0.a(this.f171592h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(List<String> contents, Function1<? super AbstractC18162a, Unit> onClick, Composer composer, int i10) {
        Intrinsics.j(contents, "contents");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1662531165);
        if (ComposerKt.M()) {
            ComposerKt.U(-1662531165, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.dialpad.NumberRow (NumberRow.kt:34)");
        }
        Modifier modifierA = F1.a(J.h(Modifier.INSTANCE, 0.0f, 1, null), "dialPadRow");
        C5658d.f fVarO = C5658d.f48555a.o(E5.a.f7617a.b().c().getSmall());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyB = G.b(fVarO, P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
        t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
        Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
        Function0<InterfaceC5811g> function0A = companion.a();
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
        D1.c(composerA, measurePolicyB, companion.e());
        D1.c(composerA, dVar, companion.c());
        D1.c(composerA, tVar, companion.d());
        D1.c(composerA, q12, companion.h());
        composerStartRestartGroup.c();
        function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        C14801J c14801j = C14801J.f139030a;
        composerStartRestartGroup.startReplaceableGroup(1696320498);
        for (String str : contents) {
            long jK = C5346q0.INSTANCE.k();
            Modifier modifierB = InterfaceC14800I.b(c14801j, C5659e.b(Modifier.INSTANCE, 1.0f, false, 2, null), 1.0f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 789330040, true, new a(str));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zV = composerStartRestartGroup.V(onClick) | composerStartRestartGroup.V(str);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(onClick, str);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            C18386d.a(modifierB, composableLambda, jK, (Function0) objB, composerStartRestartGroup, 432, 0);
        }
        composerStartRestartGroup.U();
        composerStartRestartGroup.U();
        composerStartRestartGroup.v();
        composerStartRestartGroup.U();
        composerStartRestartGroup.U();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new c(contents, onClick, i10));
    }
}
