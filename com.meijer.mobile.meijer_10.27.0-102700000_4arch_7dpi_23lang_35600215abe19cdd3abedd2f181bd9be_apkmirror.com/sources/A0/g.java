package A0;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import d0.C13432F;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0012R+\u0010,\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001bR+\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u001dR+\u00103\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u001dR+\u00106\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u001dR+\u00109\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u001dR\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010*R\u0014\u0010A\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0012R\u0014\u0010\n\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0012¨\u0006C"}, d2 = {"LA0/g;", "", "Lqv/O;", "animationScope", "Landroidx/compose/runtime/z1;", "Lkotlin/Function0;", "", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(Lqv/O;Landroidx/compose/runtime/z1;FF)V", "offset", "Lqv/C0;", "e", "(F)Lqv/C0;", "f", "()F", "pullDelta", "q", "(F)F", "velocity", "r", "", "refreshing", "t", "(Z)V", "v", "(F)V", "u", "a", "Lqv/O;", "b", "Landroidx/compose/runtime/z1;", "c", "g", "adjustedDistancePulled", "<set-?>", "d", "Landroidx/compose/runtime/l0;", "n", "()Z", "x", "_refreshing", "Landroidx/compose/runtime/i0;", "m", "w", "_position", "h", "s", "distancePulled", "p", "z", "_threshold", "o", "y", "_refreshingOffset", "Ld0/F;", "i", "Ld0/F;", "mutatorMutex", "j", "progress", "k", "position", "l", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final int f55j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O animationScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z1<Function0<Unit>> onRefreshState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 _threshold;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 _refreshingOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z1 adjustedDistancePulled = o1.e(new a());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 _refreshing = t1.e(Boolean.FALSE, null, 2, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 _position = A0.a(0.0f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 distancePulled = A0.a(0.0f);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13432F mutatorMutex = new C13432F();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.h() * 0.5f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {196}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f66a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f68c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {197}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f69a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f70b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f71c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: A0.g$b$a$a, reason: collision with other inner class name */
            static final class C0001a extends Lambda implements Function2<Float, Float, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ g f72f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0001a(g gVar) {
                    super(2);
                    this.f72f = gVar;
                }

                public final void a(float f10, float f11) {
                    this.f72f.w(f10);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
                    a(f10.floatValue(), f11.floatValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, float f10, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f70b = gVar;
                this.f71c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new a(this.f70b, this.f71c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f69a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    float fM = this.f70b.m();
                    float f10 = this.f71c;
                    C0001a c0001a = new C0001a(this.f70b);
                    this.f69a = 1;
                    if (i0.e(fM, f10, 0.0f, null, c0001a, this, 12, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f68c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new b(this.f68c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f66a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13432F c13432f = g.this.mutatorMutex;
                a aVar = new a(g.this, this.f68c, null);
                this.f66a = 1;
                if (C13432F.e(c13432f, null, aVar, this, 1, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    private final C0 e(float offset) {
        return C16648k.d(this.animationScope, null, null, new b(offset, null), 3, null);
    }

    private final float g() {
        return ((Number) this.adjustedDistancePulled.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h() {
        return this.distancePulled.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m() {
        return this._position.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean n() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final float o() {
        return this._refreshingOffset.b();
    }

    private final float p() {
        return this._threshold.b();
    }

    private final void s(float f10) {
        this.distancePulled.B(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(float f10) {
        this._position.B(f10);
    }

    private final void x(boolean z10) {
        this._refreshing.setValue(Boolean.valueOf(z10));
    }

    private final void y(float f10) {
        this._refreshingOffset.B(f10);
    }

    private final void z(float f10) {
        this._threshold.B(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(InterfaceC16622O interfaceC16622O, z1<? extends Function0<Unit>> z1Var, float f10, float f11) {
        this.animationScope = interfaceC16622O;
        this.onRefreshState = z1Var;
        this._threshold = A0.a(f11);
        this._refreshingOffset = A0.a(f10);
    }

    private final float f() {
        if (g() <= l()) {
            return g();
        }
        float fAbs = Math.abs(j()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return l() + (l() * (fAbs - (((float) Math.pow(fAbs, 2)) / 4)));
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float q(float pullDelta) {
        if (n()) {
            return 0.0f;
        }
        float fE = RangesKt.e(h() + pullDelta, 0.0f);
        float fH = fE - h();
        s(fE);
        w(f());
        return fH;
    }

    public final float r(float velocity) {
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            this.onRefreshState.getValue().invoke();
        }
        e(0.0f);
        if (h() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        s(0.0f);
        return velocity;
    }

    public final void t(boolean refreshing) {
        if (n() != refreshing) {
            x(refreshing);
            float fO = 0.0f;
            s(0.0f);
            if (refreshing) {
                fO = o();
            }
            e(fO);
        }
    }

    public final void u(float refreshingOffset) {
        if (o() == refreshingOffset) {
            return;
        }
        y(refreshingOffset);
        if (k()) {
            e(refreshingOffset);
        }
    }

    public final void v(float threshold) {
        z(threshold);
    }
}
