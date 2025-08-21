package androidx.compose.foundation;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/i;", "Lh0/l;", "interactionSource", "<init>", "(Lh0/l;)V", "k", "()Landroidx/compose/foundation/i;", "node", "", "n", "(Landroidx/compose/foundation/i;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lh0/l;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class HoverableElement extends Y<i> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0.l interactionSource;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HoverableElement) && Intrinsics.e(((HoverableElement) other).interactionSource, this.interactionSource);
    }

    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public i b() {
        return new i(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(i node) {
        node.P2(this.interactionSource);
    }

    public HoverableElement(h0.l lVar) {
        this.interactionSource = lVar;
    }
}
