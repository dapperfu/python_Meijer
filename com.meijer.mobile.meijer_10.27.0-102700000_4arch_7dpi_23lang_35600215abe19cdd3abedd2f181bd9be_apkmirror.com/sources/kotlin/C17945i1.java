package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import d0.C13432F;
import d0.EnumC13431E;
import kotlin.InterfaceC13815n;
import kotlin.InterfaceC13819r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lx0/i1;", "Lf0/r;", "Lkotlin/Function1;", "", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ld0/E;", "dragPriority", "Lkotlin/Function2;", "Lf0/n;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "g", "()Z", "h", "(Z)V", "isDragging", "c", "Lf0/n;", "dragScope", "Ld0/F;", "d", "Ld0/F;", "scrollMutex", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17945i1 implements InterfaceC13819r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Unit> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isDragging = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13815n dragScope = new b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13432F scrollMutex = new C13432F();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", l = {1282}, m = "invokeSuspend")
    /* renamed from: x0.i1$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167991a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC13431E f167993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13815n, Continuation<? super Unit>, Object> f167994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC13431E enumC13431E, Function2<? super InterfaceC13815n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f167993c = enumC13431E;
            this.f167994d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17945i1.this.new a(this.f167993c, this.f167994d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167991a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17945i1.this.h(true);
                C13432F c13432f = C17945i1.this.scrollMutex;
                InterfaceC13815n interfaceC13815n = C17945i1.this.dragScope;
                EnumC13431E enumC13431E = this.f167993c;
                Function2<InterfaceC13815n, Continuation<? super Unit>, Object> function2 = this.f167994d;
                this.f167991a = 1;
                if (c13432f.f(interfaceC13815n, enumC13431E, function2, this) == objF) {
                    return objF;
                }
            }
            C17945i1.this.h(false);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x0/i1$b", "Lf0/n;", "", "pixels", "", "a", "(F)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i1$b */
    public static final class b implements InterfaceC13815n {
        b() {
        }

        @Override // kotlin.InterfaceC13815n
        public void a(float pixels) {
            C17945i1.this.f().invoke(Float.valueOf(pixels));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean z10) {
        this.isDragging.setValue(Boolean.valueOf(z10));
    }

    @Override // kotlin.InterfaceC13819r
    public Object a(EnumC13431E enumC13431E, Function2<? super InterfaceC13815n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(enumC13431E, function2, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final Function1<Float, Unit> f() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17945i1(Function1<? super Float, Unit> function1) {
        this.onDelta = function1;
    }
}
