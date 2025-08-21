package androidx.compose.ui.node;

import V0.C5489q0;
import V0.o1;
import V0.p1;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JKB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010#\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0019\u0010\"\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0002\b!H\u0014ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-J:\u00108\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R.\u0010H\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Landroidx/compose/ui/node/y;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "N3", "()V", "x2", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "height", "d0", "(I)I", "width", "W", "j0", "A", "LH1/n;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "d1", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "n3", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$f;", "hitTestSource", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "", "isInLayer", "X2", "(Landroidx/compose/ui/node/NodeCoordinator$f;JLandroidx/compose/ui/node/w;IZ)V", "Landroidx/compose/ui/node/x0;", "T", "Landroidx/compose/ui/node/x0;", "M3", "()Landroidx/compose/ui/node/x0;", "tail", "Landroidx/compose/ui/node/S;", "<set-?>", "U", "Landroidx/compose/ui/node/S;", "I2", "()Landroidx/compose/ui/node/S;", "O3", "(Landroidx/compose/ui/node/S;)V", "lookaheadDelegate", "V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5970y extends NodeCoordinator {

    /* renamed from: W, reason: collision with root package name */
    private static final o1 f51808W;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final x0 tail;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private S lookaheadDelegate;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/y$b;", "Landroidx/compose/ui/node/S;", "<init>", "(Landroidx/compose/ui/node/y;)V", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "d1", "(Landroidx/compose/ui/layout/a;)I", "", "l2", "()V", "height", "d0", "(I)I", "width", "W", "j0", "A", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.y$b */
    private final class b extends S {
        public b() {
            super(C5970y.this);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int A(int width) {
            return getLayoutNode().S0(width);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int W(int width) {
            return getLayoutNode().W0(width);
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int d0(int height) {
            return getLayoutNode().X0(height);
        }

        @Override // androidx.compose.ui.node.Q
        public int d1(AbstractC5916a alignmentLine) {
            int iIntValue;
            Integer num = c2().B().get(alignmentLine);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MIN_VALUE;
            }
            g2().u(alignmentLine, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.S, androidx.compose.ui.layout.r
        public int j0(int height) {
            return getLayoutNode().T0(height);
        }

        @Override // androidx.compose.ui.layout.I
        public androidx.compose.ui.layout.f0 k0(long constraints) {
            b1(constraints);
            D0.c<LayoutNode> cVarT0 = getLayoutNode().t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                T tA0 = layoutNodeArr[i10].a0();
                Intrinsics.g(tA0);
                tA0.s2(LayoutNode.g.f51475c);
            }
            q2(getLayoutNode().getMeasurePolicy().d(this, getLayoutNode().G(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.S
        protected void l2() {
            T tA0 = getLayoutNode().a0();
            Intrinsics.g(tA0);
            tA0.i2();
        }
    }

    static {
        o1 o1VarA = V0.P.a();
        o1VarA.x(C5489q0.INSTANCE.h());
        o1VarA.I(1.0f);
        o1VarA.H(p1.INSTANCE.b());
        f51808W = o1VarA;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: I2, reason: from getter */
    public S getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: M3, reason: from getter and merged with bridge method [inline-methods] */
    public x0 N2() {
        return this.tail;
    }

    protected void O3(S s10) {
        this.lookaheadDelegate = s10;
    }

    public C5970y(LayoutNode layoutNode) {
        b bVar;
        super(layoutNode);
        this.tail = new x0();
        N2().J2(this);
        if (layoutNode.getLookaheadRoot() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.lookaheadDelegate = bVar;
    }

    private final void N3() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().d0().m2();
    }

    @Override // androidx.compose.ui.layout.r
    public int A(int width) {
        return getLayoutNode().Q0(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.f0
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        super.T0(position, zIndex, layer);
        N3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.f0
    public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        super.V0(position, zIndex, layerBlock);
        N3();
    }

    @Override // androidx.compose.ui.layout.r
    public int W(int width) {
        return getLayoutNode().U0(width);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X2(androidx.compose.ui.node.NodeCoordinator.f r11, long r12, androidx.compose.ui.node.C5968w r14, int r15, boolean r16) {
        /*
            r10 = this;
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            boolean r0 = r11.d(r0)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L39
            boolean r0 = r10.L3(r12)
            if (r0 == 0) goto L17
            r6 = r15
            r5 = r16
        L15:
            r0 = r4
            goto L3d
        L17:
            g1.O$a r0 = g1.O.INSTANCE
            int r0 = r0.d()
            r6 = r15
            boolean r0 = g1.O.g(r15, r0)
            if (r0 == 0) goto L3a
            long r7 = r10.J2()
            float r0 = r10.t2(r12, r7)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r7
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r7) goto L3a
            goto L15
        L39:
            r6 = r15
        L3a:
            r0 = r5
            r5 = r16
        L3d:
            if (r0 == 0) goto L87
            int r7 = androidx.compose.ui.node.C5968w.h(r14)
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            D0.c r0 = r0.s0()
            T[] r8 = r0.content
            int r0 = r0.getSize()
            int r0 = r0 - r4
            r9 = r0
        L53:
            if (r9 < 0) goto L84
            r0 = r8[r9]
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.ui.node.LayoutNode) r0
            boolean r4 = r0.f()
            if (r4 == 0) goto L7e
            r1 = r6
            r6 = r5
            r5 = r1
            r2 = r12
            r4 = r14
            r1 = r0
            r0 = r11
            r0.b(r1, r2, r4, r5, r6)
            boolean r0 = r14.t()
            if (r0 != 0) goto L70
            goto L7f
        L70:
            androidx.compose.ui.node.NodeCoordinator r0 = r1.getOuterCoordinator$ui_release()
            boolean r0 = r0.z3()
            if (r0 == 0) goto L84
            r14.a()
            goto L7f
        L7e:
            r6 = r5
        L7f:
            int r9 = r9 + (-1)
            r5 = r6
            r6 = r15
            goto L53
        L84:
            androidx.compose.ui.node.C5968w.o(r14, r7)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C5970y.X2(androidx.compose.ui.node.NodeCoordinator$f, long, androidx.compose.ui.node.w, int, boolean):void");
    }

    @Override // androidx.compose.ui.layout.r
    public int d0(int height) {
        return getLayoutNode().V0(height);
    }

    @Override // androidx.compose.ui.node.Q
    public int d1(AbstractC5916a alignmentLine) {
        S lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.d1(alignmentLine);
        }
        Integer num = C2().B().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.r
    public int j0(int height) {
        return getLayoutNode().R0(height);
    }

    @Override // androidx.compose.ui.layout.I
    public androidx.compose.ui.layout.f0 k0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            S lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            constraints = lookaheadDelegate.h2();
        }
        b1(constraints);
        D0.c<LayoutNode> cVarT0 = getLayoutNode().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10].d0().u2(LayoutNode.g.f51475c);
        }
        v3(getLayoutNode().getMeasurePolicy().d(this, getLayoutNode().H(), constraints));
        i3();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void n3(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner ownerB = L.b(getLayoutNode());
        D0.c<LayoutNode> cVarS0 = getLayoutNode().s0();
        LayoutNode[] layoutNodeArr = cVarS0.content;
        int size = cVarS0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.f()) {
                layoutNode.draw$ui_release(canvas, graphicsLayer);
            }
        }
        if (ownerB.getShowLayoutBounds()) {
            v2(canvas, f51808W);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void x2() {
        if (getLookaheadDelegate() == null) {
            O3(new b());
        }
    }
}
