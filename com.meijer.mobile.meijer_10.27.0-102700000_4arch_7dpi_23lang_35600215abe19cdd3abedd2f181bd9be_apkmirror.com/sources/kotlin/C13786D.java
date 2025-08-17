package kotlin;

import d0.EnumC13431E;
import kotlin.C6327j;
import kotlin.InterfaceC6326i;
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
public final class C13786D {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {38}, m = "animateScrollBy")
    /* renamed from: f0.D$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130115a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130116b;

        /* renamed from: c, reason: collision with root package name */
        int f130117c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130116b = obj;
            this.f130117c |= Integer.MIN_VALUE;
            return C13786D.a(null, 0.0f, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: f0.D$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC13787E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130118a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f130120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f130121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130122e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.D$b$a */
        static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f130123f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC13787E f130124g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E) {
                super(2);
                this.f130123f = floatRef;
                this.f130124g = interfaceC13787E;
            }

            public final void a(float f10, float f11) {
                Ref.FloatRef floatRef = this.f130123f;
                float f12 = floatRef.f142832a;
                floatRef.f142832a = f12 + this.f130124g.e(f10 - f12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC6326i<Float> interfaceC6326i, Ref.FloatRef floatRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f130120c = f10;
            this.f130121d = interfaceC6326i;
            this.f130122e = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f130120c, this.f130121d, this.f130122e, continuation);
            bVar.f130119b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13787E interfaceC13787E, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13787E, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130118a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13787E interfaceC13787E = (InterfaceC13787E) this.f130119b;
                float f10 = this.f130120c;
                InterfaceC6326i<Float> interfaceC6326i = this.f130121d;
                a aVar = new a(this.f130122e, interfaceC13787E);
                this.f130118a = 1;
                if (i0.e(0.0f, f10, 0.0f, interfaceC6326i, aVar, this, 4, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {57}, m = "scrollBy")
    /* renamed from: f0.D$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130125a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f130126b;

        /* renamed from: c, reason: collision with root package name */
        int f130127c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130126b = obj;
            this.f130127c |= Integer.MIN_VALUE;
            return C13786D.c(null, 0.0f, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.D$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC13787E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130128a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f130129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f130130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f130131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.FloatRef floatRef, float f10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f130130c = floatRef;
            this.f130131d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f130130c, this.f130131d, continuation);
            dVar.f130129b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13787E interfaceC13787E, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC13787E, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130128a == 0) {
                ResultKt.b(obj);
                InterfaceC13787E interfaceC13787E = (InterfaceC13787E) this.f130129b;
                this.f130130c.f142832a = interfaceC13787E.e(this.f130131d);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f0.D$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC13787E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f130132a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13787E interfaceC13787E, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC13787E, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f130132a == 0) {
                ResultKt.b(obj);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.InterfaceC13790H r7, float r8, kotlin.InterfaceC6326i<java.lang.Float> r9, kotlin.coroutines.Continuation<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof kotlin.C13786D.a
            if (r0 == 0) goto L14
            r0 = r10
            f0.D$a r0 = (kotlin.C13786D.a) r0
            int r1 = r0.f130117c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f130117c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            f0.D$a r0 = new f0.D$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f130116b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f130117c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f130115a
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
            r4.f130115a = r10
            r4.f130117c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = kotlin.InterfaceC13790H.c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f142832a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13786D.a(f0.H, float, c0.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(InterfaceC13790H interfaceC13790H, float f10, InterfaceC6326i interfaceC6326i, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6326i = C6327j.j(0.0f, 0.0f, null, 7, null);
        }
        return a(interfaceC13790H, f10, interfaceC6326i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(kotlin.InterfaceC13790H r7, float r8, kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13786D.c
            if (r0 == 0) goto L14
            r0 = r9
            f0.D$c r0 = (kotlin.C13786D.c) r0
            int r1 = r0.f130127c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f130127c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            f0.D$c r0 = new f0.D$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f130126b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f130127c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f130125a
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
            r4.f130125a = r9
            r4.f130127c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = kotlin.InterfaceC13790H.c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r9
        L55:
            float r7 = r7.f142832a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13786D.c(f0.H, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(InterfaceC13790H interfaceC13790H, EnumC13431E enumC13431E, Continuation<? super Unit> continuation) {
        Object objA = interfaceC13790H.a(enumC13431E, new e(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }

    public static /* synthetic */ Object e(InterfaceC13790H interfaceC13790H, EnumC13431E enumC13431E, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC13431E = EnumC13431E.f126845a;
        }
        return d(interfaceC13790H, enumC13431E, continuation);
    }
}
