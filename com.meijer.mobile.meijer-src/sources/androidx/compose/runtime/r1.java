package androidx.compose.runtime;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Lpv/P;", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/z1;", "c", "(Lpv/P;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "R", "Lpv/f;", "initial", "b", "(Lpv/f;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Lkotlin/Function0;", "block", "e", "(Lkotlin/jvm/functions/Function0;)Lpv/f;", "LZ/X;", "", "", "set", "", "d", "(LZ/X;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class r1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Landroidx/compose/runtime/D0;", "", "<anonymous>", "(Landroidx/compose/runtime/D0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {67, 68}, m = "invokeSuspend")
    static final class a<R> extends SuspendLambda implements Function2<D0<R>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50574a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50575b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f50576c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f50577d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0003\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.r1$a$a, reason: collision with other inner class name */
        static final class C1053a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D0<R> f50578a;

            C1053a(D0<R> d02) {
                this.f50578a = d02;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(T t10, Continuation<? super Unit> continuation) {
                this.f50578a.setValue(t10);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {68}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f50579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f<T> f50580b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ D0<R> f50581c;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0003\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.runtime.r1$a$b$a, reason: collision with other inner class name */
            static final class C1054a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ D0<R> f50582a;

                C1054a(D0<R> d02) {
                    this.f50582a = d02;
                }

                @Override // pv.InterfaceC16562g
                public final Object emit(T t10, Continuation<? super Unit> continuation) {
                    this.f50582a.setValue(t10);
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f50580b, this.f50581c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC16561f<? extends T> interfaceC16561f, D0<R> d02, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f50580b = interfaceC16561f;
                this.f50581c = d02;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f50579a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16561f<T> interfaceC16561f = this.f50580b;
                    C1054a c1054a = new C1054a(this.f50581c);
                    this.f50579a = 1;
                    if (interfaceC16561f.collect(c1054a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f50576c, this.f50577d, continuation);
            aVar.f50575b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D0<R> d02, Continuation<? super Unit> continuation) {
            return ((a) create(d02, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CoroutineContext coroutineContext, InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f50576c = coroutineContext;
            this.f50577d = interfaceC16561f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r1.collect(r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (mv.C15805i.g(r1, r3, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f50574a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.ResultKt.b(r7)
                goto L4f
            L1b:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f50575b
                androidx.compose.runtime.D0 r7 = (androidx.compose.runtime.D0) r7
                kotlin.coroutines.CoroutineContext r1 = r6.f50576c
                kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f143553a
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r4)
                if (r1 == 0) goto L3c
                pv.f<T> r1 = r6.f50577d
                androidx.compose.runtime.r1$a$a r2 = new androidx.compose.runtime.r1$a$a
                r2.<init>(r7)
                r6.f50574a = r3
                java.lang.Object r7 = r1.collect(r2, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3c:
                kotlin.coroutines.CoroutineContext r1 = r6.f50576c
                androidx.compose.runtime.r1$a$b r3 = new androidx.compose.runtime.r1$a$b
                pv.f<T> r4 = r6.f50577d
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f50574a = r2
                java.lang.Object r7 = mv.C15805i.g(r1, r3, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lpv/g;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {142, 146, 169}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b<T> extends SuspendLambda implements Function2<InterfaceC16562g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f50583a;

        /* renamed from: b, reason: collision with root package name */
        Object f50584b;

        /* renamed from: c, reason: collision with root package name */
        Object f50585c;

        /* renamed from: d, reason: collision with root package name */
        Object f50586d;

        /* renamed from: e, reason: collision with root package name */
        Object f50587e;

        /* renamed from: f, reason: collision with root package name */
        int f50588f;

        /* renamed from: g, reason: collision with root package name */
        int f50589g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f50590h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<T> f50591i;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<Object, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Z.X<Object> f50592f;

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z.X<Object> x10) {
                super(1);
                this.f50592f = x10;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                if (obj instanceof M0.x) {
                    ((M0.x) obj).L(androidx.compose.runtime.snapshots.e.a(4));
                }
                this.f50592f.h(obj);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.runtime.r1$b$b, reason: collision with other inner class name */
        static final class C1055b extends Lambda implements Function2<Set<? extends Object>, androidx.compose.runtime.snapshots.g, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ov.g<Set<Object>> f50593f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1055b(ov.g<Set<Object>> gVar) {
                super(2);
                this.f50593f = gVar;
            }

            public final void a(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                if (!(set instanceof D0.e)) {
                    Set<? extends Object> set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        return;
                    }
                    for (T t10 : set2) {
                        if (!(t10 instanceof M0.x) || ((M0.x) t10).w(androidx.compose.runtime.snapshots.e.a(4))) {
                        }
                    }
                    return;
                }
                Z.j0<T> j0VarA = ((D0.e) set).a();
                Object[] objArr = j0VarA.elements;
                long[] jArr = j0VarA.metadata;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (!(obj instanceof M0.x) || ((M0.x) obj).w(androidx.compose.runtime.snapshots.e.a(4))) {
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 == length) {
                        return;
                    } else {
                        i10++;
                    }
                }
                this.f50593f.k(set);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                a(set, gVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends T> function0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f50591i = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f50591i, continuation);
            bVar.f50590h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, pv.g] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, pv.g] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T extends R, R> z1<R> b(InterfaceC16561f<? extends T> interfaceC16561f, R r10, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean zD = composer.D(coroutineContext2) | composer.D(interfaceC16561f);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new a(coroutineContext2, interfaceC16561f, null);
            composer.t(objB);
        }
        z1<R> z1VarL = o1.l(r10, interfaceC16561f, coroutineContext2, (Function2) objB, composer, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarL;
    }

    public static final <T> z1<T> c(pv.P<? extends T> p10, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        z1<T> z1VarA = o1.a(p10, p10.getValue(), coroutineContext2, composer, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(Z.X<java.lang.Object> r13, java.util.Set<? extends java.lang.Object> r14) {
        /*
            java.lang.Object[] r0 = r13.elements
            long[] r13 = r13.metadata
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r1.d(Z.X, java.util.Set):boolean");
    }

    public static final <T> InterfaceC16561f<T> e(Function0<? extends T> function0) {
        return C16563h.E(new b(function0, null));
    }
}
