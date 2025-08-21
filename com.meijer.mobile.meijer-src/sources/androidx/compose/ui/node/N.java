package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)Z", "isOutMostLookaheadRoot", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class N {
    public static final boolean a(LayoutNode layoutNode) {
        LayoutNode lookaheadRoot;
        if (layoutNode.getLookaheadRoot() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                lookaheadRoot = parent$ui_release.getLookaheadRoot();
            } else {
                lookaheadRoot = null;
            }
            if (lookaheadRoot == null || layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPass()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
