package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/F;", "Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/node/Q;", "within", "<init>", "(Landroidx/compose/ui/node/Q;)V", "b", "Landroidx/compose/ui/node/Q;", "", "e", "()I", "parentWidth", "LH1/t;", "d", "()LH1/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F extends f0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.Q within;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: d */
    public H1.t getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0.a
    /* renamed from: e */
    public int getParentWidth() {
        return this.within.M0();
    }

    public F(androidx.compose.ui.node.Q q10) {
        this.within = q10;
    }
}
