package androidx.compose.ui.draw;

import H1.s;
import H1.t;
import T0.i;
import V0.InterfaceC5453d1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.C5966u;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B(\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0013\u0010\u0019\u001a\u00020\u0011*\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#RL\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00107\u001a\u0002048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/ui/draw/a;", "Landroidx/compose/ui/Modifier$c;", "LT0/c;", "Landroidx/compose/ui/node/i0;", "LT0/b;", "LT0/d;", "cacheDrawScope", "Lkotlin/Function1;", "LT0/i;", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(LT0/d;Lkotlin/jvm/functions/Function1;)V", "LX0/c;", "contentDrawScope", "M2", "(LX0/c;)LT0/i;", "", "u2", "()V", "z1", "B0", "c1", "M", "o0", "I", "(LX0/c;)V", "o", "LT0/d;", "", "p", "Z", "isCacheValid", "Landroidx/compose/ui/draw/f;", "q", "Landroidx/compose/ui/draw/f;", "cachedGraphicsContext", "value", "r", "Lkotlin/jvm/functions/Function1;", "K2", "()Lkotlin/jvm/functions/Function1;", "N2", "(Lkotlin/jvm/functions/Function1;)V", "LH1/d;", "getDensity", "()LH1/d;", "density", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "LU0/k;", "b", "()J", "size", "LV0/d1;", "L2", "()LV0/d1;", "graphicsContext", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class a extends Modifier.c implements T0.c, i0, T0.b {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final T0.d cacheDrawScope;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isCacheValid;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private f cachedGraphicsContext;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1<? super T0.d, i> block;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/d1;", "c", "()LV0/d1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    static final class C1059a extends Lambda implements Function0<InterfaceC5453d1> {
        C1059a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5453d1 invoke() {
            return a.this.L2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T0.d f50787g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T0.d dVar) {
            super(0);
            this.f50787g = dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.K2().invoke(this.f50787g);
        }
    }

    private final i M2(X0.c contentDrawScope) {
        if (!this.isCacheValid) {
            T0.d dVar = this.cacheDrawScope;
            dVar.A(null);
            dVar.s(contentDrawScope);
            j0.a(this, new b(dVar));
            if (dVar.getDrawResult() == null) {
                C14920a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.isCacheValid = true;
        }
        i drawResult = this.cacheDrawScope.getDrawResult();
        Intrinsics.g(drawResult);
        return drawResult;
    }

    public final Function1<T0.d, i> K2() {
        return this.block;
    }

    public final InterfaceC5453d1 L2() {
        f fVar = this.cachedGraphicsContext;
        if (fVar == null) {
            fVar = new f();
            this.cachedGraphicsContext = fVar;
        }
        if (fVar.getGraphicsContext() == null) {
            fVar.e(C5957k.l(this));
        }
        return fVar;
    }

    public final void N2(Function1<? super T0.d, i> function1) {
        this.block = function1;
        c1();
    }

    @Override // T0.b
    public long b() {
        return s.d(C5957k.j(this, C5952f0.a(128)).c());
    }

    @Override // T0.c
    public void c1() {
        f fVar = this.cachedGraphicsContext;
        if (fVar != null) {
            fVar.d();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.A(null);
        C5966u.a(this);
    }

    public a(T0.d dVar, Function1<? super T0.d, i> function1) {
        this.cacheDrawScope = dVar;
        this.block = function1;
        dVar.r(this);
        dVar.B(new C1059a());
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        c1();
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        M2(cVar).a().invoke(cVar);
    }

    @Override // androidx.compose.ui.node.InterfaceC5956j, androidx.compose.ui.node.q0
    public void M() {
        c1();
    }

    @Override // T0.b
    public H1.d getDensity() {
        return C5957k.k(this);
    }

    @Override // T0.b
    public t getLayoutDirection() {
        return C5957k.n(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC5956j
    public void o0() {
        c1();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        super.u2();
        f fVar = this.cachedGraphicsContext;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void z1() {
        c1();
    }
}
