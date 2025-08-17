package tv;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16644i;
import qv.C16648k;
import qv.E0;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import qv.InterfaceC16674x;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&\u001aR\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010,\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0)\u0012\u0006\u0012\u0004\u0018\u00010*0'¢\u0006\u0002\b+¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"T", "Ltv/f;", "Lqv/O;", "scope", "Ltv/L;", "started", "", "replay", "Ltv/F;", "g", "(Ltv/f;Lqv/O;Ltv/L;I)Ltv/F;", "Ltv/K;", "c", "(Ltv/f;I)Ltv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Ltv/A;", "shared", "initialValue", "Lqv/C0;", "d", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;Ltv/f;Ltv/A;Ltv/L;Ljava/lang/Object;)Lqv/C0;", "Ltv/P;", "i", "(Ltv/f;Lqv/O;Ltv/L;Ljava/lang/Object;)Ltv/P;", "h", "(Ltv/f;Lqv/O;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/x;", "Lkotlin/Result;", "result", "", "e", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;Ltv/f;Lqv/x;)V", "a", "(Ltv/A;)Ltv/F;", "Ltv/B;", "b", "(Ltv/B;)Ltv/P;", "Lkotlin/Function2;", "Ltv/g;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "action", "f", "(Ltv/F;Lkotlin/jvm/functions/Function2;)Ltv/F;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
final /* synthetic */ class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f162388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f162389c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC17139A<T> f162390d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f162391e;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: tv.x$a$a, reason: collision with other inner class name */
        static final class C2552a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162392a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f162393b;

            C2552a(Continuation<? super C2552a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2552a c2552a = new C2552a(continuation);
                c2552a.f162393b = ((Number) obj).intValue();
                return c2552a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return d(num.intValue(), continuation);
            }

            public final Object d(int i10, Continuation<? super Boolean> continuation) {
                return ((C2552a) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f162392a == 0) {
                    ResultKt.b(obj);
                    if (this.f162393b > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/J;", "it", "", "<anonymous>", "(Ltv/J;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162394a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f162395b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f<T> f162396c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC17139A<T> f162397d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f162398e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: tv.x$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2553a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[J.values().length];
                    try {
                        iArr[J.f162128a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[J.f162129b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[J.f162130c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC17139A<T> interfaceC17139A, T t10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f162396c = interfaceC17152f;
                this.f162397d = interfaceC17139A;
                this.f162398e = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f162396c, this.f162397d, this.f162398e, continuation);
                bVar.f162395b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return ((b) create(j10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f162394a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    int i11 = C2553a.$EnumSwitchMapping$0[((J) this.f162395b).ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                T t10 = this.f162398e;
                                if (t10 == C17146H.f162125a) {
                                    this.f162397d.f();
                                } else {
                                    Boxing.a(this.f162397d.b(t10));
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        InterfaceC17152f<T> interfaceC17152f = this.f162396c;
                        Object obj2 = this.f162397d;
                        this.f162394a = 1;
                        if (interfaceC17152f.collect(obj2, this) == objF) {
                            return objF;
                        }
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(L l10, InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC17139A<T> interfaceC17139A, T t10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162388b = l10;
            this.f162389c = interfaceC17152f;
            this.f162390d = interfaceC17139A;
            this.f162391e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f162388b, this.f162389c, this.f162390d, this.f162391e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (tv.C17154h.k(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f162387a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.ResultKt.b(r8)
                goto L5c
            L21:
                kotlin.ResultKt.b(r8)
                goto L8d
            L25:
                kotlin.ResultKt.b(r8)
                tv.L r8 = r7.f162388b
                tv.L$a r1 = tv.L.INSTANCE
                tv.L r6 = r1.c()
                if (r8 != r6) goto L3f
                tv.f<T> r8 = r7.f162389c
                tv.A<T> r1 = r7.f162390d
                r7.f162387a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                tv.L r8 = r7.f162388b
                tv.L r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                tv.A<T> r8 = r7.f162390d
                tv.P r8 = r8.c()
                tv.x$a$a r1 = new tv.x$a$a
                r1.<init>(r5)
                r7.f162387a = r4
                java.lang.Object r8 = tv.C17154h.B(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                tv.f<T> r8 = r7.f162389c
                tv.A<T> r1 = r7.f162390d
                r7.f162387a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                tv.L r8 = r7.f162388b
                tv.A<T> r1 = r7.f162390d
                tv.P r1 = r1.c()
                tv.f r8 = r8.a(r1)
                tv.f r8 = tv.C17154h.r(r8)
                tv.x$a$b r1 = new tv.x$a$b
                tv.f<T> r3 = r7.f162389c
                tv.A<T> r4 = r7.f162390d
                T r6 = r7.f162391e
                r1.<init>(r3, r4, r6, r5)
                r7.f162387a = r2
                java.lang.Object r8 = tv.C17154h.k(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162399a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162400b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f162401c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16674x<Result<P<T>>> f162402d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<InterfaceC17140B<T>> f162403a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f162404b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16674x<Result<P<T>>> f162405c;

            a(Ref.ObjectRef<InterfaceC17140B<T>> objectRef, InterfaceC16622O interfaceC16622O, InterfaceC16674x<Result<P<T>>> interfaceC16674x) {
                this.f162403a = objectRef;
                this.f162404b = interfaceC16622O;
                this.f162405c = interfaceC16674x;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, tv.B, tv.P] */
            @Override // tv.InterfaceC17153g
            public final Object emit(T t10, Continuation<? super Unit> continuation) {
                Ref.ObjectRef<InterfaceC17140B<T>> objectRef = this.f162403a;
                InterfaceC17140B<T> interfaceC17140B = objectRef.f142835a;
                if (interfaceC17140B != null) {
                    interfaceC17140B.setValue(t10);
                } else {
                    InterfaceC16622O interfaceC16622O = this.f162404b;
                    InterfaceC16674x<Result<P<T>>> interfaceC16674x = this.f162405c;
                    ?? r42 = (T) S.a(t10);
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16674x.Z(Result.a(Result.b(new C17142D(r42, E0.k(interfaceC16622O.getCoroutineContext())))));
                    objectRef.f142835a = r42;
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC16674x<Result<P<T>>> interfaceC16674x, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f162401c = interfaceC17152f;
            this.f162402d = interfaceC16674x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f162401c, this.f162402d, continuation);
            bVar.f162400b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f162399a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        objectRef = (Ref.ObjectRef) this.f162400b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f162400b;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    InterfaceC17152f<T> interfaceC17152f = this.f162401c;
                    a aVar = new a(objectRef2, interfaceC16622O, this.f162402d);
                    this.f162400b = objectRef2;
                    this.f162399a = 1;
                    if (interfaceC17152f.collect(aVar, this) == objF) {
                        return objF;
                    }
                    objectRef = objectRef2;
                }
                if (objectRef.f142835a == 0) {
                    InterfaceC16674x<Result<P<T>>> interfaceC16674x = this.f162402d;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16674x.Z(Result.a(Result.b(ResultKt.a(new NoSuchElementException("Flow is empty")))));
                }
                return Unit.f142422a;
            } catch (Throwable th2) {
                this.f162402d.c(th2);
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", l = {326}, m = "stateIn")
    static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f162406a;

        /* renamed from: b, reason: collision with root package name */
        int f162407b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162406a = obj;
            this.f162407b |= Integer.MIN_VALUE;
            return C17154h.X(null, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    public static final <T> P<T> i(InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC16622O interfaceC16622O, L l10, T t10) {
        K kC = c(interfaceC17152f, 1);
        InterfaceC17140B interfaceC17140BA = S.a(t10);
        return new C17142D(interfaceC17140BA, d(interfaceC16622O, kC.context, kC.upstream, interfaceC17140BA, l10, t10));
    }

    public static final <T> InterfaceC17144F<T> a(InterfaceC17139A<T> interfaceC17139A) {
        return new C17141C(interfaceC17139A, null);
    }

    public static final <T> P<T> b(InterfaceC17140B<T> interfaceC17140B) {
        return new C17142D(interfaceC17140B, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> tv.K<T> c(tv.InterfaceC17152f<? extends T> r7, int r8) {
        /*
            sv.g$a r0 = sv.g.INSTANCE
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt.f(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlin.AbstractC17336d
            if (r1 == 0) goto L3c
            r1 = r7
            uv.d r1 = (kotlin.AbstractC17336d) r1
            tv.f r2 = r1.k()
            if (r2 == 0) goto L3c
            tv.K r7 = new tv.K
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            sv.a r4 = r1.onBufferOverflow
            sv.a r5 = sv.EnumC17050a.f161240a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            sv.a r8 = r1.onBufferOverflow
            kotlin.coroutines.CoroutineContext r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            tv.K r8 = new tv.K
            sv.a r1 = sv.EnumC17050a.f161240a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f142646a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.x.c(tv.f, int):tv.K");
    }

    private static final <T> C0 d(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC17139A<T> interfaceC17139A, L l10, T t10) {
        return C16644i.c(interfaceC16622O, coroutineContext, Intrinsics.e(l10, L.INSTANCE.c()) ? EnumC16624Q.f157611a : EnumC16624Q.f157614d, new a(l10, interfaceC17152f, interfaceC17139A, t10, null));
    }

    private static final <T> void e(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC16674x<Result<P<T>>> interfaceC16674x) {
        C16648k.d(interfaceC16622O, coroutineContext, null, new b(interfaceC17152f, interfaceC16674x, null), 2, null);
    }

    public static final <T> InterfaceC17144F<T> f(InterfaceC17144F<? extends T> interfaceC17144F, Function2<? super InterfaceC17153g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new V(interfaceC17144F, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(tv.InterfaceC17152f<? extends T> r4, qv.InterfaceC16622O r5, kotlin.coroutines.Continuation<? super tv.P<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof tv.x.c
            if (r0 == 0) goto L13
            r0 = r6
            tv.x$c r0 = (tv.x.c) r0
            int r1 = r0.f162407b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162407b = r1
            goto L18
        L13:
            tv.x$c r0 = new tv.x$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f162406a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162407b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            tv.K r4 = c(r4, r3)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            qv.C0$b r2 = qv.C0.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r6 = r6.g(r2)
            qv.C0 r6 = (qv.C0) r6
            qv.x r6 = qv.C16678z.a(r6)
            kotlin.coroutines.CoroutineContext r2 = r4.context
            tv.f<T> r4 = r4.upstream
            e(r5, r2, r4, r6)
            r0.f162407b = r3
            java.lang.Object r6 = r6.B(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.getValue()
            kotlin.ResultKt.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.x.h(tv.f, qv.O, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC17144F<T> g(InterfaceC17152f<? extends T> interfaceC17152f, InterfaceC16622O interfaceC16622O, L l10, int i10) {
        K kC = c(interfaceC17152f, i10);
        InterfaceC17139A interfaceC17139AA = C17146H.a(i10, kC.extraBufferCapacity, kC.onBufferOverflow);
        return new C17141C(interfaceC17139AA, d(interfaceC16622O, kC.context, kC.upstream, interfaceC17139AA, l10, C17146H.f162125a));
    }
}
