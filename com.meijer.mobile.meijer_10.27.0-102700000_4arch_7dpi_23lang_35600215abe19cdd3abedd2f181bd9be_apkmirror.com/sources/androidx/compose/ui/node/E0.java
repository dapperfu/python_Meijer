package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractC5694a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/E0;", "Landroidx/compose/runtime/a;", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "index", "instance", "", "b", "(ILandroidx/compose/ui/node/LayoutNode;)V", "a", "count", "remove", "(II)V", "from", "to", "move", "(III)V", "onClear", "()V", "onEndChanges", "reuse", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 extends AbstractC5694a<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void insertTopDown(int index, LayoutNode instance) {
    }

    public E0(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void insertBottomUp(int index, LayoutNode instance) {
        getCurrent().y0(index, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to2, int count) {
        getCurrent().Y0(from, to2, count);
    }

    @Override // androidx.compose.runtime.AbstractC5694a
    protected void onClear() {
        getRoot().h1();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner = getRoot().getOwner();
        if (owner != null) {
            owner.D();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        getCurrent().i1(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        getCurrent().l();
    }
}
