package androidx.compose.ui;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/d;", "", "zIndex", "<init>", "(F)V", "k", "()Landroidx/compose/ui/d;", "node", "", "n", "(Landroidx/compose/ui/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getZIndex", "()F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends Y<ZIndexModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float zIndex;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) other).zIndex) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.zIndex + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ZIndexModifier b() {
        return new ZIndexModifier(this.zIndex);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(ZIndexModifier node) {
        node.L2(this.zIndex);
    }

    public ZIndexElement(float f10) {
        this.zIndex = f10;
    }
}
