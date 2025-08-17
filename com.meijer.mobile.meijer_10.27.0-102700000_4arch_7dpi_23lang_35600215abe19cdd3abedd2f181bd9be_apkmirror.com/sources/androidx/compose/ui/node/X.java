package androidx.compose.ui.node;

import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/s;", "scope", "", "Landroidx/compose/ui/layout/I;", "a", "(Landroidx/compose/ui/layout/s;)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNode;", "", "b", "(Landroidx/compose/ui/node/LayoutNode;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.e.values().length];
            try {
                iArr[LayoutNode.e.f51242b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.e.f51244d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.e.f51241a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.e.f51243c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.e.f51245e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<List<androidx.compose.ui.layout.I>> a(InterfaceC5791s interfaceC5791s) {
        Intrinsics.h(interfaceC5791s, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((W) interfaceC5791s).getLayoutNode();
        boolean zB = b(layoutNode);
        List<LayoutNode> listM = layoutNode.M();
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = listM.get(i10);
            arrayList.add(zB ? layoutNode2.G() : layoutNode2.H());
        }
        return arrayList;
    }

    private static final boolean b(LayoutNode layoutNode) {
        int i10 = a.$EnumSwitchMapping$0[layoutNode.X().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    return b(parent$ui_release);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
