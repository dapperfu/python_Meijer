package tv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aR\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\n\u001ai\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001ap\u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Ltv/f;", "Lkotlin/Function2;", "Ltv/g;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "e", "(Ltv/f;Lkotlin/jvm/functions/Function2;)Ltv/f;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "d", "(Ltv/f;Lkotlin/jvm/functions/Function3;)Ltv/f;", "b", "(Ltv/g;)V", "c", "(Ltv/g;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17164s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
    /* renamed from: tv.s$a */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162249a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162250b;

        /* renamed from: c, reason: collision with root package name */
        int f162251c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162250b = obj;
            this.f162251c |= Integer.MIN_VALUE;
            return C17164s.c(null, null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/s$b", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.s$b */
    public static final class b<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3 f162253b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
        /* renamed from: tv.s$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162254a;

            /* renamed from: b, reason: collision with root package name */
            int f162255b;

            /* renamed from: d, reason: collision with root package name */
            Object f162257d;

            /* renamed from: e, reason: collision with root package name */
            Object f162258e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162254a = obj;
                this.f162255b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC17152f interfaceC17152f, Function3 function3) {
            this.f162252a = interfaceC17152f;
            this.f162253b = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof tv.C17164s.b.a
                if (r0 == 0) goto L13
                r0 = r10
                tv.s$b$a r0 = (tv.C17164s.b.a) r0
                int r1 = r0.f162255b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162255b = r1
                goto L18
            L13:
                tv.s$b$a r0 = new tv.s$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f162254a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162255b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f162257d
                uv.t r9 = (kotlin.C17352t) r9
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f162257d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.ResultKt.b(r10)
                goto Lad
            L47:
                java.lang.Object r9 = r0.f162258e
                tv.g r9 = (tv.InterfaceC17153g) r9
                java.lang.Object r2 = r0.f162257d
                tv.s$b r2 = (tv.C17164s.b) r2
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L68
            L53:
                r9 = move-exception
                goto L99
            L55:
                kotlin.ResultKt.b(r10)
                tv.f r10 = r8.f162252a     // Catch: java.lang.Throwable -> L97
                r0.f162257d = r8     // Catch: java.lang.Throwable -> L97
                r0.f162258e = r9     // Catch: java.lang.Throwable -> L97
                r0.f162255b = r5     // Catch: java.lang.Throwable -> L97
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
                if (r10 != r1) goto L67
                goto Lac
            L67:
                r2 = r8
            L68:
                uv.t r10 = new uv.t
                kotlin.coroutines.CoroutineContext r4 = r0.getContext()
                r10.<init>(r9, r4)
                kotlin.jvm.functions.Function3 r9 = r2.f162253b     // Catch: java.lang.Throwable -> L8f
                r0.f162257d = r10     // Catch: java.lang.Throwable -> L8f
                r0.f162258e = r6     // Catch: java.lang.Throwable -> L8f
                r0.f162255b = r3     // Catch: java.lang.Throwable -> L8f
                r2 = 6
                kotlin.jvm.internal.InlineMarker.c(r2)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
                r0 = 7
                kotlin.jvm.internal.InlineMarker.c(r0)     // Catch: java.lang.Throwable -> L8f
                if (r9 != r1) goto L88
                goto Lac
            L88:
                r9 = r10
            L89:
                r9.releaseIntercepted()
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            L8f:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L93:
                r9.releaseIntercepted()
                throw r10
            L97:
                r9 = move-exception
                r2 = r8
            L99:
                tv.W r10 = new tv.W
                r10.<init>(r9)
                kotlin.jvm.functions.Function3 r2 = r2.f162253b
                r0.f162257d = r9
                r0.f162258e = r6
                r0.f162255b = r4
                java.lang.Object r10 = tv.C17164s.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lad
            Lac:
                return r1
            Lad:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17164s.b.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/s$c", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.s$c */
    public static final class c<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f162259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162260b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
        /* renamed from: tv.s$c$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162261a;

            /* renamed from: b, reason: collision with root package name */
            int f162262b;

            /* renamed from: d, reason: collision with root package name */
            Object f162264d;

            /* renamed from: e, reason: collision with root package name */
            Object f162265e;

            /* renamed from: f, reason: collision with root package name */
            Object f162266f;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162261a = obj;
                this.f162262b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, InterfaceC17152f interfaceC17152f) {
            this.f162259a = function2;
            this.f162260b = interfaceC17152f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof tv.C17164s.c.a
                if (r0 == 0) goto L13
                r0 = r8
                tv.s$c$a r0 = (tv.C17164s.c.a) r0
                int r1 = r0.f162262b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162262b = r1
                goto L18
            L13:
                tv.s$c$a r0 = new tv.s$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f162261a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162262b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f162266f
                uv.t r7 = (kotlin.C17352t) r7
                java.lang.Object r2 = r0.f162265e
                tv.g r2 = (tv.InterfaceC17153g) r2
                java.lang.Object r4 = r0.f162264d
                tv.s$c r4 = (tv.C17164s.c) r4
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                kotlin.ResultKt.b(r8)
                uv.t r8 = new uv.t
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f162259a     // Catch: java.lang.Throwable -> L86
                r0.f162264d = r6     // Catch: java.lang.Throwable -> L86
                r0.f162265e = r7     // Catch: java.lang.Throwable -> L86
                r0.f162266f = r8     // Catch: java.lang.Throwable -> L86
                r0.f162262b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.InlineMarker.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.InlineMarker.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                tv.f r7 = r4.f162260b
                r8 = 0
                r0.f162264d = r8
                r0.f162265e = r8
                r0.f162266f = r8
                r0.f162262b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17164s.c.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final void b(InterfaceC17153g<?> interfaceC17153g) {
        if (interfaceC17153g instanceof W) {
            throw ((W) interfaceC17153g).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(tv.InterfaceC17153g<? super T> r4, kotlin.jvm.functions.Function3<? super tv.InterfaceC17153g<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof tv.C17164s.a
            if (r0 == 0) goto L13
            r0 = r7
            tv.s$a r0 = (tv.C17164s.a) r0
            int r1 = r0.f162251c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162251c = r1
            goto L18
        L13:
            tv.s$a r0 = new tv.s$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f162250b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162251c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f162249a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.b(r7)
            r0.f162249a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f162251c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            kotlin.ExceptionsKt.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17164s.c(tv.g, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC17152f<T> d(InterfaceC17152f<? extends T> interfaceC17152f, Function3<? super InterfaceC17153g<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new b(interfaceC17152f, function3);
    }

    public static final <T> InterfaceC17152f<T> e(InterfaceC17152f<? extends T> interfaceC17152f, Function2<? super InterfaceC17153g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new c(function2, interfaceC17152f);
    }
}
