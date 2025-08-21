package pv;

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
import mv.C0;
import mv.C15805i;
import mv.C15809k;
import mv.E0;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import mv.InterfaceC15835x;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&\u001aR\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010,\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0)\u0012\u0006\u0012\u0004\u0018\u00010*0'¢\u0006\u0002\b+¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"T", "Lpv/f;", "Lmv/O;", "scope", "Lpv/L;", "started", "", "replay", "Lpv/F;", "g", "(Lpv/f;Lmv/O;Lpv/L;I)Lpv/F;", "Lpv/K;", "c", "(Lpv/f;I)Lpv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lpv/A;", "shared", "initialValue", "Lmv/C0;", "d", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;Lpv/f;Lpv/A;Lpv/L;Ljava/lang/Object;)Lmv/C0;", "Lpv/P;", "i", "(Lpv/f;Lmv/O;Lpv/L;Ljava/lang/Object;)Lpv/P;", "h", "(Lpv/f;Lmv/O;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmv/x;", "Lkotlin/Result;", "result", "", "e", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;Lpv/f;Lmv/x;)V", "a", "(Lpv/A;)Lpv/F;", "Lpv/B;", "b", "(Lpv/B;)Lpv/P;", "Lkotlin/Function2;", "Lpv/g;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "action", "f", "(Lpv/F;Lkotlin/jvm/functions/Function2;)Lpv/F;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
final /* synthetic */ class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f157702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f157703c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16548A<T> f157704d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f157705e;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pv.x$a$a, reason: collision with other inner class name */
        static final class C2445a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f157706a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f157707b;

            C2445a(Continuation<? super C2445a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2445a c2445a = new C2445a(continuation);
                c2445a.f157707b = ((Number) obj).intValue();
                return c2445a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return d(num.intValue(), continuation);
            }

            public final Object d(int i10, Continuation<? super Boolean> continuation) {
                return ((C2445a) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f157706a == 0) {
                    ResultKt.b(obj);
                    if (this.f157707b > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv/J;", "it", "", "<anonymous>", "(Lpv/J;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f157708a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f157709b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f<T> f157710c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16548A<T> f157711d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f157712e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: pv.x$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2446a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[J.values().length];
                    try {
                        iArr[J.f157442a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[J.f157443b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[J.f157444c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC16548A<T> interfaceC16548A, T t10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f157710c = interfaceC16561f;
                this.f157711d = interfaceC16548A;
                this.f157712e = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f157710c, this.f157711d, this.f157712e, continuation);
                bVar.f157709b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return ((b) create(j10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f157708a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    int i11 = C2446a.$EnumSwitchMapping$0[((J) this.f157709b).ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                T t10 = this.f157712e;
                                if (t10 == C16555H.f157439a) {
                                    this.f157711d.f();
                                } else {
                                    Boxing.a(this.f157711d.b(t10));
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else {
                        InterfaceC16561f<T> interfaceC16561f = this.f157710c;
                        InterfaceC16561f interfaceC16561f2 = this.f157711d;
                        this.f157708a = 1;
                        if (interfaceC16561f.collect(interfaceC16561f2, this) == objF) {
                            return objF;
                        }
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(L l10, InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC16548A<T> interfaceC16548A, T t10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f157702b = l10;
            this.f157703c = interfaceC16561f;
            this.f157704d = interfaceC16548A;
            this.f157705e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f157702b, this.f157703c, this.f157704d, this.f157705e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (pv.C16563h.k(r8, r1, r7) == r0) goto L28;
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
                int r1 = r7.f157701a
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
                pv.L r8 = r7.f157702b
                pv.L$a r1 = pv.L.INSTANCE
                pv.L r6 = r1.c()
                if (r8 != r6) goto L3f
                pv.f<T> r8 = r7.f157703c
                pv.A<T> r1 = r7.f157704d
                r7.f157701a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                pv.L r8 = r7.f157702b
                pv.L r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                pv.A<T> r8 = r7.f157704d
                pv.P r8 = r8.c()
                pv.x$a$a r1 = new pv.x$a$a
                r1.<init>(r5)
                r7.f157701a = r4
                java.lang.Object r8 = pv.C16563h.B(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                pv.f<T> r8 = r7.f157703c
                pv.A<T> r1 = r7.f157704d
                r7.f157701a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                pv.L r8 = r7.f157702b
                pv.A<T> r1 = r7.f157704d
                pv.P r1 = r1.c()
                pv.f r8 = r8.a(r1)
                pv.f r8 = pv.C16563h.r(r8)
                pv.x$a$b r1 = new pv.x$a$b
                pv.f<T> r3 = r7.f157703c
                pv.A<T> r4 = r7.f157704d
                T r6 = r7.f157705e
                r1.<init>(r3, r4, r6, r5)
                r7.f157701a = r2
                java.lang.Object r8 = pv.C16563h.k(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157713a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f157714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f157715c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15835x<Result<P<T>>> f157716d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<InterfaceC16549B<T>> f157717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f157718b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15835x<Result<P<T>>> f157719c;

            a(Ref.ObjectRef<InterfaceC16549B<T>> objectRef, InterfaceC15783O interfaceC15783O, InterfaceC15835x<Result<P<T>>> interfaceC15835x) {
                this.f157717a = objectRef;
                this.f157718b = interfaceC15783O;
                this.f157719c = interfaceC15835x;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, pv.B, pv.P] */
            @Override // pv.InterfaceC16562g
            public final Object emit(T t10, Continuation<? super Unit> continuation) {
                Ref.ObjectRef<InterfaceC16549B<T>> objectRef = this.f157717a;
                InterfaceC16549B<T> interfaceC16549B = objectRef.f143742a;
                if (interfaceC16549B != null) {
                    interfaceC16549B.setValue(t10);
                } else {
                    InterfaceC15783O interfaceC15783O = this.f157718b;
                    InterfaceC15835x<Result<P<T>>> interfaceC15835x = this.f157719c;
                    ?? r42 = (T) S.a(t10);
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15835x.b0(Result.a(Result.b(new C16551D(r42, E0.k(interfaceC15783O.getCoroutineContext())))));
                    objectRef.f143742a = r42;
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC15835x<Result<P<T>>> interfaceC15835x, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f157715c = interfaceC16561f;
            this.f157716d = interfaceC15835x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f157715c, this.f157716d, continuation);
            bVar.f157714b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157713a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        objectRef = (Ref.ObjectRef) this.f157714b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f157714b;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    InterfaceC16561f<T> interfaceC16561f = this.f157715c;
                    a aVar = new a(objectRef2, interfaceC15783O, this.f157716d);
                    this.f157714b = objectRef2;
                    this.f157713a = 1;
                    if (interfaceC16561f.collect(aVar, this) == objF) {
                        return objF;
                    }
                    objectRef = objectRef2;
                }
                if (objectRef.f143742a == 0) {
                    InterfaceC15835x<Result<P<T>>> interfaceC15835x = this.f157716d;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15835x.b0(Result.a(Result.b(ResultKt.a(new NoSuchElementException("Flow is empty")))));
                }
                return Unit.f143329a;
            } catch (Throwable th2) {
                this.f157716d.c(th2);
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", l = {326}, m = "stateIn")
    static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f157720a;

        /* renamed from: b, reason: collision with root package name */
        int f157721b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157720a = obj;
            this.f157721b |= Integer.MIN_VALUE;
            return C16563h.X(null, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    public static final <T> P<T> i(InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC15783O interfaceC15783O, L l10, T t10) {
        K kC = c(interfaceC16561f, 1);
        InterfaceC16549B interfaceC16549BA = S.a(t10);
        return new C16551D(interfaceC16549BA, d(interfaceC15783O, kC.context, kC.upstream, interfaceC16549BA, l10, t10));
    }

    public static final <T> InterfaceC16553F<T> a(InterfaceC16548A<T> interfaceC16548A) {
        return new C16550C(interfaceC16548A, null);
    }

    public static final <T> P<T> b(InterfaceC16549B<T> interfaceC16549B) {
        return new C16551D(interfaceC16549B, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> pv.K<T> c(pv.InterfaceC16561f<? extends T> r7, int r8) {
        /*
            ov.g$a r0 = ov.g.INSTANCE
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt.f(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlin.AbstractC16772d
            if (r1 == 0) goto L3c
            r1 = r7
            qv.d r1 = (kotlin.AbstractC16772d) r1
            pv.f r2 = r1.k()
            if (r2 == 0) goto L3c
            pv.K r7 = new pv.K
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            ov.a r4 = r1.onBufferOverflow
            ov.a r5 = ov.EnumC16325a.f155824a
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
            ov.a r8 = r1.onBufferOverflow
            kotlin.coroutines.CoroutineContext r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            pv.K r8 = new pv.K
            ov.a r1 = ov.EnumC16325a.f155824a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f143553a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.x.c(pv.f, int):pv.K");
    }

    private static final <T> C0 d(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC16548A<T> interfaceC16548A, L l10, T t10) {
        return C15805i.c(interfaceC15783O, coroutineContext, Intrinsics.e(l10, L.INSTANCE.c()) ? EnumC15785Q.f151685a : EnumC15785Q.f151688d, new a(l10, interfaceC16561f, interfaceC16548A, t10, null));
    }

    private static final <T> void e(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC15835x<Result<P<T>>> interfaceC15835x) {
        C15809k.d(interfaceC15783O, coroutineContext, null, new b(interfaceC16561f, interfaceC15835x, null), 2, null);
    }

    public static final <T> InterfaceC16553F<T> f(InterfaceC16553F<? extends T> interfaceC16553F, Function2<? super InterfaceC16562g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new V(interfaceC16553F, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(pv.InterfaceC16561f<? extends T> r4, mv.InterfaceC15783O r5, kotlin.coroutines.Continuation<? super pv.P<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof pv.x.c
            if (r0 == 0) goto L13
            r0 = r6
            pv.x$c r0 = (pv.x.c) r0
            int r1 = r0.f157721b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157721b = r1
            goto L18
        L13:
            pv.x$c r0 = new pv.x$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157720a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157721b
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
            pv.K r4 = c(r4, r3)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            mv.C0$b r2 = mv.C0.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r6 = r6.g(r2)
            mv.C0 r6 = (mv.C0) r6
            mv.x r6 = mv.C15839z.a(r6)
            kotlin.coroutines.CoroutineContext r2 = r4.context
            pv.f<T> r4 = r4.upstream
            e(r5, r2, r4, r6)
            r0.f157721b = r3
            java.lang.Object r6 = r6.H(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.getValue()
            kotlin.ResultKt.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.x.h(pv.f, mv.O, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC16553F<T> g(InterfaceC16561f<? extends T> interfaceC16561f, InterfaceC15783O interfaceC15783O, L l10, int i10) {
        K kC = c(interfaceC16561f, i10);
        InterfaceC16548A interfaceC16548AA = C16555H.a(i10, kC.extraBufferCapacity, kC.onBufferOverflow);
        return new C16550C(interfaceC16548AA, d(interfaceC15783O, kC.context, kC.upstream, interfaceC16548AA, l10, C16555H.f157439a));
    }
}
