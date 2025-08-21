package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.Y;
import d0.J;
import h0.l;
import kotlin.C13914c;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13930s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/gestures/b;", "Lf0/c;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "startDragImmediately", "Ld0/J;", "overscrollEffect", "Lf0/s;", "flingBehavior", "<init>", "(Lf0/c;Lf0/z;ZLjava/lang/Boolean;Lh0/l;Ljava/lang/Boolean;Ld0/J;Lf0/s;)V", "k", "()Landroidx/compose/foundation/gestures/b;", "node", "", "n", "(Landroidx/compose/foundation/gestures/b;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lf0/c;", "c", "Lf0/z;", "d", "Z", "e", "Ljava/lang/Boolean;", "f", "Lh0/l;", "g", "h", "Ld0/J;", "i", "Lf0/s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnchoredDraggableElement<T> extends Y<b<T>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13914c<T> state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13937z orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Boolean reverseDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Boolean startDragImmediately;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final J overscrollEffect;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13930s flingBehavior;

    public /* synthetic */ AnchoredDraggableElement(C13914c c13914c, EnumC13937z enumC13937z, boolean z10, Boolean bool, l lVar, Boolean bool2, J j10, InterfaceC13930s interfaceC13930s, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13914c, enumC13937z, z10, bool, lVar, (i10 & 32) != 0 ? null : bool2, j10, (i10 & 128) != 0 ? null : interfaceC13930s);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) other;
        return Intrinsics.e(this.state, anchoredDraggableElement.state) && this.orientation == anchoredDraggableElement.orientation && this.enabled == anchoredDraggableElement.enabled && Intrinsics.e(this.reverseDirection, anchoredDraggableElement.reverseDirection) && Intrinsics.e(this.interactionSource, anchoredDraggableElement.interactionSource) && Intrinsics.e(this.startDragImmediately, anchoredDraggableElement.startDragImmediately) && Intrinsics.e(this.overscrollEffect, anchoredDraggableElement.overscrollEffect) && Intrinsics.e(this.flingBehavior, anchoredDraggableElement.flingBehavior);
    }

    public AnchoredDraggableElement(C13914c<T> c13914c, EnumC13937z enumC13937z, boolean z10, Boolean bool, l lVar, Boolean bool2, J j10, InterfaceC13930s interfaceC13930s) {
        this.state = c13914c;
        this.orientation = enumC13937z;
        this.enabled = z10;
        this.reverseDirection = bool;
        this.interactionSource = lVar;
        this.startDragImmediately = bool2;
        this.overscrollEffect = j10;
        this.flingBehavior = interfaceC13930s;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Boolean bool = this.reverseDirection;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l lVar = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.startDragImmediately;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        J j10 = this.overscrollEffect;
        int iHashCode5 = (iHashCode4 + (j10 != null ? j10.hashCode() : 0)) * 31;
        InterfaceC13930s interfaceC13930s = this.flingBehavior;
        return iHashCode5 + (interfaceC13930s != null ? interfaceC13930s.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b<T> b() {
        return new b<>(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(b<T> node) {
        node.F3(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }
}
