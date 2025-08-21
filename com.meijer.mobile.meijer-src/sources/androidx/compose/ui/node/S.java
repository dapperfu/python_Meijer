package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.LayoutCoordinates;
import j1.C14920a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u001fJ%\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u000bR$\u00105\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010B\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020\f0C8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020<8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010MR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010JR\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010i\u001a\u00020g8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u00100R\u001a\u0010l\u001a\u00020j8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u00100R\u0014\u0010p\u001a\u00020m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010s\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006u"}, d2 = {"Landroidx/compose/ui/node/S;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/node/Q;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "LH1/n;", "position", "", "m2", "(J)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "e2", "(Landroidx/compose/ui/layout/a;)I", "R1", "()V", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "n2", "l2", "height", "d0", "(I)I", "j0", "width", "W", "A", "ancestor", "", "excludingAgnosticOffset", "o2", "(Landroidx/compose/ui/node/S;Z)J", "p", "Landroidx/compose/ui/node/NodeCoordinator;", "i2", "()Landroidx/compose/ui/node/NodeCoordinator;", "q", "J", "w1", "()J", "p2", "", "r", "Ljava/util/Map;", "oldAlignmentLines", "Landroidx/compose/ui/layout/G;", "s", "Landroidx/compose/ui/layout/G;", "j2", "()Landroidx/compose/ui/layout/G;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/J;", "result", "t", "Landroidx/compose/ui/layout/J;", "q2", "(Landroidx/compose/ui/layout/J;)V", "_measureResult", "LZ/S;", "u", "LZ/S;", "g2", "()LZ/S;", "cachedAlignmentLinesMap", "m1", "()Landroidx/compose/ui/node/Q;", "child", "r1", "()Z", "hasMeasureResult", "s1", "()Landroidx/compose/ui/layout/J;", "measureResult", "v0", "isLookingAhead", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "getDensity", "()F", "density", "F1", "fontScale", "u1", "parent", "Landroidx/compose/ui/node/LayoutNode;", "S1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "q1", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "LH1/r;", "k2", "size", "LH1/b;", "h2", "constraints", "Landroidx/compose/ui/node/b;", "c2", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "", "a", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class S extends Q implements androidx.compose.ui.layout.I {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final NodeCoordinator coordinator;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5916a, Integer> oldAlignmentLines;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.J _measureResult;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long position = H1.n.INSTANCE.b();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.layout.G lookaheadLayoutCoordinates = new androidx.compose.ui.layout.G(this);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Z.S<AbstractC5916a> cachedAlignmentLinesMap = Z.b0.b();

    public abstract int A(int width);

    public abstract int W(int width);

    public abstract int d0(int height);

    public abstract int j0(int height);

    @Override // androidx.compose.ui.node.Q, androidx.compose.ui.layout.InterfaceC5933s
    public boolean v0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(androidx.compose.ui.layout.J j10) {
        Unit unit;
        Map<AbstractC5916a, Integer> map;
        if (j10 != null) {
            Z0(H1.r.c((j10.getF51222b() & 4294967295L) | (j10.getF51221a() << 32)));
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Z0(H1.r.INSTANCE.a());
        }
        if (!Intrinsics.e(this._measureResult, j10) && j10 != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !j10.r().isEmpty()) && !Intrinsics.e(j10.r(), this.oldAlignmentLines))) {
            c2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(j10.r());
        }
        this._measureResult = j10;
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.Q, androidx.compose.ui.node.W
    /* renamed from: S1 */
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.layout.L, androidx.compose.ui.layout.r
    /* renamed from: a */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public InterfaceC5943b c2() {
        InterfaceC5943b interfaceC5943bP = this.coordinator.getLayoutNode().getLayoutDelegate().p();
        Intrinsics.g(interfaceC5943bP);
        return interfaceC5943bP;
    }

    public final int e2(AbstractC5916a alignmentLine) {
        return this.cachedAlignmentLinesMap.e(alignmentLine, Integer.MIN_VALUE);
    }

    protected final Z.S<AbstractC5916a> g2() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // H1.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public H1.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    /* renamed from: i2, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* renamed from: j2, reason: from getter */
    public final androidx.compose.ui.layout.G getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.Q
    public Q m1() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    public final long o2(S ancestor, boolean excludingAgnosticOffset) {
        long jB = H1.n.INSTANCE.b();
        S lookaheadDelegate = this;
        while (!Intrinsics.e(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jB = H1.n.o(jB, lookaheadDelegate.getPosition());
            }
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.g(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
        }
        return jB;
    }

    public void p2(long j10) {
        this.position = j10;
    }

    @Override // androidx.compose.ui.node.Q
    public LayoutCoordinates q1() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.Q
    public boolean r1() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.Q
    public androidx.compose.ui.layout.J s1() {
        androidx.compose.ui.layout.J j10 = this._measureResult;
        if (j10 != null) {
            return j10;
        }
        C14920a.c("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.Q
    public Q u1() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Q
    /* renamed from: w1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public S(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    private final void m2(long position) {
        if (!H1.n.j(getPosition(), position)) {
            p2(position);
            T tV = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (tV != null) {
                tV.Z1();
            }
            y1(this.coordinator);
        }
        if (!getIsPlacingForAlignment()) {
            j1(s1());
        }
    }

    @Override // androidx.compose.ui.node.Q
    public void R1() {
        V0(getPosition(), 0.0f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public final void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        m2(position);
        if (getIsShallowPlacing()) {
            return;
        }
        l2();
    }

    public final long h2() {
        return getMeasurementConstraints();
    }

    public final long k2() {
        return H1.r.c((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    protected void l2() {
        s1().s();
    }

    public final void n2(long position) {
        m2(H1.n.o(position, getApparentToRealOffset()));
    }
}
