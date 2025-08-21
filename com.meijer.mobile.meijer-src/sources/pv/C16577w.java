package pv;

import kotlin.C16786r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0003\u001aD\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0003\u001aF\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"T", "Lpv/f;", "e", "(Lpv/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(Lpv/f;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "d", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: pv.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16577w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pv/w$a", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.w$a */
    public static final class a<T> implements InterfaceC16562g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f157665a;

        public a(Ref.ObjectRef objectRef) {
            this.f157665a = objectRef;
        }

        @Override // pv.InterfaceC16562g
        public Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f157665a.f143742a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pv/w$b", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.w$b */
    public static final class b<T> implements InterfaceC16562g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f157666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f157667b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        /* renamed from: pv.w$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f157668a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f157669b;

            /* renamed from: c, reason: collision with root package name */
            int f157670c;

            /* renamed from: e, reason: collision with root package name */
            Object f157672e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157669b = obj;
                this.f157670c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, Ref.ObjectRef objectRef) {
            this.f157666a = function2;
            this.f157667b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof pv.C16577w.b.a
                if (r0 == 0) goto L13
                r0 = r6
                pv.w$b$a r0 = (pv.C16577w.b.a) r0
                int r1 = r0.f157670c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157670c = r1
                goto L18
            L13:
                pv.w$b$a r0 = new pv.w$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f157669b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157670c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f157672e
                java.lang.Object r0 = r0.f157668a
                pv.w$b r0 = (pv.C16577w.b) r0
                kotlin.ResultKt.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.ResultKt.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f157666a
                r0.f157668a = r4
                r0.f157672e = r5
                r0.f157670c = r3
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
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f157667b
                r6.f143742a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    /* renamed from: pv.w$c */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157673a;

        /* renamed from: b, reason: collision with root package name */
        Object f157674b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157675c;

        /* renamed from: d, reason: collision with root package name */
        int f157676d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157675c = obj;
            this.f157676d |= Integer.MIN_VALUE;
            return C16563h.A(null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    /* renamed from: pv.w$d */
    static final class d<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157677a;

        /* renamed from: b, reason: collision with root package name */
        Object f157678b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157679c;

        /* renamed from: d, reason: collision with root package name */
        int f157680d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157679c = obj;
            this.f157680d |= Integer.MIN_VALUE;
            return C16563h.B(null, null, this);
        }

        d(Continuation<? super d> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pv/w$e", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.w$e */
    public static final class e<T> implements InterfaceC16562g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f157681a;

        public e(Ref.ObjectRef objectRef) {
            this.f157681a = objectRef;
        }

        @Override // pv.InterfaceC16562g
        public Object emit(T t10, Continuation<? super Unit> continuation) {
            this.f157681a.f143742a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pv/w$f", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.w$f */
    public static final class f<T> implements InterfaceC16562g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f157682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f157683b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        /* renamed from: pv.w$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f157684a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f157685b;

            /* renamed from: c, reason: collision with root package name */
            int f157686c;

            /* renamed from: e, reason: collision with root package name */
            Object f157688e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157685b = obj;
                this.f157686c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(Function2 function2, Ref.ObjectRef objectRef) {
            this.f157682a = function2;
            this.f157683b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof pv.C16577w.f.a
                if (r0 == 0) goto L13
                r0 = r6
                pv.w$f$a r0 = (pv.C16577w.f.a) r0
                int r1 = r0.f157686c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157686c = r1
                goto L18
            L13:
                pv.w$f$a r0 = new pv.w$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f157685b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157686c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f157688e
                java.lang.Object r0 = r0.f157684a
                pv.w$f r0 = (pv.C16577w.f) r0
                kotlin.ResultKt.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.ResultKt.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f157682a
                r0.f157684a = r4
                r0.f157688e = r5
                r0.f157686c = r3
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
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f157683b
                r6.f143742a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    /* renamed from: pv.w$g */
    static final class g<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157689a;

        /* renamed from: b, reason: collision with root package name */
        Object f157690b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157691c;

        /* renamed from: d, reason: collision with root package name */
        int f157692d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157691c = obj;
            this.f157692d |= Integer.MIN_VALUE;
            return C16563h.C(null, this);
        }

        g(Continuation<? super g> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    /* renamed from: pv.w$h */
    static final class h<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157693a;

        /* renamed from: b, reason: collision with root package name */
        Object f157694b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f157695c;

        /* renamed from: d, reason: collision with root package name */
        int f157696d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157695c = obj;
            this.f157696d |= Integer.MIN_VALUE;
            return C16563h.D(null, null, this);
        }

        h(Continuation<? super h> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = "single")
    /* renamed from: pv.w$i */
    static final class i<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157697a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157698b;

        /* renamed from: c, reason: collision with root package name */
        int f157699c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157698b = obj;
            this.f157699c |= Integer.MIN_VALUE;
            return C16563h.W(null, this);
        }

        i(Continuation<? super i> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.w$j */
    static final class j<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f157700a;

        j(Ref.ObjectRef<Object> objectRef) {
            this.f157700a = objectRef;
        }

        @Override // pv.InterfaceC16562g
        public final Object emit(T t10, Continuation<? super Unit> continuation) {
            Ref.ObjectRef<Object> objectRef = this.f157700a;
            if (objectRef.f143742a != C16786r.f159079a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            objectRef.f143742a = t10;
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(pv.InterfaceC16561f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof pv.C16577w.c
            if (r0 == 0) goto L13
            r0 = r5
            pv.w$c r0 = (pv.C16577w.c) r0
            int r1 = r0.f157676d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157676d = r1
            goto L18
        L13:
            pv.w$c r0 = new pv.w$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f157675c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157676d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f157674b
            pv.w$a r4 = (pv.C16577w.a) r4
            java.lang.Object r1 = r0.f157673a
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
            rv.E r2 = kotlin.C16786r.f159079a
            r5.f143742a = r2
            pv.w$a r2 = new pv.w$a
            r2.<init>(r5)
            r0.f157673a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f157674b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f157676d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
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
            kotlin.C16782n.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            mv.E0.i(r4)
        L69:
            T r4 = r1.f143742a
            rv.E r5 = kotlin.C16786r.f159079a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.a(pv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(pv.InterfaceC16561f<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof pv.C16577w.d
            if (r0 == 0) goto L13
            r0 = r6
            pv.w$d r0 = (pv.C16577w.d) r0
            int r1 = r0.f157680d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157680d = r1
            goto L18
        L13:
            pv.w$d r0 = new pv.w$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157679c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157680d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f157678b
            pv.w$b r4 = (pv.C16577w.b) r4
            java.lang.Object r5 = r0.f157677a
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
            rv.E r2 = kotlin.C16786r.f159079a
            r6.f143742a = r2
            pv.w$b r2 = new pv.w$b
            r2.<init>(r5, r6)
            r0.f157677a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f157678b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f157680d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
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
            kotlin.C16782n.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            mv.E0.i(r4)
        L69:
            T r4 = r5.f143742a
            rv.E r5 = kotlin.C16786r.f159079a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.b(pv.f, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(pv.InterfaceC16561f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof pv.C16577w.g
            if (r0 == 0) goto L13
            r0 = r5
            pv.w$g r0 = (pv.C16577w.g) r0
            int r1 = r0.f157692d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157692d = r1
            goto L18
        L13:
            pv.w$g r0 = new pv.w$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f157691c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157692d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f157690b
            pv.w$e r4 = (pv.C16577w.e) r4
            java.lang.Object r1 = r0.f157689a
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
            pv.w$e r2 = new pv.w$e
            r2.<init>(r5)
            r0.f157689a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f157690b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f157692d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
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
            kotlin.C16782n.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            mv.E0.i(r4)
        L65:
            T r4 = r1.f143742a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.c(pv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(pv.InterfaceC16561f<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof pv.C16577w.h
            if (r0 == 0) goto L13
            r0 = r6
            pv.w$h r0 = (pv.C16577w.h) r0
            int r1 = r0.f157696d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157696d = r1
            goto L18
        L13:
            pv.w$h r0 = new pv.w$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f157695c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157696d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f157694b
            pv.w$f r4 = (pv.C16577w.f) r4
            java.lang.Object r5 = r0.f157693a
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
            pv.w$f r2 = new pv.w$f
            r2.<init>(r5, r6)
            r0.f157693a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f157694b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f157696d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
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
            kotlin.C16782n.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            mv.E0.i(r4)
        L65:
            T r4 = r5.f143742a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.d(pv.f, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(pv.InterfaceC16561f<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof pv.C16577w.i
            if (r0 == 0) goto L13
            r0 = r5
            pv.w$i r0 = (pv.C16577w.i) r0
            int r1 = r0.f157699c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157699c = r1
            goto L18
        L13:
            pv.w$i r0 = new pv.w$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f157698b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157699c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f157697a
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
            rv.E r2 = kotlin.C16786r.f159079a
            r5.f143742a = r2
            pv.w$j r2 = new pv.w$j
            r2.<init>(r5)
            r0.f157697a = r5
            r0.f157699c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.f143742a
            rv.E r5 = kotlin.C16786r.f159079a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16577w.e(pv.f, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
