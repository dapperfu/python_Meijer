package androidx.compose.foundation.layout;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/L;", "LH1/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/foundation/layout/L;", "node", "", "n", "(Landroidx/compose/foundation/layout/L;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "getMinWidth-D9Ej5fM", "()F", "c", "getMinHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends Y<L> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) other;
        return H1.h.u(this.minWidth, unspecifiedConstraintsElement.minWidth) && H1.h.u(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    public int hashCode() {
        return (H1.h.w(this.minWidth) * 31) + H1.h.w(this.minHeight);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public L b() {
        return new L(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(L node) {
        node.L2(this.minWidth);
        node.K2(this.minHeight);
    }
}
