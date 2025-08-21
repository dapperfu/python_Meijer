package androidx.compose.ui.layout;

import androidx.compose.ui.layout.s0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/s0;", "", "maxSlotsToRetainForReuse", "<init>", "(I)V", "Landroidx/compose/ui/layout/s0$a;", "slotIds", "", "a", "(Landroidx/compose/ui/layout/s0$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5929n implements s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSlotsToRetainForReuse;

    @Override // androidx.compose.ui.layout.s0
    public boolean b(Object slotId, Object reusableSlotId) {
        return true;
    }

    public C5929n(int i10) {
        this.maxSlotsToRetainForReuse = i10;
    }

    @Override // androidx.compose.ui.layout.s0
    public void a(s0.a slotIds) {
        int size = slotIds.size();
        int i10 = this.maxSlotsToRetainForReuse;
        if (size > i10) {
            slotIds.h(i10);
        }
    }
}
