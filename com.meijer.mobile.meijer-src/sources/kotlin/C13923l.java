package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13565F;
import d0.EnumC13564E;
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
import mv.C15784P;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010(\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010'¨\u0006)"}, d2 = {"Lf0/l;", "Lf0/H;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "f", "(F)F", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "b", "Lf0/E;", "scrollScope", "Ld0/F;", "c", "Ld0/F;", "scrollMutex", "Landroidx/compose/runtime/l0;", "", "d", "Landroidx/compose/runtime/l0;", "isScrollingState", "e", "isLastScrollForwardState", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13923l implements InterfaceC13900H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Float, Float> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13897E scrollScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13565F scrollMutex = new C13565F();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isScrollingState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLastScrollForwardState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLastScrollBackwardState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
    /* renamed from: f0.l$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f131258a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC13564E f131260c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC13897E, Continuation<? super Unit>, Object> f131261d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {HttpResponseStatus.SUCCESS_CREATED}, m = "invokeSuspend")
        /* renamed from: f0.l$a$a, reason: collision with other inner class name */
        static final class C2082a extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f131262a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f131263b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C13923l f131264c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC13897E, Continuation<? super Unit>, Object> f131265d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2082a(C13923l c13923l, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C2082a> continuation) {
                super(2, continuation);
                this.f131264c = c13923l;
                this.f131265d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2082a c2082a = new C2082a(this.f131264c, this.f131265d, continuation);
                c2082a.f131263b = obj;
                return c2082a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
                return ((C2082a) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f131262a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC13897E interfaceC13897E = (InterfaceC13897E) this.f131263b;
                        this.f131264c.isScrollingState.setValue(Boxing.a(true));
                        Function2<InterfaceC13897E, Continuation<? super Unit>, Object> function2 = this.f131265d;
                        this.f131262a = 1;
                        if (function2.invoke(interfaceC13897E, this) == objF) {
                            return objF;
                        }
                    }
                    this.f131264c.isScrollingState.setValue(Boxing.a(false));
                    return Unit.f143329a;
                } catch (Throwable th2) {
                    this.f131264c.isScrollingState.setValue(Boxing.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131260c = enumC13564E;
            this.f131261d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13923l.this.new a(this.f131260c, this.f131261d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f131258a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13565F c13565f = C13923l.this.scrollMutex;
                InterfaceC13897E interfaceC13897E = C13923l.this.scrollScope;
                EnumC13564E enumC13564E = this.f131260c;
                C2082a c2082a = new C2082a(C13923l.this, this.f131261d, null);
                this.f131258a = 1;
                if (c13565f.f(interfaceC13897E, enumC13564E, c2082a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"f0/l$b", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.l$b */
    public static final class b implements InterfaceC13897E {
        b() {
        }

        @Override // kotlin.InterfaceC13897E
        public float e(float pixels) {
            boolean z10;
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = C13923l.this.l().invoke(Float.valueOf(pixels)).floatValue();
            InterfaceC5872l0 interfaceC5872l0 = C13923l.this.isLastScrollForwardState;
            boolean z11 = false;
            if (fFloatValue > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
            InterfaceC5872l0 interfaceC5872l02 = C13923l.this.isLastScrollBackwardState;
            if (fFloatValue < 0.0f) {
                z11 = true;
            }
            interfaceC5872l02.setValue(Boolean.valueOf(z11));
            return fFloatValue;
        }
    }

    @Override // kotlin.InterfaceC13900H
    public Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(enumC13564E, function2, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    @Override // kotlin.InterfaceC13900H
    public boolean b() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // kotlin.InterfaceC13900H
    public float f(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    public final Function1<Float, Float> l() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13923l(Function1<? super Float, Float> function1) {
        this.onDelta = function1;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = t1.e(bool, null, 2, null);
        this.isLastScrollForwardState = t1.e(bool, null, 2, null);
        this.isLastScrollBackwardState = t1.e(bool, null, 2, null);
    }
}
