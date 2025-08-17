package androidx.compose.ui.layout;

import U0.f;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b#\u0010+R\u001a\u0010/\u001a\u00020-8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0016\u00102\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/layout/G;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/S;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/S;)V", "LU0/f;", "relativeToScreen", "q", "(J)J", "relativeToLocal", "s", "relativeToWindow", "N", "X", "r0", "sourceCoordinates", "relativeToSource", "J", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "", "includeMotionFrameOfReference", "F", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "b0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "LV0/k1;", "matrix", "", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "a0", "([F)V", "a", "Landroidx/compose/ui/node/S;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/S;", "b", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "LH1/r;", "c", "size", "n0", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "isAttached", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G implements LayoutCoordinates {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.S lookaheadDelegate;

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long J(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return F(sourceCoordinates, relativeToSource, true);
    }

    private final long b() {
        androidx.compose.ui.node.S sA = H.a(this.lookaheadDelegate);
        LayoutCoordinates layoutCoordinatesQ1 = sA.q1();
        f.Companion companion = U0.f.INSTANCE;
        return U0.f.p(J(layoutCoordinatesQ1, companion.c()), a().J(sA.getCoordinator(), companion.c()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long F(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof G)) {
            androidx.compose.ui.node.S sA = H.a(this.lookaheadDelegate);
            long jF = F(sA.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = sA.getPosition();
            float fK = H1.n.k(position);
            float fL = H1.n.l(position);
            long jP = U0.f.p(jF, U0.f.e((4294967295L & Float.floatToRawIntBits(fL)) | (Float.floatToRawIntBits(fK) << 32)));
            LayoutCoordinates layoutCoordinatesK2 = sA.getCoordinator().K2();
            if (layoutCoordinatesK2 == null) {
                layoutCoordinatesK2 = sA.getCoordinator().q1();
            }
            return U0.f.q(jP, layoutCoordinatesK2.F(sourceCoordinates, U0.f.INSTANCE.c(), includeMotionFrameOfReference));
        }
        androidx.compose.ui.node.S s10 = ((G) sourceCoordinates).lookaheadDelegate;
        s10.getCoordinator().d3();
        androidx.compose.ui.node.S lookaheadDelegate = a().y2(s10.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long jN = H1.n.n(H1.n.o(s10.o2(lookaheadDelegate, !includeMotionFrameOfReference), H1.o.d(relativeToSource)), this.lookaheadDelegate.o2(lookaheadDelegate, !includeMotionFrameOfReference));
            float fK2 = H1.n.k(jN);
            float fL2 = H1.n.l(jN);
            return U0.f.e((Float.floatToRawIntBits(fK2) << 32) | (Float.floatToRawIntBits(fL2) & 4294967295L));
        }
        androidx.compose.ui.node.S sA2 = H.a(s10);
        long jO = H1.n.o(H1.n.o(s10.o2(sA2, !includeMotionFrameOfReference), sA2.getPosition()), H1.o.d(relativeToSource));
        androidx.compose.ui.node.S sA3 = H.a(this.lookaheadDelegate);
        long jN2 = H1.n.n(jO, H1.n.o(this.lookaheadDelegate.o2(sA3, !includeMotionFrameOfReference), sA3.getPosition()));
        float fK3 = H1.n.k(jN2);
        float fL3 = H1.n.l(jN2);
        long jE = U0.f.e((Float.floatToRawIntBits(fL3) & 4294967295L) | (Float.floatToRawIntBits(fK3) << 32));
        NodeCoordinator wrappedBy = sA3.getCoordinator().getWrappedBy();
        Intrinsics.g(wrappedBy);
        NodeCoordinator wrappedBy2 = sA2.getCoordinator().getWrappedBy();
        Intrinsics.g(wrappedBy2);
        return wrappedBy.F(wrappedBy2, jE, includeMotionFrameOfReference);
    }

    public final NodeCoordinator a() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long c() {
        androidx.compose.ui.node.S s10 = this.lookaheadDelegate;
        return H1.r.c((s10.getWidth() << 32) | (s10.getHeight() & 4294967295L));
    }

    public G(androidx.compose.ui.node.S s10) {
        this.lookaheadDelegate = s10;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long N(long relativeToWindow) {
        return U0.f.q(a().N(relativeToWindow), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void O(LayoutCoordinates sourceCoordinates, float[] matrix) {
        a().O(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long X(long relativeToLocal) {
        return a().X(U0.f.q(relativeToLocal, b()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void a0(float[] matrix) {
        a().a0(matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect b0(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return a().b0(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return a().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates n0() {
        androidx.compose.ui.node.S lookaheadDelegate;
        if (!isAttached()) {
            C14832a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = a().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.q1();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long q(long relativeToScreen) {
        return U0.f.q(a().q(relativeToScreen), b());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long r0(long relativeToLocal) {
        return a().r0(U0.f.q(relativeToLocal, b()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long s(long relativeToLocal) {
        return a().s(U0.f.q(relativeToLocal, b()));
    }
}
