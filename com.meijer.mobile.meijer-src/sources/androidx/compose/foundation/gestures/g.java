package androidx.compose.foundation.gestures;

import P0.j;
import androidx.compose.ui.Modifier;
import d0.J;
import f1.C13942e;
import g1.O;
import g1.PointerInputChange;
import h0.l;
import kotlin.C13903K;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13900H;
import kotlin.InterfaceC13918g;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC13936y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001(\u001aO\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0018\u0010.\u001a\u00020\u0005*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lf0/H;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lf0/s;", "flingBehavior", "Lh0/l;", "interactionSource", "i", "(Landroidx/compose/ui/Modifier;Lf0/H;Lf0/z;ZZLf0/s;Lh0/l;)Landroidx/compose/ui/Modifier;", "Ld0/J;", "overscrollEffect", "Lf0/g;", "bringIntoViewSpec", "h", "(Landroidx/compose/ui/Modifier;Lf0/H;Lf0/z;Ld0/J;ZZLf0/s;Lh0/l;Lf0/g;)Landroidx/compose/ui/Modifier;", "Lf0/K;", "LU0/f;", "offset", "l", "(Lf0/K;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lg1/B;", "a", "Lkotlin/jvm/functions/Function1;", "CanDragCalculation", "Lf0/E;", "b", "Lf0/E;", "NoOpScrollScope", "LP0/j;", "c", "LP0/j;", "f", "()LP0/j;", "DefaultScrollMotionDurationScale", "androidx/compose/foundation/gestures/g$d", "d", "Landroidx/compose/foundation/gestures/g$d;", "UnityDensity", "g", "(Lf0/s;)Z", "shouldBeTriggeredByMouseWheel", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<PointerInputChange, Boolean> f48524a = a.f48528f;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC13897E f48525b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final j f48526c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final d f48527d = new d();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1023}, m = "semanticsScrollBy-d-4ec7I")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48529a;

        /* renamed from: b, reason: collision with root package name */
        Object f48530b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48531c;

        /* renamed from: d, reason: collision with root package name */
        int f48532d;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48531c = obj;
            this.f48532d |= Integer.MIN_VALUE;
            return g.l(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC13936y, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48533a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C13903K f48535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f48536d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f48537e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f48538f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C13903K f48539g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC13936y f48540h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.FloatRef floatRef, C13903K c13903k, InterfaceC13936y interfaceC13936y) {
                super(2);
                this.f48538f = floatRef;
                this.f48539g = c13903k;
                this.f48540h = interfaceC13936y;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f48538f.f143739a;
                C13903K c13903k = this.f48539g;
                this.f48538f.f143739a += c13903k.x(c13903k.F(this.f48540h.b(c13903k.G(c13903k.x(f12)), C13942e.INSTANCE.d())));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f48535c, this.f48536d, this.f48537e, continuation);
            fVar.f48534b = obj;
            return fVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C13903K c13903k, long j10, Ref.FloatRef floatRef, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f48535c = c13903k;
            this.f48536d = j10;
            this.f48537e = floatRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13936y interfaceC13936y, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC13936y, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48533a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13936y interfaceC13936y = (InterfaceC13936y) this.f48534b;
                float F10 = this.f48535c.F(this.f48536d);
                a aVar = new a(this.f48537e, this.f48535c, interfaceC13936y);
                this.f48533a = 1;
                if (i0.e(0.0f, F10, 0.0f, null, aVar, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC13930s interfaceC13930s) {
        return false;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "change", "", "a", "(Lg1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<PointerInputChange, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48528f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!O.g(pointerInputChange.getType(), O.INSTANCE.b()));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$b", "LP0/j;", "", "J", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements j {
        @Override // P0.j
        public float J() {
            return 1.0f;
        }

        b() {
        }

        @Override // kotlin.coroutines.CoroutineContext
        public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) j.a.a(this, r10, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
            return (E) j.a.b(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext n0(CoroutineContext coroutineContext) {
            return j.a.d(this, coroutineContext);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext x0(CoroutineContext.Key<?> key) {
            return j.a.c(this, key);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$c", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC13897E {
        @Override // kotlin.InterfaceC13897E
        public float e(float pixels) {
            return pixels;
        }

        c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/g$d", "LH1/d;", "", "getDensity", "()F", "density", "F1", "fontScale", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements H1.d {
        @Override // H1.l
        /* renamed from: F1 */
        public float getFontScale() {
            return 1.0f;
        }

        @Override // H1.d
        public float getDensity() {
            return 1.0f;
        }

        d() {
        }
    }

    public static final j f() {
        return f48526c;
    }

    public static final Modifier h(Modifier modifier, InterfaceC13900H interfaceC13900H, EnumC13937z enumC13937z, J j10, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, l lVar, InterfaceC13918g interfaceC13918g) {
        return modifier.then(new ScrollableElement(interfaceC13900H, enumC13937z, j10, z10, z11, interfaceC13930s, lVar, interfaceC13918g));
    }

    public static final Modifier i(Modifier modifier, InterfaceC13900H interfaceC13900H, EnumC13937z enumC13937z, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, l lVar) {
        return j(modifier, interfaceC13900H, enumC13937z, null, z10, z11, interfaceC13930s, lVar, null, 128, null);
    }

    public static /* synthetic */ Modifier j(Modifier modifier, InterfaceC13900H interfaceC13900H, EnumC13937z enumC13937z, J j10, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, l lVar, InterfaceC13918g interfaceC13918g, int i10, Object obj) {
        InterfaceC13918g interfaceC13918g2;
        Modifier modifier2;
        InterfaceC13900H interfaceC13900H2;
        EnumC13937z enumC13937z2;
        J j11;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        InterfaceC13930s interfaceC13930s2 = (i10 & 32) != 0 ? null : interfaceC13930s;
        l lVar2 = (i10 & 64) != 0 ? null : lVar;
        if ((i10 & 128) != 0) {
            interfaceC13918g2 = null;
            modifier2 = modifier;
            enumC13937z2 = enumC13937z;
            j11 = j10;
            interfaceC13900H2 = interfaceC13900H;
        } else {
            interfaceC13918g2 = interfaceC13918g;
            modifier2 = modifier;
            interfaceC13900H2 = interfaceC13900H;
            enumC13937z2 = enumC13937z;
            j11 = j10;
        }
        return h(modifier2, interfaceC13900H2, enumC13937z2, j11, z12, z13, interfaceC13930s2, lVar2, interfaceC13918g2);
    }

    public static /* synthetic */ Modifier k(Modifier modifier, InterfaceC13900H interfaceC13900H, EnumC13937z enumC13937z, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return i(modifier, interfaceC13900H, enumC13937z, z12, z11, (i10 & 16) != 0 ? null : interfaceC13930s, (i10 & 32) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(kotlin.C13903K r10, long r11, kotlin.coroutines.Continuation<? super U0.f> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.g.e
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.g$e r0 = (androidx.compose.foundation.gestures.g.e) r0
            int r1 = r0.f48532d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48532d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.g$e r0 = new androidx.compose.foundation.gestures.g$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f48531c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48532d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f48530b
            kotlin.jvm.internal.Ref$FloatRef r10 = (kotlin.jvm.internal.Ref.FloatRef) r10
            java.lang.Object r11 = r0.f48529a
            f0.K r11 = (kotlin.C13903K) r11
            kotlin.ResultKt.b(r13)
            r8 = r10
            r10 = r11
            goto L5b
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            d0.E r13 = d0.EnumC13564E.f127647a
            androidx.compose.foundation.gestures.g$f r4 = new androidx.compose.foundation.gestures.g$f
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f48529a = r5
            r0.f48530b = r8
            r0.f48532d = r3
            java.lang.Object r10 = r5.z(r13, r4, r0)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            r10 = r5
        L5b:
            float r11 = r8.f143739a
            long r10 = r10.G(r11)
            U0.f r10 = U0.f.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g.l(f0.K, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
