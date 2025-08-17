package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/J;", "result", "Landroidx/compose/ui/node/Q;", "placeable", "<init>", "(Landroidx/compose/ui/layout/J;Landroidx/compose/ui/node/Q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/layout/J;", "b", "()Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/node/Q;", "()Landroidx/compose/ui/node/Q;", "e1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.p0, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class PlaceableResult implements OwnerScope {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.layout.J result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Q placeable;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) other;
        return Intrinsics.e(this.result, placeableResult.result) && Intrinsics.e(this.placeable, placeableResult.placeable);
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Q getPlaceable() {
        return this.placeable;
    }

    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.layout.J getResult() {
        return this.result;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return this.placeable.q1().isAttached();
    }

    public PlaceableResult(androidx.compose.ui.layout.J j10, Q q10) {
        this.result = j10;
        this.placeable = q10;
    }
}
