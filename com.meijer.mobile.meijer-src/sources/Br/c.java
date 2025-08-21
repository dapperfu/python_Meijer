package Br;

import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
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
import l0.C15429A;
import l0.C15430B;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LBr/j;", "f", "(Landroidx/compose/runtime/Composer;I)LBr/j;", "LH1/h;", "width", "Lkotlin/Function1;", "Ll0/A;", "", "context", "c", "(FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.ComposePagerSnapHelperKt$ComposePagerSnapHelper$connection$1$1$1", f = "ComposePagerSnapHelper.kt", l = {166}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f3641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f3642b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C15429A f3643c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3644d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, C15429A c15429a, int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3642b = jVar;
            this.f3643c = c15429a;
            this.f3644d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3642b, this.f3643c, this.f3644d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f3641a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                j jVar = this.f3642b;
                C15429A c15429a = this.f3643c;
                int i11 = this.f3644d;
                this.f3641a = 1;
                if (jVar.d(c15429a, i11, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final void c(final float f10, final Function3<? super C15429A, ? super Composer, ? super Integer, Unit> context, Composer composer, final int i10) {
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
            final C15429A c15429aB = C15430B.b(0, 0, composerStartRestartGroup, 0, 3);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f143553a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            final int iE0 = ((H1.d) composerStartRestartGroup.o(C6034t0.g())).E0(f10);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zV = composerStartRestartGroup.V(jVarF) | composerStartRestartGroup.V(c15429aB);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new i(jVarF, c15429aB, new Function0() { // from class: Br.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.d(jVarF, iE0, interfaceC15783O, c15429aB);
                    }
                });
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Modifier modifierB = androidx.compose.ui.input.nestedscroll.a.b(Modifier.INSTANCE, (i) objB2, null, 2, null);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            context.invoke(c15429aB, composerStartRestartGroup, Integer.valueOf(i11 & 112));
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(j jVar, int i10, InterfaceC15783O interfaceC15783O, C15429A c15429a) {
        int iA = jVar.getFirstVisibleItemIndex().a();
        if (Math.abs(jVar.getOffsetInfo().a()) > i10 / 2) {
            iA++;
        }
        C15809k.d(interfaceC15783O, null, null, new a(jVar, c15429a, iA, null), 3, null);
        return Unit.f143329a;
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
