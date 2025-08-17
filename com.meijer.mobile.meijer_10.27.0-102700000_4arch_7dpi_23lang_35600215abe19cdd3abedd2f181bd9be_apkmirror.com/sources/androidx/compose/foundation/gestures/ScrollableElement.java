package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.Y;
import d0.J;
import h0.l;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC13808g;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/gestures/i;", "Lf0/H;", "state", "Lf0/z;", "orientation", "Ld0/J;", "overscrollEffect", "", "enabled", "reverseDirection", "Lf0/s;", "flingBehavior", "Lh0/l;", "interactionSource", "Lf0/g;", "bringIntoViewSpec", "<init>", "(Lf0/H;Lf0/z;Ld0/J;ZZLf0/s;Lh0/l;Lf0/g;)V", "n", "()Landroidx/compose/foundation/gestures/i;", "node", "", "o", "(Landroidx/compose/foundation/gestures/i;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lf0/H;", "getState", "()Lf0/H;", "c", "Lf0/z;", "getOrientation", "()Lf0/z;", "d", "Ld0/J;", "getOverscrollEffect", "()Ld0/J;", "e", "Z", "getEnabled", "()Z", "f", "getReverseDirection", "g", "Lf0/s;", "getFlingBehavior", "()Lf0/s;", "h", "Lh0/l;", "getInteractionSource", "()Lh0/l;", "i", "Lf0/g;", "getBringIntoViewSpec", "()Lf0/g;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends Y<i> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13790H state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final J overscrollEffect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13820s flingBehavior;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13808g bringIntoViewSpec;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return Intrinsics.e(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && Intrinsics.e(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && Intrinsics.e(this.flingBehavior, scrollableElement.flingBehavior) && Intrinsics.e(this.interactionSource, scrollableElement.interactionSource) && Intrinsics.e(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        J j10 = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (j10 != null ? j10.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        InterfaceC13820s interfaceC13820s = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (interfaceC13820s != null ? interfaceC13820s.hashCode() : 0)) * 31;
        l lVar = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        InterfaceC13808g interfaceC13808g = this.bringIntoViewSpec;
        return iHashCode4 + (interfaceC13808g != null ? interfaceC13808g.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public i b() {
        return new i(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(i node) {
        node.u3(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public ScrollableElement(InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, J j10, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, l lVar, InterfaceC13808g interfaceC13808g) {
        this.state = interfaceC13790H;
        this.orientation = enumC13827z;
        this.overscrollEffect = j10;
        this.enabled = z10;
        this.reverseDirection = z11;
        this.flingBehavior = interfaceC13820s;
        this.interactionSource = lVar;
        this.bringIntoViewSpec = interfaceC13808g;
    }
}
