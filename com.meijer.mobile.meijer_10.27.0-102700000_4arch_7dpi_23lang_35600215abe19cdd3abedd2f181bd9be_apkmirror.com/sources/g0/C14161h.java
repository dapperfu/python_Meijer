package g0;

import i0.C14589e;
import kotlin.AnimationState;
import kotlin.C6288A;
import kotlin.C6329l;
import kotlin.C6330m;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13796N;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001f\u0010\u0019J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J0\u0010$\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b$\u0010\u0013J\u001a\u0010'\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00100R\"\u00108\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lg0/h;", "Lf0/N;", "Lg0/j;", "snapLayoutInfoProvider", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "snapAnimationSpec", "<init>", "(Lg0/j;Lc0/y;Lc0/i;)V", "Lf0/E;", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingScrollOffsetUpdate", "Lg0/a;", "Lc0/m;", "i", "(Lf0/E;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Lc0/k;", "l", "(Lf0/E;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialTargetOffset", "Lkotlin/ParameterName;", "name", "delta", "onAnimationStep", "k", "", "j", "(FF)Z", "onRemainingDistanceUpdated", "c", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lg0/j;", "b", "Lc0/y;", "Lc0/i;", "LP0/j;", "d", "LP0/j;", "getMotionScaleDuration$foundation_release", "()LP0/j;", "setMotionScaleDuration$foundation_release", "(LP0/j;)V", "motionScaleDuration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14161h implements InterfaceC13796N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14163j snapLayoutInfoProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6342y<Float> decayAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6326i<Float> snapAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private P0.j motionScaleDuration = androidx.compose.foundation.gestures.g.f();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {115}, m = "fling")
    /* renamed from: g0.h$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132490a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132491b;

        /* renamed from: d, reason: collision with root package name */
        int f132493d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132491b = obj;
            this.f132493d |= Integer.MIN_VALUE;
            return C14161h.this.i(null, 0.0f, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "Lg0/a;", "", "Lc0/m;", "<anonymous>", "(Lqv/O;)Lg0/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: g0.h$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super C14154a<Float, C6330m>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132494a;

        /* renamed from: b, reason: collision with root package name */
        int f132495b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f132497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f132498e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f132499f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: g0.h$b$a */
        static final class a extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f132500f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<Float, Unit> f132501g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Ref.FloatRef floatRef, Function1<? super Float, Unit> function1) {
                super(1);
                this.f132500f = floatRef;
                this.f132501g = function1;
            }

            public final void b(float f10) {
                Ref.FloatRef floatRef = this.f132500f;
                float f11 = floatRef.f142832a - f10;
                floatRef.f142832a = f11;
                this.f132501g.invoke(Float.valueOf(f11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: g0.h$b$b, reason: collision with other inner class name */
        static final class C2088b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f132502f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<Float, Unit> f132503g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2088b(Ref.FloatRef floatRef, Function1<? super Float, Unit> function1) {
                super(1);
                this.f132502f = floatRef;
                this.f132503g = function1;
            }

            public final void b(float f10) {
                Ref.FloatRef floatRef = this.f132502f;
                float f11 = floatRef.f142832a - f10;
                floatRef.f142832a = f11;
                this.f132503g.invoke(Float.valueOf(f11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f10, Function1<? super Float, Unit> function1, InterfaceC13787E interfaceC13787E, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f132497d = f10;
            this.f132498e = function1;
            this.f132499f = interfaceC13787E;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14161h.this.new b(this.f132497d, this.f132498e, this.f132499f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super C14154a<Float, C6330m>> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.FloatRef floatRef;
            Object objL;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f132495b;
            if (i10 == 0) {
                ResultKt.b(obj);
                float fB = C14161h.this.snapLayoutInfoProvider.b(this.f132497d, C6288A.a(C14161h.this.decayAnimationSpec, 0.0f, this.f132497d));
                if (Float.isNaN(fB)) {
                    C14589e.c("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                floatRef = new Ref.FloatRef();
                float fAbs = Math.abs(fB) * Math.signum(this.f132497d);
                floatRef.f142832a = fAbs;
                this.f132498e.invoke(Boxing.c(fAbs));
                C14161h c14161h = C14161h.this;
                InterfaceC13787E interfaceC13787E = this.f132499f;
                float f10 = floatRef.f142832a;
                float f11 = this.f132497d;
                C2088b c2088b = new C2088b(floatRef, this.f132498e);
                this.f132494a = floatRef;
                this.f132495b = 1;
                objL = c14161h.l(interfaceC13787E, f10, f11, c2088b, this);
                if (objL != objF) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            Ref.FloatRef floatRef2 = (Ref.FloatRef) this.f132494a;
            ResultKt.b(obj);
            floatRef = floatRef2;
            objL = obj;
            AnimationState animationState = (AnimationState) objL;
            float fA = C14161h.this.snapLayoutInfoProvider.a(((Number) animationState.m()).floatValue());
            if (Float.isNaN(fA)) {
                C14589e.c("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            floatRef.f142832a = fA;
            InterfaceC13787E interfaceC13787E2 = this.f132499f;
            AnimationState animationStateG = C6329l.g(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            InterfaceC6326i interfaceC6326i = C14161h.this.snapAnimationSpec;
            a aVar = new a(floatRef, this.f132498e);
            this.f132494a = null;
            this.f132495b = 2;
            Object objH = C14162i.h(interfaceC13787E2, fA, fA, animationStateG, interfaceC6326i, aVar, this);
            return objH == objF ? objF : objH;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {101}, m = "performFling")
    /* renamed from: g0.h$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f132504a;

        /* renamed from: c, reason: collision with root package name */
        int f132506c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132504a = obj;
            this.f132506c |= Integer.MIN_VALUE;
            return C14161h.this.c(null, 0.0f, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {175}, m = "tryApproach")
    /* renamed from: g0.h$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f132507a;

        /* renamed from: c, reason: collision with root package name */
        int f132509c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132507a = obj;
            this.f132509c |= Integer.MIN_VALUE;
            return C14161h.this.l(null, 0.0f, 0.0f, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.InterfaceC13787E r11, float r12, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, kotlin.coroutines.Continuation<? super g0.C14154a<java.lang.Float, kotlin.C6330m>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof g0.C14161h.a
            if (r0 == 0) goto L13
            r0 = r14
            g0.h$a r0 = (g0.C14161h.a) r0
            int r1 = r0.f132493d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132493d = r1
            goto L18
        L13:
            g0.h$a r0 = new g0.h$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f132491b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f132493d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f132490a
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            kotlin.ResultKt.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.ResultKt.b(r14)
            P0.j r14 = r10.motionScaleDuration
            g0.h$b r4 = new g0.h$b
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f132490a = r7
            r0.f132493d = r3
            java.lang.Object r14 = qv.C16644i.g(r14, r4, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r7
        L51:
            g0.a r14 = (g0.C14154a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.c(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14161h.i(f0.E, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean j(float offset, float velocity) {
        return Math.abs(C6288A.a(this.decayAnimationSpec, 0.0f, velocity)) >= Math.abs(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.InterfaceC13787E r18, float r19, float r20, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r21, kotlin.coroutines.Continuation<? super kotlin.AnimationState<java.lang.Float, kotlin.C6330m>> r22) {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof g0.C14161h.d
            if (r1 == 0) goto L18
            r1 = r0
            g0.h$d r1 = (g0.C14161h.d) r1
            int r2 = r1.f132509c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f132509c = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            g0.h$d r1 = new g0.h$d
            r2 = r17
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f132507a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r7.f132509c
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            kotlin.ResultKt.b(r0)
            goto L71
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.ResultKt.b(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            c0.k r0 = kotlin.C6329l.c(r8, r9, r10, r12, r14, r15, r16)
            return r0
        L60:
            r7.f132509c = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L71
            return r1
        L71:
            g0.a r0 = (g0.C14154a) r0
            c0.k r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14161h.l(f0.E, float, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13796N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.InterfaceC13787E r5, float r6, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof g0.C14161h.c
            if (r0 == 0) goto L13
            r0 = r8
            g0.h$c r0 = (g0.C14161h.c) r0
            int r1 = r0.f132506c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132506c = r1
            goto L18
        L13:
            g0.h$c r0 = new g0.h$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f132504a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f132506c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r8)
            r0.f132506c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            g0.a r8 = (g0.C14154a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            c0.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.m()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.c(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14161h.c(f0.E, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(Object other) {
        if (other instanceof C14161h) {
            C14161h c14161h = (C14161h) other;
            if (Intrinsics.e(c14161h.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.e(c14161h.decayAnimationSpec, this.decayAnimationSpec) && Intrinsics.e(c14161h.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }

    public C14161h(InterfaceC14163j interfaceC14163j, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i) {
        this.snapLayoutInfoProvider = interfaceC14163j;
        this.decayAnimationSpec = interfaceC6342y;
        this.snapAnimationSpec = interfaceC6326i;
    }

    private final Object k(InterfaceC13787E interfaceC13787E, float f10, float f11, Function1<? super Float, Unit> function1, Continuation<? super C14154a<Float, C6330m>> continuation) {
        InterfaceC14155b c14166m;
        if (j(f10, f11)) {
            c14166m = new C14156c(this.decayAnimationSpec);
        } else {
            c14166m = new C14166m(this.snapAnimationSpec);
        }
        return C14162i.i(interfaceC13787E, f10, f11, c14166m, function1, continuation);
    }
}
