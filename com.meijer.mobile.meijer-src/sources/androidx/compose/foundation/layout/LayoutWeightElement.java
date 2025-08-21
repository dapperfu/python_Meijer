package androidx.compose.foundation.layout;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/Y;", "Lj0/z;", "", "weight", "", "fill", "<init>", "(FZ)V", "k", "()Lj0/z;", "node", "", "n", "(Lj0/z;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWeight", "()F", "c", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends Y<j0.z> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float weight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean fill;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = other instanceof LayoutWeightElement ? (LayoutWeightElement) other : null;
        return layoutWeightElement != null && this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill;
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j0.z b() {
        return new j0.z(this.weight, this.fill);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(j0.z node) {
        node.M2(this.weight);
        node.L2(this.fill);
    }

    public LayoutWeightElement(float f10, boolean z10) {
        this.weight = f10;
        this.fill = z10;
    }
}
