package androidx.compose.ui.node;

import V0.C5346q0;
import V0.o1;
import V0.p1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5780g;
import androidx.compose.ui.layout.InterfaceC5778e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 R2\u00020\u0001:\u0002STB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!¢\u0006\u0002\b#H\u0014ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b.\u0010/R*\u00107\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010>\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/ui/node/E;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/D;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/D;)V", "", "Q3", "()V", "x2", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "height", "d0", "(I)I", "j0", "width", "W", "A", "LH1/n;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "d1", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "n3", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "value", "T", "Landroidx/compose/ui/node/D;", "N3", "()Landroidx/compose/ui/node/D;", "R3", "(Landroidx/compose/ui/node/D;)V", "layoutModifierNode", "U", "LH1/b;", "O3", "()LH1/b;", "S3", "(LH1/b;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/S;", "<set-?>", "V", "Landroidx/compose/ui/node/S;", "I2", "()Landroidx/compose/ui/node/S;", "T3", "(Landroidx/compose/ui/node/S;)V", "lookaheadDelegate", "Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/layout/g;", "approachMeasureScope", "Landroidx/compose/ui/Modifier$c;", "N2", "()Landroidx/compose/ui/Modifier$c;", "tail", "P3", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "X", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class E extends NodeCoordinator {

    /* renamed from: Y, reason: collision with root package name */
    private static final o1 f51179Y;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private D layoutModifierNode;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private H1.b lookaheadConstraints;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private S lookaheadDelegate;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private C5780g approachMeasureScope;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/E$b;", "Landroidx/compose/ui/node/S;", "<init>", "(Landroidx/compose/ui/node/E;)V", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "d1", "(Landroidx/compose/ui/layout/a;)I", "height", "d0", "(I)I", "j0", "width", "W", "A", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class b extends S {
        public b() {
            super(E.this);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int A(int width) {
            D layoutModifierNode = E.this.getLayoutModifierNode();
            S lookaheadDelegate = E.this.P3().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.r(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int W(int width) {
            D layoutModifierNode = E.this.getLayoutModifierNode();
            S lookaheadDelegate = E.this.P3().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.F(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int d0(int height) {
            D layoutModifierNode = E.this.getLayoutModifierNode();
            S lookaheadDelegate = E.this.P3().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.J(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int j0(int height) {
            D layoutModifierNode = E.this.getLayoutModifierNode();
            S lookaheadDelegate = E.this.P3().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            return layoutModifierNode.N(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.layout.I
        public androidx.compose.ui.layout.f0 k0(long constraints) {
            E e10 = E.this;
            b1(constraints);
            e10.S3(H1.b.a(constraints));
            D layoutModifierNode = e10.getLayoutModifierNode();
            S lookaheadDelegate = e10.P3().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            q2(layoutModifierNode.a(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.Q
        public int d1(AbstractC5774a alignmentLine) {
            int iB = F.b(this, alignmentLine);
            g2().u(alignmentLine, iB);
            return iB;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00158VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/E$c", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "b", "I", "getWidth", "()I", "width", "c", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements androidx.compose.ui.layout.J {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ androidx.compose.ui.layout.J f51185a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int height;

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5774a, Integer> r() {
            return this.f51185a.r();
        }

        @Override // androidx.compose.ui.layout.J
        public void s() {
            this.f51185a.s();
        }

        @Override // androidx.compose.ui.layout.J
        public Function1<androidx.compose.ui.layout.l0, Unit> t() {
            return this.f51185a.t();
        }

        @Override // androidx.compose.ui.layout.J
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.J
        public int getWidth() {
            return this.width;
        }

        c(androidx.compose.ui.layout.J j10, E e10) {
            this.f51185a = j10;
            S lookaheadDelegate = e10.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            this.width = lookaheadDelegate.getWidth();
            S lookaheadDelegate2 = e10.getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate2);
            this.height = lookaheadDelegate2.getHeight();
        }
    }

    static {
        o1 o1VarA = V0.P.a();
        o1VarA.x(C5346q0.INSTANCE.b());
        o1VarA.I(1.0f);
        o1VarA.H(p1.INSTANCE.b());
        f51179Y = o1VarA;
    }

    @Override // androidx.compose.ui.layout.r
    public int A(int width) {
        C5780g c5780g = this.approachMeasureScope;
        return c5780g != null ? c5780g.getApproachNode().q1(c5780g, P3(), width) : this.layoutModifierNode.r(this, P3(), width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: I2, reason: from getter */
    public S getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.c N2() {
        return this.layoutModifierNode.getNode();
    }

    /* renamed from: N3, reason: from getter */
    public final D getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* renamed from: O3, reason: from getter */
    public final H1.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    public final void R3(D d10) {
        if (!Intrinsics.e(d10, this.layoutModifierNode)) {
            Modifier.c node = d10.getNode();
            if ((node.getKindSet() & C5810f0.a(512)) != 0) {
                Intrinsics.h(d10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                InterfaceC5778e interfaceC5778e = (InterfaceC5778e) d10;
                C5780g c5780g = this.approachMeasureScope;
                if (c5780g != null) {
                    c5780g.A(interfaceC5778e);
                } else {
                    c5780g = new C5780g(this, interfaceC5778e);
                }
                this.approachMeasureScope = c5780g;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = d10;
    }

    public final void S3(H1.b bVar) {
        this.lookaheadConstraints = bVar;
    }

    protected void T3(S s10) {
        this.lookaheadDelegate = s10;
    }

    @Override // androidx.compose.ui.layout.r
    public int W(int width) {
        C5780g c5780g = this.approachMeasureScope;
        return c5780g != null ? c5780g.getApproachNode().A1(c5780g, P3(), width) : this.layoutModifierNode.F(this, P3(), width);
    }

    @Override // androidx.compose.ui.layout.r
    public int d0(int height) {
        C5780g c5780g = this.approachMeasureScope;
        return c5780g != null ? c5780g.getApproachNode().M0(c5780g, P3(), height) : this.layoutModifierNode.J(this, P3(), height);
    }

    @Override // androidx.compose.ui.layout.r
    public int j0(int height) {
        C5780g c5780g = this.approachMeasureScope;
        return c5780g != null ? c5780g.getApproachNode().l1(c5780g, P3(), height) : this.layoutModifierNode.N(this, P3(), height);
    }

    public E(LayoutNode layoutNode, D d10) {
        b bVar;
        super(layoutNode);
        this.layoutModifierNode = d10;
        C5780g c5780g = null;
        if (layoutNode.getLookaheadRoot() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.lookaheadDelegate = bVar;
        if ((d10.getNode().getKindSet() & C5810f0.a(512)) != 0) {
            Intrinsics.h(d10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            c5780g = new C5780g(this, (InterfaceC5778e) d10);
        }
        this.approachMeasureScope = c5780g;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q3() {
        /*
            r7 = this;
            boolean r0 = r7.getIsShallowPlacing()
            if (r0 == 0) goto L7
            return
        L7:
            r7.j3()
            androidx.compose.ui.layout.g r0 = r7.approachMeasureScope
            r1 = 0
            if (r0 == 0) goto L73
            androidx.compose.ui.layout.e r2 = r0.getApproachNode()
            androidx.compose.ui.layout.f0$a r3 = r7.getPlacementScope()
            androidx.compose.ui.node.S r4 = r7.getLookaheadDelegate()
            kotlin.jvm.internal.Intrinsics.g(r4)
            androidx.compose.ui.layout.G r4 = r4.getLookaheadLayoutCoordinates()
            boolean r2 = r2.c2(r3, r4)
            if (r2 != 0) goto L6b
            boolean r0 = r0.getApproachMeasureRequired()
            if (r0 != 0) goto L6b
            long r2 = r7.c()
            androidx.compose.ui.node.S r0 = r7.getLookaheadDelegate()
            r4 = 0
            if (r0 == 0) goto L42
            long r5 = r0.k2()
            H1.r r0 = H1.r.b(r5)
            goto L43
        L42:
            r0 = r4
        L43:
            boolean r0 = H1.r.d(r2, r0)
            if (r0 == 0) goto L6b
            androidx.compose.ui.node.NodeCoordinator r0 = r7.P3()
            long r2 = r0.c()
            androidx.compose.ui.node.NodeCoordinator r0 = r7.P3()
            androidx.compose.ui.node.S r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto L63
            long r4 = r0.k2()
            H1.r r4 = H1.r.b(r4)
        L63:
            boolean r0 = H1.r.d(r2, r4)
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = r1
        L6c:
            androidx.compose.ui.node.NodeCoordinator r2 = r7.P3()
            r2.u3(r0)
        L73:
            androidx.compose.ui.layout.J r0 = r7.s1()
            r0.s()
            androidx.compose.ui.node.NodeCoordinator r0 = r7.P3()
            r0.u3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.E.Q3():void");
    }

    public final NodeCoordinator P3() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.g(wrapped);
        return wrapped;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.f0
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        super.T0(position, zIndex, layer);
        Q3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.f0
    public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        super.V0(position, zIndex, layerBlock);
        Q3();
    }

    @Override // androidx.compose.ui.node.Q
    public int d1(AbstractC5774a alignmentLine) {
        S lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            return F.b(this, alignmentLine);
        }
        return lookaheadDelegate.e2(alignmentLine);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // androidx.compose.ui.layout.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.f0 k0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.getForceMeasureWithLookaheadConstraints()
            if (r0 == 0) goto L17
            H1.b r7 = r6.lookaheadConstraints
            if (r7 == 0) goto Lf
            long r7 = r7.getValue()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            androidx.compose.ui.node.NodeCoordinator.p2(r6, r7)
            androidx.compose.ui.layout.g r0 = M3(r6)
            if (r0 == 0) goto Lb2
            androidx.compose.ui.layout.e r1 = r0.getApproachNode()
            long r2 = r0.r()
            boolean r2 = r1.Z0(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            H1.b r2 = r6.getLookaheadConstraints()
            boolean r2 = H1.b.e(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.s(r2)
            boolean r2 = r0.getApproachMeasureRequired()
            if (r2 != 0) goto L4e
            androidx.compose.ui.node.NodeCoordinator r2 = r6.P3()
            r2.t3(r3)
        L4e:
            androidx.compose.ui.node.NodeCoordinator r2 = r6.P3()
            androidx.compose.ui.layout.J r7 = r1.Q0(r0, r2, r7)
            androidx.compose.ui.node.NodeCoordinator r8 = r6.P3()
            r8.t3(r4)
            int r8 = r7.getWidth()
            androidx.compose.ui.node.S r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r1 = r1.getWidth()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            androidx.compose.ui.node.S r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r1 = r1.getHeight()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.getApproachMeasureRequired()
            if (r8 != 0) goto Lbe
            androidx.compose.ui.node.NodeCoordinator r8 = r6.P3()
            long r0 = r8.c()
            androidx.compose.ui.node.NodeCoordinator r8 = r6.P3()
            androidx.compose.ui.node.S r8 = r8.getLookaheadDelegate()
            if (r8 == 0) goto La2
            long r4 = r8.k2()
            H1.r r8 = H1.r.b(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = H1.r.d(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            androidx.compose.ui.node.E$c r8 = new androidx.compose.ui.node.E$c
            r8.<init>(r7, r6)
            r7 = r8
            goto Lbe
        Lb2:
            androidx.compose.ui.node.D r0 = r6.getLayoutModifierNode()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.P3()
            androidx.compose.ui.layout.J r7 = r0.a(r6, r1, r7)
        Lbe:
            r6.v3(r7)
            r6.i3()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.E.k0(long):androidx.compose.ui.layout.f0");
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void n3(Canvas canvas, GraphicsLayer graphicsLayer) {
        P3().u2(canvas, graphicsLayer);
        if (L.b(getLayoutNode()).getShowLayoutBounds()) {
            v2(canvas, f51179Y);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void x2() {
        if (getLookaheadDelegate() == null) {
            T3(new b());
        }
    }
}
