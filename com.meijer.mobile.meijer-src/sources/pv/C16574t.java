package pv;

import kotlin.Metadata;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001ab\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a|\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"T", "Lpv/f;", "Lkotlin/Function3;", "Lpv/g;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Lpv/f;Lkotlin/jvm/functions/Function3;)Lpv/f;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lpv/f;JLkotlin/jvm/functions/Function2;)Lpv/f;", "Lkotlin/Function4;", "attempt", "g", "(Lpv/f;Lkotlin/jvm/functions/Function4;)Lpv/f;", "collector", "b", "(Lpv/f;Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: pv.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C16574t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/t$a", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.t$a */
    public static final class a<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3 f157582b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        /* renamed from: pv.t$a$a, reason: collision with other inner class name */
        public static final class C2444a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157583a;

            /* renamed from: b, reason: collision with root package name */
            int f157584b;

            /* renamed from: d, reason: collision with root package name */
            Object f157586d;

            /* renamed from: e, reason: collision with root package name */
            Object f157587e;

            public C2444a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157583a = obj;
                this.f157584b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC16561f interfaceC16561f, Function3 function3) {
            this.f157581a = interfaceC16561f;
            this.f157582b = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16561f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(pv.InterfaceC16562g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16574t.a.C2444a
                if (r0 == 0) goto L13
                r0 = r7
                pv.t$a$a r0 = (pv.C16574t.a.C2444a) r0
                int r1 = r0.f157584b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157584b = r1
                goto L18
            L13:
                pv.t$a$a r0 = new pv.t$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f157583a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157584b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f157587e
                pv.g r6 = (pv.InterfaceC16562g) r6
                java.lang.Object r2 = r0.f157586d
                pv.t$a r2 = (pv.C16574t.a) r2
                kotlin.ResultKt.b(r7)
                goto L53
            L40:
                kotlin.ResultKt.b(r7)
                pv.f r7 = r5.f157581a
                r0.f157586d = r5
                r0.f157587e = r6
                r0.f157584b = r4
                java.lang.Object r7 = pv.C16563h.h(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kotlin.jvm.functions.Function3 r2 = r2.f157582b
                r4 = 0
                r0.f157586d = r4
                r0.f157587e = r4
                r0.f157584b = r3
                r3 = 6
                kotlin.jvm.internal.InlineMarker.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.InlineMarker.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16574t.a.collect(pv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    /* renamed from: pv.t$b */
    static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157588a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157589b;

        /* renamed from: c, reason: collision with root package name */
        int f157590c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157589b = obj;
            this.f157590c |= Integer.MIN_VALUE;
            return C16563h.h(null, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.t$c */
    static final class c<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f157591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Throwable> f157592b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        /* renamed from: pv.t$c$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f157593a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f157594b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f157595c;

            /* renamed from: d, reason: collision with root package name */
            int f157596d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f157595c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157594b = obj;
                this.f157596d |= Integer.MIN_VALUE;
                return this.f157595c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC16562g<? super T> interfaceC16562g, Ref.ObjectRef<Throwable> objectRef) {
            this.f157591a = interfaceC16562g;
            this.f157592b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof pv.C16574t.c.a
                if (r0 == 0) goto L13
                r0 = r6
                pv.t$c$a r0 = (pv.C16574t.c.a) r0
                int r1 = r0.f157596d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157596d = r1
                goto L18
            L13:
                pv.t$c$a r0 = new pv.t$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f157594b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157596d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f157593a
                pv.t$c r5 = (pv.C16574t.c) r5
                kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.ResultKt.b(r6)
                pv.g<T> r6 = r4.f157591a     // Catch: java.lang.Throwable -> L4a
                r0.f157593a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f157596d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f157592b
                r5.f143742a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16574t.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pv.t$d */
    static final class d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157597a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, Continuation<? super Boolean> continuation) {
            return ((d) create(th2, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f157597a == 0) {
                ResultKt.b(obj);
                return Boxing.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lpv/g;", "", "cause", "", "attempt", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: pv.t$e */
    static final class e<T> extends SuspendLambda implements Function4<InterfaceC16562g<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157598a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157599b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f157600c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f157601d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> f157602e;

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l10, Continuation<? super Boolean> continuation) {
            return d((InterfaceC16562g) obj, th2, l10.longValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(4, continuation);
            this.f157601d = j10;
            this.f157602e = function2;
        }

        public final Object d(InterfaceC16562g<? super T> interfaceC16562g, Throwable th2, long j10, Continuation<? super Boolean> continuation) {
            e eVar = new e(this.f157601d, this.f157602e, continuation);
            eVar.f157599b = th2;
            eVar.f157600c = j10;
            return eVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157598a;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Throwable th2 = (Throwable) this.f157599b;
                if (this.f157600c < this.f157601d) {
                    Function2<Throwable, Continuation<? super Boolean>, Object> function2 = this.f157602e;
                    this.f157598a = 1;
                    obj = function2.invoke(th2, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                z10 = false;
                return Boxing.a(z10);
            }
            if (!((Boolean) obj).booleanValue()) {
                z10 = false;
            }
            return Boxing.a(z10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/t$f", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.t$f */
    public static final class f<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157603a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function4 f157604b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
        /* renamed from: pv.t$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157605a;

            /* renamed from: b, reason: collision with root package name */
            int f157606b;

            /* renamed from: d, reason: collision with root package name */
            Object f157608d;

            /* renamed from: e, reason: collision with root package name */
            Object f157609e;

            /* renamed from: f, reason: collision with root package name */
            Object f157610f;

            /* renamed from: g, reason: collision with root package name */
            long f157611g;

            /* renamed from: h, reason: collision with root package name */
            int f157612h;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157605a = obj;
                this.f157606b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC16561f interfaceC16561f, Function4 function4) {
            this.f157603a = interfaceC16561f;
            this.f157604b = function4;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
        @Override // pv.InterfaceC16561f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(pv.InterfaceC16562g<? super T> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r13 instanceof pv.C16574t.f.a
                if (r0 == 0) goto L13
                r0 = r13
                pv.t$f$a r0 = (pv.C16574t.f.a) r0
                int r1 = r0.f157606b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157606b = r1
                goto L18
            L13:
                pv.t$f$a r0 = new pv.t$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f157605a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157606b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f157611g
                java.lang.Object r12 = r0.f157610f
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f157609e
                pv.g r2 = (pv.InterfaceC16562g) r2
                java.lang.Object r7 = r0.f157608d
                pv.t$f r7 = (pv.C16574t.f) r7
                kotlin.ResultKt.b(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f157612h
                long r5 = r0.f157611g
                java.lang.Object r2 = r0.f157609e
                pv.g r2 = (pv.InterfaceC16562g) r2
                java.lang.Object r7 = r0.f157608d
                pv.t$f r7 = (pv.C16574t.f) r7
                kotlin.ResultKt.b(r13)
                goto L74
            L52:
                kotlin.ResultKt.b(r13)
                r5 = 0
                r13 = r11
            L58:
                pv.f r2 = r13.f157603a
                r0.f157608d = r13
                r0.f157609e = r12
                r7 = 0
                r0.f157610f = r7
                r0.f157611g = r5
                r7 = 0
                r0.f157612h = r7
                r0.f157606b = r4
                java.lang.Object r2 = pv.C16563h.h(r2, r12, r0)
                if (r2 != r1) goto L6f
                goto L96
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                kotlin.jvm.functions.Function4 r12 = r7.f157604b
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.e(r5)
                r0.f157608d = r7
                r0.f157609e = r2
                r0.f157610f = r13
                r0.f157611g = r5
                r0.f157606b = r3
                r9 = 6
                kotlin.jvm.internal.InlineMarker.c(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.InlineMarker.c(r8)
                if (r12 != r1) goto L97
            L96:
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                kotlin.Unit r12 = kotlin.Unit.f143329a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16574t.f.collect(pv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> InterfaceC16561f<T> a(InterfaceC16561f<? extends T> interfaceC16561f, Function3<? super InterfaceC16562g<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(interfaceC16561f, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(pv.InterfaceC16561f<? extends T> r4, pv.InterfaceC16562g<? super T> r5, kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof pv.C16574t.b
            if (r0 == 0) goto L13
            r0 = r6
            pv.t$b r0 = (pv.C16574t.b) r0
            int r1 = r0.f157590c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157590c = r1
            goto L18
        L13:
            pv.t$b r0 = new pv.t$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157589b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157590c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f157588a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            pv.t$c r2 = new pv.t$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f157588a = r6     // Catch: java.lang.Throwable -> L51
            r0.f157590c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f143742a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.ExceptionsKt.a(r4, r5)
            throw r4
        L72:
            kotlin.ExceptionsKt.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16574t.b(pv.f, pv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 == null || !c02.isCancelled()) {
            return false;
        }
        return d(th2, c02.D());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.e(th3, th2);
    }

    public static final <T> InterfaceC16561f<T> e(InterfaceC16561f<? extends T> interfaceC16561f, long j10, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        if (j10 > 0) {
            return C16563h.U(interfaceC16561f, new e(j10, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j10).toString());
    }

    public static /* synthetic */ InterfaceC16561f f(InterfaceC16561f interfaceC16561f, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            function2 = new d(null);
        }
        return C16563h.S(interfaceC16561f, j10, function2);
    }

    public static final <T> InterfaceC16561f<T> g(InterfaceC16561f<? extends T> interfaceC16561f, Function4<? super InterfaceC16562g<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new f(interfaceC16561f, function4);
    }
}
