package kotlin;

import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0015\u000eJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R+\u0010/\u001a\u00020(2\u0006\u0010\r\u001a\u00020(8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b)\u00103\"\u0004\b4\u00105R\u001a\u0010:\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b1\u00109¨\u0006;"}, d2 = {"Lc0/Z;", "S", "Lc0/m0;", "Lc0/k0;", "transition", "", "f", "(Lc0/k0;)V", "g", "()V", "k", "l", "m", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "targetState", "c", "a", "d", "currentState", "Ljava/lang/Object;", "getComposedTargetState$animation_core_release", "n", "composedTargetState", "e", "Lc0/k0;", "", "J", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "recalculateTotalDurationNanos", "", "h", "Landroidx/compose/runtime/i0;", "j", "()F", "setFraction", "(F)V", "fraction", "Lqv/n;", "i", "Lqv/n;", "()Lqv/n;", "o", "(Lqv/n;)V", "compositionContinuation", "LAv/a;", "LAv/a;", "()LAv/a;", "compositionContinuationMutex", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6312Z<S> extends m0<S> {

    /* renamed from: k, reason: collision with root package name */
    private static final a f60980k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f60981l = 8;

    /* renamed from: m, reason: collision with root package name */
    private static final C6330m f60982m = new C6330m(0.0f);

    /* renamed from: n, reason: collision with root package name */
    private static final C6330m f60983n = new C6330m(1.0f);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 targetState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 currentState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private S composedTargetState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k0<S> transition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long totalDurationNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> recalculateTotalDurationNanos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 fraction;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16654n<? super S> compositionContinuation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Av.a compositionContinuationMutex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc0/Z$a;", "", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.Z$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc0/Z$b;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.Z$b */
    public static final class b {
    }

    @Override // kotlin.m0
    public void g() {
        this.transition = null;
        l0.g().l(this);
    }

    private final void m() {
        k0<S> k0Var = this.transition;
        if (k0Var == null) {
            return;
        }
        k0Var.E(MathKt.e(j() * k0Var.p()));
    }

    @Override // kotlin.m0
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // kotlin.m0
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // kotlin.m0
    public void d(S s10) {
        this.currentState.setValue(s10);
    }

    @Override // kotlin.m0
    public void f(k0<S> transition) {
        k0<S> k0Var = this.transition;
        if (!(k0Var == null || Intrinsics.e(transition, k0Var))) {
            C6310X.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    public final InterfaceC16654n<S> h() {
        return this.compositionContinuation;
    }

    /* renamed from: i, reason: from getter */
    public final Av.a getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    public final float j() {
        return this.fraction.b();
    }

    public final void l() {
        long j10 = this.totalDurationNanos;
        k();
        long j11 = this.totalDurationNanos;
        if (j10 == j11 || j11 == 0) {
            return;
        }
        m();
    }

    public final void n(S s10) {
        this.composedTargetState = s10;
    }

    public final void o(InterfaceC16654n<? super S> interfaceC16654n) {
        this.compositionContinuation = interfaceC16654n;
    }

    public final void k() {
        l0.g().p(this, l0.f61173a, this.recalculateTotalDurationNanos);
    }
}
