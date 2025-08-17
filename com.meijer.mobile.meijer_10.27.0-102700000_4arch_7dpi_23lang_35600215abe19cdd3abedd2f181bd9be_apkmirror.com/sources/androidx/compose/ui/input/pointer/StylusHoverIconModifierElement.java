package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.Y;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g1.InterfaceC14190w;
import g1.T;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Landroidx/compose/ui/node/Y;", "Lg1/T;", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "", "overrideDescendants", "Landroidx/compose/ui/node/s;", "touchBoundsExpansion", "<init>", "(Lg1/w;ZLandroidx/compose/ui/node/s;)V", "n", "()Lg1/T;", "node", "", "o", "(Lg1/T;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lg1/w;", "getIcon", "()Lg1/w;", "c", "Z", "getOverrideDescendants", "()Z", "d", "Landroidx/compose/ui/node/s;", "getTouchBoundsExpansion", "()Landroidx/compose/ui/node/s;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StylusHoverIconModifierElement extends Y<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC14190w icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean overrideDescendants;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DpTouchBoundsExpansion touchBoundsExpansion;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) other;
        return Intrinsics.e(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && Intrinsics.e(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    public int hashCode() {
        int iHashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return iHashCode + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public T b() {
        return new T(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(T node) {
        node.Y2(this.icon);
        node.Z2(this.overrideDescendants);
        node.X2(this.touchBoundsExpansion);
    }

    public StylusHoverIconModifierElement(InterfaceC14190w interfaceC14190w, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = interfaceC14190w;
        this.overrideDescendants = z10;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }
}
