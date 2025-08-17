package kotlin;

import H1.y;
import H1.z;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aÍ\u0001\u0010\u001f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2>\b\u0002\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2>\b\u0002\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001e\u0010$\u001a\u00020\u0001*\u00020#2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010\"\u001a\u0016\u0010%\u001a\u00020#*\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"J\u0010(\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'\"J\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Lf0/r;", "a", "(Lkotlin/jvm/functions/Function1;)Lf0/r;", "i", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lf0/r;", "Landroidx/compose/ui/Modifier;", "state", "Lf0/z;", "orientation", "", "enabled", "Lh0/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lqv/O;", "LU0/f;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "g", "(Landroidx/compose/ui/Modifier;Lf0/r;Lf0/z;ZLh0/l;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "j", "(JLf0/z;)F", "LH1/y;", "k", "l", "(J)J", "Lkotlin/jvm/functions/Function3;", "NoOpOnDragStarted", "b", "NoOpOnDragStopped", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.q, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13818q {

    /* renamed from: a, reason: collision with root package name */
    private static final Function3<InterfaceC16622O, U0.f, Continuation<? super Unit>, Object> f130496a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> f130497b = new b(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "LU0/f;", "it", "", "<anonymous>", "(Lqv/O;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.q$a */
    static final class a extends SuspendLambda implements Function3<InterfaceC16622O, U0.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130498a;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object d(InterfaceC16622O interfaceC16622O, long j10, Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, U0.f fVar, Continuation<? super Unit> continuation) {
            return d(interfaceC16622O, fVar.getPackedValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130498a == 0) {
                ResultKt.b(obj);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "", "it", "", "<anonymous>", "(Lqv/O;F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.q$b */
    static final class b extends SuspendLambda implements Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130499a;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object d(InterfaceC16622O interfaceC16622O, float f10, Continuation<? super Unit> continuation) {
            return new b(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Float f10, Continuation<? super Unit> continuation) {
            return d(interfaceC16622O, f10.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130499a == 0) {
                ResultKt.b(obj);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.q$c */
    static final class c extends Lambda implements Function1<Float, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f130500f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(z1<? extends Function1<? super Float, Unit>> z1Var) {
            super(1);
            this.f130500f = z1Var;
        }

        public final void b(float f10) {
            this.f130500f.getValue().invoke(Float.valueOf(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
            b(f10.floatValue());
            return Unit.f142422a;
        }
    }

    public static final InterfaceC13819r a(Function1<? super Float, Unit> function1) {
        return new C13811j(function1);
    }

    public static final Modifier g(Modifier modifier, InterfaceC13819r interfaceC13819r, EnumC13827z enumC13827z, boolean z10, h0.l lVar, boolean z11, Function3<? super InterfaceC16622O, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super InterfaceC16622O, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z12) {
        return modifier.then(new DraggableElement(interfaceC13819r, enumC13827z, z10, lVar, z11, function3, function32, z12));
    }

    public static /* synthetic */ Modifier h(Modifier modifier, InterfaceC13819r interfaceC13819r, EnumC13827z enumC13827z, boolean z10, h0.l lVar, boolean z11, Function3 function3, Function3 function32, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return g(modifier, interfaceC13819r, enumC13827z, z13, lVar, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? f130496a : function3, (i10 & 64) != 0 ? f130497b : function32, (i10 & 128) != 0 ? false : z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(long j10, EnumC13827z enumC13827z) {
        return Float.intBitsToFloat((int) (enumC13827z == EnumC13827z.f130585a ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(long j10, EnumC13827z enumC13827z) {
        return enumC13827z == EnumC13827z.f130585a ? y.i(j10) : y.h(j10);
    }

    public static final InterfaceC13819r i(Function1<? super Float, Unit> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
        }
        z1 z1VarP = o1.p(function1, composer, i10 & 14);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = a(new c(z1VarP));
            composer.t(objB);
        }
        InterfaceC13819r interfaceC13819r = (InterfaceC13819r) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC13819r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        float fH;
        float fI = 0.0f;
        if (Float.isNaN(y.h(j10))) {
            fH = 0.0f;
        } else {
            fH = y.h(j10);
        }
        if (!Float.isNaN(y.i(j10))) {
            fI = y.i(j10);
        }
        return z.a(fH, fI);
    }
}
