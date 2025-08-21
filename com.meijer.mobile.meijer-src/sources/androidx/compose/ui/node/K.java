package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/Modifier$c;", "b", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/Modifier$c;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class K {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c b(InterfaceC5956j interfaceC5956j) {
        int iA = C5952f0.a(4);
        int iA2 = C5952f0.a(2);
        Modifier.c child = interfaceC5956j.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iA) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iA2) == 0) {
            if ((child.getKindSet() & iA) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
