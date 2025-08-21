package androidx.compose.ui.focus;

import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/J;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/J;", "", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "a", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I {
    public static final J a(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        s focusOwner;
        NodeCoordinator coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator != null && (layoutNode = coordinator.getLayoutNode()) != null && (owner = layoutNode.getOwner()) != null && (focusOwner = owner.getFocusOwner()) != null) {
            return focusOwner.getFocusTransactionManager();
        }
        return null;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        C5957k.p(focusTargetNode).getFocusOwner().i(focusTargetNode);
    }

    public static final J c(FocusTargetNode focusTargetNode) {
        return C5957k.p(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
