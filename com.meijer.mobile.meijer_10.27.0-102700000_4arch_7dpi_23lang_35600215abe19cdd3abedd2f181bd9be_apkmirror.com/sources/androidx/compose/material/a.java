package androidx.compose.material;

import H1.r;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import h0.l;
import kotlin.C13818q;
import kotlin.C17923b0;
import kotlin.C17931e;
import kotlin.EnumC13827z;
import kotlin.InterfaceC17920a0;
import kotlin.InterfaceC17928d;
import kotlin.InterfaceC6326i;
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
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000|\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001fH\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001ay\u0010/\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2H\u0010.\u001aD\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000-0\u001fH\u0001¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"", "T", "Lkotlin/Function1;", "Lx0/b0;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lx0/a0;", "a", "(Lkotlin/jvm/functions/Function1;)Lx0/a0;", "Landroidx/compose/ui/Modifier;", "Lx0/e;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "startDragImmediately", "d", "(Landroidx/compose/ui/Modifier;Lx0/e;Lf0/z;ZZLh0/l;Z)Landroidx/compose/ui/Modifier;", "targetValue", "", "velocity", "f", "(Lx0/e;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "j", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/c;", "i", "()Landroidx/compose/material/c;", "LH1/r;", "Lkotlin/ParameterName;", "name", "size", "LH1/b;", "constraints", "Lkotlin/Pair;", "anchors", "h", "(Landroidx/compose/ui/Modifier;Lx0/e;Lf0/z;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lqv/O;", "", "velocity", "", "<anonymous>", "(Lqv/O;F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    static final class C1032a extends SuspendLambda implements Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49814a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49815b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f49816c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f49817d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {179}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.a$a$a, reason: collision with other inner class name */
        static final class C1033a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49818a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17931e<T> f49819b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f49820c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1033a(this.f49819b, this.f49820c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1033a(C17931e<T> c17931e, float f10, Continuation<? super C1033a> continuation) {
                super(2, continuation);
                this.f49819b = c17931e;
                this.f49820c = f10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1033a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49818a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17931e<T> c17931e = this.f49819b;
                    float f10 = this.f49820c;
                    this.f49818a = 1;
                    if (c17931e.G(f10, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Float f10, Continuation<? super Unit> continuation) {
            return d(interfaceC16622O, f10.floatValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1032a(C17931e<T> c17931e, Continuation<? super C1032a> continuation) {
            super(3, continuation);
            this.f49817d = c17931e;
        }

        public final Object d(InterfaceC16622O interfaceC16622O, float f10, Continuation<? super Unit> continuation) {
            C1032a c1032a = new C1032a(this.f49817d, continuation);
            c1032a.f49815b = interfaceC16622O;
            c1032a.f49816c = f10;
            return c1032a.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f49814a == 0) {
                ResultKt.b(obj);
                C16648k.d((InterfaceC16622O) this.f49815b, null, null, new C1033a(this.f49817d, this.f49816c, null), 3, null);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Lx0/d;", "Lx0/a0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {693}, m = "invokeSuspend")
    static final class b<T> extends SuspendLambda implements Function4<InterfaceC17928d, InterfaceC17920a0<T>, T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49821a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49822b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49823c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49824d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17931e<T> f49825e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f49826f;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.a$b$a, reason: collision with other inner class name */
        static final class C1034a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC17928d f49827f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f49828g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1034a(InterfaceC17928d interfaceC17928d, Ref.FloatRef floatRef) {
                super(2);
                this.f49827f = interfaceC17928d;
                this.f49828g = floatRef;
            }

            public final void a(float f10, float f11) {
                this.f49827f.a(f10, f11);
                this.f49828g.f142832a = f10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17931e<T> c17931e, float f10, Continuation<? super b> continuation) {
            super(4, continuation);
            this.f49825e = c17931e;
            this.f49826f = f10;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17928d interfaceC17928d, InterfaceC17920a0<T> interfaceC17920a0, T t10, Continuation<? super Unit> continuation) {
            b bVar = new b(this.f49825e, this.f49826f, continuation);
            bVar.f49822b = interfaceC17928d;
            bVar.f49823c = interfaceC17920a0;
            bVar.f49824d = t10;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float fW;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49821a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17928d interfaceC17928d = (InterfaceC17928d) this.f49822b;
                float fC = ((InterfaceC17920a0) this.f49823c).c(this.f49824d);
                if (!Float.isNaN(fC)) {
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    if (Float.isNaN(this.f49825e.w())) {
                        fW = 0.0f;
                    } else {
                        fW = this.f49825e.w();
                    }
                    float f10 = fW;
                    floatRef.f142832a = f10;
                    float f11 = this.f49826f;
                    InterfaceC6326i<Float> interfaceC6326iP = this.f49825e.p();
                    C1034a c1034a = new C1034a(interfaceC17928d, floatRef);
                    this.f49822b = null;
                    this.f49823c = null;
                    this.f49821a = 1;
                    if (i0.b(f10, fC, f11, interfaceC6326iP, c1034a, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {720}, m = "restartable")
    static final class c<I> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f49829a;

        /* renamed from: b, reason: collision with root package name */
        int f49830b;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49829a = obj;
            this.f49830b |= Integer.MIN_VALUE;
            return a.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49831a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<I> f49833c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f49834d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.material.a$d$a, reason: collision with other inner class name */
        static final class C1035a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C0> f49835a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f49836b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f49837c;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {729}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.a$d$a$a, reason: collision with other inner class name */
            static final class C1036a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49838a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> f49839b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ I f49840c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f49841d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1036a(this.f49839b, this.f49840c, this.f49841d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1036a(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i10, InterfaceC16622O interfaceC16622O, Continuation<? super C1036a> continuation) {
                    super(2, continuation);
                    this.f49839b = function2;
                    this.f49840c = i10;
                    this.f49841d = interfaceC16622O;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1036a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49838a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.f49839b;
                        I i11 = this.f49840c;
                        this.f49838a = 1;
                        if (function2.invoke(i11, this) == objF) {
                            return objF;
                        }
                    }
                    C16623P.d(this.f49841d, new AnchoredDragFinishedSignal());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {725}, m = "emit")
            /* renamed from: androidx.compose.material.a$d$a$b */
            static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f49842a;

                /* renamed from: b, reason: collision with root package name */
                Object f49843b;

                /* renamed from: c, reason: collision with root package name */
                Object f49844c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49845d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C1035a<T> f49846e;

                /* renamed from: f, reason: collision with root package name */
                int f49847f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C1035a<? super T> c1035a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f49846e = c1035a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f49845d = obj;
                    this.f49847f |= Integer.MIN_VALUE;
                    return this.f49846e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1035a(Ref.ObjectRef<C0> objectRef, InterfaceC16622O interfaceC16622O, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.f49835a = objectRef;
                this.f49836b = interfaceC16622O;
                this.f49837c = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material.a.d.C1035a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material.a$d$a$b r0 = (androidx.compose.material.a.d.C1035a.b) r0
                    int r1 = r0.f49847f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f49847f = r1
                    goto L18
                L13:
                    androidx.compose.material.a$d$a$b r0 = new androidx.compose.material.a$d$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f49845d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f49847f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f49844c
                    qv.C0 r8 = (qv.C0) r8
                    java.lang.Object r8 = r0.f49843b
                    java.lang.Object r0 = r0.f49842a
                    androidx.compose.material.a$d$a r0 = (androidx.compose.material.a.d.C1035a) r0
                    kotlin.ResultKt.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<qv.C0> r9 = r7.f49835a
                    T r9 = r9.f142835a
                    qv.C0 r9 = (qv.C0) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.d(r2)
                    r0.f49842a = r7
                    r0.f49843b = r8
                    r0.f49844c = r9
                    r0.f49847f = r3
                    java.lang.Object r9 = r9.n0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<qv.C0> r9 = r0.f49835a
                    qv.O r1 = r0.f49836b
                    qv.Q r3 = qv.EnumC16624Q.f157614d
                    androidx.compose.material.a$d$a$a r4 = new androidx.compose.material.a$d$a$a
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.f49837c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    qv.C0 r8 = qv.C16644i.d(r1, r2, r3, r4, r5, r6)
                    r9.f142835a = r8
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.d.C1035a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f49833c = function0;
            this.f49834d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f49833c, this.f49834d, continuation);
            dVar.f49832b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49831a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f49832b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                InterfaceC17152f interfaceC17152fQ = o1.q(this.f49833c);
                C1035a c1035a = new C1035a(objectRef, interfaceC16622O, this.f49834d);
                this.f49831a = 1;
                if (interfaceC17152fQ.collect(c1035a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final <T> InterfaceC17920a0<T> a(Function1<? super C17923b0<T>, Unit> function1) {
        C17923b0 c17923b0 = new C17923b0();
        function1.invoke(c17923b0);
        return new MapDraggableAnchors(c17923b0.b());
    }

    public static /* synthetic */ Modifier e(Modifier modifier, C17931e c17931e, EnumC13827z enumC13827z, boolean z10, boolean z11, l lVar, boolean z12, int i10, Object obj) {
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
            z12 = c17931e.y();
        }
        return d(modifier, c17931e, enumC13827z, z13, z14, lVar2, z12);
    }

    public static final <T> Object f(C17931e<T> c17931e, T t10, float f10, Continuation<? super Unit> continuation) {
        Object objK = C17931e.k(c17931e, t10, null, new b(c17931e, f10, null), continuation, 2, null);
        return objK == IntrinsicsKt.f() ? objK : Unit.f142422a;
    }

    public static /* synthetic */ Object g(C17931e c17931e, Object obj, float f10, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = c17931e.v();
        }
        return f(c17931e, obj, f10, continuation);
    }

    public static final <T> Modifier h(Modifier modifier, C17931e<T> c17931e, EnumC13827z enumC13827z, Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17920a0<T>, ? extends T>> function2) {
        return modifier.then(new DraggableAnchorsElement(c17931e, function2, enumC13827z));
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
            int r1 = r0.f49830b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49830b = r1
            goto L18
        L13:
            androidx.compose.material.a$c r0 = new androidx.compose.material.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49829a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f49830b
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
            r0.f49830b = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = qv.C16623P.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.j(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Modifier d(Modifier modifier, C17931e<T> c17931e, EnumC13827z enumC13827z, boolean z10, boolean z11, l lVar, boolean z12) {
        return C13818q.h(modifier, c17931e.getDraggableState(), enumC13827z, z10, lVar, z12, null, new C1032a(c17931e, null), z11, 32, null);
    }
}
