package androidx.compose.material;

import H1.r;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import h0.l;
import kotlin.C13928q;
import kotlin.C17989b0;
import kotlin.C17997e;
import kotlin.EnumC13937z;
import kotlin.InterfaceC17986a0;
import kotlin.InterfaceC17994d;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000|\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001fH\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001ay\u0010/\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2H\u0010.\u001aD\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000-0\u001fH\u0001¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"", "T", "Lkotlin/Function1;", "Lx0/b0;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lx0/a0;", "a", "(Lkotlin/jvm/functions/Function1;)Lx0/a0;", "Landroidx/compose/ui/Modifier;", "Lx0/e;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "startDragImmediately", "d", "(Landroidx/compose/ui/Modifier;Lx0/e;Lf0/z;ZZLh0/l;Z)Landroidx/compose/ui/Modifier;", "targetValue", "", "velocity", "f", "(Lx0/e;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "j", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/c;", "i", "()Landroidx/compose/material/c;", "LH1/r;", "Lkotlin/ParameterName;", "name", "size", "LH1/b;", "constraints", "Lkotlin/Pair;", "anchors", "h", "(Landroidx/compose/ui/Modifier;Lx0/e;Lf0/z;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmv/O;", "", "velocity", "", "<anonymous>", "(Lmv/O;F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    static final class C1045a extends SuspendLambda implements Function3<InterfaceC15783O, Float, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50038a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50039b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f50040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17997e<T> f50041d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {179}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.a$a$a, reason: collision with other inner class name */
        static final class C1046a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f50042a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17997e<T> f50043b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f50044c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1046a(this.f50043b, this.f50044c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1046a(C17997e<T> c17997e, float f10, Continuation<? super C1046a> continuation) {
                super(2, continuation);
                this.f50043b = c17997e;
                this.f50044c = f10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1046a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f50042a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17997e<T> c17997e = this.f50043b;
                    float f10 = this.f50044c;
                    this.f50042a = 1;
                    if (c17997e.G(f10, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Float f10, Continuation<? super Unit> continuation) {
            return d(interfaceC15783O, f10.floatValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1045a(C17997e<T> c17997e, Continuation<? super C1045a> continuation) {
            super(3, continuation);
            this.f50041d = c17997e;
        }

        public final Object d(InterfaceC15783O interfaceC15783O, float f10, Continuation<? super Unit> continuation) {
            C1045a c1045a = new C1045a(this.f50041d, continuation);
            c1045a.f50039b = interfaceC15783O;
            c1045a.f50040c = f10;
            return c1045a.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f50038a == 0) {
                ResultKt.b(obj);
                C15809k.d((InterfaceC15783O) this.f50039b, null, null, new C1046a(this.f50041d, this.f50040c, null), 3, null);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Lx0/d;", "Lx0/a0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {693}, m = "invokeSuspend")
    static final class b<T> extends SuspendLambda implements Function4<InterfaceC17994d, InterfaceC17986a0<T>, T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50045a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50046b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f50047c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f50048d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17997e<T> f50049e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f50050f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.a$b$a, reason: collision with other inner class name */
        static final class C1047a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC17994d f50051f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f50052g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1047a(InterfaceC17994d interfaceC17994d, Ref.FloatRef floatRef) {
                super(2);
                this.f50051f = interfaceC17994d;
                this.f50052g = floatRef;
            }

            public final void a(float f10, float f11) {
                this.f50051f.a(f10, f11);
                this.f50052g.f143739a = f10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17997e<T> c17997e, float f10, Continuation<? super b> continuation) {
            super(4, continuation);
            this.f50049e = c17997e;
            this.f50050f = f10;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17994d interfaceC17994d, InterfaceC17986a0<T> interfaceC17986a0, T t10, Continuation<? super Unit> continuation) {
            b bVar = new b(this.f50049e, this.f50050f, continuation);
            bVar.f50046b = interfaceC17994d;
            bVar.f50047c = interfaceC17986a0;
            bVar.f50048d = t10;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float fW;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f50045a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17994d interfaceC17994d = (InterfaceC17994d) this.f50046b;
                float fC = ((InterfaceC17986a0) this.f50047c).c(this.f50048d);
                if (!Float.isNaN(fC)) {
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    if (Float.isNaN(this.f50049e.w())) {
                        fW = 0.0f;
                    } else {
                        fW = this.f50049e.w();
                    }
                    float f10 = fW;
                    floatRef.f143739a = f10;
                    float f11 = this.f50050f;
                    InterfaceC6452i<Float> interfaceC6452iP = this.f50049e.p();
                    C1047a c1047a = new C1047a(interfaceC17994d, floatRef);
                    this.f50046b = null;
                    this.f50047c = null;
                    this.f50045a = 1;
                    if (i0.b(f10, fC, f11, interfaceC6452iP, c1047a, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {720}, m = "restartable")
    static final class c<I> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f50053a;

        /* renamed from: b, reason: collision with root package name */
        int f50054b;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50053a = obj;
            this.f50054b |= Integer.MIN_VALUE;
            return a.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50055a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f50057c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f50058d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.material.a$d$a, reason: collision with other inner class name */
        static final class C1048a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C0> f50059a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f50060b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f50061c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {729}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.a$d$a$a, reason: collision with other inner class name */
            static final class C1049a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f50062a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f50063b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f50064c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f50065d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1049a(this.f50063b, this.f50064c, this.f50065d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1049a(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i10, InterfaceC15783O interfaceC15783O, Continuation<? super C1049a> continuation) {
                    super(2, continuation);
                    this.f50063b = function2;
                    this.f50064c = i10;
                    this.f50065d = interfaceC15783O;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1049a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f50062a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.f50063b;
                        I i11 = this.f50064c;
                        this.f50062a = 1;
                        if (function2.invoke(i11, this) == objF) {
                            return objF;
                        }
                    }
                    C15784P.d(this.f50065d, new AnchoredDragFinishedSignal());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {725}, m = "emit")
            /* renamed from: androidx.compose.material.a$d$a$b */
            static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f50066a;

                /* renamed from: b, reason: collision with root package name */
                Object f50067b;

                /* renamed from: c, reason: collision with root package name */
                Object f50068c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f50069d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C1048a<T> f50070e;

                /* renamed from: f, reason: collision with root package name */
                int f50071f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C1048a<? super T> c1048a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f50070e = c1048a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f50069d = obj;
                    this.f50071f |= Integer.MIN_VALUE;
                    return this.f50070e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1048a(Ref.ObjectRef<C0> objectRef, InterfaceC15783O interfaceC15783O, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.f50059a = objectRef;
                this.f50060b = interfaceC15783O;
                this.f50061c = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material.a.d.C1048a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material.a$d$a$b r0 = (androidx.compose.material.a.d.C1048a.b) r0
                    int r1 = r0.f50071f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50071f = r1
                    goto L18
                L13:
                    androidx.compose.material.a$d$a$b r0 = new androidx.compose.material.a$d$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f50069d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f50071f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f50068c
                    mv.C0 r8 = (mv.C0) r8
                    java.lang.Object r8 = r0.f50067b
                    java.lang.Object r0 = r0.f50066a
                    androidx.compose.material.a$d$a r0 = (androidx.compose.material.a.d.C1048a) r0
                    kotlin.ResultKt.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r7.f50059a
                    T r9 = r9.f143742a
                    mv.C0 r9 = (mv.C0) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.d(r2)
                    r0.f50066a = r7
                    r0.f50067b = r8
                    r0.f50068c = r9
                    r0.f50071f = r3
                    java.lang.Object r9 = r9.o0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r0.f50059a
                    mv.O r1 = r0.f50060b
                    mv.Q r3 = mv.EnumC15785Q.f151688d
                    androidx.compose.material.a$d$a$a r4 = new androidx.compose.material.a$d$a$a
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.f50061c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    mv.C0 r8 = mv.C15805i.d(r1, r2, r3, r4, r5, r6)
                    r9.f143742a = r8
                    kotlin.Unit r8 = kotlin.Unit.f143329a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.d.C1048a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f50057c = function0;
            this.f50058d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f50057c, this.f50058d, continuation);
            dVar.f50056b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f50055a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f50056b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                InterfaceC16561f interfaceC16561fQ = o1.q(this.f50057c);
                C1048a c1048a = new C1048a(objectRef, interfaceC15783O, this.f50058d);
                this.f50055a = 1;
                if (interfaceC16561fQ.collect(c1048a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final <T> InterfaceC17986a0<T> a(Function1<? super C17989b0<T>, Unit> function1) {
        C17989b0 c17989b0 = new C17989b0();
        function1.invoke(c17989b0);
        return new MapDraggableAnchors(c17989b0.b());
    }

    public static /* synthetic */ Modifier e(Modifier modifier, C17997e c17997e, EnumC13937z enumC13937z, boolean z10, boolean z11, l lVar, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if ((i10 & 32) != 0) {
            z12 = c17997e.y();
        }
        return d(modifier, c17997e, enumC13937z, z13, z14, lVar2, z12);
    }

    public static final <T> Object f(C17997e<T> c17997e, T t10, float f10, Continuation<? super Unit> continuation) {
        Object objK = C17997e.k(c17997e, t10, null, new b(c17997e, f10, null), continuation, 2, null);
        return objK == IntrinsicsKt.f() ? objK : Unit.f143329a;
    }

    public static /* synthetic */ Object g(C17997e c17997e, Object obj, float f10, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = c17997e.v();
        }
        return f(c17997e, obj, f10, continuation);
    }

    public static final <T> Modifier h(Modifier modifier, C17997e<T> c17997e, EnumC13937z enumC13937z, Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17986a0<T>, ? extends T>> function2) {
        return modifier.then(new DraggableAnchorsElement(c17997e, function2, enumC13937z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> i() {
        return new MapDraggableAnchors<>(MapsKt.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object j(kotlin.jvm.functions.Function0<? extends I> r4, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.a.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.a$c r0 = (androidx.compose.material.a.c) r0
            int r1 = r0.f50054b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50054b = r1
            goto L18
        L13:
            androidx.compose.material.a$c r0 = new androidx.compose.material.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50053a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f50054b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            androidx.compose.material.a$d r6 = new androidx.compose.material.a$d     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.f50054b = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = mv.C15784P.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.f143329a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.j(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Modifier d(Modifier modifier, C17997e<T> c17997e, EnumC13937z enumC13937z, boolean z10, boolean z11, l lVar, boolean z12) {
        return C13928q.h(modifier, c17997e.getDraggableState(), enumC13937z, z10, lVar, z12, null, new C1045a(c17997e, null), z11, 32, null);
    }
}
