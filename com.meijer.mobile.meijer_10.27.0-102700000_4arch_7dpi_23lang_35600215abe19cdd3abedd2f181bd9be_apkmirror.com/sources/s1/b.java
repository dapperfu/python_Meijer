package s1;

import H1.n;
import H1.o;
import H1.r;
import P0.h;
import U0.MutableRect;
import V0.C5331k1;
import V0.C5334l1;
import Z.AbstractC5519q;
import Z.T;
import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b*\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0015\u001a\u00020\b*\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010\u0012\u001a\u00020\u000b*\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J(\u0010%\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\nJ\u0015\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b,\u0010\nJ(\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b-\u0010\u0010J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b.\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010;R\u0016\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010FR\u0014\u0010I\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Ls1/b;", "", "LZ/q;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(LZ/q;)V", "layoutNode", "", "g", "(Landroidx/compose/ui/node/LayoutNode;)V", "LH1/n;", "position", "", "firstPlacement", "f", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "", "l", "t", "r", "b", "e", "(Landroidx/compose/ui/node/LayoutNode;ZIIII)V", "Landroidx/compose/ui/node/NodeCoordinator;", "m", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "LU0/d;", "rect", "(Landroidx/compose/ui/node/NodeCoordinator;LU0/d;)V", "(Landroidx/compose/ui/node/LayoutNode;)J", "h", "()V", "screenOffset", "windowOffset", "LV0/k1;", "viewToWindowMatrix", "p", "(JJ[F)V", "c", "ensureSomethingScheduled", "o", "(Z)V", "i", "j", "k", "n", "a", "LZ/q;", "Ls1/a;", "Ls1/a;", "d", "()Ls1/a;", "rects", "Ls1/e;", "Ls1/e;", "throttledCallbacks", "LZ/T;", "Lkotlin/Function0;", "LZ/T;", "callbacks", "Z", "isDirty", "isScreenOrWindowDirty", "isFragmented", "Ljava/lang/Object;", "dispatchToken", "", "J", "scheduledDispatchDeadline", "Lkotlin/jvm/functions/Function0;", "dispatchLambda", "LU0/d;", "cachedRect", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5519q<LayoutNode> layoutNodes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isScreenOrWindowDirty;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isFragmented;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object dispatchToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16845a rects = new C16845a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e throttledCallbacks = new e();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final T<Function0<Unit>> callbacks = new T<>(0, 1, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long scheduledDispatchDeadline = -1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> dispatchLambda = new a();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final MutableRect cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class a extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        a() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b.this.dispatchToken = null;
            b bVar = b.this;
            Trace.beginSection("OnPositionedDispatch");
            try {
                bVar.c();
                Unit unit = Unit.f142422a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void h() {
        this.isDirty = true;
    }

    public final void i(LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.f(layoutNode.getSemanticsId());
        o(true);
    }

    private final void b(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long position = nodeCoordinator.getPosition();
            float fK = n.k(position);
            float fL = n.l(position);
            mutableRect.m(U0.f.e((Float.floatToRawIntBits(fK) << 32) | (Float.floatToRawIntBits(fL) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo13getUnderlyingMatrixsQKQjiQ = layer.mo13getUnderlyingMatrixsQKQjiQ();
                if (!C5334l1.a(fArrMo13getUnderlyingMatrixsQKQjiQ)) {
                    C5331k1.g(fArrMo13getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void f(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        V vD0 = layoutNode.d0();
        int iM0 = vD0.M0();
        int iJ0 = vD0.J0();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.g(n.k(position), n.l(position), n.k(position) + iM0, n.l(position) + iJ0);
        b(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.j(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            C16845a.e(this.rects, semanticsId, left, top, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        h();
    }

    private final long m(NodeCoordinator nodeCoordinator) {
        long jC = U0.f.INSTANCE.c();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jC = o.c(jC, nodeCoordinator.getPosition());
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo13getUnderlyingMatrixsQKQjiQ = layer.mo13getUnderlyingMatrixsQKQjiQ();
                int iC = c.c(fArrMo13getUnderlyingMatrixsQKQjiQ);
                if (iC == 3) {
                    continue;
                } else {
                    if ((iC & 2) == 0) {
                        return n.INSTANCE.a();
                    }
                    jC = C5331k1.f(fArrMo13getUnderlyingMatrixsQKQjiQ, jC);
                }
            }
        }
        return o.d(jC);
    }

    /* renamed from: d, reason: from getter */
    public final C16845a getRects() {
        return this.rects;
    }

    public final void j(LayoutNode layoutNode) {
        if (h.isRectTrackingEnabled) {
            long jL = l(layoutNode);
            if (!c.d(jL)) {
                g(layoutNode);
                return;
            }
            layoutNode.H1(jL);
            layoutNode.I1(false);
            D0.c<LayoutNode> cVarT0 = layoutNode.t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode2 = layoutNodeArr[i10];
                k(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            }
            i(layoutNode);
        }
    }

    public final void k(LayoutNode layoutNode, long position, boolean firstPlacement) {
        long j10;
        long jM;
        long jL;
        if (h.isRectTrackingEnabled) {
            V vD0 = layoutNode.d0();
            int iM0 = vD0.M0();
            int iJ0 = vD0.J0();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long offsetFromRoot = layoutNode.getOffsetFromRoot();
            long lastSize = layoutNode.getLastSize();
            int i10 = (int) (lastSize >> 32);
            int i11 = (int) (lastSize & 4294967295L);
            boolean z10 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty = parent$ui_release.getOuterToInnerOffsetDirty();
                long offsetFromRoot2 = parent$ui_release.getOffsetFromRoot();
                long outerToInnerOffset = parent$ui_release.getOuterToInnerOffset();
                if (c.d(offsetFromRoot2)) {
                    if (outerToInnerOffsetDirty) {
                        j10 = 4294967295L;
                        jL = l(parent$ui_release);
                        parent$ui_release.H1(jL);
                        parent$ui_release.I1(false);
                    } else {
                        j10 = 4294967295L;
                        jL = outerToInnerOffset;
                    }
                    z10 = !c.d(jL);
                    jM = n.o(n.o(offsetFromRoot2, jL), position);
                } else {
                    j10 = 4294967295L;
                    jM = m(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j10 = 4294967295L;
                jM = position;
            }
            if (z10 || !c.d(jM)) {
                f(layoutNode, position, firstPlacement);
                return;
            }
            layoutNode.E1(jM);
            layoutNode.B1(r.c((iM0 << 32) | (iJ0 & j10)));
            int iK = n.k(jM);
            int iL = n.l(jM);
            int i12 = iK + iM0;
            int i13 = iL + iJ0;
            if (!firstPlacement && n.j(jM, offsetFromRoot) && i10 == iM0 && i11 == iJ0) {
                return;
            }
            e(layoutNode, firstPlacement, iK, iL, i12, i13);
        }
    }

    public final void n(LayoutNode layoutNode) {
        this.rects.h(layoutNode.getSemanticsId());
        h();
        this.isFragmented = true;
    }

    public final void o(boolean ensureSomethingScheduled) {
        boolean z10 = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long jG = this.throttledCallbacks.getMinDebounceDeadline();
        if (jG >= 0 || !z10) {
            if (this.scheduledDispatchDeadline == jG && z10) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                P0.c.e(obj);
            }
            long jB = P0.c.b();
            long jMax = Math.max(jG, 16 + jB);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = P0.c.c(jMax - jB, this.dispatchLambda);
        }
    }

    public b(AbstractC5519q<LayoutNode> abstractC5519q) {
        this.layoutNodes = abstractC5519q;
    }

    private final void e(LayoutNode layoutNode, boolean firstPlacement, int l10, int t10, int r10, int b10) {
        int semanticsId;
        int semanticsId2 = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.g(semanticsId2, l10, t10, r10, b10)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                semanticsId = parent$ui_release.getSemanticsId();
            } else {
                semanticsId = -1;
            }
            C16845a.e(this.rects, semanticsId2, l10, t10, r10, b10, semanticsId, false, false, 192, null);
        }
        h();
    }

    private final void g(LayoutNode layoutNode) {
        D0.c<LayoutNode> cVarT0 = layoutNode.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            f(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            g(layoutNode2);
        }
    }

    private final long l(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jC = U0.f.INSTANCE.c();
        NodeCoordinator nodeCoordinatorP = layoutNode.P();
        while (nodeCoordinatorP != null && nodeCoordinatorP != outerCoordinator$ui_release) {
            OwnedLayer layer = nodeCoordinatorP.getLayer();
            jC = o.c(jC, nodeCoordinatorP.getPosition());
            nodeCoordinatorP = nodeCoordinatorP.getWrappedBy();
            if (layer != null) {
                float[] fArrMo13getUnderlyingMatrixsQKQjiQ = layer.mo13getUnderlyingMatrixsQKQjiQ();
                int iC = c.c(fArrMo13getUnderlyingMatrixsQKQjiQ);
                if (iC == 3) {
                    continue;
                } else {
                    if ((iC & 2) == 0) {
                        return n.INSTANCE.a();
                    }
                    jC = C5331k1.f(fArrMo13getUnderlyingMatrixsQKQjiQ, jC);
                }
            }
        }
        return o.d(jC);
    }

    public final void c() {
        boolean z10;
        long jB = P0.c.b();
        boolean z11 = this.isDirty;
        if (!z11 && !this.isScreenOrWindowDirty) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11) {
            this.isDirty = false;
            T<Function0<Unit>> t10 = this.callbacks;
            Object[] objArr = t10.content;
            int i10 = t10._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((Function0) objArr[i11]).invoke();
            }
            C16845a c16845a = this.rects;
            long[] jArr = c16845a.items;
            int i12 = c16845a.itemsSize;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                long j10 = jArr[i13 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.e(67108863 & ((int) j10), jArr[i13], jArr[i13 + 1], jB);
                }
            }
            this.rects.a();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.d(jB);
        }
        if (z10) {
            this.throttledCallbacks.c(jB);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.b();
        }
        this.throttledCallbacks.h(jB);
    }

    public final void p(long screenOffset, long windowOffset, float[] viewToWindowMatrix) {
        boolean z10;
        int iC = c.c(viewToWindowMatrix);
        e eVar = this.throttledCallbacks;
        if ((iC & 2) != 0) {
            viewToWindowMatrix = null;
        }
        if (!eVar.i(screenOffset, windowOffset, viewToWindowMatrix) && !this.isScreenOrWindowDirty) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.isScreenOrWindowDirty = z10;
    }
}
