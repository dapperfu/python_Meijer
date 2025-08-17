package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.n0;
import j0.RowColumnParentData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/M;", "Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/Modifier$c;", "LP0/e$c;", "vertical", "<init>", "(LP0/e$c;)V", "LH1/d;", "", "parentData", "Lj0/H;", "K2", "(LH1/d;Ljava/lang/Object;)Lj0/H;", "o", "LP0/e$c;", "getVertical", "()LP0/e$c;", "L2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M extends Modifier.c implements n0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private e.c vertical;

    @Override // androidx.compose.ui.node.n0
    /* renamed from: K2, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData R(H1.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.e(AbstractC5667m.INSTANCE.c(this.vertical));
        return rowColumnParentData;
    }

    public final void L2(e.c cVar) {
        this.vertical = cVar;
    }

    public M(e.c cVar) {
        this.vertical = cVar;
    }
}
