package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/S;", "a", "(Landroidx/compose/ui/node/S;)Landroidx/compose/ui/node/S;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {
    public static final androidx.compose.ui.node.S a(androidx.compose.ui.node.S s10) {
        LayoutNode lookaheadRoot;
        LayoutNode layoutNode = s10.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            LayoutNode lookaheadRoot2 = null;
            if (parent$ui_release != null) {
                lookaheadRoot = parent$ui_release.getLookaheadRoot();
            } else {
                lookaheadRoot = null;
            }
            if (lookaheadRoot != null) {
                LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    lookaheadRoot2 = parent$ui_release2.getLookaheadRoot();
                }
                Intrinsics.g(lookaheadRoot2);
                if (lookaheadRoot2.getIsVirtualLookaheadRoot()) {
                    layoutNode = layoutNode.getParent$ui_release();
                    Intrinsics.g(layoutNode);
                } else {
                    LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
                    Intrinsics.g(parent$ui_release3);
                    layoutNode = parent$ui_release3.getLookaheadRoot();
                    Intrinsics.g(layoutNode);
                }
            } else {
                androidx.compose.ui.node.S lookaheadDelegate = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                Intrinsics.g(lookaheadDelegate);
                return lookaheadDelegate;
            }
        }
    }
}
