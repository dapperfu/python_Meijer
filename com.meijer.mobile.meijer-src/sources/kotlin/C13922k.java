package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.AnimationState;
import kotlin.C6451h;
import kotlin.C6455l;
import kotlin.C6456m;
import kotlin.InterfaceC6468y;
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
import mv.C15805i;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lf0/k;", "", "Lc0/y;", "", "flingDecay", "LP0/j;", "motionDurationScale", "<init>", "(Lc0/y;LP0/j;)V", "Lf0/E;", "initialVelocity", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LH1/d;", "density", "", "g", "(LH1/d;)V", "Lc0/y;", "b", "LP0/j;", "", "c", "I", "e", "()I", "f", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13922k implements InterfaceC13930s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6468y<Float> flingDecay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P0.j motionDurationScale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)F"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
    /* renamed from: f0.k$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Float>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f131242a;

        /* renamed from: b, reason: collision with root package name */
        Object f131243b;

        /* renamed from: c, reason: collision with root package name */
        int f131244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f131245d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C13922k f131246e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13897E f131247f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: f0.k$a$a, reason: collision with other inner class name */
        static final class C2081a extends Lambda implements Function1<C6451h<Float, C6456m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f131248f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC13897E f131249g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f131250h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C13922k f131251i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2081a(Ref.FloatRef floatRef, InterfaceC13897E interfaceC13897E, Ref.FloatRef floatRef2, C13922k c13922k) {
                super(1);
                this.f131248f = floatRef;
                this.f131249g = interfaceC13897E;
                this.f131250h = floatRef2;
                this.f131251i = c13922k;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6451h<Float, C6456m> c6451h) {
                a(c6451h);
                return Unit.f143329a;
            }

            public final void a(C6451h<Float, C6456m> c6451h) {
                float fFloatValue = c6451h.e().floatValue() - this.f131248f.f143739a;
                float fE = this.f131249g.e(fFloatValue);
                this.f131248f.f143739a = c6451h.e().floatValue();
                this.f131250h.f143739a = c6451h.f().floatValue();
                if (Math.abs(fFloatValue - fE) > 0.5f) {
                    c6451h.a();
                }
                C13922k c13922k = this.f131251i;
                c13922k.f(c13922k.getLastAnimationCycleCount() + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, C13922k c13922k, InterfaceC13897E interfaceC13897E, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131245d = f10;
            this.f131246e = c13922k;
            this.f131247f = interfaceC13897E;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f131245d, this.f131246e, this.f131247f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Float> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            AnimationState animationState;
            Ref.FloatRef floatRef;
            InterfaceC6468y interfaceC6468y;
            C2081a c2081a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f131244c;
            if (i10 == 0) {
                ResultKt.b(obj);
                if (Math.abs(this.f131245d) > 1.0f) {
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.f143739a = this.f131245d;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    AnimationState animationStateC = C6455l.c(0.0f, this.f131245d, 0L, 0L, false, 28, null);
                    try {
                        interfaceC6468y = this.f131246e.flingDecay;
                        c2081a = new C2081a(floatRef3, this.f131247f, floatRef2, this.f131246e);
                        this.f131242a = floatRef2;
                        this.f131243b = animationStateC;
                        this.f131244c = 1;
                        animationState = animationStateC;
                        try {
                        } catch (CancellationException unused) {
                            floatRef = floatRef2;
                            floatRef.f143739a = ((Number) animationState.m()).floatValue();
                            f10 = floatRef.f143739a;
                            return Boxing.c(f10);
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateC;
                    }
                    if (i0.h(animationState, interfaceC6468y, false, c2081a, this, 2, null) == objF) {
                        return objF;
                    }
                    floatRef = floatRef2;
                    f10 = floatRef.f143739a;
                } else {
                    f10 = this.f131245d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.f131243b;
                floatRef = (Ref.FloatRef) this.f131242a;
                try {
                    ResultKt.b(obj);
                } catch (CancellationException unused3) {
                    floatRef.f143739a = ((Number) animationState.m()).floatValue();
                    f10 = floatRef.f143739a;
                    return Boxing.c(f10);
                }
                f10 = floatRef.f143739a;
            }
            return Boxing.c(f10);
        }
    }

    public C13922k(InterfaceC6468y<Float> interfaceC6468y, P0.j jVar) {
        this.flingDecay = interfaceC6468y;
        this.motionDurationScale = jVar;
    }

    @Override // kotlin.InterfaceC13930s
    public Object a(InterfaceC13897E interfaceC13897E, float f10, Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return C15805i.g(this.motionDurationScale, new a(f10, this, interfaceC13897E, null), continuation);
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

    public /* synthetic */ C13922k(InterfaceC6468y interfaceC6468y, P0.j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6468y, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.g.f() : jVar);
    }
}
