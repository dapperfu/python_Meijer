package pv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.C16781m;
import kotlin.C16786r;
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
import mv.InterfaceC15783O;
import ov.k;
import rv.C16950E;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lpv/f;", "", "timeoutMillis", "b", "(Lpv/f;J)Lpv/f;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Lpv/f;Lkotlin/jvm/functions/Function1;)Lpv/f;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: pv.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16570o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmv/O;", "Lpv/g;", "downstream", "", "<anonymous>", "(Lmv/O;Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, HttpResponseStatus.ERROR_UNSUPPORTED_MEDIA_TYPE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: pv.o$a */
    static final class a<T> extends SuspendLambda implements Function3<InterfaceC15783O, InterfaceC16562g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f157539a;

        /* renamed from: b, reason: collision with root package name */
        Object f157540b;

        /* renamed from: c, reason: collision with root package name */
        int f157541c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f157542d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157543e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Long> f157544f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f157545g;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: pv.o$a$a, reason: collision with other inner class name */
        static final class C2441a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f157546a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g<T> f157547b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Object> f157548c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2441a(InterfaceC16562g<? super T> interfaceC16562g, Ref.ObjectRef<Object> objectRef, Continuation<? super C2441a> continuation) {
                super(1, continuation);
                this.f157547b = interfaceC16562g;
                this.f157548c = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C2441a(this.f157547b, this.f157548c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C2441a) create(continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f157546a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16562g<T> interfaceC16562g = this.f157547b;
                    C16950E c16950e = C16786r.f159079a;
                    T t10 = this.f157548c.f143742a;
                    if (t10 == c16950e) {
                        t10 = null;
                    }
                    this.f157546a = 1;
                    if (interfaceC16562g.emit(t10, this) == objF) {
                        return objF;
                    }
                }
                this.f157548c.f143742a = null;
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lov/k;", "", "value", "", "<anonymous>", "(Lov/k;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: pv.o$a$b */
        static final class b extends SuspendLambda implements Function2<ov.k<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f157549a;

            /* renamed from: b, reason: collision with root package name */
            int f157550b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f157551c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Object> f157552d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g<T> f157553e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Ref.ObjectRef<Object> objectRef, InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f157552d = objectRef;
                this.f157553e = interfaceC16562g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f157552d, this.f157553e, continuation);
                bVar.f157551c = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ov.k<? extends Object> kVar, Continuation<? super Unit> continuation) {
                return d(kVar.getHolder(), continuation);
            }

            public final Object d(Object obj, Continuation<? super Unit> continuation) {
                return ((b) create(ov.k.b(obj), continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f157550b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        objectRef2 = (Ref.ObjectRef) this.f157549a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    T t10 = (T) ((ov.k) this.f157551c).getHolder();
                    objectRef = this.f157552d;
                    boolean z10 = t10 instanceof k.c;
                    if (!z10) {
                        objectRef.f143742a = t10;
                    }
                    InterfaceC16562g<T> interfaceC16562g = this.f157553e;
                    if (z10) {
                        Throwable thE = ov.k.e(t10);
                        if (thE == null) {
                            Object obj2 = objectRef.f143742a;
                            if (obj2 != null) {
                                if (obj2 == C16786r.f159079a) {
                                    obj2 = null;
                                }
                                this.f157551c = t10;
                                this.f157549a = objectRef;
                                this.f157550b = 1;
                                if (interfaceC16562g.emit(obj2, this) == objF) {
                                    return objF;
                                }
                                objectRef2 = objectRef;
                            }
                            objectRef.f143742a = (T) C16786r.f159081c;
                        } else {
                            throw thE;
                        }
                    }
                    return Unit.f143329a;
                }
                objectRef = objectRef2;
                objectRef.f143742a = (T) C16786r.f159081c;
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lov/t;", "", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "invokeSuspend")
        /* renamed from: pv.o$a$c */
        static final class c extends SuspendLambda implements Function2<ov.t<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f157554a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f157555b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f<T> f157556c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: pv.o$a$c$a, reason: collision with other inner class name */
            static final class C2442a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ov.t<Object> f157557a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "emit")
                /* renamed from: pv.o$a$c$a$a, reason: collision with other inner class name */
                static final class C2443a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f157558a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2442a<T> f157559b;

                    /* renamed from: c, reason: collision with root package name */
                    int f157560c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2443a(C2442a<? super T> c2442a, Continuation<? super C2443a> continuation) {
                        super(continuation);
                        this.f157559b = c2442a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f157558a = obj;
                        this.f157560c |= Integer.MIN_VALUE;
                        return this.f157559b.emit(null, this);
                    }
                }

                C2442a(ov.t<Object> tVar) {
                    this.f157557a = tVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof pv.C16570o.a.c.C2442a.C2443a
                        if (r0 == 0) goto L13
                        r0 = r6
                        pv.o$a$c$a$a r0 = (pv.C16570o.a.c.C2442a.C2443a) r0
                        int r1 = r0.f157560c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f157560c = r1
                        goto L18
                    L13:
                        pv.o$a$c$a$a r0 = new pv.o$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f157558a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f157560c
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
                        ov.t<java.lang.Object> r6 = r4.f157557a
                        if (r5 != 0) goto L3a
                        rv.E r5 = kotlin.C16786r.f159079a
                    L3a:
                        r0.f157560c = r3
                        java.lang.Object r5 = r6.r(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pv.C16570o.a.c.C2442a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ov.t<? super Object> tVar, Continuation<? super Unit> continuation) {
                return invoke2((ov.t<Object>) tVar, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f157556c = interfaceC16561f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f157556c, continuation);
                cVar.f157555b = obj;
                return cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ov.t<Object> tVar, Continuation<? super Unit> continuation) {
                return ((c) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f157554a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ov.t tVar = (ov.t) this.f157555b;
                    InterfaceC16561f<T> interfaceC16561f = this.f157556c;
                    C2442a c2442a = new C2442a(tVar);
                    this.f157554a = 1;
                    if (interfaceC16561f.collect(c2442a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Long> function1, InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f157544f = function1;
            this.f157545g = interfaceC16561f;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC15783O interfaceC15783O, InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            a aVar = new a(this.f157544f, this.f157545g, continuation);
            aVar.f157542d = interfaceC15783O;
            aVar.f157543e = interfaceC16562g;
            return aVar.invokeSuspend(Unit.f143329a);
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
          0x00a4: PHI (r6v2 ov.v) = (r6v4 ov.v), (r6v5 ov.v), (r6v5 ov.v) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 pv.g) = (r7v4 pv.g), (r7v5 pv.g), (r7v5 pv.g) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
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
            throw new UnsupportedOperationException("Method not decompiled: pv.C16570o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j10, Object obj) {
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC16561f<T> b(InterfaceC16561f<? extends T> interfaceC16561f, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC16561f : d(interfaceC16561f, new Function1() { // from class: pv.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(C16570o.c(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    private static final <T> InterfaceC16561f<T> d(InterfaceC16561f<? extends T> interfaceC16561f, Function1<? super T, Long> function1) {
        return C16781m.b(new a(function1, interfaceC16561f, null));
    }
}
