package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.InterfaceC5956j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/l;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/j;", "indicationNode", "<init>", "(Landroidx/compose/ui/node/j;)V", "", "Q2", "q", "Landroidx/compose/ui/node/j;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class l extends AbstractC5959m {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5956j indicationNode;

    public final void Q2(InterfaceC5956j indicationNode) {
        N2(this.indicationNode);
        this.indicationNode = indicationNode;
        K2(indicationNode);
    }

    public l(InterfaceC5956j interfaceC5956j) {
        this.indicationNode = interfaceC5956j;
        K2(interfaceC5956j);
    }
}
