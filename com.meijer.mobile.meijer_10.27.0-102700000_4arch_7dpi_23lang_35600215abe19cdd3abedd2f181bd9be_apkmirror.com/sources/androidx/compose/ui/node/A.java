package androidx.compose.ui.node;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/A;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/MeasurePolicy;", "policy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "", "k", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "", "height", "g", "(I)I", "width", "f", "c", "b", "i", "h", "e", "d", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/ui/layout/MeasurePolicy;", "j", "measurePolicyState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 measurePolicyState;

    private final MeasurePolicy a() {
        return (MeasurePolicy) this.measurePolicyState.getValue();
    }

    private final void j(MeasurePolicy measurePolicy) {
        this.measurePolicyState.setValue(measurePolicy);
    }

    public A(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.layoutNode = layoutNode;
        this.measurePolicyState = t1.e(measurePolicy, null, 2, null);
    }

    public final int b(int width) {
        return a().j(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.H(), width);
    }

    public final int c(int height) {
        return a().e(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.H(), height);
    }

    public final int d(int width) {
        return a().j(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.G(), width);
    }

    public final int e(int height) {
        return a().e(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.G(), height);
    }

    public final int f(int width) {
        return a().g(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.H(), width);
    }

    public final int g(int height) {
        return a().i(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.H(), height);
    }

    public final int h(int width) {
        return a().g(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.G(), width);
    }

    public final int i(int height) {
        return a().i(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.G(), height);
    }

    public final void k(MeasurePolicy measurePolicy) {
        j(measurePolicy);
    }
}
