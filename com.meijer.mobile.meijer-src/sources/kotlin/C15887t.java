package kotlin;

import Z.S;
import Z.b0;
import androidx.compose.ui.layout.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln0/t;", "Landroidx/compose/ui/layout/s0;", "Ln0/p;", "factory", "<init>", "(Ln0/p;)V", "Landroidx/compose/ui/layout/s0$a;", "slotIds", "", "a", "(Landroidx/compose/ui/layout/s0$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ln0/p;", "LZ/S;", "LZ/S;", "countPerType", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15887t implements s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15883p factory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final S<Object> countPerType = b0.b();

    @Override // androidx.compose.ui.layout.s0
    public void a(s0.a slotIds) {
        this.countPerType.j();
        for (Object obj : slotIds) {
            Object objC = this.factory.c(obj);
            int iE = this.countPerType.e(objC, 0);
            if (iE == 7) {
                slotIds.remove(obj);
            } else {
                this.countPerType.u(objC, iE + 1);
            }
        }
    }

    @Override // androidx.compose.ui.layout.s0
    public boolean b(Object slotId, Object reusableSlotId) {
        return Intrinsics.e(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }

    public C15887t(C15883p c15883p) {
        this.factory = c15883p;
    }
}
