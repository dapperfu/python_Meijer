package kotlin;

import H1.r;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u007f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006.²\u0006*\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00118\nX\u008a\u0084\u0002²\u0006\"\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Lc0/i;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/z1;", "d", "(FLc0/i;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "LH1/h;", "c", "(FLc0/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "T", "Lc0/q;", "V", "Lc0/o0;", "typeConverter", "e", "(Ljava/lang/Object;Lc0/o0;Lc0/i;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Lc0/d0;", "a", "Lc0/d0;", "defaultAnimation", "b", "dpDefaultSpring", "LU0/k;", "sizeDefaultSpring", "LU0/f;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "rectDefaultSpring", "", "f", "intDefaultSpring", "LH1/n;", "g", "intOffsetDefaultSpring", "LH1/r;", "h", "intSizeDefaultSpring", "listener", "animSpec", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6317c {

    /* renamed from: a, reason: collision with root package name */
    private static final C6320d0<Float> f61031a = C6327j.j(0.0f, 0.0f, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C6320d0<H1.h> f61032b = C6327j.j(0.0f, 0.0f, H1.h.l(E0.a(H1.h.INSTANCE)), 3, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C6320d0<U0.k> f61033c = C6327j.j(0.0f, 0.0f, U0.k.c(E0.f(U0.k.INSTANCE)), 3, null);

    /* renamed from: d, reason: collision with root package name */
    private static final C6320d0<U0.f> f61034d = C6327j.j(0.0f, 0.0f, U0.f.d(E0.e(U0.f.INSTANCE)), 3, null);

    /* renamed from: e, reason: collision with root package name */
    private static final C6320d0<Rect> f61035e = C6327j.j(0.0f, 0.0f, E0.g(Rect.INSTANCE), 3, null);

    /* renamed from: f, reason: collision with root package name */
    private static final C6320d0<Integer> f61036f = C6327j.j(0.0f, 0.0f, Integer.valueOf(E0.b(IntCompanionObject.f142824a)), 3, null);

    /* renamed from: g, reason: collision with root package name */
    private static final C6320d0<H1.n> f61037g = C6327j.j(0.0f, 0.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 3, null);

    /* renamed from: h, reason: collision with root package name */
    private static final C6320d0<r> f61038h = C6327j.j(0.0f, 0.0f, r.b(E0.d(r.INSTANCE)), 3, null);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/q;", "V", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: c0.c$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ sv.g<T> f61039f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f61040g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sv.g<T> gVar, T t10) {
            super(0);
            this.f61039f = gVar;
            this.f61040g = t10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f61039f.k(this.f61040g);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
    /* renamed from: c0.c$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f61041a;

        /* renamed from: b, reason: collision with root package name */
        int f61042b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f61043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ sv.g<T> f61044d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6313a<T, V> f61045e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<InterfaceC6326i<T>> f61046f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Function1<T, Unit>> f61047g;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lc0/q;", "V", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
        /* renamed from: c0.c$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f61048a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f61049b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6313a<T, V> f61050c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<InterfaceC6326i<T>> f61051d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<Function1<T, Unit>> f61052e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t10, C6313a<T, V> c6313a, z1<? extends InterfaceC6326i<T>> z1Var, z1<? extends Function1<? super T, Unit>> z1Var2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f61049b = t10;
                this.f61050c = c6313a;
                this.f61051d = z1Var;
                this.f61052e = z1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f61049b, this.f61050c, this.f61051d, this.f61052e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f61048a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        aVar = this;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    if (!Intrinsics.e(this.f61049b, this.f61050c.k())) {
                        C6313a<T, V> c6313a = this.f61050c;
                        T t10 = this.f61049b;
                        InterfaceC6326i interfaceC6326iG = C6317c.g(this.f61051d);
                        this.f61048a = 1;
                        aVar = this;
                        if (C6313a.f(c6313a, t10, interfaceC6326iG, null, null, aVar, 12, null) == objF) {
                            return objF;
                        }
                    } else {
                        return Unit.f142422a;
                    }
                }
                Function1 function1F = C6317c.f(aVar.f61052e);
                if (function1F != null) {
                    function1F.invoke(aVar.f61050c.m());
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(sv.g<T> gVar, C6313a<T, V> c6313a, z1<? extends InterfaceC6326i<T>> z1Var, z1<? extends Function1<? super T, Unit>> z1Var2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f61044d = gVar;
            this.f61045e = c6313a;
            this.f61046f = z1Var;
            this.f61047g = z1Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f61044d, this.f61045e, this.f61046f, this.f61047g, continuation);
            bVar.f61043c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f61042b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f61041a
                sv.i r1 = (sv.i) r1
                java.lang.Object r3 = r11.f61043c
                qv.O r3 = (qv.InterfaceC16622O) r3
                kotlin.ResultKt.b(r12)
                goto L3a
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f61043c
                qv.O r12 = (qv.InterfaceC16622O) r12
                sv.g<T> r1 = r11.f61044d
                sv.i r1 = r1.iterator()
                r3 = r12
            L2d:
                r11.f61043c = r3
                r11.f61041a = r1
                r11.f61042b = r2
                java.lang.Object r12 = r1.a(r11)
                if (r12 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6a
                java.lang.Object r12 = r1.next()
                sv.g<T> r4 = r11.f61044d
                java.lang.Object r4 = r4.n()
                java.lang.Object r4 = sv.k.f(r4)
                if (r4 != 0) goto L54
                r6 = r12
                goto L55
            L54:
                r6 = r4
            L55:
                c0.c$b$a r5 = new c0.c$b$a
                c0.a<T, V> r7 = r11.f61045e
                androidx.compose.runtime.z1<c0.i<T>> r8 = r11.f61046f
                androidx.compose.runtime.z1<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r9 = r11.f61047g
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                qv.C16644i.d(r3, r4, r5, r6, r7, r8)
                goto L2d
            L6a:
                kotlin.Unit r12 = kotlin.Unit.f142422a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C6317c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final z1<H1.h> c(float f10, InterfaceC6326i<H1.h> interfaceC6326i, String str, Function1<? super H1.h, Unit> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = f61032b;
        }
        InterfaceC6326i<H1.h> interfaceC6326i2 = interfaceC6326i;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super H1.h, Unit> function12 = function1;
        if (ComposerKt.M()) {
            ComposerKt.U(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i12 = i10 << 6;
        z1<H1.h> z1VarE = e(H1.h.l(f10), q0.b(H1.h.INSTANCE), interfaceC6326i2, null, str2, function12, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarE;
    }

    public static final z1<Float> d(float f10, InterfaceC6326i<Float> interfaceC6326i, float f11, String str, Function1<? super Float, Unit> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = f61031a;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1<? super Float, Unit> function12 = (i11 & 16) != 0 ? null : function1;
        if (ComposerKt.M()) {
            ComposerKt.U(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (interfaceC6326i == f61031a) {
            composer.startReplaceGroup(1125558999);
            boolean z10 = (((i10 & 896) ^ 384) > 256 && composer.b(f11)) || (i10 & 384) == 256;
            Object objB = composer.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = C6327j.j(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                composer.t(objB);
            }
            interfaceC6326i = (C6320d0) objB;
            composer.P();
        } else {
            composer.startReplaceGroup(1125668925);
            composer.P();
        }
        InterfaceC6326i<Float> interfaceC6326i2 = interfaceC6326i;
        Float fValueOf = Float.valueOf(f10);
        o0<Float, C6330m> o0VarI = q0.i(FloatCompanionObject.f142822a);
        Float fValueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        z1<Float> z1VarE = e(fValueOf, o0VarI, interfaceC6326i2, fValueOf2, str2, function12, composer, (i10 & 14) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarE;
    }

    public static final <T, V extends AbstractC6334q> z1<T> e(T t10, o0<T, V> o0Var, InterfaceC6326i<T> interfaceC6326i, T t11, String str, Function1<? super T, Unit> function1, Composer composer, int i10, int i11) {
        InterfaceC6326i<T> interfaceC6326iI;
        sv.g gVar;
        if ((i11 & 4) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C6327j.j(0.0f, 0.0f, null, 7, null);
                composer.t(objB);
            }
            interfaceC6326iI = (C6320d0) objB;
        } else {
            interfaceC6326iI = interfaceC6326i;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        Function1<? super T, Unit> function12 = (i11 & 32) != 0 ? null : function1;
        if (ComposerKt.M()) {
            ComposerKt.U(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object objB2 = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB2 == companion.a()) {
            objB2 = t1.e(null, null, 2, null);
            composer.t(objB2);
        }
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
        Object objB3 = composer.B();
        if (objB3 == companion.a()) {
            objB3 = new C6313a(t10, o0Var, t12, str2);
            composer.t(objB3);
        }
        C6313a c6313a = (C6313a) objB3;
        z1 z1VarP = o1.p(function12, composer, (i10 >> 15) & 14);
        if (t12 != null && (interfaceC6326iI instanceof C6320d0)) {
            C6320d0 c6320d0 = (C6320d0) interfaceC6326iI;
            if (!Intrinsics.e(c6320d0.h(), t12)) {
                interfaceC6326iI = C6327j.i(c6320d0.getDampingRatio(), c6320d0.getStiffness(), t12);
            }
        }
        z1 z1VarP2 = o1.p(interfaceC6326iI, composer, 0);
        Object objB4 = composer.B();
        if (objB4 == companion.a()) {
            objB4 = sv.j.b(-1, null, null, 6, null);
            composer.t(objB4);
        }
        sv.g gVar2 = (sv.g) objB4;
        boolean zD = ((((i10 & 14) ^ 6) > 4 && composer.D(t10)) || (i10 & 6) == 4) | composer.D(gVar2);
        Object objB5 = composer.B();
        if (zD || objB5 == companion.a()) {
            objB5 = new a(gVar2, t10);
            composer.t(objB5);
        }
        J.i((Function0) objB5, composer, 0);
        boolean zD2 = composer.D(gVar2) | composer.D(c6313a) | composer.V(z1VarP2) | composer.V(z1VarP);
        Object objB6 = composer.B();
        if (zD2 || objB6 == companion.a()) {
            gVar = gVar2;
            Object bVar = new b(gVar, c6313a, z1VarP2, z1VarP, null);
            composer.t(bVar);
            objB6 = bVar;
        } else {
            gVar = gVar2;
        }
        J.g(gVar, (Function2) objB6, composer, 0);
        z1<T> z1VarG = (z1) interfaceC5730l0.getValue();
        if (z1VarG == null) {
            z1VarG = c6313a.g();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<T, Unit> f(z1<? extends Function1<? super T, Unit>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC6326i<T> g(z1<? extends InterfaceC6326i<T>> z1Var) {
        return z1Var.getValue();
    }
}
