package androidx.compose.ui.focus;

import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/N;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "LD0/c;", "b", "(Landroidx/compose/ui/node/LayoutNode;)LD0/c;", "a", "", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class N implements Comparator<FocusTargetNode> {

    /* renamed from: a, reason: collision with root package name */
    public static final N f50848a = new N();

    private final D0.c<LayoutNode> b(LayoutNode layoutNode) {
        D0.c<LayoutNode> cVar = new D0.c<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            cVar.a(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return cVar;
    }

    private N() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode a10, FocusTargetNode b10) {
        int i10 = 0;
        if (L.g(a10) && L.g(b10)) {
            LayoutNode layoutNodeO = C5957k.o(a10);
            LayoutNode layoutNodeO2 = C5957k.o(b10);
            if (Intrinsics.e(layoutNodeO, layoutNodeO2)) {
                return 0;
            }
            D0.c<LayoutNode> cVarB = b(layoutNodeO);
            D0.c<LayoutNode> cVarB2 = b(layoutNodeO2);
            int iMin = Math.min(cVarB.getSize() - 1, cVarB2.getSize() - 1);
            if (iMin >= 0) {
                while (Intrinsics.e(cVarB.content[i10], cVarB2.content[i10])) {
                    if (i10 != iMin) {
                        i10++;
                    }
                }
                return Intrinsics.k(cVarB.content[i10].o0(), cVarB2.content[i10].o0());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if (L.g(a10)) {
            return -1;
        }
        if (!L.g(b10)) {
            return 0;
        }
        return 1;
    }
}
