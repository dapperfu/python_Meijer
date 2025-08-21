package kotlin;

import androidx.compose.runtime.snapshots.g;
import kotlin.AnimationState;
import kotlin.C6446d0;
import kotlin.C6453j;
import kotlin.C6455l;
import kotlin.C6456m;
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
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o0;
import kotlin.q0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln0/G;", "", "<init>", "()V", "", "delta", "LH1/d;", "density", "Lmv/O;", "coroutineScope", "", "c", "(FLH1/d;Lmv/O;)V", "Lc0/k;", "Lc0/m;", "a", "Lc0/k;", "_scrollDeltaBetweenPasses", "b", "()F", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15848G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AnimationState<Float, C6456m> _scrollDeltaBetweenPasses;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: n0.G$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151835a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15848G.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151835a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AnimationState animationState = C15848G.this._scrollDeltaBetweenPasses;
                Float fC = Boxing.c(0.0f);
                C6446d0 c6446d0J = C6453j.j(0.0f, 400.0f, Boxing.c(0.5f), 1, null);
                this.f151835a = 1;
                if (i0.j(animationState, fC, c6446d0J, true, null, this, 8, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: n0.G$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151837a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15848G.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151837a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AnimationState animationState = C15848G.this._scrollDeltaBetweenPasses;
                Float fC = Boxing.c(0.0f);
                C6446d0 c6446d0J = C6453j.j(0.0f, 400.0f, Boxing.c(0.5f), 1, null);
                this.f151837a = 1;
                if (i0.j(animationState, fC, c6446d0J, true, null, this, 8, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public final float b() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final void c(float delta, H1.d density, InterfaceC15783O coroutineScope) {
        if (delta <= density.I1(C15849H.f151839a)) {
            return;
        }
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.getIsRunning()) {
                this._scrollDeltaBetweenPasses = C6455l.g(this._scrollDeltaBetweenPasses, fFloatValue - delta, 0.0f, 0L, 0L, false, 30, null);
                C15809k.d(coroutineScope, null, null, new a(null), 3, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(q0.i(FloatCompanionObject.f143729a), Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
                C15809k.d(coroutineScope, null, null, new b(null), 3, null);
            }
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th2) {
            companion.l(gVarD, gVarE, function1G);
            throw th2;
        }
    }

    public C15848G() {
        o0<Float, C6456m> o0VarI = q0.i(FloatCompanionObject.f143729a);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = C6455l.d(o0VarI, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }
}
