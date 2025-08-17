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
import qv.InterfaceC16622O;
import sv.w;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@¢\u0006\u0004\b\u000e\u0010\u000f*\u001c\b\u0002\u0010\u0011\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00102\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010¨\u0006\u0012"}, d2 = {"R", "T", "Ltv/g;", "", "Ltv/f;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Ltv/g;[Ltv/f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17342j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    /* renamed from: uv.j$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f163573a;

        /* renamed from: b, reason: collision with root package name */
        Object f163574b;

        /* renamed from: c, reason: collision with root package name */
        int f163575c;

        /* renamed from: d, reason: collision with root package name */
        int f163576d;

        /* renamed from: e, reason: collision with root package name */
        int f163577e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f163578f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T>[] f163579g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<T[]> f163580h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17153g<? super R>, T[], Continuation<? super Unit>, Object> f163581i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<R> f163582j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: uv.j$a$a, reason: collision with other inner class name */
        static final class C2587a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f163583a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f<T>[] f163584b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f163585c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f163586d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ sv.g<IndexedValue<Object>> f163587e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: uv.j$a$a$a, reason: collision with other inner class name */
            static final class C2588a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ sv.g<IndexedValue<Object>> f163588a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f163589b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                /* renamed from: uv.j$a$a$a$a, reason: collision with other inner class name */
                static final class C2589a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f163590a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2588a<T> f163591b;

                    /* renamed from: c, reason: collision with root package name */
                    int f163592c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2589a(C2588a<? super T> c2588a, Continuation<? super C2589a> continuation) {
                        super(continuation);
                        this.f163591b = c2588a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f163590a = obj;
                        this.f163592c |= Integer.MIN_VALUE;
                        return this.f163591b.emit(null, this);
                    }
                }

                C2588a(sv.g<IndexedValue<Object>> gVar, int i10) {
                    this.f163588a = gVar;
                    this.f163589b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (qv.j1.a(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlin.C17342j.a.C2587a.C2588a.C2589a
                        if (r0 == 0) goto L13
                        r0 = r8
                        uv.j$a$a$a$a r0 = (kotlin.C17342j.a.C2587a.C2588a.C2589a) r0
                        int r1 = r0.f163592c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f163592c = r1
                        goto L18
                    L13:
                        uv.j$a$a$a$a r0 = new uv.j$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f163590a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f163592c
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
                        sv.g<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f163588a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.f163589b
                        r2.<init>(r5, r7)
                        r0.f163592c = r4
                        java.lang.Object r7 = r8.r(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f163592c = r3
                        java.lang.Object r7 = qv.j1.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f142422a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.C17342j.a.C2587a.C2588a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2587a(InterfaceC17152f<? extends T>[] interfaceC17152fArr, int i10, AtomicInteger atomicInteger, sv.g<IndexedValue<Object>> gVar, Continuation<? super C2587a> continuation) {
                super(2, continuation);
                this.f163584b = interfaceC17152fArr;
                this.f163585c = i10;
                this.f163586d = atomicInteger;
                this.f163587e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2587a(this.f163584b, this.f163585c, this.f163586d, this.f163587e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2587a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f163583a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17152f[] interfaceC17152fArr = this.f163584b;
                        int i11 = this.f163585c;
                        InterfaceC17152f interfaceC17152f = interfaceC17152fArr[i11];
                        C2588a c2588a = new C2588a(this.f163587e, i11);
                        this.f163583a = 1;
                        if (interfaceC17152f.collect(c2588a, this) == objF) {
                            return objF;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        w.a.a(this.f163587e, null, 1, null);
                    }
                    return Unit.f142422a;
                } finally {
                    if (this.f163586d.decrementAndGet() == 0) {
                        w.a.a(this.f163587e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17152f<? extends T>[] interfaceC17152fArr, Function0<T[]> function0, Function3<? super InterfaceC17153g<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163579g = interfaceC17152fArr;
            this.f163580h = function0;
            this.f163581i = function3;
            this.f163582j = interfaceC17153g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f163579g, this.f163580h, this.f163581i, this.f163582j, continuation);
            aVar.f163578f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17342j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @PublishedApi
    public static final <R, T> Object a(InterfaceC17153g<? super R> interfaceC17153g, InterfaceC17152f<? extends T>[] interfaceC17152fArr, Function0<T[]> function0, Function3<? super InterfaceC17153g<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objA = C17345m.a(new a(interfaceC17152fArr, function0, function3, interfaceC17153g, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }
}
