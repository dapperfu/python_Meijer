package tv;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"T", "Ltv/f;", "", "count", "b", "(Ltv/f;I)Ltv/f;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "c", "(Ltv/f;Lkotlin/jvm/functions/Function2;)Ltv/f;", "e", "Ltv/g;", "value", "ownershipMarker", "", "d", "(Ltv/g;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17166u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/u$a", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.u$a */
    public static final class a<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f162300b;

        public a(InterfaceC17152f interfaceC17152f, int i10) {
            this.f162299a = interfaceC17152f;
            this.f162300b = i10;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
            Object objCollect = this.f162299a.collect(new b(new Ref.IntRef(), this.f162300b, interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.u$b */
    static final class b<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f162301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f162302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f162303c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT}, m = "emit")
        /* renamed from: tv.u$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<T> f162305b;

            /* renamed from: c, reason: collision with root package name */
            int f162306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f162305b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162304a = obj;
                this.f162306c |= Integer.MIN_VALUE;
                return this.f162305b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(Ref.IntRef intRef, int i10, InterfaceC17153g<? super T> interfaceC17153g) {
            this.f162301a = intRef;
            this.f162302b = i10;
            this.f162303c = interfaceC17153g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof tv.C17166u.b.a
                if (r0 == 0) goto L13
                r0 = r7
                tv.u$b$a r0 = (tv.C17166u.b.a) r0
                int r1 = r0.f162306c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162306c = r1
                goto L18
            L13:
                tv.u$b$a r0 = new tv.u$b$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f162304a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162306c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.ResultKt.b(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f162301a
                int r2 = r7.f142833a
                int r4 = r5.f162302b
                if (r2 < r4) goto L4a
                tv.g<T> r7 = r5.f162303c
                r0.f162306c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f142833a = r2
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/u$c", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.u$c */
    public static final class c<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f162308b;

        public c(InterfaceC17152f interfaceC17152f, Function2 function2) {
            this.f162307a = interfaceC17152f;
            this.f162308b = function2;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
            Object objCollect = this.f162307a.collect(new d(new Ref.BooleanRef(), interfaceC17153g, this.f162308b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.u$d */
    static final class d<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f162309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f162310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f162311c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
        /* renamed from: tv.u$d$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f162312a;

            /* renamed from: b, reason: collision with root package name */
            Object f162313b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f162314c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d<T> f162315d;

            /* renamed from: e, reason: collision with root package name */
            int f162316e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f162315d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162314c = obj;
                this.f162316e |= Integer.MIN_VALUE;
                return this.f162315d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Ref.BooleanRef booleanRef, InterfaceC17153g<? super T> interfaceC17153g, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f162309a = booleanRef;
            this.f162310b = interfaceC17153g;
            this.f162311c = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof tv.C17166u.d.a
                if (r0 == 0) goto L13
                r0 = r8
                tv.u$d$a r0 = (tv.C17166u.d.a) r0
                int r1 = r0.f162316e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162316e = r1
                goto L18
            L13:
                tv.u$d$a r0 = new tv.u$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f162314c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162316e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.ResultKt.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f162313b
                java.lang.Object r2 = r0.f162312a
                tv.u$d r2 = (tv.C17166u.d) r2
                kotlin.ResultKt.b(r8)
                goto L6c
            L41:
                kotlin.ResultKt.b(r8)
                goto L59
            L45:
                kotlin.ResultKt.b(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f162309a
                boolean r8 = r8.f142828a
                if (r8 == 0) goto L5c
                tv.g<T> r8 = r6.f162310b
                r0.f162316e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f162311c
                r0.f162312a = r6
                r0.f162313b = r7
                r0.f162316e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f162309a
                r8.f142828a = r5
                tv.g<T> r8 = r2.f162310b
                r2 = 0
                r0.f162312a = r2
                r0.f162313b = r2
                r0.f162316e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: tv.u$e */
    static final class e<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162317a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f162318b;

        /* renamed from: c, reason: collision with root package name */
        int f162319c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162318b = obj;
            this.f162319c |= Integer.MIN_VALUE;
            return C17166u.d(null, null, null, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/u$f", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.u$f */
    public static final class f<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f162321b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        /* renamed from: tv.u$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162322a;

            /* renamed from: b, reason: collision with root package name */
            int f162323b;

            /* renamed from: d, reason: collision with root package name */
            Object f162325d;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162322a = obj;
                this.f162323b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC17152f interfaceC17152f, int i10) {
            this.f162320a = interfaceC17152f;
            this.f162321b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof tv.C17166u.f.a
                if (r0 == 0) goto L13
                r0 = r10
                tv.u$f$a r0 = (tv.C17166u.f.a) r0
                int r1 = r0.f162323b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162323b = r1
                goto L18
            L13:
                tv.u$f$a r0 = new tv.u$f$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f162322a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162323b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f162325d
                kotlin.ResultKt.b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
                r2.<init>()
                tv.f r4 = r8.f162320a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                tv.u$g r5 = new tv.u$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                int r6 = r8.f162321b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f162325d = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f162323b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                kotlin.C17346n.a(r10, r9)
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.f.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.u$g */
    static final class g<T> implements InterfaceC17153g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f162326a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f162327b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f162328c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f162329d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        /* renamed from: tv.u$g$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162330a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g<T> f162331b;

            /* renamed from: c, reason: collision with root package name */
            int f162332c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g<? super T> gVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f162331b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162330a = obj;
                this.f162332c |= Integer.MIN_VALUE;
                return this.f162331b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(Ref.IntRef intRef, int i10, InterfaceC17153g<? super T> interfaceC17153g, Object obj) {
            this.f162326a = intRef;
            this.f162327b = i10;
            this.f162328c = interfaceC17153g;
            this.f162329d = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (tv.C17166u.d(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof tv.C17166u.g.a
                if (r0 == 0) goto L13
                r0 = r7
                tv.u$g$a r0 = (tv.C17166u.g.a) r0
                int r1 = r0.f162332c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162332c = r1
                goto L18
            L13:
                tv.u$g$a r0 = new tv.u$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f162330a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162332c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.ResultKt.b(r7)
                goto L51
            L38:
                kotlin.ResultKt.b(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f162326a
                int r2 = r7.f142833a
                int r2 = r2 + r4
                r7.f142833a = r2
                int r7 = r5.f162327b
                if (r2 >= r7) goto L54
                tv.g<T> r7 = r5.f162328c
                r0.f162332c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            L54:
                tv.g<T> r7 = r5.f162328c
                java.lang.Object r2 = r5.f162329d
                r0.f162332c = r3
                java.lang.Object r6 = tv.C17166u.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"tv/u$h", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.u$h */
    public static final class h<T> implements InterfaceC17152f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f162333a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f162334b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "collect")
        /* renamed from: tv.u$h$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f162335a;

            /* renamed from: b, reason: collision with root package name */
            int f162336b;

            /* renamed from: d, reason: collision with root package name */
            Object f162338d;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162335a = obj;
                this.f162336b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC17152f interfaceC17152f, Function2 function2) {
            this.f162333a = interfaceC17152f;
            this.f162334b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17152f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(tv.InterfaceC17153g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof tv.C17166u.h.a
                if (r0 == 0) goto L13
                r0 = r7
                tv.u$h$a r0 = (tv.C17166u.h.a) r0
                int r1 = r0.f162336b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162336b = r1
                goto L18
            L13:
                tv.u$h$a r0 = new tv.u$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f162335a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162336b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f162338d
                tv.u$i r6 = (tv.C17166u.i) r6
                kotlin.ResultKt.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                goto L5a
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                kotlin.ResultKt.b(r7)
                tv.f r7 = r5.f162333a
                tv.u$i r2 = new tv.u$i
                kotlin.jvm.functions.Function2 r4 = r5.f162334b
                r2.<init>(r4, r6)
                r0.f162338d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                r0.f162336b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                if (r6 != r1) goto L5a
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlin.C17346n.a(r7, r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                qv.E0.i(r6)
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.h.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"tv/u$i", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: tv.u$i */
    public static final class i<T> implements InterfaceC17153g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f162339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g f162340b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        /* renamed from: tv.u$i$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f162341a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f162342b;

            /* renamed from: c, reason: collision with root package name */
            int f162343c;

            /* renamed from: e, reason: collision with root package name */
            Object f162345e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f162342b = obj;
                this.f162343c |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, InterfaceC17153g interfaceC17153g) {
            this.f162339a = function2;
            this.f162340b = interfaceC17153g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // tv.InterfaceC17153g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof tv.C17166u.i.a
                if (r0 == 0) goto L13
                r0 = r9
                tv.u$i$a r0 = (tv.C17166u.i.a) r0
                int r1 = r0.f162343c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f162343c = r1
                goto L18
            L13:
                tv.u$i$a r0 = new tv.u$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f162342b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f162343c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f162341a
                tv.u$i r8 = (tv.C17166u.i) r8
                kotlin.ResultKt.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f162345e
                java.lang.Object r2 = r0.f162341a
                tv.u$i r2 = (tv.C17166u.i) r2
                kotlin.ResultKt.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.ResultKt.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f162339a
                r0.f162341a = r7
                r0.f162345e = r8
                r0.f162343c = r4
                r2 = 6
                kotlin.jvm.internal.InlineMarker.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.InlineMarker.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                tv.g r2 = r8.f162340b
                r0.f162341a = r8
                r5 = 0
                r0.f162345e = r5
                r0.f162343c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> InterfaceC17152f<T> b(InterfaceC17152f<? extends T> interfaceC17152f, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC17152f, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final <T> InterfaceC17152f<T> c(InterfaceC17152f<? extends T> interfaceC17152f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new c(interfaceC17152f, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(tv.InterfaceC17153g<? super T> r4, T r5, java.lang.Object r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof tv.C17166u.e
            if (r0 == 0) goto L13
            r0 = r7
            tv.u$e r0 = (tv.C17166u.e) r0
            int r1 = r0.f162319c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162319c = r1
            goto L18
        L13:
            tv.u$e r0 = new tv.u$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f162318b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f162319c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f162317a
            kotlin.ResultKt.b(r7)
            goto L41
        L33:
            kotlin.ResultKt.b(r7)
            r0.f162317a = r6
            r0.f162319c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17166u.d(tv.g, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC17152f<T> e(InterfaceC17152f<? extends T> interfaceC17152f, int i10) {
        if (i10 > 0) {
            return new f(interfaceC17152f, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T> InterfaceC17152f<T> f(InterfaceC17152f<? extends T> interfaceC17152f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new h(interfaceC17152f, function2);
    }
}
