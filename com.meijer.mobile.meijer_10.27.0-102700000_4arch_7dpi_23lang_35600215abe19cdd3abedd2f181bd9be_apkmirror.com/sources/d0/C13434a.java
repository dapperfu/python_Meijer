package d0;

import V0.C5349s0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.InterfaceC5814j;
import g1.C14167A;
import g1.InterfaceC14171c;
import j0.InterfaceC14794C;
import kotlin.C13821t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J6\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u000fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b/\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00105R \u0010<\u001a\b\u0012\u0004\u0012\u00020\f078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010D\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010\u000e\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u001c\u0010G\u001a\u00020)8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u00102R\u001c\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010KR\u001a\u0010Q\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Ld0/a;", "Ld0/J;", "Landroid/content/Context;", "context", "LH1/d;", "density", "LV0/q0;", "glowColor", "Lj0/C;", "glowDrawPadding", "<init>", "(Landroid/content/Context;LH1/d;JLj0/C;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "g", "()V", "LU0/f;", "delta", "", "o", "(J)Z", "scroll", "", "n", "(J)F", "k", "l", "m", "Lf1/e;", "source", "Lkotlin/Function1;", "performScroll", "b", "(JILkotlin/jvm/functions/Function1;)J", "LH1/y;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LU0/k;", "size", "p", "(J)V", "h", "()J", "j", "a", "LH1/d;", "J", "pointerPosition", "Ld0/s;", "Ld0/s;", "edgeEffectWrapper", "Landroidx/compose/runtime/l0;", "d", "Landroidx/compose/runtime/l0;", "i", "()Landroidx/compose/runtime/l0;", "redrawSignal", "e", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "f", "scrollCycleInProgress", "containerSize", "Lg1/A;", "pointerId", "Lg1/W;", "Lg1/W;", "pointerInputNode", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/j;", "A", "()Landroidx/compose/ui/node/j;", "node", "isInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13434a implements J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long pointerPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13451s edgeEffectWrapper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Unit> redrawSignal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long pointerId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g1.W pointerInputNode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5814j node;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {688, 720}, m = "applyToFling-BMRW4eQ")
    /* renamed from: d0.a$a, reason: collision with other inner class name */
    static final class C1994a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f126928a;

        /* renamed from: b, reason: collision with root package name */
        long f126929b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f126930c;

        /* renamed from: e, reason: collision with root package name */
        int f126932e;

        C1994a(Continuation<? super C1994a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126930c = obj;
            this.f126932e |= Integer.MIN_VALUE;
            return C13434a.this.c(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.a$b */
    static final class b implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: d0.a$b$a, reason: collision with other inner class name */
        static final class C1995a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f126934b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f126935c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C13434a f126936d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1995a(C13434a c13434a, Continuation<? super C1995a> continuation) {
                super(2, continuation);
                this.f126936d = c13434a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1995a c1995a = new C1995a(this.f126936d, continuation);
                c1995a.f126935c = obj;
                return c1995a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((C1995a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
            
                if (r15 != r0) goto L18;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:18:0x0061). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 227
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: d0.C13434a.b.C1995a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            Object objD = C13821t.d(j10, new C1995a(C13434a.this, null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
        }
    }

    public /* synthetic */ C13434a(Context context, H1.d dVar, long j10, InterfaceC14794C interfaceC14794C, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, j10, interfaceC14794C);
    }

    private C13434a(Context context, H1.d dVar, long j10, InterfaceC14794C interfaceC14794C) {
        this.density = dVar;
        this.pointerPosition = U0.f.INSTANCE.b();
        C13451s c13451s = new C13451s(context, C5349s0.j(j10));
        this.edgeEffectWrapper = c13451s;
        this.redrawSignal = o1.i(Unit.f142422a, o1.k());
        this.invalidationEnabled = true;
        this.containerSize = U0.k.INSTANCE.b();
        this.pointerId = C14167A.a(-1L);
        g1.W wA = g1.U.a(new b());
        this.pointerInputNode = wA;
        this.node = Build.VERSION.SDK_INT >= 31 ? new b0(wA, this, c13451s) : new C13455w(wA, this, c13451s, interfaceC14794C);
    }

    private final void g() {
        boolean z10;
        C13451s c13451s = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = c13451s.topEffect;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = c13451s.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = c13451s.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = c13451s.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean o(long r11) {
        /*
            r10 = this;
            d0.s r0 = r10.edgeEffectWrapper
            boolean r0 = r0.s()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            d0.q r4 = d0.C13450q.f126991a
            d0.s r5 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r5 = r5.i()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.f(r5, r0)
            d0.s r0 = r10.edgeEffectWrapper
            boolean r0 = r0.s()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            d0.s r4 = r10.edgeEffectWrapper
            boolean r4 = r4.v()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            d0.q r4 = d0.C13450q.f126991a
            d0.s r6 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r6 = r6.k()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.f(r6, r1)
            if (r0 != 0) goto L5e
            d0.s r0 = r10.edgeEffectWrapper
            boolean r0 = r0.v()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            d0.s r1 = r10.edgeEffectWrapper
            boolean r1 = r1.z()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            d0.q r4 = d0.C13450q.f126991a
            d0.s r8 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r8 = r8.m()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.f(r8, r1)
            if (r0 != 0) goto L93
            d0.s r0 = r10.edgeEffectWrapper
            boolean r0 = r0.z()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            d0.s r1 = r10.edgeEffectWrapper
            boolean r1 = r1.p()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            d0.q r12 = d0.C13450q.f126991a
            d0.s r1 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r1 = r1.g()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.f(r1, r11)
            if (r0 != 0) goto Lc1
            d0.s r11 = r10.edgeEffectWrapper
            boolean r11 = r11.p()
            if (r11 == 0) goto Lc0
            goto Lc1
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13434a.o(long):boolean");
    }

    @Override // d0.J
    /* renamed from: A, reason: from getter */
    public InterfaceC5814j getNode() {
        return this.node;
    }

    @Override // d0.J
    public boolean a() {
        C13451s c13451s = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = c13451s.topEffect;
        if (edgeEffect != null && C13450q.f126991a.c(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c13451s.bottomEffect;
        if (edgeEffect2 != null && C13450q.f126991a.c(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c13451s.leftEffect;
        if (edgeEffect3 != null && C13450q.f126991a.c(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c13451s.rightEffect;
        return (edgeEffect4 == null || C13450q.f126991a.c(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
      0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
      0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r20, int r22, kotlin.jvm.functions.Function1<? super U0.f, U0.f> r23) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13434a.b(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r12, kotlin.jvm.functions.Function2<? super H1.y, ? super kotlin.coroutines.Continuation<? super H1.y>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13434a.c(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long h() {
        long jB = this.pointerPosition;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = U0.l.b(this.containerSize);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final InterfaceC5730l0<Unit> i() {
        return this.redrawSignal;
    }

    public final void j() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.f142422a);
        }
    }

    public final void p(long size) {
        boolean zF = U0.k.f(this.containerSize, U0.k.INSTANCE.b());
        boolean zF2 = U0.k.f(size, this.containerSize);
        this.containerSize = size;
        if (!zF2) {
            this.edgeEffectWrapper.C(H1.r.c((MathKt.d(Float.intBitsToFloat((int) (size & 4294967295L))) & 4294967295L) | (MathKt.d(Float.intBitsToFloat((int) (size >> 32))) << 32)));
        }
        if (zF || zF2) {
            return;
        }
        g();
    }

    private final float k(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i10 = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectG = this.edgeEffectWrapper.g();
        C13450q c13450q = C13450q.f126991a;
        float fIntBitsToFloat3 = (-c13450q.e(edgeEffectG, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        if (c13450q.c(edgeEffectG) == 0.0f) {
            return fIntBitsToFloat3;
        }
        return Float.intBitsToFloat(i10);
    }

    private final float l(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & 4294967295L));
        int i10 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectI = this.edgeEffectWrapper.i();
        C13450q c13450q = C13450q.f126991a;
        float fE = c13450q.e(edgeEffectI, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32));
        if (c13450q.c(edgeEffectI) == 0.0f) {
            return fE;
        }
        return Float.intBitsToFloat(i10);
    }

    private final float m(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() & 4294967295L));
        int i10 = (int) (scroll >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect edgeEffectK = this.edgeEffectWrapper.k();
        C13450q c13450q = C13450q.f126991a;
        float fIntBitsToFloat3 = (-c13450q.e(edgeEffectK, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32));
        if (c13450q.c(edgeEffectK) == 0.0f) {
            return fIntBitsToFloat3;
        }
        return Float.intBitsToFloat(i10);
    }

    private final float n(long scroll) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h() >> 32));
        int i10 = (int) (scroll & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect edgeEffectM = this.edgeEffectWrapper.m();
        C13450q c13450q = C13450q.f126991a;
        float fE = c13450q.e(edgeEffectM, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        if (c13450q.c(edgeEffectM) == 0.0f) {
            return fE;
        }
        return Float.intBitsToFloat(i10);
    }
}
