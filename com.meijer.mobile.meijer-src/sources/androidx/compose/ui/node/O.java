package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.U;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/O;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/p;", "relayoutNodes", "", "Landroidx/compose/ui/node/U$a;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/p;Ljava/util/List;)V", "node", "", "c", "(Landroidx/compose/ui/node/LayoutNode;)Z", "b", "", "f", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "a", "()V", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/p;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5962p relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<U.a> postponedMeasureRequests;

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        Intrinsics.i(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.i(sb2, "append(...)");
        e(this, sb2, this.root, 0);
        return sb2.toString();
    }

    private final String f(LayoutNode node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.X());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.f()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.g0() + ']');
        if (!b(node)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }

    public O(LayoutNode layoutNode, C5962p c5962p, List<U.a> list) {
        this.root = layoutNode;
        this.relayoutNodes = c5962p;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(LayoutNode layoutNode) {
        LayoutNode.e eVarX;
        U.a aVar;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        U.a aVar2 = null;
        if (parent$ui_release != null) {
            eVarX = parent$ui_release.X();
        } else {
            eVarX = null;
        }
        if (layoutNode.f() || (layoutNode.o0() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.f())) {
            if (layoutNode.e0()) {
                List<U.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        aVar = list.get(i10);
                        U.a aVar3 = aVar;
                        if (Intrinsics.e(aVar3.getNode(), layoutNode) && !aVar3.getIsLookahead()) {
                            break;
                        }
                        i10++;
                    } else {
                        aVar = null;
                        break;
                    }
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (layoutNode.getIsDeactivated()) {
                return true;
            }
            if (layoutNode.e0()) {
                if (!this.relayoutNodes.d(layoutNode) && layoutNode.X() != LayoutNode.e.f51466b && ((parent$ui_release == null || !parent$ui_release.e0()) && ((parent$ui_release == null || !parent$ui_release.Z()) && eVarX != LayoutNode.e.f51465a))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.W()) {
                if (!this.relayoutNodes.d(layoutNode) && parent$ui_release != null && !parent$ui_release.e0() && !parent$ui_release.W() && eVarX != LayoutNode.e.f51465a && eVarX != LayoutNode.e.f51467c) {
                    List<U.a> list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (Intrinsics.e(list2.get(i11).getNode(), layoutNode)) {
                                break;
                            }
                            i11++;
                        } else {
                            if (layoutNode.X() == LayoutNode.e.f51465a) {
                                break;
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        if (Intrinsics.e(layoutNode.H0(), Boolean.TRUE)) {
            if (layoutNode.Z()) {
                List<U.a> list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    U.a aVar4 = list3.get(i12);
                    U.a aVar5 = aVar4;
                    if (Intrinsics.e(aVar5.getNode(), layoutNode) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                    i12++;
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (layoutNode.Z()) {
                if (!this.relayoutNodes.e(layoutNode, true) && ((parent$ui_release == null || !parent$ui_release.Z()) && eVarX != LayoutNode.e.f51466b && (parent$ui_release == null || !parent$ui_release.e0() || !Intrinsics.e(layoutNode.getLookaheadRoot(), layoutNode)))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.Y() && !this.relayoutNodes.e(layoutNode, true) && parent$ui_release != null && !parent$ui_release.Z() && !parent$ui_release.Y() && eVarX != LayoutNode.e.f51466b && eVarX != LayoutNode.e.f51468d && (!parent$ui_release.W() || !Intrinsics.e(layoutNode.getLookaheadRoot(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(LayoutNode node) {
        if (!b(node)) {
            return false;
        }
        List<LayoutNode> listI = node.I();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(listI.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static final void e(O o10, StringBuilder sb2, LayoutNode layoutNode, int i10) {
        String strF = o10.f(layoutNode);
        if (strF.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(strF);
            Intrinsics.i(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.i(sb2, "append(...)");
            i10++;
        }
        List<LayoutNode> listI = layoutNode.I();
        int size = listI.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(o10, sb2, listI.get(i12), i10);
        }
    }
}
