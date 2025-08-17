package tv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C17345m;
import kotlin.C17350r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import sv.k;
import vv.C17631E;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Ltv/f;", "", "timeoutMillis", "b", "(Ltv/f;J)Ltv/f;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Ltv/f;Lkotlin/jvm/functions/Function1;)Ltv/f;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17161o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lqv/O;", "Ltv/g;", "downstream", "", "<anonymous>", "(Lqv/O;Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, HttpResponseStatus.ERROR_UNSUPPORTED_MEDIA_TYPE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: tv.o$a */
    static final class a<T> extends SuspendLambda implements Function3<InterfaceC16622O, InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f162225a;

        /* renamed from: b, reason: collision with root package name */
        Object f162226b;

        /* renamed from: c, reason: collision with root package name */
        int f162227c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f162228d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162229e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Long> f162230f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f162231g;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: tv.o$a$a, reason: collision with other inner class name */
        static final class C2548a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g<T> f162233b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Object> f162234c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2548a(InterfaceC17153g<? super T> interfaceC17153g, Ref.ObjectRef<Object> objectRef, Continuation<? super C2548a> continuation) {
                super(1, continuation);
                this.f162233b = interfaceC17153g;
                this.f162234c = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C2548a(this.f162233b, this.f162234c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C2548a) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f162232a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g<T> interfaceC17153g = this.f162233b;
                    C17631E c17631e = C17350r.f163603a;
                    T t10 = this.f162234c.f142835a;
                    if (t10 == c17631e) {
                        t10 = null;
                    }
                    this.f162232a = 1;
                    if (interfaceC17153g.emit(t10, this) == objF) {
                        return objF;
                    }
                }
                this.f162234c.f142835a = null;
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsv/k;", "", "value", "", "<anonymous>", "(Lsv/k;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: tv.o$a$b */
        static final class b extends SuspendLambda implements Function2<sv.k<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f162235a;

            /* renamed from: b, reason: collision with root package name */
            int f162236b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f162237c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Object> f162238d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g<T> f162239e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Ref.ObjectRef<Object> objectRef, InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f162238d = objectRef;
                this.f162239e = interfaceC17153g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f162238d, this.f162239e, continuation);
                bVar.f162237c = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(sv.k<? extends Object> kVar, Continuation<? super Unit> continuation) {
                return d(kVar.getHolder(), continuation);
            }

            public final Object d(Object obj, Continuation<? super Unit> continuation) {
                return ((b) create(sv.k.b(obj), continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f162236b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        objectRef2 = (Ref.ObjectRef) this.f162235a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    T t10 = (T) ((sv.k) this.f162237c).getHolder();
                    objectRef = this.f162238d;
                    boolean z10 = t10 instanceof k.c;
                    if (!z10) {
                        objectRef.f142835a = t10;
                    }
                    InterfaceC17153g<T> interfaceC17153g = this.f162239e;
                    if (z10) {
                        Throwable thE = sv.k.e(t10);
                        if (thE == null) {
                            Object obj2 = objectRef.f142835a;
                            if (obj2 != null) {
                                if (obj2 == C17350r.f163603a) {
                                    obj2 = null;
                                }
                                this.f162237c = t10;
                                this.f162235a = objectRef;
                                this.f162236b = 1;
                                if (interfaceC17153g.emit(obj2, this) == objF) {
                                    return objF;
                                }
                                objectRef2 = objectRef;
                            }
                            objectRef.f142835a = (T) C17350r.f163605c;
                        } else {
                            throw thE;
                        }
                    }
                    return Unit.f142422a;
                }
                objectRef = objectRef2;
                objectRef.f142835a = (T) C17350r.f163605c;
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "invokeSuspend")
        /* renamed from: tv.o$a$c */
        static final class c extends SuspendLambda implements Function2<sv.t<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162240a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f162241b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f<T> f162242c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: tv.o$a$c$a, reason: collision with other inner class name */
            static final class C2549a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ sv.t<Object> f162243a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "emit")
                /* renamed from: tv.o$a$c$a$a, reason: collision with other inner class name */
                static final class C2550a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f162244a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2549a<T> f162245b;

                    /* renamed from: c, reason: collision with root package name */
                    int f162246c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2550a(C2549a<? super T> c2549a, Continuation<? super C2550a> continuation) {
                        super(continuation);
                        this.f162245b = c2549a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f162244a = obj;
                        this.f162246c |= Integer.MIN_VALUE;
                        return this.f162245b.emit(null, this);
                    }
                }

                C2549a(sv.t<Object> tVar) {
                    this.f162243a = tVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof tv.C17161o.a.c.C2549a.C2550a
                        if (r0 == 0) goto L13
                        r0 = r6
                        tv.o$a$c$a$a r0 = (tv.C17161o.a.c.C2549a.C2550a) r0
                        int r1 = r0.f162246c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f162246c = r1
                        goto L18
                    L13:
                        tv.o$a$c$a$a r0 = new tv.o$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f162244a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f162246c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.b(r6)
                        sv.t<java.lang.Object> r6 = r4.f162243a
                        if (r5 != 0) goto L3a
                        vv.E r5 = kotlin.C17350r.f163603a
                    L3a:
                        r0.f162246c = r3
                        java.lang.Object r5 = r6.r(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tv.C17161o.a.c.C2549a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(sv.t<? super Object> tVar, Continuation<? super Unit> continuation) {
                return invoke2((sv.t<Object>) tVar, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(InterfaceC17152f<? extends T> interfaceC17152f, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f162242c = interfaceC17152f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f162242c, continuation);
                cVar.f162241b = obj;
                return cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(sv.t<Object> tVar, Continuation<? super Unit> continuation) {
                return ((c) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f162240a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    sv.t tVar = (sv.t) this.f162241b;
                    InterfaceC17152f<T> interfaceC17152f = this.f162242c;
                    C2549a c2549a = new C2549a(tVar);
                    this.f162240a = 1;
                    if (interfaceC17152f.collect(c2549a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Long> function1, InterfaceC17152f<? extends T> interfaceC17152f, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f162230f = function1;
            this.f162231g = interfaceC17152f;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16622O interfaceC16622O, InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
            a aVar = new a(this.f162230f, this.f162231g, continuation);
            aVar.f162228d = interfaceC16622O;
            aVar.f162229e = interfaceC17153g;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.o(r14) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
          (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
          (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
          (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
         binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 sv.v) = (r6v4 sv.v), (r6v5 sv.v), (r6v5 sv.v) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 tv.g) = (r7v4 tv.g), (r7v5 tv.g), (r7v5 tv.g) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17161o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j10, Object obj) {
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC17152f<T> b(InterfaceC17152f<? extends T> interfaceC17152f, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC17152f : d(interfaceC17152f, new Function1() { // from class: tv.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(C17161o.c(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    private static final <T> InterfaceC17152f<T> d(InterfaceC17152f<? extends T> interfaceC17152f, Function1<? super T, Long> function1) {
        return C17345m.b(new a(function1, interfaceC17152f, null));
    }
}
