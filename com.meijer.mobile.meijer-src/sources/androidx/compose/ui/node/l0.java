package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/l0;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "b", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "c", "()Z", "node", "d", "f", "rootNode", "e", "a", "LD0/c;", "LD0/c;", "layoutNodes", "", "[Landroidx/compose/ui/node/LayoutNode;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f51775d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<LayoutNode> layoutNodes = new D0.c<>(new LayoutNode[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private LayoutNode[] cachedNodes;

    public final void a() {
        this.layoutNodes.A(Companion.C1071a.f51778a);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10] = this.layoutNodes.content[i10];
        }
        this.layoutNodes.k();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            Intrinsics.g(layoutNode);
            if (layoutNode.getNeedsOnPositionedDispatch()) {
                b(layoutNode);
            }
        }
    }

    public final boolean c() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void d(LayoutNode node) {
        this.layoutNodes.c(node);
        node.D1(true);
    }

    public final void e(LayoutNode rootNode) {
        this.layoutNodes.k();
        this.layoutNodes.c(rootNode);
        rootNode.D1(true);
    }

    public final void f(LayoutNode node) {
        this.layoutNodes.s(node);
    }

    private final void b(LayoutNode layoutNode) {
        layoutNode.B();
        layoutNode.D1(false);
        D0.c<LayoutNode> cVarT0 = layoutNode.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            b(layoutNodeArr[i10]);
        }
    }
}
