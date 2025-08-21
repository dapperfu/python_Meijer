package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import j1.C14920a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u0018*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u0018*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020 *\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\"J\u0017\u0010*\u001a\u00020 *\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u0017\u0010+\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u001b*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010-J\u001a\u0010/\u001a\u00020\u001b*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100Jg\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0019\u00102\u001a\u0015\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0002\b\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b5\u0010B\"\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\u00020O8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/node/E;", "coordinator", "Landroidx/compose/ui/layout/e;", "approachNode", "<init>", "(Landroidx/compose/ui/node/E;Landroidx/compose/ui/layout/e;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/J;", "g1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "LH1/h;", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "", "L", "(F)F", "K", "(I)F", "LU0/k;", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "Landroidx/compose/ui/layout/l0;", "rulers", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "a", "Landroidx/compose/ui/node/E;", "q", "()Landroidx/compose/ui/node/E;", "b", "Landroidx/compose/ui/layout/e;", "f", "()Landroidx/compose/ui/layout/e;", "A", "(Landroidx/compose/ui/layout/e;)V", "", "c", "Z", "()Z", "s", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "F1", "fontScale", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "LH1/r;", "r", "()J", "lookaheadSize", "v0", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5922g implements InterfaceC5921f, K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.E coordinator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5920e approachNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean approachMeasureRequired;

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013R-\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016¢\u0006\u0002\b\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"androidx/compose/ui/layout/g$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function1;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.g$a */
    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5916a, Integer> alignmentLines;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Function1<l0, Unit> rulers;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<f0.a, Unit> f51307e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5922g f51308f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<AbstractC5916a, Integer> map, Function1<? super l0, Unit> function1, Function1<? super f0.a, Unit> function12, C5922g c5922g) {
            this.f51307e = function12;
            this.f51308f = c5922g;
            this.width = i10;
            this.height = i11;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // androidx.compose.ui.layout.J
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.J
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5916a, Integer> r() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.J
        public void s() {
            this.f51307e.invoke(this.f51308f.getCoordinator().getPlacementScope());
        }

        @Override // androidx.compose.ui.layout.J
        public Function1<l0, Unit> t() {
            return this.rulers;
        }
    }

    @Override // H1.d
    public int E0(float f10) {
        return this.coordinator.E0(f10);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // H1.d
    public float I1(float f10) {
        return this.coordinator.I1(f10);
    }

    @Override // H1.d
    public float K(int i10) {
        return this.coordinator.K(i10);
    }

    @Override // H1.d
    public float L(float f10) {
        return this.coordinator.L(f10);
    }

    @Override // H1.d
    public float N0(long j10) {
        return this.coordinator.N0(j10);
    }

    @Override // H1.d
    public int N1(long j10) {
        return this.coordinator.N1(j10);
    }

    @Override // H1.d
    public long T(long j10) {
        return this.coordinator.T(j10);
    }

    @Override // androidx.compose.ui.layout.K
    public J g1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super f0.a, Unit> placementBlock) {
        return this.coordinator.g1(width, height, alignmentLines, placementBlock);
    }

    @Override // H1.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // H1.l
    public long o(float f10) {
        return this.coordinator.o(f10);
    }

    @Override // H1.d
    public long p(long j10) {
        return this.coordinator.p(j10);
    }

    @Override // H1.l
    public float t(long j10) {
        return this.coordinator.t(j10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public boolean v0() {
        return false;
    }

    @Override // H1.d
    public long w(int i10) {
        return this.coordinator.w(i10);
    }

    @Override // H1.d
    public long x(float f10) {
        return this.coordinator.x(f10);
    }

    public final void A(InterfaceC5920e interfaceC5920e) {
        this.approachNode = interfaceC5920e;
    }

    @Override // androidx.compose.ui.layout.K
    public J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C14920a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, placementBlock, this);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC5920e getApproachNode() {
        return this.approachNode;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public H1.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    /* renamed from: q, reason: from getter */
    public final androidx.compose.ui.node.E getCoordinator() {
        return this.coordinator;
    }

    public long r() {
        androidx.compose.ui.node.S lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        J jS1 = lookaheadDelegate.s1();
        return H1.r.c((jS1.getWidth() << 32) | (jS1.getHeight() & 4294967295L));
    }

    public final void s(boolean z10) {
        this.approachMeasureRequired = z10;
    }

    public C5922g(androidx.compose.ui.node.E e10, InterfaceC5920e interfaceC5920e) {
        this.coordinator = e10;
        this.approachNode = interfaceC5920e;
    }
}
