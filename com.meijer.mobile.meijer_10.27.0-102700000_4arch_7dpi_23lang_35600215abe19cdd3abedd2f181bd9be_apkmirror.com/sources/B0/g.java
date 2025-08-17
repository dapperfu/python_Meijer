package B0;

import H1.s;
import U0.k;
import V0.InterfaceC5359x0;
import Z.T;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.C;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.C5824u;
import androidx.compose.ui.node.InterfaceC5812h;
import androidx.compose.ui.node.InterfaceC5823t;
import h0.j;
import h0.n;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010,\u001a\u00020+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010P\u001a\u00020*2\u0006\u0010K\u001a\u00020*8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00104R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"LB0/g;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/C;", "Lh0/j;", "interactionSource", "", "bounded", "LH1/h;", "radius", "LV0/x0;", "color", "Lkotlin/Function0;", "LB0/b;", "rippleAlpha", "<init>", "(Lh0/j;ZFLV0/x0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh0/n;", "pressInteraction", "", "W2", "(Lh0/n;)V", "Lh0/i;", "interaction", "Lqv/O;", "scope", "Y2", "(Lh0/i;Lqv/O;)V", "LH1/r;", "size", "f", "(J)V", "t2", "()V", "LX0/c;", "I", "(LX0/c;)V", "LX0/f;", "Q2", "(LX0/f;)V", "Lh0/n$b;", "LU0/k;", "", "targetRadius", "P2", "(Lh0/n$b;JF)V", "X2", "(Lh0/n$b;)V", "o", "Lh0/j;", "p", "Z", "R2", "()Z", "q", "F", "r", "LV0/x0;", "s", "Lkotlin/jvm/functions/Function0;", "S2", "()Lkotlin/jvm/functions/Function0;", "t", "o2", "shouldAutoInvalidate", "LB0/i;", "u", "LB0/i;", "stateLayer", "v", "V2", "()F", "setTargetRadius", "(F)V", "<set-?>", "w", "J", "U2", "()J", "rippleSize", "x", "hasValidSize", "LZ/T;", "y", "LZ/T;", "pendingInteractions", "LV0/q0;", "T2", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class g extends Modifier.c implements InterfaceC5812h, InterfaceC5823t, C {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5359x0 color;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Function0<RippleAlpha> rippleAlpha;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private i stateLayer;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean hasValidSize;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final T<n> pendingInteractions;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1689a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f1690b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: B0.g$a$a, reason: collision with other inner class name */
        static final class C0029a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f1692a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f1693b;

            C0029a(g gVar, InterfaceC16622O interfaceC16622O) {
                this.f1692a = gVar;
                this.f1693b = interfaceC16622O;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (!(iVar instanceof n)) {
                    this.f1692a.Y2(iVar, this.f1693b);
                } else if (this.f1692a.hasValidSize) {
                    this.f1692a.W2((n) iVar);
                } else {
                    this.f1692a.pendingInteractions.n(iVar);
                }
                return Unit.f142422a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f1690b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1689a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f1690b;
                InterfaceC17152f<h0.i> interfaceC17152fB = g.this.interactionSource.b();
                C0029a c0029a = new C0029a(g.this, interfaceC16622O);
                this.f1689a = 1;
                if (interfaceC17152fB.collect(c0029a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public /* synthetic */ g(j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, interfaceC5359x0, function0);
    }

    public abstract void P2(n.b interaction, long size, float targetRadius);

    public abstract void Q2(X0.f fVar);

    public abstract void X2(n.b interaction);

    @Override // androidx.compose.ui.node.C
    public void f(long size) {
        this.hasValidSize = true;
        H1.d dVarK = C5815k.k(this);
        this.rippleSize = s.d(size);
        this.targetRadius = Float.isNaN(this.radius) ? c.a(dVarK, this.bounded, this.rippleSize) : dVarK.I1(this.radius);
        T<n> t10 = this.pendingInteractions;
        Object[] objArr = t10.content;
        int i10 = t10._size;
        for (int i11 = 0; i11 < i10; i11++) {
            W2((n) objArr[i11]);
        }
        this.pendingInteractions.t();
    }

    private g(j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0, Function0<RippleAlpha> function0) {
        this.interactionSource = jVar;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC5359x0;
        this.rippleAlpha = function0;
        this.rippleSize = k.INSTANCE.b();
        this.pendingInteractions = new T<>(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(n pressInteraction) {
        if (pressInteraction instanceof n.b) {
            P2((n.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof n.c) {
            X2(((n.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof n.a) {
            X2(((n.a) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(h0.i interaction, InterfaceC16622O scope) {
        i iVar = this.stateLayer;
        if (iVar == null) {
            iVar = new i(this.bounded, this.rippleAlpha);
            C5824u.a(this);
            this.stateLayer = iVar;
        }
        iVar.c(interaction, scope);
    }

    /* renamed from: R2, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final Function0<RippleAlpha> S2() {
        return this.rippleAlpha;
    }

    public final long T2() {
        return this.color.a();
    }

    /* renamed from: U2, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    /* renamed from: V2, reason: from getter */
    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.InterfaceC5823t
    public void I(X0.c cVar) throws Throwable {
        cVar.a2();
        i iVar = this.stateLayer;
        if (iVar != null) {
            iVar.b(cVar, this.targetRadius, T2());
        }
        Q2(cVar);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        C16648k.d(j2(), null, null, new a(null), 3, null);
    }
}
