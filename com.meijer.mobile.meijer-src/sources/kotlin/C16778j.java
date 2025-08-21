package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import ov.w;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@¢\u0006\u0004\b\u000e\u0010\u000f*\u001c\b\u0002\u0010\u0011\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010¨\u0006\u0012"}, d2 = {"R", "T", "Lpv/g;", "", "Lpv/f;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Lpv/g;[Lpv/f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16778j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    /* renamed from: qv.j$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159049a;

        /* renamed from: b, reason: collision with root package name */
        Object f159050b;

        /* renamed from: c, reason: collision with root package name */
        int f159051c;

        /* renamed from: d, reason: collision with root package name */
        int f159052d;

        /* renamed from: e, reason: collision with root package name */
        int f159053e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f159054f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T>[] f159055g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<T[]> f159056h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC16562g<? super R>, T[], Continuation<? super Unit>, Object> f159057i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<R> f159058j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: qv.j$a$a, reason: collision with other inner class name */
        static final class C2475a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f159059a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f<T>[] f159060b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f159061c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f159062d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ov.g<IndexedValue<Object>> f159063e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: qv.j$a$a$a, reason: collision with other inner class name */
            static final class C2476a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ov.g<IndexedValue<Object>> f159064a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f159065b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                /* renamed from: qv.j$a$a$a$a, reason: collision with other inner class name */
                static final class C2477a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f159066a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2476a<T> f159067b;

                    /* renamed from: c, reason: collision with root package name */
                    int f159068c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2477a(C2476a<? super T> c2476a, Continuation<? super C2477a> continuation) {
                        super(continuation);
                        this.f159067b = c2476a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f159066a = obj;
                        this.f159068c |= Integer.MIN_VALUE;
                        return this.f159067b.emit(null, this);
                    }
                }

                C2476a(ov.g<IndexedValue<Object>> gVar, int i10) {
                    this.f159064a = gVar;
                    this.f159065b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (mv.j1.a(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlin.C16778j.a.C2475a.C2476a.C2477a
                        if (r0 == 0) goto L13
                        r0 = r8
                        qv.j$a$a$a$a r0 = (kotlin.C16778j.a.C2475a.C2476a.C2477a) r0
                        int r1 = r0.f159068c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f159068c = r1
                        goto L18
                    L13:
                        qv.j$a$a$a$a r0 = new qv.j$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f159066a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f159068c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.ResultKt.b(r8)
                        goto L4d
                    L38:
                        kotlin.ResultKt.b(r8)
                        ov.g<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f159064a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.f159065b
                        r2.<init>(r5, r7)
                        r0.f159068c = r4
                        java.lang.Object r7 = r8.r(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f159068c = r3
                        java.lang.Object r7 = mv.j1.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f143329a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.C16778j.a.C2475a.C2476a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2475a(InterfaceC16561f<? extends T>[] interfaceC16561fArr, int i10, AtomicInteger atomicInteger, ov.g<IndexedValue<Object>> gVar, Continuation<? super C2475a> continuation) {
                super(2, continuation);
                this.f159060b = interfaceC16561fArr;
                this.f159061c = i10;
                this.f159062d = atomicInteger;
                this.f159063e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2475a(this.f159060b, this.f159061c, this.f159062d, this.f159063e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C2475a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f159059a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f[] interfaceC16561fArr = this.f159060b;
                        int i11 = this.f159061c;
                        InterfaceC16561f interfaceC16561f = interfaceC16561fArr[i11];
                        C2476a c2476a = new C2476a(this.f159063e, i11);
                        this.f159059a = 1;
                        if (interfaceC16561f.collect(c2476a, this) == objF) {
                            return objF;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        w.a.a(this.f159063e, null, 1, null);
                    }
                    return Unit.f143329a;
                } finally {
                    if (this.f159062d.decrementAndGet() == 0) {
                        w.a.a(this.f159063e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16561f<? extends T>[] interfaceC16561fArr, Function0<T[]> function0, Function3<? super InterfaceC16562g<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC16562g<? super R> interfaceC16562g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159055g = interfaceC16561fArr;
            this.f159056h = function0;
            this.f159057i = function3;
            this.f159058j = interfaceC16562g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f159055g, this.f159056h, this.f159057i, this.f159058j, continuation);
            aVar.f159054f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C16778j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @PublishedApi
    public static final <R, T> Object a(InterfaceC16562g<? super R> interfaceC16562g, InterfaceC16561f<? extends T>[] interfaceC16561fArr, Function0<T[]> function0, Function3<? super InterfaceC16562g<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objA = C16781m.a(new a(interfaceC16561fArr, function0, function3, interfaceC16562g, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }
}
