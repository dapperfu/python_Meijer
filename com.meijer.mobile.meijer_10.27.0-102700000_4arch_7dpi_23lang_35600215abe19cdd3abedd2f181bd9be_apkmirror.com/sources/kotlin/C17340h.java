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
import qv.C0;
import qv.C16623P;
import qv.InterfaceC16622O;
import sv.EnumC17050a;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bw\u0012B\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u001c\u0010\u001dRP\u0010\r\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Luv/h;", "T", "R", "Luv/f;", "Lkotlin/Function3;", "Ltv/g;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "Ltv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function3;Ltv/f;Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "Luv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "collector", "r", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlin/jvm/functions/Function3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17340h<T, R> extends AbstractC17338f<T, R> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC17153g<? super R>, T, Continuation<? super Unit>, Object> transform;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    /* renamed from: uv.h$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163551a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f163552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17340h<T, R> f163553c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<R> f163554d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uv.h$a$a, reason: collision with other inner class name */
        static final class C2585a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C0> f163555a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f163556b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17340h<T, R> f163557c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g<R> f163558d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            /* renamed from: uv.h$a$a$a, reason: collision with other inner class name */
            static final class C2586a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f163559a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17340h<T, R> f163560b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC17153g<R> f163561c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ T f163562d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2586a(C17340h<T, R> c17340h, InterfaceC17153g<? super R> interfaceC17153g, T t10, Continuation<? super C2586a> continuation) {
                    super(2, continuation);
                    this.f163560b = c17340h;
                    this.f163561c = interfaceC17153g;
                    this.f163562d = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2586a(this.f163560b, this.f163561c, this.f163562d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2586a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f163559a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        Function3 function3 = ((C17340h) this.f163560b).transform;
                        InterfaceC17153g<R> interfaceC17153g = this.f163561c;
                        T t10 = this.f163562d;
                        this.f163559a = 1;
                        if (function3.invoke(interfaceC17153g, t10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            /* renamed from: uv.h$a$a$b */
            static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f163563a;

                /* renamed from: b, reason: collision with root package name */
                Object f163564b;

                /* renamed from: c, reason: collision with root package name */
                Object f163565c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f163566d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C2585a<T> f163567e;

                /* renamed from: f, reason: collision with root package name */
                int f163568f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C2585a<? super T> c2585a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f163567e = c2585a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f163566d = obj;
                    this.f163568f |= Integer.MIN_VALUE;
                    return this.f163567e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2585a(Ref.ObjectRef<C0> objectRef, InterfaceC16622O interfaceC16622O, C17340h<T, R> c17340h, InterfaceC17153g<? super R> interfaceC17153g) {
                this.f163555a = objectRef;
                this.f163556b = interfaceC16622O;
                this.f163557c = c17340h;
                this.f163558d = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlin.C17340h.a.C2585a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    uv.h$a$a$b r0 = (kotlin.C17340h.a.C2585a.b) r0
                    int r1 = r0.f163568f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f163568f = r1
                    goto L18
                L13:
                    uv.h$a$a$b r0 = new uv.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f163566d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f163568f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f163565c
                    qv.C0 r8 = (qv.C0) r8
                    java.lang.Object r8 = r0.f163564b
                    java.lang.Object r0 = r0.f163563a
                    uv.h$a$a r0 = (kotlin.C17340h.a.C2585a) r0
                    kotlin.ResultKt.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.ResultKt.b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<qv.C0> r9 = r7.f163555a
                    T r9 = r9.f142835a
                    qv.C0 r9 = (qv.C0) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.d(r2)
                    r0.f163563a = r7
                    r0.f163564b = r8
                    r0.f163565c = r9
                    r0.f163568f = r3
                    java.lang.Object r9 = r9.n0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<qv.C0> r9 = r0.f163555a
                    qv.O r1 = r0.f163556b
                    qv.Q r3 = qv.EnumC16624Q.f157614d
                    uv.h$a$a$a r4 = new uv.h$a$a$a
                    uv.h<T, R> r2 = r0.f163557c
                    tv.g<R> r0 = r0.f163558d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    qv.C0 r8 = qv.C16644i.d(r1, r2, r3, r4, r5, r6)
                    r9.f142835a = r8
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C17340h.a.C2585a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C17340h<T, R> c17340h, InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163553c = c17340h;
            this.f163554d = interfaceC17153g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f163553c, this.f163554d, continuation);
            aVar.f163552b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163551a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f163552b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C17340h<T, R> c17340h = this.f163553c;
                InterfaceC17152f<S> interfaceC17152f = c17340h.flow;
                C2585a c2585a = new C2585a(objectRef, interfaceC16622O, c17340h, this.f163554d);
                this.f163551a = 1;
                if (interfaceC17152f.collect(c2585a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public /* synthetic */ C17340h(Function3 function3, InterfaceC17152f interfaceC17152f, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, interfaceC17152f, (i11 & 4) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? EnumC17050a.f161240a : enumC17050a);
    }

    @Override // kotlin.AbstractC17336d
    protected AbstractC17336d<R> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return new C17340h(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC17338f
    protected Object r(InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(this, interfaceC17153g, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17340h(Function3<? super InterfaceC17153g<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC17152f<? extends T> interfaceC17152f, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(interfaceC17152f, coroutineContext, i10, enumC17050a);
        this.transform = function3;
    }
}
