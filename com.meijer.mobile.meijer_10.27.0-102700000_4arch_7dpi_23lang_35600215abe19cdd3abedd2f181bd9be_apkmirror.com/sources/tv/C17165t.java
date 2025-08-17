package tv;

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
import qv.C0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001ab\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a|\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"T", "Ltv/f;", "Lkotlin/Function3;", "Ltv/g;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Ltv/f;Lkotlin/jvm/functions/Function3;)Ltv/f;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Ltv/f;JLkotlin/jvm/functions/Function2;)Ltv/f;", "Lkotlin/Function4;", "attempt", "g", "(Ltv/f;Lkotlin/jvm/functions/Function4;)Ltv/f;", "collector", "b", "(Ltv/f;Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C17165t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/t$a", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.t$a */
    public static final class a<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162267a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3 f162268b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        /* renamed from: tv.t$a$a, reason: collision with other inner class name */
        public static final class C2551a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162269a;

            /* renamed from: b, reason: collision with root package name */
            int f162270b;

            /* renamed from: d, reason: collision with root package name */
            Object f162272d;

            /* renamed from: e, reason: collision with root package name */
            Object f162273e;

            public C2551a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162269a = obj;
                this.f162270b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC17152f interfaceC17152f, Function3 function3) {
            this.f162267a = interfaceC17152f;
            this.f162268b = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof tv.C17165t.a.C2551a
                if (r0 == 0) goto L13
                r0 = r7
                tv.t$a$a r0 = (tv.C17165t.a.C2551a) r0
                int r1 = r0.f162270b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162270b = r1
                goto L18
            L13:
                tv.t$a$a r0 = new tv.t$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f162269a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162270b
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
                java.lang.Object r6 = r0.f162273e
                tv.g r6 = (tv.InterfaceC17153g) r6
                java.lang.Object r2 = r0.f162272d
                tv.t$a r2 = (tv.C17165t.a) r2
                kotlin.ResultKt.b(r7)
                goto L53
            L40:
                kotlin.ResultKt.b(r7)
                tv.f r7 = r5.f162267a
                r0.f162272d = r5
                r0.f162273e = r6
                r0.f162270b = r4
                java.lang.Object r7 = tv.C17154h.h(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kotlin.jvm.functions.Function3 r2 = r2.f162268b
                r4 = 0
                r0.f162272d = r4
                r0.f162273e = r4
                r0.f162270b = r3
                r3 = 6
                kotlin.jvm.internal.InlineMarker.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.InlineMarker.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17165t.a.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    /* renamed from: tv.t$b */
    static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162274a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162275b;

        /* renamed from: c, reason: collision with root package name */
        int f162276c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162275b = obj;
            this.f162276c |= Integer.MIN_VALUE;
            return C17154h.h(null, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.t$c */
    static final class c<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f162277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Throwable> f162278b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        /* renamed from: tv.t$c$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f162279a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f162280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f162281c;

            /* renamed from: d, reason: collision with root package name */
            int f162282d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f162281c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162280b = obj;
                this.f162282d |= Integer.MIN_VALUE;
                return this.f162281c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC17153g<? super T> interfaceC17153g, Ref.ObjectRef<Throwable> objectRef) {
            this.f162277a = interfaceC17153g;
            this.f162278b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof tv.C17165t.c.a
                if (r0 == 0) goto L13
                r0 = r6
                tv.t$c$a r0 = (tv.C17165t.c.a) r0
                int r1 = r0.f162282d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162282d = r1
                goto L18
            L13:
                tv.t$c$a r0 = new tv.t$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f162280b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162282d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f162279a
                tv.t$c r5 = (tv.C17165t.c) r5
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
                tv.g<T> r6 = r4.f162277a     // Catch: java.lang.Throwable -> L4a
                r0.f162279a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f162282d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f162278b
                r5.f142835a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17165t.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tv.t$d */
    static final class d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162283a;

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
            return ((d) create(th2, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f162283a == 0) {
                ResultKt.b(obj);
                return Boxing.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Ltv/g;", "", "cause", "", "attempt", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: tv.t$e */
    static final class e<T> extends SuspendLambda implements Function4<InterfaceC17153g<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162284a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162285b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f162286c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f162287d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> f162288e;

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l10, Continuation<? super Boolean> continuation) {
            return d((InterfaceC17153g) obj, th2, l10.longValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(4, continuation);
            this.f162287d = j10;
            this.f162288e = function2;
        }

        public final Object d(InterfaceC17153g<? super T> interfaceC17153g, Throwable th2, long j10, Continuation<? super Boolean> continuation) {
            e eVar = new e(this.f162287d, this.f162288e, continuation);
            eVar.f162285b = th2;
            eVar.f162286c = j10;
            return eVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f162284a;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Throwable th2 = (Throwable) this.f162285b;
                if (this.f162286c < this.f162287d) {
                    Function2<Throwable, Continuation<? super Boolean>, Object> function2 = this.f162288e;
                    this.f162284a = 1;
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/t$f", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.t$f */
    public static final class f<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function4 f162290b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
        /* renamed from: tv.t$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162291a;

            /* renamed from: b, reason: collision with root package name */
            int f162292b;

            /* renamed from: d, reason: collision with root package name */
            Object f162294d;

            /* renamed from: e, reason: collision with root package name */
            Object f162295e;

            /* renamed from: f, reason: collision with root package name */
            Object f162296f;

            /* renamed from: g, reason: collision with root package name */
            long f162297g;

            /* renamed from: h, reason: collision with root package name */
            int f162298h;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162291a = obj;
                this.f162292b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC17152f interfaceC17152f, Function4 function4) {
            this.f162289a = interfaceC17152f;
            this.f162290b = function4;
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
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r13 instanceof tv.C17165t.f.a
                if (r0 == 0) goto L13
                r0 = r13
                tv.t$f$a r0 = (tv.C17165t.f.a) r0
                int r1 = r0.f162292b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162292b = r1
                goto L18
            L13:
                tv.t$f$a r0 = new tv.t$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f162291a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162292b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f162297g
                java.lang.Object r12 = r0.f162296f
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f162295e
                tv.g r2 = (tv.InterfaceC17153g) r2
                java.lang.Object r7 = r0.f162294d
                tv.t$f r7 = (tv.C17165t.f) r7
                kotlin.ResultKt.b(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f162298h
                long r5 = r0.f162297g
                java.lang.Object r2 = r0.f162295e
                tv.g r2 = (tv.InterfaceC17153g) r2
                java.lang.Object r7 = r0.f162294d
                tv.t$f r7 = (tv.C17165t.f) r7
                kotlin.ResultKt.b(r13)
                goto L74
            L52:
                kotlin.ResultKt.b(r13)
                r5 = 0
                r13 = r11
            L58:
                tv.f r2 = r13.f162289a
                r0.f162294d = r13
                r0.f162295e = r12
                r7 = 0
                r0.f162296f = r7
                r0.f162297g = r5
                r7 = 0
                r0.f162298h = r7
                r0.f162292b = r4
                java.lang.Object r2 = tv.C17154h.h(r2, r12, r0)
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
                kotlin.jvm.functions.Function4 r12 = r7.f162290b
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.e(r5)
                r0.f162294d = r7
                r0.f162295e = r2
                r0.f162296f = r13
                r0.f162297g = r5
                r0.f162292b = r3
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
                kotlin.Unit r12 = kotlin.Unit.f142422a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17165t.f.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> InterfaceC17152f<T> a(InterfaceC17152f<? extends T> interfaceC17152f, Function3<? super InterfaceC17153g<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(interfaceC17152f, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(tv.InterfaceC17152f<? extends T> r4, tv.InterfaceC17153g<? super T> r5, kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof tv.C17165t.b
            if (r0 == 0) goto L13
            r0 = r6
            tv.t$b r0 = (tv.C17165t.b) r0
            int r1 = r0.f162276c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162276c = r1
            goto L18
        L13:
            tv.t$b r0 = new tv.t$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f162275b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162276c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f162274a
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
            tv.t$c r2 = new tv.t$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f162274a = r6     // Catch: java.lang.Throwable -> L51
            r0.f162276c = r3     // Catch: java.lang.Throwable -> L51
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
            T r4 = r4.f142835a
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
        throw new UnsupportedOperationException("Method not decompiled: tv.C17165t.b(tv.f, tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 == null || !c02.isCancelled()) {
            return false;
        }
        return d(th2, c02.z());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.e(th3, th2);
    }

    public static final <T> InterfaceC17152f<T> e(InterfaceC17152f<? extends T> interfaceC17152f, long j10, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        if (j10 > 0) {
            return C17154h.U(interfaceC17152f, new e(j10, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j10).toString());
    }

    public static /* synthetic */ InterfaceC17152f f(InterfaceC17152f interfaceC17152f, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            function2 = new d(null);
        }
        return C17154h.S(interfaceC17152f, j10, function2);
    }

    public static final <T> InterfaceC17152f<T> g(InterfaceC17152f<? extends T> interfaceC17152f, Function4<? super InterfaceC17153g<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new f(interfaceC17152f, function4);
    }
}
