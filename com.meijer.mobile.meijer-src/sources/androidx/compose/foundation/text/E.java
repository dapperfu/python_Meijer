package androidx.compose.foundation.text;

import g1.InterfaceC14300c;
import g1.PointerInputChange;
import kotlin.C13924m;
import kotlin.C13931t;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lg1/J;", "Landroidx/compose/foundation/text/P;", "observer", "", "c", "(Lg1/J;Landroidx/compose/foundation/text/P;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "d", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lmv/C0;", "<anonymous>", "(Lmv/O;)Lmv/C0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super C0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49403a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1.J f49405c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ P f49406d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {77}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.E$a$a, reason: collision with other inner class name */
        static final class C1023a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49407a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g1.J f49408b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f49409c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1023a(this.f49408b, this.f49409c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1023a(g1.J j10, P p10, Continuation<? super C1023a> continuation) {
                super(2, continuation);
                this.f49408b = j10;
                this.f49409c = p10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1023a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49407a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    g1.J j10 = this.f49408b;
                    P p10 = this.f49409c;
                    this.f49407a = 1;
                    if (E.e(j10, p10, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {78}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g1.J f49411b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f49412c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f49411b, this.f49412c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g1.J j10, P p10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f49411b = j10;
                this.f49412c = p10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49410a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    g1.J j10 = this.f49411b;
                    P p10 = this.f49412c;
                    this.f49410a = 1;
                    if (E.d(j10, p10, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f49405c, this.f49406d, continuation);
            aVar.f49404b = obj;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g1.J j10, P p10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f49405c = j10;
            this.f49406d = p10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super C0> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f49403a == 0) {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f49404b;
                EnumC15785Q enumC15785Q = EnumC15785Q.f151688d;
                C15809k.d(interfaceC15783O, null, enumC15785Q, new C1023a(this.f49405c, this.f49406d, null), 1, null);
                return C15809k.d(interfaceC15783O, null, enumC15785Q, new b(this.f49405c, this.f49406d, null), 1, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f49413f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(P p10) {
            super(1);
            this.f49413f = p10;
        }

        public final void a(long j10) {
            this.f49413f.b(j10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f49414f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(P p10) {
            super(0);
            this.f49414f = p10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f49414f.onStop();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f49415f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(P p10) {
            super(0);
            this.f49415f = p10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f49415f.onCancel();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg1/B;", "<anonymous parameter 0>", "LU0/f;", "offset", "", "a", "(Lg1/B;J)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<PointerInputChange, U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f49416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(P p10) {
            super(2);
            this.f49416f = p10;
        }

        public final void a(PointerInputChange pointerInputChange, long j10) {
            this.f49416f.d(j10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, U0.f fVar) {
            a(pointerInputChange, fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f49417b;

        /* renamed from: c, reason: collision with root package name */
        int f49418c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f49419d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ P f49420e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(P p10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f49420e = p10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f49420e, continuation);
            fVar.f49419d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f49418c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.f49417b
                g1.B r1 = (g1.PointerInputChange) r1
                java.lang.Object r4 = r13.f49419d
                g1.c r4 = (g1.InterfaceC14300c) r4
                kotlin.ResultKt.b(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f49419d
                g1.c r1 = (g1.InterfaceC14300c) r1
                kotlin.ResultKt.b(r14)
                r7 = r13
                goto L45
            L2c:
                kotlin.ResultKt.b(r14)
                java.lang.Object r14 = r13.f49419d
                r4 = r14
                g1.c r4 = (g1.InterfaceC14300c) r4
                r13.f49419d = r4
                r13.f49418c = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = kotlin.C13904L.f(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                g1.B r14 = (g1.PointerInputChange) r14
                androidx.compose.foundation.text.P r4 = r7.f49420e
                long r5 = r14.getPosition()
                r4.a(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.f49419d = r4
                r7.f49417b = r1
                r7.f49418c = r2
                r14 = 0
                java.lang.Object r14 = g1.InterfaceC14300c.G1(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                g1.q r14 = (g1.C14314q) r14
                java.util.List r14 = r14.c()
                r5 = r14
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L6e:
                if (r6 >= r5) goto L8e
                java.lang.Object r8 = r14.get(r6)
                g1.B r8 = (g1.PointerInputChange) r8
                long r9 = r8.getId()
                long r11 = r1.getId()
                boolean r9 = g1.C14296A.b(r9, r11)
                if (r9 == 0) goto L8b
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L8b
                goto L52
            L8b:
                int r6 = r6 + 1
                goto L6e
            L8e:
                androidx.compose.foundation.text.P r14 = r7.f49420e
                r14.c()
                kotlin.Unit r14 = kotlin.Unit.f143329a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.E.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(g1.J j10, P p10, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(j10, p10, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(g1.J j10, P p10, Continuation<? super Unit> continuation) {
        Object objE = C13924m.e(j10, new b(p10), new c(p10), new d(p10), new e(p10), continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(g1.J j10, P p10, Continuation<? super Unit> continuation) {
        Object objD = C13931t.d(j10, new f(p10, null), continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }
}
