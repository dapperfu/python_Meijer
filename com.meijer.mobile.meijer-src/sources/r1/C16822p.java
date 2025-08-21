package r1;

import Z.AbstractC5619q;
import Z.T;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0014\u0010$\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Lr1/p;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Lr1/f;", "outerSemanticsNode", "LZ/q;", "nodes", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Lr1/f;LZ/q;)V", "", "semanticsId", "Lr1/j;", "a", "(I)Lr1/j;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "", "e", "(Lr1/j;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroidx/compose/ui/node/LayoutNode;", "b", "Lr1/f;", "c", "LZ/q;", "LZ/T;", "Lr1/l;", "d", "LZ/T;", "()LZ/T;", "listeners", "Lr1/n;", "()Lr1/n;", "unmergedRootSemanticsNode", "()Lr1/j;", "rootInfo", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16822p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode rootNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16812f outerSemanticsNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5619q<LayoutNode> nodes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final T<InterfaceC16818l> listeners = new T<>(2);

    public final InterfaceC16816j a(int semanticsId) {
        return this.nodes.b(semanticsId);
    }

    public final T<InterfaceC16818l> b() {
        return this.listeners;
    }

    public final InterfaceC16816j c() {
        return this.rootNode;
    }

    public final C16820n d() {
        return new C16820n(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void e(InterfaceC16816j semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        T<InterfaceC16818l> t10 = this.listeners;
        Object[] objArr = t10.content;
        int i10 = t10._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ((InterfaceC16818l) objArr[i11]).a(semanticsInfo, previousSemanticsConfiguration);
        }
    }

    public C16822p(LayoutNode layoutNode, C16812f c16812f, AbstractC5619q<LayoutNode> abstractC5619q) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = c16812f;
        this.nodes = abstractC5619q;
    }
}
