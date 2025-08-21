package s1;

import H1.n;
import H1.o;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/j;", "node", "", "topLeft", "bottomRight", "LH1/n;", "windowOffset", "screenOffset", "LV0/k1;", "viewToWindowMatrix", "Ls1/d;", "a", "(Landroidx/compose/ui/node/j;JJJJ[F)Ls1/d;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f {
    public static final d a(InterfaceC5956j interfaceC5956j, long j10, long j11, long j12, long j13, float[] fArr) {
        NodeCoordinator nodeCoordinatorJ = C5957k.j(interfaceC5956j, C5952f0.a(2));
        LayoutNode layoutNodeO = C5957k.o(interfaceC5956j);
        if (!layoutNodeO.f()) {
            return null;
        }
        if (layoutNodeO.getOuterCoordinator$ui_release() == nodeCoordinatorJ) {
            return new d(j10, j11, j12, j13, fArr, interfaceC5956j, null);
        }
        long jF = n.f(j10);
        float fK = n.k(jF);
        float fL = n.l(jF);
        long jE = U0.f.e((Float.floatToRawIntBits(fK) << 32) | (Float.floatToRawIntBits(fL) & 4294967295L));
        long jC = nodeCoordinatorJ.q1().c();
        return new d(o.d(layoutNodeO.getOuterCoordinator$ui_release().q1().J(nodeCoordinatorJ, jE)), n.f(((n.k(r0) + ((int) (jC >> 32))) << 32) | ((n.l(r0) + ((int) (jC & 4294967295L))) & 4294967295L)), j12, j13, fArr, interfaceC5956j, null);
    }
}
