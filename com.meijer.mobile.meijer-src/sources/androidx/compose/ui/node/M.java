package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\"\u00103\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\"\u00107\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\"\u0010=\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010@\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R*\u0010D\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0012\u001a\u0004\b4\u0010\u001c\"\u0004\bC\u0010\u001eR*\u0010G\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0012\u001a\u0004\b0\u0010\u001c\"\u0004\bF\u0010\u001eR*\u0010J\u001a\u0002082\u0006\u0010A\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\f\u001a\u0004\b%\u0010:\"\u0004\bI\u0010<R*\u0010M\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\bK\u0010\u001c\"\u0004\bL\u0010\u001eR*\u0010Q\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0012\u001a\u0004\bO\u0010\u001c\"\u0004\bP\u0010\u001eR*\u0010S\u001a\u0002082\u0006\u0010A\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b,\u0010:\"\u0004\bR\u0010<R\u001a\u0010Y\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR(\u0010_\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010\\\u001a\u0004\b]\u0010^R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0019\u0010e\u001a\u0004\u0018\u00010\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bE\u0010dR\u0019\u0010f\u001a\u0004\u0018\u00010\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010dR\u0014\u0010g\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0014\u0010i\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010:R\u0014\u0010k\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u001cR\u0014\u0010l\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u0014\u0010o\u001a\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010nR\u0016\u0010p\u001a\u0004\u0018\u00010m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/ui/node/M;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "E", "()V", "H", "F", "G", "I", "LH1/b;", "constraints", "J", "(J)V", "b", "Z", "C", "K", "D", "a", "Landroidx/compose/ui/node/LayoutNode;", "m", "()Landroidx/compose/ui/node/LayoutNode;", "", "h", "()Z", "P", "(Z)V", "detachedFromParentLookaheadPass", "c", "i", "Q", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/LayoutNode$e;", "d", "Landroidx/compose/ui/node/LayoutNode$e;", "o", "()Landroidx/compose/ui/node/LayoutNode$e;", "R", "(Landroidx/compose/ui/node/LayoutNode$e;)V", "layoutState", "e", "u", "W", "lookaheadMeasurePending", "f", "s", "U", "lookaheadLayoutPending", "g", "t", "V", "lookaheadLayoutPendingForAlignment", "", "y", "()I", "X", "(I)V", "nextChildLookaheadPlaceOrder", "z", "Y", "nextChildPlaceOrder", "value", "j", "O", "coordinatesAccessedDuringPlacement", "k", "N", "coordinatesAccessedDuringModifierPlacement", "l", "L", "childrenAccessingCoordinatesDuringPlacement", "r", "T", "lookaheadCoordinatesAccessedDuringPlacement", "n", "q", "S", "lookaheadCoordinatesAccessedDuringModifierPlacement", "M", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/V;", "p", "Landroidx/compose/ui/node/V;", "w", "()Landroidx/compose/ui/node/V;", "measurePassDelegate", "Landroidx/compose/ui/node/T;", "<set-?>", "Landroidx/compose/ui/node/T;", "v", "()Landroidx/compose/ui/node/T;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "A", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "()LH1/b;", "lastConstraints", "lastLookaheadConstraints", "height", "B", "width", "x", "measurePending", "layoutPending", "Landroidx/compose/ui/node/b;", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "lookaheadAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPlacement;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private T lookaheadPassDelegate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private LayoutNode.e layoutState = LayoutNode.e.f51469e;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final V measurePassDelegate = new V(this);

    public final void F() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void G() {
        this.lookaheadMeasurePending = true;
    }

    public final void a() {
        this.lookaheadPassDelegate = null;
    }

    public final NodeCoordinator A() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final int B() {
        return this.measurePassDelegate.getWidth();
    }

    public final void C() {
        this.measurePassDelegate.X1();
        T t10 = this.lookaheadPassDelegate;
        if (t10 != null) {
            t10.T1();
        }
    }

    public final void D() {
        this.measurePassDelegate.s2(true);
        T t10 = this.lookaheadPassDelegate;
        if (t10 != null) {
            t10.n2(true);
        }
    }

    public final void E() {
        this.measurePassDelegate.c2();
    }

    public final void H() {
        this.measurePassDelegate.e2();
    }

    public final void I() {
        LayoutNode.e eVarX = this.layoutNode.X();
        if (eVarX == LayoutNode.e.f51467c || eVarX == LayoutNode.e.f51468d) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (eVarX == LayoutNode.e.f51468d) {
            T t10 = this.lookaheadPassDelegate;
            if (t10 == null || !t10.getLayingOutChildren()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void J(long constraints) {
        T t10 = this.lookaheadPassDelegate;
        if (t10 != null) {
            t10.j2(constraints);
        }
    }

    public final void K() {
        AbstractC5941a alignmentLines;
        this.measurePassDelegate.getAlignmentLines().p();
        T t10 = this.lookaheadPassDelegate;
        if (t10 == null || (alignmentLines = t10.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.p();
    }

    public final void L(int i10) {
        int i11 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            M layoutDelegate = parent$ui_release != null ? parent$ui_release.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void M(int i10) {
        int i11 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            M layoutDelegate = parent$ui_release != null ? parent$ui_release.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void N(boolean z10) {
        if (this.coordinatesAccessedDuringModifierPlacement != z10) {
            this.coordinatesAccessedDuringModifierPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void O(boolean z10) {
        if (this.coordinatesAccessedDuringPlacement != z10) {
            this.coordinatesAccessedDuringPlacement = z10;
            if (z10 && !this.coordinatesAccessedDuringModifierPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void P(boolean z10) {
        this.detachedFromParentLookaheadPass = z10;
    }

    public final void Q(boolean z10) {
        this.detachedFromParentLookaheadPlacement = z10;
    }

    public final void R(LayoutNode.e eVar) {
        this.layoutState = eVar;
    }

    public final void S(boolean z10) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z10) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z10;
            if (z10 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void T(boolean z10) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z10) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z10;
            if (z10 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z10 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void U(boolean z10) {
        this.lookaheadLayoutPending = z10;
    }

    public final void V(boolean z10) {
        this.lookaheadLayoutPendingForAlignment = z10;
    }

    public final void W(boolean z10) {
        this.lookaheadMeasurePending = z10;
    }

    public final void X(int i10) {
        this.nextChildLookaheadPlaceOrder = i10;
    }

    public final void Y(int i10) {
        this.nextChildPlaceOrder = i10;
    }

    public final void Z() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.y2() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.s1(parent$ui_release, false, false, false, 7, null);
        }
        T t10 = this.lookaheadPassDelegate;
        if (t10 == null || !t10.w2()) {
            return;
        }
        if (N.a(this.layoutNode)) {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                LayoutNode.s1(parent$ui_release2, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            LayoutNode.o1(parent$ui_release3, false, false, false, 7, null);
        }
    }

    public final void b() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new T(this);
        }
    }

    public final InterfaceC5943b c() {
        return this.measurePassDelegate;
    }

    /* renamed from: d, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* renamed from: e, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPlacement() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final int j() {
        return this.measurePassDelegate.getHeight();
    }

    public final H1.b k() {
        return this.measurePassDelegate.v1();
    }

    public final H1.b l() {
        T t10 = this.lookaheadPassDelegate;
        if (t10 != null) {
            return t10.getLookaheadConstraints();
        }
        return null;
    }

    /* renamed from: m, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean n() {
        return this.measurePassDelegate.getLayoutPending();
    }

    /* renamed from: o, reason: from getter */
    public final LayoutNode.e getLayoutState() {
        return this.layoutState;
    }

    public final InterfaceC5943b p() {
        return this.lookaheadPassDelegate;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getLookaheadLayoutPendingForAlignment() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* renamed from: v, reason: from getter */
    public final T getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    /* renamed from: w, reason: from getter */
    public final V getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    public final boolean x() {
        return this.measurePassDelegate.getMeasurePending();
    }

    /* renamed from: y, reason: from getter */
    public final int getNextChildLookaheadPlaceOrder() {
        return this.nextChildLookaheadPlaceOrder;
    }

    /* renamed from: z, reason: from getter */
    public final int getNextChildPlaceOrder() {
        return this.nextChildPlaceOrder;
    }

    public M(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }
}
