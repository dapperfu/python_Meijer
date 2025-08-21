package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC16328a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/relocation/d;", "Lp0/a;", "requester", "<init>", "(Lp0/a;)V", "k", "()Landroidx/compose/foundation/relocation/d;", "node", "", "n", "(Landroidx/compose/foundation/relocation/d;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lp0/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends Y<d> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16328a requester;

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof BringIntoViewRequesterElement) && Intrinsics.e(this.requester, ((BringIntoViewRequesterElement) other).requester);
        }
        return true;
    }

    public int hashCode() {
        return this.requester.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d b() {
        return new d(this.requester);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(d node) {
        node.L2(this.requester);
    }

    public BringIntoViewRequesterElement(InterfaceC16328a interfaceC16328a) {
        this.requester = interfaceC16328a;
    }
}
