package Br;

import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15340B;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LBr/j;", "f", "(Landroidx/compose/runtime/Composer;I)LBr/j;", "LH1/h;", "width", "Lkotlin/Function1;", "Ll0/A;", "", "context", "c", "(FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.ComposePagerSnapHelperKt$ComposePagerSnapHelper$connection$1$1$1", f = "ComposePagerSnapHelper.kt", l = {166}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f3235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f3236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15339A f3237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, C15339A c15339a, int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3236b = jVar;
            this.f3237c = c15339a;
            this.f3238d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3236b, this.f3237c, this.f3238d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f3235a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                j jVar = this.f3236b;
                C15339A c15339a = this.f3237c;
                int i11 = this.f3238d;
                this.f3235a = 1;
                if (jVar.d(c15339a, i11, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final void c(final float f10, final Function3<? super C15339A, ? super Composer, ? super Integer, Unit> context, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(context, "context");
        Composer composerStartRestartGroup = composer.startRestartGroup(32185684);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.b(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(context) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(32185684, i11, -1, "com.meijer.mobile.ui.common.compose.ComposePagerSnapHelper (ComposePagerSnapHelper.kt:142)");
            }
            final j jVarF = f(composerStartRestartGroup, 0);
            final C15339A c15339aB = C15340B.b(0, 0, composerStartRestartGroup, 0, 3);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            final int iE0 = ((H1.d) composerStartRestartGroup.o(C5892t0.g())).E0(f10);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(jVarF) | composerStartRestartGroup.V(c15339aB);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new i(jVarF, c15339aB, new Function0() { // from class: Br.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.d(jVarF, iE0, interfaceC16622O, c15339aB);
                    }
                });
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Modifier modifierB = androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, (i) objB2, null, 2, null);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            context.invoke(c15339aB, composerStartRestartGroup, Integer.valueOf(i11 & 112));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Br.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.e(f10, context, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(float f10, Function3 function3, int i10, Composer composer, int i11) {
        c(f10, function3, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(j jVar, int i10, InterfaceC16622O interfaceC16622O, C15339A c15339a) {
        int iA = jVar.getFirstVisibleItemIndex().a();
        if (Math.abs(jVar.getOffsetInfo().a()) > i10 / 2) {
            iA++;
        }
        C16648k.d(interfaceC16622O, null, null, new a(jVar, c15339a, iA, null), 3, null);
        return Unit.f142422a;
    }

    public static final j f(Composer composer, int i10) {
        composer.startReplaceGroup(-100542304);
        if (ComposerKt.M()) {
            ComposerKt.U(-100542304, i10, -1, "com.meijer.mobile.ui.common.compose.rememberPagerSnapState (ComposePagerSnapHelper.kt:50)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new j();
            composer.t(objB);
        }
        j jVar = (j) objB;
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return jVar;
    }
}
