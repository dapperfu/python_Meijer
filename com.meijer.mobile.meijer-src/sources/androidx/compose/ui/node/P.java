package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5916a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/P;", "Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/b;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/a;)I", "LU0/f;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "e", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class P extends AbstractC5941a {
    public P(InterfaceC5943b interfaceC5943b) {
        super(interfaceC5943b, null);
    }

    @Override // androidx.compose.ui.node.AbstractC5941a
    protected long d(NodeCoordinator nodeCoordinator, long j10) {
        S lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        float fK = H1.n.k(position);
        float fL = H1.n.l(position);
        return U0.f.q(U0.f.e((Float.floatToRawIntBits(fK) << 32) | (Float.floatToRawIntBits(fL) & 4294967295L)), j10);
    }

    @Override // androidx.compose.ui.node.AbstractC5941a
    protected Map<AbstractC5916a, Integer> e(NodeCoordinator nodeCoordinator) {
        S lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.s1().r();
    }

    @Override // androidx.compose.ui.node.AbstractC5941a
    protected int i(NodeCoordinator nodeCoordinator, AbstractC5916a abstractC5916a) {
        S lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.l0(abstractC5916a);
    }
}
