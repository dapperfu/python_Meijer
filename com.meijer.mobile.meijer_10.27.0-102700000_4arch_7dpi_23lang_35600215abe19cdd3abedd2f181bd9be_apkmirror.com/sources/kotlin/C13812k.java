package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.AnimationState;
import kotlin.C6325h;
import kotlin.C6329l;
import kotlin.C6330m;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.w;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lf0/k;", "", "Lc0/y;", "", "flingDecay", "LP0/j;", "motionDurationScale", "<init>", "(Lc0/y;LP0/j;)V", "Lf0/E;", "initialVelocity", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LH1/d;", "density", "", "g", "(LH1/d;)V", "Lc0/y;", "b", "LP0/j;", "", "c", "I", "e", "()I", "f", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13812k implements InterfaceC13820s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6342y<Float> flingDecay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P0.j motionDurationScale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)F"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
    /* renamed from: f0.k$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Float>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f130408a;

        /* renamed from: b, reason: collision with root package name */
        Object f130409b;

        /* renamed from: c, reason: collision with root package name */
        int f130410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f130411d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C13812k f130412e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f130413f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.k$a$a, reason: collision with other inner class name */
        static final class C2071a extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f130414f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC13787E f130415g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f130416h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C13812k f130417i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2071a(Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E, Ref.FloatRef floatRef2, C13812k c13812k) {
                super(1);
                this.f130414f = floatRef;
                this.f130415g = interfaceC13787E;
                this.f130416h = floatRef2;
                this.f130417i = c13812k;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
                a(c6325h);
                return Unit.f142422a;
            }

            public final void a(C6325h<Float, C6330m> c6325h) {
                float fFloatValue = c6325h.e().floatValue() - this.f130414f.f142832a;
                float fE = this.f130415g.e(fFloatValue);
                this.f130414f.f142832a = c6325h.e().floatValue();
                this.f130416h.f142832a = c6325h.f().floatValue();
                if (Math.abs(fFloatValue - fE) > 0.5f) {
                    c6325h.a();
                }
                C13812k c13812k = this.f130417i;
                c13812k.f(c13812k.getLastAnimationCycleCount() + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, C13812k c13812k, InterfaceC13787E interfaceC13787E, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f130411d = f10;
            this.f130412e = c13812k;
            this.f130413f = interfaceC13787E;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f130411d, this.f130412e, this.f130413f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Float> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            AnimationState animationState;
            Ref.FloatRef floatRef;
            InterfaceC6342y interfaceC6342y;
            C2071a c2071a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f130410c;
            if (i10 == 0) {
                ResultKt.b(obj);
                if (Math.abs(this.f130411d) > 1.0f) {
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.f142832a = this.f130411d;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    AnimationState animationStateC = C6329l.c(0.0f, this.f130411d, 0L, 0L, false, 28, null);
                    try {
                        interfaceC6342y = this.f130412e.flingDecay;
                        c2071a = new C2071a(floatRef3, this.f130413f, floatRef2, this.f130412e);
                        this.f130408a = floatRef2;
                        this.f130409b = animationStateC;
                        this.f130410c = 1;
                        animationState = animationStateC;
                        try {
                        } catch (CancellationException unused) {
                            floatRef = floatRef2;
                            floatRef.f142832a = ((Number) animationState.m()).floatValue();
                            f10 = floatRef.f142832a;
                            return Boxing.c(f10);
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateC;
                    }
                    if (i0.h(animationState, interfaceC6342y, false, c2071a, this, 2, null) == objF) {
                        return objF;
                    }
                    floatRef = floatRef2;
                    f10 = floatRef.f142832a;
                } else {
                    f10 = this.f130411d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.f130409b;
                floatRef = (Ref.FloatRef) this.f130408a;
                try {
                    ResultKt.b(obj);
                } catch (CancellationException unused3) {
                    floatRef.f142832a = ((Number) animationState.m()).floatValue();
                    f10 = floatRef.f142832a;
                    return Boxing.c(f10);
                }
                f10 = floatRef.f142832a;
            }
            return Boxing.c(f10);
        }
    }

    public C13812k(InterfaceC6342y<Float> interfaceC6342y, P0.j jVar) {
        this.flingDecay = interfaceC6342y;
        this.motionDurationScale = jVar;
    }

    @Override // kotlin.InterfaceC13820s
    public Object a(InterfaceC13787E interfaceC13787E, float f10, Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return C16644i.g(this.motionDurationScale, new a(f10, this, interfaceC13787E, null), continuation);
    }

    /* renamed from: e, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void f(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    public void g(H1.d density) {
        this.flingDecay = w.c(density);
    }

    public /* synthetic */ C13812k(InterfaceC6342y interfaceC6342y, P0.j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6342y, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.g.f() : jVar);
    }
}
