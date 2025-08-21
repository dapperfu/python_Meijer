package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import d0.C13565F;
import d0.EnumC13564E;
import kotlin.InterfaceC13925n;
import kotlin.InterfaceC13929r;
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
import mv.C15784P;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lx0/i1;", "Lf0/r;", "Lkotlin/Function1;", "", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ld0/E;", "dragPriority", "Lkotlin/Function2;", "Lf0/n;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "g", "()Z", "h", "(Z)V", "isDragging", "c", "Lf0/n;", "dragScope", "Ld0/F;", "d", "Ld0/F;", "scrollMutex", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18011i1 implements InterfaceC13929r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Unit> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 isDragging = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13925n dragScope = new b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13565F scrollMutex = new C13565F();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", l = {1282}, m = "invokeSuspend")
    /* renamed from: x0.i1$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169079a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC13564E f169081c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13925n, Continuation<? super Unit>, Object> f169082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC13564E enumC13564E, Function2<? super InterfaceC13925n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f169081c = enumC13564E;
            this.f169082d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18011i1.this.new a(this.f169081c, this.f169082d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169079a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18011i1.this.h(true);
                C13565F c13565f = C18011i1.this.scrollMutex;
                InterfaceC13925n interfaceC13925n = C18011i1.this.dragScope;
                EnumC13564E enumC13564E = this.f169081c;
                Function2<InterfaceC13925n, Continuation<? super Unit>, Object> function2 = this.f169082d;
                this.f169079a = 1;
                if (c13565f.f(interfaceC13925n, enumC13564E, function2, this) == objF) {
                    return objF;
                }
            }
            C18011i1.this.h(false);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x0/i1$b", "Lf0/n;", "", "pixels", "", "a", "(F)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.i1$b */
    public static final class b implements InterfaceC13925n {
        b() {
        }

        @Override // kotlin.InterfaceC13925n
        public void a(float pixels) {
            C18011i1.this.f().invoke(Float.valueOf(pixels));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean z10) {
        this.isDragging.setValue(Boolean.valueOf(z10));
    }

    @Override // kotlin.InterfaceC13929r
    public Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13925n, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(enumC13564E, function2, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final Function1<Float, Unit> f() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18011i1(Function1<? super Float, Unit> function1) {
        this.onDelta = function1;
    }
}
