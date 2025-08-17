package androidx.compose.foundation;

import androidx.compose.ui.node.Y;
import d0.J;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC13808g;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/n;", "Lf0/H;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseScrolling", "Lf0/s;", "flingBehavior", "Lh0/l;", "interactionSource", "Lf0/g;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Ld0/J;", "overscrollEffect", "<init>", "(Lf0/H;Lf0/z;ZZLf0/s;Lh0/l;Lf0/g;ZLd0/J;)V", "n", "()Landroidx/compose/foundation/n;", "node", "", "o", "(Landroidx/compose/foundation/n;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lf0/H;", "c", "Lf0/z;", "d", "Z", "e", "f", "Lf0/s;", "g", "Lh0/l;", "h", "Lf0/g;", "i", "j", "Ld0/J;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingContainerElement extends Y<n> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13790H state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13820s flingBehavior;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h0.l interactionSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13808g bringIntoViewSpec;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean useLocalOverscrollFactory;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final J overscrollEffect;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ScrollingContainerElement.class != other.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) other;
        return Intrinsics.e(this.state, scrollingContainerElement.state) && this.orientation == scrollingContainerElement.orientation && this.enabled == scrollingContainerElement.enabled && this.reverseScrolling == scrollingContainerElement.reverseScrolling && Intrinsics.e(this.flingBehavior, scrollingContainerElement.flingBehavior) && Intrinsics.e(this.interactionSource, scrollingContainerElement.interactionSource) && Intrinsics.e(this.bringIntoViewSpec, scrollingContainerElement.bringIntoViewSpec) && this.useLocalOverscrollFactory == scrollingContainerElement.useLocalOverscrollFactory && Intrinsics.e(this.overscrollEffect, scrollingContainerElement.overscrollEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        InterfaceC13820s interfaceC13820s = this.flingBehavior;
        int iHashCode2 = (iHashCode + (interfaceC13820s != null ? interfaceC13820s.hashCode() : 0)) * 31;
        h0.l lVar = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        InterfaceC13808g interfaceC13808g = this.bringIntoViewSpec;
        int iHashCode4 = (((iHashCode3 + (interfaceC13808g != null ? interfaceC13808g.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalOverscrollFactory)) * 31;
        J j10 = this.overscrollEffect;
        return iHashCode4 + (j10 != null ? j10.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public n b() {
        return new n(this.state, this.orientation, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec, this.useLocalOverscrollFactory, this.overscrollEffect);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(n node) {
        node.W2(this.state, this.orientation, this.useLocalOverscrollFactory, this.overscrollEffect, this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public ScrollingContainerElement(InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, h0.l lVar, InterfaceC13808g interfaceC13808g, boolean z12, J j10) {
        this.state = interfaceC13790H;
        this.orientation = enumC13827z;
        this.enabled = z10;
        this.reverseScrolling = z11;
        this.flingBehavior = interfaceC13820s;
        this.interactionSource = lVar;
        this.bringIntoViewSpec = interfaceC13808g;
        this.useLocalOverscrollFactory = z12;
        this.overscrollEffect = j10;
    }
}
