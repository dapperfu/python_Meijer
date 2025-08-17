package androidx.compose.foundation.lazy;

import androidx.compose.runtime.z1;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/lazy/b;", "", "fraction", "Landroidx/compose/runtime/z1;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;Ljava/lang/String;)V", "n", "()Landroidx/compose/foundation/lazy/b;", "node", "", "o", "(Landroidx/compose/foundation/lazy/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "F", "getFraction", "()F", "c", "Landroidx/compose/runtime/z1;", "getWidthState", "()Landroidx/compose/runtime/z1;", "d", "getHeightState", "e", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParentSizeElement extends Y<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z1<Integer> widthState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1<Integer> heightState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    public /* synthetic */ ParentSizeElement(float f10, z1 z1Var, z1 z1Var2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : z1Var, (i10 & 4) != 0 ? null : z1Var2, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) other;
        return this.fraction == parentSizeElement.fraction && Intrinsics.e(this.widthState, parentSizeElement.widthState) && Intrinsics.e(this.heightState, parentSizeElement.heightState);
    }

    public ParentSizeElement(float f10, z1<Integer> z1Var, z1<Integer> z1Var2, String str) {
        this.fraction = f10;
        this.widthState = z1Var;
        this.heightState = z1Var2;
        this.inspectorName = str;
    }

    public int hashCode() {
        z1<Integer> z1Var = this.widthState;
        int iHashCode = (z1Var != null ? z1Var.hashCode() : 0) * 31;
        z1<Integer> z1Var2 = this.heightState;
        return ((iHashCode + (z1Var2 != null ? z1Var2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b b() {
        return new b(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(b node) {
        node.K2(this.fraction);
        node.M2(this.widthState);
        node.L2(this.heightState);
    }
}
