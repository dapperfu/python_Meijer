package kotlin;

import d0.EnumC13564E;
import kotlin.C6453j;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf0/H;", "", "value", "Lc0/i;", "animationSpec", "a", "(Lf0/H;FLc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lf0/H;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld0/E;", "scrollPriority", "", "d", "(Lf0/H;Ld0/E;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13896D {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {38}, m = "animateScrollBy")
    /* renamed from: f0.D$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130949a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130950b;

        /* renamed from: c, reason: collision with root package name */
        int f130951c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130950b = obj;
            this.f130951c |= Integer.MIN_VALUE;
            return C13896D.a(null, 0.0f, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: f0.D$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130952a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f130954c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f130955d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130956e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.D$b$a */
        static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f130957f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC13897E f130958g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.FloatRef floatRef, InterfaceC13897E interfaceC13897E) {
                super(2);
                this.f130957f = floatRef;
                this.f130958g = interfaceC13897E;
            }

            public final void a(float f10, float f11) {
                Ref.FloatRef floatRef = this.f130957f;
                float f12 = floatRef.f143739a;
                floatRef.f143739a = f12 + this.f130958g.e(f10 - f12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC6452i<Float> interfaceC6452i, Ref.FloatRef floatRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f130954c = f10;
            this.f130955d = interfaceC6452i;
            this.f130956e = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f130954c, this.f130955d, this.f130956e, continuation);
            bVar.f130953b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130952a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13897E interfaceC13897E = (InterfaceC13897E) this.f130953b;
                float f10 = this.f130954c;
                InterfaceC6452i<Float> interfaceC6452i = this.f130955d;
                a aVar = new a(this.f130956e, interfaceC13897E);
                this.f130952a = 1;
                if (i0.e(0.0f, f10, 0.0f, interfaceC6452i, aVar, this, 4, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {57}, m = "scrollBy")
    /* renamed from: f0.D$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130959a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130960b;

        /* renamed from: c, reason: collision with root package name */
        int f130961c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130960b = obj;
            this.f130961c |= Integer.MIN_VALUE;
            return C13896D.c(null, 0.0f, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.D$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130962a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130963b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130964c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f130965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.FloatRef floatRef, float f10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f130964c = floatRef;
            this.f130965d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f130964c, this.f130965d, continuation);
            dVar.f130963b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130962a == 0) {
                ResultKt.b(obj);
                InterfaceC13897E interfaceC13897E = (InterfaceC13897E) this.f130963b;
                this.f130964c.f143739a = interfaceC13897E.e(this.f130965d);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.D$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130966a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130966a == 0) {
                ResultKt.b(obj);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.InterfaceC13900H r7, float r8, kotlin.InterfaceC6452i<java.lang.Float> r9, kotlin.coroutines.Continuation<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof kotlin.C13896D.a
            if (r0 == 0) goto L14
            r0 = r10
            f0.D$a r0 = (kotlin.C13896D.a) r0
            int r1 = r0.f130951c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f130951c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            f0.D$a r0 = new f0.D$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f130950b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f130951c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f130949a
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref.FloatRef) r7
            kotlin.ResultKt.b(r10)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            f0.D$b r3 = new f0.D$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f130949a = r10
            r4.f130951c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = kotlin.InterfaceC13900H.c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f143739a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13896D.a(f0.H, float, c0.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(InterfaceC13900H interfaceC13900H, float f10, InterfaceC6452i interfaceC6452i, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6452i = C6453j.j(0.0f, 0.0f, null, 7, null);
        }
        return a(interfaceC13900H, f10, interfaceC6452i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(kotlin.InterfaceC13900H r7, float r8, kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13896D.c
            if (r0 == 0) goto L14
            r0 = r9
            f0.D$c r0 = (kotlin.C13896D.c) r0
            int r1 = r0.f130961c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f130961c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            f0.D$c r0 = new f0.D$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f130960b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f130961c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f130959a
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref.FloatRef) r7
            kotlin.ResultKt.b(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            f0.D$d r3 = new f0.D$d
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f130959a = r9
            r4.f130961c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = kotlin.InterfaceC13900H.c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r9
        L55:
            float r7 = r7.f143739a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13896D.c(f0.H, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(InterfaceC13900H interfaceC13900H, EnumC13564E enumC13564E, Continuation<? super Unit> continuation) {
        Object objA = interfaceC13900H.a(enumC13564E, new e(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    public static /* synthetic */ Object e(InterfaceC13900H interfaceC13900H, EnumC13564E enumC13564E, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC13564E = EnumC13564E.f127647a;
        }
        return d(interfaceC13900H, enumC13564E, continuation);
    }
}
