package androidx.compose.foundation.gestures;

import P0.j;
import androidx.compose.ui.Modifier;
import d0.J;
import f1.C13832e;
import g1.O;
import g1.PointerInputChange;
import h0.l;
import kotlin.C13793K;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC13808g;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC13826y;
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
    private static final Function1<PointerInputChange, Boolean> f48300a = a.f48304f;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC13787E f48301b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final j f48302c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final d f48303d = new d();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1023}, m = "semanticsScrollBy-d-4ec7I")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48305a;

        /* renamed from: b, reason: collision with root package name */
        Object f48306b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f48307c;

        /* renamed from: d, reason: collision with root package name */
        int f48308d;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48307c = obj;
            this.f48308d |= Integer.MIN_VALUE;
            return g.l(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/y;", "", "<anonymous>", "(Lf0/y;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC13826y, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48309a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C13793K f48311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f48312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f48313e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f48314f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C13793K f48315g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC13826y f48316h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.FloatRef floatRef, C13793K c13793k, InterfaceC13826y interfaceC13826y) {
                super(2);
                this.f48314f = floatRef;
                this.f48315g = c13793k;
                this.f48316h = interfaceC13826y;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f48314f.f142832a;
                C13793K c13793k = this.f48315g;
                this.f48314f.f142832a += c13793k.x(c13793k.F(this.f48316h.b(c13793k.G(c13793k.x(f12)), C13832e.INSTANCE.d())));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f48311c, this.f48312d, this.f48313e, continuation);
            fVar.f48310b = obj;
            return fVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C13793K c13793k, long j10, Ref.FloatRef floatRef, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f48311c = c13793k;
            this.f48312d = j10;
            this.f48313e = floatRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13826y interfaceC13826y, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC13826y, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48309a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13826y interfaceC13826y = (InterfaceC13826y) this.f48310b;
                float F10 = this.f48311c.F(this.f48312d);
                a aVar = new a(this.f48313e, this.f48311c, interfaceC13826y);
                this.f48309a = 1;
                if (i0.e(0.0f, F10, 0.0f, null, aVar, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC13820s interfaceC13820s) {
        return false;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "change", "", "a", "(Lg1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<PointerInputChange, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48304f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!O.g(pointerInputChange.getType(), O.INSTANCE.b()));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$b", "LP0/j;", "", "D", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements j {
        @Override // P0.j
        public float D() {
            return 1.0f;
        }

        b() {
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext F0(CoroutineContext.Key<?> key) {
            return j.a.c(this, key);
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
        public CoroutineContext m0(CoroutineContext coroutineContext) {
            return j.a.d(this, coroutineContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$c", "Lf0/E;", "", "pixels", "e", "(F)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC13787E {
        @Override // kotlin.InterfaceC13787E
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
        return f48302c;
    }

    public static final Modifier h(Modifier modifier, InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, J j10, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, l lVar, InterfaceC13808g interfaceC13808g) {
        return modifier.then(new ScrollableElement(interfaceC13790H, enumC13827z, j10, z10, z11, interfaceC13820s, lVar, interfaceC13808g));
    }

    public static final Modifier i(Modifier modifier, InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, l lVar) {
        return j(modifier, interfaceC13790H, enumC13827z, null, z10, z11, interfaceC13820s, lVar, null, 128, null);
    }

    public static /* synthetic */ Modifier j(Modifier modifier, InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, J j10, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, l lVar, InterfaceC13808g interfaceC13808g, int i10, Object obj) {
        InterfaceC13808g interfaceC13808g2;
        Modifier modifier2;
        InterfaceC13790H interfaceC13790H2;
        EnumC13827z enumC13827z2;
        J j11;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        InterfaceC13820s interfaceC13820s2 = (i10 & 32) != 0 ? null : interfaceC13820s;
        l lVar2 = (i10 & 64) != 0 ? null : lVar;
        if ((i10 & 128) != 0) {
            interfaceC13808g2 = null;
            modifier2 = modifier;
            enumC13827z2 = enumC13827z;
            j11 = j10;
            interfaceC13790H2 = interfaceC13790H;
        } else {
            interfaceC13808g2 = interfaceC13808g;
            modifier2 = modifier;
            interfaceC13790H2 = interfaceC13790H;
            enumC13827z2 = enumC13827z;
            j11 = j10;
        }
        return h(modifier2, interfaceC13790H2, enumC13827z2, j11, z12, z13, interfaceC13820s2, lVar2, interfaceC13808g2);
    }

    public static /* synthetic */ Modifier k(Modifier modifier, InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return i(modifier, interfaceC13790H, enumC13827z, z12, z11, (i10 & 16) != 0 ? null : interfaceC13820s, (i10 & 32) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(kotlin.C13793K r10, long r11, kotlin.coroutines.Continuation<? super U0.f> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.g.e
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.g$e r0 = (androidx.compose.foundation.gestures.g.e) r0
            int r1 = r0.f48308d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48308d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.g$e r0 = new androidx.compose.foundation.gestures.g$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f48307c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48308d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f48306b
            kotlin.jvm.internal.Ref$FloatRef r10 = (kotlin.jvm.internal.Ref.FloatRef) r10
            java.lang.Object r11 = r0.f48305a
            f0.K r11 = (kotlin.C13793K) r11
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
            d0.E r13 = d0.EnumC13431E.f126845a
            androidx.compose.foundation.gestures.g$f r4 = new androidx.compose.foundation.gestures.g$f
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f48305a = r5
            r0.f48306b = r8
            r0.f48308d = r3
            java.lang.Object r10 = r5.z(r13, r4, r0)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            r10 = r5
        L5b:
            float r11 = r8.f142832a
            long r10 = r10.G(r11)
            U0.f r10 = U0.f.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g.l(f0.K, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
