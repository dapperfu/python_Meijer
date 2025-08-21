package pv;

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

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"T", "Lpv/f;", "", "count", "b", "(Lpv/f;I)Lpv/f;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "c", "(Lpv/f;Lkotlin/jvm/functions/Function2;)Lpv/f;", "e", "Lpv/g;", "value", "ownershipMarker", "", "d", "(Lpv/g;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: pv.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16575u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/u$a", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.u$a */
    public static final class a<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f157614b;

        public a(InterfaceC16561f interfaceC16561f, int i10) {
            this.f157613a = interfaceC16561f;
            this.f157614b = i10;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            Object objCollect = this.f157613a.collect(new b(new Ref.IntRef(), this.f157614b, interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.u$b */
    static final class b<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f157615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f157616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f157617c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT}, m = "emit")
        /* renamed from: pv.u$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157618a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<T> f157619b;

            /* renamed from: c, reason: collision with root package name */
            int f157620c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f157619b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157618a = obj;
                this.f157620c |= Integer.MIN_VALUE;
                return this.f157619b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(Ref.IntRef intRef, int i10, InterfaceC16562g<? super T> interfaceC16562g) {
            this.f157615a = intRef;
            this.f157616b = i10;
            this.f157617c = interfaceC16562g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16575u.b.a
                if (r0 == 0) goto L13
                r0 = r7
                pv.u$b$a r0 = (pv.C16575u.b.a) r0
                int r1 = r0.f157620c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157620c = r1
                goto L18
            L13:
                pv.u$b$a r0 = new pv.u$b$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f157618a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157620c
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
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f157615a
                int r2 = r7.f143740a
                int r4 = r5.f157616b
                if (r2 < r4) goto L4a
                pv.g<T> r7 = r5.f157617c
                r0.f157620c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f143740a = r2
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/u$c", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.u$c */
    public static final class c<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f157622b;

        public c(InterfaceC16561f interfaceC16561f, Function2 function2) {
            this.f157621a = interfaceC16561f;
            this.f157622b = function2;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            Object objCollect = this.f157621a.collect(new d(new Ref.BooleanRef(), interfaceC16562g, this.f157622b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.u$d */
    static final class d<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f157623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f157624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f157625c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
        /* renamed from: pv.u$d$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f157626a;

            /* renamed from: b, reason: collision with root package name */
            Object f157627b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f157628c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d<T> f157629d;

            /* renamed from: e, reason: collision with root package name */
            int f157630e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f157629d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157628c = obj;
                this.f157630e |= Integer.MIN_VALUE;
                return this.f157629d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(Ref.BooleanRef booleanRef, InterfaceC16562g<? super T> interfaceC16562g, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f157623a = booleanRef;
            this.f157624b = interfaceC16562g;
            this.f157625c = function2;
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
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof pv.C16575u.d.a
                if (r0 == 0) goto L13
                r0 = r8
                pv.u$d$a r0 = (pv.C16575u.d.a) r0
                int r1 = r0.f157630e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157630e = r1
                goto L18
            L13:
                pv.u$d$a r0 = new pv.u$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f157628c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157630e
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
                java.lang.Object r7 = r0.f157627b
                java.lang.Object r2 = r0.f157626a
                pv.u$d r2 = (pv.C16575u.d) r2
                kotlin.ResultKt.b(r8)
                goto L6c
            L41:
                kotlin.ResultKt.b(r8)
                goto L59
            L45:
                kotlin.ResultKt.b(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f157623a
                boolean r8 = r8.f143735a
                if (r8 == 0) goto L5c
                pv.g<T> r8 = r6.f157624b
                r0.f157630e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f157625c
                r0.f157626a = r6
                r0.f157627b = r7
                r0.f157630e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f157623a
                r8.f143735a = r5
                pv.g<T> r8 = r2.f157624b
                r2 = 0
                r0.f157626a = r2
                r0.f157627b = r2
                r0.f157630e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: pv.u$e */
    static final class e<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f157631a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f157632b;

        /* renamed from: c, reason: collision with root package name */
        int f157633c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f157632b = obj;
            this.f157633c |= Integer.MIN_VALUE;
            return C16575u.d(null, null, null, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/u$f", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.u$f */
    public static final class f<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f157635b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        /* renamed from: pv.u$f$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157636a;

            /* renamed from: b, reason: collision with root package name */
            int f157637b;

            /* renamed from: d, reason: collision with root package name */
            Object f157639d;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157636a = obj;
                this.f157637b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC16561f interfaceC16561f, int i10) {
            this.f157634a = interfaceC16561f;
            this.f157635b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16561f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(pv.InterfaceC16562g<? super T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof pv.C16575u.f.a
                if (r0 == 0) goto L13
                r0 = r10
                pv.u$f$a r0 = (pv.C16575u.f.a) r0
                int r1 = r0.f157637b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157637b = r1
                goto L18
            L13:
                pv.u$f$a r0 = new pv.u$f$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f157636a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157637b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f157639d
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
                pv.f r4 = r8.f157634a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                pv.u$g r5 = new pv.u$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                int r6 = r8.f157635b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f157639d = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                r0.f157637b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                kotlin.C16782n.a(r10, r9)
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.f.collect(pv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.u$g */
    static final class g<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f157640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f157641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f157642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f157643d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        /* renamed from: pv.u$g$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g<T> f157645b;

            /* renamed from: c, reason: collision with root package name */
            int f157646c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g<? super T> gVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f157645b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157644a = obj;
                this.f157646c |= Integer.MIN_VALUE;
                return this.f157645b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(Ref.IntRef intRef, int i10, InterfaceC16562g<? super T> interfaceC16562g, Object obj) {
            this.f157640a = intRef;
            this.f157641b = i10;
            this.f157642c = interfaceC16562g;
            this.f157643d = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (pv.C16575u.d(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16575u.g.a
                if (r0 == 0) goto L13
                r0 = r7
                pv.u$g$a r0 = (pv.C16575u.g.a) r0
                int r1 = r0.f157646c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157646c = r1
                goto L18
            L13:
                pv.u$g$a r0 = new pv.u$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f157644a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157646c
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
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f157640a
                int r2 = r7.f143740a
                int r2 = r2 + r4
                r7.f143740a = r2
                int r7 = r5.f157641b
                if (r2 >= r7) goto L54
                pv.g<T> r7 = r5.f157642c
                r0.f157646c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            L54:
                pv.g<T> r7 = r5.f157642c
                java.lang.Object r2 = r5.f157643d
                r0.f157646c = r3
                java.lang.Object r6 = pv.C16575u.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/u$h", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.u$h */
    public static final class h<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f157648b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "collect")
        /* renamed from: pv.u$h$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157649a;

            /* renamed from: b, reason: collision with root package name */
            int f157650b;

            /* renamed from: d, reason: collision with root package name */
            Object f157652d;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157649a = obj;
                this.f157650b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC16561f interfaceC16561f, Function2 function2) {
            this.f157647a = interfaceC16561f;
            this.f157648b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16561f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(pv.InterfaceC16562g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16575u.h.a
                if (r0 == 0) goto L13
                r0 = r7
                pv.u$h$a r0 = (pv.C16575u.h.a) r0
                int r1 = r0.f157650b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157650b = r1
                goto L18
            L13:
                pv.u$h$a r0 = new pv.u$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f157649a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157650b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f157652d
                pv.u$i r6 = (pv.C16575u.i) r6
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
                pv.f r7 = r5.f157647a
                pv.u$i r2 = new pv.u$i
                kotlin.jvm.functions.Function2 r4 = r5.f157648b
                r2.<init>(r4, r6)
                r0.f157652d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                r0.f157650b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                if (r6 != r1) goto L5a
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlin.C16782n.a(r7, r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                mv.E0.i(r6)
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.h.collect(pv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pv/u$i", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.u$i */
    public static final class i<T> implements InterfaceC16562g<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f157653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g f157654b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        /* renamed from: pv.u$i$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f157655a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f157656b;

            /* renamed from: c, reason: collision with root package name */
            int f157657c;

            /* renamed from: e, reason: collision with root package name */
            Object f157659e;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157656b = obj;
                this.f157657c |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, InterfaceC16562g interfaceC16562g) {
            this.f157653a = function2;
            this.f157654b = interfaceC16562g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof pv.C16575u.i.a
                if (r0 == 0) goto L13
                r0 = r9
                pv.u$i$a r0 = (pv.C16575u.i.a) r0
                int r1 = r0.f157657c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157657c = r1
                goto L18
            L13:
                pv.u$i$a r0 = new pv.u$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f157656b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157657c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f157655a
                pv.u$i r8 = (pv.C16575u.i) r8
                kotlin.ResultKt.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f157659e
                java.lang.Object r2 = r0.f157655a
                pv.u$i r2 = (pv.C16575u.i) r2
                kotlin.ResultKt.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.ResultKt.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f157653a
                r0.f157655a = r7
                r0.f157659e = r8
                r0.f157657c = r4
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
                pv.g r2 = r8.f157654b
                r0.f157655a = r8
                r5 = 0
                r0.f157659e = r5
                r0.f157657c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> InterfaceC16561f<T> b(InterfaceC16561f<? extends T> interfaceC16561f, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC16561f, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final <T> InterfaceC16561f<T> c(InterfaceC16561f<? extends T> interfaceC16561f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new c(interfaceC16561f, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(pv.InterfaceC16562g<? super T> r4, T r5, java.lang.Object r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof pv.C16575u.e
            if (r0 == 0) goto L13
            r0 = r7
            pv.u$e r0 = (pv.C16575u.e) r0
            int r1 = r0.f157633c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157633c = r1
            goto L18
        L13:
            pv.u$e r0 = new pv.u$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f157632b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f157633c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f157631a
            kotlin.ResultKt.b(r7)
            goto L41
        L33:
            kotlin.ResultKt.b(r7)
            r0.f157631a = r6
            r0.f157633c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.C16575u.d(pv.g, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> InterfaceC16561f<T> e(InterfaceC16561f<? extends T> interfaceC16561f, int i10) {
        if (i10 > 0) {
            return new f(interfaceC16561f, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T> InterfaceC16561f<T> f(InterfaceC16561f<? extends T> interfaceC16561f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new h(interfaceC16561f, function2);
    }
}
