package pv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Lpv/f;", "a", "(Lpv/f;)Lpv/f;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(Lpv/f;Lkotlin/jvm/functions/Function2;)Lpv/f;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157722a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: pv.y$a$a, reason: collision with other inner class name */
        public static final class C2447a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f157723a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
            /* renamed from: pv.y$a$a$a, reason: collision with other inner class name */
            public static final class C2448a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f157724a;

                /* renamed from: b, reason: collision with root package name */
                int f157725b;

                public C2448a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f157724a = obj;
                    this.f157725b |= Integer.MIN_VALUE;
                    return C2447a.this.emit(null, this);
                }
            }

            public C2447a(InterfaceC16562g interfaceC16562g) {
                this.f157723a = interfaceC16562g;
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
                    boolean r0 = r6 instanceof pv.y.a.C2447a.C2448a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pv.y$a$a$a r0 = (pv.y.a.C2447a.C2448a) r0
                    int r1 = r0.f157725b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f157725b = r1
                    goto L18
                L13:
                    pv.y$a$a$a r0 = new pv.y$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f157724a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f157725b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f157723a
                    if (r5 == 0) goto L41
                    r0.f157725b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pv.y.a.C2447a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC16561f interfaceC16561f) {
            this.f157722a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f157722a.collect(new C2447a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f157727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f157728b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f157729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f157730b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
            /* renamed from: pv.y$b$a$a, reason: collision with other inner class name */
            public static final class C2449a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f157731a;

                /* renamed from: b, reason: collision with root package name */
                int f157732b;

                /* renamed from: d, reason: collision with root package name */
                Object f157734d;

                /* renamed from: e, reason: collision with root package name */
                Object f157735e;

                public C2449a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f157731a = obj;
                    this.f157732b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, Function2 function2) {
                this.f157729a = interfaceC16562g;
                this.f157730b = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof pv.y.b.a.C2449a
                    if (r0 == 0) goto L13
                    r0 = r7
                    pv.y$b$a$a r0 = (pv.y.b.a.C2449a) r0
                    int r1 = r0.f157732b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f157732b = r1
                    goto L18
                L13:
                    pv.y$b$a$a r0 = new pv.y$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f157731a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f157732b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f157735e
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r2 = r0.f157734d
                    kotlin.ResultKt.b(r7)
                    goto L5c
                L3e:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f157729a
                    kotlin.jvm.functions.Function2 r2 = r5.f157730b
                    r0.f157734d = r6
                    r0.f157735e = r7
                    r0.f157732b = r4
                    r4 = 6
                    kotlin.jvm.internal.InlineMarker.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.InlineMarker.c(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f157734d = r7
                    r0.f157735e = r7
                    r0.f157732b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: pv.y.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC16561f interfaceC16561f, Function2 function2) {
            this.f157727a = interfaceC16561f;
            this.f157728b = function2;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f157727a.collect(new a(interfaceC16562g, this.f157728b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    public static final <T> InterfaceC16561f<T> a(InterfaceC16561f<? extends T> interfaceC16561f) {
        return new a(interfaceC16561f);
    }

    public static final <T> InterfaceC16561f<T> b(InterfaceC16561f<? extends T> interfaceC16561f, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new b(interfaceC16561f, function2);
    }
}
