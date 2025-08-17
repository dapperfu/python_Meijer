package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13432F;
import d0.EnumC13431E;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010(\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010'¨\u0006)"}, d2 = {"Lf0/l;", "Lf0/H;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "f", "(F)F", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "b", "Lf0/E;", "scrollScope", "Ld0/F;", "c", "Ld0/F;", "scrollMutex", "Landroidx/compose/runtime/l0;", "", "d", "Landroidx/compose/runtime/l0;", "isScrollingState", "e", "isLastScrollForwardState", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13813l implements InterfaceC13790H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Float> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13787E scrollScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13432F scrollMutex = new C13432F();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Boolean> isScrollingState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Boolean> isLastScrollForwardState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Boolean> isLastScrollBackwardState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
    /* renamed from: f0.l$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130424a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC13431E f130426c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13787E, Continuation<? super Unit>, Object> f130427d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {HttpResponseStatus.SUCCESS_CREATED}, m = "invokeSuspend")
        /* renamed from: f0.l$a$a, reason: collision with other inner class name */
        static final class C2072a extends SuspendLambda implements Function2<InterfaceC13787E, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f130428a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f130429b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C13813l f130430c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC13787E, Continuation<? super Unit>, Object> f130431d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2072a(C13813l c13813l, Function2<? super InterfaceC13787E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C2072a> continuation) {
                super(2, continuation);
                this.f130430c = c13813l;
                this.f130431d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2072a c2072a = new C2072a(this.f130430c, this.f130431d, continuation);
                c2072a.f130429b = obj;
                return c2072a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC13787E interfaceC13787E, Continuation<? super Unit> continuation) {
                return ((C2072a) create(interfaceC13787E, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f130428a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC13787E interfaceC13787E = (InterfaceC13787E) this.f130429b;
                        this.f130430c.isScrollingState.setValue(Boxing.a(true));
                        Function2<InterfaceC13787E, Continuation<? super Unit>, Object> function2 = this.f130431d;
                        this.f130428a = 1;
                        if (function2.invoke(interfaceC13787E, this) == objF) {
                            return objF;
                        }
                    }
                    this.f130430c.isScrollingState.setValue(Boxing.a(false));
                    return Unit.f142422a;
                } catch (Throwable th2) {
                    this.f130430c.isScrollingState.setValue(Boxing.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC13431E enumC13431E, Function2<? super InterfaceC13787E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f130426c = enumC13431E;
            this.f130427d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13813l.this.new a(this.f130426c, this.f130427d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130424a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13432F c13432f = C13813l.this.scrollMutex;
                InterfaceC13787E interfaceC13787E = C13813l.this.scrollScope;
                EnumC13431E enumC13431E = this.f130426c;
                C2072a c2072a = new C2072a(C13813l.this, this.f130427d, null);
                this.f130424a = 1;
                if (c13432f.f(interfaceC13787E, enumC13431E, c2072a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"f0/l$b", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.l$b */
    public static final class b implements InterfaceC13787E {
        b() {
        }

        @Override // kotlin.InterfaceC13787E
        public float e(float pixels) {
            boolean z10;
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = C13813l.this.l().invoke(Float.valueOf(pixels)).floatValue();
            InterfaceC5730l0 interfaceC5730l0 = C13813l.this.isLastScrollForwardState;
            boolean z11 = false;
            if (fFloatValue > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
            InterfaceC5730l0 interfaceC5730l02 = C13813l.this.isLastScrollBackwardState;
            if (fFloatValue < 0.0f) {
                z11 = true;
            }
            interfaceC5730l02.setValue(Boolean.valueOf(z11));
            return fFloatValue;
        }
    }

    @Override // kotlin.InterfaceC13790H
    public Object a(EnumC13431E enumC13431E, Function2<? super InterfaceC13787E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(enumC13431E, function2, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    @Override // kotlin.InterfaceC13790H
    public boolean b() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // kotlin.InterfaceC13790H
    public float f(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    public final Function1<Float, Float> l() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13813l(Function1<? super Float, Float> function1) {
        this.onDelta = function1;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = t1.e(bool, null, 2, null);
        this.isLastScrollForwardState = t1.e(bool, null, 2, null);
        this.isLastScrollBackwardState = t1.e(bool, null, 2, null);
    }
}
