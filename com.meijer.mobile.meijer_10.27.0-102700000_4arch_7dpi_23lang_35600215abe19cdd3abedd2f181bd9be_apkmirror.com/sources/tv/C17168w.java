package tv;

import kotlin.C17350r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0003\u001aD\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0003\u001aF\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"T", "Ltv/f;", "e", "(Ltv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(Ltv/f;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "d", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17168w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"tv/w$a", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.w$a */
    public static final class a<T> implements InterfaceC17153g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f162351a;

        public a(Ref.ObjectRef objectRef) {
            this.f162351a = objectRef;
        }

        @Override // tv.InterfaceC17153g
        public Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f162351a.f142835a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"tv/w$b", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.w$b */
    public static final class b<T> implements InterfaceC17153g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f162352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f162353b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        /* renamed from: tv.w$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f162354a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f162355b;

            /* renamed from: c, reason: collision with root package name */
            int f162356c;

            /* renamed from: e, reason: collision with root package name */
            Object f162358e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162355b = obj;
                this.f162356c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, Ref.ObjectRef objectRef) {
            this.f162352a = function2;
            this.f162353b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof tv.C17168w.b.a
                if (r0 == 0) goto L13
                r0 = r6
                tv.w$b$a r0 = (tv.C17168w.b.a) r0
                int r1 = r0.f162356c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162356c = r1
                goto L18
            L13:
                tv.w$b$a r0 = new tv.w$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f162355b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162356c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f162358e
                java.lang.Object r0 = r0.f162354a
                tv.w$b r0 = (tv.C17168w.b) r0
                kotlin.ResultKt.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.ResultKt.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f162352a
                r0.f162354a = r4
                r0.f162358e = r5
                r0.f162356c = r3
                r2 = 6
                kotlin.jvm.internal.InlineMarker.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.InlineMarker.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f162353b
                r6.f142835a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    /* renamed from: tv.w$c */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162359a;

        /* renamed from: b, reason: collision with root package name */
        Object f162360b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162361c;

        /* renamed from: d, reason: collision with root package name */
        int f162362d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162361c = obj;
            this.f162362d |= Integer.MIN_VALUE;
            return C17154h.A(null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    /* renamed from: tv.w$d */
    static final class d<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162363a;

        /* renamed from: b, reason: collision with root package name */
        Object f162364b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162365c;

        /* renamed from: d, reason: collision with root package name */
        int f162366d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162365c = obj;
            this.f162366d |= Integer.MIN_VALUE;
            return C17154h.B(null, null, this);
        }

        d(Continuation<? super d> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"tv/w$e", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.w$e */
    public static final class e<T> implements InterfaceC17153g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f162367a;

        public e(Ref.ObjectRef objectRef) {
            this.f162367a = objectRef;
        }

        @Override // tv.InterfaceC17153g
        public Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f162367a.f142835a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"tv/w$f", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.w$f */
    public static final class f<T> implements InterfaceC17153g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f162368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f162369b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        /* renamed from: tv.w$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f162370a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f162371b;

            /* renamed from: c, reason: collision with root package name */
            int f162372c;

            /* renamed from: e, reason: collision with root package name */
            Object f162374e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162371b = obj;
                this.f162372c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(Function2 function2, Ref.ObjectRef objectRef) {
            this.f162368a = function2;
            this.f162369b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof tv.C17168w.f.a
                if (r0 == 0) goto L13
                r0 = r6
                tv.w$f$a r0 = (tv.C17168w.f.a) r0
                int r1 = r0.f162372c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162372c = r1
                goto L18
            L13:
                tv.w$f$a r0 = new tv.w$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f162371b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162372c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f162374e
                java.lang.Object r0 = r0.f162370a
                tv.w$f r0 = (tv.C17168w.f) r0
                kotlin.ResultKt.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.ResultKt.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f162368a
                r0.f162370a = r4
                r0.f162374e = r5
                r0.f162372c = r3
                r2 = 6
                kotlin.jvm.internal.InlineMarker.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.InlineMarker.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f162369b
                r6.f142835a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    /* renamed from: tv.w$g */
    static final class g<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162375a;

        /* renamed from: b, reason: collision with root package name */
        Object f162376b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162377c;

        /* renamed from: d, reason: collision with root package name */
        int f162378d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162377c = obj;
            this.f162378d |= Integer.MIN_VALUE;
            return C17154h.C(null, this);
        }

        g(Continuation<? super g> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    /* renamed from: tv.w$h */
    static final class h<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162379a;

        /* renamed from: b, reason: collision with root package name */
        Object f162380b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162381c;

        /* renamed from: d, reason: collision with root package name */
        int f162382d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162381c = obj;
            this.f162382d |= Integer.MIN_VALUE;
            return C17154h.D(null, null, this);
        }

        h(Continuation<? super h> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = "single")
    /* renamed from: tv.w$i */
    static final class i<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162383a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162384b;

        /* renamed from: c, reason: collision with root package name */
        int f162385c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162384b = obj;
            this.f162385c |= Integer.MIN_VALUE;
            return C17154h.W(null, this);
        }

        i(Continuation<? super i> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.w$j */
    static final class j<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f162386a;

        j(Ref.ObjectRef<Object> objectRef) {
            this.f162386a = objectRef;
        }

        @Override // tv.InterfaceC17153g
        public final Object emit(T t10, Continuation<? super Unit> continuation) {
            Ref.ObjectRef<Object> objectRef = this.f162386a;
            if (objectRef.f142835a != C17350r.f163603a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            objectRef.f142835a = t10;
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(tv.InterfaceC17152f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof tv.C17168w.c
            if (r0 == 0) goto L13
            r0 = r5
            tv.w$c r0 = (tv.C17168w.c) r0
            int r1 = r0.f162362d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162362d = r1
            goto L18
        L13:
            tv.w$c r0 = new tv.w$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f162361c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162362d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f162360b
            tv.w$a r4 = (tv.C17168w.a) r4
            java.lang.Object r1 = r0.f162359a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            vv.E r2 = kotlin.C17350r.f163603a
            r5.f142835a = r2
            tv.w$a r2 = new tv.w$a
            r2.<init>(r5)
            r0.f162359a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f162360b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f162362d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlin.C17346n.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            qv.E0.i(r4)
        L69:
            T r4 = r1.f142835a
            vv.E r5 = kotlin.C17350r.f163603a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.a(tv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(tv.InterfaceC17152f<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof tv.C17168w.d
            if (r0 == 0) goto L13
            r0 = r6
            tv.w$d r0 = (tv.C17168w.d) r0
            int r1 = r0.f162366d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162366d = r1
            goto L18
        L13:
            tv.w$d r0 = new tv.w$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f162365c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162366d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f162364b
            tv.w$b r4 = (tv.C17168w.b) r4
            java.lang.Object r5 = r0.f162363a
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            vv.E r2 = kotlin.C17350r.f163603a
            r6.f142835a = r2
            tv.w$b r2 = new tv.w$b
            r2.<init>(r5, r6)
            r0.f162363a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f162364b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f162366d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            kotlin.C17346n.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            qv.E0.i(r4)
        L69:
            T r4 = r5.f142835a
            vv.E r5 = kotlin.C17350r.f163603a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.b(tv.f, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(tv.InterfaceC17152f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof tv.C17168w.g
            if (r0 == 0) goto L13
            r0 = r5
            tv.w$g r0 = (tv.C17168w.g) r0
            int r1 = r0.f162378d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162378d = r1
            goto L18
        L13:
            tv.w$g r0 = new tv.w$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f162377c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162378d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f162376b
            tv.w$e r4 = (tv.C17168w.e) r4
            java.lang.Object r1 = r0.f162375a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            tv.w$e r2 = new tv.w$e
            r2.<init>(r5)
            r0.f162375a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f162376b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f162378d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlin.C17346n.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            qv.E0.i(r4)
        L65:
            T r4 = r1.f142835a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.c(tv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(tv.InterfaceC17152f<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof tv.C17168w.h
            if (r0 == 0) goto L13
            r0 = r6
            tv.w$h r0 = (tv.C17168w.h) r0
            int r1 = r0.f162382d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162382d = r1
            goto L18
        L13:
            tv.w$h r0 = new tv.w$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f162381c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162382d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f162380b
            tv.w$f r4 = (tv.C17168w.f) r4
            java.lang.Object r5 = r0.f162379a
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            tv.w$f r2 = new tv.w$f
            r2.<init>(r5, r6)
            r0.f162379a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f162380b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f162382d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlin.C17346n.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            qv.E0.i(r4)
        L65:
            T r4 = r5.f142835a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.d(tv.f, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(tv.InterfaceC17152f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof tv.C17168w.i
            if (r0 == 0) goto L13
            r0 = r5
            tv.w$i r0 = (tv.C17168w.i) r0
            int r1 = r0.f162385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162385c = r1
            goto L18
        L13:
            tv.w$i r0 = new tv.w$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f162384b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162385c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f162383a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.ResultKt.b(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            vv.E r2 = kotlin.C17350r.f163603a
            r5.f142835a = r2
            tv.w$j r2 = new tv.w$j
            r2.<init>(r5)
            r0.f162383a = r5
            r0.f162385c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f142835a
            vv.E r5 = kotlin.C17350r.f163603a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17168w.e(tv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
