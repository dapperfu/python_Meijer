package kotlin;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.InterfaceC15783O;
import ov.EnumC16325a;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bw\u0012B\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u001c\u0010\u001dRP\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lqv/h;", "T", "R", "Lqv/f;", "Lkotlin/Function3;", "Lpv/g;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "Lpv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function3;Lpv/f;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "Lqv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "collector", "r", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/jvm/functions/Function3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16776h<T, R> extends AbstractC16774f<T, R> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC16562g<? super R>, T, Continuation<? super Unit>, Object> transform;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    /* renamed from: qv.h$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159027a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f159028b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16776h<T, R> f159029c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<R> f159030d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qv.h$a$a, reason: collision with other inner class name */
        static final class C2473a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C0> f159031a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f159032b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C16776h<T, R> f159033c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g<R> f159034d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            /* renamed from: qv.h$a$a$a, reason: collision with other inner class name */
            static final class C2474a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f159035a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C16776h<T, R> f159036b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g<R> f159037c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f159038d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2474a(C16776h<T, R> c16776h, InterfaceC16562g<? super R> interfaceC16562g, T t10, Continuation<? super C2474a> continuation) {
                    super(2, continuation);
                    this.f159036b = c16776h;
                    this.f159037c = interfaceC16562g;
                    this.f159038d = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2474a(this.f159036b, this.f159037c, this.f159038d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2474a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f159035a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3 function3 = ((C16776h) this.f159036b).transform;
                        InterfaceC16562g<R> interfaceC16562g = this.f159037c;
                        T t10 = this.f159038d;
                        this.f159035a = 1;
                        if (function3.invoke(interfaceC16562g, t10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            /* renamed from: qv.h$a$a$b */
            static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f159039a;

                /* renamed from: b, reason: collision with root package name */
                Object f159040b;

                /* renamed from: c, reason: collision with root package name */
                Object f159041c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f159042d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C2473a<T> f159043e;

                /* renamed from: f, reason: collision with root package name */
                int f159044f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C2473a<? super T> c2473a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f159043e = c2473a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f159042d = obj;
                    this.f159044f |= Integer.MIN_VALUE;
                    return this.f159043e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2473a(Ref.ObjectRef<C0> objectRef, InterfaceC15783O interfaceC15783O, C16776h<T, R> c16776h, InterfaceC16562g<? super R> interfaceC16562g) {
                this.f159031a = objectRef;
                this.f159032b = interfaceC15783O;
                this.f159033c = c16776h;
                this.f159034d = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlin.C16776h.a.C2473a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    qv.h$a$a$b r0 = (kotlin.C16776h.a.C2473a.b) r0
                    int r1 = r0.f159044f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f159044f = r1
                    goto L18
                L13:
                    qv.h$a$a$b r0 = new qv.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f159042d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f159044f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f159041c
                    mv.C0 r8 = (mv.C0) r8
                    java.lang.Object r8 = r0.f159040b
                    java.lang.Object r0 = r0.f159039a
                    qv.h$a$a r0 = (kotlin.C16776h.a.C2473a) r0
                    kotlin.ResultKt.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r7.f159031a
                    T r9 = r9.f143742a
                    mv.C0 r9 = (mv.C0) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.d(r2)
                    r0.f159039a = r7
                    r0.f159040b = r8
                    r0.f159041c = r9
                    r0.f159044f = r3
                    java.lang.Object r9 = r9.o0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<mv.C0> r9 = r0.f159031a
                    mv.O r1 = r0.f159032b
                    mv.Q r3 = mv.EnumC15785Q.f151688d
                    qv.h$a$a$a r4 = new qv.h$a$a$a
                    qv.h<T, R> r2 = r0.f159033c
                    pv.g<R> r0 = r0.f159034d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    mv.C0 r8 = mv.C15805i.d(r1, r2, r3, r4, r5, r6)
                    r9.f143742a = r8
                    kotlin.Unit r8 = kotlin.Unit.f143329a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C16776h.a.C2473a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C16776h<T, R> c16776h, InterfaceC16562g<? super R> interfaceC16562g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159029c = c16776h;
            this.f159030d = interfaceC16562g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f159029c, this.f159030d, continuation);
            aVar.f159028b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159027a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f159028b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C16776h<T, R> c16776h = this.f159029c;
                InterfaceC16561f<S> interfaceC16561f = c16776h.flow;
                C2473a c2473a = new C2473a(objectRef, interfaceC15783O, c16776h, this.f159030d);
                this.f159027a = 1;
                if (interfaceC16561f.collect(c2473a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ C16776h(Function3 function3, InterfaceC16561f interfaceC16561f, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, interfaceC16561f, (i11 & 4) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    @Override // kotlin.AbstractC16772d
    protected AbstractC16772d<R> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16776h(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC16774f
    protected Object r(InterfaceC16562g<? super R> interfaceC16562g, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(this, interfaceC16562g, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16776h(Function3<? super InterfaceC16562g<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC16561f<? extends T> interfaceC16561f, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(interfaceC16561f, coroutineContext, i10, enumC16325a);
        this.transform = function3;
    }
}
