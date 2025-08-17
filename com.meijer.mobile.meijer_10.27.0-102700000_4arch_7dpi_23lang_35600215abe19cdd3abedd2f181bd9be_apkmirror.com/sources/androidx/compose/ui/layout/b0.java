package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/b0;", "Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "b", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "", "e", "()I", "parentWidth", "LH1/t;", "d", "()LH1/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b0 extends f0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: d */
    public H1.t getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: e */
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }

    public b0(Owner owner) {
        this.owner = owner;
    }
}
