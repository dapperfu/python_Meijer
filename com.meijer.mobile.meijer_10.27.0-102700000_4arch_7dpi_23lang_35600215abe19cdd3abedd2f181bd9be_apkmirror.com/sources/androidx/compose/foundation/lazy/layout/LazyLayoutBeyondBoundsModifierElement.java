package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.Y;
import kotlin.C15749i;
import kotlin.C15750j;
import kotlin.EnumC13827z;
import kotlin.InterfaceC15751k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/Y;", "Ln0/j;", "Ln0/k;", "state", "Ln0/i;", "beyondBoundsInfo", "", "reverseLayout", "Lf0/z;", "orientation", "<init>", "(Ln0/k;Ln0/i;ZLf0/z;)V", "n", "()Ln0/j;", "node", "", "o", "(Ln0/j;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ln0/k;", "getState", "()Ln0/k;", "c", "Ln0/i;", "getBeyondBoundsInfo", "()Ln0/i;", "d", "Z", "getReverseLayout", "()Z", "e", "Lf0/z;", "getOrientation", "()Lf0/z;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends Y<C15750j> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15751k state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15749i beyondBoundsInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) other;
        return Intrinsics.e(this.state, lazyLayoutBeyondBoundsModifierElement.state) && Intrinsics.e(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.reverseLayout == lazyLayoutBeyondBoundsModifierElement.reverseLayout && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C15750j b() {
        return new C15750j(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(C15750j node) {
        node.P2(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC15751k interfaceC15751k, C15749i c15749i, boolean z10, EnumC13827z enumC13827z) {
        this.state = interfaceC15751k;
        this.beyondBoundsInfo = c15749i;
        this.reverseLayout = z10;
        this.orientation = enumC13827z;
    }
}
